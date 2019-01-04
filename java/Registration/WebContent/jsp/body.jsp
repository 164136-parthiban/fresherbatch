<!DOCTYPE html>
<html>

	<head>
		<title>Body</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
		<link rel="stylesheet" href="/Registration/CSS/body.css">
		<style>
			.mySlides {display:none;}
		</style>
	</head>

	<body background="/Registration/images/background.jpg">

		

	<div class="images" style="max-width:100%" height="40%">
 		 <a href="#"><img class="mySlides" src="/Registration/images/sale1.jpg" style="width:100%"></a>
  		<a href="#"><img class="mySlides" src="/Registration/images/sale2.jpg" style="width:100%"></a>
		<a href="#"><img class="mySlides" src="/Registration/images/sale3.jpg" style="width:100%"></a>
</div>

		<script>
			var myIndex = 0;
			carousel();

			function carousel() {
    			var i;
   				 var x = document.getElementsByClassName("mySlides");
    			for (i = 0; i < x.length; i++) {
       				x[i].style.display = "none";  
    			}
    			myIndex++;
    			if (myIndex > x.length) {myIndex = 1}    
    			x[myIndex-1].style.display = "block";  
    			setTimeout(carousel, 2000); 
			}
		</script>

		<div class="row">
			<div class="column">
				<center><table >
					<tr>
					<td><a href="#"><img src="/Registration/images/menshoe.png" ></a></td>
					</tr>
					<tr>
					<td><h6><center><a href="#">Men's Section</a></h6></td>
					</tr> 
				</table></center>
			</div>

			<div class="column">
				<center><table>
					<tr>
					<td><a href="#"><img src="/Registration/images/womenshoe.png"></a></td>
					</tr>
					<tr>
					<td><h6><center><a href="#">Women's Section</a></h6></td>
					</tr> 
				</table></center>
			</div>
			
			<div class="column">
				<center><table>
					<tr>
					<td><a href="#"><img src="/Registration/images/kidshoe.jpg"></a></td>
					</tr>
					<tr>
					<td><h6><center><a href="#">Kid's Section</a></h6></td>
					</tr> 
				</table></center>
			</div>
	</div>

	</body>
</html>
