package task3.repository.impl;

import task3.entity.Category;
import task3.repository.CategoryRepository;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public void save(Category category) {
        System.out.println(category.getCategoryName() + " is added to DataBase");
    }


}
