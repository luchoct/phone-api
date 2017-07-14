package com.luchoct.phone.api.api;

import com.luchoct.phone.api.service.PhoneService;
import com.luchoct.phone.api.util.test.data.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class PhonesControllerTest {

    @MockBean
    private PhoneService service;

    @Autowired
    private WebApplicationContext webapp;

    private MockMvc restMvc;

    @Before
    public void setup() {
        restMvc = MockMvcBuilders.webAppContextSetup(webapp).build();
    }

    @Test
    public void getAllPhonesReturnsSuccessfully() throws Exception {
        //given
        given(service.getAllPhones()).willReturn(Arrays.asList(TestData.PHONE_1_INSTANCE));

        //when
        restMvc.perform( get("/phones/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        //then
        verify(service, times(1)).getAllPhones();
/*
        defensive code: verifyNoMoreInteractions is redundant with current code, but it will help to flag out future errors, once
        new requirements are implemented.
*/
        verifyNoMoreInteractions(service);
    }
}