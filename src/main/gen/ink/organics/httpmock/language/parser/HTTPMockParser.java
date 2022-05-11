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

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // METHOD URI HTTP_VERSION?
  public static boolean context(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "context")) return false;
    if (!nextTokenIs(builder_, METHOD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, METHOD, URI);
    result_ = result_ && context_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONTEXT, result_);
    return result_;
  }

  // HTTP_VERSION?
  private static boolean context_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "context_2")) return false;
    consumeToken(builder_, HTTP_VERSION);
    return true;
  }

  /* ********************************************************** */
  // HEADER_NAME ':' HEADER_VALUE
  public static boolean header(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header")) return false;
    if (!nextTokenIs(builder_, HEADER_NAME)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, HEADER, null);
    result_ = consumeTokens(builder_, 2, HEADER_NAME, COLON, HEADER_VALUE);
    pinned_ = result_; // pin = 2
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // 'data'
  public static boolean request_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "request_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REQUEST_BODY, "<request body>");
    result_ = consumeToken(builder_, "data");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // root_item*
  static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!root_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "root", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // context (CRLF header)* (CRLF request_body)?
  static boolean root_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_item")) return false;
    if (!nextTokenIs(builder_, METHOD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = context(builder_, level_ + 1);
    result_ = result_ && root_item_1(builder_, level_ + 1);
    result_ = result_ && root_item_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (CRLF header)*
  private static boolean root_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_item_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!root_item_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "root_item_1", pos_)) break;
    }
    return true;
  }

  // CRLF header
  private static boolean root_item_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_item_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CRLF);
    result_ = result_ && header(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (CRLF request_body)?
  private static boolean root_item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_item_2")) return false;
    root_item_2_0(builder_, level_ + 1);
    return true;
  }

  // CRLF request_body
  private static boolean root_item_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_item_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CRLF);
    result_ = result_ && request_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
