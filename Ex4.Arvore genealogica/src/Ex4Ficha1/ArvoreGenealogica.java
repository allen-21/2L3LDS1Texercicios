
package Ex4Ficha1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class ArvoreGenealogica extends JFrame {

    private JLabel labelNome;
    private JTextField fieldNome;
    private JLabel labelIdade;
    private JTextField fieldIdade;
    private JLabel labelPai;
    private JComboBox<Pessoa> comboBoxPai;
    private JLabel labelMae;
    private JComboBox<Pessoa> comboBoxMae;
    private JButton buttonSalvar;
    private JButton buttonLimpar;
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private DefaultListModel<Pessoa> modeloPessoas = new DefaultListModel<>();
    private JList<Pessoa> listPessoas = new JList<>(modeloPessoas);
    
    public ArvoreGenealogica() {
        setTitle("Árvore Genealógica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(6, 2));
        
        labelNome = new JLabel("Nome:");
        panel.add(labelNome);
        fieldNome = new JTextField();
        panel.add(fieldNome);
        
        labelIdade = new JLabel("Idade:");
        panel.add(labelIdade);
        fieldIdade = new JTextField();
        panel.add(fieldIdade);
        
        labelPai = new JLabel("Pai:");
        panel.add(labelPai);
        comboBoxPai = new JComboBox<>();
        panel.add(comboBoxPai);
        
        labelMae = new JLabel("Mãe:");
        panel.add(labelMae);
        comboBoxMae = new JComboBox<>();
        panel.add(comboBoxMae);
        
        buttonSalvar = new JButton("Salvar");
        buttonSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = fieldNome.getText();
                int idade = Integer.parseInt(fieldIdade.getText());
                Pessoa pai = (Pessoa) comboBoxPai.getSelectedItem();
                Pessoa mae = (Pessoa) comboBoxMae.getSelectedItem();
                Pessoa pessoa = new Pessoa(nome, idade, pai, mae);
                pessoas.add(pessoa);
                modeloPessoas.addElement(pessoa);
                JOptionPane.showMessageDialog(null, "salvo com sucesso!");
            }
        });
        panel.add(buttonSalvar);
        
        buttonLimpar = new JButton("Limpar");
        buttonLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldNome.setText("");
                fieldIdade.setText("");
                comboBoxPai.setSelectedIndex(0);
                comboBoxMae.setSelectedIndex(0);
            }
        });
        panel.add(buttonLimpar);
        
        JPanel panelPessoas = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(listPessoas);
        panelPessoas.add(scrollPane, BorderLayout.CENTER);
        panelPessoas.setBorder(BorderFactory.createTitledBorder("Lista"));
        
        add(panel, BorderLayout.NORTH);
        add(panelPessoas, BorderLayout.CENTER);
    }
    
    public void carregarDados() {
        Pessoa avo1 = new Pessoa("Avó: Rosa", 60);
        Pessoa avo2 = new Pessoa("Avô: Gomes", 75);
        Pessoa avo3 = new Pessoa("Avô:Anibal", 65);
        Pessoa avo4 = new Pessoa("Avô: Valter", 80);
        Pessoa pai1 = new Pessoa("pai: Ofelio", 50, avo1, avo2);
        Pessoa mae1 = new Pessoa("mãe: Maria", 45);
        
             comboBoxPai.addItem(pai1);
        comboBoxPai.addItem(mae1);
        
        comboBoxMae.addItem(pai1);
        comboBoxMae.addItem(mae1);
        
        pessoas.add(avo1);
        pessoas.add(avo2);
        pessoas.add(avo3);
        pessoas.add(avo4);
        pessoas.add(pai1);
        pessoas.add(mae1);
        
        for (Pessoa pessoa : pessoas) {
            modeloPessoas.addElement(pessoa);
        }
    }
} 








