package com.utn.devops.controllers;


import com.utn.devops.services.PlayersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.MimeTypeUtils;

@WebMvcTest(PlayersController.class)
public class PlayerControllerTest {
    @MockBean
    private PlayersService playersService;
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void when_call_players_api()throws Exception {

        final ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.get("/players"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MimeTypeUtils.APPLICATION_JSON_VALUE));
    }
}
