package com.example.masterthesisspring.mapper;

import com.example.masterthesisspring.dto.ProductAddDto;
import com.example.masterthesisspring.dto.ProductDto;
import com.example.masterthesisspring.dto.UserDto;
import com.example.masterthesisspring.model.*;
import com.example.masterthesisspring.repository.CategoryTypeRepository;
import com.example.masterthesisspring.repository.ConditionTypeRepository;
import com.example.masterthesisspring.repository.OfferTypeRepository;
import com.example.masterthesisspring.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductMapper {

    private final UserRepository userRepository;
    private final CategoryTypeRepository categoryTypeRepository;
    private final ConditionTypeRepository conditionTypeRepository;
    private final OfferTypeRepository offerTypeRepository;

    public Product toEntity(ProductAddDto productAddDto) {
        User user = userRepository.findById(productAddDto.userId()).orElseThrow(IllegalArgumentException::new);
        CategoryType categoryType = categoryTypeRepository.findByName(productAddDto.categoryType()).orElseThrow(IllegalArgumentException::new);
        ConditionType conditionType = conditionTypeRepository.findByName(productAddDto.conditionType()).orElseThrow(IllegalArgumentException::new);
        OfferType offerType = offerTypeRepository.findByName(productAddDto.offerType()).orElseThrow(IllegalArgumentException::new);

        Product product = new Product();
        product.setName(productAddDto.name());
        product.setPrice(productAddDto.price());
        product.setDescription(productAddDto.description());
        product.setRating(productAddDto.rating());
        product.setUser(user);
        product.setCategoryType(categoryType);
        product.setConditionType(conditionType);
        product.setOfferType(offerType);

        return product;
    }

    public ProductDto toDto(Product product) {
        UserDto userDto = new UserDto(
                product.getUser().getId(),
                product.getUser().getEmail(),
                product.getUser().getUsername(),
                product.getUser().getFirstName(),
                product.getUser().getSurname()
        );
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                product.getRating(),
                userDto,
                product.getCategoryType().getName(),
                product.getConditionType().getName(),
                product.getOfferType().getName()
        );
    }

    public List<ProductDto> toDto(List<Product> products) {
        List<ProductDto> productsDto = new ArrayList<>();
        products.forEach(product -> productsDto.add(this.toDto(product)));
        return productsDto;
    }
}
