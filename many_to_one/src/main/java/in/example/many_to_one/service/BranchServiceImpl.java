package in.example.many_to_one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.example.many_to_one.entity.Branch;
import in.example.many_to_one.repository.BranchRepository;

@Service
@Transactional
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository bRepo;

	@Override
	public Branch createBranch(Branch branch) {
		return bRepo.save(branch);
	}

	@Override
	public List<Branch> getAllBranchs() {
		return bRepo.findAll();
	}

	@Override
	public Branch findById(Long id) {
		return bRepo.findById(id).get();
	}

	@Override
	public Branch updateById(Long id, Branch branch) {
		Branch old = bRepo.findById(id).get();
		branch.setId(id);
		return bRepo.save(branch);
	}

	@Override
	public void deleteById(Long id) {
		bRepo.deleteById(id);
	}
	
}
