<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="utf-8">
    <title>トップ画面</title>
    <meta name="description" content="トップ画面">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sampleStyle.css">
  </head>
  <body>
    <header class="header_img">
      <img class="top_img" src="${pageContext.request.contextPath}/img/mountain.jpg">
    </header>

    <nav>
      <ul class="nav_top">
        <li><a href="#" class="top_nav">トップ</a></li>
        <li><a href="" class="top_nav">ナビ2</a></li>
        <li><a href="" class="top_nav">ナビ3</a></li>
        <li><a href="introduction.html" class="top_nav">自己紹介</a></li>
        <li><a href="contact.html" class="top_nav">お問い合わせ</a></li>
      </ul>
    </nav>
    
    <div>
      <main class="top_main">
        <p class="sentence">文章</p>
        <h1 class="heading">小見出し1</h1>
        <p>本文</p>
        <h1 class="heading">小見出し2</h1>
        <p>本文</p>
      </main>
  
      <nav class="side_nav">
        <div class="side_menu_tirle">サイドメニュー</div>
        <ul class="side_menu">
          <li><a href="" class="side_list">項目1</a></li>
          <li><a href="" class="side_list">項目2</a></li>
          <li><a href="" class="side_list">項目3</a></li>
          <li><a href="" class="side_list">項目4</a></li>
        </ul>
      </nav>
    </div>
    
    <footer>
      <p class="all_rights_reserved">20xx ○○ All Rights Reserved</p>
    </footer>
    
  </body>
</html>