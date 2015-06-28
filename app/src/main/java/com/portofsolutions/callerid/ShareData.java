package com.portofsolutions.callerid;

/**
 * Created by farzadaziminia on 6/7/15.
 */
public class ShareData {

    void ShareData()
    {

    }

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        ShareData.data = data;
    }

    private static String data = "";

}
