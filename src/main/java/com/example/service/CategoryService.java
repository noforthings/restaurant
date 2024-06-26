package com.example.service;

import java.util.List;

import com.example.entity.CategoryEntity;

public interface CategoryService {
	List<CategoryEntity> getAll();
	CategoryEntity findById(Integer catId);
	CategoryEntity findByName(String catName);
	Boolean create (CategoryEntity category);
	Boolean edit (CategoryEntity category);
	Boolean delete(Integer catId);
	void save(CategoryEntity category);
}
