package ink.organics.httpmock.language.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.mock.MockPsiFile;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import ink.organics.httpmock.language.HTTPMockLanguage;
import ink.organics.httpmock.language.HTTPMockPsiFile;
import ink.organics.httpmock.language.lexer.HTTPMockLexerAdapter;
import ink.organics.httpmock.language.psi.HTTPMockTypes;
import org.jetbrains.annotations.NotNull;

public class HTTPMockParserDefinition implements ParserDefinition {

    public static final TokenSet COMMENTS = TokenSet.create(HTTPMockTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(HTTPMockLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new HTTPMockLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new HTTPMockParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return HTTPMockTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new HTTPMockPsiFile(viewProvider);
    }
}
