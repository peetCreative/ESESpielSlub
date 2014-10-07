import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;


public class madProgrammedRegisttrationApplication {

	private static final String Gelesen = "gelesen";
	private JFrame frmMadprogrammtoregisterstudentsintoslubsystem;
	private JPanel RegelnPanel;
	private JTextField LieblingsBuch;
	private JTextField NameTextField;
	private JTextField zihLogin;
	private JTextField textField_3;
	private JTextPane txtpnNameDeinesVaters;
	private JProgressBar progressBar;
	private JTextPane txtpnGibDeineDaten;
	private int waitingTime = 300;
	private JScrollPane scrollPane;
	private String[] slubRegeln = {
			"Die erste Regel der Slub ist du Redest nicht in der Slub!\n" ,
					"Die zweite Regel der Slub ist du redest nicht in der Slub!\n" ,
					"Die dritte Regel der Slub ist du redest nicht in der Slub\n" ,
					"Die vierte Regel der Slub ist du sollst nicht mehr als 4 Bücher ausleihen!\n" ,
					"Die fünfte Regel der Slub ist jegliche Beschädigung des Materials der Slub ist zu Ersätzen!\n" ,
					"Die Sechste Regel der Slub ist das Personal ist beim Kaffee trinken nicht zu stören!\n" ,
					"Die Siebente Regel der Slub ist du darfst diesen Haken nicht setzen!\n "
	};
	private JTextField txtDieserButtonLscht;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					madProgrammedRegisttrationApplication window = new madProgrammedRegisttrationApplication();
					window.frmMadprogrammtoregisterstudentsintoslubsystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public madProgrammedRegisttrationApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @param JTextPane() 
	 */
	private void initialize() {
		frmMadprogrammtoregisterstudentsintoslubsystem = new JFrame();
		frmMadprogrammtoregisterstudentsintoslubsystem.setTitle("MadProgrammToRegisterStudentsInToSlubSystem");
		frmMadprogrammtoregisterstudentsintoslubsystem.setBounds(100, 100, 464, 573);
		frmMadprogrammtoregisterstudentsintoslubsystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setForeground(Color.YELLOW);
		frmMadprogrammtoregisterstudentsintoslubsystem.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(40dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:max(0dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("50dlu:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel.add(panel_3, "2, 2, 1, 2, fill, fill");
		
		txtpnNameDeinesVaters = new JTextPane();
		txtpnNameDeinesVaters.setFont(new Font("cmmi10", Font.PLAIN, 17));
		txtpnNameDeinesVaters.setToolTipText("GGF auch anders herum ;-)");
		txtpnNameDeinesVaters.setEditable(false);
		txtpnNameDeinesVaters.setText("Name der Tochter der Großmutter väterlicherseits");
		panel_3.add(txtpnNameDeinesVaters);
		
		NameTextField = new JTextField();
		NameTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectFocus();
			}
		});
		NameTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
			}
				//neuer Thread für Delay
				//new DelayThread().start();

			@Override
			public void focusGained(FocusEvent e) {
				try {
					Thread.sleep(waitingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		panel_3.add(NameTextField);
		NameTextField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "2, 4, fill, fill");
		
		JTextPane txtpnLieblingsbuch = new JTextPane();
		txtpnLieblingsbuch.setEditable(false);
		txtpnLieblingsbuch.setText("Lieblingsbuch");
		panel_2.add(txtpnLieblingsbuch);
		
		LieblingsBuch = new JTextField();
		LieblingsBuch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectFocus();
			}
		});
		LieblingsBuch.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e){
				try {
					Thread.sleep(waitingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				//neuer Thread für Delay
				//new DelayThread().start();

			@Override
			public void focusGained(FocusEvent e) {
				try {
					Thread.sleep(waitingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
		});
		panel_2.add(LieblingsBuch);
		LieblingsBuch.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "2, 6, fill, fill");
		
		JTextPane txtpnErzhlMirMehr = new JTextPane();
		txtpnErzhlMirMehr.setEditable(false);
		txtpnErzhlMirMehr.setText("Erzähl mir mehr:");
		panel_1.add(txtpnErzhlMirMehr);
		
		zihLogin = new JTextField();
		zihLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectFocus();
			}
		});
		panel_1.add(zihLogin);
		zihLogin.setColumns(10);
		LieblingsBuch.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e){
				try {
					Thread.sleep(waitingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				//neuer Thread für Delay
				//new DelayThread().start();

			@Override
			public void focusGained(FocusEvent e) {
				try {
					Thread.sleep(waitingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				LieblingsBuch.requestFocus();

			}
			
			
		});		
		RegelnPanel = new JPanel();	
		scrollPane = new JScrollPane(RegelnPanel);
		RegelnPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("4dlu:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("4dlu:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),}));
		ArrayList<JTextPane> RegelnTextPanes = new ArrayList<JTextPane>();
		for (String regel: slubRegeln){
			JTextPane pane = new JTextPane();
			pane.setText(regel);
			RegelnTextPanes.add(pane);
		}
		for (int i =0; i <  RegelnTextPanes.size(); i++){
			RegelnPanel.add(RegelnTextPanes.get(i), 
							 "2, " + (i*2 +2 ) + ",fill ,fill");
			RegelnPanel.add(new JCheckBox("OK"), "4, " + (i*2 +2 ) + ",fill ,fill");
		}
		//JTextPane textPane = new JTextPane();
		//textPane.setText("zweite Regel");
		//RegelnPanel.add(textPane, "8, 2, fill, fill");
		
		//JTextPane txtpnregel = new JTextPane();
		//txtpnregel.setText("8.Regel");
		//RegelnPanel.add(txtpnregel, "6, 4, fill, fill");
		
		//txtDieserButtonLscht = new JTextField();
		//txtDieserButtonLscht.setText("Dieser Button löscht alle Eingaben");
		//RegelnPanel.add(txtDieserButtonLscht, "2, 8, fill, default");
		//txtDieserButtonLscht.setColumns(10);
		
		//JCheckBox chckbxOk = new JCheckBox("Ok");
		//RegelnPanel.add(chckbxOk, "10, 10");
		
		///
		//JTextPane textPane;
		//JCheckBox checkBox = new JCheckBox();
			//textPane = new JTextPane();
			//textPane.setText(slubRegeln[0]);
			//textPane.setBounds(8, 4 ,420,100);
			//RegelnPanel.add(textPane);
			//checkBox = new JCheckBox();
			//checkBox.setSelected(false);
			//checkBox.setText(Gelesen);
			//RegelnPanel.add(checkBox);
			
		
		
		panel.add(scrollPane, "2, 8, fill, fill");
		
		JTextPane txtpnAchteAufVollstendigkeit = new JTextPane();
		txtpnAchteAufVollstendigkeit.setEditable(false);
		txtpnAchteAufVollstendigkeit.setText("Achte auf Vollstendigkeit und Richtigkeit deiner Angaben");
		panel.add(txtpnAchteAufVollstendigkeit, "2, 10, fill, fill");
		
		JCheckBox chckbxAllesRichtig = new JCheckBox("Alles Richtig");
		panel.add(chckbxAllesRichtig, "2, 12");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ich habe die Regeln gelesen!");
		panel.add(chckbxNewCheckBox, "2, 14");
		
		progressBar = new JProgressBar(SwingConstants.HORIZONTAL, 0,100);
		panel.add(progressBar, "2, 16");
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.add(panel_4, "2, 18, fill, fill");
		
		JTextPane txtpnDeinPasswort = new JTextPane();
		txtpnDeinPasswort.setEditable(false);
		txtpnDeinPasswort.setText("Dein Passwort:");
		panel_4.add(txtpnDeinPasswort);
		
		textField_3 = new JTextField();
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		txtpnGibDeineDaten = new JTextPane();
		txtpnGibDeineDaten.setEditable(false);
		txtpnGibDeineDaten.setText("Gib deine Daten ein!");
		panel.add(txtpnGibDeineDaten, "2, 20, fill, fill");
		
		JButton btnRegistrieren = new JButton("Registrieren");
		btnRegistrieren.addActionListener(new RegisterListener());
		panel.add(btnRegistrieren, "2, 22");
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{NameTextField, LieblingsBuch, zihLogin, scrollPane, panel_3, txtpnNameDeinesVaters, panel_2, txtpnLieblingsbuch, txtpnDeinPasswort, panel_1, txtpnErzhlMirMehr, txtpnAchteAufVollstendigkeit, chckbxAllesRichtig, chckbxNewCheckBox, progressBar, panel_4, textField_3, txtpnGibDeineDaten, btnRegistrieren}));
	}
	
	private class RegisterListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String[] auswahl = {"0","o","O"};//,"i","1","l","j", "|"};//, "!", "/","\\"} ;
			String password = "";
			Random rand = new Random();
			for( int i = 3; i < 10; i++){
				password += auswahl[rand.nextInt(auswahl.length)];
			}
			textField_3.setText(password);
		}
	}
	private class DelayThread extends Thread{

		@Override
		public void run() {
			
			progressBar.setValue(0);
			for (int i= 0; i < 100; i += 10){
				progressBar.setValue(i);
				progressBar.repaint();
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			progressBar.setValue(0); }
		}

	public void selectFocus(){
		switch(new Random().nextInt(3)){
			case 0: NameTextField.requestFocus(); break; 
			case 1: LieblingsBuch.requestFocus(); break;
			case 2: zihLogin.requestFocus(); break;
			
		}
	}
		
}


