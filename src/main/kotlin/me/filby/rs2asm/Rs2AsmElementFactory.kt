package me.filby.rs2asm

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import me.filby.rs2asm.psi.Rs2AsmInstruction
import me.filby.rs2asm.psi.Rs2AsmInstructionName
import me.filby.rs2asm.psi.Rs2AsmInstructionOperand
import me.filby.rs2asm.psi.Rs2AsmLabel
import me.filby.rs2asm.psi.Rs2AsmOperandLabel
import me.filby.rs2asm.psi.Rs2AsmPsiElement
import net.runelite.cache.script.assembler.rs2asmParser
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

object Rs2AsmElementFactory {
    fun createElement(node: ASTNode): PsiElement {
        val elType = node.elementType
        if (elType is TokenIElementType) {
            return ANTLRPsiNode(node)
        }
        if (elType !is RuleIElementType) {
            return ANTLRPsiNode(node)
        }
        return when (elType.ruleIndex) {
            rs2asmParser.RULE_instruction -> Rs2AsmInstruction(node)
            rs2asmParser.RULE_label -> Rs2AsmLabel(node)
            rs2asmParser.RULE_instruction_name -> Rs2AsmInstructionName(node)
            rs2asmParser.RULE_instruction_operand -> Rs2AsmInstructionOperand(node)
            rs2asmParser.RULE_operand_label -> Rs2AsmOperandLabel(node)
            else -> Rs2AsmPsiElement(node)
        }
    }
}
