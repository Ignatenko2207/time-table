package org.itstep.dao;

import org.itstep.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student, Integer> {
}
