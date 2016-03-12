package com.assignment.translator;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class PlanetUML {
	private static String USER_AGENT = "Mozilla/5.0";
	private static String BASE_URL = "http://www.plantuml.com";
	private static final int BUFFER_SIZE = 4096;

	private static void saveFile(String resourceName, String filePath, String fmt) throws IOException{
		String GET_URL = BASE_URL + "/" + resourceName.split("[.]")[0] + "." + fmt;
		URL obj = new URL("http://www.plantuml.com/plantuml/form");
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		int responseCode = con.getResponseCode();
		
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			InputStream in = con.getInputStream();
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			
			FileOutputStream fos = new FileOutputStream(filePath + "." + fmt);
			
			while ((bytesRead = in.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			
			fos.close();
			in.close();
		} else {
			System.out.println("GET request not worked");
		}
	}
	
	private static String cleanYuml(String yuml_text){
		yuml_text = yuml_text.replaceAll("/", "%2F");
		yuml_text = yuml_text.replaceAll("(\n|\r|\t)+$", "");
		yuml_text = yuml_text.replaceAll("\n", ", ").replaceAll(",[\\s]*,", ",").replaceAll(", $","");
		
		return yuml_text;
	} 
	
	public static boolean createDiag(String yuml_text, String filePath, String fmt) throws IOException{
	
		String POST_URL = BASE_URL + "/plantuml/form";
		
		URL obj = new URL(POST_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);

		//yuml_text = cleanYuml(yuml_text);
		
		String diagram_txt = URLEncoder.encode(yuml_text, "UTF-8");
		
		
		String POST_PARAMS = "dsl_text="+yuml_text;
		// For POST only - START
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		os.write(POST_PARAMS.getBytes());
		os.flush();
		os.close();
		// For POST only - END
		
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			saveFile(response.toString(), filePath, fmt);

			return true;
		} else {
			System.out.println("POST request not worked");
		}
		
		return false;
	}
	
	public static void main() throws IOException{
	
		String txt = "// Cool Class Diagram\n" 
			     + "[Customer|-forname:string;surname:string|doShiz()]<>-orders*>[Order]\n"
			     + "[Order]++-0..*>[LineItem]\n"
			     + "[Order]-[note:Aggregate root{bg:wheat}]\n"
			     + "[Order2]++-0..*>[LineItem2]\n"
			     + "[Order3]++-0..*>[LineItem3]\n"
			     + "\t\n"
			     + "[Order4]++-0..*>[LineItem4]\n"
			     + "[Order5]++-0..*>[LineItem5]\n"
			     + "[Order6]++-0..*>[LineItem6]\n"
			     + "[Order7]++-0..*>[LineItem7]\n";
		String fmt = "png";
		String filePath = "a_test";
		
		yUML.createDiag(txt, filePath, fmt);
		
		fmt = "pdf";
		yUML.createDiag(txt, filePath, fmt);
		
		
	}
}
