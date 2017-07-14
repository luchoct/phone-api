package com.luchoct.phone.api.api;

import com.luchoct.phone.api.api.dto.Phone;
import com.luchoct.phone.api.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhonesController {

    @Autowired
    private PhoneService service;

    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    public List<Phone> request() {
/*
    Not that regarless Phone.id is not needed to be serialized for this specific use case, I include it into the response anyway,
    despite the extra size, as extra coding is minimal and it would be required in the future, for any future operations
    over the phone items, such as getDetails, purchase, etc.
*/
        return service.getAllPhones();
    }
}
