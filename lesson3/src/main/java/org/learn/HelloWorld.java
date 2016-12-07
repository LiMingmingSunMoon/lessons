package org.learn;

/**
 * Created by lmm on 2016/12/7.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld o = new HelloWorld();

        o.order();

        o.branch(7);
        o.branch(8888);

        o.circle();
    }

    void circle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void branch(int value) {
        if (value % 2 == 0) {
            System.out.println("i能被2整除".replace("i", String.valueOf(value)));
        } else {
            System.out.println("i不以被2整除".replace("i", String.valueOf(value)));
        }
    }

    void order() {
        int i;
        i = 0;
        int j = 1;
        System.out.println("i = @i,  j = @j"
                .replace("@i", String.valueOf(i))
                .replace("@j", String.valueOf(j)));

    }
}
