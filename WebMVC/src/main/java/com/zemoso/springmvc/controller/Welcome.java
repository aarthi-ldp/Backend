package com.zemoso.springmvc.controller;
import com.zemoso.springmvc.config.PrototypeBean;
import com.zemoso.springmvc.config.Singletonbean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
    public class Welcome {
    @Autowired
        private  Singletonbean bean;
    @Autowired
    private PrototypeBean prototypeBean;



    @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String showPage(){
          log.info("Welcome");
           System.out.println(bean.DemoBeans());
        System.out.println(prototypeBean.PrototypeBeans()
        );


            return "home";
        }


}


