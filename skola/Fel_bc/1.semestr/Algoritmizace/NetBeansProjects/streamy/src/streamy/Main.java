/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package streamy;

import java.io.*;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\Java-project\\prvni\\streamy\\src\\streamy\\Main.java");
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\Java-project\\test\\muj.txt")));
            int k = 0, m = 0;
            while ((k = fis.read()) != -1) {

                System.out.print((char) k);
                if (Character.isLetter(k) ||  k == 10) {
                    
                }
                m++;
            }
            
            fis.close();
            System.out.print(m);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}