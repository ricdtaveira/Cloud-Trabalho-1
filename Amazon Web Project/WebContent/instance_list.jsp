<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt-BR">
 
<jsp:include page="include/header.jsp" />

 <body>
	<div class="container">	

		<div class="row mt centered ">
			<div class="col-lg-4 col-lg-offset-4">
				<h3>Lista de Instâncias</h3>
				<hr>
			</div>
		</div><!-- /row -->

	<form action="InstanceFormServlet" method="POST">

    <c:forEach var="instance" items="${instances}">  
		<h4><c:out value="${instance.id}"/></h4>
   		<p>
   			<c:out value="${instance.imageId}"/>
   			<c:out value="${instance.status}"/>
   		</p>
	</c:forEach>
		
	</form>
    </div>
	
	<jsp:include page="include/footer.jsp" />
  
  </body>
</html>