package com.jobiak.mvcforms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jobiak.mvcforms.model.User;

@Repository 		//CURD operations
public interface UserRepository extends JpaRepository<User, Long> {
																//Entity class & Entity Primary Key Column Type
}
