// Generated from simpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simpleCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orstatement}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrstatement(simpleCalcParser.OrstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(simpleCalcParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(simpleCalcParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GRETEREQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGRETEREQ(simpleCalcParser.GRETEREQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(simpleCalcParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQUALS}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQUALS(simpleCalcParser.EQUALSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LESSEQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLESSEQ(simpleCalcParser.LESSEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(simpleCalcParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GREATER}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGREATER(simpleCalcParser.GREATERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LESS}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLESS(simpleCalcParser.LESSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTEQ}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTEQ(simpleCalcParser.NOTEQContext ctx);
}