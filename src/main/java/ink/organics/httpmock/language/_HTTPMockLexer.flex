package ink.organics.httpmock.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ink.organics.httpmock.language.psi.HTTPMockTypes.*;

%%

%{
  public _HTTPMockLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _HTTPMockLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

REQUEST_METHOD=(GET|POST|PUT|DELETE|HEAD|OPTIONS|TRACE|CONNECT)
COMMENT="//".*|#+.*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "&"                   { return AND; }
  ":"                   { return COLON; }
  "$"                   { return DYNAMIC_SIGN; }
  "="                   { return EQUALS; }
  "#"                   { return HASHTAG; }
  "http"                { return HTTP; }
  "https"               { return HTTPS; }
  "{{"                  { return LBRACES; }
  "}}"                  { return RBRACES; }
  "?"                   { return QUESTION; }
  "://"                 { return SCHEME_SEPARATOR; }
  ";"                   { return SEMICOLON; }
  "/"                   { return SEPARATOR; }
  "TODO"                { return TODO; }
  "HTTP"                { return PROTOCOL; }
  "CRLF"                { return CRLF; }
  "port"                { return PORT; }
  "IDENTIFIER"          { return IDENTIFIER; }
  "URI"                 { return URI; }
  "HTTP_VERSION"        { return HTTP_VERSION; }
  "HEADER_NAME"         { return HEADER_NAME; }
  "HEADER_VALUE"        { return HEADER_VALUE; }

  {REQUEST_METHOD}      { return REQUEST_METHOD; }
  {COMMENT}             { return COMMENT; }
  {STRING}              { return STRING; }

}

[^] { return BAD_CHARACTER; }
