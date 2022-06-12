package com.ShopShoe.services;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T> {
	public List<T> findAll();
	
	public T update(T entity);
	
	public void delete(long id);
	
	public T save(T entity);
	
	public Optional<T> findById(long id);
}
