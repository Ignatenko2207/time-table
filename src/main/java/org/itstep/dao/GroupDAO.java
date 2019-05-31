package org.itstep.dao;

import org.itstep.model.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupDAO extends CrudRepository<Group, Integer> {
}
