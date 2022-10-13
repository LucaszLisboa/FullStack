package dev.lucas.Socket.handler;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;
import java.util.Random;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        String path = request.getURI().getPath();
        attributes.put("user", getUserPath(path));

        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    private Object getUserPath(String path) {
        String[] split = path.split("/");
        String user = split[split.length - 1];

        if (user.equals("chat"))
        {
            return getSuperHero();
        }

        return user;
    }

    protected String getSuperHero() {
        String [] superheros = {"Superman", "The Flash", "Wonder Woman","Tiringa", "Hulk", "Thor", "Iron Man", "Batman", "Aquaman", "Cyborg" };

        Random random = new Random();
        return superheros[random.nextInt(superheros.length)];

    }


}
