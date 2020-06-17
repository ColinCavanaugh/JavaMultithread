class thread extends Thread
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
class threads
{
    public static void main(String[] args)
    {
        int n = 100000; // Number of threads
        for (int i=0; i<n; i++)
        {
            thread object = new thread();
            object.start();
        }
    }
}