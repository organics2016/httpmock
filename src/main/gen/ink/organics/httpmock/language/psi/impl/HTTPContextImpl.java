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

public class HTTPContextImpl extends HTTPMockCompositeElementImpl implements HTTPContext {

  public HTTPContextImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HTTPVisitor visitor) {
    visitor.visitContext(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HTTPVisitor) accept((HTTPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getHttpVersion() {
    return findChildByType(HTTP_VERSION);
  }

  @Override
  @NotNull
  public PsiElement getMethod() {
    return findNotNullChildByType(METHOD);
  }

  @Override
  @NotNull
  public PsiElement getUri() {
    return findNotNullChildByType(URI);
  }

}
