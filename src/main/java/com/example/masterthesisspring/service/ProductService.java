package com.example.masterthesisspring.service;

import com.example.masterthesisspring.dto.ProductAddDto;
import com.example.masterthesisspring.dto.ProductDto;
import com.example.masterthesisspring.mapper.ProductMapper;
import com.example.masterthesisspring.model.Product;
import com.example.masterthesisspring.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDto addProduct(ProductAddDto productAddDto) {
        Product product = productMapper.toEntity(productAddDto);
        Product savedProduct = productRepository.save(product);
        return productMapper.toDto(savedProduct);
    }

    public List<ProductDto> getProducts() {
        return productMapper.toDto(productRepository.findAll());
    }

    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Product deleted";
    }

}
