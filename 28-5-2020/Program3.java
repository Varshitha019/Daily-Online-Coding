3.Write jsp code to display today’s date and time using expression tag


<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<html>
   <head>
      <title>Display Current Date &amp; Time</title>
   </head>
    <body>
      <center>
         <h1>Display Current Date &amp; Time</h1>
      </center>
      <%
         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      %>
   </body>
</html>
