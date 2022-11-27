package task3.service.impl;

import task3.entity.Category;
import task3.logger.Logger;
import task3.repository.CategoryRepository;
import task3.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final Logger logger;

    private final List<Category> categories;

    public CategoryServiceImpl(CategoryRepository categoryRepository, Logger logger, List<Category> categories) {
        this.categoryRepository = categoryRepository;
        this.logger = logger;
        this.categories = categories;
    }

    @Override
    public Category save(Category category) throws Exception {

        for (Category eachCategory : categories) {

            if (eachCategory.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Category's name can not be repeated! " + category.getCategoryName());
            }

        }

        categoryRepository.save(category);
        logger.log(category.getCategoryName());
        return category;
    }

    @Override
    public Category findById(Long aLong) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

}
