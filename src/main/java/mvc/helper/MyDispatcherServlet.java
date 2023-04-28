package mvc.helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] x = { MyConfiguration.class };
		return x;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] x = { "/" };
		return x;
	}

}
