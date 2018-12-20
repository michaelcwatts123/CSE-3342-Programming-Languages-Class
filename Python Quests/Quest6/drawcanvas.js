//Global variables for drawing the grid on a JS Canvas
var gXmax 		= 500;
var gYmax 		= 375;
var gGridsize 	= 20;

function draw() {

	 var b_canvas = document.getElementById("myCanvas");
	 var ctx = b_canvas.getContext("2d");

	 ctx.beginPath();

	 for (var x = 0.5; x < gXmax; x+=gGridsize) {
	 	ctx.moveTo(x,0);
	 	ctx.lineTo(x,gYmax);
	 }

	 for (var y = 0.5; y < 375; y+=gGridsize) {
	 	ctx.moveTo(0,y);
	 	ctx.lineTo(gXmax,y);
	 }
	 ctx.strokeStyle = "#e2e";
	 ctx.stroke();
	 ctx.closePath();

	 console.log("Grid drawn");
}

function drawLine() {
	var b_canvas = document.getElementById("myCanvas");
	var ctx = b_canvas.getContext("2d");

	 ctx.beginPath();
	 ctx.moveTo(40,40);
	 ctx.lineTo(200,200);
	 ctx.strokeStyle = "#000";
	 ctx.stroke();
	 ctx.closePath();
}

function drawSprite(team, x, y, dir) {
     var b_canvas = document.getElementById("myCanvas");
	 var ctx = b_canvas.getContext("2d");

     // todo: modify so team1 = blue and team2 = red
	 ctx.fillStyle= 'rgb(200,0,0)';

	 // todo: modify so a rectangle appears at appropriate x,y position
	 ctx.fillRect(10,10, gGridsize, gGridsize);
}

function processForm() {
	// todo: rewrite so form data is used to create new sprite
	//       add to spritelist and display
    var text = "";

    // obtain values from the web form
    var x = document.forms['frm1'].elements['x'].value;
    var y = document.forms['frm1'].elements['y'].value;

    // add values to text string
    text += "x=" + x + " y=" + y

    // update web page element id='demo'
    document.getElementById("demo").innerHTML = text;
}

