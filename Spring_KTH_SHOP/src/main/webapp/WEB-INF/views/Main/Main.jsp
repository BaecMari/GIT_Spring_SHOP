<%--
  Created by IntelliJ IDEA.
  User: tardi
  Date: 3/6/2021
  Time: 11:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <title>FLAT DESIGN</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/reset.css">
    <link rel="stylesheet" type="text/css" href="">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon/favicon.ico">
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/resources/images/icon/flat-design-touch.png">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

    <!-- Login.css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Main.css">
</head>
<body>
    <div id="wrap">
        <section class="info_section">
            <ul class="info_list">
                <li><a href="index.html"><img src="${pageContext.request.contextPath}/resources/images/s_images/info_icon_01.png" alt=""></a></li>
                <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/info_icon_02.png" alt=""></a></li>
                <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/info_icon_03.png" alt=""></a></li>
                <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/info_icon_04.png" alt=""></a></li>
            </ul>
        </section>
        <header class="header">
            <h1 class="logo">
                <a href="index.html">플랫<br>디자인</a>
            </h1>
            <nav class="nav">
                <ul class="gnb">
                    <li><a href="index.html">nav ul li a 1</a><span class="sub_menu_toggle_btn">하위 메뉴 토글 버튼</span></li>
                    <li><a href="introudce.html">nav ul li a 2</a><span class="sub_menu_toggle_btn">하위 메뉴 토글 버튼</span></li>
                    <li><a href="gallery.html">nav ul li a 3</a><span class="sub_menu_toggle_btn">하위 메뉴 토글 버튼</span></li>
                    <li><a href="board.html">nav ul li a 4</a><span class="sub_menu_toggle_btn">하위 메뉴 토글 버튼</span></li>
                </ul>
            </nav>
            <span class="menu_toggle_btn">전체 메뉴 토글 버튼</span>
        </header>
        <section class="slider_section">
            <span class="prev_btn">이전 버튼</span><span class="next_btn">다음 버튼</span>
        </section>
        <section class="latest_post_section">
            <h2 class="title">최근 글</h2>
            <ul class="latest_post_list">
                <li><a href="">최근글5</a></li>
                <li><a href="">최근글4</a></li>
                <li><a href="">최근글3</a></li>
                <li><a href="">최근글2</a></li>
                <li><a href="">최근글1</a></li>
            </ul>
        </section>
        <section class="popular_post_section">
            <h2 class="title">인기 글</h2>
            <ul class="popular_post_list">
                <li><a href="">최근글5</a></li>
                <li><a href="">최근글4</a></li>
                <li><a href="">최근글3</a></li>
                <li><a href="">최근글2</a></li>
                <li><a href="">최근글1</a></li>
            </ul>
        </section>
        <section class="gallery_section">
            <ul class="gallery_list">
                <li>
                    <a href="#">
                        <figure>
                            <img src="${pageContext.request.contextPath}/resources/images/p_images/gallery_01.jpg" alt="">
                            <figcaption>디자인 트렌트 플랫</figcaption>
                        </figure>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <figure>
                            <img src="${pageContext.request.contextPath}/resources/images/p_images/gallery_02.jpg" alt="">
                            <figcaption>원색이 포인트 플랫</figcaption>
                        </figure>
                    </a>
                </li>
            </ul>
        </section>
        <section class="rankup_section">
            <h2 class="title">인기 검색어</h2>
            <ul class="rankup_list">
                <li><a href="">반응형 웹</a></li>
                <li><a href="">미디어 쿼리</a></li>
                <li><a href="">뷰포트</a></li>
                <li><a href="">CSS 트릭스</a></li>
                <li><a href="">W3C</a></li>
                <li><a href="">루크 W</a></li>
                <li><a href="">CSS 젠 가든</a></li>
                <li><a href="">클리어 보스</a></li>
                <li><a href="">XE</a></li>
                <li><a href="">워드프레스</a></li>
            </ul>
        </section>
        <section class="banner_section">
            <div class="banner_box_01">
                <a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/w3c_logo.png" alt=""></a>
            </div>
            <div class="banner_box_02">
                <ul class="banner_list">
                    <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/js_logo.png" alt=""></a></li>
                    <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/html_logo.png" alt=""></a></li>
                    <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/css_logo.png" alt=""></a></li>
                </ul>
            </div>
        </section>
        <section class="social_section">
            <ul class="social_list">
                <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/social_icon_01.png" alt=""></a></li>
                <li><a href=""><img src="${pageContext.request.contextPath}/resources/images/s_images/social_icon_02.png" alt=""></a></li>
                <li><a href=""><img src="/resources/images/s_images/social_icon_03.png" alt=""></a></li>
            </ul>
        </section>
        <footer class="footer">
            <p>copyright&copy; 2021.flat design blog all rights reserved.</p>
        </footer>
    </div>
</body>
</html>
