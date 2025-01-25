package com.app.insertRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface AdmissionRepository extends JpaRepository<Student,Integer> {
	
	@Transactional
	@Modifying
	@Query("update Student set name=:name where id=:id")
	public void updateStudentName(@Param("name") String name,@Param("id") Integer id);

}
