package com.company;

import java.util.ArrayList;

public class NewGen {

    NewGen() {
        System.out.println("\nПример использования обобщений 1");

        Gen<Integer> iob = new Gen<Integer>(105);
        Gen<String> sob = new Gen<String>("обобщение");

        System.out.println("iob является объектом типа " + iob.showType() + ".  Его значение: " + iob.getOb());
        System.out.println("sob является объектом типа " + sob.showType() + ".  Его значение: " + sob.getOb());
    }
}
