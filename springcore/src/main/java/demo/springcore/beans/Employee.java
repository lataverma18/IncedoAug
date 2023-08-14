package demo.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("emp1")
@Scope("prototype")
public class Employee implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware
{

	private int empId;
	private String empName;
	private int empSalary;
	
	private Address empAddress;
	
	@Autowired
	public Employee(@Value("101") int empId,@Value("Ronit") String empName, @Value("45000") int empSalary, Address empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		System.out.println("Employee is Registered!!!");
	}


	public Address getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public void greet()
	{
		System.out.println("Hello Everyone, Welcome to Incedo!!!");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}

	
	  @Override public void destroy() throws Exception {
	  System.out.println("DisposableBean : destroy ");
	  
	  }
	  
	  
	  @Override public void afterPropertiesSet() throws Exception {
	  System.out.println("InitializingBean : After Properties Set");
	  
	  }
	 
	@PostConstruct
	public void myInit()
	{
		System.out.println("My Init Method");
	}
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("My Destroy Method");
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("BeanFactoryAware: "+beanFactory);
	}


	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name Aware: "+name);
		
	}
}
