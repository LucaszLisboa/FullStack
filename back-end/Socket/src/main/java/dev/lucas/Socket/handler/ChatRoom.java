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
import java.util.Random;

public class ChatRoom extends AbstractWebSocketHandler {

    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<>());
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        System.out.println("NEW SESSION CREATED");
        sessionList.add(session);

        session.sendMessage(new TextMessage("{\"user\":\" "
                + session.getAttributes().get("user").toString()
                + "\",\"message\":\" " + getRandomMessage() +" \"}"));


        super.afterConnectionEstablished(session);
    }

    private String getRandomMessage()
    {
        String[] messages = {"Cai de paraquedas no servidor!", "To na area", "É hora do jogo!"};
        Random random = new Random();
        return messages[random.nextInt(messages.length)];
    }


    @Override
    protected void handleTextMessage(WebSocketSession mySession, TextMessage message) throws Exception {

        Gson gson = new Gson();
        PADOLabsMessage padoLabsMessage = gson.fromJson(message.getPayload(), PADOLabsMessage.class);

        System.out.println("Message received: " + padoLabsMessage);
        if (padoLabsMessage.getUser().equalsIgnoreCase(""))
        {
            for(WebSocketSession targetSession: sessionList){
                targetSession.sendMessage(new TextMessage("{\"user\":\" " + mySession.getAttributes().get("user").toString() + " [GLOBAL]" + "\",\"message\":\" " + padoLabsMessage.getMessage() +" \"}"));
            }
        }

        for(WebSocketSession targetSession: sessionList)
        {
            if (targetSession.getAttributes().get("user").toString().equalsIgnoreCase(padoLabsMessage.getUser()))
            {
                targetSession.sendMessage(new TextMessage("{\"user\":\" " + mySession.getAttributes().get("user").toString() + " ["+ targetSession.getAttributes().get("user") + "]" + "\",\"message\":\" " + padoLabsMessage.getMessage() +" \"}"));
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
