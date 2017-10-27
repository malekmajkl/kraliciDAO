<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>Department List</title>
  </head>
  <body>
      <div align="center">
          <h1>Usaci usati</h1>
          <table border="1">
              <tr>
                <th>ID</th>
                <th>BUNNY</th>
                <th>NAME</th>
                <th>SEX</th>
              </tr>
              <c:forEach var="dept" items="${departments}" varStatus="status">
              <tr>
                  <td>${status.index + 1}</td>
                  <td>${dept.bunny}</td>
                  <td>${dept.name}</td>
                  <td>${dept.sex}</td>                            
              </tr>
              </c:forEach>                
          </table>
      </div>
  </body>
</html>