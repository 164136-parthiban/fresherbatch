<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%
MultipartRequest m = new MultipartRequest(request, "d:/new");
        out.print("successfully uploaded");

%>