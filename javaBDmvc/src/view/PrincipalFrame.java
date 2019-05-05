package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerPessoa;
import model.Bd;
import model.Pessoa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PrincipalFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfTexto;
	private JButton btnOk;
	private String var;
	private JLabel lblMensagem;
	private boolean verificacao = false;
	JFrame frame = new JFrame();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalFrame frame = new PrincipalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteAqui = new JLabel("Digite aqui:");
		lblDigiteAqui.setBounds(15, 29, 124, 20);
		contentPane.add(lblDigiteAqui);
		
		tfTexto = new JTextField();
		tfTexto.setBounds(116, 26, 146, 26);
		contentPane.add(tfTexto);
		tfTexto.setColumns(10);
		
		btnOk = new JButton("ok");
		btnOk.setBounds(147, 98, 115, 29);
		contentPane.add(btnOk);
		
		lblMensagem = new JLabel("New label");
		lblMensagem.setBounds(110, 169, 69, 20);
		contentPane.add(lblMensagem);
		lblMensagem.setVisible(false);
		
		
		/*
		 * O metodo a seguir é o de açao do botão
		 * ao digitar algo e apertar no botao ok
		 * A classe PrincipalFrame(que esta dentro do pacote view)
		 * vai chamar o controlador, o controlador é responsavel distribuir para a classe correta a chamada
		 * 
		 */
		btnOk.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var = tfTexto.getText(); // armazeno o valor do campo
				Pessoa p = new Pessoa(); // crio um objeto pessoa
				p.setNome(var); // coloco no objeto o nome 
				//instancio o controlador
				ControllerPessoa ctPessoa = new ControllerPessoa();
		
				
				// executo o metodo inserirCT
				/*
				 * a partir daqui vc vai para classe ControllerPessoa
				 * procure o metodo inserirCT
				 */
				
				verificacao = ctPessoa.inserirCT(p);
				
				
				//voltamos de controller pessoa com um retorno para nosso metodo
				// verificacao agora ou eh true( se deu certo) ou é false(se deu errado)
				//Por isso vamos verificar e apresentar para o user a mensagem correta
				
				if (verificacao) {
					JOptionPane.showMessageDialog(frame, //o frame que criamos
					        "Usuário cadastrado com sucesso\n\n '", //mensagem
					        "Usuário cadastrado", // titulo da janela 
					        JOptionPane.INFORMATION_MESSAGE);
					
				}else {
					JOptionPane.showMessageDialog(frame, // o frame que criamos
					        "Houve um problema ao inserir:\n\n", //mensagem
					        "Erro ao inserir", // titulo da janela 
					        JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		}
		);			
	
		
	}
}
