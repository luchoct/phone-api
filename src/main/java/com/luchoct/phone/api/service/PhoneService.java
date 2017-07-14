package com.luchoct.phone.api.service;

import com.luchoct.phone.api.api.dto.Phone;
import com.luchoct.phone.api.dao.PhoneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    @Transactional
    public List<Phone> getAllPhones() {
/*
        Looks like, given the requirements to implement, service layer does not provide any extra value, but I still
        keep it just to mark that this layer would be the point where business logic would sit, given further requirements.
*/
        return phoneDAO.getAllPhones();
    }
}
