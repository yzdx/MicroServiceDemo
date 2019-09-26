package com.example.miccustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

     @Autowired
     private RestTemplate restTemplate;


    @GetMapping("/getAll")
    @ResponseBody
    public String getPoducerInfo() {
        String result = this.restTemplate.getForObject("http://mic-provider/news/getNews", String.class);
        System.out.println("=========ribbonController========" +result);
        return result;
    }
}
