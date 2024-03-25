package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFactory {

    public static int[] createArrayFromFile(String filePath) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            return stream.flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
