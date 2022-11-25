<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다이어리 새글쓰기</title>

<script>
	function send(f){
		
		var DiaryContent = f.diaryContent.value;
		
		f.action = "insert.do";
		f.method = "post";
		f.submit();
	}
</script>

</head>
<body>
	<form method="post" enctype="multipart/form-data">
		<table border="1" align="center">
			<caption>:::새 글 쓰기:::</caption>			
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="50" name="diaryContent"></textarea></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="글쓰기" onclick="send(this.form);">
					<input type="button" value="취소" onclick="location.href='list.do'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>














