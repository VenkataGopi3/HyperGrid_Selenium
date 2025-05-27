package Exception;


    import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

    public class Exception3 {
        public static void main(String[] args) {
            //int i=5/0;
            File file = new File("");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

