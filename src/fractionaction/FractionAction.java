/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionaction;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class FractionAction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        
        int i=n/d;
        int r=n%d;
        
        if (r==0) {
            System.out.print(i);
        } else {
            int f=getGCF(r,d);
            System.out.printf("%d %d/%d",i,r/f,d/f);
        }
    }

    private static int getGCF(int r, int d) {
        if (d%r==0) return r;
        return getGCF(d%r,r);
    }
    
}
