package in.example.many_to_one.service;

import java.util.List;

import in.example.many_to_one.entity.Account;

public interface AccountService {

	Account createAccount(Account account);

	List<Account> getAllAccounts();

	Account findById(Long id);

	Account updateById(Long id, Account account);

	void deleteById(Long id);

	List<Account> findByBranchId(Long id);

	List<Account> findByBranchName(String name);

}
