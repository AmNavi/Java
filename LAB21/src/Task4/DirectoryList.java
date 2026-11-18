package Task4;

import java.io.File;
import java.util.ArrayList;

public class DirectoryList {

    public static ArrayList<String> getFiles(String path) {
        File directory = new File(path);
        ArrayList<String> files = new ArrayList<>();

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Каталог не найден");
            return files;
        }

        String[] names = directory.list();

        if (names != null) {
            for (String name : names) {
                files.add(name);
            }
        }

        return files;
    }

    public static void main(String[] args) {
        ArrayList<String> files = getFiles(".");

        // Выводим первые пять элементов
        for (int i = 0; i < files.size() && i < 5; i++) {
            System.out.println(files.get(i));
        }
    }
}
