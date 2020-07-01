package com.liu.second.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class commodity {
    private Integer id;
    private String name;
    private double prices;
    private Integer balance;
    private Integer sales;
}
