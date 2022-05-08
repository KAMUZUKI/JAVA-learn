
import com.mu.domain.Account;
import com.mu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
//        Account ac = accountService.findById(2);
//        System.out.println(ac);

        Account account = new Account();
        account.setName("赵六");
        account.setMoney(26.666);
        accountService.save(account);
        System.out.println(accountService.findById(3));
    }
}
