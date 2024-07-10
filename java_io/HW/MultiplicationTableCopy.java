
import java.io.*;
public class MultiplicationTableCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java MultiplicationTableCopy <input_file> <output_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
             PrintWriter writer = new PrintWriter(new File(outputFile));

            String line;
            while ((line = reader.readLine()) != null) 
            {
                // Split the line using " = " as the delimiter
                String[] parts = line.split("x");

                // Ensure we have a valid format
                    int modifiedResult = result + 2;

                    // Write to the output file
                    writer.printf("10*%d = %d 10*%d = %d + 2 = %d\n", multiplier, result, multiplier, result, modifiedResult);
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
