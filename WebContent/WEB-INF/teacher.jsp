<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>teacher管理</title>
<link rel="stylesheet" type="text/css" href="./css/all.css"/>
<style type="text/css">
</style>
<style type="text/css">
/* 偶数 */
tr:nth-child(odd) {
	background: white;
}
/* 奇数 */
		tr:nth-child(even) {
	background: #ddd;


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>


}
</style>
<script type="text/javascript" >
	function addCheckForm() {
		var form = document.getElementById('addForm');

	    var input_name= document.getElementById('addname').value;
	    var input_birthday= document.getElementById('addbirthday').value;
	    var input_age= document.getElementById('addage').value;
	    var input_score= document.getElementById('addscore').value;

	    if (input_name == "" || input_name == null) {
	    	alert("请输入学員姓名！！！");
	    	return false;
	    }

	    if (input_birthday == "" || input_birthday == null) {
	    	alert("请输入学員出生年月！！！");
	    	return false;
	    }

	    if (input_age == "" || input_age == null) {
	    	alert("请输入学員年龄！！！");
	    	return false;
	    }

	    if (input_score == "" || input_score == null) {
	    	alert("请输入学員成绩！！！");
	    	return false;
	    }


		form.submit();
		return true;
	}

	function delCheckForm() {
		var form = document.getElementById('delForm');

	    var input_id= document.getElementById("delid").value;
	    if (input_id == "" || input_id == null) {
	    	alert("请输入削除学員id！！！");
	    	return false;
	    }

		form.submit();
		return true;
	}

	function editCheckForm() {
		var form = document.getElementById('editForm');

	    var input_id= document.getElementById('editid');
	    var input_name= document.getElementById('editname');
	    var input_birthday= document.getElementById('editbirthday');
	    var input_age= document.getElementById('editage');
	    var input_score= document.getElementById('editscore');


	    if (input_id == "" || input_id == null) {
	    	alert("请输入学員id！！！");
	    	return false;
	    }

	    if (input_name == "" || input_name == null) {
	    	alert("请输入学員姓名！！！");
	    	return false;
	    }

	    if (input_birthday == "" || input_birthday == null) {
	    	alert("请输入学員出生年月！！！");
	    	return false;
	    }

	    if (input_age == "" || input_age == null) {
	    	alert("请输入学員年龄！！！");
	    	return false;
	    }

	    if (input_score == "" || input_score == null) {
	    	alert("请输入学員成绩！！！");
	    	return false;
	    }

		form.submit();
		return true;
	}
</script>
</head>
<body>
<img src="./images/2222.jpg" />
${msg}
<h1 align="center">先生情報管理</h1>

<div id="all_comm" class="all"  >
  <h2 align="center">TEACHER信息一览</h2>
  <table id="items" >
	<tr>
		<td>id</td>
		<td>先生名</td>
		<td>学科</td>

	</tr>

    <c:forEach items="${teachers}" var="teacher" >
	    <tr>
			<td id="id${teacher.id }">${teacher.id}</td>
			<td id="name${teacher.id }">${teacher.teachername}</td>
			<td id="course${teacher.id}">${teacher.course}</td>
		 </tr>
	 </c:forEach>
  </table>
</div>

	<div id="add_comm" class="all" align="left">
	  <h2>查找学员</h2>
	  <form action="queryByName" method="post" >
		<input type="text" placeholder="姓名" name="name" >
		<input type="submit" value="查找学员" >
	  </form>

	  <h2 id="edit_title">添加学员</h2>
		<form  id="addForm" action="add" method="post" >
		<input id="addname" type="text" placeholder="姓名" name="name" />
		<input id="addbirthday" type="text" placeholder="出生年月" name="birthday" />
		<input id="addage" type="text" placeholder="年龄" name="age" />
		<input id="addscore" type="text" placeholder="分数" name="score" />

<!-- 電話番号、郵便番号 を追加する-->
		<input id="addTelephone" type="text" placeholder="電話番号" name="telephone" />
		<input id="addPostalCode" type="text" placeholder="郵便番号" name="postalCode" />

		<input type="button" value="添加学员" onclick="addCheckForm()"/>

	  </form>
	</div>

	<div id="edit_comm" class="all">
	  <h2>删除学员</h2>
	  <form id="delForm" action="deleteById" method="post" >
		<input id="delid" type="text" placeholder="要删除的id" name="id" />
		<input type="button" value="删除学员" onclick="delCheckForm()"/>
	  </form>

	  <h2 id="edit_title">编辑学员</h2>
	  <form id = "editForm"action="update" method="post">
		<input id="editid" type="text" placeholder="要修改的id" id="edit_id" name="id" value="要修改的id为"/><br>
		<input id="editname" type="text" placeholder="姓名" name="name" />
		<input id="editbirthday" type="text" placeholder="出生年月" name="birthday" />
		<input id="editage" type="text" placeholder="年龄" name="age" />
		<input id="editscore" type="text" placeholder="分数" name="score" />

		<input id="editTelephone" type="text" placeholder="電話番号" name="telephone" />
		<input id="editPostalCode" type="text" placeholder="郵便番号" name="postalCode" />

		<input type="button" value="确定修改" onclick="editCheckForm()"/>
	  </form>
	</div>
</body>
</html>