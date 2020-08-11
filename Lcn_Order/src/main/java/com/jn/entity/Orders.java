package com.jn.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * orders
 * @author 
 */
@Data
public class Orders implements Serializable {
    private Integer id;

    private String ordername;

    private static final long serialVersionUID = 1L;
}