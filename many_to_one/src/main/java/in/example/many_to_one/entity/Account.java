package in.example.many_to_one.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tbl_accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fullname;
	
	private Long account_number;
	
	private String account_type;
	
    private Long balance;
	
	@ManyToOne
	private Branch branch;
	
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
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
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
