package com.linzi.EndcodingFilter.EndcodingFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 全局的编码过滤器，
 * @author PCPC
 *
 */
public class CharSetFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * 这里实现了对全局request 的过滤，
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		System.out.println("filter is running");
		arg0.setCharacterEncoding("utf-8");
		arg1.setContentType("text/html;charset=utf-8");
		CharSetRequest charSetRequest=new CharSetRequest((HttpServletRequest) arg0);
		arg2.doFilter(charSetRequest, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
