/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak4;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
public class Prak4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI g = new GUI();
    }
    
}
class GUI extends JFrame {
final JTextField fAlamat = new JTextField(10);

JLabel lJudul = new JLabel ("BIODATA DIRI");
JLabel LabelGambar;
JLabel lNama = new JLabel ("ISNANIAR ESKA");
JLabel lTTL = new JLabel ("Wonogiri, 11 September 2000");
JLabel lAgama = new JLabel("Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
JComboBox cmbAgama = new JComboBox(namaAgama);
JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
JRadioButton rbWanita = new JRadioButton("Perempuan ");
JLabel lAlamat = new JLabel ("ALAMAT");
JButton btnSave = new JButton("SAVE");
JButton btnEdit = new JButton("EDIT");

public GUI(){
    setTitle ("BIODATA");
    setDefaultCloseOperation(3);
    setSize(350,900);
    
    ButtonGroup group = new ButtonGroup();
    group.add(rbPria);
    group.add(rbWanita);
    LabelGambar = new JLabel (new ImageIcon (getClass().getResource(("image.jpg"))));
    
    setLayout (null);
    add(lJudul);
    add(LabelGambar);
    add(lNama);
    add(lTTL);
    add(cmbAgama);
    add(rbPria);
    add(rbWanita);
    add(lAlamat);
    add(fAlamat);
    add(btnSave);
    add(btnEdit);
    
    lJudul.setBounds(100,10,100,20);
    LabelGambar.setBounds(80,40,120,120);
    lNama.setBounds(100,180,120,50);
    lTTL.setBounds(70,220,200,20);
    lAgama.setBounds(100,230,90,20);
    cmbAgama.setBounds(40,250,230,20);
    rbPria.setBounds(40,270,120,20);
    rbWanita.setBounds(180,270,120,20);
    lAlamat.setBounds(130,300,120,20);
    fAlamat.setBounds(40,320,230,100);
    btnSave.setBounds(40,440,90,30);
    btnEdit.setBounds(180,440,90,30);
    setVisible(true);
}
}
