package javaprogramming.filesystem;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRead {

    public static void main(String[] args) throws IOException {
        String inputFileName = "E:\\KishWorkspace\\DataStructuresAndAlgorithms\\src\\javaprogramming\\filesystem\\files\\input.txt";
        //System.out.println(readFileWithBufferedReader(inputFileName));
        //System.out.println(readFileUsingFileUtils(inputFileName));
        //System.out.println(readFileUsingFileInputStream(inputFileName));

        Path path = Paths.get("src/javaprogramming/filesystem/files/input.txt");
        System.out.println(Files.readAllLines(path));
        //System.out.println(IOUtils.toString(new FileInputStream(path.toFile()), Charset.defaultCharset()));
        //System.out.println(FileUtils.readFileToString(path.toFile(), Charset.defaultCharset()));
    }


   /* private static String readFileUsingFileInputStream(String inputFileName) throws IOException {
        return IOUtils.toString(new FileInputStream(inputFileName), Charset.defaultCharset());
    }*/

   /* private static String readFileUsingFileUtils(String inputFileName) throws IOException {
        return FileUtils.readFileToString(
                FileUtils.getFile(inputFileName),
                Charset.defaultCharset());
    }*/

    public static String readFileWithBufferedReader(String inputFileName) throws IOException {
        File file = new File(inputFileName);
        StringBuilder stringBuffer = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String st;
        while ((st = br.readLine()) != null){
            stringBuffer.append(st).append("\n");
        }
        return stringBuffer.toString();
    }
}
