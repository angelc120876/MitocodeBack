package com.mitocode.service;

import java.util.List;

public interface ICRUD<T> {

	T registrar(T obj);
	T modificar(T obj);
	List<T> listar();
	T listarPorId(Integer id);
	void eliminar(Integer id);
}
