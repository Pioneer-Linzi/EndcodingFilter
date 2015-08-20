package com.linzi.EndcodingFilter.EndcodingFilter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 利用装钸者模式，我们对httpservletRequestWrapper 中的 getparameter 进行了重写，这样我们就可以
 * 改变Request 中的编码格式了，以达到全局的编码过滤的效果
 * @author PCPC
 *
 */

public class CharSetRequest extends HttpServletRequestWrapper {

	public CharSetRequest(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * 对getParameter 的方法就行了重写，我们打这里的参数中的内容都进行了编码格式的转换，
	 */
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		String value = super.getParameter(name);
		if (getMethod().equalsIgnoreCase("GET")) {
			try {
				value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}

}
