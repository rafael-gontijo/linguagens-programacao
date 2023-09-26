package application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LotoFacilGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	// Atributos
	private JPanel painel = new JPanel();
	private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
	private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
	private JButton jButtonAposta3 = new JButton("Apostar Par ou Impar");
	private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");

	public LotoFacilGUI() {
		// Construtor
		this.setTitle("LotoFacil Interface Grafica");
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(painel);
		painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		painel.setBackground(new Color(255, 255, 255));

		painel.add(jButtonAposta1);
		jButtonAposta1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				String aposta = JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100");
				int numeroApostado = Integer.parseInt(aposta);
				if (numeroApostado < 0 || numeroApostado > 100) {
					JOptionPane.showMessageDialog(null, "Aposta inválida.");
				} else {
					int numeroSorteado = random.nextInt(101);

					if (numeroApostado == numeroSorteado) {
						JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00 reais.");
					} else {
						JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + numeroSorteado + ".");
						System.out.println();
					}
				}
			}
		});
		painel.add(jButtonAposta2);

		jButtonAposta2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char letraPremiada = 'J';
				String aposta = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z");
				char letraApostada = Character.toUpperCase(aposta.charAt(0));
				if (Character.isLetter(letraApostada)) {
					if (letraApostada == letraPremiada) {
						JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00 reais.");
					} else {
						JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letraPremiada + ".");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Aposta inválida.");
				}

			}

		});

		painel.add(jButtonAposta3);
		jButtonAposta3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String aposta = JOptionPane.showInputDialog(null, "Digite uma aposta par ou impar");
				int numeroApostado = Integer.parseInt(aposta);
				if (numeroApostado % 2 == 0) {
					JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00 reais.");
				} else {
					JOptionPane.showMessageDialog(null,
							"Que pena! O número digitado é ímpar e a premiação foi para números pares.");
				}
			}

		});
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));

	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LotoFacilGUI frame = new LotoFacilGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
