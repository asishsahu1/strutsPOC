package com.sf.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;

import com.sf.form.DoctorActionForm;

public class AddDoctorAction extends org.apache.struts.action.Action{

	    private final static String SUCCESS = "success";
	    private final static String FAILURE = "failure";
	    
		@Override
		public ActionForward execute(org.apache.struts.action.ActionMapping mapping, ActionForm form,
				HttpServletRequest req, HttpServletResponse resp) throws Exception {
			
			 Connection con=null;
			 PreparedStatement pstmt=null;
			 DoctorActionForm action=(DoctorActionForm) form;
			 
			 try {
				 	Class.forName("com.mysql.jdbc.Driver");
					con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice_db","root","root");
					pstmt=con.prepareStatement("INSERT INTO doctor(doctorName,qualification,specialization,experience,age,gender,mobile,emailAddress)VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
					pstmt.setString(1,action.getDoctorName());
					pstmt.setString(2,action.getQualification());
					pstmt.setString(3,action.getSpecialization());
					pstmt.setString(4,action.getExperience());
					pstmt.setString(5,action.getAge());
					pstmt.setString(6,action.getGender());
					pstmt.setString(7,action.getMobile());
					pstmt.setString(8,action.getEmailAddress());
					pstmt.executeUpdate();
			 }catch (SQLException | ClassNotFoundException e) {
	 			e.printStackTrace();
	 		}
			return mapping.findForward(SUCCESS);
		}
}
