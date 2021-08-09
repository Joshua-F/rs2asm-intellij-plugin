package me.filby.rs2asm.editor

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import com.intellij.psi.TokenType
import me.filby.rs2asm.Rs2AsmParserDefinition
import net.runelite.cache.script.assembler.rs2asmLexer

class Rs2AsmQuoteHandler :
    SimpleTokenSetQuoteHandler(Rs2AsmParserDefinition.tokens[rs2asmLexer.QUOTE], TokenType.BAD_CHARACTER)
