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
import org.springframework.web.bind.annotation.RestController;

import in.example.many_to_one.entity.Branch;
import in.example.many_to_one.service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	private BranchService bService;

	@PostMapping("/save")
	public Branch createBranch(@RequestBody Branch branch) {
		return bService.createBranch(branch);
	}
	
	@GetMapping
	public List<Branch> getAllBranchs(){
		return bService.getAllBranchs();
	}
	
	@GetMapping("/{id}")
	public Branch findById(@PathVariable Long id) {
		return bService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Branch updateById(@PathVariable Long id,@RequestBody Branch branch) {
		return bService.updateById(id,branch);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		bService.deleteById(id);
	}
	
}
