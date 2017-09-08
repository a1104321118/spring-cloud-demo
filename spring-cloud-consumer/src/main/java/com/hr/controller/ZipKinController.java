package com.hr.controller;
//━━━━━━━━━━━━━━神兽保佑━━━━━━━━━━━━━━━━
//   ┏┛ ┻━━━━━┛ ┻┓  
//   ┃　　　　　　 ┃  
//   ┃　　　━　　　┃ ++ + + +
//  ████━████　  ┃ 
//   ┃　　　　　　 ┃ 
//   ┃　　　┻　　　┃ 
//   ┃　　　　　　 ┃  +
//   ┗━┓　　　┏━━━┛  
//     ┃　　　┃
//     ┃　　　┃  
//     ┃　　　┗━━━━━━━━━┓  + +
//     ┃　　　　　　　    ┣┓  
//     ┃　　　　         ┏┛  
//     ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛  + + + +
//       ┃ ┫ ┫   ┃ ┫ ┫  
//       ┗━┻━┛   ┗━┻━┛+ + + +
//━━━━━━━━━━━━━━永无BUG━━━━━━━━━━━━━━━━

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hr on 2017/09/08.
 */
@RequestMapping("/zipkin")
@RestController
public class ZipKinController {

    @Autowired
    private RestTemplate restTemplate;

    private static Logger logger = LoggerFactory.getLogger(ZipKinController.class.getName());

    @RequestMapping("/hi")
    public String home(){
        logger.info("hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        logger.info("info is being called");
        return restTemplate.getForObject("http://localhost:7777/zipkin/info",String.class);
    }
}
