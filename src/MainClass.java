import java.io.*;

public class MainClass {
    public static void main(String[]args){
        //String to write to file
        writeStringToFileWithFileReader();
    }

    // Writes stream of characters
    private static void writeStringToFileWithFileReader() {
        String textInput = "Master are legends all time HDJDKDKKDKD  KKSLLSS";

        try {
            //Creates File Writer Object
            FileWriter fileWriter = new FileWriter("Prefs.txt");

            //Writes string to file
            fileWriter.write(textInput);
            System.out.println("Writing successful");

            //close the file
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        readFileContentWIthFileReader();
    }

    private static void readFileContentWIthFileReader() {
     // File Reader reads stream of characters
        int characterStream;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Prefs.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Reading Stream \n");
        while (true) {
            try {
                while (((characterStream=fileReader.read()))!=-1){
                 System.out.println((char)characterStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            readAndWriteWithBytes();
        }

        //Call File outStream Read and Write

    }

    //Reads and Writes Byte streams
    private static void readAndWriteWithBytes(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int inputStream;

        try {
            fileInputStream = new FileInputStream("Prefs.txt");
            fileOutputStream = new FileOutputStream("OutPut.txt");

            while ((inputStream=fileInputStream.read())!=-1){
                fileOutputStream.write(inputStream);
            }
            System.out.println("Output Stream Complete");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
