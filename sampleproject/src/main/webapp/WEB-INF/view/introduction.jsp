<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="utf-8">
    <title>自己紹介</title>
    <meta name="description" content="自己紹介">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sampleStyle.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  <body>
    <header>
      <h1>自己紹介</h1>
    </header>

    <nav>
      <ul class="nav_top">
        <li><a href="${pageContext.request.contextPath}/servlet/toppage" class="top_nav">トップ</a></li>
        <li><a href="" class="top_nav">ナビ2</a></li>
        <li><a href="" class="top_nav">ナビ3</a></li>
        <li><a href="#" class="top_nav">自己紹介</a></li>
        <li><a href="${pageContext.request.contextPath}/servlet/contact" class="top_nav">お問い合わせ</a></li>
      </ul>
    </nav>

    <main class="main_introduction">
      <div class="introduction_img">
        <img src="${pageContext.request.contextPath}/img/pien.png" class="pien">
      </div>
      <div class="personal">
        <h2>名前</h2>
        <h2>誕生日</h2>
        <h2>血液型</h2>
        <h2>住まい</h2>
      </div>
    </main>

    <section class="detail">
      <h2>自己紹介</h2>
      <p>自己紹介本文</p>
    </section>

    <footer>
      <p class="all_rights_reserved">20xx ○○ All Rights Reserved</p>
    </footer>
    
  </body>
</html>