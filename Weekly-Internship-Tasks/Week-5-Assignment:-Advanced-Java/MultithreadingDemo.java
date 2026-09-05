/* 
Task 5: Multithreading Basics — Multiple Tasks (15 Marks)

Create a Java program demonstrating basic Multithreading.

Create two threads that perform different tasks.

Example

Thread 1:
Print numbers from 1 to 10.

Thread 2:
Print a message such as:

Learning Java Multithreading

multiple times.

Requirements
Create two threads.
Start both threads.
Demonstrate that both threads can execute independently.
Use an appropriate thread creation approach.
*/
public class MultithreadingDemo {
    public static void main(String[] args) {
        
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread 1 - Number: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 1 was interrupted");
                    }
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2 - Learning Java Multithreading");
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 2 was interrupted");
                    }
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
