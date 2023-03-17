package fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    private static String folderpath = "C:\\Users\\Lenovo\\IdeaProjects\\Java Core\\src\\fileutil";

    public static void main(String[] args) throws IOException {
//       fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
//        createFileWithContent();

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։

    public static void fileSearch() throws IOException {
        System.out.println("Input folder name.");
        String folderName = scanner.nextLine();
        System.out.println("Input file name in folder.");
        String fileName = scanner.nextLine();
        File myFile = new File(folderpath);
        if (myFile.isDirectory()) {
            File[] files = myFile.listFiles();
            for (File value : files) {
                if (value.getName().equals(folderName)) {
                    myFile = new File(folderName);
                    if (myFile.isDirectory()) {
                        File[] myDirFile = myFile.listFiles();
                        for (File file : myDirFile) {
                            boolean exist = false;
                            if (file.getName().equals(fileName)) {
                                myFile = new File(myFile.getAbsolutePath(), fileName);
                                System.out.println(myFile.exists());
                                System.out.println(myFile.toURI());
                                exist = true;
                            }
                            if (!exist) {
                                System.out.println("No file");
                                break;
                            }
                        }
                    }
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Input keyword");
        String keyword = scanner.nextLine();

        File folder = new File(folderpath);

        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        boolean exists = false;
                        while ((line = reader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                exists = true;
                            }
                        }
                        if (!exists) {
                            System.out.println("no file");
                        }
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        File folderPath = new File(folderpath);
        File[] files = folderPath.listFiles();
        System.out.println("All file format .txt");
        if (files != null) {
            String getPathTxtFormat;
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    getPathTxtFormat = file.getAbsolutePath();
                    System.out.println(getPathTxtFormat);
                    System.out.println("Input file path for format .txt");
                    String filePathText = scanner.nextLine();
                    System.out.println("Input keyword");
                    String keyword = scanner.nextLine();
                    if (filePathText.equals(getPathTxtFormat)) {
                        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                continue;
                            }
                            System.out.println(line);
                        }
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Input path for size folder");
        String pathFolderSize = scanner.nextLine();
        File folderfile = new File(folderpath);
        File[] allFiles = folderfile.listFiles();
        long size = 0;
        if(allFiles != null){
            for (File allFile : allFiles) {
                if(allFile.getName().equals(pathFolderSize)){
                    folderfile = new File(pathFolderSize);
                    allFiles = folderfile.listFiles();
                    if(allFile.isDirectory()){
                        for (File file : allFiles) {
                            size += file.length();
                        }
                        System.out.println(size + " byte");
                    }
                }
            }
            if(size == 0){
                System.out.println("Invalid package name");
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Input path for create package");
        String packageName = scanner.nextLine();
        System.out.println("Input file name for created your package");
        String fileName = scanner.nextLine();
        System.out.println("Input content for add your file");
        String contentFile = scanner.nextLine();
        File myFile = new File(folderpath);
        File[] lFile = myFile.listFiles();
        for (File file : lFile) {
            if(!file.getName().equals(packageName)){
                myFile = new File(packageName);
                myFile.mkdir();
                if(myFile.isDirectory()){
                    if(fileName.endsWith(".txt") || fileName.endsWith(".html") || fileName.endsWith(".java")){
                        File createNewFile = new File(myFile.getAbsolutePath() + File.separator + fileName);
                        createNewFile.createNewFile();
                        if(createNewFile.isFile()){
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createNewFile));
                                bufferedWriter.write(contentFile);
                                bufferedWriter.close();
                            } catch (IOException e) {
                                System.out.println("Error " + e.getMessage());
                            }

                        }
                    }else {
                        System.out.println("Invalid file format");
                    }


                }
            }
        }

    }

}
