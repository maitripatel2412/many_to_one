package in.example.many_to_one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.example.many_to_one.entity.Account;
import in.example.many_to_one.repository.AccountRepository;
import in.example.many_to_one.repository.BranchRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository aRepo;

	@Override
	public Account createAccount(Account account) {
		return aRepo.save(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		return aRepo.findAll();
	}

	@Override
	public Account findById(Long id) {
		return aRepo.findById(id).get();
	}

	@Override
	public Account updateById(Long id, Account account) {
		Account old = aRepo.findById(id).get();
		account.setId(id);
		return aRepo.save(account);
	}

	@Override
	public void deleteById(Long id) {
		aRepo.deleteById(id);
	}

	@Override
	public List<Account> findByBranchId(Long id) {
		return aRepo.findByBranchId(id);
	}

	@Override
	public List<Account> findByBranchName(String name) {
		return aRepo.findByBranchName(name);
	}
	
}









