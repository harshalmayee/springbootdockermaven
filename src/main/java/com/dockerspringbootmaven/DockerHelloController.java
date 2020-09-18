package com.dockerspringbootmaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerHelloController {

    @RequestMapping("/hellodockermaven")
    public String hellodocker(){
        return "Hello Docker using maven plugin !!!";
    }
}
