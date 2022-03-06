package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Cbt
 * @createDate 2022-03-04 21:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
    private Integer id;
    private String name;
    private double price;
    private String pic;
    private Date createtime;
    private String detail;
}
