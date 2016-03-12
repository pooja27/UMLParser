// Generated from javaParser.g4 by ANTLR 4.4

package com.assignment.javaParser;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.assignment.IR.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26, 
		RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_arrayNotation = 34, 
		RULE_variableDeclaratorId = 35, RULE_variableInitializer = 36, RULE_arrayInitializer = 37, 
		RULE_enumConstantName = 38, RULE_type = 39, RULE_classOrInterfaceType = 40, 
		RULE_primitiveType = 41, RULE_typeArguments = 42, RULE_typeArgument = 43, 
		RULE_qualifiedNameList = 44, RULE_formalParameters = 45, RULE_formalParameterList = 46, 
		RULE_formalParameter = 47, RULE_lastFormalParameter = 48, RULE_methodBody = 49, 
		RULE_constructorBody = 50, RULE_qualifiedName = 51, RULE_literal = 52, 
		RULE_annotation = 53, RULE_annotationName = 54, RULE_elementValuePairs = 55, 
		RULE_elementValuePair = 56, RULE_elementValue = 57, RULE_elementValueArrayInitializer = 58, 
		RULE_annotationTypeDeclaration = 59, RULE_annotationTypeBody = 60, RULE_annotationTypeElementDeclaration = 61, 
		RULE_annotationTypeElementRest = 62, RULE_annotationMethodOrConstantRest = 63, 
		RULE_annotationMethodRest = 64, RULE_annotationConstantRest = 65, RULE_defaultValue = 66, 
		RULE_block = 67, RULE_blockStatement = 68, RULE_localVariableDeclarationStatement = 69, 
		RULE_localVariableDeclaration = 70, RULE_statement = 71, RULE_catchClause = 72, 
		RULE_catchType = 73, RULE_finallyBlock = 74, RULE_resourceSpecification = 75, 
		RULE_resources = 76, RULE_resource = 77, RULE_switchBlockStatementGroup = 78, 
		RULE_switchLabel = 79, RULE_forControl = 80, RULE_forInit = 81, RULE_enhancedForControl = 82, 
		RULE_forUpdate = 83, RULE_parExpression = 84, RULE_expressionList = 85, 
		RULE_statementExpression = 86, RULE_constantExpression = 87, RULE_expression = 88, 
		RULE_primary = 89, RULE_creator = 90, RULE_createdName = 91, RULE_innerCreator = 92, 
		RULE_arrayCreatorRest = 93, RULE_classCreatorRest = 94, RULE_explicitGenericInvocation = 95, 
		RULE_nonWildcardTypeArguments = 96, RULE_typeArgumentsOrDiamond = 97, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 98, RULE_superSuffix = 99, RULE_explicitGenericInvocationSuffix = 100, 
		RULE_arguments = 101;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "arrayNotation", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "enumConstantName", "type", "classOrInterfaceType", 
		"primitiveType", "typeArguments", "typeArgument", "qualifiedNameList", 
		"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
		"methodBody", "constructorBody", "qualifiedName", "literal", "annotation", 
		"annotationName", "elementValuePairs", "elementValuePair", "elementValue", 
		"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
		"annotationMethodRest", "annotationConstantRest", "defaultValue", "block", 
		"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
		"resources", "resource", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "primary", 
		"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
		"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
	};

	@Override
	public String getGrammarFileName() { return "javaParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		
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

	public javaParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(javaParserParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(204); packageDeclaration();
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(207); importDeclaration();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(213); typeDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(221); annotation();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(PACKAGE);
			setState(228); qualifiedName();
			setState(229); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(IMPORT);
			setState(233);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(232); match(STATIC);
				}
			}

			setState(235); qualifiedName();
			setState(238);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(236); match(DOT);
				setState(237); match(MUL);
				}
			}

			setState(240); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier;
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(242); ((TypeDeclarationContext)_localctx).classOrInterfaceModifier = classOrInterfaceModifier();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				    	
							classModifier = (((TypeDeclarationContext)_localctx).classOrInterfaceModifier!=null?_input.getText(((TypeDeclarationContext)_localctx).classOrInterfaceModifier.start,((TypeDeclarationContext)_localctx).classOrInterfaceModifier.stop):null);  accessModifier1 = "";  
				   		
				setState(249); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(250); classOrInterfaceModifier();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256); enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(257); ((TypeDeclarationContext)_localctx).classOrInterfaceModifier = classOrInterfaceModifier();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				    	
							interfaceModifier = (((TypeDeclarationContext)_localctx).classOrInterfaceModifier!=null?_input.getText(((TypeDeclarationContext)_localctx).classOrInterfaceModifier.start,((TypeDeclarationContext)_localctx).classOrInterfaceModifier.stop):null); accessModifier1 = "";
				   		
				setState(264); interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265); classOrInterfaceModifier();
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(271); annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(286);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				switch (_input.LA(1)) {
				case NATIVE:
					{
					setState(276); match(NATIVE);
					 accessModifier1 += "native ";
					}
					break;
				case SYNCHRONIZED:
					{
					setState(278); match(SYNCHRONIZED);
					 accessModifier1 += "synchronized ";
					}
					break;
				case TRANSIENT:
					{
					setState(280); match(TRANSIENT);
					 accessModifier1 += "transient ";
					}
					break;
				case VOLATILE:
					{
					setState(282); match(VOLATILE);
					 accessModifier1 += "volatile ";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(305);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				switch (_input.LA(1)) {
				case PUBLIC:
					{
					setState(289); match(PUBLIC);
					 accessModifier1 += "public ";
					}
					break;
				case PROTECTED:
					{
					setState(291); match(PROTECTED);
					 accessModifier1 += "protected ";
					}
					break;
				case PRIVATE:
					{
					setState(293); match(PRIVATE);
					 accessModifier1 += "private ";
					}
					break;
				case STATIC:
					{
					setState(295); match(STATIC);
					 accessModifier1 += "static ";
					}
					break;
				case ABSTRACT:
					{
					setState(297); match(ABSTRACT);
					 accessModifier1 += "abstract ";
					}
					break;
				case FINAL:
					{
					setState(299); match(FINAL);
					 accessModifier1 += "final ";
					}
					break;
				case STRICTFP:
					{
					setState(301); match(STRICTFP);
					 accessModifier1 += "strictfp ";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(307); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(308); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token a;
		public TypeContext type;
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(CLASS);
			setState(312); ((ClassDeclarationContext)_localctx).a = match(Identifier);
			setState(314);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(313); typeParameters();
				}
			}


						
						tempClass = new ClassInfo();
						
						tempClass.setName((((ClassDeclarationContext)_localctx).a!=null?((ClassDeclarationContext)_localctx).a.getText():null));
						tempClass.setClassVisibility(classModifier);
						//tempClass.setVariableList(variableList);
						Globals.classList.put((((ClassDeclarationContext)_localctx).a!=null?((ClassDeclarationContext)_localctx).a.getText():null),tempClass);		
						interfaceList = new ArrayList();
						variableList = new ArrayList();
							
					
			setState(319);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(317); match(EXTENDS);
				setState(318); ((ClassDeclarationContext)_localctx).type = type();
				}
			}


			        	if(((((ClassDeclarationContext)_localctx).type!=null?_input.getText(((ClassDeclarationContext)_localctx).type.start,((ClassDeclarationContext)_localctx).type.stop):null))!=null)
			        	{
			        		//Setting Parent
			        		tempClass.setParentName((((ClassDeclarationContext)_localctx).type!=null?_input.getText(((ClassDeclarationContext)_localctx).type.start,((ClassDeclarationContext)_localctx).type.stop):null));
			        	} else tempClass.setParentName("");
			        
			setState(324);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(322); match(IMPLEMENTS);
				setState(323); typeList();
				}
			}

			        	
			        	tempClass.setInterfaceList(interfaceList);
			        
			setState(327); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(LT);
			setState(330); typeParameter();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(331); match(COMMA);
				setState(332); typeParameter();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(Identifier);
			setState(343);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(341); match(EXTENDS);
				setState(342); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); type();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(346); match(BITAND);
				setState(347); type();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(javaParserParser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(ENUM);
			setState(354); match(Identifier);
			setState(357);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(355); match(IMPLEMENTS);
				setState(356); typeList();
				}
			}

			setState(359); match(LBRACE);
			setState(361);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(360); enumConstants();
				}
			}

			setState(364);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(363); match(COMMA);
				}
			}

			setState(367);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(366); enumBodyDeclarations();
				}
			}

			setState(369); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371); enumConstant();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372); match(COMMA);
					setState(373); enumConstant();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(379); annotation();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385); match(Identifier);
			setState(387);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(386); arguments();
				}
			}

			setState(390);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(389); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(SEMI);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(393); classBodyDeclaration();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public Token a;
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(INTERFACE);
			setState(400); ((InterfaceDeclarationContext)_localctx).a = match(Identifier);

			    		tempInterface = new InterfaceInfo();			
						tempInterface.setName((((InterfaceDeclarationContext)_localctx).a!=null?((InterfaceDeclarationContext)_localctx).a.getText():null));
						tempInterface.setClassVisibility(interfaceModifier);
					
			setState(403);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(402); typeParameters();
				}
			}

			setState(407);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(405); match(EXTENDS);
				setState(406); typeList();
				}
			}

			setState(409); interfaceBody();
			    	
						tempInterface.setParentList(interfaceList);			
						//tempClass.setVariableList(variableList);
						Globals.interfacesList.put((((InterfaceDeclarationContext)_localctx).a!=null?((InterfaceDeclarationContext)_localctx).a.getText():null),tempInterface);			
						variableList = new ArrayList();
			    	
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type;
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); ((TypeListContext)_localctx).type = type();
			 
			    		interfaceList.add((((TypeListContext)_localctx).type!=null?_input.getText(((TypeListContext)_localctx).type.start,((TypeListContext)_localctx).type.stop):null));
			    
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(414); match(COMMA);
				setState(415); ((TypeListContext)_localctx).type = type();

				    		interfaceList.add((((TypeListContext)_localctx).type!=null?_input.getText(((TypeListContext)_localctx).type.start,((TypeListContext)_localctx).type.stop):null));
				    	
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(LBRACE);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(424); classBodyDeclaration();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    	tempClass.setVariableList(variableList);     	
			    	tempClass.setMethodList(methodList);
			    
			setState(431); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(LBRACE);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(434); interfaceBodyDeclaration();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    	tempInterface.setVariableList(variableList);     	
			    	tempInterface.setMethodList(methodList);
			    
			setState(441); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(444); match(STATIC);
					}
				}

				setState(447); block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(448); modifier();
						}
						} 
					}
					setState(453);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				   
				setState(455); memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458); methodDeclaration();
				accessModifier1 = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461); genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462); fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463); constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(464); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(465); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(466); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(467); classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(468); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token Identifier;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(471); ((MethodDeclarationContext)_localctx).type = type();
				}
				break;
			case VOID:
				{
				setState(472); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 RESULT = (((MethodDeclarationContext)_localctx).type!=null?_input.getText(((MethodDeclarationContext)_localctx).type.start,((MethodDeclarationContext)_localctx).type.stop):null); 
			setState(476); ((MethodDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(477); formalParameters();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(478); match(LBRACK);
				setState(479); match(RBRACK);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
				    	MethodInfo methodInfo = new MethodInfo();
				    	methodInfo.setName((((MethodDeclarationContext)_localctx).Identifier!=null?((MethodDeclarationContext)_localctx).Identifier.getText():null));
				    	//System.out.println("Method is: " + (((MethodDeclarationContext)_localctx).Identifier!=null?((MethodDeclarationContext)_localctx).Identifier.getText():null));
				    	//methodInfo.setDataType(RESULT);
				    	//System.out.println("getMethodVisibilty:: " + accessModifier1);
				    	methodInfo.setMethodVisibilty(accessModifier1);
				    	if(RESULT==null){
				    		methodInfo.setReturnType("void");
				    	} else methodInfo.setReturnType(RESULT);
				    	accessModifier = "" ;
			        	accessModifier1 = "";
				    	  	
			    	
			setState(488);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(486); match(THROWS);
				setState(487); qualifiedNameList();
				}
			}


			        	methodInfo.setParameterList(list);
			        	methodList.add(methodInfo);
			        	accessModifier = "" ;
			        	accessModifier1 = "";
			        	list = new ArrayList();
			        
			setState(495);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(491); methodBody();
				      
				        	methodInfo.setLocalParameterList(localParamList); 
				        	localParamList = new ArrayList<VariableInfo>(); 	
				        	accessModifier = "" ;
				        	accessModifier1 = "";
				        
				}
				break;
			case SEMI:
				{
				setState(494); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); typeParameters();
			setState(498); methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public Token Identifier;
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); ((ConstructorDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(501); formalParameters();
			    			 
				    	MethodInfo methodInfo = new MethodInfo();
				    	methodInfo.setName((((ConstructorDeclarationContext)_localctx).Identifier!=null?((ConstructorDeclarationContext)_localctx).Identifier.getText():null));
				    	//methodInfo.setDataType(RESULT);
				    	methodInfo.setMethodVisibilty(accessModifier1);
				    	methodInfo.setReturnType("constructor");
				    	accessModifier1 = "" ; 
				    	    	
			    
			setState(505);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(503); match(THROWS);
				setState(504); qualifiedNameList();
				}
			}

			setState(507); constructorBody();
			        	
				    	methodInfo.setParameterList(list);
				        methodList.add(methodInfo);
				        list = new ArrayList();    
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); typeParameters();
			setState(511); constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); ((FieldDeclarationContext)_localctx).type = type();
			 RESULT = (((FieldDeclarationContext)_localctx).type!=null?_input.getText(((FieldDeclarationContext)_localctx).type.start,((FieldDeclarationContext)_localctx).type.stop):null); 
			setState(515); variableDeclarators();
			setState(516); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(527);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(518); modifier();
						}
						} 
					}
					setState(523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				 
				setState(525); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(526); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
		try {
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); constDeclaration();
				accessModifier1 = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532); interfaceMethodDeclaration();
				 accessModifier1 = ""; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535); genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(537); annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(538); classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(539); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); type();
			setState(543); constantDeclarator();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(544); match(COMMA);
				setState(545); constantDeclarator();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); match(Identifier);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(554); match(LBRACK);
				setState(555); match(RBRACK);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561); match(ASSIGN);
			setState(562); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token Identifier;
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(564); ((InterfaceMethodDeclarationContext)_localctx).type = type();
				}
				break;
			case VOID:
				{
				setState(565); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 RESULT = (((InterfaceMethodDeclarationContext)_localctx).type!=null?_input.getText(((InterfaceMethodDeclarationContext)_localctx).type.start,((InterfaceMethodDeclarationContext)_localctx).type.stop):null); 
			setState(569); ((InterfaceMethodDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(570); formalParameters();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(571); match(LBRACK);
				setState(572); match(RBRACK);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			    	
			    	MethodInfo methodInfo = new MethodInfo();
				    methodInfo.setName((((InterfaceMethodDeclarationContext)_localctx).Identifier!=null?((InterfaceMethodDeclarationContext)_localctx).Identifier.getText():null));
				    //methodInfo.setDataType(RESULT);
				    //Current here
				    methodInfo.setMethodVisibilty(accessModifier1);
				    if(RESULT==null){
				    	methodInfo.setReturnType("void");
				    } else methodInfo.setReturnType(RESULT);
			    
			setState(581);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(579); match(THROWS);
				setState(580); qualifiedNameList();
				}
			}


			    	methodInfo.setParameterList(list);
			        methodList.add(methodInfo);
			        list = new ArrayList();
			    
			setState(584); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); typeParameters();
			setState(587); interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); variableDeclarator();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(590); match(COMMA);
				setState(591); variableDeclarator();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); ((VariableDeclaratorContext)_localctx).variableDeclaratorId = variableDeclaratorId();
			 
				    	if(isLocalVar == false) {
					    	VariableInfo var = new VariableInfo();
					    	var.setName((((VariableDeclaratorContext)_localctx).variableDeclaratorId!=null?_input.getText(((VariableDeclaratorContext)_localctx).variableDeclaratorId.start,((VariableDeclaratorContext)_localctx).variableDeclaratorId.stop):null));
					    	var.setDataType(RESULT);
					    	var.setVarVisibility(accessModifier1);
					    	variableList.add(var);
					    	accessModifier = "";
					    	accessModifier1 = "" ; 	
					    }
				    	else {	    	
					    	VariableInfo var = new VariableInfo();
					    	var.setName((((VariableDeclaratorContext)_localctx).variableDeclaratorId!=null?_input.getText(((VariableDeclaratorContext)_localctx).variableDeclaratorId.start,((VariableDeclaratorContext)_localctx).variableDeclaratorId.stop):null));
					    	var.setDataType(RESULT);
					    	var.setVarVisibility(accessModifier1);
					    	localParamList.add(var);
					    	accessModifier = "";
					    	accessModifier1 = "" ; 	
				    	}
				    
			setState(601);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(599); match(ASSIGN);
				setState(600); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayNotationContext extends ParserRuleContext {
		public ArrayNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterArrayNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitArrayNotation(this);
		}
	}

	public final ArrayNotationContext arrayNotation() throws RecognitionException {
		ArrayNotationContext _localctx = new ArrayNotationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(603); match(LBRACK);
				setState(604); match(RBRACK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public ArrayNotationContext arrayNotation() {
			return getRuleContext(ArrayNotationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(Identifier);
			setState(609);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(608); arrayNotation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableInitializer);
		try {
			setState(613);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(611); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(612); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615); match(LBRACE);
			setState(627);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(616); variableInitializer();
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(617); match(COMMA);
						setState(618); variableInitializer();
						}
						} 
					}
					setState(623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(625);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(624); match(COMMA);
					}
				}

				}
			}

			setState(629); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type);
		try {
			int _alt;
			setState(649);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); classOrInterfaceType();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634); match(LBRACK);
						setState(635); match(RBRACK);
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); primitiveType();
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(642); match(LBRACK);
						setState(643); match(RBRACK);
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(javaParserParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(javaParserParser.Identifier); }
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651); match(Identifier);
			setState(653);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(652); typeArguments();
				}
				break;
			}
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655); match(DOT);
					setState(656); match(Identifier);
					setState(658);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(657); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(LT);
			setState(668); typeArgument();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(669); match(COMMA);
				setState(670); typeArgument();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeArgument);
		int _la;
		try {
			setState(684);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(679); match(QUESTION);
				setState(682);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(680);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(681); type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); qualifiedName();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(687); match(COMMA);
				setState(688); qualifiedName();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); match(LPAREN);
			setState(696);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(695); formalParameterList();
				}
			}

			setState(698); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(713);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700); formalParameter();
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(701); match(COMMA);
						setState(702); formalParameter();
						}
						} 
					}
					setState(707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(710);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(708); match(COMMA);
					setState(709); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type;
		public VariableDeclaratorIdContext variableDeclaratorId;
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(715); variableModifier();
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721); ((FormalParameterContext)_localctx).type = type();
			setState(722); ((FormalParameterContext)_localctx).variableDeclaratorId = variableDeclaratorId();
			 
				    	VariableInfo var = new VariableInfo();
				    	var.setName((((FormalParameterContext)_localctx).variableDeclaratorId!=null?_input.getText(((FormalParameterContext)_localctx).variableDeclaratorId.start,((FormalParameterContext)_localctx).variableDeclaratorId.stop):null));
				    	var.setDataType((((FormalParameterContext)_localctx).type!=null?_input.getText(((FormalParameterContext)_localctx).type.start,((FormalParameterContext)_localctx).type.stop):null));	    	
				    	list.add(var);   	
				    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(725); variableModifier();
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(731); type();
			setState(732); match(ELLIPSIS);
			setState(733); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(javaParserParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(javaParserParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(Identifier);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740); match(DOT);
					setState(741); match(Identifier);
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(javaParserParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(javaParserParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(javaParserParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(javaParserParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(javaParserParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749); match(AT);
			setState(750); annotationName();
			setState(757);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(751); match(LPAREN);
				setState(754);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(752); elementValuePairs();
					}
					break;
				case 2:
					{
					setState(753); elementValue();
					}
					break;
				}
				setState(756); match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); elementValuePair();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(762); match(COMMA);
				setState(763); elementValuePair();
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); match(Identifier);
			setState(770); match(ASSIGN);
			setState(771); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValue);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(773); expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(774); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(775); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778); match(LBRACE);
			setState(787);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				setState(779); elementValue();
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780); match(COMMA);
						setState(781); elementValue();
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
			}

			setState(790);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(789); match(COMMA);
				}
			}

			setState(792); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794); match(AT);
			setState(795); match(INTERFACE);
			setState(796); match(Identifier);
			setState(797); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); match(LBRACE);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(800); annotationTypeElementDeclaration();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(816);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(808); modifier();
						}
						} 
					}
					setState(813);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(814); annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(815); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementRest);
		try {
			setState(838);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(818); type();
				setState(819); annotationMethodOrConstantRest();
				setState(820); match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(822); classDeclaration();
				setState(824);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(823); match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(826); interfaceDeclaration();
				setState(828);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(827); match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(830); enumDeclaration();
				setState(832);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(831); match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(834); annotationTypeDeclaration();
				setState(836);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(835); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodOrConstantRest);
		try {
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840); annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841); annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); match(Identifier);
			setState(845); match(LPAREN);
			setState(846); match(RPAREN);
			setState(848);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(847); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852); match(DEFAULT);
			setState(853); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855); match(LBRACE);
			isLocalVar = true;
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(857); blockStatement();
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863); match(RBRACE);
			isLocalVar = false;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockStatement);
		try {
			setState(869);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(868); typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871); localVariableDeclaration();
			setState(872); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(874); variableModifier();
				}
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880); ((LocalVariableDeclarationContext)_localctx).type = type();
			RESULT = (((LocalVariableDeclarationContext)_localctx).type!=null?_input.getText(((LocalVariableDeclarationContext)_localctx).type.start,((LocalVariableDeclarationContext)_localctx).type.stop):null);
			setState(882); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public TerminalNode ASSERT() { return getToken(javaParserParser.ASSERT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(988);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885); match(ASSERT);
				setState(886); expression(0);
				setState(889);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(887); match(COLON);
					setState(888); expression(0);
					}
				}

				setState(891); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893); match(IF);
				setState(894); parExpression();
				setState(895); statement();
				setState(898);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(896); match(ELSE);
					setState(897); statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(900); match(FOR);
				setState(901); match(LPAREN);
				setState(902); forControl();
				setState(903); match(RPAREN);
				setState(904); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(906); match(WHILE);
				setState(907); parExpression();
				setState(908); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(910); match(DO);
				setState(911); statement();
				setState(912); match(WHILE);
				setState(913); parExpression();
				setState(914); match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(916); match(TRY);
				setState(917); block();
				setState(927);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(919); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(918); catchClause();
						}
						}
						setState(921); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(924);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(923); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(926); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(929); match(TRY);
				setState(930); resourceSpecification();
				setState(931); block();
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(932); catchClause();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(939);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(938); finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(941); match(SWITCH);
				setState(942); parExpression();
				setState(943); match(LBRACE);
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(944); switchBlockStatementGroup();
						}
						} 
					}
					setState(949);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(950); switchLabel();
					}
					}
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(956); match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(958); match(SYNCHRONIZED);
				setState(959); parExpression();
				setState(960); block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(962); match(RETURN);
				setState(964);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(963); expression(0);
					}
				}

				setState(966); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(967); match(THROW);
				setState(968); expression(0);
				setState(969); match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(971); match(BREAK);
				setState(973);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(972); match(Identifier);
					}
				}

				setState(975); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(976); match(CONTINUE);
				setState(978);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(977); match(Identifier);
					}
				}

				setState(980); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(981); match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(982); statementExpression();
				setState(983); match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(985); match(Identifier);
				setState(986); match(COLON);
				setState(987); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); match(CATCH);
			setState(991); match(LPAREN);
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(992); variableModifier();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(998); catchType();
			setState(999); match(Identifier);
			setState(1000); match(RPAREN);
			setState(1001); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003); qualifiedName();
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1004); match(BITOR);
				setState(1005); qualifiedName();
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); match(FINALLY);
			setState(1012); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014); match(LPAREN);
			setState(1015); resources();
			setState(1017);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1016); match(SEMI);
				}
			}

			setState(1019); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); resource();
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022); match(SEMI);
					setState(1023); resource();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1029); variableModifier();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1035); classOrInterfaceType();
			setState(1036); variableDeclaratorId();
			setState(1037); match(ASSIGN);
			setState(1038); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1040); switchLabel();
				}
				}
				setState(1043); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1046); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1045); blockStatement();
				}
				}
				setState(1048); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1060);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050); match(CASE);
				setState(1051); constantExpression();
				setState(1052); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054); match(CASE);
				setState(1055); enumConstantName();
				setState(1056); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1058); match(DEFAULT);
				setState(1059); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1074);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
					{
					setState(1063); forInit();
					}
				}

				setState(1066); match(SEMI);
				setState(1068);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1067); expression(0);
					}
				}

				setState(1070); match(SEMI);
				setState(1072);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1071); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1078);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1080); variableModifier();
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1086); type();
			setState(1087); variableDeclaratorId();
			setState(1088); match(COLON);
			setState(1089); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093); match(LPAREN);
			setState(1094); expression(0);
			setState(1095); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097); expression(0);
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1098); match(COMMA);
				setState(1099); expression(0);
				}
				}
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1110); match(LPAREN);
				setState(1111); type();
				setState(1112); match(RPAREN);
				setState(1113); expression(17);
				}
				break;
			case 2:
				{
				setState(1115);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1116); expression(15);
				}
				break;
			case 3:
				{
				setState(1117);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1118); expression(14);
				}
				break;
			case 4:
				{
				setState(1119); primary();
				}
				break;
			case 5:
				{
				setState(1120); match(NEW);
				setState(1121); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1207);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1125);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1126); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1127);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1128);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1129); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1130);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1138);
						switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
						case 1:
							{
							setState(1131); match(LT);
							setState(1132); match(LT);
							}
							break;
						case 2:
							{
							setState(1133); match(GT);
							setState(1134); match(GT);
							setState(1135); match(GT);
							}
							break;
						case 3:
							{
							setState(1136); match(GT);
							setState(1137); match(GT);
							}
							break;
						}
						setState(1140); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1142);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1143); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1145);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1146); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1148); match(BITAND);
						setState(1149); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1151); match(CARET);
						setState(1152); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1154); match(BITOR);
						setState(1155); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1157); match(AND);
						setState(1158); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1160); match(OR);
						setState(1161); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1163); match(QUESTION);
						setState(1164); expression(0);
						setState(1165); match(COLON);
						setState(1166); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1168);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1169);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1170); expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1171);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1172); match(DOT);
						setState(1173); match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1175); match(DOT);
						setState(1176); match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1178); match(DOT);
						setState(1179); match(NEW);
						setState(1181);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1180); nonWildcardTypeArguments();
							}
						}

						setState(1183); innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1185); match(DOT);
						setState(1186); match(SUPER);
						setState(1187); superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1188);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1189); match(DOT);
						setState(1190); explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1191);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1192); match(LBRACK);
						setState(1193); expression(0);
						setState(1194); match(RBRACK);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1197); match(LPAREN);
						setState(1199);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
							{
							setState(1198); expressionList();
							}
						}

						setState(1201); match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1203);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1205); match(INSTANCEOF);
						setState(1206); type();
						}
						break;
					}
					} 
				}
				setState(1211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_primary);
		try {
			setState(1233);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212); match(LPAREN);
				setState(1213); expression(0);
				setState(1214); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216); match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217); match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1219); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1220); type();
				setState(1221); match(DOT);
				setState(1222); match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1224); match(VOID);
				setState(1225); match(DOT);
				setState(1226); match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1227); nonWildcardTypeArguments();
				setState(1231);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1228); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1229); match(THIS);
					setState(1230); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_creator);
		try {
			setState(1244);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235); nonWildcardTypeArguments();
				setState(1236); createdName();
				setState(1237); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239); createdName();
				setState(1242);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1240); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1241); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(javaParserParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(javaParserParser.Identifier); }
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_createdName);
		int _la;
		try {
			setState(1261);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246); match(Identifier);
				setState(1248);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1247); typeArgumentsOrDiamond();
					}
				}

				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1250); match(DOT);
					setState(1251); match(Identifier);
					setState(1253);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1252); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); match(Identifier);
			setState(1265);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1264); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1267); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1269); match(LBRACK);
			setState(1297);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1270); match(RBRACK);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1271); match(LBRACK);
					setState(1272); match(RBRACK);
					}
					}
					setState(1277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1278); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1279); expression(0);
				setState(1280); match(RBRACK);
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1281); match(LBRACK);
						setState(1282); expression(0);
						setState(1283); match(RBRACK);
						}
						} 
					}
					setState(1289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1290); match(LBRACK);
						setState(1291); match(RBRACK);
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); arguments();
			setState(1301);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1300); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303); nonWildcardTypeArguments();
			setState(1304); explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306); match(LT);
			setState(1307); typeList();
			setState(1308); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typeArgumentsOrDiamond);
		try {
			setState(1313);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310); match(LT);
				setState(1311); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312); typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1318);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315); match(LT);
				setState(1316); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317); nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_superSuffix);
		try {
			setState(1326);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321); match(DOT);
				setState(1322); match(Identifier);
				setState(1324);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1323); arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(javaParserParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1332);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328); match(SUPER);
				setState(1329); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330); match(Identifier);
				setState(1331); arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaParserListener ) ((javaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334); match(LPAREN);
			setState(1336);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(1335); expressionList();
				}
			}

			setState(1338); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 88: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 7);
		case 6: return precpred(_ctx, 6);
		case 7: return precpred(_ctx, 5);
		case 8: return precpred(_ctx, 4);
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		case 11: return precpred(_ctx, 1);
		case 12: return precpred(_ctx, 25);
		case 13: return precpred(_ctx, 24);
		case 14: return precpred(_ctx, 23);
		case 15: return precpred(_ctx, 22);
		case 17: return precpred(_ctx, 20);
		case 16: return precpred(_ctx, 21);
		case 19: return precpred(_ctx, 16);
		case 18: return precpred(_ctx, 19);
		case 20: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3k\u053f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\5\2\u00d0\n\2\3\2\7"+
		"\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2"+
		"\3\2\3\2\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4\13\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\u00ec\n\4\3\4\3\4\3\4\5\4\u00f1\n\4\3\4\3\4\3\5\7\5\u00f6\n\5\f\5"+
		"\16\5\u00f9\13\5\3\5\3\5\3\5\7\5\u00fe\n\5\f\5\16\5\u0101\13\5\3\5\3\5"+
		"\7\5\u0105\n\5\f\5\16\5\u0108\13\5\3\5\3\5\3\5\7\5\u010d\n\5\f\5\16\5"+
		"\u0110\13\5\3\5\3\5\5\5\u0114\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u011f\n\6\5\6\u0121\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0132\n\7\5\7\u0134\n\7\3\b\3\b\5\b\u0138\n\b\3"+
		"\t\3\t\3\t\5\t\u013d\n\t\3\t\3\t\3\t\5\t\u0142\n\t\3\t\3\t\3\t\5\t\u0147"+
		"\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0150\n\n\f\n\16\n\u0153\13\n\3\n"+
		"\3\n\3\13\3\13\3\13\5\13\u015a\n\13\3\f\3\f\3\f\7\f\u015f\n\f\f\f\16\f"+
		"\u0162\13\f\3\r\3\r\3\r\3\r\5\r\u0168\n\r\3\r\3\r\5\r\u016c\n\r\3\r\5"+
		"\r\u016f\n\r\3\r\5\r\u0172\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0179\n\16"+
		"\f\16\16\16\u017c\13\16\3\17\7\17\u017f\n\17\f\17\16\17\u0182\13\17\3"+
		"\17\3\17\5\17\u0186\n\17\3\17\5\17\u0189\n\17\3\20\3\20\7\20\u018d\n\20"+
		"\f\20\16\20\u0190\13\20\3\21\3\21\3\21\3\21\5\21\u0196\n\21\3\21\3\21"+
		"\5\21\u019a\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01a5"+
		"\n\22\f\22\16\22\u01a8\13\22\3\23\3\23\7\23\u01ac\n\23\f\23\16\23\u01af"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\7\24\u01b6\n\24\f\24\16\24\u01b9\13\24"+
		"\3\24\3\24\3\24\3\25\3\25\5\25\u01c0\n\25\3\25\3\25\7\25\u01c4\n\25\f"+
		"\25\16\25\u01c7\13\25\3\25\3\25\5\25\u01cb\n\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01d8\n\26\3\27\3\27\5\27\u01dc"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\7\27\u01e3\n\27\f\27\16\27\u01e6\13\27"+
		"\3\27\3\27\3\27\5\27\u01eb\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01f2\n"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u01fc\n\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\7\34\u020a\n\34\f\34"+
		"\16\34\u020d\13\34\3\34\3\34\3\34\5\34\u0212\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u021f\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u0225\n\36\f\36\16\36\u0228\13\36\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u022f\n\37\f\37\16\37\u0232\13\37\3\37\3\37\3\37\3 \3 \5 \u0239\n \3"+
		" \3 \3 \3 \3 \7 \u0240\n \f \16 \u0243\13 \3 \3 \3 \5 \u0248\n \3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\7\"\u0253\n\"\f\"\16\"\u0256\13\"\3#\3#\3#\3"+
		"#\5#\u025c\n#\3$\3$\5$\u0260\n$\3%\3%\5%\u0264\n%\3&\3&\5&\u0268\n&\3"+
		"\'\3\'\3\'\3\'\7\'\u026e\n\'\f\'\16\'\u0271\13\'\3\'\5\'\u0274\n\'\5\'"+
		"\u0276\n\'\3\'\3\'\3(\3(\3)\3)\3)\7)\u027f\n)\f)\16)\u0282\13)\3)\3)\3"+
		")\7)\u0287\n)\f)\16)\u028a\13)\5)\u028c\n)\3*\3*\5*\u0290\n*\3*\3*\3*"+
		"\5*\u0295\n*\7*\u0297\n*\f*\16*\u029a\13*\3+\3+\3,\3,\3,\3,\7,\u02a2\n"+
		",\f,\16,\u02a5\13,\3,\3,\3-\3-\3-\3-\5-\u02ad\n-\5-\u02af\n-\3.\3.\3."+
		"\7.\u02b4\n.\f.\16.\u02b7\13.\3/\3/\5/\u02bb\n/\3/\3/\3\60\3\60\3\60\7"+
		"\60\u02c2\n\60\f\60\16\60\u02c5\13\60\3\60\3\60\5\60\u02c9\n\60\3\60\5"+
		"\60\u02cc\n\60\3\61\7\61\u02cf\n\61\f\61\16\61\u02d2\13\61\3\61\3\61\3"+
		"\61\3\61\3\62\7\62\u02d9\n\62\f\62\16\62\u02dc\13\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\7\65\u02e9\n\65\f\65\16\65\u02ec"+
		"\13\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u02f5\n\67\3\67\5\67\u02f8"+
		"\n\67\38\38\39\39\39\79\u02ff\n9\f9\169\u0302\139\3:\3:\3:\3:\3;\3;\3"+
		";\5;\u030b\n;\3<\3<\3<\3<\7<\u0311\n<\f<\16<\u0314\13<\5<\u0316\n<\3<"+
		"\5<\u0319\n<\3<\3<\3=\3=\3=\3=\3=\3>\3>\7>\u0324\n>\f>\16>\u0327\13>\3"+
		">\3>\3?\7?\u032c\n?\f?\16?\u032f\13?\3?\3?\5?\u0333\n?\3@\3@\3@\3@\3@"+
		"\3@\5@\u033b\n@\3@\3@\5@\u033f\n@\3@\3@\5@\u0343\n@\3@\3@\5@\u0347\n@"+
		"\5@\u0349\n@\3A\3A\5A\u034d\nA\3B\3B\3B\3B\5B\u0353\nB\3C\3C\3D\3D\3D"+
		"\3E\3E\3E\7E\u035d\nE\fE\16E\u0360\13E\3E\3E\3E\3F\3F\3F\5F\u0368\nF\3"+
		"G\3G\3G\3H\7H\u036e\nH\fH\16H\u0371\13H\3H\3H\3H\3H\3I\3I\3I\3I\3I\5I"+
		"\u037c\nI\3I\3I\3I\3I\3I\3I\3I\5I\u0385\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\6I\u039a\nI\rI\16I\u039b\3I\5I\u039f\n"+
		"I\3I\5I\u03a2\nI\3I\3I\3I\3I\7I\u03a8\nI\fI\16I\u03ab\13I\3I\5I\u03ae"+
		"\nI\3I\3I\3I\3I\7I\u03b4\nI\fI\16I\u03b7\13I\3I\7I\u03ba\nI\fI\16I\u03bd"+
		"\13I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03c7\nI\3I\3I\3I\3I\3I\3I\3I\5I\u03d0"+
		"\nI\3I\3I\3I\5I\u03d5\nI\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03df\nI\3J\3J\3J"+
		"\7J\u03e4\nJ\fJ\16J\u03e7\13J\3J\3J\3J\3J\3J\3K\3K\3K\7K\u03f1\nK\fK\16"+
		"K\u03f4\13K\3L\3L\3L\3M\3M\3M\5M\u03fc\nM\3M\3M\3N\3N\3N\7N\u0403\nN\f"+
		"N\16N\u0406\13N\3O\7O\u0409\nO\fO\16O\u040c\13O\3O\3O\3O\3O\3O\3P\6P\u0414"+
		"\nP\rP\16P\u0415\3P\6P\u0419\nP\rP\16P\u041a\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\5Q\u0427\nQ\3R\3R\5R\u042b\nR\3R\3R\5R\u042f\nR\3R\3R\5R\u0433\n"+
		"R\5R\u0435\nR\3S\3S\5S\u0439\nS\3T\7T\u043c\nT\fT\16T\u043f\13T\3T\3T"+
		"\3T\3T\3T\3U\3U\3V\3V\3V\3V\3W\3W\3W\7W\u044f\nW\fW\16W\u0452\13W\3X\3"+
		"X\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0465\nZ\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0475\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u04a0\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u04b2\nZ\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u04ba\nZ\fZ\16Z\u04bd"+
		"\13Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u04d2"+
		"\n[\5[\u04d4\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u04dd\n\\\5\\\u04df\n"+
		"\\\3]\3]\5]\u04e3\n]\3]\3]\3]\5]\u04e8\n]\7]\u04ea\n]\f]\16]\u04ed\13"+
		"]\3]\5]\u04f0\n]\3^\3^\5^\u04f4\n^\3^\3^\3_\3_\3_\3_\7_\u04fc\n_\f_\16"+
		"_\u04ff\13_\3_\3_\3_\3_\3_\3_\3_\7_\u0508\n_\f_\16_\u050b\13_\3_\3_\7"+
		"_\u050f\n_\f_\16_\u0512\13_\5_\u0514\n_\3`\3`\5`\u0518\n`\3a\3a\3a\3b"+
		"\3b\3b\3b\3c\3c\3c\5c\u0524\nc\3d\3d\3d\5d\u0529\nd\3e\3e\3e\3e\5e\u052f"+
		"\ne\5e\u0531\ne\3f\3f\3f\3f\5f\u0537\nf\3g\3g\5g\u053b\ng\3g\3g\3g\2\3"+
		"\u00b2h\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\r\n\2\5\5\7\7"+
		"\n\n\20\20\26\26\35\35\37\37\'\'\4\2\23\23**\3\2\65:\3\2QT\3\2GH\4\2U"+
		"VZZ\3\2ST\4\2EFLM\4\2KKNN\4\2DD[e\3\2QR\u05ba\2\u00cf\3\2\2\2\4\u00e2"+
		"\3\2\2\2\6\u00e9\3\2\2\2\b\u0113\3\2\2\2\n\u0120\3\2\2\2\f\u0133\3\2\2"+
		"\2\16\u0137\3\2\2\2\20\u0139\3\2\2\2\22\u014b\3\2\2\2\24\u0156\3\2\2\2"+
		"\26\u015b\3\2\2\2\30\u0163\3\2\2\2\32\u0175\3\2\2\2\34\u0180\3\2\2\2\36"+
		"\u018a\3\2\2\2 \u0191\3\2\2\2\"\u019e\3\2\2\2$\u01a9\3\2\2\2&\u01b3\3"+
		"\2\2\2(\u01ca\3\2\2\2*\u01d7\3\2\2\2,\u01db\3\2\2\2.\u01f3\3\2\2\2\60"+
		"\u01f6\3\2\2\2\62\u0200\3\2\2\2\64\u0203\3\2\2\2\66\u0211\3\2\2\28\u021e"+
		"\3\2\2\2:\u0220\3\2\2\2<\u022b\3\2\2\2>\u0238\3\2\2\2@\u024c\3\2\2\2B"+
		"\u024f\3\2\2\2D\u0257\3\2\2\2F\u025f\3\2\2\2H\u0261\3\2\2\2J\u0267\3\2"+
		"\2\2L\u0269\3\2\2\2N\u0279\3\2\2\2P\u028b\3\2\2\2R\u028d\3\2\2\2T\u029b"+
		"\3\2\2\2V\u029d\3\2\2\2X\u02ae\3\2\2\2Z\u02b0\3\2\2\2\\\u02b8\3\2\2\2"+
		"^\u02cb\3\2\2\2`\u02d0\3\2\2\2b\u02da\3\2\2\2d\u02e1\3\2\2\2f\u02e3\3"+
		"\2\2\2h\u02e5\3\2\2\2j\u02ed\3\2\2\2l\u02ef\3\2\2\2n\u02f9\3\2\2\2p\u02fb"+
		"\3\2\2\2r\u0303\3\2\2\2t\u030a\3\2\2\2v\u030c\3\2\2\2x\u031c\3\2\2\2z"+
		"\u0321\3\2\2\2|\u0332\3\2\2\2~\u0348\3\2\2\2\u0080\u034c\3\2\2\2\u0082"+
		"\u034e\3\2\2\2\u0084\u0354\3\2\2\2\u0086\u0356\3\2\2\2\u0088\u0359\3\2"+
		"\2\2\u008a\u0367\3\2\2\2\u008c\u0369\3\2\2\2\u008e\u036f\3\2\2\2\u0090"+
		"\u03de\3\2\2\2\u0092\u03e0\3\2\2\2\u0094\u03ed\3\2\2\2\u0096\u03f5\3\2"+
		"\2\2\u0098\u03f8\3\2\2\2\u009a\u03ff\3\2\2\2\u009c\u040a\3\2\2\2\u009e"+
		"\u0413\3\2\2\2\u00a0\u0426\3\2\2\2\u00a2\u0434\3\2\2\2\u00a4\u0438\3\2"+
		"\2\2\u00a6\u043d\3\2\2\2\u00a8\u0445\3\2\2\2\u00aa\u0447\3\2\2\2\u00ac"+
		"\u044b\3\2\2\2\u00ae\u0453\3\2\2\2\u00b0\u0455\3\2\2\2\u00b2\u0464\3\2"+
		"\2\2\u00b4\u04d3\3\2\2\2\u00b6\u04de\3\2\2\2\u00b8\u04ef\3\2\2\2\u00ba"+
		"\u04f1\3\2\2\2\u00bc\u04f7\3\2\2\2\u00be\u0515\3\2\2\2\u00c0\u0519\3\2"+
		"\2\2\u00c2\u051c\3\2\2\2\u00c4\u0523\3\2\2\2\u00c6\u0528\3\2\2\2\u00c8"+
		"\u0530\3\2\2\2\u00ca\u0536\3\2\2\2\u00cc\u0538\3\2\2\2\u00ce\u00d0\5\4"+
		"\3\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1"+
		"\u00d3\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\5\b\5\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\2\2\3\u00de\3\3\2\2\2\u00df\u00e1\5l\67\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\5h\65\2\u00e7"+
		"\u00e8\7A\2\2\u00e8\5\3\2\2\2\u00e9\u00eb\7\33\2\2\u00ea\u00ec\7(\2\2"+
		"\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0"+
		"\5h\65\2\u00ee\u00ef\7C\2\2\u00ef\u00f1\7U\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7A\2\2\u00f3\7\3\2\2\2"+
		"\u00f4\u00f6\5\f\7\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\b\5\1\2\u00fb\u0114\5\20\t\2\u00fc\u00fe\5\f\7\2\u00fd\u00fc\3"+
		"\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0114\5\30\r\2\u0103\u0105\5"+
		"\f\7\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\b\5"+
		"\1\2\u010a\u0114\5 \21\2\u010b\u010d\5\f\7\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0114\5x=\2\u0112\u0114\7A\2\2\u0113\u00f7"+
		"\3\2\2\2\u0113\u00ff\3\2\2\2\u0113\u0106\3\2\2\2\u0113\u010e\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\t\3\2\2\2\u0115\u0121\5\f\7\2\u0116\u0117\7 \2\2"+
		"\u0117\u011f\b\6\1\2\u0118\u0119\7,\2\2\u0119\u011f\b\6\1\2\u011a\u011b"+
		"\7\60\2\2\u011b\u011f\b\6\1\2\u011c\u011d\7\63\2\2\u011d\u011f\b\6\1\2"+
		"\u011e\u0116\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\13\3\2\2\2\u0122\u0134\5l\67\2\u0123\u0124\7%\2\2\u0124\u0132\b\7\1\2"+
		"\u0125\u0126\7$\2\2\u0126\u0132\b\7\1\2\u0127\u0128\7#\2\2\u0128\u0132"+
		"\b\7\1\2\u0129\u012a\7(\2\2\u012a\u0132\b\7\1\2\u012b\u012c\7\3\2\2\u012c"+
		"\u0132\b\7\1\2\u012d\u012e\7\24\2\2\u012e\u0132\b\7\1\2\u012f\u0130\7"+
		")\2\2\u0130\u0132\b\7\1\2\u0131\u0123\3\2\2\2\u0131\u0125\3\2\2\2\u0131"+
		"\u0127\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012d\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0122\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\r\3\2\2\2\u0135\u0138\7\24\2\2\u0136\u0138\5l\67"+
		"\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\17\3\2\2\2\u0139\u013a"+
		"\7\13\2\2\u013a\u013c\7f\2\2\u013b\u013d\5\22\n\2\u013c\u013b\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\b\t\1\2\u013f\u0140"+
		"\7\23\2\2\u0140\u0142\5P)\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0146\b\t\1\2\u0144\u0145\7\32\2\2\u0145\u0147\5"+
		"\"\22\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\b\t\1\2\u0149\u014a\5$\23\2\u014a\21\3\2\2\2\u014b\u014c\7F\2\2"+
		"\u014c\u0151\5\24\13\2\u014d\u014e\7B\2\2\u014e\u0150\5\24\13\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7E\2\2\u0155"+
		"\23\3\2\2\2\u0156\u0159\7f\2\2\u0157\u0158\7\23\2\2\u0158\u015a\5\26\f"+
		"\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\25\3\2\2\2\u015b\u0160"+
		"\5P)\2\u015c\u015d\7W\2\2\u015d\u015f\5P)\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\27\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0163\u0164\7\22\2\2\u0164\u0167\7f\2\2\u0165\u0166"+
		"\7\32\2\2\u0166\u0168\5\"\22\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0169\u016b\7=\2\2\u016a\u016c\5\32\16\2\u016b\u016a"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\7B\2\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5\36"+
		"\20\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\7>\2\2\u0174\31\3\2\2\2\u0175\u017a\5\34\17\2\u0176\u0177\7B\2"+
		"\2\u0177\u0179\5\34\17\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\33\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017f\5l\67\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0185\7f\2\2\u0184\u0186\5\u00ccg\2\u0185\u0184\3\2\2\2\u0185\u0186\3"+
		"\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189\5$\23\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\35\3\2\2\2\u018a\u018e\7A\2\2\u018b\u018d\5(\25\2"+
		"\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\37\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7\36\2\2\u0192"+
		"\u0193\7f\2\2\u0193\u0195\b\21\1\2\u0194\u0196\5\22\n\2\u0195\u0194\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0198\7\23\2\2\u0198"+
		"\u019a\5\"\22\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3"+
		"\2\2\2\u019b\u019c\5&\24\2\u019c\u019d\b\21\1\2\u019d!\3\2\2\2\u019e\u019f"+
		"\5P)\2\u019f\u01a6\b\22\1\2\u01a0\u01a1\7B\2\2\u01a1\u01a2\5P)\2\u01a2"+
		"\u01a3\b\22\1\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5\u01a8\3"+
		"\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7#\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01ad\7=\2\2\u01aa\u01ac\5(\25\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\b\23\1\2\u01b1\u01b2\7>\2\2\u01b2"+
		"%\3\2\2\2\u01b3\u01b7\7=\2\2\u01b4\u01b6\5\66\34\2\u01b5\u01b4\3\2\2\2"+
		"\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\b\24\1\2\u01bb\u01bc\7>\2\2\u01bc"+
		"\'\3\2\2\2\u01bd\u01cb\7A\2\2\u01be\u01c0\7(\2\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01cb\5\u0088E\2\u01c2\u01c4"+
		"\5\n\6\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\b\25"+
		"\1\2\u01c9\u01cb\5*\26\2\u01ca\u01bd\3\2\2\2\u01ca\u01bf\3\2\2\2\u01ca"+
		"\u01c5\3\2\2\2\u01cb)\3\2\2\2\u01cc\u01cd\5,\27\2\u01cd\u01ce\b\26\1\2"+
		"\u01ce\u01d8\3\2\2\2\u01cf\u01d8\5.\30\2\u01d0\u01d8\5\64\33\2\u01d1\u01d8"+
		"\5\60\31\2\u01d2\u01d8\5\62\32\2\u01d3\u01d8\5 \21\2\u01d4\u01d8\5x=\2"+
		"\u01d5\u01d8\5\20\t\2\u01d6\u01d8\5\30\r\2\u01d7\u01cc\3\2\2\2\u01d7\u01cf"+
		"\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7"+
		"\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2"+
		"\2\2\u01d8+\3\2\2\2\u01d9\u01dc\5P)\2\u01da\u01dc\7\62\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\b\27\1\2"+
		"\u01de\u01df\7f\2\2\u01df\u01e4\5\\/\2\u01e0\u01e1\7?\2\2\u01e1\u01e3"+
		"\7@\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\b\27"+
		"\1\2\u01e8\u01e9\7/\2\2\u01e9\u01eb\5Z.\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f1\b\27\1\2\u01ed\u01ee\5d\63\2"+
		"\u01ee\u01ef\b\27\1\2\u01ef\u01f2\3\2\2\2\u01f0\u01f2\7A\2\2\u01f1\u01ed"+
		"\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2-\3\2\2\2\u01f3\u01f4\5\22\n\2\u01f4"+
		"\u01f5\5,\27\2\u01f5/\3\2\2\2\u01f6\u01f7\7f\2\2\u01f7\u01f8\5\\/\2\u01f8"+
		"\u01fb\b\31\1\2\u01f9\u01fa\7/\2\2\u01fa\u01fc\5Z.\2\u01fb\u01f9\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5f\64\2\u01fe\u01ff"+
		"\b\31\1\2\u01ff\61\3\2\2\2\u0200\u0201\5\22\n\2\u0201\u0202\5\60\31\2"+
		"\u0202\63\3\2\2\2\u0203\u0204\5P)\2\u0204\u0205\b\33\1\2\u0205\u0206\5"+
		"B\"\2\u0206\u0207\7A\2\2\u0207\65\3\2\2\2\u0208\u020a\5\n\6\2\u0209\u0208"+
		"\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\b\34\1\2\u020f\u0212\5"+
		"8\35\2\u0210\u0212\7A\2\2\u0211\u020b\3\2\2\2\u0211\u0210\3\2\2\2\u0212"+
		"\67\3\2\2\2\u0213\u0214\5:\36\2\u0214\u0215\b\35\1\2\u0215\u021f\3\2\2"+
		"\2\u0216\u0217\5> \2\u0217\u0218\b\35\1\2\u0218\u021f\3\2\2\2\u0219\u021f"+
		"\5@!\2\u021a\u021f\5 \21\2\u021b\u021f\5x=\2\u021c\u021f\5\20\t\2\u021d"+
		"\u021f\5\30\r\2\u021e\u0213\3\2\2\2\u021e\u0216\3\2\2\2\u021e\u0219\3"+
		"\2\2\2\u021e\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021f9\3\2\2\2\u0220\u0221\5P)\2\u0221\u0226\5<\37\2\u0222"+
		"\u0223\7B\2\2\u0223\u0225\5<\37\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022a\7A\2\2\u022a;\3\2\2\2\u022b\u0230\7f\2\2\u022c"+
		"\u022d\7?\2\2\u022d\u022f\7@\2\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2"+
		"\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0234\7D\2\2\u0234\u0235\5J&\2\u0235=\3\2\2\2\u0236\u0239"+
		"\5P)\2\u0237\u0239\7\62\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023b\b \1\2\u023b\u023c\7f\2\2\u023c\u0241\5\\/"+
		"\2\u023d\u023e\7?\2\2\u023e\u0240\7@\2\2\u023f\u023d\3\2\2\2\u0240\u0243"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0247\b \1\2\u0245\u0246\7/\2\2\u0246\u0248\5Z.\2"+
		"\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\b \1\2\u024a\u024b\7A\2\2\u024b?\3\2\2\2\u024c\u024d\5\22\n\2\u024d\u024e"+
		"\5> \2\u024eA\3\2\2\2\u024f\u0254\5D#\2\u0250\u0251\7B\2\2\u0251\u0253"+
		"\5D#\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255C\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\5H%\2\u0258"+
		"\u025b\b#\1\2\u0259\u025a\7D\2\2\u025a\u025c\5J&\2\u025b\u0259\3\2\2\2"+
		"\u025b\u025c\3\2\2\2\u025cE\3\2\2\2\u025d\u025e\7?\2\2\u025e\u0260\7@"+
		"\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260G\3\2\2\2\u0261\u0263"+
		"\7f\2\2\u0262\u0264\5F$\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"I\3\2\2\2\u0265\u0268\5L\'\2\u0266\u0268\5\u00b2Z\2\u0267\u0265\3\2\2"+
		"\2\u0267\u0266\3\2\2\2\u0268K\3\2\2\2\u0269\u0275\7=\2\2\u026a\u026f\5"+
		"J&\2\u026b\u026c\7B\2\2\u026c\u026e\5J&\2\u026d\u026b\3\2\2\2\u026e\u0271"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0274\7B\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0276\3\2\2\2\u0275\u026a\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\7>\2\2\u0278M\3\2\2\2\u0279\u027a\7f\2\2\u027a"+
		"O\3\2\2\2\u027b\u0280\5R*\2\u027c\u027d\7?\2\2\u027d\u027f\7@\2\2\u027e"+
		"\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u028c\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0288\5T+\2\u0284\u0285"+
		"\7?\2\2\u0285\u0287\7@\2\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028b\u027b\3\2\2\2\u028b\u0283\3\2\2\2\u028cQ\3\2\2\2\u028d\u028f"+
		"\7f\2\2\u028e\u0290\5V,\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0298\3\2\2\2\u0291\u0292\7C\2\2\u0292\u0294\7f\2\2\u0293\u0295\5V,\2"+
		"\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0291"+
		"\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"S\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\t\2\2\2\u029cU\3\2\2\2\u029d"+
		"\u029e\7F\2\2\u029e\u02a3\5X-\2\u029f\u02a0\7B\2\2\u02a0\u02a2\5X-\2\u02a1"+
		"\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\7E\2\2\u02a7"+
		"W\3\2\2\2\u02a8\u02af\5P)\2\u02a9\u02ac\7I\2\2\u02aa\u02ab\t\3\2\2\u02ab"+
		"\u02ad\5P)\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2"+
		"\2\u02ae\u02a8\3\2\2\2\u02ae\u02a9\3\2\2\2\u02afY\3\2\2\2\u02b0\u02b5"+
		"\5h\65\2\u02b1\u02b2\7B\2\2\u02b2\u02b4\5h\65\2\u02b3\u02b1\3\2\2\2\u02b4"+
		"\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6[\3\2\2\2"+
		"\u02b7\u02b5\3\2\2\2\u02b8\u02ba\7;\2\2\u02b9\u02bb\5^\60\2\u02ba\u02b9"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7<\2\2\u02bd"+
		"]\3\2\2\2\u02be\u02c3\5`\61\2\u02bf\u02c0\7B\2\2\u02c0\u02c2\5`\61\2\u02c1"+
		"\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2"+
		"\2\2\u02c4\u02c8\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\7B\2\2\u02c7"+
		"\u02c9\5b\62\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cc\3\2"+
		"\2\2\u02ca\u02cc\5b\62\2\u02cb\u02be\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc"+
		"_\3\2\2\2\u02cd\u02cf\5\16\b\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2\2"+
		"\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d3\u02d4\5P)\2\u02d4\u02d5\5H%\2\u02d5\u02d6\b\61\1\2\u02d6"+
		"a\3\2\2\2\u02d7\u02d9\5\16\b\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2"+
		"\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02da"+
		"\3\2\2\2\u02dd\u02de\5P)\2\u02de\u02df\7h\2\2\u02df\u02e0\5H%\2\u02e0"+
		"c\3\2\2\2\u02e1\u02e2\5\u0088E\2\u02e2e\3\2\2\2\u02e3\u02e4\5\u0088E\2"+
		"\u02e4g\3\2\2\2\u02e5\u02ea\7f\2\2\u02e6\u02e7\7C\2\2\u02e7\u02e9\7f\2"+
		"\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02ebi\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\t\4\2\2\u02ee"+
		"k\3\2\2\2\u02ef\u02f0\7g\2\2\u02f0\u02f7\5n8\2\u02f1\u02f4\7;\2\2\u02f2"+
		"\u02f5\5p9\2\u02f3\u02f5\5t;\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2"+
		"\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\7<\2\2\u02f7\u02f1"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8m\3\2\2\2\u02f9\u02fa\5h\65\2\u02fa"+
		"o\3\2\2\2\u02fb\u0300\5r:\2\u02fc\u02fd\7B\2\2\u02fd\u02ff\5r:\2\u02fe"+
		"\u02fc\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301q\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7f\2\2\u0304\u0305"+
		"\7D\2\2\u0305\u0306\5t;\2\u0306s\3\2\2\2\u0307\u030b\5\u00b2Z\2\u0308"+
		"\u030b\5l\67\2\u0309\u030b\5v<\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2"+
		"\2\u030a\u0309\3\2\2\2\u030bu\3\2\2\2\u030c\u0315\7=\2\2\u030d\u0312\5"+
		"t;\2\u030e\u030f\7B\2\2\u030f\u0311\5t;\2\u0310\u030e\3\2\2\2\u0311\u0314"+
		"\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0315\u030d\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2"+
		"\2\2\u0317\u0319\7B\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031b\7>\2\2\u031bw\3\2\2\2\u031c\u031d\7g\2\2\u031d"+
		"\u031e\7\36\2\2\u031e\u031f\7f\2\2\u031f\u0320\5z>\2\u0320y\3\2\2\2\u0321"+
		"\u0325\7=\2\2\u0322\u0324\5|?\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2"+
		"\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325"+
		"\3\2\2\2\u0328\u0329\7>\2\2\u0329{\3\2\2\2\u032a\u032c\5\n\6\2\u032b\u032a"+
		"\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0333\5~@\2\u0331\u0333\7A\2"+
		"\2\u0332\u032d\3\2\2\2\u0332\u0331\3\2\2\2\u0333}\3\2\2\2\u0334\u0335"+
		"\5P)\2\u0335\u0336\5\u0080A\2\u0336\u0337\7A\2\2\u0337\u0349\3\2\2\2\u0338"+
		"\u033a\5\20\t\2\u0339\u033b\7A\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u0349\3\2\2\2\u033c\u033e\5 \21\2\u033d\u033f\7A\2\2\u033e"+
		"\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0349\3\2\2\2\u0340\u0342\5\30"+
		"\r\2\u0341\u0343\7A\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0349\3\2\2\2\u0344\u0346\5x=\2\u0345\u0347\7A\2\2\u0346\u0345\3\2\2"+
		"\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2\2\2\u0348\u0334\3\2\2\2\u0348\u0338"+
		"\3\2\2\2\u0348\u033c\3\2\2\2\u0348\u0340\3\2\2\2\u0348\u0344\3\2\2\2\u0349"+
		"\177\3\2\2\2\u034a\u034d\5\u0082B\2\u034b\u034d\5\u0084C\2\u034c\u034a"+
		"\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u0081\3\2\2\2\u034e\u034f\7f\2\2\u034f"+
		"\u0350\7;\2\2\u0350\u0352\7<\2\2\u0351\u0353\5\u0086D\2\u0352\u0351\3"+
		"\2\2\2\u0352\u0353\3\2\2\2\u0353\u0083\3\2\2\2\u0354\u0355\5B\"\2\u0355"+
		"\u0085\3\2\2\2\u0356\u0357\7\16\2\2\u0357\u0358\5t;\2\u0358\u0087\3\2"+
		"\2\2\u0359\u035a\7=\2\2\u035a\u035e\bE\1\2\u035b\u035d\5\u008aF\2\u035c"+
		"\u035b\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2"+
		"\2\2\u035f\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\7>\2\2\u0362"+
		"\u0363\bE\1\2\u0363\u0089\3\2\2\2\u0364\u0368\5\u008cG\2\u0365\u0368\5"+
		"\u0090I\2\u0366\u0368\5\b\5\2\u0367\u0364\3\2\2\2\u0367\u0365\3\2\2\2"+
		"\u0367\u0366\3\2\2\2\u0368\u008b\3\2\2\2\u0369\u036a\5\u008eH\2\u036a"+
		"\u036b\7A\2\2\u036b\u008d\3\2\2\2\u036c\u036e\5\16\b\2\u036d\u036c\3\2"+
		"\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0373\5P)\2\u0373\u0374\bH\1"+
		"\2\u0374\u0375\5B\"\2\u0375\u008f\3\2\2\2\u0376\u03df\5\u0088E\2\u0377"+
		"\u0378\7\4\2\2\u0378\u037b\5\u00b2Z\2\u0379\u037a\7J\2\2\u037a\u037c\5"+
		"\u00b2Z\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2"+
		"\u037d\u037e\7A\2\2\u037e\u03df\3\2\2\2\u037f\u0380\7\30\2\2\u0380\u0381"+
		"\5\u00aaV\2\u0381\u0384\5\u0090I\2\u0382\u0383\7\21\2\2\u0383\u0385\5"+
		"\u0090I\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u03df\3\2\2\2"+
		"\u0386\u0387\7\27\2\2\u0387\u0388\7;\2\2\u0388\u0389\5\u00a2R\2\u0389"+
		"\u038a\7<\2\2\u038a\u038b\5\u0090I\2\u038b\u03df\3\2\2\2\u038c\u038d\7"+
		"\64\2\2\u038d\u038e\5\u00aaV\2\u038e\u038f\5\u0090I\2\u038f\u03df\3\2"+
		"\2\2\u0390\u0391\7\17\2\2\u0391\u0392\5\u0090I\2\u0392\u0393\7\64\2\2"+
		"\u0393\u0394\5\u00aaV\2\u0394\u0395\7A\2\2\u0395\u03df\3\2\2\2\u0396\u0397"+
		"\7\61\2\2\u0397\u03a1\5\u0088E\2\u0398\u039a\5\u0092J\2\u0399\u0398\3"+
		"\2\2\2\u039a\u039b\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039e\3\2\2\2\u039d\u039f\5\u0096L\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u03a2\5\u0096L\2\u03a1\u0399\3\2\2"+
		"\2\u03a1\u03a0\3\2\2\2\u03a2\u03df\3\2\2\2\u03a3\u03a4\7\61\2\2\u03a4"+
		"\u03a5\5\u0098M\2\u03a5\u03a9\5\u0088E\2\u03a6\u03a8\5\u0092J\2\u03a7"+
		"\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae\5\u0096L\2\u03ad"+
		"\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03df\3\2\2\2\u03af\u03b0\7+"+
		"\2\2\u03b0\u03b1\5\u00aaV\2\u03b1\u03b5\7=\2\2\u03b2\u03b4\5\u009eP\2"+
		"\u03b3\u03b2\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03bb\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03ba\5\u00a0Q"+
		"\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc"+
		"\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf\7>\2\2\u03bf"+
		"\u03df\3\2\2\2\u03c0\u03c1\7,\2\2\u03c1\u03c2\5\u00aaV\2\u03c2\u03c3\5"+
		"\u0088E\2\u03c3\u03df\3\2\2\2\u03c4\u03c6\7&\2\2\u03c5\u03c7\5\u00b2Z"+
		"\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03df"+
		"\7A\2\2\u03c9\u03ca\7.\2\2\u03ca\u03cb\5\u00b2Z\2\u03cb\u03cc\7A\2\2\u03cc"+
		"\u03df\3\2\2\2\u03cd\u03cf\7\6\2\2\u03ce\u03d0\7f\2\2\u03cf\u03ce\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03df\7A\2\2\u03d2"+
		"\u03d4\7\r\2\2\u03d3\u03d5\7f\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03df\7A\2\2\u03d7\u03df\7A\2\2\u03d8\u03d9"+
		"\5\u00aeX\2\u03d9\u03da\7A\2\2\u03da\u03df\3\2\2\2\u03db\u03dc\7f\2\2"+
		"\u03dc\u03dd\7J\2\2\u03dd\u03df\5\u0090I\2\u03de\u0376\3\2\2\2\u03de\u0377"+
		"\3\2\2\2\u03de\u037f\3\2\2\2\u03de\u0386\3\2\2\2\u03de\u038c\3\2\2\2\u03de"+
		"\u0390\3\2\2\2\u03de\u0396\3\2\2\2\u03de\u03a3\3\2\2\2\u03de\u03af\3\2"+
		"\2\2\u03de\u03c0\3\2\2\2\u03de\u03c4\3\2\2\2\u03de\u03c9\3\2\2\2\u03de"+
		"\u03cd\3\2\2\2\u03de\u03d2\3\2\2\2\u03de\u03d7\3\2\2\2\u03de\u03d8\3\2"+
		"\2\2\u03de\u03db\3\2\2\2\u03df\u0091\3\2\2\2\u03e0\u03e1\7\t\2\2\u03e1"+
		"\u03e5\7;\2\2\u03e2\u03e4\5\16\b\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2"+
		"\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e8\u03e9\5\u0094K\2\u03e9\u03ea\7f\2\2\u03ea\u03eb\7"+
		"<\2\2\u03eb\u03ec\5\u0088E\2\u03ec\u0093\3\2\2\2\u03ed\u03f2\5h\65\2\u03ee"+
		"\u03ef\7X\2\2\u03ef\u03f1\5h\65\2\u03f0\u03ee\3\2\2\2\u03f1\u03f4\3\2"+
		"\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u0095\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f5\u03f6\7\25\2\2\u03f6\u03f7\5\u0088E\2\u03f7\u0097"+
		"\3\2\2\2\u03f8\u03f9\7;\2\2\u03f9\u03fb\5\u009aN\2\u03fa\u03fc\7A\2\2"+
		"\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe"+
		"\7<\2\2\u03fe\u0099\3\2\2\2\u03ff\u0404\5\u009cO\2\u0400\u0401\7A\2\2"+
		"\u0401\u0403\5\u009cO\2\u0402\u0400\3\2\2\2\u0403\u0406\3\2\2\2\u0404"+
		"\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u009b\3\2\2\2\u0406\u0404\3\2"+
		"\2\2\u0407\u0409\5\16\b\2\u0408\u0407\3\2\2\2\u0409\u040c\3\2\2\2\u040a"+
		"\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040a\3\2"+
		"\2\2\u040d\u040e\5R*\2\u040e\u040f\5H%\2\u040f\u0410\7D\2\2\u0410\u0411"+
		"\5\u00b2Z\2\u0411\u009d\3\2\2\2\u0412\u0414\5\u00a0Q\2\u0413\u0412\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0418\3\2\2\2\u0417\u0419\5\u008aF\2\u0418\u0417\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u009f\3\2\2\2\u041c"+
		"\u041d\7\b\2\2\u041d\u041e\5\u00b0Y\2\u041e\u041f\7J\2\2\u041f\u0427\3"+
		"\2\2\2\u0420\u0421\7\b\2\2\u0421\u0422\5N(\2\u0422\u0423\7J\2\2\u0423"+
		"\u0427\3\2\2\2\u0424\u0425\7\16\2\2\u0425\u0427\7J\2\2\u0426\u041c\3\2"+
		"\2\2\u0426\u0420\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u00a1\3\2\2\2\u0428"+
		"\u0435\5\u00a6T\2\u0429\u042b\5\u00a4S\2\u042a\u0429\3\2\2\2\u042a\u042b"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\7A\2\2\u042d\u042f\5\u00b2Z\2"+
		"\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432"+
		"\7A\2\2\u0431\u0433\5\u00a8U\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2"+
		"\u0433\u0435\3\2\2\2\u0434\u0428\3\2\2\2\u0434\u042a\3\2\2\2\u0435\u00a3"+
		"\3\2\2\2\u0436\u0439\5\u008eH\2\u0437\u0439\5\u00acW\2\u0438\u0436\3\2"+
		"\2\2\u0438\u0437\3\2\2\2\u0439\u00a5\3\2\2\2\u043a\u043c\5\16\b\2\u043b"+
		"\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2"+
		"\2\2\u043e\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\5P)\2\u0441\u0442"+
		"\5H%\2\u0442\u0443\7J\2\2\u0443\u0444\5\u00b2Z\2\u0444\u00a7\3\2\2\2\u0445"+
		"\u0446\5\u00acW\2\u0446\u00a9\3\2\2\2\u0447\u0448\7;\2\2\u0448\u0449\5"+
		"\u00b2Z\2\u0449\u044a\7<\2\2\u044a\u00ab\3\2\2\2\u044b\u0450\5\u00b2Z"+
		"\2\u044c\u044d\7B\2\2\u044d\u044f\5\u00b2Z\2\u044e\u044c\3\2\2\2\u044f"+
		"\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u00ad\3\2"+
		"\2\2\u0452\u0450\3\2\2\2\u0453\u0454\5\u00b2Z\2\u0454\u00af\3\2\2\2\u0455"+
		"\u0456\5\u00b2Z\2\u0456\u00b1\3\2\2\2\u0457\u0458\bZ\1\2\u0458\u0459\7"+
		";\2\2\u0459\u045a\5P)\2\u045a\u045b\7<\2\2\u045b\u045c\5\u00b2Z\23\u045c"+
		"\u0465\3\2\2\2\u045d\u045e\t\5\2\2\u045e\u0465\5\u00b2Z\21\u045f\u0460"+
		"\t\6\2\2\u0460\u0465\5\u00b2Z\20\u0461\u0465\5\u00b4[\2\u0462\u0463\7"+
		"!\2\2\u0463\u0465\5\u00b6\\\2\u0464\u0457\3\2\2\2\u0464\u045d\3\2\2\2"+
		"\u0464\u045f\3\2\2\2\u0464\u0461\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u04bb"+
		"\3\2\2\2\u0466\u0467\f\17\2\2\u0467\u0468\t\7\2\2\u0468\u04ba\5\u00b2"+
		"Z\20\u0469\u046a\f\16\2\2\u046a\u046b\t\b\2\2\u046b\u04ba\5\u00b2Z\17"+
		"\u046c\u0474\f\r\2\2\u046d\u046e\7F\2\2\u046e\u0475\7F\2\2\u046f\u0470"+
		"\7E\2\2\u0470\u0471\7E\2\2\u0471\u0475\7E\2\2\u0472\u0473\7E\2\2\u0473"+
		"\u0475\7E\2\2\u0474\u046d\3\2\2\2\u0474\u046f\3\2\2\2\u0474\u0472\3\2"+
		"\2\2\u0475\u0476\3\2\2\2\u0476\u04ba\5\u00b2Z\16\u0477\u0478\f\f\2\2\u0478"+
		"\u0479\t\t\2\2\u0479\u04ba\5\u00b2Z\r\u047a\u047b\f\n\2\2\u047b\u047c"+
		"\t\n\2\2\u047c\u04ba\5\u00b2Z\13\u047d\u047e\f\t\2\2\u047e\u047f\7W\2"+
		"\2\u047f\u04ba\5\u00b2Z\n\u0480\u0481\f\b\2\2\u0481\u0482\7Y\2\2\u0482"+
		"\u04ba\5\u00b2Z\t\u0483\u0484\f\7\2\2\u0484\u0485\7X\2\2\u0485\u04ba\5"+
		"\u00b2Z\b\u0486\u0487\f\6\2\2\u0487\u0488\7O\2\2\u0488\u04ba\5\u00b2Z"+
		"\7\u0489\u048a\f\5\2\2\u048a\u048b\7P\2\2\u048b\u04ba\5\u00b2Z\6\u048c"+
		"\u048d\f\4\2\2\u048d\u048e\7I\2\2\u048e\u048f\5\u00b2Z\2\u048f\u0490\7"+
		"J\2\2\u0490\u0491\5\u00b2Z\5\u0491\u04ba\3\2\2\2\u0492\u0493\f\3\2\2\u0493"+
		"\u0494\t\13\2\2\u0494\u04ba\5\u00b2Z\3\u0495\u0496\f\33\2\2\u0496\u0497"+
		"\7C\2\2\u0497\u04ba\7f\2\2\u0498\u0499\f\32\2\2\u0499\u049a\7C\2\2\u049a"+
		"\u04ba\7-\2\2\u049b\u049c\f\31\2\2\u049c\u049d\7C\2\2\u049d\u049f\7!\2"+
		"\2\u049e\u04a0\5\u00c2b\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0"+
		"\u04a1\3\2\2\2\u04a1\u04ba\5\u00ba^\2\u04a2\u04a3\f\30\2\2\u04a3\u04a4"+
		"\7C\2\2\u04a4\u04a5\7*\2\2\u04a5\u04ba\5\u00c8e\2\u04a6\u04a7\f\27\2\2"+
		"\u04a7\u04a8\7C\2\2\u04a8\u04ba\5\u00c0a\2\u04a9\u04aa\f\26\2\2\u04aa"+
		"\u04ab\7?\2\2\u04ab\u04ac\5\u00b2Z\2\u04ac\u04ad\7@\2\2\u04ad\u04ba\3"+
		"\2\2\2\u04ae\u04af\f\25\2\2\u04af\u04b1\7;\2\2\u04b0\u04b2\5\u00acW\2"+
		"\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04ba"+
		"\7<\2\2\u04b4\u04b5\f\22\2\2\u04b5\u04ba\t\f\2\2\u04b6\u04b7\f\13\2\2"+
		"\u04b7\u04b8\7\34\2\2\u04b8\u04ba\5P)\2\u04b9\u0466\3\2\2\2\u04b9\u0469"+
		"\3\2\2\2\u04b9\u046c\3\2\2\2\u04b9\u0477\3\2\2\2\u04b9\u047a\3\2\2\2\u04b9"+
		"\u047d\3\2\2\2\u04b9\u0480\3\2\2\2\u04b9\u0483\3\2\2\2\u04b9\u0486\3\2"+
		"\2\2\u04b9\u0489\3\2\2\2\u04b9\u048c\3\2\2\2\u04b9\u0492\3\2\2\2\u04b9"+
		"\u0495\3\2\2\2\u04b9\u0498\3\2\2\2\u04b9\u049b\3\2\2\2\u04b9\u04a2\3\2"+
		"\2\2\u04b9\u04a6\3\2\2\2\u04b9\u04a9\3\2\2\2\u04b9\u04ae\3\2\2\2\u04b9"+
		"\u04b4\3\2\2\2\u04b9\u04b6\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2"+
		"\2\2\u04bb\u04bc\3\2\2\2\u04bc\u00b3\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be"+
		"\u04bf\7;\2\2\u04bf\u04c0\5\u00b2Z\2\u04c0\u04c1\7<\2\2\u04c1\u04d4\3"+
		"\2\2\2\u04c2\u04d4\7-\2\2\u04c3\u04d4\7*\2\2\u04c4\u04d4\5j\66\2\u04c5"+
		"\u04d4\7f\2\2\u04c6\u04c7\5P)\2\u04c7\u04c8\7C\2\2\u04c8\u04c9\7\13\2"+
		"\2\u04c9\u04d4\3\2\2\2\u04ca\u04cb\7\62\2\2\u04cb\u04cc\7C\2\2\u04cc\u04d4"+
		"\7\13\2\2\u04cd\u04d1\5\u00c2b\2\u04ce\u04d2\5\u00caf\2\u04cf\u04d0\7"+
		"-\2\2\u04d0\u04d2\5\u00ccg\2\u04d1\u04ce\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2"+
		"\u04d4\3\2\2\2\u04d3\u04be\3\2\2\2\u04d3\u04c2\3\2\2\2\u04d3\u04c3\3\2"+
		"\2\2\u04d3\u04c4\3\2\2\2\u04d3\u04c5\3\2\2\2\u04d3\u04c6\3\2\2\2\u04d3"+
		"\u04ca\3\2\2\2\u04d3\u04cd\3\2\2\2\u04d4\u00b5\3\2\2\2\u04d5\u04d6\5\u00c2"+
		"b\2\u04d6\u04d7\5\u00b8]\2\u04d7\u04d8\5\u00be`\2\u04d8\u04df\3\2\2\2"+
		"\u04d9\u04dc\5\u00b8]\2\u04da\u04dd\5\u00bc_\2\u04db\u04dd\5\u00be`\2"+
		"\u04dc\u04da\3\2\2\2\u04dc\u04db\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04d5"+
		"\3\2\2\2\u04de\u04d9\3\2\2\2\u04df\u00b7\3\2\2\2\u04e0\u04e2\7f\2\2\u04e1"+
		"\u04e3\5\u00c4c\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04eb"+
		"\3\2\2\2\u04e4\u04e5\7C\2\2\u04e5\u04e7\7f\2\2\u04e6\u04e8\5\u00c4c\2"+
		"\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e4"+
		"\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04f0\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04f0\5T+\2\u04ef\u04e0\3\2\2"+
		"\2\u04ef\u04ee\3\2\2\2\u04f0\u00b9\3\2\2\2\u04f1\u04f3\7f\2\2\u04f2\u04f4"+
		"\5\u00c6d\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2"+
		"\2\u04f5\u04f6\5\u00be`\2\u04f6\u00bb\3\2\2\2\u04f7\u0513\7?\2\2\u04f8"+
		"\u04fd\7@\2\2\u04f9\u04fa\7?\2\2\u04fa\u04fc\7@\2\2\u04fb\u04f9\3\2\2"+
		"\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0500"+
		"\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u0514\5L\'\2\u0501\u0502\5\u00b2Z\2"+
		"\u0502\u0509\7@\2\2\u0503\u0504\7?\2\2\u0504\u0505\5\u00b2Z\2\u0505\u0506"+
		"\7@\2\2\u0506\u0508\3\2\2\2\u0507\u0503\3\2\2\2\u0508\u050b\3\2\2\2\u0509"+
		"\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0510\3\2\2\2\u050b\u0509\3\2"+
		"\2\2\u050c\u050d\7?\2\2\u050d\u050f\7@\2\2\u050e\u050c\3\2\2\2\u050f\u0512"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u04f8\3\2\2\2\u0513\u0501\3\2\2\2\u0514\u00bd\3\2"+
		"\2\2\u0515\u0517\5\u00ccg\2\u0516\u0518\5$\23\2\u0517\u0516\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u00bf\3\2\2\2\u0519\u051a\5\u00c2b\2\u051a\u051b"+
		"\5\u00caf\2\u051b\u00c1\3\2\2\2\u051c\u051d\7F\2\2\u051d\u051e\5\"\22"+
		"\2\u051e\u051f\7E\2\2\u051f\u00c3\3\2\2\2\u0520\u0521\7F\2\2\u0521\u0524"+
		"\7E\2\2\u0522\u0524\5V,\2\u0523\u0520\3\2\2\2\u0523\u0522\3\2\2\2\u0524"+
		"\u00c5\3\2\2\2\u0525\u0526\7F\2\2\u0526\u0529\7E\2\2\u0527\u0529\5\u00c2"+
		"b\2\u0528\u0525\3\2\2\2\u0528\u0527\3\2\2\2\u0529\u00c7\3\2\2\2\u052a"+
		"\u0531\5\u00ccg\2\u052b\u052c\7C\2\2\u052c\u052e\7f\2\2\u052d\u052f\5"+
		"\u00ccg\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0531\3\2\2\2"+
		"\u0530\u052a\3\2\2\2\u0530\u052b\3\2\2\2\u0531\u00c9\3\2\2\2\u0532\u0533"+
		"\7*\2\2\u0533\u0537\5\u00c8e\2\u0534\u0535\7f\2\2\u0535\u0537\5\u00cc"+
		"g\2\u0536\u0532\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u00cb\3\2\2\2\u0538"+
		"\u053a\7;\2\2\u0539\u053b\5\u00acW\2\u053a\u0539\3\2\2\2\u053a\u053b\3"+
		"\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7<\2\2\u053d\u00cd\3\2\2\2\u009a"+
		"\u00cf\u00d4\u00da\u00e2\u00eb\u00f0\u00f7\u00ff\u0106\u010e\u0113\u011e"+
		"\u0120\u0131\u0133\u0137\u013c\u0141\u0146\u0151\u0159\u0160\u0167\u016b"+
		"\u016e\u0171\u017a\u0180\u0185\u0188\u018e\u0195\u0199\u01a6\u01ad\u01b7"+
		"\u01bf\u01c5\u01ca\u01d7\u01db\u01e4\u01ea\u01f1\u01fb\u020b\u0211\u021e"+
		"\u0226\u0230\u0238\u0241\u0247\u0254\u025b\u025f\u0263\u0267\u026f\u0273"+
		"\u0275\u0280\u0288\u028b\u028f\u0294\u0298\u02a3\u02ac\u02ae\u02b5\u02ba"+
		"\u02c3\u02c8\u02cb\u02d0\u02da\u02ea\u02f4\u02f7\u0300\u030a\u0312\u0315"+
		"\u0318\u0325\u032d\u0332\u033a\u033e\u0342\u0346\u0348\u034c\u0352\u035e"+
		"\u0367\u036f\u037b\u0384\u039b\u039e\u03a1\u03a9\u03ad\u03b5\u03bb\u03c6"+
		"\u03cf\u03d4\u03de\u03e5\u03f2\u03fb\u0404\u040a\u0415\u041a\u0426\u042a"+
		"\u042e\u0432\u0434\u0438\u043d\u0450\u0464\u0474\u049f\u04b1\u04b9\u04bb"+
		"\u04d1\u04d3\u04dc\u04de\u04e2\u04e7\u04eb\u04ef\u04f3\u04fd\u0509\u0510"+
		"\u0513\u0517\u0523\u0528\u052e\u0530\u0536\u053a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}