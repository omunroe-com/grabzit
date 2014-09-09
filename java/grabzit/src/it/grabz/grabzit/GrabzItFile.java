/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.grabz.grabzit;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Represents the screenshot file generated by GrabzIt
 * 
 * @version 2.0
 * @author GrabzIt
 */
public class GrabzItFile {
    private byte[] bytes;

    public GrabzItFile(byte[] bytes)
    {
        this.bytes = bytes;
    }

    /**
     * Save GrabzItFile to physical file.
     * @param path The path to save the file to
     * @throws IOException
     * @throws Exception
     */
    public void Save(String path) throws IOException, Exception
    {
        FileOutputStream fileOuputStream = null;
        try
        {
            fileOuputStream = new FileOutputStream(path);
            fileOuputStream.write(getBytes());
        }
        finally
        {
            if (fileOuputStream != null)
            {
                fileOuputStream.close();
            }
        }
    }

    /**
     * @return the raw bytes of the screenshot file
     */
    public byte[] getBytes() {
        return bytes;
    }
}