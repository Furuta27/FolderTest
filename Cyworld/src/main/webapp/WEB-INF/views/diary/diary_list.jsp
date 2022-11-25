<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>

<head>
<style>
  .tree{
      color:#393939;
    }
    .tree, .tree ul{
      list-style: none;
      padding-left:17px;
    }
    .tree *:before{
      width:17px;
      height:17px;
      display:inline-block;
    }
    .tree label{
      cursor: pointer;
    }
    .tree label:before{
      content:'\f256';
      font-family: fontello;
    }
    .tree a{
      text-decoration: none;
      color:#393939;
    }
    .tree a:before{
      content:'\e800';
      font-family: fontello;
    }
    .tree input[type="checkbox"] {
      display: none;
    }
    .tree input[type="checkbox"]:checked~ul {
      display: none;
    }
    .tree input[type="checkbox"]:checked+label:before{
      content:'\f255';
      font-family: fontello;
    }

</style>
<meta charset="UTF-8">
<title>폴더test</title>

<script src="/cyworld/resources/js/httpRequest.js"></script>

<script type="text/javascript">

</script>

</head>
<body>
<h1>폴더 테스트</h1>
<ul class="tree">
    <li>
      <input type="checkbox" id="root">
      <label for="root">ROOT</label>
      <ul>
        <li><a href="https://opentutorials.org">node1</a></li>
        <li><a href="https://opentutorials.org">node2</a></li>
        <li>
          <input type="checkbox" id="node3">
          <label for="node3">node3</label>
          <ul>
            <li><a href="https://opentutorials.org">node31</a></li>
            <li><a href="https://opentutorials.org">node32</a></li>
            <li><a href="https://opentutorials.org">node33</a></li>
          </ul>
        </li>
      </ul>
    </li>
  </ul>
<button>폴더 생성하기</button>

</body>
</html>