// Generated from J:/Users/Joshua/Documents/Workspace/rs2asm-intellij-plugin/src/main/java/net/runelite/cache/script/assembler\rs2asm.g4 by ANTLR 4.9.1
package net.runelite.cache.script.assembler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rs2asmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rs2asmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(rs2asmParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(rs2asmParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(rs2asmParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#int_stack_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_stack_count(rs2asmParser.Int_stack_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#string_stack_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_stack_count(rs2asmParser.String_stack_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#int_var_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_var_count(rs2asmParser.Int_var_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#string_var_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_var_count(rs2asmParser.String_var_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#id_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_value(rs2asmParser.Id_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#int_stack_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_stack_value(rs2asmParser.Int_stack_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#string_stack_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_stack_value(rs2asmParser.String_stack_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#int_var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_var_value(rs2asmParser.Int_var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#string_var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_var_value(rs2asmParser.String_var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(rs2asmParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(rs2asmParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(rs2asmParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#instruction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_name(rs2asmParser.Instruction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#name_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_string(rs2asmParser.Name_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#name_opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_opcode(rs2asmParser.Name_opcodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#instruction_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_operand(rs2asmParser.Instruction_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#operand_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand_int(rs2asmParser.Operand_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#operand_qstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand_qstring(rs2asmParser.Operand_qstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#operand_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand_label(rs2asmParser.Operand_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#switch_lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_lookup(rs2asmParser.Switch_lookupContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#switch_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_key(rs2asmParser.Switch_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link rs2asmParser#switch_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_value(rs2asmParser.Switch_valueContext ctx);
}