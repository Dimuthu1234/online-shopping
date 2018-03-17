package net.dsj.shoppingbackend.dao;

import java.util.List;

import net.dsj.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
