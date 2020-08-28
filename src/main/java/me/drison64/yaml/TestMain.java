package me.drison64.yaml;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) {

        Yaml yaml = new Yaml();

        yaml.set("a.b.c.d.e.f.g.h.i.j.k.l", "kocka");

        try {
            yaml.testToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
