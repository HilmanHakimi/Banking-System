package Day7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        //create file object for a non-existence file
        File file = new File("non_existence_file.txt");

        try{
            //creating a scanner object to read from the fie
            Scanner sc  = new Scanner(file);

            //Reading lines from the file until are no Lines
            while(sc.hasNextLine()){
                System.out.println(sc.hasNextLine());
            }
            //closing the sc
        } catch(FileNotFoundException e){
            System.out.println("File not found: "+ e.getLocalizedMessage());
        }

    }
}
