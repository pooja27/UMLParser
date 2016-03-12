package com.assignment.translator;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import com.assignment.IR.ClassInfo;
import com.assignment.IR.Globals;
import com.assignment.IR.InterfaceInfo;
import com.assignment.IR.MethodInfo;
import com.assignment.IR.VariableInfo;
import com.assignment.javaParser.javaParserLexer;
import com.assignment.javaParser.javaParserParser;

public class Main {	
	public static void main(String[] args) throws IOException {		
		if(args.length!=2){
			System.out.println("\nUsage: umlparser.jar <classpath> <output file name>");
			return;
		}			
		
		File folder = new File(args[0]);
		String outputDir = args[1];		
		String outputFileName = args[1];
		
		//if path is specified
		if(args[1].contains(File.separator)){
			File targetFile = new File(outputDir);
			File parent = targetFile.getParentFile();			
			if(!parent.exists() && !parent.mkdirs()){
			    throw new IllegalStateException("Couldn't create dir: " + parent);
			}
		}
		
		File[] listOfFiles = folder.listFiles();
		String fileName = null;
		
		System.out.println("=== Generating Class Diagram for " +args[0] + " ===");
		
		for (int i = 0; i < listOfFiles.length; i++) {
			fileName = folder.getPath() + File.separator + listOfFiles[i].getName();
		
			if (listOfFiles[i].isFile() && fileName.endsWith(".java") ) {			
				System.out.println("Parsing File " + listOfFiles[i].getName() +".." );
				ANTLRInputStream input = new ANTLRFileStream(fileName);
				javaParserLexer lexer = new javaParserLexer(input);

				CommonTokenStream tokens = new CommonTokenStream(lexer);
				javaParserParser parser = new javaParserParser(tokens);

				parser.setBuildParseTree(true);
				RuleContext tree = parser.compilationUnit();
				//tree.inspect(parser); 
				System.out.println("Parsing Completed.");
				//break;
			}
		}		
		
		BuildSmartGraph.buildSmartGraph();
		YUMLPrinting.printyUMLFormat(outputFileName);

		try {
			PlantUMLPrinting.printPlantUML(outputFileName);
		} catch(Exception ex) {
			System.out.println("There was an issue generating plant UML image. Make sure u have installed graphviz.");
		}
		
		//if path is not specified pre-fix the current directory
		if(!outputFileName.contains(File.separator))
			outputFileName = System.getProperty("user.dir") + File.separator + outputFileName; 
		System.out.println("\nOutput Generated: " + outputFileName + "_yUML.png");
		System.out.println("Output Generated: " +outputFileName + "_yUML.pdf");
		System.out.println("Output Generated: " +outputFileName + "_plantUML.png");	
		
		System.out.println("=== Generation Completed ===");
		System.out.println("\n");
		
		
	}	
}
