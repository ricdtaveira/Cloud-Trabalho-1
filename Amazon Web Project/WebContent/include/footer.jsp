<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div id="f">
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<h4>Universidade de Fortaleza</h4>
				<p>
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