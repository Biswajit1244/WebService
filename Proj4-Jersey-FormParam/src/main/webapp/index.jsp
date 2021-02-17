<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Enter Card Details</h2>
	<form action="rest/payment/obj" method="post">
		<pre>
		Card Number:<input type="text" name="cnum">
		Name on Card:<input type="text" name="name">
		CVV:<input type="password" size="4" maxlength="3" name="cvv">Amount:<input type="number" name="amt">
		Exp Date:<input type="text" name="exp">
		<input type="submit" value="PAY">
		</pre>
	</form>
</body>
</html>