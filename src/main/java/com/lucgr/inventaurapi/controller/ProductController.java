package com.lucgr.inventaurapi.controller;

import com.lucgr.inventaurapi.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    public ResponseEntity<List<ProductDTO>>getProducts(){
        return new ArrayList<>()
    }
}
