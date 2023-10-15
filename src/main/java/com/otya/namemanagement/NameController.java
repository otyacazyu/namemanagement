package com.otya.namemanagement;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    @Mapping("/names")
    public List<Name> getNames(){
        return List.of(new Name(1,"koyama"),new Name(2,"koyama2"));
    }
}
