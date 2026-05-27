package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UTF8_EncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//전
		request.setCharacterEncoding("UTF-8");
		System.out.println("[FILETER] UTF8_EncodingFilter FILTER START..");
		chain.doFilter(request, response);
		
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("[FILETER] UTF8_EncodingFilter FILTER START..");
		//후
	}

}
