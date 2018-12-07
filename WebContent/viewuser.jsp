
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.ashna.util.UserDao,com.ashna.util.User,java.util.*"%>

  
<h1>Users List</h1>  
 <%--  
  <%  
// retrieve your list from the request, with casting 
ArrayList<User> list = (ArrayList<User>) request.getAttribute("UserDao");

// print the information about every category of the list
for(User category : list) {
    out.println(category.getName());
    out.println(category.getPassword());
}
%>
  <form action="">
					
							<c:if test="${empty msg}">
	
	</c:if>
							<c:if test="${!empty msg }">
							<table>
							  <tbody>
								<c:forEach items="${msg}" var="list">
								<tr>
									<td>${list.getFlightName()}</td>
									<td>${list.departure}</td>
									
									
									
								</tr>
								</c:forEach>
							  </tbody>
							</table>
							</c:if>
						</div>
					</div>
				</form>
  
  
   --%>
  
  
 <%  
List<User> list=UserDao.getAllRecords();  
System.out.println(list);
request.setAttribute("list",list);  
%>   
  
<table border="1" width="90%">  
<tr><th>name</th><th>password</th><th>email</th><th>sex</th><th>country</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getName()}</td><td>${u.getPassword()}</td><td>${u.getEmail()}</td><td>${u.getSex()}</td><td>getCountry</td></tr>  
</c:forEach>  
</table>  
 
  


</body>
</html>