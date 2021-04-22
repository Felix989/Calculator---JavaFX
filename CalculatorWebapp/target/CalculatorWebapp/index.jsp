<!--
<html>
    <head>
        <title>Calculator f(x) - Web Application</title>
    </head>
    <body>
        <div class = "calcDiv">
            <form action = "calc" method = "post">
                    <input type = "number" name = "firstNumber" required>
                    <input type = "string" name = "operator" required>
                    <input type = "number" name = "secondNumber" required>
                <p>
                    <input type = "submit" value = "=">
                </p>
            </form>
            <p><%= request.getAttribute("sum") %></p>
        </div>
    </body>
</html>

<style>
.calcDiv{
      color: darkslategrey;
      margin: auto;
      width: 50%;
      border: 3px solid green;
      padding: 10px;
}

</style>

-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <link rel="stylesheet" href="css/calc.css">
    <script src="js/calc.js"></script>
</head>
<body>
	<div>
		<header class = "screen"><%= request.getAttribute("current")%><br><%= request.getAttribute("sum")%></header>
		<table>

      			<tbody>
				<tr class="orange">
					<td onclick="clearScr()">AC</td>
          				<td onclick="sendNum('*0.01')">%</td>
          				<td onclick="sendNum('/')">/</td>
				</tr>
				<tr class="orange">
					<td onclick="sendNum('+')">+</td>
					<td onclick="sendNum('-')">-</td>
					<td onclick="sendNum('*')">x</td>
				</tr>
				<tr class = "nums">
                    <form action = "addChar" method = "post">
			    		<td onclick="sendNum('7')" name = "seven" >7</td>
                    </form>
                    <form action = "addChar" method = "post">
			    		<td onclick="sendNum('8')" name = "eight" >8</td>
                    </form>
                    <form action = "addChar" method = "post">
			    		<td onclick="sendNum('9')" name = "nine" >9</td>
                    </form>
				</tr>
				<tr class = "nums">
                    <form action = "addChar" method = "post">
					<td onclick="sendNum('4')"  name = "four" >4</td>
                    </form>
                    <form action = "addChar" method = "post">
					<td onclick="sendNum('5')"  name = "five" >5</td>
                    </form>
                    <form action = "addChar" method = "post">
					<td onclick="sendNum('6')"  name = "six" >6</td>
                    </form>
				</tr>
				<tr class = "nums">
                    <form action = "addChar" method = "post">
      					<td onclick="sendNum('1')"  name = "one" >1</td>
                    </form>
                    <form action = "addChar" method = "post">
					<td onclick="sendNum('2')"  name = "two" >2</td>
                    </form>
                    <form action = "addChar" method = "post">
					<td onclick="sendNum('3')"  name = "three" >3</td>
                    </form>
				</tr>
				<tr class = "nums">
      					<td onclick="sendNum('.')">.</td>
					<td onclick="sendNum('0')">0</td>
            <form action = "calc" method = "post">
					<td onclick="equalTo()" type = "submit" value = "Calculate" >=</td>
            </form>
				</tr>
			</tbody>
		</table>
	</div>


</body>

        <v align = "center" class = "calcDiv">
            <form action = "calc" method = "post">
                    <input type = "number" name = "firstNumber" required>
                    <input type = "string" name = "operator" required>
                    <input type = "number" name = "secondNumber" required>
                <p>
                    <input type = "submit" value = "Calculate">
                </p>
            </form>
        </v>
</html>

<style>
    div{
	background-color: #3f3b3b;
	margin: 50px;
	width: 350px;
	height: 550px;
	margin: 0 auto;			/* horizontally centreing an element */
	border-radius: 20px;
	padding: 10px;
    color: #3f3b3b;
}

header{
	background-color: #e7b3b3;
	width: 330px;
	height: 100px;
	border-radius: 20px;
	margin: 0 auto;
	font-size: xx-large;
	color: #000000;
	text-align: center;

}

table{
	background-color: #575151;
	margin: 0 auto;
	margin-top: 20px;
	margin-right: 10px;
	margin-left: 10px;
	border-radius: 20px;
}

td{
	width: 110px;
	height: 60px;
	text-align: center;
	font-size: xx-large;

}

.orange{
	color: #feb062;
}

td:active{
	background-color: #e7b3b3;
	border-radius: 20px;
}

.nums{
    color: white;
}
</style>
<script>
function sendNum(digit){

	num.push(digit);

	if(num.length != 1){
		a = '';
		document.getElementById('screen').innerHTML = a;		// clearing the screen.
	}


	for(i=0; i<num.length ; i++){

		a = a + num[i];				// concatenate the elements of the array "num" into a single string, which will be displayed on the screen

	}

document.getElementById('screen').innerHTML = a;	// displaying the concatenated string


}
</script>