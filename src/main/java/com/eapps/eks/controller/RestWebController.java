package com.eapps.eks.controller;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

 
@RestController
public class RestWebController {
     
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getResource(){
            return "Spring boot deployed to Aws Eks";
    }
}
