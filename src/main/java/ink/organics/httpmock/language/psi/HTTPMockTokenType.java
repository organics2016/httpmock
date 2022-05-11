package ink.organics.httpmock.language.psi;

import com.intellij.psi.tree.IElementType;
import ink.organics.httpmock.language.HTTPMockLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class HTTPMockTokenType extends IElementType {

    public HTTPMockTokenType(@NonNls @NotNull String debugName) {
        super(debugName, HTTPMockLanguage.INSTANCE);
    }
}
