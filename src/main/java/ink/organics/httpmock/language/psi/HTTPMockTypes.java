// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ink.organics.httpmock.language.psi.impl.*;

public interface HTTPMockTypes {

  IElementType PROPERTY = new HTTPMockElementType("PROPERTY");

  IElementType COMMENT = new HTTPMockTokenType("COMMENT");
  IElementType CRLF = new HTTPMockTokenType("CRLF");
  IElementType KEY = new HTTPMockTokenType("KEY");
  IElementType SEPARATOR = new HTTPMockTokenType("SEPARATOR");
  IElementType VALUE = new HTTPMockTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new HTTPMockPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
