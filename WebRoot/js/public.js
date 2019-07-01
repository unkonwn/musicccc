var script = document.createElement("script");
script.type = "text/javascript";
script.src = "jquery-2.1.0.js"

document.getElementsByTagName('head')[0].appendChild(script);

var currentSong = 0
var songList = [
	'My%20Sunshine.mp3',
	'0312943ea3d8cba0b6bc8f64e4478759.mp3',
	'只要平凡.mp3',
	'微笑着胜利（庆祝建军91周年网宣主题曲）.mp3'
]



$(document).ready(function() {

	$("#lastSong").click(function () {
		if (currentSong === 0)
			currentSong = songList.length -1
		else
			currentSong--;
		$("#audio")[0].pause()
		$("#audio").attr("src",songList[currentSong]);
		$("#audio")[0].play()

	})

	$("#nextSong").click(function () {
		if (currentSong === songList.length - 1)
			currentSong = 0
		else
			currentSong++;
		$("#audio")[0].pause()
		$("#audio").attr("src",songList[currentSong]);
		$("#audio")[0].play()

	})

	$("#login").click(function() {
		$("#btn_loginOrRe").text("登录")
		$("#confirmPwd").remove()
	})
	$("#register").click(function() {
		$("#btn_loginOrRe").text("注册")
		var formGroup = '<div class="form-group" id="confirmPwd">' +
			'<label for="message-text" class="control-label">确认密码:</label>' +
			'<input type="text" class="form-control" id="message-text"/>' +
			'</div>'

		if($(".modal-body").find("form").children().length < 3)
			$(".modal-body").find("form").append(formGroup)
	})


	$("#mouseBlock").mouseover(
		function(){
			$("#playerBar").stop(true).animate({
				height:'50px'
			},1000)
		}
	);

	$("#playerBar").mouseleave(
		function(){
			$("#playerBar").stop(true).animate({
				height:'0px'
			},1000)
		}
	);


});