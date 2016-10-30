package org.smart4j.chapter2.model;

import lombok.Data;

@Data
public class Customer {
    private long id;
    private String name;
    private String contact;
    private String telephone;
    private String email;
    private String remark;
}
