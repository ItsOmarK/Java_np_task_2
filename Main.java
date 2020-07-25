
import java.io.*;
public class main {

    public static void main(String[] args) {
        try {
            FileInputStream file_r = new FileInputStream("names.txt");
            BufferedInputStream nameBuffer = new BufferedInputStream(file_r);
            DataInputStream readNames = new DataInputStream(nameBuffer);

            FileInputStream file_r1 = new FileInputStream("grades.out");
            BufferedInputStream gradesBuffer = new BufferedInputStream(file_r1);
            DataInputStream readGrades = new DataInputStream(gradesBuffer);

            FileOutputStream file_w = new FileOutputStream("list.txt");
            BufferedOutputStream outBuffer = new BufferedOutputStream(file_w);
            DataOutputStream out = new DataOutputStream(outBuffer);
            String currentLine="";
            String[] names;
            int hold;
            while((hold = readNames.read()) != -1){
                currentLine+= (char)hold;
            }
            names = currentLine.split("\n");
            for(String name:names){
                out.writeChars(readGrades.readDouble()+"   "+name);
                out.writeChar('\n');
            }

            out.flush();
            out.close();
            System.out.println("Finished copying data");
        }
        catch (IOException ioe){
            System.err.println ("I/O error - " + ioe);
        }

    }


}
