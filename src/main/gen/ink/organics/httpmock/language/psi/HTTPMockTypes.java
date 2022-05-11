// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ink.organics.httpmock.language.psi.impl.*;

public interface HTTPMockTypes {

  IElementType CONTEXT = new HTTPMockElementType("CONTEXT");
  IElementType HEADER = new HTTPMockElementType("HEADER");
  IElementType REQUEST_BODY = new HTTPMockElementType("REQUEST_BODY");

  IElementType AND = new HTTPMockTokenType("&");
  IElementType COLON = new HTTPMockTokenType(":");
  IElementType COMMENT = new HTTPMockTokenType("comment");
  IElementType CRLF = new HTTPMockTokenType("CRLF");
  IElementType HEADER_NAME = new HTTPMockTokenType("HEADER_NAME");
  IElementType HEADER_VALUE = new HTTPMockTokenType("HEADER_VALUE");
  IElementType HTTP_VERSION = new HTTPMockTokenType("HTTP_VERSION");
  IElementType METHOD = new HTTPMockTokenType("METHOD");
  IElementType STRING = new HTTPMockTokenType("string");
  IElementType URI = new HTTPMockTokenType("URI");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONTEXT) {
        return new HTTPContextImpl(node);
      }
      else if (type == HEADER) {
        return new HTTPHeaderImpl(node);
      }
      else if (type == REQUEST_BODY) {
        return new HTTPRequestBodyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
