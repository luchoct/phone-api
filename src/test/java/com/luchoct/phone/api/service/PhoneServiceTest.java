package com.luchoct.phone.api.service;

import com.luchoct.phone.api.api.dto.Phone;
import com.luchoct.phone.api.dao.PhoneDAO;
import com.luchoct.phone.api.util.test.data.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class PhoneServiceTest {

    @MockBean
    private PhoneDAO phoneDAO;

    @Autowired
    private PhoneService service;

    @Test
    public void getAllPhonesReturnsSuccessfully()  {
        //given
        given(phoneDAO.getAllPhones()).willReturn(TestData.ALL_PHONE_INSTANCE_ORDERED_BY_FEE);

        //when
        final List<Phone> phones = service.getAllPhones();
        verify(phoneDAO, times(1)).getAllPhones();
        assertThat(phones, equalTo(TestData.ALL_PHONE_INSTANCE_ORDERED_BY_FEE));
    }
}