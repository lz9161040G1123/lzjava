package com.example.lzdemo.dao;

import com.example.lzdemo.domain.trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepossity extends JpaRepository<trade, Integer> {

    @Query(value = "select * from trade", nativeQuery = true)
    List<trade> getall();
}
