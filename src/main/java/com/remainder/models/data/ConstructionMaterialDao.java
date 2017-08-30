package com.remainder.models.data;

import com.remainder.models.ConstructionMaterial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * Created by lisette on 11/8/17.
 */
@Repository
@Transactional
public interface ConstructionMaterialDao extends CrudRepository<ConstructionMaterial, Integer> {
}
