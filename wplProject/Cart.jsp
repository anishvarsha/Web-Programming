<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="no-js" lang="en">
<head>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>Foundation | Welcome</title>
<link rel="stylesheet" href="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
<link href='http://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<style>
#cart{
	width: 70%;
	margin: 0 auto;
	height: 500px;
	overflow: hidden;
	border-collapse: collapse;
	border-left: 1px solid #d0d0d0;
	border-right: 1px solid #d0d0d0;
}
#cart #header{
	background-color:#fcfcfa;
	height: 8%;
	position: relative; 
}
#header p {
   position: absolute;            
   top: 50%;                         
   transform: translate(0, -50%);
   padding:1rem;
   font-weight:bold;
}
   
#cart #item-list{
	height: 74%;
	overflow-y: auto;
}
#cart #amount{
	background-color:#eeeeee;
	height: 10%;
}
#amount p {
   font-weight:bold;
   text-align:right;
   padding: 0.8rem 2rem;
}

#cart #place-order{
	background-color:#000000;
	margin: 0 auto;
	height: 8%;
}
#cart td{
	height: 90px;
}
table {
    border-collapse: collapse;
    border-style: hidden;
}
table td{
    background-color:#ffffff;
	border-bottom: 1px solid #d0d0d0;
	border-left: 1px solid #e2e2e2;
	text-align:center;
	position: relative;
	padding: 1rem 1rem 1rem 1rem;
}
table th {
	background-color:#eeeeee;
	border-bottom: 1px solid #d0d0d0;
	border-left: 1px solid #e2e2e2;
}
#place-order #button1 .button{
	display: block;
	width:50%;
	float: left;
	height:100%;
	background-color: rgb(43,155,229);
	font-size: 20px;
}
#place-order #button2 .button{
	display: block;
	float: left;
	width:50%;
	border-left: 1px solid #ffffff;
	height:100%;
	font-size: 20px;
}
.button.expanded{
	height:100%;
}
#cart-image{
	padding: 0rem 1rem;
}
#qty{
	width:25px;
	height:25px;
	padding:2px;
	margin : 0 auto;
	text-align:center;
}
#product_name{
	text-align:left;
	vertical-align:top;
}
#remove{
	position: absolute;
    bottom: 0.2rem;
    right: 0.5rem;
}
</style>

</head>
<body style="background-color: #c1bdba ">

<div class="top-bar" style="background: #c1bdba;">
	<div class="top-bar-left" style="background: #c1bdba;">
		<ul class="menu" style="background: #c1bdba;">
			<li class="menu-text">Company Name</li>
		</ul>
	</div>
	<div class="top-bar-right" style="background: #c1bdba;">
		<ul class="menu" style="background: #c1bdba;">
			<li><input type="search" style="height:30px; width:300px;" placeholder="Search"></li>
			<li><button type="button" class="buttonSearch" style="height:30px; line-height:0.3rem;background-color: rgb(43,155,229); padding: 10px;" >Search</button></li>
			<li>
				<form action="profileDetailsAfterLogin.jsp" method="post">
					<button id="" class="button" type="submit"  style="height:30px; line-height:0.3rem;width:160px; background-color: rgb(43,155,229); padding: 10px;margin-left: 10px;">Profile Details
      				</button>
      			</form>
			</li>
      		<li>
      			<form action="cartAfterLogin.jsp" method="post">
      				<button id="" class="button" type="submit"  style="height:30px; line-height:0.3rem;width:80px; background-color: rgb(43,155,229); padding: 10px;">Cart
      			</button>
      			</form>
      		</li>
		</ul>
	</div>
</div>

<div id="cart">
	<div id="header">
		<p>YOUR CART</p>
	</div>
	<div id="item-list">
		<table width="100%">
			<colgroup>
				<col width="10%">
				<col width="45%">
				<col width="10%">
				<col width="15%">
				<col width="15%">
			</colgroup>
			<tr>
				<th colspan="2">ITEM</th>
				<th>QTY</th>
				<th>PRICE</th>
				<th>SUBTOTAL</th>
			</tr>
			
			<%
			int count= (Integer)request.getAttribute("count");
			String userId=(String)request.getAttribute("USERID");
			String itemId=(String)request.getAttribute("ITEM_ID");
			String Item_Name=(String)request.getAttribute("ITEM_NAME");
			String quantity=(String)request.getAttribute("Quantity");
			String price=(String)request.getAttribute("Price");
			
			
			%>
			<%
			for(int i=0;i<count;i++)
			System.out.println("<tr><td style='padding:0;'></td><td id="+Item_Name+"><div id='remove'><form method='post' action='Cartremoveserv'><input type='hidden' value=userId name='userId'/><input type='hidden' value=itemId name='itemId'/><input type='submit'value='Remove' /></form></div></td><td><input id='qty' type='text'/>"+quantity+"</td></tr>");
			
			
			
			
			
			%>
			
			
			
		</table>
	</div>
	<div id="amount">
		<p>Amount Payable : N/A</p>
	</div>
	<div id="place-order">
		<div id="button1">
			<a type="submit" class="button expanded" style="background-color:">< CONTINUE SHOPPING</a>
		</div>
		<div id="button2">
			<a type="submit" class="button expanded">PLACE ORDER</a>
		</div>
	</div>
</div>

<div class="callout secondary">
	<div class="row">
		<div class="large-4 columns">
			<h5>Heading 5</h5>
			<p>Lorem ipsum dolor sit amet, pri ea vidisse delicatissimi. Nam mucius sadipscing te, et commodo utroque qui. Dolore blandit appetere id nec, ei veniam omnesque vis. Dicat tation molestie his ei. Mei adversarium instructior interpretaris eu, eu cum malis dolorum voluptatibus.</p>
		</div>
		<div class="large-3 large-offset-2 columns">
			<ul class="menu vertical">
				<li><a href="#"><p style="font-weight:bold;">COMPANY NAME</p></a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Contact Us</a></li>
				<li><a href="#">Careers</a></li>
			</ul>
		</div>
		<div class="large-3 columns">
			<ul class="menu vertical">
				<li><a href="#"><p style="font-weight:bold;">HELP</p></a></li>
				<li><a href="#">FAQ</a></li>
				<li><a href="#">Cancellation & Returns</a></li>
				<li><a href="#">Gift Cards</a></li>

			</ul>
		</div>
	</div>
</div>

<script src="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
<script>
      $(document).foundation();
</script>
<script type="text/javascript" src="https://intercom.zurb.com/scripts/zcom.js"></script>
</body>
</html>
