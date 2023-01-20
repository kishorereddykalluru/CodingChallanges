package dummy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("./src/dummy/input.txt");
        String s = Files.readString(path);

        System.out.println(s);
        Path newFilePath = Path.of("./src/dummy/input_new.txt");
        Files.writeString(newFilePath, s);
    }
}
