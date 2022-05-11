package ink.organics.httpmock.language.psi;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.tree.IElementType;

public interface HTTPMockCompositeElement extends NavigatablePsiElement {
    IElementType getTokenType();
}
