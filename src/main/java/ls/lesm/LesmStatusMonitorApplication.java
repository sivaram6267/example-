package ls.lesm;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ls.lesm.constants.EntryTypeConstant;
import ls.lesm.model.enums.EmployeeStatus;
import ls.lesm.model.timesheet.EmployeeLeaveBalance;
import ls.lesm.repository.MasterEmployeeDetailsRepository;
import ls.lesm.repository.timesheet.EmployeeLeaveBalanceRepository;
import ls.lesm.service.impl.TimeSheetServiceImpl;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class LesmStatusMonitorApplication extends SpringBootServletInitializer implements CommandLineRunner {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private MasterEmployeeDetailsRepository mrepo;
	@Autowired
	private EmployeeLeaveBalanceRepository lrepo;
	@Autowired
	private TimeSheetServiceImpl tSer;
	
	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LesmStatusMonitorApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(LesmStatusMonitorApplication.class, args);
		
		
	}	
	
	

	
		
	
	@Override
	public void run(String... args) throws Exception{
		
		
		//////////
		/*System.out.println("execution start");
		
		User user=new User();
		
		user.setEmail("user1@gmail.com");
		user.setFirstName("test");
		user.setLastName("user");
		
		user.setPhoneNo("7350957167");
		user.setPassword(bCryptPasswordEncoder.encode("user"));
		user.setUsername("user");
		
		Role role=new Role();
		role.setRoleId(11);
		role.setRoleName("USER");
		
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		System.out.println("exc end");*/
		
		
		
		
		

}
}
