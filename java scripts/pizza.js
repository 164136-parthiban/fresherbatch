function keepCount(){
var newcount=0;
if (document.calc.extraCheese.checked){
newcount +=1;
}
if (document.calc.pepperoni.checked){
newcount +=1;
}
if (document.calc.olives.checked){
newcount +=1;
}
if (document.calc.pepper.checked){
newcount +=1;
}
if (document.calc.bacon.checked){
newcount +=1;
}
if (document.calc.tomatoes.checked){
newcount +=1;
}
if (document.calc.mushrooms.checked){
newcount +=1;
}

if(newcount==3){
alert("You have already selected two toppings!!");
document.calc; return false;
}
}

function enSummary(){
document.getElementById('ss').disabled = false;

}

function getSummary(){
var lines = ["<form name='calc'><table class='summary'>",
"<tr>",
"<th>NAME: </th>",
"<td class='intd'><input type = 'text' name = 'txt1' id = 'txt1' class='intab'/></td>",
"</tr>",
"<tr>",
"<th>EMAIL:</th>",
"<td class='intd'><input type = 'text' name = 'txt2' id = 'txt2'  class='intab'/></td>",
"</tr>",
"<tr>",
"<th>ADDRESS:</th>",
"<td class='intd'><input type = 'text' name = 'txt3' id = 'txt3'  class='intab'/></td>",
"</tr>",
"<tr>",
"<th>TOPPINGS</th>",
"<td class='intd'></td>",
"</tr>",
"<tr>",
"<th>TOPPING1</th>",
"<td class='intd'><input type = 'text' name = 'txt4' id = 'txt4'  class='intab'/></td>",
"</tr>",
"<tr>",
"<th>TOPPING2</th>",
"<td class='intd'><input type = 'text' name = 'txt5' id = 'txt5'  class='intab'/></td>",
"</tr>",
"<tr>",
"<th>DELIVERY:</th>",
"<td class='intd'><input type = 'text' name = 'txt6' id = 'txt6'  class='intab'/></td>",
"</tr>",
"<tr>",
"<th>TIP AMOUNT:</th>",
"<td class='intd'><input type = 'text' name = 'txt7' id = 'txt7'  class='intab'/></td>",
"</tr>",
"<tr>",
"<th>TOTAL</th>",
"<td class='intd'><input type = 'text' name = 'txt8' id = 'txt8'  class='intab'/></td>",
"</tr>",
"</table></form>"].join('');
document.getElementById('d').innerHTML = lines;

var x = document.getElementById('userid').value;
document.getElementById('txt1').value = x;

var x = document.getElementById('emailid').value;
document.getElementById('txt2').value = x;

var x = document.getElementById('address').value;
document.getElementById('txt3').value = x;

var x = document.getElementById('userid').value;
document.getElementById('txt4').value = x;

var x = document.getElementById('userid').value;
document.getElementById('txt5').value = x;

var x = document.getElementById('userid').value;
document.getElementById('txt6').value = x;

var x = document.getElementById('userid').value;
document.getElementById('txt7').value = x;

var x = document.getElementById('userid').value;
document.getElementById('txt8').value = x;
}