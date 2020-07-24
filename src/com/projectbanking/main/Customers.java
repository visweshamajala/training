package com.projectbanking.main;


import java.util.Scanner;
import com.projectbanking.bean.Account;
import com.projectbanking.bean.Loan;
import com.projectbanking.bean.Address;
import com.projectbanking.bean.Transaction;

import com.projectbanking.service.BankService;

import com.projectbanking.service.BankServiceImp;

public class Customers {

	public static void main(String[] args) {
		
		Transaction account =null;
		
		BankService service = null;
		
		service = new BankServiceImp();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice");
			System.out.println(" 1. Create account");
			System.out.println(" 2. Deposit");
			System.out.println(" 3. Withdraw");
			System.out.println(" 4. ShowAccountDetails");
			System.out.println(" 5.  GetLoan");
			System.out.println(" 6.  PayLoan");
			System.out.println(" 7. ShowLoanDetails");
			System.out.println(" 8. Exit");
			switch(sc.nextInt()) {
			case 1 :
					account = new Transaction();
					while(true) {
					System.out.println("Enter account Id");
					String accountId = sc.next();
					if(service.validateAccountId(accountId)) {	
						account.setAccountId(accountId);
						break;
						}else {
							System.out.println("Entered account No. is not in valid format");
							return;
						}
					}		//accountID
					
					while(true) {
						System.out.println("Enter user name");
						String custname = sc.next();
						if(service.validateAccountName(custname)) {
							account.setAccountName(custname);
							break;
						}else {
							System.out.println("Entered Name is not in valid format");
							return;	
						}
					}		//accountName
					System.out.println("Enter address: ");
					System.out.println("Enter City ");
					String city = sc.next();
					System.out.println("Enter State ");
					String state = sc.next();
					Address address = new Address(city,state);
					account.setAddres(address);
					
					System.out.println("Enter deposit amount");
					account.setDepositAmount(sc.nextInt());
					
					System.out.println(" Applying Loans...");
					System.out.println("1 for Yes \n 2 for No :");
					int ch = sc.nextInt();
					if(ch==1) {
						System.out.println("Enter loanId");
						account.setLoanId(sc.nextLong());
						
						System.out.println("Enter loan Type \n Home\t Car \t  Education");
						System.out.println("Loan Type must be any of three");
						account.setLoanType(sc.next());
						
						System.out.println("Enter loan amount");
						account.setLoanAmount(sc.nextInt());
						
						//System.out.println("");
						
					}
					System.out.println("Account is created");
					service.createAccount(account);break;
					
			case 2:
					System.out.println("Enter accountId :");
					String accId = sc.next();
					System.out.println("Enter amount :");
					int amt = sc.nextInt();
					int bal=service.depositAmount(accId, amt);
					System.out.println("New balance :"+bal);
					break;
					
			case 3:
					System.out.println("Enter accountId :");
					String accIdw = sc.next();
					System.out.println("Enter amount :");
					int amtw = sc.nextInt();
					int balw=service.withdrawAmount(accIdw, amtw);
					System.out.println("New balance :"+balw);
					break;
					
			case 4:
					System.out.println("Enter AccountId :");
					String acnt = sc.next();
					Account act = service.showAccountDetails(acnt);
					if(act!=null) {
						System.out.println(act);
						break;
					}else {
						System.out.println("Not found");
						break;
					}
					
			case 5:
					System.out.println("Enter amount of loan: ");
					int lamt = sc.nextInt();
					System.out.println("Enter loanId : ");
					long lid = sc.nextLong();
					int lbal = service.getLoan(lid, lamt);
					System.out.println(lbal+" loan amount got");
					break;
			
			case 6:
					System.out.println("Enter amount : ");
					int plamt = sc.nextInt();
					System.out.println("Enter loanId : ");
					long plid = sc.nextLong();
					int plbal = service.payLoan(plid, plamt);
					System.out.println("paid loan amount "+plbal);
					break;
					
			case 7:
					System.out.println("Enter loanId : ");
					long lId = sc.nextLong();
					Loan loan = service.showLoanDetails(lId);
					if(loan!=null)
						System.out.println("Loan Id ="+loan.getLoanId()+" Loan type = "+loan.getLoanType()+" Loan Amount = "+loan.getLoanAmount());
					else
						System.out.println("loanId not matched");
					
					break;
					
			case 8:
					System.out.println("Thank you!");
					break;
			}
		}

		

	}

}
