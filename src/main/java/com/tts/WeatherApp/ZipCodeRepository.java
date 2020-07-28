package com.tts.WeatherApp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.WeatherApp.ZipCode;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long>  {
    List<ZipCode> findAllByOrderByIdDesc();

}