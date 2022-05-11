package ink.organics.httpmock.language.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import com.intellij.lexer.MergingLexerAdapterBase;
import org.jetbrains.annotations.NotNull;

public class HTTPMockLexerAdapter extends FlexAdapter {

    public HTTPMockLexerAdapter() {
        super(new HTTPMockLexer(null));
    }
}
