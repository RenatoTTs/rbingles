package en.cliente;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import en.decorar.Verbo;


public class Principal extends JFrame {
	public Principal() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_3 = new JLabel("Presente");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Passado");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		lbParticipativo = new JLabel("Participativo");
		GridBagConstraints gbc_lblParticipativo = new GridBagConstraints();
		gbc_lblParticipativo.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticipativo.gridx = 2;
		gbc_lblParticipativo.gridy = 0;
		getContentPane().add(lbParticipativo, gbc_lblParticipativo);
		
		tfPresente = new JTextField();
		GridBagConstraints gbc_tfPresente = new GridBagConstraints();
		gbc_tfPresente.insets = new Insets(0, 0, 5, 5);
		gbc_tfPresente.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPresente.gridx = 0;
		gbc_tfPresente.gridy = 1;
		getContentPane().add(tfPresente, gbc_tfPresente);
		tfPresente.setColumns(10);
		
		tfPassado = new JTextField();
		GridBagConstraints gbc_tfPassado = new GridBagConstraints();
		gbc_tfPassado.insets = new Insets(0, 0, 5, 5);
		gbc_tfPassado.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassado.gridx = 1;
		gbc_tfPassado.gridy = 1;
		getContentPane().add(tfPassado, gbc_tfPassado);
		tfPassado.setColumns(10);
		
		tfParticipativo = new JTextField();
		GridBagConstraints gbc_tfParticipativo = new GridBagConstraints();
		gbc_tfParticipativo.insets = new Insets(0, 0, 5, 5);
		gbc_tfParticipativo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfParticipativo.gridx = 2;
		gbc_tfParticipativo.gridy = 1;
		getContentPane().add(tfParticipativo, gbc_tfParticipativo);
		tfParticipativo.setColumns(10);
		
		btFeito = new JButton("Feito");
		btFeito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Verbo> extracted = extracted();
				
				lbResPresente.setText(extracted.get(0).getVerboPresente()); 
				lbResPassado.setText(extracted.get(0).getVerboPassado()); 
				lbResParticipativo.setText(extracted.get(0).getVerboParticipativo()); 
				
			}
		});
		GridBagConstraints gbc_btFeito = new GridBagConstraints();
		gbc_btFeito.insets = new Insets(0, 0, 5, 0);
		gbc_btFeito.gridx = 3;
		gbc_btFeito.gridy = 1;
		getContentPane().add(btFeito, gbc_btFeito);
		
		lbResPresente = new JLabel("");
		GridBagConstraints gbc_lbResPresente = new GridBagConstraints();
		gbc_lbResPresente.insets = new Insets(0, 0, 0, 5);
		gbc_lbResPresente.gridx = 0;
		gbc_lbResPresente.gridy = 3;
		getContentPane().add(lbResPresente, gbc_lbResPresente);
		
		lbResPassado = new JLabel("");
		GridBagConstraints gbc_lbResPassado = new GridBagConstraints();
		gbc_lbResPassado.insets = new Insets(0, 0, 0, 5);
		gbc_lbResPassado.gridx = 1;
		gbc_lbResPassado.gridy = 3;
		getContentPane().add(lbResPassado, gbc_lbResPassado);
		
		lbResParticipativo = new JLabel("");
		GridBagConstraints gbc_lbResParticipativo = new GridBagConstraints();
		gbc_lbResParticipativo.insets = new Insets(0, 0, 0, 5);
		gbc_lbResParticipativo.gridx = 2;
		gbc_lbResParticipativo.gridy = 3;
		getContentPane().add(lbResParticipativo, gbc_lbResParticipativo);
		
		
		
		
	}
	
	private static final long serialVersionUID = 1L;
	public JTextField tfPresente;
	public JTextField tfPassado;
	public JTextField tfParticipativo;
	private JLabel lbParticipativo;
	private JButton btFeito;
	private JLabel lbResPresente;
	private JLabel lbResPassado;
	private JLabel lbResParticipativo;

	public static void main(String[] args) {
		
		Principal tela= new Principal();
		tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tela.setSize(400,400);
		tela.setVisible(true);
		
	}

	private static List<Verbo> extracted() {
		List<Verbo> verbos = new ArrayList<Verbo>();
		
		Verbo verbo1 = new Verbo();
		verbo1.setVerboPresente("To Say");
		verbo1.setVerboPassado("Said");
		verbo1.setVerboParticipativo("Said");
		
		verbos.add(verbo1);
		
		return verbos;
	}
	
		
	
}
