package com.github.prifiz.homestuffmaintenance.repository;

import com.github.prifiz.homestuffmaintenance.model.HomeStuff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface HomeStuffRepository extends JpaRepository<HomeStuff, UUID> {

    Collection<HomeStuff> findAllByStuffId(Long stuffId);
}
