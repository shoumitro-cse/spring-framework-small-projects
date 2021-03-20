package com.javatpoint;  
import java.util.List;  
import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.JpaTemplate;  
import org.springframework.transaction.annotation.Transactional;  

@Transactional  
public class AccountsDao {
    
    JpaTemplate template;  
  
    public void setTemplate(JpaTemplate template) {  
        this.template = template;  
    }
    
      
    public void createAccount(int accountNumber, String owner, double balance) throws DataAccessException {  
        Account account = new Account(accountNumber,owner,balance);  
        template.persist(account);  
    }
    
      
    public void updateBalance(int accountNumber, double newBalance) throws DataAccessException {
        
        Account account = template.find(Account.class, accountNumber);  
        if(account != null){  
            account.setBalance(newBalance);  
        }  
        template.merge(account);  
    }
    
      
    public void deleteAccount(int accountNumber) throws DataAccessException {  
        Account account = template.find(Account.class, accountNumber);  
        if(account != null)  
            template.remove(account);  
    } 
    
     
    public List<Account> getAllAccounts() throws DataAccessException {  
        List<Account> accounts =template.find("select acc from Account acc");  
        return accounts;  
    } 
     
}  
