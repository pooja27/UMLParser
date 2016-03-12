// Generated from javaParser.g4 by ANTLR 4.4

package com.assignment.javaParser;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.assignment.IR.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaParserParser}.
 */
public interface javaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaParserParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull javaParserParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull javaParserParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull javaParserParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull javaParserParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull javaParserParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull javaParserParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull javaParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull javaParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull javaParserParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull javaParserParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull javaParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull javaParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull javaParserParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull javaParserParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull javaParserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull javaParserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull javaParserParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull javaParserParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull javaParserParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull javaParserParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull javaParserParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull javaParserParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull javaParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull javaParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull javaParserParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull javaParserParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull javaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull javaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull javaParserParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull javaParserParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull javaParserParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull javaParserParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull javaParserParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull javaParserParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull javaParserParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull javaParserParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull javaParserParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull javaParserParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull javaParserParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull javaParserParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull javaParserParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull javaParserParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull javaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull javaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull javaParserParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull javaParserParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull javaParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull javaParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull javaParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull javaParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull javaParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull javaParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull javaParserParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull javaParserParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull javaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull javaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull javaParserParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull javaParserParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull javaParserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull javaParserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull javaParserParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull javaParserParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull javaParserParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull javaParserParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull javaParserParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull javaParserParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull javaParserParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull javaParserParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull javaParserParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull javaParserParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull javaParserParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull javaParserParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull javaParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull javaParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull javaParserParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull javaParserParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull javaParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull javaParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull javaParserParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull javaParserParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull javaParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull javaParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull javaParserParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull javaParserParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull javaParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull javaParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull javaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull javaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull javaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull javaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull javaParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull javaParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull javaParserParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull javaParserParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull javaParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull javaParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull javaParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull javaParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull javaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull javaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull javaParserParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull javaParserParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull javaParserParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull javaParserParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull javaParserParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull javaParserParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull javaParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull javaParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull javaParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull javaParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull javaParserParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull javaParserParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull javaParserParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull javaParserParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull javaParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull javaParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull javaParserParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull javaParserParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull javaParserParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull javaParserParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull javaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull javaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull javaParserParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull javaParserParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull javaParserParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull javaParserParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull javaParserParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull javaParserParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull javaParserParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull javaParserParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull javaParserParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull javaParserParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull javaParserParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull javaParserParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull javaParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull javaParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull javaParserParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull javaParserParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull javaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull javaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull javaParserParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull javaParserParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull javaParserParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull javaParserParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull javaParserParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull javaParserParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull javaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull javaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull javaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull javaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull javaParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull javaParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull javaParserParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull javaParserParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull javaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull javaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#arrayNotation}.
	 * @param ctx the parse tree
	 */
	void enterArrayNotation(@NotNull javaParserParser.ArrayNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#arrayNotation}.
	 * @param ctx the parse tree
	 */
	void exitArrayNotation(@NotNull javaParserParser.ArrayNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull javaParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull javaParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull javaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull javaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull javaParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull javaParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull javaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull javaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull javaParserParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull javaParserParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull javaParserParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull javaParserParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull javaParserParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull javaParserParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull javaParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull javaParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull javaParserParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull javaParserParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull javaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull javaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull javaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull javaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull javaParserParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull javaParserParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull javaParserParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull javaParserParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull javaParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull javaParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull javaParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull javaParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull javaParserParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull javaParserParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull javaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull javaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull javaParserParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull javaParserParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull javaParserParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull javaParserParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull javaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull javaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull javaParserParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull javaParserParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull javaParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull javaParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull javaParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull javaParserParser.SwitchBlockStatementGroupContext ctx);
}