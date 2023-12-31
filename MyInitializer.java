package springmvc.controllers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class MyInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 AnnotationConfigWebApplicationContext dispatcherContext =new AnnotationConfigWebApplicationContext();
	      dispatcherContext.register(MyConfig.class);

	      // Register and map the dispatcher servlet
	      ServletRegistration.Dynamic dispatcher =servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
	      dispatcher.addMapping("/");
	}

}
