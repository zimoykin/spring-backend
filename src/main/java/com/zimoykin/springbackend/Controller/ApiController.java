package com.zimoykin.springbackend.Controller;

import com.zimoykin.springbackend.Model.ApiModel;

import org.springframework.stereotype.Component;

@Component
public interface ApiController<T extends ApiModel> {
    public T[] get();
    public T index();
    public T post();
}