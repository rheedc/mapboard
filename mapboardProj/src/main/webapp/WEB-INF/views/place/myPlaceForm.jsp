<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!doctype html>
<html lang="en">
<head>
	<title>myPlaceForm</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
	h3 {
		color:#7C5D44;
	}
	th {
		width:20%;
		text-align:center;
		font-weight:bold;
		background-color:#ebf6f9;
	}
	tr {
		height:30px;
	}
	input{
		width:80%;
	}
	textarea {
		height:30px;
		width:80%
	}
	select {
		width:30%;
	}
	.brdImage {
		height:500px;
		padding:10px; 
	}
	.btn2 {
	    width:50px;
	    background-color: #ebf6f9;
	    border: none;
	    color:black;
	    text-align: center;
	    text-decoration: none;
	    display: inline-block;
	    font-size: 13px;
	    margin: 4px;
	    cursor: pointer;
	    border-radius:5px;
	 }
	.btn2:hover {
		background-color: #f6f2ef;
		font-weight:bold;
	    color:black;
	} 
</style>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d122d716888da016ee859c0430722a86&libraries=services,clusterer,drawing"></script>
	<script>
	
		// 쿠키 얻기 함수
		var getCookie = function(name) {
			var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
			return value? value[2] : null;
		};
		
		// 쿠키 설정 함수
		var setCookie = function(name, value, exp) {
			var date = new Date();
			date.setTime(date.getTime() + exp*24*60*60*1000);
			document.cookie = name + '=' + value + ';expires=' + date.toUTCString() + ';path=/';
		};
		
		// 쿠키 삭제 함수
		var deleteCookie = function(name) {
			setCookie(name,'',-1);
		};
		
		var mouseLat="";
		var mouseLng="";
		
		$(function(){
			
			// myWBtn 클릭시
			$('#myWBtn').click(function(){
				
			
				// myPlaceForm에 보내기
				$("#myPlaceForm").submit();
				
			});	// myWBtn 끝
			
			// seoul 클릭시 place/placeList.yo로 이동
			$('#seoul').click(function(){			
				deleteCookie('gupath');
				deleteCookie('guname');
				deleteCookie('mouseLat');
				deleteCookie('mouseLng');
				console.log(getCookie('guname'));
				$(location).attr('href', '../place/placeList.yo')
			});
			
			
			
			
			mouseLat	=	getCookie('mouseLat'); 
			mouseLng	=	getCookie('mouseLng');
			detailAddr	=	getCookie('detailAddr');
			//detailAddr = detailAddr1.replace('</div>','')
			console.log('x'+mouseLat);
			console.log('y'+mouseLng);
			
			$("#myPlaceX").val(mouseLat);
			$("#myPlaceY").val(mouseLng);
			$("#myPlaceAddress1").val(detailAddr);
			
		});
	</script>
</head>
<body>
<table align="center" width="70%">
	<tr>
		<td>
			<h3 align="left">내 기준지 등록</h3> 
		</td>
	</tr>
</table>
<form id="myPlaceForm" action="../place/myPlaceProc.yo" method="get" enctype="multipart/form-data">
	<input type="hidden" id="id" name="id" value="${sessionScope.userid}"/>
  	<!-- <input type="hidden" id="id" name="id" value="jojo"/> -->
	<table border="1px" align="center" width="70%">
		<tr>
  			<th>좌표정보</th>
  			<td>
  				위도:<input type="text" id="myPlaceX" name="myPlaceX"readonly style="width:35%;"/>
  				경도:<input type="text" id="myPlaceY" name="myPlaceY" readonly style="width:35%;"/>
  			</td>
  		</tr>
		<tr>
  			<th>지번주소</th>
  			<td>
  				<input type="text" id="myPlaceAddress1" name="myPlaceAddress1" readonly />
  			</td>
  		</tr>
	</table>
	<table align="center" width="70%"> 
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="btn2" id=seoul  name="seoul" value="서울시전체보기" style="width:100px;"/>
	  			<input type="button" class="btn2" id=myWBtn  name="myWBtn" value="등록" style="width:100px;"/>
			</td>
		</tr>
	</table>
</form>


</body>
</html>
