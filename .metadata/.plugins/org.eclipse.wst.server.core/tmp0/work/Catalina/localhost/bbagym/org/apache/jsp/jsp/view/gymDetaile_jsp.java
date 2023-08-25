/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-08-25 05:53:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gymDetaile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/jsp/view/../../footer.jsp", Long.valueOf(1692942767997L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>gymDetaile</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/view/gymDetaile.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"/img/로고.png\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/acf4f592bf.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=f7b0b1985a949546c083ca5f1006cb88&libraries=services,clusterer,drawing\"></script>\r\n");
      out.write("    <!-- 카카오API 맵을 이용하기 위해 KEY를 받아서 불러옴 -->\r\n");
      out.write("    <script defer src=\"../../js/view/gymDetaile.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"img-container\"><img src=\"img_cuj/1.png\" alt=\"\" id=\"main-img\"></div><!--메인 이미지를 담은 영역-->\r\n");
      out.write("        <div class=\"title-container\"><!--제목 및 주소, 가격을 담을 div영역-->\r\n");
      out.write("            <div class=\"title\">중화 복싱 체육관</div>\r\n");
      out.write("            <div class=\"addr-price\">\r\n");
      out.write("                <div class=\"addr\" id=\"addr\">서울특별시 중랑구 동일로 811, 2층</div>\r\n");
      out.write("                <div class=\"price\">67,500원/월</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!--title-container 끝-->\r\n");
      out.write("\r\n");
      out.write("        <hr><!--밑줄 경계선을 추가하여 구분-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\"><!--소개내용을 담을 div영역-->\r\n");
      out.write("            \r\n");
      out.write("<pre>왜 중화복싱체육관을 다녀야할까요?\r\n");
      out.write("\r\n");
      out.write("1. \"중랑구 통틀어 최고의 시설!\"\r\n");
      out.write("\r\n");
      out.write("2. \"개개인들의 1:1 교육을 원칙으로 확실한 운동법 전수!\"\r\n");
      out.write("\r\n");
      out.write("3. \"2층은 복싱연습장 3층은 헬스장으로 다양한 운동 가능!\"\r\n");
      out.write("\r\n");
      out.write("확실한 운동방법으로 다이어트를 책임져 드립니다\r\n");
      out.write("지금 바로 중화복싱체육관으로 빠짐하세요!</pre>            \r\n");
      out.write("        </div><!--content 끝-->\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"title-container notice\"><!--공지사항을 담을 div영역-->\r\n");
      out.write("            <div class=\"subTitle\">공지사항</div>\r\n");
      out.write("            <div class=\"notice-content\">\r\n");
      out.write("<pre>빠짐 페이지에서만 가능한 알림\r\n");
      out.write("\r\n");
      out.write("- 3개월 선착순 10명 할인 혜택\r\n");
      out.write("- 6개월 선착순 10명 할인 혜택\r\n");
      out.write("- 12개월 선착순 10명 할인 혜택\r\n");
      out.write("\r\n");
      out.write("정원 초과 시 이벤트가 종료될 수 있습니다</pre>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!--notice 끝-->\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"title-container time\"><!--운영시간을 담을 div영역-->\r\n");
      out.write("            <div class=\"subTitle\">운영시간</div>\r\n");
      out.write("            <div class=\"time-content\">\r\n");
      out.write("<pre>[평일] 10:00 ~ 23:00\r\n");
      out.write("[주말] 10:00 ~ 18:00\r\n");
      out.write("[공휴일] 10:00 ~ 18:00</pre></div>\r\n");
      out.write("        </div><!--time 끝-->\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"com-container\">\r\n");
      out.write("            <button id=\"comm-btn\">댓글 확인&nbsp;<i class=\"fa-solid fa-sort-down\" style=\"color: #000000;\" id=\"down\"></i><i class=\"fa-solid fa-sort-up\" style=\"color: #000000;\" id=\"up\"></i></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"comm-none\">\r\n");
      out.write("            <div class=\"comments\">\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <div id=\"rm\">                \r\n");
      out.write("                        <div><button id=\"ud-btn\">수정</button></div>\r\n");
      out.write("                        <div><button id=\"rm-btn\">삭제</button></div>                \r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"view-id\">\r\n");
      out.write("                    <div>아이디가 나오는 부분</div>\r\n");
      out.write("                    <div><button type=\"button\" id=\"comments-btn\"><i class=\"fa-solid fa-ellipsis-vertical\" style=\"color: #000000;\"></i></button></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"view-content\">내용이 나오는 부분</div>\r\n");
      out.write("                <div class=\"view-time\">작성일시가 나오는 부분</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"comments\">\r\n");
      out.write("                <form>              \r\n");
      out.write("                    <div class=\"view-id\">아이디가 나오는 부분</div>\r\n");
      out.write("                    <div class=\"com-write\"><textarea name=\"\" id=\"comment-write\" cols=\"30\" rows=\"10\" placeholder=\"궁금하신 내용을 댓글로 달아주세요\"></textarea></div>\r\n");
      out.write("                    <div class=\"com-btn\"><button id=\"btn\">등록</button></div>\r\n");
      out.write("                </form>            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- <div class=\"title-container place\">위치를 담을 div영역\r\n");
      out.write("            <div class=\"subTitle\">위치</div>\r\n");
      out.write("            <div class=\"sub-place\"><img src=\"img_cuj/2.png\" alt=\"\" id=\"place-img\"></div>\r\n");
      out.write("        </div>place 끝 -->\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"title-container place\"><!--위치를 담을 div영역-->\r\n");
      out.write("            <div class=\"subTitle\">위치</div>\r\n");
      out.write("            <div class=\"sub-place\" id=\"map\"></div>\r\n");
      out.write("        </div><!--place 끝-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"btn-container\">\r\n");
      out.write("            <button class=\"last-btn\" type=\"submit\" value=\"수정\" id=\"update\">수정</button>\r\n");
      out.write("            <button class=\"last-btn\" type=\"submit\" value=\"삭제\" id=\"delete\">삭제</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div><!--container 끝-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>footer</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://localhost:8888/bbagym/css/footer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"footer_full_div\"><!--footer-->\r\n");
      out.write("        <div class=\"footer1\"> <!--footer div1-->\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"http://localhost:8888/bbagym/img/로고.png\" style=\"margin-bottom: 10px;\"></div>\r\n");
      out.write("                <div class=\"name\">살빼조</div>\r\n");
      out.write("                <div>서울특별시 노원구 상계로1길 </div>\r\n");
      out.write("                <div>장민지|이종민|최욱진|나윤찬|박민규</div>\r\n");
      out.write("                <div>이메일 : bbagym@gmail.com | 사업 및 제휴문의 : bbagym@gmail.com</div>\r\n");
      out.write("                <div class=\"personal\"><a href=\"https://www.law.go.kr/LSW/lsInfoP.do?efYd=20200805&lsiSeq=213857#0000\">개인정보방침</div></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer2\"><!--footer div2-->\r\n");
      out.write("            <div class=\"sns\">\r\n");
      out.write("                <a href=\"https://blog.naver.com/dagymapp\" target=\"_blank\">\r\n");
      out.write("                    <img src=\"http://localhost:8888/bbagym/img/네이버블로그.png\" width=\"32\" height=\"32\">\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"sns\">\r\n");
      out.write("                <a href=\"https://www.instagram.com/dagym_app\" target=\"_blank\">\r\n");
      out.write("                    <img src=\"http://localhost:8888/bbagym/img/인스타.png\" width=\"32\" height=\"32\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"sns\">\r\n");
      out.write("                <a href=\"https://www.facebook.com/dagym0101\" target=\"_blank\">\r\n");
      out.write("                    <img src=\"http://localhost:8888/bbagym/img/페이스북.png\" width=\"32\" height=\"32\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!--footer 끝-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
