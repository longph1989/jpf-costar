package plexil.parser;

import plexil.PlexilASTNode;
import plexil.PlexilTreeParser;

public class Driver {

	public static void main(String[] args) throws Exception {
		if (args.length < 1)
			return;
		
		PlexilTreeParser tree = new PlexilTreeParser();
		
		switch (args[0]) {
		case "absValue":
			tree.absValue(null, null);
			break;
		case "add":
			tree.add(null, null);
			break;
		case "argument":
			tree.argument(null, null);
			break;
		case "arrayAssignment":
			tree.arrayAssignment(null, null);
			break;
		case "arrayExpression":
			tree.arrayExpression(null, null);
			break;
		case "arrayRHS":
			tree.arrayRHS(null, null);
			break;
		case "arrayVariable":
			tree.arrayVariable(null);
			break;
		case "blobVariable":
			tree.blobVariable(null, null);
			break;
		case "booleanComparison":
			tree.booleanComparison(null, null);
			break;
		case "booleanValue":
			tree.booleanValue(null);
			break;
		case "booleanVariable":
			tree.booleanVariable(null, null);
			break;
		case "comment":
			tree.comment(null, null);
			break;
		case "comparison":
			tree.comparison(null, null);
			break;
		case "constAlias":
			tree.constAlias(null, null);
			break;
		case "div":
			tree.div(null, null);
			break;
		case "endCondition":
			tree.endCondition(null, null);
			break;
		case "externalStructName":
			tree.externalStructName(null);
			break;
		case "globalDeclaration":
			tree.globalDeclaration(null, null);
			break;
		case "ifBody":
			tree.ifBody(null, null);
			break;
		case "integerValue":
			tree.integerValue(null);
			break;
		case "integerVariable":
			tree.integerVariable(null, null);
			break;
		case "interfaceDeclaration":
			tree.interfaceDeclaration(null);
			break;
		case "invariantCondition":
			tree.invariantCondition(null,null);
			break;
		case "libraryNodeDeclaration":
			tree.libraryNodeDeclaration(null);
			break;
			
			
			
		
		
		
		case "booleanTerm":
			PlexilASTNode tBT = new PlexilASTNode();
			tree.booleanTerm(tBT, null);
			
			break;
		case "booleanExpression":
			PlexilASTNode tBE = new PlexilASTNode();
			tree.booleanExpression(tBE, null);
			
			break;
		case "not":
			PlexilASTNode tNot = new PlexilASTNode();
			tree.not(tNot, null);
			
			break;
		
		case "realValue":
			PlexilASTNode tRV = new PlexilASTNode();
			tree.realValue(tRV);
			
			break;
		case "numericTerm":
			PlexilASTNode tNT = new PlexilASTNode();
			tree.numericTerm(tNT, null);
			
			break;
		case "numericExpression":
			PlexilASTNode tNE = new PlexilASTNode();
			tree.numericExpression(tNE, null);
			
			break;
		case "numericUnaryOperation":
			PlexilASTNode tNUO = new PlexilASTNode();
			tree.numericUnaryOperation(tNUO, null);
			
			break;
		
		case "sqrt":
			PlexilASTNode tSQRT = new PlexilASTNode();
			tree.sqrt(tSQRT, null);
			
			break;
		
		case "sub":
			PlexilASTNode tSub = new PlexilASTNode();
			tree.sub(tSub, null);
			
			break;
		case "mul":
			PlexilASTNode tMul = new PlexilASTNode();
			tree.mul(tMul, null);
			
			break;
		
		case "stringValue":
			PlexilASTNode tSV = new PlexilASTNode();
			tree.stringValue(tSV);
			
			break;
		case "pointsTo":
			PlexilASTNode tPt = new PlexilASTNode();
			tree.pointsTo(tPt);
			
			break;
		
		
		case "realVariable":
			PlexilASTNode tRVar = new PlexilASTNode();
			tree.realVariable(tRVar, null);
			
			break;
		case "stringVariable":
			PlexilASTNode tSVar = new PlexilASTNode();
			tree.stringVariable(tSVar, null);
			
			break;
		
		case "variableName":
			PlexilASTNode tVN = new PlexilASTNode();
			tree.variableName(tVN);
			
			break;
		default:
			// do nothing
		}
	}

}