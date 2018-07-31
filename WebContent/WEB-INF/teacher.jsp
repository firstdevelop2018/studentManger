<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Teacher管理</title>
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
	    var input_sex= document.getElementById('addsex').value;
	    var input_score= document.getElementById('addscore').value;
	    var input_country= document.getElementById('addcountry').value;
	    var input_myNumber= document.getElementById('addmyNumber').value;

	    if (input_name == "" || input_name == null) {
	    	alert("请输入先生姓名！！！");
	    	return false;
	    }

	    if (input_birthday == "" || input_birthday == null) {
	    	alert("请输入先生出生年月！！！");
	    	return false;
	    }

	    if (input_age == "" || input_age == null) {
	    	alert("请输入先生年龄！！！");
	    	return false;
	    }

	    if (input_sex == "" || input_age == null) {
	    	alert("请输入先生性別！！！");
	    	return false;
	    }
	    if (input_score == "" || input_score == null) {
	    	alert("请输入先生成绩！！！");
	    	return false;
	    }
 		if (input_country == "" || input_score == null) {
 			alert("请输入先生国籍！！！");
	　　　　　    return false;
　　　　　　　}
 		if (input_myNumber == "" || input_score == null) {
　　　　		alert("请输入先生個人情報！！！");
　　　　　　　　　　return false;
　　　　　　　}


		form.submit();
		return true;
	}

	function delCheckForm() {
		var form = document.getElementById('delForm');

	    var input_id= document.getElementById("delid").value;
	    if (input_id == "" || input_id == null) {
	    	alert("请输入削除先生id！！！");
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
	    var input_sex= document.getElementById('editsex');
	    var input_score= document.getElementById('editscore');

	    if (input_name == "" || input_name == null) {
	    	alert("请输入先生姓名！！！");
	    	return false;
	    }

	    if (input_birthday == "" || input_birthday == null) {
	    	alert("请输入先生出生年月！！！");
	    	return false;
	    }

	    if (input_age == "" || input_age == null) {
	    	alert("请输入先生年龄！！！");
	    	return false;
	    }

	    if (input_sex == "" || input_sex == null) {
	    	alert("请输入先生性別！！！");
	    	return false;
	    }
	    if (input_score == "" || input_score == null) {
	    	alert("请输入先生成绩！！！");
	    	return false;
	    }

       if (input_country == "" || input_score == null) {
    	   alert("请输入先生国籍！！！");
    	  return false;
        }
       if (input_myNumber == "" || input_score == null) {
    	   alert("请输入先生個人情報！！！");
    	  return false;
        }


		form.submit();
		return true;
	}
</script>
</head>
<body>
<img src="./images/Teacher_head.jpg" />
${msg}
<h1 align="center">先生情報管理</h1>

<div id="all_comm" class="all"  >
  <h2 align="center">STUENT信息一览</h2>
  <table id="items" >
	<tr>
		<td>id</td>
		<td>姓名</td>
		<td>出生年月</td>
		<td>年龄</td>
		<td>性別</td>
		<td>分数</td>
	    <td>国籍</td>
	    <td>個人情報</td>

	</tr>

    <c:forEach items="${Teachers}" var="Teacher" >
	    <tr>
			<td id="id${Teacher.id }">${Teacher.id}</td>
			<td id="name${Teacher.id }">${Teacher.name}</td>
			<td id="birthday${Teacher.id}">${Teacher.birthday}</td>
			<td id="age${Teacher.id }">${Teacher.age}</td>
			<td id="sex${Teacher.id }">${Teacher.sex}</td>
			<td id="score${Teacher.id}">${Teacher.score}</td>
            <td id="country${Teacher.id}">${Teacher.country}</td>
            <td id="myNumber${Teacher.id}">${Teacher.myNumber}</td>
		 </tr>
	 </c:forEach>
  </table>
</div>

	<div id="add_comm" class="all" align="left">
	  <h2>查找教师</h2>
	  <form action="queryByName" method="post" >
		<input type="text" placeholder="姓名" name="name" >
		<input type="submit" value="查找教师" >
	  </form>

	  <h2 id="edit_title">添加教师</h2>
		<form  id="addForm" action="add" method="post" >
		<input id="addname" type="text" placeholder="姓名" name="name" />
		<input id="addbirthday" type="text" placeholder="出生年月" name="birthday" />
		<input id="addage" type="text" placeholder="年龄" name="age" />
		<input id="addsex" type="text" placeholder="性別" name="sex" />
		<input id="addscore" type="text" placeholder="分数" name="score" />
        <input id="addcountry" type="text" placeholder="国籍" name="country" />
        <input id="addmyNumber" type="text" placeholder="個人情報" name="myNumber" />

		<input type="button" value="添加教师" onclick="addCheckForm()"/>

	  </form>
	</div>

	<div id="edit_comm" class="all">
	  <h2>删除教师</h2>
	  <form id="delForm" action="deleteById" method="post" >
		<input id="delid" type="text" placeholder="要删除的id" name="id" />
		<input type="button" value="删除教师" onclick="delCheckForm()"/>
	  </form>

	  <h2 id="edit_title">编辑教师</h2>
	  <form id = "editForm"action="update" method="post">
		<input id="editid" type="text" placeholder="要修改的id" id="edit_id" name="id" value="要修改的id为"/><br>
		<input id="editname" type="text" placeholder="姓名" name="name" />
		<input id="editbirthday" type="text" placeholder="出生年月" name="birthday" />
		<input id="editage" type="text" placeholder="年龄" name="age" />
		<input id="editsex" type="text" placeholder="性別" name="sex" />
        <input id="editscore" type="text" placeholder="分数" name="score" />


		<input type="button" value="确定修改" onclick="editCheckForm()"/>
	  </form>
	</div>
</body>
</html>