package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;

public class ad {

	ArrayList<tiket> Tiket = new ArrayList<tiket>();
	private JFrame frame;
	private JTextField TP;
	private JTextField TB;

	int hrgKelas;
	int hrgbrngkt;
	int hrgorang;
	int harga;
	private JTextArea TIKET;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ad window = new ad();
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
	public ad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tiket Kereta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(383, 10, 182, 31);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Jenis Kereta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 53, 103, 23);
		frame.getContentPane().add(lblNewLabel_1);

		JComboBox JK = new JComboBox();

		JK.setModel(new DefaultComboBoxModel(new String[] { "", "Eksekutif", "Bisnis", "Ekonomi" }));
		JK.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JK.getSelectedItem() == "Eksekutif") {
					hrgKelas = 250000;
				}
				if (JK.getSelectedItem() == "Bisnis") {
					hrgKelas = 150000;
				}
				if (JK.getSelectedItem() == "Ekonomi") {
					hrgKelas = 80000;
				}
			}
		});
		JK.setBounds(146, 55, 121, 21);
		frame.getContentPane().add(JK);

		JLabel lblNewLabel_2 = new JLabel("Stasiun Berangkat");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 85, 139, 23);
		frame.getContentPane().add(lblNewLabel_2);

		JComboBox SB = new JComboBox();

		SB.setModel(new DefaultComboBoxModel(new String[] { "", "Jakarta", "Solo", "Surabaya" }));
		SB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SB.getSelectedItem() == "Jakarta") {
					hrgbrngkt = 1;
				}
				if (SB.getSelectedItem() == "Solo") {
					hrgbrngkt = 1;
				}
				if (SB.getSelectedItem() == "Surabaya") {
					hrgbrngkt = 1;
				}
			}
		});
		SB.setBounds(146, 85, 121, 23);
		frame.getContentPane().add(SB);

		JLabel lblNewLabel_3 = new JLabel("Stasiun Tiba");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 118, 103, 23);
		frame.getContentPane().add(lblNewLabel_3);

		JComboBox ST = new JComboBox();
		ST.setModel(new DefaultComboBoxModel(new String[] { "", "Surabaya ", "Solo", "Jakarta" }));
		ST.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ST.getSelectedItem() == "Surabaya ") {
					hrgbrngkt = 2;
				}
				if (ST.getSelectedItem() == "Solo") {
					hrgbrngkt = 1;
				}
				if (ST.getSelectedItem() == "Jakarta") {
					hrgbrngkt = 2;
				}
			}
		});
		ST.setBounds(146, 119, 121, 21);
		frame.getContentPane().add(ST);

		JLabel lblNewLabel_4 = new JLabel("Jumlah Tiket");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 151, 93, 31);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Tanggal Pembelian");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 184, 139, 31);
		frame.getContentPane().add(lblNewLabel_5);

		TP = new JTextField();
		TP.setBounds(146, 189, 121, 19);
		frame.getContentPane().add(TP);
		TP.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Tanggal Berangkat");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 217, 139, 31);
		frame.getContentPane().add(lblNewLabel_6);

		TB = new JTextField();
		TB.setBounds(146, 225, 121, 19);
		frame.getContentPane().add(TB);
		TB.setColumns(10);

		JComboBox JE = new JComboBox();
		JE.setModel(
				new DefaultComboBoxModel(new String[] { "", "1 orang", "2 orang", "3 orang", "4 orang", "5 orang" }));
		JE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JE.getSelectedItem() == "1 orang") {
					hrgorang = 1;
				}
				if (JE.getSelectedItem() == "2 orang") {
					hrgorang = 2;
				}
				if (JE.getSelectedItem() == "3 orang") {
					hrgorang = 3;
				}
				if (JE.getSelectedItem() == "4 orang") {
					hrgorang = 4;
				}
				if (JE.getSelectedItem() == "5 orang") {
					hrgorang = 5;
				}

			}
		});

		JE.setBounds(146, 150, 121, 21);
		frame.getContentPane().add(JE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(20, 258, 129, 97);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		TIKET = new JTextArea();
		TIKET.setBackground(SystemColor.desktop);
		TIKET.setSelectionColor(SystemColor.window);
		TIKET.setLineWrap(true);
		TIKET.setFont(new Font("Monospaced", Font.PLAIN, 23));
		TIKET.setEnabled(false);
		TIKET.setBounds(297, 55, 445, 300);
		frame.getContentPane().add(TIKET);

		JButton btnNewButton = new JButton("SIMPAN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String JenisKereta = JK.getSelectedItem().toString();
				String StasiunBerangkat = SB.getSelectedItem().toString();
				String StasiunTiba = ST.getSelectedItem().toString();
				String JumlahTiket = JE.getSelectedItem().toString();
				String TanggalPembelian = TP.getText();
				String TanggalBerangkat = TB.getText();
				harga = (hrgKelas * hrgbrngkt * hrgorang);
				String HargaTotal = String.valueOf(harga);

				Tiket.add(new tiket(JenisKereta, StasiunBerangkat, StasiunTiba, JumlahTiket, TanggalPembelian,
						TanggalBerangkat, HargaTotal));
				tiket newkeluar = (tiket) Tiket.get(Tiket.size() - 1);

				TIKET.setText("-------------------------------" + "\n- JENIS KERETA : " + newkeluar.JenisKereta
						+ "\n- STASIUN BERANGKAT : " + newkeluar.StasiunBerangkat + "\n- STASIUN TIBA : "
						+ newkeluar.StasiunTiba + "\n- JUMLAH TIKET : " + newkeluar.JumlahTiket
						+ "\n- TANGGAL PEMBELIAN : " + newkeluar.TanggalPembelian + "\n- TANGGAL BERANGKAT : "
						+ newkeluar.TanggalBerangkat + "\n- HARGA TOTAL : Rp." + newkeluar.HargaTotal
						+ "\n-------------------------------");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 10, 109, 36);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BATAL");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(10, 56, 109, 31);
		panel.add(btnNewButton_1);

	}
}
