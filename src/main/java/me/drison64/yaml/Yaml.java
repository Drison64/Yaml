package me.drison64.yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Yaml {

    private HashMap<String, Object> values;

    public Yaml() {
        values = new HashMap<>();
    }

    public void set(String path, Object value) {
        values.put(path, value);
    }

    public Object get(String path) {
        return values.get(path);
    }

    public String getString(String path) {
        return (String) values.get(path);
    }

    public Integer getInteger(String path) {
        return (Integer) values.get(path);
    }

    public Double getDouble(String path) {
        return (Double) values.get(path);
    }

    public void testToFile() throws IOException {
        File file = new File("D:\\IdeaProjects\\Yaml", "data.yml");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        for (String path : values.keySet()) {

            System.out.println(path);
            if (path.contains(".")) {

                String[] dotPath = path.split("\\.");
                for (int i = 0; i < dotPath.length; i++) {

                    String idk = dotPath[i];
                    String spaces = "";

                    for (int j = 0; j < i; j++) {
                        spaces = spaces + "    ";
                    }

                    fileWriter.write(spaces + idk + ": \n");

                }

                fileWriter.close();
                return;

            }

            fileWriter.write(path + ": \n");

        }

        fileWriter.close();

    }

    

}
