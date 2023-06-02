package com.example.test.dto;

import com.example.test.model.enums.LaptopSize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.validation.constraints.Positive;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LaptopDto {

    private String manufacturer;

    @Positive
    private BigDecimal price;

    private String serialNumber;

    private LaptopSize laptopSize;

    private BigInteger count;
}
