package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField LUText;
	private JTextField LNameText;
	private JTextField NameText;
	private JTextField mailText;
	private JTextField URLText;
	private JLabel hourLbl;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel lu = new JLabel("LU");
		lu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lu.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lastName = new JLabel("Apellido");
		lastName.setHorizontalAlignment(SwingConstants.LEFT);
		lastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel Name = new JLabel("Nombre");
		Name.setHorizontalAlignment(SwingConstants.LEFT);
		Name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel mail = new JLabel("E-mail");
		mail.setHorizontalAlignment(SwingConstants.LEFT);
		mail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel githubURL = new JLabel("Github URL");
		githubURL.setHorizontalAlignment(SwingConstants.LEFT);
		githubURL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		LUText = new JTextField();
		LUText.setColumns(10);
		
		LNameText = new JTextField();
		LNameText.setColumns(10);
		
		NameText = new JTextField();
		NameText.setColumns(10);
		
		mailText = new JTextField();
		mailText.setColumns(10);
		
		URLText = new JTextField();
		URLText.setColumns(10);
		
		hourLbl = new JLabel("");
		
		JLabel imageLbl = new JLabel("Imagen no cargada.");
		imageLbl.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(imageLbl, BorderLayout.CENTER);
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
								.addComponent(mail, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(Name, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
								.addComponent(NameText, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
								.addComponent(mailText, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lastName, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(LNameText, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lu, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(LUText, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
								.addComponent(hourLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_tabInformation.createSequentialGroup()
									.addComponent(githubURL, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(URLText, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lu)
						.addComponent(LUText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lastName, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(LNameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(Name, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(NameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(mailText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(githubURL, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(URLText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(hourLbl)
					.addGap(13))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		//Carga de datos
		LUText.setText(Integer.toString(studentData.getId()));
		LNameText.setText(studentData.getLastName());
		NameText.setText(studentData.getFirstName());
		mailText.setText(studentData.getMail());
		URLText.setText(studentData.getGithubURL());
		
		ImageIcon myPicture = new ImageIcon(studentData.getPathPhoto());
		imageLbl.setIcon(myPicture);
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime localDate = LocalDateTime.now();
		hourLbl.setText("Esta ventana fue generada el " +date.format(LocalDateTime.now()) + " a las " + localDate.getHour() + ":" + localDate.getMinute() + ":" + localDate.getSecond());
		


	}
}
