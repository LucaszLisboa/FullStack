package dev.lucas.Socket.handler;

import com.google.gson.Gson;
import dev.lucas.Socket.models.PADOLabsMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRoom extends AbstractWebSocketHandler {

    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<>());
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        System.out.println("NEW SESSION CREATED");
        sessionList.add(session);

        session.sendMessage(new TextMessage("Welcome to the chat room!" + " Your user is: " + session.getAttributes().get("user").toString()));

        super.afterConnectionEstablished(session);
    }


    @Override
    protected void handleTextMessage(WebSocketSession mySession, TextMessage message) throws Exception {

        Gson gson = new Gson();
        PADOLabsMessage padoLabsMessage = gson.fromJson(message.getPayload(), PADOLabsMessage.class);

        System.out.println("Message received: " + padoLabsMessage);
        if (padoLabsMessage.getUser().equalsIgnoreCase(""))
        {
            for(WebSocketSession targetSession: sessionList){
                targetSession.sendMessage(new TextMessage(mySession.getAttributes().get("user").toString() + ": " + padoLabsMessage.getMessage()));
            }
        }

        for(WebSocketSession targetSession: sessionList)
        {
            if (targetSession.getAttributes().get("user").toString().equalsIgnoreCase(padoLabsMessage.getUser()))
            {
                targetSession.sendMessage( new TextMessage(mySession.getAttributes().get("user").toString() + ": " + padoLabsMessage.getMessage()));
            }
        }


        super.handleTextMessage(mySession, message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessionList.remove(session);
        System.out.println("//SESSIONS:");

        sessionList.forEach(webSocketSession -> {
            System.out.println(webSocketSession.getAttributes().get("user").toString());
        });
        System.out.println("/////////////////////////////////////////");
        super.afterConnectionClosed(session, status);
    }
}
