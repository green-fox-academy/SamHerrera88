package com.greenfoxacademy;

import com.greenfoxacademy.Controller.WebController;
import com.greenfoxacademy.Model.DoublingJS;
import com.greenfoxacademy.Model.Greeter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(WebController.class)

public class WebControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DoublingJS doublingJS;

    @Test
    public void doublingTest() throws Exception {
        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.received", is(15)))
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void doublingWrongTest() throws Exception {
        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.received", is(15)))
                .andExpect(jsonPath("$.result", not(45)));
    }


    @Test
    public void greeterTest() throws Exception{
        mockMvc.perform(get("/greeter?name=Sambo&title=Coach"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there " + name + ", my dear " + title + "!")));
    }
}
