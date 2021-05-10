
package tugas.pertemuan.pkg5;

import java.awt.event.*;
import javax.swing.*;
import bidang.Persegi;
import ruang.Balok;

public class View extends JFrame implements ActionListener{

    JLabel Panjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(10);  
    JLabel Lebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(10);  
    JLabel Tinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(10);
    JLabel Hasil = new JLabel("Hasil : ");
    JLabel LuasPersegi = new JLabel(); 
    JLabel KelilingPersegi = new JLabel();
    JLabel VolumeBalok = new JLabel();
    JLabel LuasBalok = new JLabel(); 
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    View()
    {
        setTitle("Tugas Pertemuan 5");
        setSize(500,400);
        setLayout(null);
        add(Panjang);
        add(fPanjang);
        add(Lebar);
        add(fLebar);
        add(Tinggi);
        add(fTinggi);
        add(Hasil);
        add(bHitung);
        add(bReset);      
        Panjang.setBounds(100,50,200,20);
        fPanjang.setBounds(190, 50, 200, 20);
        Lebar.setBounds(100,80,150,20);
        fLebar.setBounds(190, 80, 200, 20);
        Tinggi.setBounds(100,110,150,20);
        fTinggi.setBounds(190, 110, 200, 20);
        Hasil.setBounds(100, 170, 150, 20);
        bHitung.setBounds(145, 300, 100, 30);
        bReset.setBounds(250, 300, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);      
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bHitung) 
        {
            
            try{
                double p, l, t;
                p = Double.parseDouble(fPanjang.getText());
                l = Double.parseDouble(fLebar.getText());
                t = Double.parseDouble(fTinggi.getText());
                Persegi persegi = new Persegi(p, l);
                Balok balok = new Balok(p, l, t);               

                LuasPersegi.setText("Luas Persegi : " + Double.toString(persegi.luas()));
                add(LuasPersegi);
                LuasPersegi.setBounds(190, 170, 200, 20);
                
                KelilingPersegi.setText("Keliling Persegi : " + Double.toString(persegi.keliling()));
                add(KelilingPersegi);
                KelilingPersegi.setBounds(190, 195, 200, 20);
                
                VolumeBalok.setText("Volume Balok : " + Double.toString(balok.volume()));
                add(VolumeBalok);
                VolumeBalok.setBounds(190, 220, 200, 20);
                
                LuasBalok.setText("Luas Permukaan Balok : " + Double.toString(balok.luas()));
                add(LuasBalok);
                LuasBalok.setBounds(190, 245, 200, 20);              
            }
            catch(NumberFormatException ae){
                JOptionPane.showMessageDialog(null, ""+ae.getMessage());
            }
            
        }
        
        if (e.getSource() == bReset) 
        {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            LuasPersegi.setText(null);
            KelilingPersegi.setText(null);
            VolumeBalok.setText(null);
            LuasBalok.setText(null);
        }
    }

    
    
}
