package com.example.test.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@Setter
@Getter
public class AbstractGoods {

    @Id
    @Column(name = "serial_number")
    @NotBlank
    private String serialNumber;

    @Column(name = "manufacturer")
    @NotBlank
    private String manufacturer;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "count")
    private BigInteger count;

}
