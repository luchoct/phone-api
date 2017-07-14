package com.luchoct.phone.api.api.dto;

import com.luchoct.phone.api.util.test.data.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureJson
@AutoConfigureJsonTesters
public class PhoneTest {

    @Autowired
    private JacksonTester<Phone> jsonParser;

    @Test
    public void testSerialize() throws Exception {
        assertThat(jsonParser.write(TestData.PHONE_INSTANCE).getJson()).isEqualTo(TestData.PHONE_JSON);
    }

    @Test
    public void testDeserialize() throws Exception {
        assertThat(jsonParser.parse(TestData.PHONE_JSON)).isEqualTo(TestData.PHONE_INSTANCE);
    }
}
