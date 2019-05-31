package org.itstep.dao;

import org.itstep.model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDAO extends CrudRepository<Group, Integer> {
}
