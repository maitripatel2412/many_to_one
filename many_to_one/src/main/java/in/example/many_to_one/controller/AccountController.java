package in.example.many_to_one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.example.many_to_one.entity.Account;
import in.example.many_to_one.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private AccountService aService;

	@GetMapping("/hello")
	public String account() {
		return "hello its my account..   :)";
	}
	
	@PostMapping("/save")
	public Account createAccount(@RequestBody Account account) {
		return aService.createAccount(account);
	}
	
	@GetMapping
	public List<Account> getAllAccounts(){
		return aService.getAllAccounts();
	}
	
	@GetMapping("/{id}")
	public Account findById(@PathVariable Long id) {
		return aService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Account updateById(@PathVariable Long id,@RequestBody Account account) {
		return aService.updateById(id,account);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		aService.deleteById(id);
	}
	
	@GetMapping("/findByBranch/{id}")
	public List<Account> findByBranchId(@PathVariable Long id) {
		return aService.findByBranchId(id);
	}
	
	@GetMapping("/BranchName")
	public List<Account> findByBranchName(@RequestParam String name){
		System.err.println("name : "+name);
		return aService.findByBranchName(name);
	}
	
}
