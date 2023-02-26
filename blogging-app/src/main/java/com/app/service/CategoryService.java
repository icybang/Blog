package com.app.service;

import java.util.List;

import com.app.payloads.CategoryDto;

public interface CategoryService {

	// create
	public CategoryDto createCategory(CategoryDto categoryDto);

	// update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	public void deleteCategory(Integer CategoryId);

	// get
	public CategoryDto getCategory(Integer categoryId);

	// get all
	public List<CategoryDto> getAllCategory();
}
