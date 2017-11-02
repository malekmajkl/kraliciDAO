<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>KRÁLÍKÁRNA</title>
  </head>
  <body>
  <jsp:include page="menu.jsp"></jsp:include>
  <jsp:include page="header.jsp"></jsp:include>
      <div align="center">
         
          <table border="1">
              <tr>
                <th>ID</th>
                <th>VERZE</th>
                <th>JMÉNO</th>
                <th>POHLAVÍ</th>
                <th>SRST</th>
              </tr>
              <c:forEach var="dept" items="${departments}" varStatus="status">
              <tr>
                  <td>${status.index + 1}</td>
                  <td>${dept.bunny}</td>
                  <td>${dept.name}</td>
                  <td>${dept.sex}</td>
                  <td>${dept.colour}</td>                            
              </tr>
              </c:forEach>                
          </table>
      </div>
  <jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>