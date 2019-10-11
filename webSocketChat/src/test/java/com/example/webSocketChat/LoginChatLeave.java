package com.example.webSocketChat;

import com.example.webSocketChat.controller.WebSocketChatServer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import javax.annotation.Resource;

import static javax.swing.UIManager.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = {WebSocketChatServer.class})
public class LoginChatLeave {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void login() throws Exception {
        this.mockMvc.perform((RequestBuilder) get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("login"));
    }

    @Test
    public void chat() throws Exception {
        this.mockMvc.perform((RequestBuilder) get("/chat")).andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("chat"));
    }

    @Test
    public void validURL() throws Exception {
        mockMvc.perform(post("/chat?username=Molly")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

}
