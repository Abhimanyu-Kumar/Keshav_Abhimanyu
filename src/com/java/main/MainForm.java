package com.java.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

/**
 * @author Abhimanyu kumar
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;
import javax.swing.border.MatteBorder;

import com.java.swingExample.ABOUT;
import com.java.swingExample.ChangePassword;
import com.java.swingExample.ChangeUsername;
import com.java.swingExample.DBConnection;
import com.java.swingExample.Details_Customer;
import com.java.swingExample.Details_Items;
import com.java.swingExample.EditCustomer;
import com.java.swingExample.EditItem;
import com.java.swingExample.SearchItem;
import com.java.swingExample.Search_customer;



public class MainForm extends JFrame {

	Statement st;
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	HashMap<String,Object> hmap=null;

	public MainForm() {
		setTitle("BILLING MANAGEMENT SYSTEM      GST SOFTWARE");
		con = DBConnection.getCon();
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                setResizable(false);
                
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from company_master");
			if (rs != null && rs.next()) {
				hmap=new HashMap<>();
				hmap.put("name", rs.getString("company_name"));
				hmap.put("address1", rs.getString("company_add1"));
				hmap.put("address2", rs.getString("company_add2"));
				hmap.put("address3", rs.getString("company_add3"));
				hmap.put("telephone", rs.getString("company_telephone"));
				hmap.put("mobile", rs.getString("company_mobile"));
				hmap.put("website", rs.getString("company_website"));
				hmap.put("emailId", rs.getString("company_emailid"));
				hmap.put("gstNo", rs.getString("company_gstno"));
				hmap.put("tinNo", rs.getString("company_tinno"));
				hmap.put("logoPath", rs.getBytes("company_logo_path"));
			}
			System.out.println("hmap  "+hmap);
		} catch (Exception ex) {
			Logger.getLogger(BillChallanFrame.class.getName()).log(Level.SEVERE, null, ex);
		}

		initComponents();
	}

	private BufferedImage createImageFromBytes(byte[] imageData) {
		   ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
		   try {
		       return ImageIO.read(bais);
		   } catch (IOException e) {
		       throw new RuntimeException(e);
		   }
		}
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jDesktopPane1 = new JDesktopPane();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jMenuBar1 = new JMenuBar();
		jMenu1 = new JMenu();
		jMenuItem1 = new JMenuItem();
		jMenuItem2 = new JMenuItem();
		jMenuItem3 = new JMenuItem();
		jMenu3 = new JMenu();
		jMenuItem4 = new JMenuItem();
		jMenuItem5 = new JMenuItem();
		jMenuItem6 = new JMenuItem();
		jMenuItem7 = new JMenuItem();
		jMenu2 = new JMenu();
		jMenuItem8 = new JMenuItem();
		jMenuItem9 = new JMenuItem();
		jMenu4 = new JMenu();
		jMenuItem10 = new JMenuItem();
		jMenuItem11 = new JMenuItem();
		jMenu5 = new JMenu();
		jMenuItem13 = new JMenuItem();
		jMenuItem14 = new JMenuItem();
		jMenu6 = new JMenu();
		jMenuItem15 = new JMenuItem();
		jMenu7 = new JMenu();
		jMenuItem12 = new JMenuItem();
		jMenuItem16 = new JMenuItem();

		headerPanel = new JPanel();
		compNameLabel = new JLabel();
		compAddress1Label = new JLabel();
		compAddress2Label = new JLabel();
		compEmailLabel = new JLabel();
		compAddress3Label = new JLabel();
		compLandlineLabel = new JLabel();
		compGstLabel = new JLabel();
		compTinLabel = new JLabel();
		compLogoLabel = new JLabel();
		compMobileLabel = new JLabel();
		compWebsiteLabel = new JLabel();
		welcomeLabel = new JLabel();
		
		welcomeLabel.setText("Welcome to GST");
		welcomeLabel.setBackground(new Color(60,50,100));
		welcomeLabel.setForeground(Color.BLUE);
		welcomeLabel.setFocusable(true);
		welcomeLabel.setBounds(350, 80, 700, 100);
		welcomeLabel.setFont(new Font("Monotype Corsiva",Font.BOLD, 80));
		jDesktopPane1.add(welcomeLabel);
		
		JButton createCompanyButton = new JButton("Create Company");
		createCompanyButton.setBackground(new Color(59, 89, 182));
		createCompanyButton.setForeground(Color.WHITE);
		createCompanyButton.setBounds(550, 250, 200, 60);
		createCompanyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateCompanyForm companyForm = new CreateCompanyForm();
				jDesktopPane1.add(companyForm);
				companyForm.setVisible(true);
			}
		});
		jDesktopPane1.add(createCompanyButton);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);

		jDesktopPane1.setName("jDesktopPane1"); // NOI18N

		jPanel1.setBackground(new java.awt.Color(204, 255, 204));
		jPanel1.setBorder(new MatteBorder(null));
		jPanel1.setName("jPanel1"); // NOI18N

		headerPanel.setBackground(new java.awt.Color(204, 255, 204));
		headerPanel.setBorder(new MatteBorder(null));
		headerPanel.setName("headerPanel"); // NOI18N

		if(hmap!=null) {
			createCompanyButton.setVisible(false);
			welcomeLabel.setVisible(false);
			String address = "<html>"+hmap.get("address1")+"<br/>"+hmap.get("address2")+"<br/>"+hmap.get("address3")+"</html>";
			System.out.println("Address : "+address); 
			compNameLabel.setText("Name : "+hmap.get("name"));
			compAddress1Label.setText("Address1 : "+hmap.get("address1"));
			compAddress2Label.setText("Address2 : "+hmap.get("address2"));
			compAddress3Label.setText("Address3 : "+hmap.get("address3"));
			compEmailLabel.setText("Email : "+hmap.get("emailId"));
			compLandlineLabel.setText("Landline : "+hmap.get("companyTelephone"));
			compMobileLabel.setText("Mobile : "+hmap.get("mobile"));
			compGstLabel.setText("GST no : "+hmap.get("gstNo"));
			compTinLabel.setText("TIN No : "+hmap.get("tinNo"));
			compWebsiteLabel.setText("Web : "+hmap.get("website"));
			BufferedImage icon = null;
			icon =  createImageFromBytes((byte[]) hmap.get("logoPath"));
			compLogoLabel = new JLabel(new ImageIcon(icon));
			compLogoLabel.setVisible(true);
		}
		
		
		
//	Abhimanyu_Changes 		
		compLogoLabel.setBounds(1100, 10, 300, 200);
		compNameLabel.setBounds(1000, 210, 300, 30);
		compNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compAddress1Label.setBounds(1000, 240, 350, 30);
		compAddress1Label.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compAddress2Label.setBounds(1000, 270, 300, 30);
		compAddress2Label.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compAddress3Label.setBounds(1000, 300, 300, 30);
		compAddress3Label.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compEmailLabel.setBounds(1000, 330, 300, 30);
		compEmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compGstLabel.setBounds(1000, 360, 300, 30);
		compGstLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compLandlineLabel.setBounds(1000, 390, 300, 30);
		compLandlineLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compTinLabel.setBounds(1000, 420, 300, 30);
		compTinLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compMobileLabel.setBounds(1000, 450, 300, 30);
		compMobileLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		compWebsiteLabel.setBounds(1000, 480, 300, 30);
		compWebsiteLabel.setFont(new java.awt.Font("Segoe UI", 1, 20));
		jDesktopPane1.add(compLogoLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compNameLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compAddress1Label, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compAddress2Label, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compAddress3Label, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compEmailLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compGstLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compTinLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compLandlineLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compMobileLabel, JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.add(compWebsiteLabel, JLayeredPane.DEFAULT_LAYER);
		
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE));

		jPanel1.setBounds(0, 0, 1370, 750);
		jDesktopPane1.add(jPanel1, JLayeredPane.DEFAULT_LAYER);

		// jDesktopPane1.add(jPanel1);

		jMenuBar1.setBorder(new MatteBorder(null));
		jMenuBar1.setName("jMenuBar1"); // NOI18N

		jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu1.setLabel("Add");
		jMenu1.setName("jMenu1"); // NOI18N

		jMenuItem1.setAccelerator(
				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem1.setText("Add Customer");
		jMenuItem1.setName("jMenuItem1"); // NOI18N
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuItem2.setAccelerator(
				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem2.setText("Add Bill Challan");
		jMenuItem2.setName("jMenuItem2"); // NOI18N
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setAccelerator(
				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem3.setText("Add Invoice Form");
		jMenuItem3.setName("jMenuItem3"); // NOI18N
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);

		jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu3.setLabel("View");
		jMenu3.setName("jMenu3"); // NOI18N

		jMenuItem4.setAccelerator(
				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem4.setText("Customers");
		jMenuItem4.setName("jMenuItem4"); // NOI18N
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuItem5.setAccelerator(
				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
		jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem5.setText("Items");
		jMenuItem5.setName("jMenuItem5"); // NOI18N
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem5);

		jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem6.setText("Search Customer");
		jMenuItem6.setName("jMenuItem6"); // NOI18N
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem6);

		jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem7.setText("Search Item");
		jMenuItem7.setName("jMenuItem7"); // NOI18N
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem7);

		jMenuBar1.add(jMenu3);

		jMenu2.setText("Edit");
		jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu2.setName("jMenu2"); // NOI18N

		jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem8.setText("Edit Customers");
		jMenuItem8.setName("jMenuItem8"); // NOI18N
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem8);

		jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem9.setText("Edit Items");
		jMenuItem9.setName("jMenuItem9"); // NOI18N
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem9);

		jMenuBar1.add(jMenu2);

		jMenu4.setText("Tools");
		jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu4.setName("jMenu4"); // NOI18N
		jMenu4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu4ActionPerformed(evt);
			}
		});

		jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem10.setText("Calculator");
		jMenuItem10.setName("jMenuItem10"); // NOI18N
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem10ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem10);

		jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem11.setText("Notepad");
		jMenuItem11.setName("jMenuItem11"); // NOI18N
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem11ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem11);

		jMenuBar1.add(jMenu4);

		jMenu5.setText("Setting");
		jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu5.setName("jMenu5"); // NOI18N

		jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem13.setText("Change Username");
		jMenuItem13.setName("jMenuItem13"); // NOI18N
		jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem13ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem13);

		jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem14.setText("Change Password");
		jMenuItem14.setName("jMenuItem14"); // NOI18N
		jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem14ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem14);

		jMenuBar1.add(jMenu5);

		jMenu6.setText("Help");
		jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu6.setName("jMenu6"); // NOI18N

		jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem15.setText("About");
		jMenuItem15.setName("jMenuItem15"); // NOI18N
		jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem15ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem15);

		jMenuBar1.add(jMenu6);

		jMenu7.setText("Report");
		jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenu7.setName("jMenu7"); // NOI18N
		jMenu7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu7ActionPerformed(evt);
			}
		});

		jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem12.setText("All Customers");
		jMenuItem12.setName("jMenuItem12"); // NOI18N
		jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// jMenuItem12ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem12);

		jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jMenuItem16.setText("All Items");
		jMenuItem16.setName("jMenuItem16"); // NOI18N
		jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// jMenuItem16ActionPerformed(evt);
			}
		});
		jMenu7.add(jMenuItem16);

		jMenuBar1.add(jMenu7);

		setJMenuBar(jMenuBar1);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jDesktopPane1,
				GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jDesktopPane1,
				GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE));

		pack();
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		AddCustomer ac = new AddCustomer();
		jDesktopPane1.add(ac);
		ac.setVisible(true);// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
            BillChallanFrame bcf=new BillChallanFrame();
            jDesktopPane1.add(bcf);
            bcf.setVisible(true);
	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed

		try {
			Details_Customer dc = new Details_Customer();
			jDesktopPane1.add(dc);
			dc.setVisible(true);
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jMenuItem4ActionPerformed

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem5ActionPerformed
		Details_Items di;
		try {
			di = new Details_Items();
			jDesktopPane1.add(di);
			di.setVisible(true);//
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jMenuItem5ActionPerformed

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed
		Search_customer sc;
		try {
			sc = new Search_customer();
			jDesktopPane1.add(sc);
			sc.setVisible(true);
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jMenuItem6ActionPerformed

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem7ActionPerformed
		SearchItem si;
		try {
			si = new SearchItem();
			jDesktopPane1.add(si);
			si.setVisible(true);
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jMenuItem7ActionPerformed

	JDesktopPane getDesktopPane() {
		return jDesktopPane1;
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem8ActionPerformed
		EditCustomer ec;
		try {
			ec = new EditCustomer();
			jDesktopPane1.add(ec);
			ec.setVisible(true);
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jMenuItem8ActionPerformed

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem9ActionPerformed
		EditItem ei;
		try {
			ei = new EditItem();
			jDesktopPane1.add(ei);
			ei.setVisible(true);
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jMenuItem9ActionPerformed

	private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem13ActionPerformed
		ChangeUsername cu = new ChangeUsername();
		jDesktopPane1.add(cu);
		cu.setVisible(true);// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem13ActionPerformed

	private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem14ActionPerformed
		ChangePassword cp = new ChangePassword();
		jDesktopPane1.add(cp);
		cp.setVisible(true);// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem14ActionPerformed

	private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem15ActionPerformed
		ABOUT a = new ABOUT();
		jDesktopPane1.add(a);
		a.setVisible(true);// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem15ActionPerformed

	private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenu7ActionPerformed
		// TODO add your handling code here:
		System.exit(0);
	}// GEN-LAST:event_jMenu7ActionPerformed

	private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem10ActionPerformed

		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("c:/WINDOWS/system32/calc.exe");

		} catch (IOException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jMenuItem10ActionPerformed

	private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem11ActionPerformed

		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("c:/WINDOWS/system32/notepad.exe");

		} catch (IOException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jMenuItem11ActionPerformed

	private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenu4ActionPerformed

	}// GEN-LAST:event_jMenu4ActionPerformed

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
		InvoiceTaxForm ttf = new InvoiceTaxForm();
		jDesktopPane1.add(ttf);
		ttf.setVisible(true);

	}// GEN-LAST:event_jMenuItem3ActionPerformed

	/*
	 * private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt)
	 * {//GEN-FIRST:event_jMenuItem12ActionPerformed try { String Report=
	 * "D:\\java proj\\billing\\Billing_System\\src\\customer.jrxml"; JasperReport
	 * JASP_REP= JasperCompileManager.compileReport(Report); JasperPrint
	 * JASP_PRINT=JasperFillManager.fillReport(JASP_REP, null,con);
	 * JasperViewer.viewReport(JASP_PRINT); } catch(Exception e) {
	 * System.out.println(e); } }//GEN-LAST:event_jMenuItem12ActionPerformed
	 * 
	 * private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt)
	 * {//GEN-FIRST:event_jMenuItem16ActionPerformed try { String Report=
	 * "D:\\java proj\\billing\\Billing_System\\src\\item.jrxml"; JasperReport
	 * JASP_REP= JasperCompileManager.compileReport(Report); JasperPrint
	 * JASP_PRINT=JasperFillManager.fillReport(JASP_REP, null,con);
	 * JasperViewer.viewReport(JASP_PRINT); } catch(Exception e) {
	 * System.out.println(e); } }
	 */// GEN-LAST:event_jMenuItem16ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainForm().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JDesktopPane jDesktopPane1;
	private JLabel jLabel1;
	private JMenu jMenu1;
	private JMenu jMenu2;
	private JMenu jMenu3;
	private JMenu jMenu4;
	private JMenu jMenu5;
	private JMenu jMenu6;
	private JMenu jMenu7;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem10;
	private JMenuItem jMenuItem11;
	private JMenuItem jMenuItem12;
	private JMenuItem jMenuItem13;
	private JMenuItem jMenuItem14;
	private JMenuItem jMenuItem15;
	private JMenuItem jMenuItem16;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem4;
	private JMenuItem jMenuItem5;
	private JMenuItem jMenuItem6;
	private JMenuItem jMenuItem7;
	private JMenuItem jMenuItem8;
	private JMenuItem jMenuItem9;
	private JPanel jPanel1;

//	Abhimanyu_changes
	private JPanel headerPanel;
	private JLabel compNameLabel;
	private JLabel compAddress1Label;
	private JLabel compAddress2Label;
	private JLabel compLogoLabel;
	private JLabel compEmailLabel;
	private JLabel compAddress3Label;
	private JLabel compLandlineLabel;
	private JLabel compGstLabel;
	private JLabel compTinLabel;
	private JLabel compMobileLabel;
	private JLabel compWebsiteLabel;
	private JLabel welcomeLabel;

	// End of variables declaration//GEN-END:variables

}
