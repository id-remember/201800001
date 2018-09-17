<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "exBean.studentDAO" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<jsp:useBean id="item" scope="page" class="exBean.studentVO">
 <jsp:setProperty name="item" property="*"/>
</jsp:useBean>
</html>
<%
 request.setCharacterEncoding("UTF-8");
 studentDAO dao = new studentDAO(); //사용자 객체 생성
 dao.insert(item);
%>