// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ink.organics.httpmock.language.psi.HTTPMockTypes.*;
import ink.organics.httpmock.language.psi.*;

public class HTTPSchemeImpl extends HTTPMockCompositeElementImpl implements HTTPScheme {

  public HTTPSchemeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HTTPVisitor visitor) {
    visitor.visitScheme(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HTTPVisitor) accept((HTTPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HTTPSchemeBody getSchemeBody() {
    return findNotNullChildByClass(HTTPSchemeBody.class);
  }

}
