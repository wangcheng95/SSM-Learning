package com.waston.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 账户
 */
@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
