package com.projectbanking.service;

import com.projectbanking.bean.Account;
import com.projectbanking.bean.Loan;

public interface BankService {
	
	public boolean validateAccountId(String id);
	public boolean validateAccountName(String name);
	
	public int depositAmount(String accId,int amt);
	public int withdrawAmount(String accId,int amt);
	public Account showAccountDetails(String accountNo);
	public void createAccount(Account account);
	
	public int getLoan(long loanId,int lamt);
	public int payLoan(long loanId,int lamt);
	public Loan showLoanDetails(long loanId);
}
