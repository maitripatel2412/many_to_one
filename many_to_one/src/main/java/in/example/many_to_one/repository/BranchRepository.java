package in.example.many_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.many_to_one.entity.Account;
import in.example.many_to_one.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

	

}
