package com.nestdigital.Recipybackend.Dao;

import com.nestdigital.Recipybackend.Model.RecipyModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipyDao extends CrudRepository<RecipyModel,Integer> {
}
