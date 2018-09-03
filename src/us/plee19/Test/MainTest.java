package us.plee19.Test;

import org.junit.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainTest extends junit.framework.TestCase {

    @Test
    public void testEncryptFile() throws IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader("cryptoInput.txt"));
        BufferedReader deencryptedFile = new BufferedReader(new FileReader("decryptedFile.txt"));
        assertEquals(inputFile.readLine(), deencryptedFile.readLine());
    }

    @Test
    public void testDecryptFile() throws IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader("cryptoInput.txt"));
        BufferedReader deencryptedFile = new BufferedReader(new FileReader("decryptedFile.txt"));
        assertEquals(inputFile.readLine(), deencryptedFile.readLine());
    }
}
