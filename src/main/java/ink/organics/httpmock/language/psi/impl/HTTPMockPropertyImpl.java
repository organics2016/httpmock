// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ink.organics.httpmock.language.psi.HTTPMockTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ink.organics.httpmock.language.psi.*;

public class HTTPMockPropertyImpl extends ASTWrapperPsiElement implements HTTPMockProperty {

  public HTTPMockPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HTTPMockVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HTTPMockVisitor) accept((HTTPMockVisitor)visitor);
    else super.accept(visitor);
  }

}
