# Java-mvc-framwork
간단하게 사용할 수 있는 MVC pattern의 Java Web Server

# 플로우
index.jsp link => com.servlet.text => testAction()

com.db.dao => testDao => getUserList()

create DBSession => DBSession.selectList() => com.db.mappers => test_SQL => execute #selectUser => close DBSession

# 취지
스프링 3.0 세팅과 다른 사람에게 설명해주는 게 너무 싫어서 만들었다.
이젠 스프링 부트가 있어서 괜찮을 듯 (다시보니 DI가 없어 coupling이 심해보인다.)
