package com.example.android.miwok;

/**
 * Created by Nora on 10/08/2016.
 */

public class word {
    private String mDefaultTranslation, mMiwokTranslation;
    private int mImageResourceID= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED= 0;

    public word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
    }
    public word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageResourceID= imageResourceID;
    }

    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceID(){
        return mImageResourceID;
    }
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
