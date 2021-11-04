package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class FrameCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroupSexo = new ButtonGroup();
	private final ButtonGroup buttonGroupLinguagensProgramacao = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public FrameCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar Contato");
		btnSalvar.setBackground(new Color(0, 0, 0));
		btnSalvar.setForeground(new Color(0, 0, 255));
		btnSalvar.setBounds(257, 227, 150, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 55, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 209, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 67, 55, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 89, 209, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 145, 101, 20);
		contentPane.add(textField_1);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(10, 120, 116, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(136, 120, 55, 14);
		contentPane.add(lblSexo);
		
		JRadioButton radioMasculino = new JRadioButton("M");
		buttonGroupSexo.add(radioMasculino);
		radioMasculino.setBounds(117, 144, 33, 23);
		contentPane.add(radioMasculino);
		
		JRadioButton radioFeminino = new JRadioButton("F");
		buttonGroupSexo.add(radioFeminino);
		radioFeminino.setBounds(168, 144, 38, 23);
		contentPane.add(radioFeminino);
		
		JComboBox comboBoxCidades = new JComboBox();
		comboBoxCidades.setModel(new DefaultComboBoxModel(new String[] {"Itapevi", "Jandira", "Barueri", "Santana de Parna\u00EDba ", "Mau\u00E1", "Cotia"}));
		comboBoxCidades.setBounds(10, 200, 209, 22);
		contentPane.add(comboBoxCidades);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 180, 46, 14);
		contentPane.add(lblCidade);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(257, 33, 150, 183);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Janeiro ", "Fevereiro", "Mar\u00E7o", "Abril ", "Maio", "Junho", "Julho", "Agosto ", "Setembro ", "Outubro ", "Novembro", "Dezembro", "jhffdhghg", "dfhghgfh", "hfdhgfsfh", "hfdsdghhghghg", "hgghhhghg", "hhgfgfff "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
