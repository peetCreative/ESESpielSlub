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
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;


public class madProgrammedRegisttrationApplication {

	private JFrame frmMadprogrammtoregisterstudentsintoslubsystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
	 */
	private void initialize() {
		frmMadprogrammtoregisterstudentsintoslubsystem = new JFrame();
		frmMadprogrammtoregisterstudentsintoslubsystem.setTitle("MadProgrammToRegisterStudentsInToSlubSystem");
		frmMadprogrammtoregisterstudentsintoslubsystem.setBounds(100, 100, 464, 573);
		frmMadprogrammtoregisterstudentsintoslubsystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmMadprogrammtoregisterstudentsintoslubsystem.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
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
		panel.add(panel_3, "2, 2, fill, fill");
		
		JTextPane txtpnNameDeinesVaters = new JTextPane();
		txtpnNameDeinesVaters.setEditable(false);
		txtpnNameDeinesVaters.setText("Name deines Vaters Mütterlicherseits");
		panel_3.add(txtpnNameDeinesVaters);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "2, 4, fill, fill");
		
		JTextPane txtpnLieblingsbuch = new JTextPane();
		txtpnLieblingsbuch.setEditable(false);
		txtpnLieblingsbuch.setText("Lieblingsbuch");
		panel_2.add(txtpnLieblingsbuch);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "2, 6, fill, fill");
		
		JTextPane txtpnErzhlMirMehr = new JTextPane();
		txtpnErzhlMirMehr.setText("Erzähl mir mehr:");
		panel_1.add(txtpnErzhlMirMehr);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "2, 8, fill, fill");
		
		JTextPane txtpnAchteAufVollstendigkeit = new JTextPane();
		txtpnAchteAufVollstendigkeit.setEditable(false);
		txtpnAchteAufVollstendigkeit.setText("Achte auf Vollstendigkeit und Richtigkeit deiner Angaben");
		panel.add(txtpnAchteAufVollstendigkeit, "2, 10, fill, fill");
		
		JCheckBox chckbxAllesRichtig = new JCheckBox("Alles Richtig");
		panel.add(chckbxAllesRichtig, "2, 12");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ich habe die Regeln gelesen!");
		panel.add(chckbxNewCheckBox, "2, 14");
		
		JProgressBar progressBar = new JProgressBar();
		panel.add(progressBar, "2, 16");
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.add(panel_4, "2, 18, fill, fill");
		
		JTextPane txtpnDeinPasswort = new JTextPane();
		txtpnDeinPasswort.setText("Dein Passwort:");
		panel_4.add(txtpnDeinPasswort);
		
		textField_3 = new JTextField();
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane txtpnGibDeineDaten = new JTextPane();
		txtpnGibDeineDaten.setEditable(false);
		txtpnGibDeineDaten.setText("Gib deine Daten ein!");
		panel.add(txtpnGibDeineDaten, "2, 20, fill, fill");
		
		JButton btnRegistrieren = new JButton("Registrieren");
		panel.add(btnRegistrieren, "2, 22");
	}

}
