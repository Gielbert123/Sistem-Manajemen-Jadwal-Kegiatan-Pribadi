package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "jadwal.txt";

    public static void simpanSemua(List<Kegiatan> list) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Kegiatan k : list) {
                out.println(k.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Kegiatan> bacaSemua() {
        List<Kegiatan> list = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data.length == 3) {
                    list.add(new Kegiatan(data[0], data[1], data[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}