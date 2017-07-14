package com.luchoct.phone.api.dao;

import com.luchoct.phone.api.api.dto.Phone;
import com.luchoct.phone.api.util.test.data.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@Transactional
public class PhoneDAOTest {

    @Autowired
    private PhoneDAO phoneDAO;

    @Test
    public void getAllPhones() throws Exception {

        //given
        //when
        final List<Phone> phones = phoneDAO.getAllPhones();

        //then
        assertThat(phones, equalTo(TestData.ALL_PHONE_INSTANCE_ORDERED_BY_FEE));
    }
}
