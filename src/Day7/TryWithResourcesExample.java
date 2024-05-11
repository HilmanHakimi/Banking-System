package Day7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;


public class TryWithResourcesExample {
    public static void main(String[] args) {
        //try with resources statement, automatically close the buffer reader

        try(BufferedReader br = new BufferedReader(new FileReader("Exmple.txt"))){
            String Line;

            //Read each line from the file until the end of file is reached
            while((Line = br.readLine()) !=null){
                //print the line to console
                System.out.println(Line);
            }

        }catch(IOException e){
            System.out.println("An error occured "+ e.getMessage());
        }

    }
}
