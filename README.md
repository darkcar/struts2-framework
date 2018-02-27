# struts2-framework

Learn how to use struts2 framework. 

# Chapter 1 Struts2 Introduction

## Section 1.1 Concepts

1. Introduction

The Struts framework resides in the web-tier. 
Struts applications are hosted by a web container and can make use of services provided by the container, 
such as handling requests via HTTP and HTTPS protocols. 
This frees developers to focus on building applications that solve business problems.

2. Version 

2.3.24

## Section 1.2 Example

1. Import jars: Copying from the struts2-blank.war project in the folder apps of struts2-release.

2. Configuration: 

** Core file location is fixed, and name it 'struts.xml' **

- Include dtd declarations 

```xml
<!DOCTYPE struts PUBLIC
	"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN"
	"http://struts.apache.org/dtds/struts-2.3.dtd">
```

- Write struts configuration

```xml
 <struts>
 	<package name="hellodemo" extends="struts-default" namespace="/">
 		<!-- name: The url name -->
 		<action name="hellostruts" class="com.liyiandxuegang.action.HelloAction">
 			<result name="ok">/index.jsp</result>
 		</action>
 	</package>
 </struts>
```

- Write Filter-mapping (05)

```xml
  <filter>
  	<filter-name>struts2</filter-name>
  	<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
  </filter>
	<filter-mapping>
		<filter-name>struts2</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
```

- Create HelloAction.java

```java
package com.liyiandxuegang.action;

public class HelloAction {
	
	/* 
	 * [Servlet] 1.  Visit servlet, the service() method will be executed.
	 * 
	 * [Struts2] 2. Similarly, there is a method called execute().
	 *  
	 */
	public String execute() {
		System.out.println("Run through here");
		return "ok";
	}
}
```

![How struts2 work?](https://raw.githubusercontent.com/darkcar/struts2-framework/master/resources/how_struts_work.jpeg)


## Section 1.3 

# Chapter 2 Struts2 Data Management

# Chapter 3 Struts2 Value Stack 

# Chapter 4 Struts2 Interceptor 