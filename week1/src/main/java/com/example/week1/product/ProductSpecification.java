package com.example.week1.product;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Component
public class ProductSpecification {
    public Specification<Product> nameLike(String name) {

        //Anonymous class
        return new Specification<Product>() {
            //CriteriaAPI
            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                // 「name LIKE '%name%'"Add
                return cb.like(root.get("name"), "%" + name + "%");
            }
        };
    }
}
