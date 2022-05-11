// This is a generated file. Not intended for manual editing.
package ink.organics.httpmock.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ink.organics.httpmock.language.psi.HTTPMockTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class HTTPMockParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // method URI HTTP_VERSION?
  public static boolean context(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context")) return false;
    if (!nextTokenIs(b, REQUEST_METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method(b, l + 1);
    r = r && consumeToken(b, URI);
    r = r && context_2(b, l + 1);
    exit_section_(b, m, CONTEXT, r);
    return r;
  }

  // HTTP_VERSION?
  private static boolean context_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_2")) return false;
    consumeToken(b, HTTP_VERSION);
    return true;
  }

  /* ********************************************************** */
  // HEADER_NAME ':' HEADER_VALUE
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    if (!nextTokenIs(b, HEADER_NAME)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HEADER, null);
    r = consumeTokens(b, 2, HEADER_NAME, COLON, HEADER_VALUE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean host(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "host")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, HOST, r);
    return r;
  }

  /* ********************************************************** */
  // REQUEST_METHOD
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, REQUEST_METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUEST_METHOD);
    exit_section_(b, m, METHOD, r);
    return r;
  }

  /* ********************************************************** */
  // 'data'
  public static boolean request_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "request_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REQUEST_BODY, "<request body>");
    r = consumeToken(b, "data");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // root_item*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // context (CRLF header)* (CRLF request_body)?
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    if (!nextTokenIs(b, REQUEST_METHOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = context(b, l + 1);
    r = r && root_item_1(b, l + 1);
    r = r && root_item_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF header)*
  private static boolean root_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_item_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_item_1", c)) break;
    }
    return true;
  }

  // CRLF header
  private static boolean root_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    r = r && header(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF request_body)?
  private static boolean root_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_2")) return false;
    root_item_2_0(b, l + 1);
    return true;
  }

  // CRLF request_body
  private static boolean root_item_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    r = r && request_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (HTTP | HTTPS) SCHEME_SEPARATOR scheme_body
  public static boolean scheme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scheme")) return false;
    if (!nextTokenIs(b, "<scheme>", HTTP, HTTPS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEME, "<scheme>");
    r = scheme_0(b, l + 1);
    r = r && consumeToken(b, SCHEME_SEPARATOR);
    r = r && scheme_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // HTTP | HTTPS
  private static boolean scheme_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scheme_0")) return false;
    boolean r;
    r = consumeToken(b, HTTP);
    if (!r) r = consumeToken(b, HTTPS);
    return r;
  }

  /* ********************************************************** */
  // host port?
  public static boolean scheme_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scheme_body")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = host(b, l + 1);
    r = r && scheme_body_1(b, l + 1);
    exit_section_(b, m, SCHEME_BODY, r);
    return r;
  }

  // port?
  private static boolean scheme_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scheme_body_1")) return false;
    consumeToken(b, PORT);
    return true;
  }

}
