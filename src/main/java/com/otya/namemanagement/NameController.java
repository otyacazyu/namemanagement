package com.otya.namemanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    @GetMapping("/names")
    public List<Name> getNames(){
        return List.of(new Name(1,"koyama"),new Name(2,"tanaka"),new Name(3,"otya")
                      ,new Name(4,"imai"));

    }
}
