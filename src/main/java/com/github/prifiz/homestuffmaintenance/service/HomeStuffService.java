package com.github.prifiz.homestuffmaintenance.service;

import com.github.prifiz.homestuffmaintenance.model.HomeStuff;

import java.util.Collection;

public interface HomeStuffService {

    HomeStuff create(HomeStuff homeStuff);

    Collection<HomeStuff> findAllByStuffId(Long stuffId);
}
