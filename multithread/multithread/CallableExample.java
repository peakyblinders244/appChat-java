/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ksg
 */
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String args[])
    {
        Callable<String> callableTask = () -> {
            System.out.println("Task is executing ...");
            TimeUnit.SECONDS.sleep(3);
            return "Hello!";
        };
        
        try
        {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            Future<String> future = executor.submit(callableTask);

            System.out.println("Task execution finished: " + future.isDone());

            //wait for the task to finished
            String message = future.get();

            System.out.println("Task execution finished: " + future.isDone());
            System.out.print("Message: " + message);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
