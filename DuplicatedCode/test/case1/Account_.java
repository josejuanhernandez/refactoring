package case1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.time.LocalDate;

public class Account_ {
	
	@Test
	public void should_initialize_balance_to_0() {
		Account account = new Account();
		assertEquals(0, account.getBalance(), 0);
		assertEquals(null, account.getLastTransactionDate());
	}
	
	@Test
	public void should_allow_debit_transaction() {
		Account account = new Account();
		account.debit(1000);
		assertEquals(1000, account.getBalance(), 0.001);
		assertEquals(LocalDate.now(), account.getLastTransactionDate());
	}

	@Test
	public void should_allow_debit_transactions() {
		Account account = new Account();
		account.debit(310.15);
		account.debit(532.30);
		assertEquals(842.45, account.getBalance(), 0.001);
		assertEquals(LocalDate.now(), account.getLastTransactionDate());
	}

	@Test
	public void should_allow_credit_transaction() {
		Account account = new Account();
		account.credit(1000);
		assertEquals(-1000, account.getBalance(), 0.001);
		assertEquals(LocalDate.now(), account.getLastTransactionDate());
	}
	
	@Test
	public void should_allow_transactions() {
		Account account = new Account();
		account.debit(2000);
		account.credit(45.10);
		account.credit(545.15);
		assertEquals(1409.75, account.getBalance(), 0.001);
		assertEquals(LocalDate.now(), account.getLastTransactionDate());
	}	


}
