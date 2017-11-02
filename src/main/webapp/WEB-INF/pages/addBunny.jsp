<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Add Bunny</title>
   </head>
   <body>
    
      <jsp:include page="header.jsp"></jsp:include>
     
       
      <h3>Přidání Králíka</h3>
       
     
       
      <form method="POST" action="${pageContext.request.contextPath}/addBunny">
         <table border="1">
            <tr>
               <td>Verze</td>
               <td><input type="text" name="bunny" value="${dept.bunny}" /></td>
            </tr>
            <tr>
               <td>Jméno</td>
               <td><input type="text" name="name" value="${dept.name}" /></td>
            </tr>
            <tr>
               <td>Pohlaví</td>
               <td><input type="text" name="sex" value="${dept.sex}" /></td>
            </tr>
            <tr>
               <td>Srst</td>
               <td><input type="text" name="colour" value="${dept.colour}" /></td>
            </tr>
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
                   <a href="/">Cancel</a>
               </td>
            </tr>
         </table>
      </form>
       
      <jsp:include page="footer.jsp"></jsp:include>
       
   </body>
</html>