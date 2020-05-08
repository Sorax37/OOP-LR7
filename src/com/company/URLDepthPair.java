package com.company;
import java.net.*;

public class URLDepthPair {
    private String InputURL;
    private int InputDepth;

    public URLDepthPair(String URL, int Depth)
    {
        InputURL = URL;
        InputDepth = Depth;
    }

    public String GetURL()
    {
        return InputURL;
    }

    public int GetDepth()
    {
        return InputDepth;
    }

    public String toString()
    {
        String StringDepth = Integer.toString(InputDepth);
        return InputURL + " " + StringDepth;
    }

    public String GetHost()
    {
        try
        {
            URL url = new URL(InputURL);
            return url.getHost();
        }
        catch (MalformedURLException e)
        {
            System.err.println("MalformedURLException: " + e.getMessage());
            return null;
        }
    }

    public String GetPath()
    {
        try
        {
            URL url = new URL(InputURL);
            return url.getPath();
        }
        catch (MalformedURLException e)
        {
            System.err.println("MalformedURLException: " + e.getMessage());
            return null;
        }
    }

}