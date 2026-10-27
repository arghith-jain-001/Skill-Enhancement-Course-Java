import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFileCounter {

    public static void main(String[] args) {
        // Get the directory where the program is running from
        Path startDir = Paths.get(System.getProperty("user.dir"));
        System.out.println("Scanning directory: " + startDir);

        File root = startDir.toFile();
        int count = countJavaFiles(root);
        System.out.println("Total .java files found: " + count);
    }

    // Recursively count .java files
    static int countJavaFiles(File dir) {
        int count = 0;

        File[] files = dir.listFiles();
        if (files == null) return 0;

        for (File file : files) {
            if (file.isDirectory()) {
                count += countJavaFiles(file);   // recurse into subfolders
            } else if (file.getName().endsWith(".java")) {
                // System.out.println("Found: " + file.getAbsolutePath());
                count++;
            }
        }
        return count;
    }
}