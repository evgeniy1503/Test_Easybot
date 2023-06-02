package com.example.test.model;

import com.example.test.model.enums.LaptopSize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "laptop")
public class Laptop extends AbstractGoods {

    @NotBlank
    private LaptopSize laptopSize;
}
