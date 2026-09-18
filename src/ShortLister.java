import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            Filter filter = new ShortWordFilter();

            System.out.println("Short words (length < 5):");
            System.out.println("--------------------------");

            try
            {
                Scanner inFile = new Scanner(selectedFile);

                while (inFile.hasNext())
                {
                    String word = inFile.next();

                    if (filter.accept(word))
                    {
                        System.out.println(word);
                    }
                }

                inFile.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found.");
            }
        }
        else
        {
            System.out.println("No file selected.");
        }
    }
}
