import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DeleteClassFiles {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("").toAbsolutePath().normalize();
        int deletedCount = 0;

        try (Stream<Path> paths = Files.walk(root)) {
            for (Path path : (Iterable<Path>) paths::iterator) {
                if (Files.isRegularFile(path) && path.getFileName().toString().endsWith(".class")) {
                    Files.delete(path);
                    System.out.println("Deleted: " + root.relativize(path));
                    deletedCount++;
                }
            }
        }

        System.out.println("Deleted " + deletedCount + " .class file(s) under " + root);
    }
}
