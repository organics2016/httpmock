// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HTTPContext extends HTTPMockCompositeElement {

  @Nullable
  PsiElement getHttpVersion();

  @NotNull
  PsiElement getMethod();

  @NotNull
  PsiElement getUri();

}