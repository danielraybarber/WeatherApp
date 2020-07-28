package com.tts.WeatherApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zipCode_id")
    private Long id;

    public String zip;

    public ZipCode(Long id, String zip) {
        super();
        this.id = id;
        this.zip = zip;
    }

    public ZipCode() {
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "ZipCode [id=" + id + ", zip=" + zip + "]";
    }


}