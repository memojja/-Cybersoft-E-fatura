package com.example.Dao;

import com.example.Model.Fatura;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by memojja on 18.07.2016.
 */
@Transactional
public interface FaturaDao extends CrudRepository<Fatura,Long> {

}

