package com.javasampleapproach.getobject.repository;

import org.springframework.data.repository.CrudRepository;
import com.javasampleapproach.getobject.model.*;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
