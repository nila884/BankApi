package com.nila.BankApi.service.helper;


import com.nila.BankApi.domain.*;
import com.nila.BankApi.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Component
public class BankingServiceHelper {

//	public RoleDetail convertToRoleDetail(Role role){
//		return RoleDetail.builder()
//				.name(role.getName())
//				.build();
//	}

//	private Collection<RoleDetail> convertRoleCollectionToRoleDetail(Collection<Role> roles){
//
//	}
	public LoginDetail convertToLoginDetail(Login login){
//		Collection<RoleDetail> rolesDetails= new ArrayList<>();
//		login.getRoles().forEach(role -> {
//		 RoleDetail roleDetail=	convertToRoleDetail(role);
//		 rolesDetails.add(roleDetail);
//		});
		return LoginDetail.builder()
				.email(login.getEmail())
				.password(login.getPassword())
				.roles(login.getRoles())
				.build();
	}

	public CustomerDetails convertToCustomerDomain(Customer customer) {

		return CustomerDetails.builder()
				.firstName(customer.getFirstName())
				.middleName(customer.getMiddleName())
				.lastName(customer.getLastName())
				.customerNumber(customer.getCustomerNumber())
				.status(customer.getStatus())
				.contactDetails(convertToContactDomain(customer.getContactDetails()))
				.customerAddress(convertToAddressDomain(customer.getCustomerAddress()))
				.build();
	}

	public Customer convertToCustomerEntity(CustomerDetails customerDetails) {


		return Customer.builder()
				.firstName(customerDetails.getFirstName())
				.middleName(customerDetails.getMiddleName())
				.lastName(customerDetails.getLastName())
				.customerNumber(customerDetails.getCustomerNumber())
				.status(customerDetails.getStatus())
				.contactDetails(convertToContactEntity(customerDetails.getContactDetails()))
				.customerAddress(convertToAddressEntity(customerDetails.getCustomerAddress()))
				.build();
	}

	public AccountInformation convertToAccountDomain(Account account) {

		return AccountInformation.builder()
				.accountType(account.getAccountType())
				.accountBalance(account.getAccountBalance())
				.accountNumber(account.getAccountNumber())
				.accountStatus(account.getAccountStatus())
				.bankInformation(convertToBankInfoDomain(account.getBankInformation()))
				.build();
	}

	public Account convertToAccountEntity(AccountInformation accInfo) {

		return Account.builder()
				.accountType(accInfo.getAccountType())
				.accountBalance(accInfo.getAccountBalance())
				.accountNumber(accInfo.getAccountNumber())
				.accountStatus(accInfo.getAccountStatus())
				.bankInformation(convertToBankInfoEntity(accInfo.getBankInformation()))
				.build();
	}

	public AddressDetails convertToAddressDomain(Address address) {

		return AddressDetails.builder().address1(address.getAddress1())
				.address2(address.getAddress2())
				.city(address.getCity())
				.state(address.getState())
				.zip(address.getZip())
				.country(address.getCountry())
				.build();
	}

	public Address convertToAddressEntity(AddressDetails addressDetails) {

		return Address.builder().address1(addressDetails.getAddress1())
				.address2(addressDetails.getAddress2())
				.city(addressDetails.getCity())
				.state(addressDetails.getState())
				.zip(addressDetails.getZip())
				.country(addressDetails.getCountry())
				.build();
	}

	public ContactDetails convertToContactDomain(Contact contact) {

		return ContactDetails.builder()
				.emailId(contact.getEmailId())
				.homePhone(contact.getHomePhone())
				.workPhone(contact.getWorkPhone())
				.build();
	}

	public Contact convertToContactEntity(ContactDetails contactDetails) {

		return Contact.builder()
				.emailId(contactDetails.getEmailId())
				.homePhone(contactDetails.getHomePhone())
				.workPhone(contactDetails.getWorkPhone())
				.build();
	}

	public BankInformation convertToBankInfoDomain(BankInfo bankInfo) {

		return BankInformation.builder()
				.branchCode(bankInfo.getBranchCode())
				.branchName(bankInfo.getBranchName())
				.routingNumber(bankInfo.getRoutingNumber())
				.branchAddress(convertToAddressDomain(bankInfo.getBranchAddress()))
				.build();
	}

	public BankInfo convertToBankInfoEntity(BankInformation bankInformation) {

		return BankInfo.builder()
				.branchCode(bankInformation.getBranchCode())
				.branchName(bankInformation.getBranchName())
				.routingNumber(bankInformation.getRoutingNumber())
				.branchAddress(convertToAddressEntity(bankInformation.getBranchAddress()))
				.build();
	}

	public TransactionDetails convertToTransactionDomain(Transaction transaction) {

		return TransactionDetails.builder()
				.txAmount(transaction.getTxAmount())
				.txDateTime(transaction.getTxDateTime())
				.txType(transaction.getTxType())
				.accountNumber(transaction.getAccountNumber())
				.build();
	}

	public Transaction convertToTransactionEntity(TransactionDetails transactionDetails) {

		return Transaction.builder()
				.txAmount(transactionDetails.getTxAmount())
				.txDateTime(transactionDetails.getTxDateTime())
				.txType(transactionDetails.getTxType())
				.accountNumber(transactionDetails.getAccountNumber())
				.build();
	}

	public Transaction createTransaction(TransferDetails transferDetails, Long accountNumber, String txType) {

		return Transaction.builder()
				.accountNumber(accountNumber)
				.txAmount(transferDetails.getTransferAmount())
				.txType(txType)
				.txDateTime(new Date())
				.build();
	}
}
