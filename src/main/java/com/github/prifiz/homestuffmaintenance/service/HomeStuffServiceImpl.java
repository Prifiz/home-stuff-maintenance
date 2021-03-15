package com.github.prifiz.homestuffmaintenance.service;

import com.github.prifiz.homestuffmaintenance.model.HomeStuff;
import com.github.prifiz.homestuffmaintenance.repository.HomeStuffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class HomeStuffServiceImpl implements HomeStuffService {

    private final HomeStuffRepository homeStuffRepository;

    @Override
    public HomeStuff create(HomeStuff homeStuff) {
        return homeStuffRepository.save(homeStuff);
    }

    @Override
    public Collection<HomeStuff> findAllByStuffId(Long stuffId) {
        return homeStuffRepository.findAllByStuffId(stuffId);
    }
}
