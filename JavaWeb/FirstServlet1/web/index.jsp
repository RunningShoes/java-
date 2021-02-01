<%--
  Created by IntelliJ IDEA.
  User: yichiban
  Date: 2021/1/28
  Time: 12:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="good.jsp"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  default ha
  <table>
  <%
    for(int i=0;i<20;i++) {
      out.println("<tr>");
      out.println("<td>"+i+"</td>");
      out.println("</tr>");
    }

  %>
    <%
      for(int i=0;i<100;i++){
    %>
        <h1><%=i %>是哈哈%></>
<%
      }
%>
  </table>
  </body>
</html>
