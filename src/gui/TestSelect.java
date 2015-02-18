package gui;



import utilidades.TestsParameters;
import utilidades.Messages;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Dimension;


/**
 *
 * @author Aristeu Azevedo
 */
public class TestSelect extends javax.swing.JFrame {

    /**
     * Creates new form TestSelection
     */
	public TestsParameters testParam = new TestsParameters();
	public Messages message =  new Messages();
    public TestSelect() {
    	setResizable(false);
    	getContentPane().setMinimumSize(new Dimension(700, 700));
    	getContentPane().setSize(new Dimension(500, 500));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setMinimumSize(new Dimension(400, 400));
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        final JTextArea textArea_1 = new JTextArea();
        textArea_1.setEditable(false);
        textArea_1.setLineWrap(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select the language:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Danish (da-DK)", "Dutch (nl-NL)", "English (en-US)", "Finish (fi-FI)", "French (fr-FR)", "German (de-DE)", "Italian (it-IT)", "Japanese (ja-JP)", "Korean (ko-KR)", "Norwegian (nb-NO)", "Polish (pl-PL)", "Portuguese (pt-PT)", "Portuguese (pt-BR)", "Russian (ru-RU)", "Simplified Chinese (zh-CN)", "Spanish (es-ES)", "Swedish (sv-SE)", "Traditional Chinese (zh-TW)" }));
       
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
                
                if(jComboBox1.getSelectedItem().toString() == "English (en-US)"){
                	
                	rdbtnAlert.setEnabled(true);
                	rdbtnDashboard.setEnabled(true);
                	rdbtnHardwareScan.setEnabled(true);
                	rdbtnDeviceManager.setEnabled(true);
                	rdbtnStorageDevice.setEnabled(true);
                	rdbtnMemory.setEnabled(true);
                	rdbtnBackup.setEnabled(true);
                	rdbtnSoftwareUpdate.setEnabled(true);
                }
               
               if(jComboBox1.getSelectedItem().toString() != "English (en-US)"	){
            	   	rdbtnAlert.setEnabled(false);
            	   	rdbtnDashboard.setEnabled(false);
               		rdbtnHardwareScan.setEnabled(false);
               		rdbtnDeviceManager.setEnabled(false);
               		rdbtnStorageDevice.setEnabled(false);
                	rdbtnMemory.setEnabled(false);
                	rdbtnBackup.setEnabled(false);
                	
                }
                
              textArea_1.setText("-To run the test is necessary to low the UAC to (Never notify)\n"
            		+"-To run the test is needed the IE as main browser\n"
              		+ "-To run the 'Alert tests' All the alerts MUST be enabled\n"
              		+ "-To run the 'Dashboard tests' All dashboard icons MUST be enabled\n");
              
            }
        });

        jCheckBox1.setText("All Tabs");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("System");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Security");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Checkup");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Suppport");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Smoke (Screen Verify):");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Machine Name:");

        jToggleButton1.setText("Execute");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        
        
        
        JLabel lblTests = new JLabel("Tests");
        
        rdbtnAlert = new JRadioButton("Alerts");
        rdbtnAlert.setEnabled(false);
        
        rdbtnSetting = new JRadioButton("Setting");
        rdbtnSetting.setEnabled(true);
        
        rdbtnDashboard = new JRadioButton("Dashboard");
        rdbtnDashboard.setEnabled(false);
        
        rdbtnHardwareScan = new JRadioButton("Hardware Scan");
        rdbtnHardwareScan.setEnabled(false);
        
        rdbtnDeviceManager = new JRadioButton("Device Manager");
        rdbtnDeviceManager.setEnabled(false);
        
        rdbtnStorageDevice = new JRadioButton("Storage Device");
        rdbtnStorageDevice.setEnabled(false);
        
        rdbtnMemory = new JRadioButton("Memory");
        rdbtnMemory.setEnabled(false);
        
        rdbtnBackup = new JRadioButton("Backup");
        rdbtnBackup.setEnabled(false);
              
        rdbtnSoftwareUpdate = new JRadioButton("Software Update");
        rdbtnSoftwareUpdate.setEnabled(false);
        
        //Listener
        rdbtnDeviceManager.addChangeListener(new ChangeListener() {
        	public void stateChanged(ChangeEvent arg0) {
        		if(rdbtnDeviceManager.isSelected() || rdbtnStorageDevice.isSelected() ){
        			
             	   //	textField.setText("To run this test is necessary to low the UAC to (Never notify)");
             	   //	textArea_1.setText("To run this test is necessary to low the UAC to (Never notify)");
                }
        		else{
        			
        		}
        		
        	}
        });
        
        JLabel lblMessages = new JLabel("Messages");
        
        
        
        
        
        
        
        
        
                
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jCheckBox3)
        						.addComponent(jCheckBox4)
        						.addComponent(jCheckBox5)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jCheckBox2)
        							.addComponent(jLabel1)
        							.addComponent(jCheckBox1)
        							.addComponent(jLabel2)
        							.addComponent(jComboBox1, 0, 194, Short.MAX_VALUE)
        							.addComponent(jLabel3)
        							.addComponent(jTextField1))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(21)
        					.addComponent(jToggleButton1)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(rdbtnSetting, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblTests)
        						.addComponent(rdbtnAlert)
        						.addComponent(rdbtnDashboard)
        						.addComponent(rdbtnHardwareScan)
        						.addComponent(rdbtnDeviceManager)
        						.addComponent(rdbtnStorageDevice)
        						.addComponent(rdbtnMemory)
        						.addComponent(rdbtnBackup)
        						.addComponent(rdbtnSoftwareUpdate)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(textArea_1)
        						.addComponent(lblMessages))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3)
        			.addGap(11)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(30)
        					.addComponent(jLabel1)
        					.addGap(24)
        					.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(16)
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jCheckBox1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jCheckBox2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jCheckBox3)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jCheckBox4)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jCheckBox5))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lblTests)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnSetting)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnAlert)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnDashboard)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnHardwareScan)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnDeviceManager)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnStorageDevice)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnMemory)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnBackup)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(rdbtnSoftwareUpdate)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lblMessages)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jToggleButton1))
        			.addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(81, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	
    }                                          

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jCheckBox5.setSelected(true);
        }
        
        
    }                                          

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        stateVerify();
    }                                          

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        stateVerify();
    }                                          

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        stateVerify();
    }                                          

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        stateVerify();
    }                                          

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    	
    	
    	if(jCheckBox2.isSelected()){
    		testParam.setSystemSmoke(true);
    	}
    	
    	if(jCheckBox3.isSelected()){
    		testParam.setSecuritySmoke(true);
    	}
    	
    	if(jCheckBox4.isSelected()){
    		testParam.setCheckupSmoke(true);
    	}
    	
    	if(jCheckBox5.isSelected()){
    		testParam.setSupportSmoke(true);
    	}
    	
    	if(rdbtnAlert.isSelected()){
    		testParam.setAlerts(true);
    	}
    	
    	if(rdbtnSetting.isSelected()){
    		testParam.setAlerts(true);
    	}
    	
    	if(rdbtnDashboard.isSelected()){
    		testParam.setDashboard(true);
    	}
    	
    	if(rdbtnHardwareScan.isSelected()){
    		testParam.setHardwarescan(true);
    	}
    	
    	if(rdbtnDeviceManager.isSelected()){
    		testParam.setDeviceManager(true);
    	}
    	
    	if(rdbtnStorageDevice.isSelected()){
    		testParam.setStorageDevices(true);
    	}
    	
    	if(rdbtnMemory.isSelected()){
    		testParam.setMemory(true);
    	}
    	
    	if(rdbtnBackup.isSelected()){
    		testParam.setBackup(true);
    	}
    	
    	if(rdbtnSoftwareUpdate.isSelected()){
    		testParam.setSoftwareupdates(true);
    	}
    	
    	testParam.setSettings(rdbtnSetting.isSelected());
    	testParam.setDashboard(rdbtnDashboard.isSelected());
    	testParam.setAlerts(rdbtnAlert.isSelected());
    	
    	testParam.setMachineName(jTextField1.getText());
    	testParam.setIdioma(jComboBox1.getSelectedItem().toString());
    	
    	testParam.setShortIdioma(escolheIdioma(jComboBox1.getSelectedItem().toString()));
    	
    	this.dispose();

    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	/*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new TestSelection().setVisible(true);
            }
        });
    }
    
    public void stateVerify()
    {
    	  
    	
        if(jCheckBox2.isSelected() && jCheckBox3.isSelected()
                && jCheckBox4.isSelected() && jCheckBox5.isSelected())
        {
        jCheckBox1.setSelected(true);
        }
        
        if(!jCheckBox2.isSelected() ||  !jCheckBox3.isSelected() || 
                !jCheckBox4.isSelected() || !jCheckBox5.isSelected())
        {
        jCheckBox1.setSelected(false);
        }
        
      
        
    }
    
    public static String escolheIdioma(String s) {
		
		switch (s) {

		case "Danish (da-DK)":
			return "da_DK";
			
		case "Dutch (nl-NL)":
			return "nl_NL";

		case "English (en-US)":
			return "en_US";

		case "Finish (fi-FI)":
			return "fi_FI";

		case "French (fr-FR)":
			return "fr_FR";

		case "German (de-DE)":
			return "de_DE";

		case "Italian (it-IT)":
			return "it_IT";
		
		case "Japanese (ja-JP)":
			return "ja_JP";

		case "Korean (ko-KR)":
			return "ko_KR";

		case "Norwegian (nb-NO)":
			return "nb_NO";

		case "Polish (pl-PL)":
			return "pl_PL";
			
		case "Portuguese (pt-PT)":
			return "pt_PT";

		case "Portuguese (pt-BR)":
			return "pt_BR";

		case "Russian (ru-RU)":
			return "ru_RU";

		case "Simplified Chinese (zh-CN)":
			return "zh_CN";

		case "Spanish (es-ES)":
			return "es_ES";

		case "Swedish (sv-SE)":
			return "sv_SE";

		case "Traditional Chinese (zh-TW)":
			return "zh_TW";
		}

		return "";
	}

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private JRadioButton rdbtnAlert;
    private JRadioButton rdbtnSetting;
    private JRadioButton rdbtnDashboard;
    private JRadioButton rdbtnHardwareScan;
    private JRadioButton rdbtnDeviceManager;
    private JRadioButton rdbtnStorageDevice;
    private JRadioButton rdbtnMemory;
    private JRadioButton rdbtnBackup;
    private JTextArea textArea_1;
    private JRadioButton rdbtnSoftwareUpdate;
}