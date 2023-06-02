package com.example.test.model;

import com.example.test.model.enums.FormFactor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "desktop")
public class DesktopComputer extends AbstractGoods {

    private FormFactor formFactor;

}
