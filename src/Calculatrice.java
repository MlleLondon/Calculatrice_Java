import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculatrice extends JFrame implements ActionListener {

	public JLabel lbTitre= new JLabel("Ma calculatrice");
	//Pour stocker le symbole d'opération utilisé
	private String operation;
	//Pour stocker la première rentrée avant opération
	private float temp;
	//On déclare tous les bouttons
	private JButton btModulo= new JButton("%");
	private JButton btFract= new JButton("1/x");
	private JButton btCarre= new JButton("x²");
	private JButton btSqrt= new JButton("sqrt(x)");
	private JButton btDiv= new JButton("/");
	private JButton btMult= new JButton("*");
	private JButton btSous= new JButton("-");
	private JButton btAdd= new JButton("+");
	private JButton btEgal= new JButton("=");
	private JButton btVirgule= new JButton(".");
	private JButton btReset= new JButton("Supp");
	private JButton btUn= new JButton("1");
	private JButton btDeux= new JButton("2");
	private JButton btTrois= new JButton("3");
	private JButton btQuatre= new JButton("4");
	private JButton btCinq= new JButton("5");
	private JButton btSix= new JButton("6");
	private JButton btSept= new JButton("7");
	private JButton btHuit= new JButton("8");
	private JButton btNeuf= new JButton("9");
	private JButton btZero= new JButton("0");
	private JTextField txtCalc= new JTextField();
	
	public Calculatrice() {
		//On initialise les variables
		this.operation="";
		this.temp=0;
		//On ne peut pas écrire dans l'input text avec le clavier, on peut seulement écrire à partir des touches chiffrées
		this.txtCalc.setEditable(false);
		
		//Design fenêtre
		this.setTitle("Ma calculatrice");
		this.setBounds(200, 150, 415, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setResizable(false);
		this.setLayout(null);this.setVisible(true);
		//Design dans la fenêtre
			//On aggrandit la police
		Font unePolice= new Font("Arial", Font.BOLD, 16);
		this.lbTitre.setFont(unePolice);
		this.txtCalc.setFont(unePolice);
		this.btModulo.setFont(unePolice);
		this.btFract.setFont(unePolice);
		this.btCarre.setFont(unePolice);
		this.btSqrt.setFont(unePolice);
		this.btSept.setFont(unePolice);
		this.btHuit.setFont(unePolice);
		this.btNeuf.setFont(unePolice);
		this.btMult.setFont(unePolice);
		this.btQuatre.setFont(unePolice);
		this.btCinq.setFont(unePolice);
		this.btSix.setFont(unePolice);
		this.btSous.setFont(unePolice);
		this.btUn.setFont(unePolice);
		this.btDeux.setFont(unePolice);
		this.btTrois.setFont(unePolice);
		this.btAdd.setFont(unePolice);
		this.btDiv.setFont(unePolice);
		this.btZero.setFont(unePolice);
		this.btVirgule.setFont(unePolice);
		this.btReset.setFont(unePolice);
		this.btEgal.setFont(unePolice);
		
		
		
		//On définit le placement
		this.lbTitre.setBounds(150, 20, 200, 30);
		this.add(this.lbTitre);
		//Première ligne
		this.txtCalc.setBounds(0, 80, 400, 50);
		this.add(this.txtCalc);
		//Deuxième ligne
		this.btModulo.setBounds(0, 130, 100, 50);
		this.add(this.btModulo);
		this.btFract.setBounds(100, 130, 100, 50);
		this.add(this.btFract);
		this.btCarre.setBounds(200, 130, 100, 50);
		this.add(this.btCarre);
		this.btSqrt.setBounds(300, 130, 100, 50);
		this.add(this.btSqrt);
		//Troisième ligne
		this.btSept.setBounds(0, 180, 100, 50);
		this.add(this.btSept);
		this.btHuit.setBounds(100, 180, 100, 50);
		this.add(this.btHuit);
		this.btNeuf.setBounds(200, 180, 100, 50);
		this.add(this.btNeuf);
		this.btMult.setBounds(300, 180, 100, 50);
		this.add(this.btMult);
		//Quatrième ligne
		this.btQuatre.setBounds(0, 230, 100, 50);
		this.add(this.btQuatre);
		this.btCinq.setBounds(100, 230, 100, 50);
		this.add(this.btCinq);
		this.btSix.setBounds(200, 230, 100, 50);
		this.add(this.btSix);
		this.btSous.setBounds(300, 230, 100, 50);
		this.add(this.btSous);
		//Cinquième ligne
		this.btUn.setBounds(0, 280, 100, 50);
		this.add(this.btUn);
		this.btDeux.setBounds(100, 280, 100, 50);
		this.add(this.btDeux);
		this.btTrois.setBounds(200, 280, 100, 50);
		this.add(this.btTrois);
		this.btAdd.setBounds(300, 280, 100, 50);
		this.add(this.btAdd);
		//Sixième ligne
		this.btDiv.setBounds(0, 330, 100, 50);
		this.add(this.btDiv);
		this.btZero.setBounds(100, 330, 100, 50);
		this.add(this.btZero);
		this.btVirgule.setBounds(200, 330, 100, 50);
		this.add(this.btVirgule);
		this.btReset.setBounds(300, 330, 100, 50);
		this.add(this.btReset);
		//Dernière ligne
		this.btEgal.setBounds(0, 380, 400, 50);
		this.add(this.btEgal);
		
		
		//Rendre les boutons cliquables
		this.txtCalc.addActionListener(this);
		this.btModulo.addActionListener(this);
		this.btFract.addActionListener(this);
		this.btCarre.addActionListener(this);
		this.btSqrt.addActionListener(this);
		this.btSept.addActionListener(this);
		this.btHuit.addActionListener(this);
		this.btNeuf.addActionListener(this);
		this.btMult.addActionListener(this);
		this.btQuatre.addActionListener(this);
		this.btCinq.addActionListener(this);
		this.btSix.addActionListener(this);
		this.btSous.addActionListener(this);
		this.btUn.addActionListener(this);
		this.btDeux.addActionListener(this);
		this.btTrois.addActionListener(this);
		this.btAdd.addActionListener(this);
		this.btDiv.addActionListener(this);
		this.btZero.addActionListener(this);
		this.btVirgule.addActionListener(this);
		this.btReset.addActionListener(this);
		this.btEgal.addActionListener(this);
		
		
	}
	
	
	
	public static void main(String[] args) {
		Calculatrice uneCalculatrice= new Calculatrice();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Remplir txtCalc pour chaque boutton numérique
		if(e.getSource()==this.btZero) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btZero.getText());
		}
		else if(e.getSource()==this.btUn) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btUn.getText());
		}
		else if(e.getSource()==this.btDeux) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btDeux.getText());
		}
		else if(e.getSource()==this.btTrois) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btTrois.getText());
		}
		else if(e.getSource()==this.btQuatre) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btQuatre.getText());
		}
		else if(e.getSource()==this.btCinq) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btCinq.getText());
		}
		else if(e.getSource()==this.btSix) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btSix.getText());
		}
		else if(e.getSource()==this.btSept) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btSept.getText());
		}
		else if(e.getSource()==this.btHuit) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btHuit.getText());
		}
		else if(e.getSource()==this.btNeuf) {
			this.txtCalc.setText(this.txtCalc.getText()+this.btNeuf.getText());
		}
		else if(e.getSource()==this.btVirgule) {
			//Si l'input possède déjà une virgule on en rajoute pas
			if(!this.txtCalc.getText().contains(".")) {
				this.txtCalc.setText(this.txtCalc.getText()+this.btVirgule.getText());
			}
			
			
		}
		//Vider txtCalc
		else if(e.getSource()== this.btReset) {
			this.txtCalc.setText("");
			this.temp=0;
			this.operation="";
		}
		
		//Opérations
		else if(e.getSource()==this.btModulo) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			this.operation=this.btModulo.getText();
			this.txtCalc.setText("");
		}
		//Pour la 1/x on peut calculer tout de suite le résultat
		else if(e.getSource()==this.btFract) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			if(this.temp==0) {
				JOptionPane.showMessageDialog(this, "Division par 0 impossible !",
						"Erreur", JOptionPane.ERROR_MESSAGE);
				this.txtCalc.setText("");
			}
			else {
				float calc= 1/this.temp;
				this.txtCalc.setText(calc+"");
			}
		}
		//Pour le carrée on peut calculer de suite le résultat
		else if(e.getSource()==this.btCarre) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			float result= this.temp*this.temp;
			this.txtCalc.setText(result+"");
		}
		//Pour la racine carrée aussi
		else if(e.getSource()==this.btSqrt) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			float result=(float) Math.sqrt(this.temp);
			this.txtCalc.setText(result+"");
		}
		else if(e.getSource()==this.btMult) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			this.operation=this.btMult.getText();
			this.txtCalc.setText("");
		}
		else if(e.getSource()==this.btSous) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			this.operation=this.btSous.getText();
			this.txtCalc.setText("");
		}
		else if(e.getSource()==this.btAdd) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			this.operation=this.btAdd.getText();
			this.txtCalc.setText("");
		}
		else if(e.getSource()==this.btDiv) {
			this.temp=Float.parseFloat(this.txtCalc.getText());
			this.operation=this.btDiv.getText();
			this.txtCalc.setText("");
		}
		
		//On veut connaitre le résultat
		else if(e.getSource()==this.btEgal) {
			if(this.temp==0) {
				this.txtCalc.setText(this.txtCalc.getText());
				JOptionPane.showMessageDialog(this, "Veuillez choisir une opération\n"+" pour le calcul"
					);
			}
			else {
				float result=this.temp;
				boolean bool=true;
				switch(this.operation) {
					case ("%"):
						if(Float.parseFloat(this.txtCalc.getText()) == 0) {
							JOptionPane.showMessageDialog(this, "Modulo de la division de\n"+this.temp+" par 0 impossible !",
									"Erreur", JOptionPane.ERROR_MESSAGE);
							bool=false;
						}
						else {
							result=result % Float.parseFloat(this.txtCalc.getText());
						}
					break;
					case ("*"):
						result=result * Float.parseFloat(this.txtCalc.getText());
					break;
					case ("-"):
						result=result - Float.parseFloat(this.txtCalc.getText());
					break;
					case ("+"):
						result=result + Float.parseFloat(this.txtCalc.getText());
					break;
					case ("/"):
						if(Float.parseFloat(this.txtCalc.getText()) == 0) {
							JOptionPane.showMessageDialog(this, "Division par 0 impossible !",
									"Erreur", JOptionPane.ERROR_MESSAGE);
							bool=false;
						}
						else {
							result=result / Float.parseFloat(this.txtCalc.getText());
						}
						
					break;
				}
				if(bool==true) {
					this.txtCalc.setText(result+"");
				}
				//Une erreur est survenue on vide l'input
				else {
					this.txtCalc.setText("");
				}
				
			}
		}
		
	}

}
