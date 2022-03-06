package com.example.week1.product;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductSpecification productSpecification;

    public List<Product> searchProductByName(String words){
        String wordTrim = words.strip();

        String[] keyWordArray = wordTrim.split("[　 ]", 0);
        List<String> wordList = Arrays.asList(keyWordArray);
        List<Product> matches = productRepository.findAll(forWords(wordList));
        return matches;
    }

    Specification<Product> forWords(Collection<String> words) {
        if(words == null || words.isEmpty())
            throw new RuntimeException("List of words cannot be empty.");

        return (root, query, builder) -> words.stream()
                .map(String::toLowerCase)
                .map(word -> "%" + word + "%")
                .map(word -> builder.like(builder.lower(root.get("name")), word))
                .reduce(builder::or)
                .get();

    }
}

