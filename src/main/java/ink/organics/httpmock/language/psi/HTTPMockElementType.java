package ink.organics.httpmock.language.psi;

import com.intellij.psi.tree.IElementType;
import ink.organics.httpmock.language.HTTPMockLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class HTTPMockElementType extends IElementType {

    public HTTPMockElementType(@NonNls @NotNull String debugName) {
        super(debugName, HTTPMockLanguage.INSTANCE);
    }
}
