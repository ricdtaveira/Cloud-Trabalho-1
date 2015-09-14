<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt-BR">
  <head>
	<meta charset="utf-8">
  	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
	<meta http-equiv="Content-Language" content="pt-BR" >
	<meta name="language" content="PT_BR" >
  	
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Site do trabalho de Nuvem (2015.2)">
    <meta name="author" content="Yvens e Ricardo">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title>Computação em Nuvem</title>

    <link href="assets/css/hover_pack.css" rel="stylesheet">

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
    <link href="assets/css/colors/color-74c9be.css" rel="stylesheet">    
    <link href="assets/css/animations.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    
    <!-- JavaScripts needed at the beginning
    ================================================== -->
    <script type="text/javascript" src="http://alvarez.is/demo/marco/assets/js/twitterFetcher_v10_min.js"></script>
    
    <!-- Main Jquery & Hover Effects. Should load first -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="assets/js/hover_pack.js"></script>

  </head>

  <body>
	<div class="container">	

		<div class="row mt centered ">
			<div class="col-lg-4 col-lg-offset-4">
				<h3>Painel Principal</h3>
				<hr>
			</div>
		</div><!-- /row -->

		<div class="row mt">
			<div class="col-lg-4 col-md-4 col-xs-12 desc">
				<a class="b-link-fade b-animate-go" href="#"><img width="350" src="assets/img/datacenter/google-data-center-1920x1080-4-202240.jpeg" alt="" />
					<div class="b-wrapper">
					  	<h4 class="b-from-left b-animate b-delay03">Criar Instância</h4>
					  	<p class="b-from-right b-animate b-delay03">Criar novas instâncias na nuvem.</p>
					</div>
				</a>
				<p>Criar Instância</p>
				<hr-d>
			</div><!-- col-lg-4 -->
			
			<div class="col-lg-4 col-md-4 col-xs-12 desc">
				<a class="b-link-fade b-animate-go" href="#"><img width="350" src="assets/img/datacenter/google-datacenter-tech-03.jpg" alt="" />
					<div class="b-wrapper">
					  	<h4 class="b-from-left b-animate b-delay03">Listar Instâncias</h4>
					  	<p class="b-from-right b-animate b-delay03">Buscar uma lista atualizada das instâncias na nuvem.</p>
					</div>
				</a>
				<p>Listar Instâncias</p>
				<hr-d>
			</div><!-- col-lg-4 -->
			
			<div class="col-lg-4 col-md-4 col-xs-12 desc">
				<a class="b-link-fade b-animate-go" href="#"><img width="350" src="assets/img/datacenter/markleydc3.jpg" alt="" />
					<div class="b-wrapper">
					  	<h4 class="b-from-left b-animate b-delay03">Equipe</h4>
					  	<p class="b-from-right b-animate b-delay03">Informações sobre a equipe e o trabalho desenvolvido.</p>
					</div>
				</a>
				<p>Equipe</p>
				<hr-d>
			</div><!-- col-lg-4 -->
			
		</div><!-- /row -->
	</div><!-- /container -->
	
	<div id="f">
		<div class="container">
			<div class="row">
				<div class="col-lg-3">
					<h4>Universidade de Fortaleza</h4>
					<p>
						<i class="fa fa-mobile"></i> +55 4893.8943<br/>
						<i class="fa fa-envelope-o"></i> hello@yourdomain.com<br/>
						<i class="fa fa-mobile"></i> +55 4893.8943<br/>
						<i class="fa fa-envelope-o"></i> hello@yourdomain.com<br/>
					</p>
				</div>
				
			</div>
		</div><!-- /container -->
	</div><!-- /f -->
	
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/retina.js"></script>

  	<script>
		$(window).scroll(function() {
			$('.si').each(function(){
			var imagePos = $(this).offset().top;
	
			var topOfWindow = $(window).scrollTop();
				if (imagePos < topOfWindow+400) {
					$(this).addClass("slideUp");
				}
			});
		});
	</script>    
  
  </body>
</html>