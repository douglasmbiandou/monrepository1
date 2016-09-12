package com.objis.gestionformation.dao;
 
public interface IDao <T> {

	public T create(T t);

	public T find(Long id);

	public T find();

	public T update(T t);

	public void delete(T t);

	public void delete(Long id);
}
