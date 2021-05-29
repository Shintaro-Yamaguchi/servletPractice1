<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="utf-8">
    <title>お問い合わせ</title>
    <meta name="description" content="お問い合わせ">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sampleStyle.css">
  </head>
  <body>
    <header>
      <h1>お問い合わせ</h1>
    </header>

    <nav>
      <ul class="nav_top">
        <li><a href="${pageContext.request.contextPath}/servlet/toppage" class="top_nav">トップ</a></li>
        <li><a href="" class="top_nav">ナビ2</a></li>
        <li><a href="" class="top_nav">ナビ3</a></li>
        <li><a href="${pageContext.request.contextPath}/servlet/introduction" class="top_nav">自己紹介</a></li>
        <li><a href="#" class="top_nav">お問い合わせ</a></li>
      </ul>
    </nav>

    <form name="contact-form" class="contact-form">
      <dl>
        <dt>名前</dt>
        <dd><input type="text"></dd>
        <dt>性別</dt>
        <dd>
	        <input type="radio" name="gender">男性
	        <input type="radio" name="gender">女性
        </dd>
        <dt>問合内容</dt>
        <dd><textarea name="nessage" class="message"></textarea></dd>
        <dt>添付ファイル</dt>
        <dd><input type="file" name="file" class="file"></dd>
      </dl>
      <div>
        <input type="submit" value="送信" class="send">
      </div>
    </form>

    <footer>
      <p class="all_rights_reserved">20xx ○○ All Rights Reserved</p>
    </footer>
    
  </body>
</html>