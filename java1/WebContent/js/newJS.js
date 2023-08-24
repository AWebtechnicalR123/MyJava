/**
 * alert("In Head");
 */

console.log("in my head console");
x="Hello World";
y=new Date();
z=x + " today is "+ y;
//document.write(x+ + " today is ")
//document.getElementsByName("lbl1")[0].innerText="Name " +z;

function validate(){
	submit=true;
	
	if (document.getElementsByName("fname")[0].value==""){
		submit=false;
		//console.log(document.getElementsByName("fname")[0].value);
		//document.getElementsByName("fname")[0].value="First Name can't be null";
		console.log("Before fname");
		document.getElementsByName("fname")[0].focus;
		document.getElementsByName("errFname")[0].innerText="Radio box can't be null";
		document.getElementsByName("fname")[0].style.border= "1px solid red";
		//alert("cant'b emoty");
		
		
	}
	
	if(!document.getElementsByName("gender")[0].checked) {
		if(document.getElementsByName("gender")[1].checked){
			submit=false;
			document.getElementsByName("errRd")[0].innerHTML="Select a radio btn for gender";
			document.getElementsByName("errRd")[0].style="{color:red}";
			
			document.getElementsByName("gender")[0].style.border="1px solid red";
			//console.log(document.getElementsByName("gender")[0].checked || document.getElementsByName("gender")[1].checked);
			console.log("hi");
		}
	}
	return submit;
}


//Asynchronous function
y1="Blank";

function echo(){ //dummy mfunction
	y1= "Echo msg";
	console.log(y1);
}


function printMsg(yparam){
	console.log(yparam);
	
}

function callerFunction(x){ //callback function
	setTimeout(echo,3000); //300 0mili seconds
	x(y1);
	return y1;
}

//echo()
printMsg("via message");
callerFunction(printMsg);


//promises
function successHand(){
	console.log("Success");
}
function errHand(){
	console.log("Error");
}

pmf=function(sh,eh){
	x=1;
	if(x==0){sh();};
	if(x!=0){eh();};
};

pm=new Promise(pmf);
pm.then(
	function(){console.log("Success");},
	function(){console.log("Error");}
);
pm2= new Promise(callerFunction);
pm.then(successHand,errHand);

//Async function
async function checkPromiseAwait(){
	let y = await pm2;
	console.log("pm2 "+y);
}
checkPromiseAwait();
