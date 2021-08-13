package me.filby.rs2asm.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType
import me.filby.rs2asm.Rs2AsmParserDefinition.Companion.tokens
import net.runelite.cache.script.assembler.rs2asmLexer
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree

sealed class Rs2AsmInstructionName private constructor(node: ASTNode, idElementType: IElementType) :
    IdentifierDefSubtree(node, idElementType)

class Rs2AsmInstructionNameString(node: ASTNode) : Rs2AsmInstructionName(node, tokens[rs2asmLexer.IDENTIFIER])
class Rs2AsmInstructionNameInt(node: ASTNode) : Rs2AsmInstructionName(node, tokens[rs2asmLexer.INT])
