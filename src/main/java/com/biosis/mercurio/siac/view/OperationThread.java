/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.view;

/**
 *
 * @author Aldo
 */
class OperationThread extends Thread{
    private boolean mCanceled = false;
    public OperationThread()
    {
    }

    public boolean IsCanceled()
    {
        return mCanceled;
    }
    public void Cancel()
    {
        mCanceled = true;
        try 
        {
            this.join();	//5sec timeout
        } 
        catch (InterruptedException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
