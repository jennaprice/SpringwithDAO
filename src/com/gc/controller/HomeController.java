package com.gc.controller;
import com.gc.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gc.doa.Dao;
import com.gc.doa.DaoJDBCImpl;

import java.sql.*; //Step one- requires the maven dependancy
import java.util.ArrayList;
import java.util.List;

/*
 * author: Jenna Price
 */

@Controller
public class HomeController {
	
	@RequestMapping("/list")
	public ModelAndView getAllItems(String id) {
		
		Dao daobj = new DaoJDBCImpl();
		List<ItemDto> list = daobj.listAll();
		return new ModelAndView("","", list);
	}
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(Model model) throws ClassNotFoundException, SQLException{

		//pre work for Step 3 
		String url ="jdbc:mysql://localhost:3306/northwind";
		String username="jennaprice";
		String password = "jennaprice";
		
		//Step 2: Load and Register Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step 3: Create Connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		//Step 4: Create a statement- gives the ability to execute a sql statement
		Statement st = con.createStatement();
		
		//Step 5: Retrieve the results from the database
		String queryString = "SELECT * from products";
		ResultSet rs = st.executeQuery(queryString);
		

		ArrayList<String> dataBaseinfo = new ArrayList<>(0);
		//Step 6: process results from database
		while(rs.next()) {//We need to use this to get past the column headers -- may throw error
		String productId= rs.getString(1);
		String productName= rs.getString(2);
		String supplierId= rs.getString(3);
		
		dataBaseinfo.add(productId + ", " + productName + ", " + supplierId);
		}
		
		
		return new ModelAndView("welcome", "message", dataBaseinfo);
	}
	
	@RequestMapping(value="/submitform", method=RequestMethod.GET)
	public String addToDB(Model model, @RequestParam("customerID") String custID, @RequestParam("companyName") String compName, @RequestParam("contactName") String contactName) throws ClassNotFoundException, SQLException {
//		//pre work for Step 3
//		System.out.println("Here");
//		String url ="jdbc:mysql://localhost:3306/northwind";
//		String username="jennaprice";
//		String password = "jennaprice";
//		
//		//Step 2: Load and Register Driver
//		Class.forName("com.mysql.jdbc.Driver");
//		
//		//Step 3: Create Connection
//		Connection con = DriverManager.getConnection(url, username, password);
//		String querySql = "insert into customers(CustomerID, CompanyName, ContactName)" +
//				"values('" +custID+ "', '" + compName + "' ,'" + contactName + "')";
//		Statement st= con.createStatement();
//		int rowCount = st.executeUpdate(querySql);
		model.addAttribute("messageTest", custID + " " + compName + " " + contactName);
		return "testing";
	}
	
}