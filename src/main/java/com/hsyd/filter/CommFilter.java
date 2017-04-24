package com.hsyd.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest r = (HttpServletRequest) request;
		String uri = r.getRequestURI();
		System.out.println("请求路径:	" + uri);
		//获取session，
		//Object attribute = r.getSession().getAttribute("logininfo");
//		if (uri.indexOf("login") == -1) { 
//			if (attribute == null) {
//				r.getRequestDispatcher("/index.jsp").forward(
//						r, response);
//				return ;
//			}
//		}
		chain.doFilter(r, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
