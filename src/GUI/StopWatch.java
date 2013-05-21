/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author MikeZJ
 */
public class StopWatch
{
 
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    
//     public void StopWatch()
//    {
//        StopWatch s = new StopWatch();
//        s.start();
//        //code you want to time goes here
//        s.stop();
//        System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
//    }
    
    
    public void start()
    {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop()
    {
        
        this.running = false;
        this.stopTime = System.currentTimeMillis();
        
    }

    //elaspsed time in milliseconds
    public long getElapsedTime()
    {
        long elapsed;
        if (running)
        {
            elapsed = (System.currentTimeMillis() - startTime);
        }
        else
        {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    //elaspsed time in seconds
    public long getElapsedTimeSecs()
    {
        long elapsed;
        if (running)
        {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000 / 60);
        }
        else
        {
            elapsed = ((stopTime - startTime) / 1000 / 60);
        }
        return elapsed;
    }

    //sample usage
   
}
