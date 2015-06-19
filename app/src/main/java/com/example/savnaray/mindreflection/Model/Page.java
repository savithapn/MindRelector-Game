package com.example.savnaray.mindreflection.Model;

/**
 * Created by savnaray on 16.06.2015.
 */
public class Page {
    private int mNextPage;

    private String[] mInstructionSet = new String[3];

    public Page(int nextPage ){

        mNextPage = nextPage;


        mInstructionSet[0]="Follow the instructions carefully  "+"\r\n \r\n" + "Step 1:"+"\r\n\r\n"+"Choose any two digit number."+"\r\n \r\n \r\n";
        mInstructionSet[1]="Step 2:"+"\r\n \r\n "+"Add together both the digits, and then subtract the total from your original number. For example"
        +"\r\n" +"If you have chosen 23: 2+3=5"+"\r\n " +"23 minus 5 will give you, your answer.";
        mInstructionSet[2]="Step 3:"+"\r\n\r\n"+"This is your final number. Now, look up on the chart and find the relevant symbol and concentrate on the symbol, when it is clear, press show button. "+
        "The same symbol you have in mind will be displayed. Magic!!!";



    }

    public String getInstruction(int index)
    {
        return mInstructionSet[index];
    }





}
