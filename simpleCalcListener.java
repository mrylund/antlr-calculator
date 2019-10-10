// Generated from simpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simpleCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simpleCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orstatement}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrstatement(simpleCalcParser.OrstatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orstatement}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrstatement(simpleCalcParser.OrstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(simpleCalcParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(simpleCalcParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(simpleCalcParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(simpleCalcParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GRETEREQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGRETEREQ(simpleCalcParser.GRETEREQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GRETEREQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGRETEREQ(simpleCalcParser.GRETEREQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOR(simpleCalcParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOR(simpleCalcParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQUALS}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEQUALS(simpleCalcParser.EQUALSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQUALS}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEQUALS(simpleCalcParser.EQUALSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LESSEQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLESSEQ(simpleCalcParser.LESSEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LESSEQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLESSEQ(simpleCalcParser.LESSEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAND(simpleCalcParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAND(simpleCalcParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GREATER}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGREATER(simpleCalcParser.GREATERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GREATER}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGREATER(simpleCalcParser.GREATERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LESS}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLESS(simpleCalcParser.LESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LESS}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLESS(simpleCalcParser.LESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTEQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNOTEQ(simpleCalcParser.NOTEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTEQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNOTEQ(simpleCalcParser.NOTEQContext ctx);
}