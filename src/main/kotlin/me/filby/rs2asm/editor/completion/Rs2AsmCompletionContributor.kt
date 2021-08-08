package me.filby.rs2asm.editor.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.patterns.PlatformPatterns.psiElement
import me.filby.rs2asm.Rs2AsmParserDefinition.Companion.rules
import me.filby.rs2asm.Rs2AsmParserDefinition.Companion.tokens
import net.runelite.cache.script.assembler.rs2asmLexer
import net.runelite.cache.script.assembler.rs2asmParser

class Rs2AsmCompletionContributor : CompletionContributor() {
    init {
        extend(CompletionType.BASIC, INSTRUCTION_NAME_PATTERN, Rs2AsmInstructionsCompletionProvider())
    }

    companion object {
        private val INSTRUCTION_NAME_PATTERN = psiElement(tokens[rs2asmLexer.IDENTIFIER])
            .inside(psiElement(rules[rs2asmParser.RULE_name_string]))
    }
}
