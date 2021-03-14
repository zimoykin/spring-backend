package com.zimoykin.springbackend.Controller;

import com.zimoykin.springbackend.Model.ApiModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



public class DefaultController <T extends ApiModel>  {
    
    @RestController
    public class GetController implements ApiController<T> {

        @Override
        @RequestMapping("/all")
        public T[] get() {
            return null;
        }

        @Override
        @RequestMapping("/one")
        public T index() {
            return null;
        }

        @Override
        @RequestMapping(value = "/", method = RequestMethod.POST)
        public T post() {
            return null;
        }

    }    
}

