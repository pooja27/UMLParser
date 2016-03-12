/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr, Sam Harwell
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** A Java 1.7 grammar for ANTLR v4 derived from ANTLR v3 Java grammar.
 *  Uses ANTLR v4's left-recursive expression notation.
 *  It parses ECJ, Netbeans, JDK etc...
 *
 *  Sam Harwell cleaned this up significantly and updated to 1.7!
 *
 *  You can test with
 *
 *  $ antlr4 Java.g4
 *  $ javac *.java
 *  $ grun Java compilationUnit *.java
 */
grammar javaParser;

@header {
package com.assignment.javaParser;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.assignment.IR.*;
}

@members {
	
String accessModifier = "";
String accessModifier1 = "";
ClassInfo tempClass;
InterfaceInfo tempInterface;
VariableInfo variableInfoClass;
MethodInfo methodInfoClass;

ArrayList<String> interfaceList = new ArrayList();
ArrayList<VariableInfo> list = new ArrayList();
ArrayList<VariableInfo> variableList = new ArrayList();
ArrayList<MethodInfo> methodList = new ArrayList();
ArrayList<VariableInfo> localParamList = new ArrayList();
String RESULT;
String modifierStr;
String classModifier;
String interfaceModifier;
boolean isLocalVar = false;
}

// starting point for parsing a java file
	compilationUnit
		:   packageDeclaration? importDeclaration* typeDeclaration* EOF
		;

	packageDeclaration
		:   annotation* 'package' qualifiedName ';'
		;

	importDeclaration
		:   'import' 'static'? qualifiedName ('.' '*')? ';'
		;

	typeDeclaration
		:   classOrInterfaceModifier*
		{    	
			classModifier = $classOrInterfaceModifier.text;  accessModifier1 = "";  
   		}   classDeclaration
		|   classOrInterfaceModifier
		*   enumDeclaration
		|   classOrInterfaceModifier*
		{    	
			interfaceModifier = $classOrInterfaceModifier.text; accessModifier1 = "";
   		}   interfaceDeclaration
		|   classOrInterfaceModifier* annotationTypeDeclaration
		|   ';'
		;

modifier 
    :   classOrInterfaceModifier 
    |   (   'native'{ accessModifier1 += "native ";}
        |   'synchronized' { accessModifier1 += "synchronized ";}
        |   'transient' { accessModifier1 += "transient ";}
        |   'volatile' { accessModifier1 += "volatile ";}
        )
    ;

classOrInterfaceModifier
    :   annotation      // class or interface
    |   (   'public'    { accessModifier1 += "public ";}// class or interface
        |   'protected' { accessModifier1 += "protected ";} // class or interface
        |   'private'   { accessModifier1 += "private ";}// class or interface
        |   'static'    { accessModifier1 += "static ";}// class or interface
        |   'abstract'  { accessModifier1 += "abstract ";}// class or interface
        |   'final'     { accessModifier1 += "final ";}// class only -- does not apply to interfaces
        |   'strictfp'  { accessModifier1 += "strictfp ";}// class or interface
        ) 
    ;

variableModifier
    :   'final'
    |   annotation
    ;

classDeclaration
    :   'class' a=Identifier typeParameters?{
			
			tempClass = new ClassInfo();
			
			tempClass.setName($a.text);
			tempClass.setClassVisibility(classModifier);
			//tempClass.setVariableList(variableList);
			Globals.classList.put($a.text,tempClass);		
			interfaceList = new ArrayList();
			variableList = new ArrayList();
				
		}
        ('extends' type)?
        {
        	if(($type.text)!=null)
        	{
        		//Setting Parent
        		tempClass.setParentName($type.text);
        	} else tempClass.setParentName("");
        }
        ('implements' typeList)?{        	
        	tempClass.setInterfaceList(interfaceList);
        }
        classBody
    ;

typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier ('extends' typeBound)?
    ;

typeBound
    :   type ('&' type)*
    ;

enumDeclaration
    :   ENUM Identifier ('implements' typeList)?
        '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    :   enumConstant (',' enumConstant)*
    ;

enumConstant
    :   annotation* Identifier arguments? classBody?
    ;

enumBodyDeclarations
    :   ';' classBodyDeclaration*
    ;

interfaceDeclaration
    :   'interface' a=Identifier 
    	{
    		tempInterface = new InterfaceInfo();			
			tempInterface.setName($a.text);
			tempInterface.setClassVisibility(interfaceModifier);
		}
		typeParameters? ('extends' typeList)? interfaceBody 
		{    	
			tempInterface.setParentList(interfaceList);			
			//tempClass.setVariableList(variableList);
			Globals.interfacesList.put($a.text,tempInterface);			
			variableList = new ArrayList();
    	}
    ;

typeList
    :   type { 
    		interfaceList.add($type.text);
    }	(',' type {
    		interfaceList.add($type.text);
    	})*
    ;

classBody
    :   '{' classBodyDeclaration* {
    	tempClass.setVariableList(variableList);     	
    	tempClass.setMethodList(methodList);
    }
    '}' 
    
    ;

interfaceBody
    :   '{' interfaceBodyDeclaration* {
    	tempInterface.setVariableList(variableList);     	
    	tempInterface.setMethodList(methodList);
    }'}' 
    ;

classBodyDeclaration
    :   ';'
    |   'static'? block
    |   modifier* {   } memberDeclaration
    ;

memberDeclaration
    :   methodDeclaration {accessModifier1 = "";}
    |   genericMethodDeclaration
    |   fieldDeclaration 
    |   constructorDeclaration
    |   genericConstructorDeclaration
    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   (type|'void') { RESULT = $type.text; } Identifier formalParameters ('[' ']')* { 
	    	MethodInfo methodInfo = new MethodInfo();
	    	methodInfo.setName($Identifier.text);
	    	//System.out.println("Method is: " + $Identifier.text);
	    	//methodInfo.setDataType(RESULT);
	    	//System.out.println("getMethodVisibilty:: " + accessModifier1);
	    	methodInfo.setMethodVisibilty(accessModifier1);
	    	if(RESULT==null){
	    		methodInfo.setReturnType("void");
	    	} else methodInfo.setReturnType(RESULT);
	    	accessModifier = "" ;
        	accessModifier1 = "";
	    	  	
    	}
        ('throws' qualifiedNameList)? {
        	methodInfo.setParameterList(list);
        	methodList.add(methodInfo);
        	accessModifier = "" ;
        	accessModifier1 = "";
        	list = new ArrayList();
        }
        (   methodBody {      
        	methodInfo.setLocalParameterList(localParamList); 
        	localParamList = new ArrayList<VariableInfo>(); 	
        	accessModifier = "" ;
        	accessModifier1 = "";
        } 
        |   ';'
        ) 
    ;

genericMethodDeclaration
    :   typeParameters methodDeclaration
    ;

constructorDeclaration
    :   Identifier formalParameters {    			 
	    	MethodInfo methodInfo = new MethodInfo();
	    	methodInfo.setName($Identifier.text);
	    	//methodInfo.setDataType(RESULT);
	    	methodInfo.setMethodVisibilty(accessModifier1);
	    	methodInfo.setReturnType("constructor");
	    	accessModifier1 = "" ; 
	    	    	
    }('throws' qualifiedNameList)?
        constructorBody {        	
	    	methodInfo.setParameterList(list);
	        methodList.add(methodInfo);
	        list = new ArrayList();    
        }
    ;

genericConstructorDeclaration
    :   typeParameters constructorDeclaration
    ;

fieldDeclaration
    :   type { RESULT = $type.text; } variableDeclarators ';'
    ;

interfaceBodyDeclaration
    :   modifier*{ } interfaceMemberDeclaration
    |   ';'
    ;

interfaceMemberDeclaration
    :   constDeclaration {accessModifier1 = "";}
    |   interfaceMethodDeclaration { accessModifier1 = ""; }
    |   genericInterfaceMethodDeclaration
    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;

constDeclaration
    :   type constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    :   Identifier ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
interfaceMethodDeclaration
    :   (type|'void') { RESULT = $type.text; } Identifier formalParameters ('[' ']')* {    	
    	MethodInfo methodInfo = new MethodInfo();
	    methodInfo.setName($Identifier.text);
	    //methodInfo.setDataType(RESULT);
	    //Current here
	    methodInfo.setMethodVisibilty(accessModifier1);
	    if(RESULT==null){
	    	methodInfo.setReturnType("void");
	    } else methodInfo.setReturnType(RESULT);
    }
    ('throws' qualifiedNameList)? 
    {
    	methodInfo.setParameterList(list);
        methodList.add(methodInfo);
        list = new ArrayList();
    }';'
    ;

genericInterfaceMethodDeclaration
    :   typeParameters interfaceMethodDeclaration
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId
	    { 
	    	if(isLocalVar == false) {
		    	VariableInfo var = new VariableInfo();
		    	var.setName($variableDeclaratorId.text);
		    	var.setDataType(RESULT);
		    	var.setVarVisibility(accessModifier1);
		    	variableList.add(var);
		    	accessModifier = "";
		    	accessModifier1 = "" ; 	
		    }
	    	else {	    	
		    	VariableInfo var = new VariableInfo();
		    	var.setName($variableDeclaratorId.text);
		    	var.setDataType(RESULT);
		    	var.setVarVisibility(accessModifier1);
		    	localParamList.add(var);
		    	accessModifier = "";
		    	accessModifier1 = "" ; 	
	    	}
	    }('=' variableInitializer)?
    ;

arrayNotation
		:
		('[' ']')?
		;	
		
variableDeclaratorId
    :   Identifier arrayNotation? 
    
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

enumConstantName
    :   Identifier
    ;

type 
    :   classOrInterfaceType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;

classOrInterfaceType
    :   Identifier typeArguments? ('.' Identifier typeArguments? )*
    ;

primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;

typeArgument
    :   type
    |   '?' (('extends' | 'super') type)?
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* type variableDeclaratorId 
	   { 
	    	VariableInfo var = new VariableInfo();
	    	var.setName($variableDeclaratorId.text);
	    	var.setDataType($type.text);	    	
	    	list.add(var);   	
	    }
    ;

lastFormalParameter
    :   variableModifier* type '...' variableDeclaratorId
    ;

methodBody
    :   block
    ;

constructorBody
    :   block
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;

// ANNOTATIONS

annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;

annotationName : qualifiedName ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :   Identifier '=' elementValue
    ;

elementValue
    :   expression
    |   annotation
    |   elementValueArrayInitializer
    ;

elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

annotationTypeDeclaration
    :   '@' 'interface' Identifier annotationTypeBody
    ;

annotationTypeBody
    :   '{' (annotationTypeElementDeclaration)* '}'
    ;

annotationTypeElementDeclaration
    :   modifier* annotationTypeElementRest
    |   ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    :   type annotationMethodOrConstantRest ';'
    |   classDeclaration ';'?
    |   interfaceDeclaration ';'?
    |   enumDeclaration ';'?
    |   annotationTypeDeclaration ';'?
    ;

annotationMethodOrConstantRest
    :   annotationMethodRest
    |   annotationConstantRest
    ;

annotationMethodRest
    :   Identifier '(' ')' defaultValue?
    ;

annotationConstantRest
    :   variableDeclarators
    ;

defaultValue
    :   'default' elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   '{' {isLocalVar = true;} blockStatement* '}' {isLocalVar = false;}
    ;

blockStatement
    :   localVariableDeclarationStatement 
    |   statement
    |   typeDeclaration
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration 
    :   variableModifier* type{RESULT = $type.text;} variableDeclarators
    ;

statement
    :   block
    |   ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'try' block (catchClause+ finallyBlock? | finallyBlock)
    |   'try' resourceSpecification block catchClause* finallyBlock?
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';'
    |   'continue' Identifier? ';'
    |   ';'
    |   statementExpression ';'
    |   Identifier ':' statement
    ;

catchClause
    :   'catch' '(' variableModifier* catchType Identifier ')' block
    ;

catchType
    :   qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    :   'finally' block
    ;

resourceSpecification
    :   '(' resources ';'? ')'
    ;

resources
    :   resource (';' resource)*
    ;

resource
    :   variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' constantExpression ':'
    |   'case' enumConstantName ':'
    |   'default' ':'
    ;

forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifier* type variableDeclaratorId ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;

expression
    :   primary
    |   expression '.' Identifier
    |   expression '.' 'this'
    |   expression '.' 'new' nonWildcardTypeArguments? innerCreator
    |   expression '.' 'super' superSuffix
    |   expression '.' explicitGenericInvocation
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   'new' creator
    |   '(' type ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression 'instanceof' type
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   <assoc=right> expression
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        expression
    ;

primary
    :   '(' expression ')'
    |   'this'
    |   'super'
    |   literal
    |   Identifier
    |   type '.' 'class'
    |   'void' '.' 'class'
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   Identifier typeArgumentsOrDiamond? ('.' Identifier typeArgumentsOrDiamond?)*
    |   primitiveType
    ;

innerCreator
    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;

arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments classBody?
    ;

explicitGenericInvocation
    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;

nonWildcardTypeArguments
    :   '<' typeList '>'
    ;

typeArgumentsOrDiamond
    :   '<' '>'
    |   typeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    :   '<' '>'
    |   nonWildcardTypeArguments
    ;

superSuffix
    :   arguments
    |   '.' Identifier arguments?
    ;

explicitGenericInvocationSuffix
    :   'super' superSuffix
    |   Identifier arguments
    ;

arguments
    :   '(' expressionList? ')'
    ;

// LEXER

// §3.9 Keywords

ABSTRACT      : 'abstract';
ASSERT        : 'assert';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// §3.10.5 String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

// §3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
