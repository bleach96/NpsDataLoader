package com.bleach96.npsdataloader.Data;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NationalPark {
    String parkIdentifier;
    String parkName;
    String parkCode;
    double parkLatitude;
    double parkLongitude;

    public NationalPark() {

    }
}