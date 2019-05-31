package org.itstep.dao;

import org.itstep.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentDAO extends CrudRepository<Student, Integer> {
}
