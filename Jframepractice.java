import javax.swing.*;
import java.util.*;
class caal{
    public static void main(String[] args) {
        JFrame jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //button 7------------------------------------------------
        JButton btn7=new JButton("7");
        btn7.setBounds(10,10,50,50);
        jf.add(btn7);
        //button 8------------------------------------------------
        JButton btn8=new JButton("8");
        btn8.setBounds(70,10,50,50);
        jf.add(btn8);
        //button 9------------------------------------------------
        JButton btn9=new JButton("9");
        btn9.setBounds(130,10,50,50);
        jf.add(btn9);
        //button 4-------------------------------------------------
        JButton btn4=new JButton("4");
        btn4.setBounds(10,70,50,50);
        jf.add(btn4);
        //button 5-------------------------------------------------
        JButton btn5=new JButton("5");
        btn5.setBounds(70,70,50,50);
        jf.add(btn5);
        //button 6-------------------------------------------------
        JButton btn6=new JButton("6");
        btn6.setBounds(130,70,50,50);
        jf.add(btn6);
        //button 1-------------------------------------------------
        JButton btn1=new JButton("1");
        btn1.setBounds(10,130,50,50);
        jf.add(btn1);
        //button 2-------------------------------------------------
        JButton btn2=new JButton("2");
        btn2.setBounds(70,130,50,50);
        jf.add(btn2);
        //button 3-------------------------------------------------
        JButton btn3=new JButton("3");
        btn3.setBounds(130,130,50,50);
        jf.add(btn3);
        //equals button---------------------------------------------
        JButton btnequals=new JButton("=");
        btnequals.setBounds(10,185,170,50);
        jf.add(btnequals);
        //+ button-------------------------------------------------
        JButton btnadd=new JButton("+");
        btnadd.setBounds(195,10,50,45);
        jf.add(btnadd);
        //- button-------------------------------------------------
        JButton btnmin=new JButton("-");
        btnmin.setBounds(195,55,50,45);
        jf.add(btnmin);
        //* button-------------------------------------------------
        JButton btnmul=new JButton("*");
        btnmul.setBounds(195,100,50,45);
        jf.add(btnmul);
        //"/"button------------------------------------------------
        JButton btndiv=new JButton("/");
        btndiv.setBounds(195,145,50,45);
        jf.add(btndiv);
    }
}