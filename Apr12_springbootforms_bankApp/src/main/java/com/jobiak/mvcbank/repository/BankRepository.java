package com.jobiak.mvcbank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jobiak.mvcbank.model.Bank;

@Repository//implemnts DAO Save /update/delete /find
public interface BankRepository extends JpaRepository<Bank, Long>{
 	
}
