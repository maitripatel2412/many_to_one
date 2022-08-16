package in.example.many_to_one.service;

import java.util.List;

import in.example.many_to_one.entity.Branch;

public interface BranchService {

	Branch createBranch(Branch branch);

	List<Branch> getAllBranchs();

	Branch findById(Long id);

	Branch updateById(Long id, Branch branch);

	void deleteById(Long id);

}
