package com.projectbanking.dao;


import com.projectbanking.bean.*;

public interface ProjectBankingDao {

	public int depositAmount(String accId,int amt);
	public int withdrawAmount(String accId,int amt);
	public Account showAccountDetails(String accountNo);
	public void createAccount(Account account);
	
	public int getLoan(long loanId,int lamt);
	public int payLoan(long loanId,int lamt);
	public Loan showLoanDetails(long loanId);
}
