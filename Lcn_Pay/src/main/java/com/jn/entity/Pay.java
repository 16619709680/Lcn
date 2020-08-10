package com.jn.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * pay
 * @author 
 */
@Data
public class Pay implements Serializable {
    private Integer id;

    private String payname;

    private static final long serialVersionUID = 1L;
}