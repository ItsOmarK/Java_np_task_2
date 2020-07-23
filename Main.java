import java.io.*;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader file_r = new FileReader("D:\\Edu\\TaskNP\\out\\production\\TaskNP\\names.txt");
            BufferedReader readNames = new BufferedReader(file_r);

            FileInputStream file_r1 = new FileInputStream("D:\\Edu\\TaskNP\\out\\production\\TaskNP\\grades.out");
            DataInputStream readGrades = new DataInputStream(file_r1);

            FileWriter file_w = new FileWriter("list.txt");
            BufferedWriter out = new BufferedWriter(file_w);
            String currentLine;
            while( (currentLine = readNames.readLine()) != null ){
                out.write(""+readGrades.readDouble()+"  "+ currentLine);
                out.newLine();

            }
            out.write("Finished Copying Data!");
            out.flush();
            out.close();
        }
        catch (IOException ioe){
            System.err.println ("I/O error - " + ioe);
        }

    }


}
