import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.util.*;
import java.io.IOException;

class Interpreter extends AbstractParseTreeVisitor<Double> implements simpleCalcVisitor<Double> {

    // An environment mapping variablenames to double values (initially empty)
    public static HashMap<String,Double> env=new HashMap<String,Double>();

    public Double visitStart(simpleCalcParser.StartContext ctx){
    	return visit(ctx.prog);
    };

    public Double visitProgram(simpleCalcParser.ProgramContext ctx) {
	    		// New implementation: visit all assignments:
  		for (simpleCalcParser.AssignContext a:ctx.as)
        visit(a);

      if (ctx.e != null) {
        return visit(ctx.e);
      } else if (ctx.f != null) {
        return visit(ctx.f);
      } else if (ctx.l != null) {
        return visit(ctx.l);
      } else if (ctx.c != null) {
        return visit(ctx.c);
      } else {
        return null;
      }
    }

    public Double visitParenthesis(simpleCalcParser.ParenthesisContext ctx){
	return visit(ctx.e);
    };

    public Double visitVariable(simpleCalcParser.VariableContext ctx){
	       // New implementation: look up the value of the variable in the environment env:
      	String varname=ctx.x.getText();
      	Double d=env.get(varname);
      	if (d==null){
      	    System.err.println("Variable "+varname+" is not defined.\n");
      	    System.exit(-1);
      	}
      	return d;
    };

    public Double visitAddition(simpleCalcParser.AdditionContext ctx){
    	if (ctx.op.getText().equals("+"))
  	     return visit(ctx.e1)+visit(ctx.e2);
  	  else
  	     return visit(ctx.e1)-visit(ctx.e2 );
    };

    public Double visitMultiplication(simpleCalcParser.MultiplicationContext ctx){
		    return visit(ctx.e1)*visit(ctx.e2);
    };

    public Double visitDivision(simpleCalcParser.DivisionContext ctx) {
    	 return visit(ctx.e1) / visit(ctx.e2);
    }

    public Double visitConstant(simpleCalcParser.ConstantContext ctx){
		    return Double.parseDouble(ctx.c.getText());
    };

    public Double visitSignedConstant(simpleCalcParser.SignedConstantContext ctx){
	     return Double.parseDouble(ctx.getText());
    };

    public Double visitIfstatement(simpleCalcParser.IfstatementContext ctx) {
      if (visit(ctx.c1) == 1.0)  {
        visit(ctx.p1);
      } else {
        visit(ctx.p3);
      }
      return null;
    };

    public Double visitLoop(simpleCalcParser.LoopContext ctx) {
      return null;
    }

    public Double visitGRETEREQ(simpleCalcParser.GRETEREQContext ctx) {
      return (visit(ctx.e1) >= visit(ctx.e2)) ? 1.0 : 0.0;
    }

    public Double visitOR(simpleCalcParser.ORContext ctx) {
      return (visit(ctx.c1) == 1.0 || visit(ctx.c2) == 1.0) ? 1.0 : 0.0;
    }

    public Double visitEQUALS(simpleCalcParser.EQUALSContext ctx) {
      return (visit(ctx.e1) == visit(ctx.e2)) ? 1.0 : 0.0;
    }

    public Double visitLESSEQ(simpleCalcParser.LESSEQContext ctx) {
      return (visit(ctx.e1) <= visit(ctx.e2)) ? 1.0 : 0.0;
    }

    public Double visitAND(simpleCalcParser.ANDContext ctx) {
      return (visit(ctx.c1) == 1.0 && visit(ctx.c2) == 1.0) ? 1.0 : 0.0;
    }

    public Double visitGREATER(simpleCalcParser.GREATERContext ctx){
      return (visit(ctx.e1) > visit(ctx.e2)) ? 1.0 : 0.0;
    }

    public Double visitLESS(simpleCalcParser.LESSContext ctx){
      return (visit(ctx.e1) < visit(ctx.e2)) ? 1.0 : 0.0;
    }

    public Double visitNOTEQ(simpleCalcParser.NOTEQContext ctx) {
      return !visit(ctx.e1).equals(visit(ctx.e2)) ? 1.0 : 0.0;
    };

    public Double visitAssign(simpleCalcParser.AssignContext ctx){
    	// New implementation: evaluate the expression and store it in the environment for the given
    	// variable name
    	String varname=ctx.x.getText();
    	Double v = visit(ctx.e);
    	env.put(varname,v);

    	return v;
    };

}

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Simple calculator\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated

	// create a lexer/scanner
	simpleCalcLexer lex = new simpleCalcLexer(input);

	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);

	// create a parser
	simpleCalcParser parser = new simpleCalcParser(tokens);

	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	Double result=interpreter.visit(parseTree);

	System.out.println("The result is: "+result);
    }
}

// We write an interpreter that implements interface
// "simpleCalcVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.
