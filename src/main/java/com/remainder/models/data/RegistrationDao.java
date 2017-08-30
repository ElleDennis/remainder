package com.remainder.models.data;

import com.remainder.models.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * Created by lisette on 11/8/17.
 */
@Repository
@Transactional
public interface RegistrationDao extends CrudRepository<Registration, Integer> {
}
