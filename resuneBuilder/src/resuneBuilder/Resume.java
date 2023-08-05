package resuneBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Resume {

	private JFrame frame;
	private JTextField ftname;
	private JTextField ltname;
	private JTextField cno;
	private JTextField ct;
	private JTextField st;
	private JTextField eid;
	private JTextField scname;
	private JTextField spyr;
	private JTextField sper;
	private JTextField clgname;
	private JTextField clgpyr;
	private JTextField clgper;
	private JTextField compname;
	private JTextField jtitle;
	private JTextField yoexp;
	private JTextField skill;
	private JTextField achiev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resume window = new Resume();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Resume() {
		initialize();
		Connect();
	}
	

	Connection con;
	PreparedStatement pat;
	public void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/resume", "root","");
		}
		catch (ClassNotFoundException ex) {
			
		}
		catch (SQLException ex) {
			
		}
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(90, 90, 960, 899);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 926, 774);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resume Builder");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(375, 23, 181, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Personal Information:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 60, 263, 39);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(40, 101, 134, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(346, 101, 134, 30);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Contact No.");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(654, 101, 134, 30);
		panel.add(lblNewLabel_2_2);
		
		ftname = new JTextField();
		ftname.setBackground(Color.WHITE);
		ftname.setBounds(50, 141, 146, 30);
		panel.add(ftname);
		ftname.setColumns(10);
		
		ltname = new JTextField();
		ltname.setColumns(10);
		ltname.setBounds(346, 141, 156, 30);
		panel.add(ltname);
		
		cno = new JTextField();
		cno.setColumns(10);
		cno.setBounds(687, 141, 156, 30);
		panel.add(cno);
		
		JLabel lblNewLabel_3 = new JLabel("City");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(40, 194, 109, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("State");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(346, 194, 109, 22);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Email Id");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(654, 194, 109, 22);
		panel.add(lblNewLabel_3_1_1);
		
		ct = new JTextField();
		ct.setBounds(50, 226, 156, 30);
		panel.add(ct);
		ct.setColumns(10);
		
		st = new JTextField();
		st.setColumns(10);
		st.setBounds(346, 226, 156, 30);
		panel.add(st);
		
		eid = new JTextField();
		eid.setColumns(10);
		eid.setBounds(687, 226, 169, 30);
		panel.add(eid);
		
		JLabel lblNewLabel_4 = new JLabel("Eduactional Information");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(30, 290, 274, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("School Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(40, 329, 134, 22);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Passing Year");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(334, 329, 146, 22);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Percentage");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(654, 325, 134, 30);
		panel.add(lblNewLabel_7);
		
		scname = new JTextField();
		scname.setBounds(50, 361, 156, 30);
		panel.add(scname);
		scname.setColumns(10);
		
		spyr = new JTextField();
		spyr.setColumns(10);
		spyr.setBounds(344, 361, 156, 30);
		panel.add(spyr);
		
		sper = new JTextField();
		sper.setColumns(10);
		sper.setBounds(687, 361, 156, 30);
		panel.add(sper);
		
		JLabel lblNewLabel_5_1 = new JLabel("College Name");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(40, 415, 134, 22);
		panel.add(lblNewLabel_5_1);
		
		clgname = new JTextField();
		clgname.setColumns(10);
		clgname.setBounds(50, 447, 156, 30);
		panel.add(clgname);
		
		JLabel lblNewLabel_6_1 = new JLabel("Passing Year");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6_1.setBounds(334, 415, 146, 22);
		panel.add(lblNewLabel_6_1);
		
		clgpyr = new JTextField();
		clgpyr.setColumns(10);
		clgpyr.setBounds(346, 447, 156, 30);
		panel.add(clgpyr);
		
		JLabel lblNewLabel_7_1 = new JLabel("Percentage");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7_1.setBounds(654, 411, 134, 30);
		panel.add(lblNewLabel_7_1);
		
		clgper = new JTextField();
		clgper.setColumns(10);
		clgper.setBounds(687, 447, 156, 30);
		panel.add(clgper);
		
		JLabel lblNewLabel_8 = new JLabel("Experience");
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(28, 503, 146, 30);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_5_2 = new JLabel("Company Name");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_2.setBounds(40, 543, 166, 22);
		panel.add(lblNewLabel_5_2);
		
		compname = new JTextField();
		compname.setColumns(10);
		compname.setBounds(50, 575, 156, 30);
		panel.add(compname);
		
		JLabel lblNewLabel_6_2 = new JLabel("Job Title");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6_2.setBounds(334, 543, 146, 22);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("Year of Experience");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7_2.setBounds(654, 539, 189, 30);
		panel.add(lblNewLabel_7_2);
		
		jtitle = new JTextField();
		jtitle.setColumns(10);
		jtitle.setBounds(346, 575, 156, 30);
		panel.add(jtitle);
		
		yoexp = new JTextField();
		yoexp.setColumns(10);
		yoexp.setBounds(687, 575, 156, 30);
		panel.add(yoexp);
		
		JLabel lblNewLabel_8_1 = new JLabel("Extra Information");
		lblNewLabel_8_1.setForeground(Color.BLUE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(30, 617, 181, 30);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Skills");
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_2_1.setBounds(40, 657, 166, 22);
		panel.add(lblNewLabel_5_2_1);
		
		skill = new JTextField();
		skill.setColumns(10);
		skill.setBounds(50, 689, 156, 30);
		panel.add(skill);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Achievement ");
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6_2_1.setBounds(334, 657, 146, 22);
		panel.add(lblNewLabel_6_2_1);
		
		achiev = new JTextField();
		achiev.setColumns(10);
		achiev.setBounds(346, 689, 156, 30);
		panel.add(achiev);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fstname,lstname,conNO,cty,stet,emid,schllname,spassyr,spercentage,clgename,cpassyr,cpercentage,comname,jobtitle,yroexp,skil,achievementt;
				fstname= ftname.getText();
				lstname=ltname.getText();
				conNO = cno.getText();
				cty = ct.getText();
				stet =st.getText();
				emid=eid.getText();
				schllname=scname.getText();
				spassyr=spyr.getText();
				spercentage=sper.getText();
				clgename= clgname.getText();
				cpassyr= clgpyr.getText();
				cpercentage=clgper.getText();
				comname=compname.getText();
				jobtitle= jtitle.getText();
				yroexp=yoexp.getText();
				skil=skill.getText();
				achievementt=achiev.getText();
			
				try {
					pat = con.prepareStatement("insert into resume(first_name,last_name,contactno,city,state,email,school_name,pass_year,percentage,college_name,college_pass_year,college_percentage,company_name,job_title,year_of_experience,skills,achievement)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					pat.setString(1, fstname);
					pat.setString(2, lstname);
					pat.setString(3, conNO);
					pat.setString(4, cty);
					pat.setString(5, stet);
					pat.setString(6, emid);
					pat.setString(7, schllname);
					pat.setString(8, spassyr);
					pat.setString(9, spercentage);
					pat.setString(10, clgename);
					pat.setString(11, cpassyr);
					pat.setString(12, cpercentage);
					pat.setString(13, comname);
					pat.setString(14, jobtitle);
					pat.setString(15, yroexp);
					pat.setString(16, skil);
					pat.setString(17, achievementt);
					pat.executeUpdate();
				    JOptionPane.showMessageDialog(null, "Submitted Successfully");
//				    ftname.setText(" ");
//				    ltname.setText(" ");
//				    cno.setText("");
//				    ct.setText("");
//				    st.setText("");
//				    eid.setText("");
//				    scname.setText("");
//				    spyr.setText("");
//				    sper.setText("");
//				    clgname.setText("");
//				    clgpyr.setText("");
//				    clgper.setText("");
//				    compname.setText("");
//				    jtitle.setText("");
//				    yoexp.setText("");
//				    skill.setText("");
//				    achiev.setText("");
				    
				    ftname.requestFocus();
//				    Viewresume v = new  Viewresume();
//				    v.vresume();
				}

				catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(687, 678, 156, 44);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftname.setText(" ");
			    ltname.setText(" ");
			    cno.setText("");
			    ct.setText("");
			    st.setText("");
			    eid.setText("");
			    scname.setText("");
			    spyr.setText("");
			    sper.setText("");
			    clgname.setText("");
			    clgpyr.setText("");
			    clgper.setText("");
			    compname.setText("");
			    jtitle.setText("");
			    yoexp.setText("");
			    skill.setText("");
			    achiev.setText("");
			    
			    ftname.requestFocus();
			}
		});
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(687, 622, 156, 44);
		panel.add(btnReset);
		
		JButton btnNewButton_1 = new JButton("pdf");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generatepdf g = new Generatepdf();
				g.gpdf();;
				 JOptionPane.showMessageDialog(null, "PDF Generated Successfully");
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(543, 678, 134, 44);
		panel.add(btnNewButton_1);
	}
}
