<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt-BR">
 
<jsp:include page="include/header.jsp" />

 <body>
	<div class="container">	

		<div class="row mt centered ">
			<div class="col-lg-4 col-lg-offset-4">
				<h3>Instanciar Novo Dispositivo</h3>
				<hr>
			</div>
		</div><!-- /row -->

	<form action="InstanceFormServlet" method="POST">
		<div id="white">
		    <div class="container">
		    	<div class="row mt">
		    		<div class="col-lg-4">
		    			<p class="capitalize">1</p>
		    			<h4>Escolha a Imagem</h4>
		    			<p>Adicionar combo box de imagens.</p>
		    		</div>
		    		<div class="col-lg-4">
		    			<p class="capitalize">2</p>
		    			<h4>Informações</h4>
		    			<p>Tabela com as informações da imagem.</p>
		    		</div>
		    		<div class="col-lg-4">
		    			<p class="capitalize">3</p>
		    			<h4>Instanciar</h4>
		    			<p>Botão!</p>
		    		</div>    	
		
		    	</div><!-- /row -->
		    </div><!-- /container -->
   		</div><!-- /white -->
	</form>
    </div>
	
	<jsp:include page="include/footer.jsp" />
  
  </body>
</html>