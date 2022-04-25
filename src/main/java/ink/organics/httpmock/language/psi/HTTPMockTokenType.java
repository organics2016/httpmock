package ink.organics.httpmock.language.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import ink.organics.httpmock.HTTPMockLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HTTPMockTokenType extends IElementType {

    public HTTPMockTokenType(@NonNls @NotNull String debugName) {
        super(debugName, HTTPMockLanguage.INSTANCE);
    }
}
