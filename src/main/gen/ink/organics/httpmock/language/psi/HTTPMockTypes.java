// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ink.organics.httpmock.language.psi.impl.*;

public interface HTTPMockTypes {

  IElementType CONTEXT = new HTTPMockElementType("CONTEXT");
  IElementType HEADER = new HTTPMockElementType("HEADER");
  IElementType HOST = new HTTPMockElementType("HOST");
  IElementType METHOD = new HTTPMockElementType("METHOD");
  IElementType REQUEST_BODY = new HTTPMockElementType("REQUEST_BODY");
  IElementType SCHEME = new HTTPMockElementType("SCHEME");
  IElementType SCHEME_BODY = new HTTPMockElementType("SCHEME_BODY");

  IElementType AND = new HTTPMockTokenType("&");
  IElementType COLON = new HTTPMockTokenType(":");
  IElementType COMMENT = new HTTPMockTokenType("COMMENT");
  IElementType CRLF = new HTTPMockTokenType("CRLF");
  IElementType DYNAMIC_SIGN = new HTTPMockTokenType("$");
  IElementType EQUALS = new HTTPMockTokenType("=");
  IElementType HASHTAG = new HTTPMockTokenType("#");
  IElementType HEADER_NAME = new HTTPMockTokenType("HEADER_NAME");
  IElementType HEADER_VALUE = new HTTPMockTokenType("HEADER_VALUE");
  IElementType HTTP = new HTTPMockTokenType("http");
  IElementType HTTPS = new HTTPMockTokenType("https");
  IElementType HTTP_VERSION = new HTTPMockTokenType("HTTP_VERSION");
  IElementType IDENTIFIER = new HTTPMockTokenType("IDENTIFIER");
  IElementType LBRACES = new HTTPMockTokenType("{{");
  IElementType PORT = new HTTPMockTokenType("port");
  IElementType PROTOCOL = new HTTPMockTokenType("HTTP");
  IElementType QUESTION = new HTTPMockTokenType("?");
  IElementType RBRACES = new HTTPMockTokenType("}}");
  IElementType REQUEST_METHOD = new HTTPMockTokenType("REQUEST_METHOD");
  IElementType SCHEME_SEPARATOR = new HTTPMockTokenType("://");
  IElementType SEMICOLON = new HTTPMockTokenType(";");
  IElementType SEPARATOR = new HTTPMockTokenType("/");
  IElementType STRING = new HTTPMockTokenType("STRING");
  IElementType TODO = new HTTPMockTokenType("TODO");
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
      else if (type == HOST) {
        return new HTTPHostImpl(node);
      }
      else if (type == METHOD) {
        return new HTTPMethodImpl(node);
      }
      else if (type == REQUEST_BODY) {
        return new HTTPRequestBodyImpl(node);
      }
      else if (type == SCHEME) {
        return new HTTPSchemeImpl(node);
      }
      else if (type == SCHEME_BODY) {
        return new HTTPSchemeBodyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
