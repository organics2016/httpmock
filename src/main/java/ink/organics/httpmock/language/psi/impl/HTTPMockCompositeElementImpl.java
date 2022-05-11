package ink.organics.httpmock.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import ink.organics.httpmock.language.psi.HTTPMockCompositeElement;
import org.jetbrains.annotations.NotNull;

public class HTTPMockCompositeElementImpl extends ASTWrapperPsiElement implements HTTPMockCompositeElement {

    public HTTPMockCompositeElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public IElementType getTokenType() {
        return this.getNode().getElementType();
    }
}
