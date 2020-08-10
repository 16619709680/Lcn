package com.jn.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
    private Integer id;

    private String ordername;

    private static final long serialVersionUID = 1L;
}