package A_in.kanha.about;

//===============
//XML and JAX-B
//===============
//
//-> XML stands for Extensible Markup Language
//
//-> XML is intereoperable
//
//-> XML will represent data in element format
//
//	Ex:	<id>101</id>
//
//-> Every element is combination of start tag and end tag
//
//-> In XML we have 2 types of elements
//
//	1) Simple Elements
//	2) Compound Elements
//
//
//<person>
//  <id>101</id>
//  <name>smith</name>
//  <address>
//		<city>Hyd</city>
//       <state>TG</state>
//  </address> 
//</person>
//
//
//-> Elements which contains data directly are called as Simple Elements
//		
//			 <id>101</id>
// 			 <name>smith</name>
//			 <city>Hyd</city>
//       		 <state>TG</state>
//
//-> Elements which contains child elements are called as compound elements
//
//		<person>
//		<address>
//
//
//==========
//JAX-B API
//===========
//
//-> JAX-B Stands for Java Architecture For XML Binding
//
//-> Using JAX-B API we can convert xml data to java object and vice versa
//
//
//Marshalling : Converting java obj to xml 
//
//Un-Marshalling : Converting xml to java obj
//
//Note: To perform marshalling or Un-marshalling we need to create Binding class first.
//
//
//
//Note: Upto JDK 1.8v, JAX-B is part of JDK itself. But from Java 1.9 version it is not part of JDK.
//
//-> If we want to work with JAX-B api from java 1.9v then we have to add dependency in pom.xml file
//
//
//=======================
//Working with JAX-B API
//=======================
//
//
//1) Create maven quick-start project
//
//2) Add below dependencies
//
//	<dependency>
//			<groupId>org.projectlombok</groupId>
//			<artifactId>lombok</artifactId>
//			<version>1.18.26</version>
//		</dependency>
//		<dependency>
//			<groupId>com.sun.xml.bind</groupId>
//			<artifactId>jaxb-core</artifactId>
//			<version>2.3.0.1</version>
//		</dependency>
//		<dependency>
//			<groupId>javax.xml.bind</groupId>
//			<artifactId>jaxb-api</artifactId>
//			<version>2.3.1</version>
//		</dependency>
//		<dependency>
//			<groupId>com.sun.xml.bind</groupId>
//			<artifactId>jaxb-impl</artifactId>
//			<version>2.3.1</version>
//		</dependency>
//		<dependency>
//			<groupId>org.javassist</groupId>
//			<artifactId>javassist</artifactId>
//			<version>3.25.0-GA</version>
//		</dependency>
//
//
//3) Create binding class (represent xml structure)
//
//
//@Data
//@XmlRootElement
//public class Customer {
//
//	private Integer id;
//	private String name;
//	private String email;
//	private Long phno;
//
//}
//
//4) Create Converter classes
public class Test {

	
}
