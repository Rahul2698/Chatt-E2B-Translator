package com.example.chatte2btranslator;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int colorResourceId,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=colorResourceId;
        mAudioResourceId=audioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId()
    {
        return mImageResourceId;
    }

    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }
}
