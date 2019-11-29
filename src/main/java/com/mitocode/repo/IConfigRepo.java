package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Config;

public interface IConfigRepo extends JpaRepository<Config, Integer>{

	//FROM Config c where c.parametro = :param
	Config findByParametro(String param);

}
