package us.plee19;

import java.io.*;

/**
 * This main method is used to run the encryptFile and decryptFile methods.
 * @author plee19
 * @version 1
 */
public class Main {

    public static void main(String[] args) throws IOException {

        encryptFile("cryptoInput.txt");
        System.out.println();
        decryptFile("encryptedFile.txt");
        }

    /**
     * Method to encrypt a text file into a new text file by increasing the unicode value by 10.
     * @param fileName String name of the input text file
     * @throws IOException when file is not found or another IOException is thrown
     */
    public static void encryptFile(String fileName) throws IOException {
        String inputFile = fileName;
        BufferedReader inFile = new BufferedReader( new FileReader(inputFile));
        BufferedWriter outputFile = new BufferedWriter( new FileWriter("encryptedFile.txt"));
        int currentChar = inFile.read();
        while (currentChar != -1) {
            System.out.print((char)(currentChar + 10));
            outputFile.write((char)(currentChar + 10));
            currentChar = inFile.read();
        }
        outputFile.close();

    }

    /**
     * Method to decrypt a text file into a new text file by decreasing the unicode value by 10.
     * @param fileName String name of the input text file
     * @throws IOException when file is not found or another IOException is thrown
     */
    public static void decryptFile(String fileName) throws IOException {
        String inputFile = fileName;
        BufferedReader inFile = new BufferedReader(new FileReader(inputFile));
        BufferedWriter outputFile = new BufferedWriter(new FileWriter("decryptedFile.txt"));
        int currentChar = inFile.read();
        while (currentChar != -1) {
            System.out.print((char)(currentChar - 10));
            outputFile.write((char)(currentChar - 10));
            currentChar = inFile.read();
        }
        outputFile.close();
    }
}