import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter des file:");
        String desFile = scanner.nextLine();
        copyFile(sourceFile,desFile);
    }
    public static void copyFile(String sourcePath, String desPath) {
        File sourceFile = new File(sourcePath);
        File desFile = new File(desPath);
      FileInputStream fileInputStream = null;
      FileOutputStream fileOutputStream = null;
      byte[] bytes = new byte[1024];
      int length;
      try {
          fileInputStream = new FileInputStream(sourceFile);
          fileOutputStream = new FileOutputStream(desFile);
          while ((length = fileInputStream.read(bytes))> 0){
              fileOutputStream.write(bytes,0,length);
          }
          System.out.println(desFile.length());
          System.out.println("Done");

          fileOutputStream.close();
          fileInputStream.close();
      }catch (IOException e){
          System.out.println(e.getMessage());
      }

    }
}
