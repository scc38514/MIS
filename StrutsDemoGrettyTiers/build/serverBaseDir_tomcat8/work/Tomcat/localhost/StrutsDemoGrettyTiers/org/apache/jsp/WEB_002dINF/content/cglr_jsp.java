/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-12-19 08:36:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.dao.ItemsDAO;
import java.util.ArrayList;

public final class cglr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("cn.edu.cumt.ec.entity.Items");
    _jspx_imports_classes.add("cn.edu.cumt.ec.dao.ItemsDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>采购录入</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"jquery,ui,easy,easyui,web\">\r\n");
      out.write("\t<meta name=\"description\" content=\"easyui help you build your web page easily!\">\r\n");
      out.write("\t<title>jQuery EasyUI Demo</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.w3cschool.cc/try/jeasyui/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.w3cschool.cc/try/jeasyui/themes/icon.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://www.w3cschool.cc/try/jeasyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>请录入今日采购消息</h1>\r\n");
      out.write("\r\n");
      out.write("<form action=\"CAIGOU\" method=\"get\">\r\n");
      out.write("\t<table id=\"tt\"  style=\"width:1200px;height:250px\"\r\n");
      out.write("\t\t\ttitle=\"后台管理\" \r\n");
      out.write("\t\t\ttoolbar=\"#tb\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th  width=\"80\">产品名称</th>\r\n");
      out.write("\t\t\t\t<th  width=\"80\">进货数量</th>\r\n");
      out.write("\t\t\t\t<th width=\"80\" align=\"center\">进货单价</th>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td  width=\"80\">\r\n");
      out.write("\t\t\t\t<input class=\"easyui-textbox\" name=\"SCMC\" data-options=\"prompt:'请注意商品ID为主键不可重复！'\" style=\"width:100%;height:35px\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td  width=\"80\">\r\n");
      out.write("\t\t\t\t<input class=\"easyui-textbox\" name=\"JHSL\" style=\"width:100%;height:35px\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td  width=\"80\" align=\"right\">\r\n");
      out.write("\t\t\t\t<input class=\"easyui-textbox\" name=\"JHDJ\" style=\"width:100%;height:35px\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div id=\"tb\">\r\n");
      out.write("\t<input type=\"submit\" value=\"录入\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
