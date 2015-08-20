1.   全局过滤器的使用，
	说明：这个过滤器是将requeset 中的编码转为utf-8;
	原来的格式为 ISO-8859-1；
	下面是web.xml 中的配置方件
	
	web.xml
		  <filter>
  <filter-name>endcodingFilter</filter-name>
  <filter-class>com.linzi.EndcodingFilter.EndcodingFilter.CharSetFilter</filter-class>
  </filter>
  <filter-mapping>
  <filter-name>
  endcodingFilter
  </filter-name>
  <url-pattern>/*</url-pattern>
  </filter-mapping>