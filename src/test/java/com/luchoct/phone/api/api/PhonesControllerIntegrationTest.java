package com.luchoct.phone.api.api;

import com.luchoct.phone.api.util.test.data.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhonesControllerIntegrationTest {

    @Autowired
    private WebApplicationContext webapp;

    private MockMvc restMvc;

    @Before
    public void setup() {
        restMvc = MockMvcBuilders.webAppContextSetup(webapp).build();
    }

    @Test
    public void getAllPhones() throws Exception {
        //given
        //when
        final ResultActions resultActions = restMvc.perform(
                get("/phones/").accept(MediaType.APPLICATION_JSON));

        //then
        resultActions.andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(TestData.ALL_PHONE_JSON_ORDERED_BY_FEE,true));
    }
}