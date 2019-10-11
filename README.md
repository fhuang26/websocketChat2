## websocketChat2

This app provides an online chat room, by using WebSocket, Spring Boot, Java, JavaScript, Maven, and IntelliJ. A user can enter the online chat room anytime and chat with other people currently online. Please see "chatting online" for a recording (1 min).

The following are modified from previous version, based on reviewer's suggestion.

* WebSocketChatApplication.java : to use ("login") and ("chat") on lines 25 and 33. This helps solve template file issues when the app is packaged to a .jar .

* chat.html : TODO comments are removed.

* LoginChatLeave.java under test: 3 test cases about login and chat are added.

* On Maven Lifecycle, I did clean and package. chatroom-starter-0.0.1-SNAPSHOT.jar is created under target. I right-clicked this .jar to run it. The online chatroom seems to work normally.

* application.properties : "thymeleaf.cache: false" is added.
