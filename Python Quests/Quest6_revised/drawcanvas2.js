//Global variables for drawing the grid on a JS Canvas
var gXmax 		= 500;
var gYmax 		= 375;
var gGridsize 	= 20;
var gSpriteList = [];

function drawGrid() {

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

function clearCanvas() {
	var b_canvas = document.getElementById("myCanvas");
	var ctx = b_canvas.getContext("2d");

	ctx.clearRect(0, 0, gXmax,gYmax);
}

function drawSprite(team, x, y, dir) {
     var b_canvas = document.getElementById("myCanvas");
	 var ctx = b_canvas.getContext("2d");

	 if (team == 1) ctx.fillStyle= 'rgb(200,0,0)';
	 else ctx.fillStyle= 'rgb(0,0,200)';

	 x = x*gGridsize;
	 y = y*gGridsize;

	 ctx.fillRect(x,y, gGridsize, gGridsize);
}

function processForm() {

    var x = document.forms['frm1'].elements['x'].value;
    var y = document.forms['frm1'].elements['y'].value;
    todo: extract other data from form, add to spritelist and draw
}

function drawSpritesFromSpriteList() {

	todo: draw all sprites in the sprite list
}


function removeSpritesFromSpriteList() {

	todo: remove all sprites from global list
}


