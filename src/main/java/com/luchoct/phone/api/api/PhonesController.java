package com.luchoct.phone.api.api;

import com.luchoct.phone.api.api.dto.Phone;
import com.luchoct.phone.api.service.PhoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "/phones", description = "phones resource", basePath = "/phones")
@RestController
@RequestMapping("/phones")
public class PhonesController {

    @Autowired
    private PhoneService service;

    @ApiOperation(value = "Get all phones", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful request", response = Phone.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    public List<Phone> getAllPhones() {
/*
    Note that regarless Phone.id is not needed to be serialized for this specific use case, I include it into the response anyway,
    despite the extra size, as extra coding is minimal and it would be required in the future, for any future operations
    over the phone items, such as getDetails, purchase, etc.
*/
        return service.getAllPhones();
    }
}
