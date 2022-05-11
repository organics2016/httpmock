// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class HTTPVisitor extends PsiElementVisitor {

  public void visitContext(@NotNull HTTPContext o) {
    visitMockCompositeElement(o);
  }

  public void visitHeader(@NotNull HTTPHeader o) {
    visitMockCompositeElement(o);
  }

  public void visitRequestBody(@NotNull HTTPRequestBody o) {
    visitMockCompositeElement(o);
  }

  public void visitMockCompositeElement(@NotNull HTTPMockCompositeElement o) {
    visitElement(o);
  }

}
