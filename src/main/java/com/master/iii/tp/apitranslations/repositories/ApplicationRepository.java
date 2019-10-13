package com.master.iii.tp.apitranslations.repositories;

import com.master.iii.tp.apitranslations.entities.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application,Integer>
{

}
