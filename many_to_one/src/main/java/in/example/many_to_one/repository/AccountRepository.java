package in.example.many_to_one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.many_to_one.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	List<Account> findByBranchId(Long id);

	List<Account> findByBranchName(String name);

}
