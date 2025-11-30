package com.example.demo.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@Component
@Slf4j
public class WebSocketHandler extends TextWebSocketHandler {


    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        // JSON 파싱 (Jackson 사용 예시)
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(payload);

        String eventType = node.has("event") ? node.path("event").toString() : "";
        String content = node.has("content") ? node.path("content").toString() : "";

        log.info("eventType: {} content: {}",eventType,content);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 연결이 되면 클라이언트에게 메시지 전송
        if (session.isOpen()) {
            session.sendMessage(new TextMessage("WebSocket 연결 성공!!!"));
        }
    }
}