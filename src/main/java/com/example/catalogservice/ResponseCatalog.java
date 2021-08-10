package com.example.catalogservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalog {
    private String productId;
    private Integer productName;
    private Integer stock;
    private Integer unitPrice;
    private Date createAt;
}
