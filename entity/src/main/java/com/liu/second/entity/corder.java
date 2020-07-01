package com.liu.second.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class corder {
    private Integer id;
    private String onname;
    private Integer cid;
    private Integer uid;
}
