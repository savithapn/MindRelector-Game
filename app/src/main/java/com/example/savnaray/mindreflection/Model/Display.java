package com.example.savnaray.mindreflection.Model;

import com.example.savnaray.mindreflection.R;

import java.util.Random;

/**
 * Created by savnaray on 16.06.2015.
 */
public class Display {

    int[] mImageCollection = new int[14];
    int[] mSelectedImageCollection = new int[14];

    private int mSelectedImageId;
    private int mDisplayImgeId;

    public int getSelectedImageId()
    {
        return mSelectedImageId;
    }
    public Display(){

        InitializeImageCollection();
    }

    private void InitializeImageCollection() {
        mImageCollection[0] =R.drawable.image1;
        mImageCollection[1] =R.drawable.image3;
        mImageCollection[2] =R.drawable.image5;
        mImageCollection[3] =R.drawable.image7;
        mImageCollection[4] =R.drawable.image9;
        mImageCollection[5] =R.drawable.image11;
        mImageCollection[6] =R.drawable.image13;
        mImageCollection[7] =R.drawable.image15;
        mImageCollection[8] =R.drawable.image17;
        mImageCollection[9] =R.drawable.image19;
        mImageCollection[10] =R.drawable.image21;
        mImageCollection[11] =R.drawable.image23;
        mImageCollection[12] =R.drawable.image26;
        mImageCollection[13] =R.drawable.image27;
        mSelectedImageCollection[0]=R.drawable.image2;
        mSelectedImageCollection[1] =R.drawable.image4;
        mSelectedImageCollection[2] =R.drawable.image6;
        mSelectedImageCollection[3] =R.drawable.image8;
        mSelectedImageCollection[4] =R.drawable.image10;
        mSelectedImageCollection[5] =R.drawable.image12;
        mSelectedImageCollection[6] =R.drawable.image14;
        mSelectedImageCollection[7] =R.drawable.image16;
        mSelectedImageCollection[8] =R.drawable.image18;
        mSelectedImageCollection[9] =R.drawable.image20;
        mSelectedImageCollection[10] =R.drawable.image22;
        mSelectedImageCollection[11] =R.drawable.image24;
        mSelectedImageCollection[12] =R.drawable.image26;
        mSelectedImageCollection[13] =R.drawable.image28;
    }

    public void  setImageId()
    {
        //Randomly select a image
        Random randomGenerator = new Random();//Construct a new Random number generator.
        int randomNumber = randomGenerator.nextInt(mImageCollection.length);//This will give random number between 0 and 2

        mSelectedImageId = mSelectedImageCollection[randomNumber];
        mDisplayImgeId = mImageCollection[randomNumber];
    }
    public int getDisplayImageId()
    {

        return mDisplayImgeId;

    }



}
