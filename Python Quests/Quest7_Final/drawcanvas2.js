//Global variables for drawing the grid on a JS Canvas
var gXmax = 500;
var gYmax = 375;
var gGridsize = 20;
var gSpriteList = [];
class Sprite {
	constructor(team, x, y, dir, speed, weight) {
		this.team = team;
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.speed = speed;
		this.weight = weight;
	}
}

function drawGrid() {

	var b_canvas = document.getElementById("myCanvas");
	var ctx = b_canvas.getContext("2d");

	ctx.beginPath();

	for (var x = 0.5; x < gXmax; x += gGridsize) {
		ctx.moveTo(x, 0);
		ctx.lineTo(x, gYmax);
	}

	for (var y = 0.5; y < 375; y += gGridsize) {
		ctx.moveTo(0, y);
		ctx.lineTo(gXmax, y);
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
	ctx.moveTo(40, 40);
	ctx.lineTo(200, 200);
	ctx.strokeStyle = "#000";
	ctx.stroke();
	ctx.closePath();
}

function clearCanvas() {
	var b_canvas = document.getElementById("myCanvas");
	var ctx = b_canvas.getContext("2d");

	ctx.clearRect(0, 0, gXmax, gYmax);
}

function drawSprite(team, x, y, dir, speed, weight) {
	var b_canvas = document.getElementById("myCanvas");
	var ctx = b_canvas.getContext("2d");

	if (team == 1) ctx.fillStyle = 'rgb(200,0,0)';
	else ctx.fillStyle = 'rgb(0,0,200)';

	let x1 = x * gGridsize;
	let y1 = y * gGridsize;

	ctx.fillRect(x1, y1, gGridsize, gGridsize);

	//ctx = b_canvas.getContext("2d");
	ctx.fillStyle = 'rgb(0,0,0)';
	if (dir === 0) {
		ctx.fillRect(x1 + 6.5, y1, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 45) {
		ctx.fillRect(x1 + 13, y1, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 90) {
		ctx.fillRect(x1 + 13, y1 + 6.5, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 135) {
		ctx.fillRect(x1 + 13, y1 + 13, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 180) {
		ctx.fillRect(x1 + 6.5, y1+13, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 225) {
		ctx.fillRect(x1, y1 + 13, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 270) {
		ctx.fillRect(x1, y1+6.5, gGridsize / 3, gGridsize / 3);
	}
	if (dir === 315) {
		ctx.fillRect(x1, y1, gGridsize / 3, gGridsize / 3);
	}


}

function processForm() {

	var x = document.forms['frm1'].elements['x'].value;
	var y = document.forms['frm1'].elements['y'].value;
	var team = document.forms['frm1'].elements['team'].value;
	var dir = document.forms['frm1'].elements['dir'].value;
	var weight = document.forms['frm1'].elements['weight'].value;
	var speed = document.forms['frm1'].elements['speed'].value;
	character = new Sprite(team, x, y, dir, speed, weight);
	gSpriteList.push(character);
	drawSprite(team, x, y, dir, speed, weight);

}

function drawSpritesFromSpriteList() {

	// todo: draw all sprites in the sprite list
	for (let i = 0; i < gSpriteList.length; i++) {
		drawSprite(gSpriteList[i].team, gSpriteList[i].x, gSpriteList[i].y, gSpriteList[i].dir, gSpriteList[i].speed, gSpriteList[i].weight);
	}
}


function removeSpritesFromSpriteList() {
	gSpriteList = [];
	// todo: remove all sprites from global list
}

function init() {

	$.getJSON("gameinit.py", function (data, status) {
		// remove alerts in production code
		// use to test your code
		// alert("Data: " + data + "\nStatus: " + status);
		// alert(data[0].x);
		for (let i = 0; i < data.length; i++) {
			let a = new Sprite(data[i].team, data[i].x, data[i].y, data[i].dir, data[i].speed, data[i].weight);
			gSpriteList.push(a);
		}

		// todo: add sprites from JSON data array to spriteList


		// todo: draw all sprites in spriteList


	});

}

function tick() {
	gSpriteList = [];

	$.getJSON("gametick.py", function (data, status) {
		// remove alerts in production code
		// use to test your code
		// alert("Data: " + data + "\nStatus: " + status);
		// alert(data[0].x);
		for (let i = 0; i < data.length; i++) {
			let a = new Sprite(data[i].team, data[i].x, data[i].y, data[i].dir, data[i].speed, data[i].weight);
			gSpriteList.push(a);
		}

		// todo: add sprites from JSON data array to spriteList


		// todo: draw all sprites in spriteList


	});

}