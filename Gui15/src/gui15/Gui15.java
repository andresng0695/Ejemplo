/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Usuario
 */
//hola 
public class Gui15 extends JFrame {
Container panel;
JPanel p1, p2;
JLabel l1, msg;
JComboBox ch1;
String[] lista = {"Opción 1", "Opción 2", "Opción 3"};
JScrollBar bar1;
public Gui15() {
super("Controles");
setLayout(new BorderLayout());
p1 = new JPanel(new GridLayout(1, 3, 10, 10));
p1.setBackground(Color.lightGray);
l1 = new JLabel("Elegir:", Label.RIGHT);
l1.setBackground(Color.yellow);
p1.add(l1);
ch1 = new JComboBox();
for(int i = 0; i < lista.length; i++)
ch1.addItem(lista[i]);
ch1.addItemListener(new OyenteCombo());
p1.add(ch1);
bar1 = new JScrollBar(Scrollbar.HORIZONTAL, 0, 0, 0, 100);
/* scroll de 0 a 100*/
bar1.addAdjustmentListener(new OyenteBarra());
p1.add(bar1);
p2 = new JPanel(new BorderLayout());
p2.setBackground(Color.lightGray);
msg = new JLabel("Msg:", Label.LEFT);
msg.setForeground(Color.blue);
p2.add("North", msg);
add(p1, "North");
add(p2, "South");
setSize(300, 100);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
Gui15 ventana = new Gui15();
}
class OyenteCombo implements ItemListener {
public void itemStateChanged(ItemEvent e) {
int ind = ch1.getSelectedIndex();
msg.setText((String)ch1.getSelectedItem());
}
}
class OyenteBarra implements AdjustmentListener {
public void adjustmentValueChanged(AdjustmentEvent e) {
int valor = bar1.getValue();
String cad = "Valor : " + valor;
msg.setText(cad);
}
}
}
