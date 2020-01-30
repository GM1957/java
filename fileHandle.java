import java.io.*;
public class fileHandle
{
    public static void main(String[] args) throws IOException
    {   
        int i;
        FileOutputStream fout = new FileOutputStream("./file/myFirstFile.txt", true);
        String s = "bye bye";
        char ch[] = s.toCharArray();
        for (i=0; i< s.length(); i++)
        {
            fout.write(ch[i]);
        }
        fout.close();
    }
}