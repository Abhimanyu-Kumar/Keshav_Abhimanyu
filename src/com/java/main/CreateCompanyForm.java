package com.java.main;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.java.swingExample.EditCustomer;

public class CreateCompanyForm extends JInternalFrame {
	Statement st;
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	int i_no=0;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField add1;
	private javax.swing.JTextField add2;
	private javax.swing.JTextField add3;
	private javax.swing.JTextField gst;
	private javax.swing.JTextField eid;
	private javax.swing.JButton exit;
	private javax.swing.JTextField aliasName;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JTextField name;
	private javax.swing.JButton save;
	private javax.swing.JButton stex;
	private javax.swing.JTextField tel;
	private javax.swing.JTextField tin;
	byte[] data=null;
	// End of variables declaration//GEN-END:variables

	public CreateCompanyForm() {
		con =  DBConnection.getCon();
		initComponents();
		
		setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
		setSize(650, 600); 
		setLocation(300, 20);
		setResizable(false);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel7 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		name = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		aliasName = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		add1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		add2 = new javax.swing.JTextField();
		add3 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		eid = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		tin = new javax.swing.JTextField();
		stex = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		gst = new javax.swing.JTextField();
		tel = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		exit = new javax.swing.JButton();
		save = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();

		jPanel7.setName("jPanel7"); // NOI18N

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				);
		jPanel7Layout.setVerticalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				);

		jPanel8.setName("jPanel8"); // NOI18N

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(
				jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				);
		jPanel8Layout.setVerticalGroup(
				jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				);

		jPanel9.setName("jPanel9"); // NOI18N

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(
				jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				);
		jPanel9Layout.setVerticalGroup(
				jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE)
				);

		setBorder(null);
		setClosable(true);
		setIconifiable(true);
		setMaximumSize(new java.awt.Dimension(800, 800));
		setPreferredSize(new java.awt.Dimension(800, 800));

		jPanel10.setBackground(new java.awt.Color(0, 0, 0));
		jPanel10.setName("jPanel10"); // NOI18N

		jLabel11.setBackground(new java.awt.Color(0, 0, 0));
		jLabel11.setFont(new java.awt.Font("Corbel", 1, 36));
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("ADD COMPANY DETAILS");
		jLabel11.setName("jLabel11"); // NOI18N

//		jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhi\\workspace\\BillingManagementSystem\\images\\group.jpg")); // NOI18N

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));
		jPanel1.setName("jPanel1"); // NOI18N

		name.setName("name"); // NOI18N
		name.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nameActionPerformed(evt);
			}
		});
		name.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				nameFocusLost(evt);
			}
		});
		name.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				nameKeyReleased(evt);
			}
			public void keyTyped(java.awt.event.KeyEvent evt) {
				nameKeyTyped(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("Company Name");
		jLabel6.setName("jLabel6"); // NOI18N

		aliasName.setBackground(new java.awt.Color(255, 255, 153));
		aliasName.setName("aliasName"); // NOI18N
		aliasName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				idActionPerformed(evt);
			}
		});
		aliasName.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				idKeyTyped(evt);
			}
		});

		jLabel1.setBackground(new java.awt.Color(0, 1, 0));
		jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Company Alias");
		jLabel1.setName("jLabel1"); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1)
						.addGap(46, 46, 46)
						.addComponent(aliasName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(55, 55, 55)
						.addComponent(jLabel6)
						.addGap(18, 18, 18)
						.addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(79, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel6))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(aliasName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		jPanel2.setBackground(new java.awt.Color(0, 0, 0));
		jPanel2.setName("jPanel2"); // NOI18N

		add1.setName("add1"); // NOI18N
		add1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				add1KeyReleased(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Company ADD1");
		jLabel2.setName("jLabel2"); // NOI18N

		add2.setName("add2"); // NOI18N
		add2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				add2KeyReleased(evt);
			}
		});

		add3.setName("add3"); // NOI18N
		add3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				add3KeyReleased(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Company ADD2");
		jLabel3.setName("jLabel3"); // NOI18N

		jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Company Add3");
		jLabel4.setName("jLabel4"); // NOI18N

		jPanel3.setBackground(new java.awt.Color(0, 0, 0));
		jPanel3.setName("jPanel3"); // NOI18N

		eid.setName("eid"); // NOI18N
		eid.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.ActionEvent evt) {
				eidKeyReleased(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("Company Email-ID");
		jLabel10.setName("jLabel10"); // NOI18N

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addComponent(jLabel10)
						.addGap(18, 18, 18)
						.addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE))
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10)
								.addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
				);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2)
												.addComponent(jLabel3)
												.addComponent(jLabel4))
										.addGap(29, 29, 29)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(add1)
												.addComponent(add2)
												.addComponent(add3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)))
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		jPanel4.setBackground(new java.awt.Color(0, 0, 0));
		jPanel4.setName("jPanel4"); // NOI18N

		tin.setName("tin"); // NOI18N
		tin.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				tinKeyReleased(evt);
			}
		});

		stex.setName("stex"); // NOI18N
		stex.setFont(new java.awt.Font("Tahoma", 1, 18));
		stex.setText("Path");
		stex.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					openFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		/*stex.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				stexKeyReleased(evt);
			}
		});*/

		jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Company Tin_No");
		jLabel8.setName("jLabel8"); // NOI18N

		jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Company Logo");
		jLabel9.setName("jLabel9"); // NOI18N

		gst.setName("cst"); // NOI18N
		gst.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				cstKeyReleased(evt);
			}
		});

		tel.setName("tel"); // NOI18N
		tel.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				telFocusLost(evt);
			}
		});
		tel.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				telKeyReleased(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("Company CST_No");
		jLabel5.setName("jLabel5"); // NOI18N

		jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("Company Tel_No");
		jLabel7.setName("jLabel7"); // NOI18N

		jPanel5.setBackground(new java.awt.Color(0, 0, 0));
		jPanel5.setName("jPanel5"); // NOI18N

		exit.setFont(new java.awt.Font("Tahoma", 1, 18));
		exit.setText("EXIT");
		exit.setName("exit"); // NOI18N
		exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitActionPerformed(evt);
			}
		});

		save.setFont(new java.awt.Font("Tahoma", 1, 18));
		save.setText("SAVE");
		save.setName("save"); // NOI18N
		save.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
		jButton1.setText("EDIT1");
		jButton1.setVisible(false);
		jButton1.setName("jButton1"); // NOI18N
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(122, 122, 122)
						.addComponent(jButton1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
						.addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(95, 95, 95))
				);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
										.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap(12, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5)
												.addComponent(jLabel7))
										.addGap(18, 18, 18)
										.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(tel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(gst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)
										.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel8)
												.addComponent(jLabel9))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(stex, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(32, 32, 32))
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())))
				);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(gst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8)
								.addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7)
								.addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9)
								.addComponent(stex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(
				jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel10Layout.createSequentialGroup()
										.addGap(4, 4, 4)
										.addComponent(jLabel11)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				);
		jPanel10Layout.setVerticalGroup(
				jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel10Layout.createSequentialGroup()
										.addGap(26, 26, 26)
										.addComponent(jLabel11))
								.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(59, Short.MAX_VALUE))
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void stexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stexActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_stexActionPerformed

	private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
		try
		{ 
			System.out.println("Connection created successfully : "+con.getSchema());
			pst=con.prepareStatement("insert into company_master values(?,?,?,?,?,?,?,?,?,?,?)");
			System.out.println("Connection Size : "+pst.getFetchSize());
			pst.setString(1,"1");
			pst.setString(2,""+name.getText());
			pst.setString(3,""+aliasName.getText());
			pst.setString(4,""+add1.getText());
			pst.setString(5,""+add2.getText());
			pst.setString(6,""+add3.getText());
			pst.setString(7,""+tel.getText());
//			pst.setString(8,""+mobile.getText());
//			pst.setString(9,""+website.getText());
			pst.setString(10,""+eid.getText());
			pst.setString(11,""+gst.getText());
			pst.setString(12,""+tin.getText());
			pst.setBytes(13,data);
			System.out.println("Setting values to db : ");
			save.setEnabled(true);
			pst.executeUpdate();
			System.out.println("Executed successfully");
			JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");


			aliasName.setText("");
			name.setText("");
			add1.setText("");
			add2.setText("");
			add3.setText("");
			eid.setText("");
			gst.setText("");

			tel.setText("");
			tin.setText("");
			stex.setText("");
			con.close();

			
		}
		catch(Exception ex)
		{
			System.out.println("Exception : "+ex);
		}
	}
	private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_idActionPerformed

	private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
		this.dispose();
	}//GEN-LAST:event_exitActionPerformed

	private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_nameActionPerformed

	private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped

	}//GEN-LAST:event_idKeyTyped

	private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

	}//GEN-LAST:event_nameKeyTyped

	private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost

	}//GEN-LAST:event_nameFocusLost

	private void add1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add1KeyReleased

	}//GEN-LAST:event_add1KeyReleased

	private void add2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add2KeyReleased

	}//GEN-LAST:event_add2KeyReleased

	private void add3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add3KeyReleased

	}//GEN-LAST:event_add3KeyReleased

	private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
		int f=0; 


		String s=name.getText();
		String s1=null;
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);  
			Character chr=new Character(a);

			if(chr.isDigit(a))
			{
				f=1;
				s1=s.substring(0, i);   
			}
		}
		if(f==1)
		{
			JOptionPane.showMessageDialog(null,"number not allowed");
			name.setText(s1);
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

		EditCustomer ec;
		try {
			ec = new EditCustomer();
			JDesktopPane p=getDesktopPane();
			p.add(ec);
			ec.setVisible(true);
			this.dispose();
		} catch (SQLException ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
		}

	}//GEN-LAST:event_jButton1ActionPerformed

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


	}//GEN-LAST:event_jButton1MouseClicked

	private void cstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cstKeyReleased
		int f=0; 

		String s=gst .getText();
		String s1=null;

		for(int i=0;i<s.length();i++)
		{

			char a=s.charAt(i);  
			Character chr=new Character(a);

			if(chr.isLetter(a))
			{
				f=1;
				s1=s.substring(0, i);   
			}
		}
		if(f==1)
		{
			JOptionPane.showMessageDialog(null,"character not allowed");
			gst.setText(null);
		}

	}//GEN-LAST:event_cstKeyReleased

	private void tinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tinKeyReleased

		int f=0; 
		String s=tin.getText();
		String s1=null;
		for(int i=0;i<s.length();i++)
		{

			char a=s.charAt(i);  
			Character chr=new Character(a);

			if(chr.isLetter(a))
			{
				f=1;
				s1=s.substring(0, i);   
			}
		}
		if(f==1)
		{
			JOptionPane.showMessageDialog(null,"character not allowed");
			tin.setText(s1);
		}
	}

	private void eidKeyReleased(java.awt.event.ActionEvent  evt) {//GEN-FIRST:event_eidKeyReleased

		String email = (String)eid.getText();
		final String EMAIL_PATTERN = 
			    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

			if (!email.matches(EMAIL_PATTERN)) {
				JOptionPane.showMessageDialog(this,"emailId must be in proper format");
				tel.setText("");
			}

	}//GEN-LAST:event_eidKeyReleased

	private void telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyReleased
		// TODO add your handling code here:

	}//GEN-LAST:event_telKeyReleased

	private void telFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFocusLost
		String str="";

		str=tel.getText();
		if(str.length()<6 || str.length()>10)
		{
			JOptionPane.showMessageDialog(this,"phone no must be 6 to 10 digits");
			tel.setText("");
		}
	}
	
	 boolean openFile() throws IOException {
	        JFileChooser fc = new JFileChooser();
	        fc.setDialogTitle("Open File");
	        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	        fc.setCurrentDirectory(new File("."));
	        fc.setFileFilter(fJavaFilter);
	        int result = fc.showOpenDialog(this);
	        if (result == JFileChooser.CANCEL_OPTION) {
	            return true;
	        } else if (result == JFileChooser.APPROVE_OPTION) {

	            fFile = fc.getSelectedFile();
	            System.out.println(fFile);
	            FileInputStream fileInputStream = new FileInputStream(fFile);
	            System.out.println(fileInputStream);
	            System.out.println(fFile.getAbsolutePath());
	            String fromFilePath=fFile.getAbsolutePath();
	            System.out.println("toFilePath  :  "+fromFilePath);
	            Path FROM = Paths.get(fromFilePath);
	            data = Files.readAllBytes(FROM);
	            String savePath= System.getProperty("user.dir") + System.getProperty("file.separator") + "images\\"+"companyLogo.jpg";
	            System.out.println("savepath  :  "+savePath);
	            File saveLocation = new File(savePath);
	                if(!saveLocation.exists()){
	                     saveLocation.mkdir();
	                 }
	            Path TO = Paths.get(savePath);
	            CopyOption[] options = new CopyOption[]{
	              StandardCopyOption.REPLACE_EXISTING,
	              StandardCopyOption.COPY_ATTRIBUTES
	            }; 
	            java.nio.file.Files.copy(FROM, TO, options);
	         
	        } else {
	            return false;
	        }
	        return true;
	    }

		static JLabel label;
		static BufferedImage icon;
		static File oldfile;
		JFileChooser fc;
		static File fFile;
		ImageFilter1 fJavaFilter = new ImageFilter1();
		
		class ImageFilter1 extends javax.swing.filechooser.FileFilter {
			public boolean accept(File f) {
				return f.getName().toLowerCase().endsWith(".png") || f.getName().toLowerCase().endsWith(".jpg")
						|| f.getName().toLowerCase().endsWith(".jif") || f.isDirectory();
			}

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
		}



}
