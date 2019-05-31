package org.itstep.dao;

import org.itstep.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentDAO extends JpaRepository<Student, Integer> {
}
