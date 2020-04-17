package sekcja11.scope;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Your number:");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 0; x <= 12; x++) {
            System.out.println(this.x+" * " + x+" = " + this.x*x);
        }
    }
}
