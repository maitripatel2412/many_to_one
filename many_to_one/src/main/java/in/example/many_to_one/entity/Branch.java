package in.example.many_to_one.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_branch")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String branch_code;
	
	@JsonIgnore
	@OneToMany
	private List<Account> account;
	
	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@CreationTimestamp
	private Timestamp createdtime;
	
	@UpdateTimestamp
	private Timestamp updatedtime;
	
	@Column(name = "is_deleted",columnDefinition = "integer default 0")
	private int isdeleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public Timestamp getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(Timestamp createdtime) {
		this.createdtime = createdtime;
	}


	public Timestamp getUpdatedtime() {
		return updatedtime;
	}

	public void setUpdatedtime(Timestamp updatedtime) {
		this.updatedtime = updatedtime;
	}

	public int getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(int isdeleted) {
		this.isdeleted = isdeleted;
	}
	
	
	
}
