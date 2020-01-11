package comm.example.thread;

public class MaxPriorityTest {
    
    public static void main(String[] args) {
        
        ThreadGroup groupNORM = new ThreadGroup(
                "A group with normal priority");
        
        Thread priorityMAX = new Thread(groupNORM,
                "A thread with maximum priority");
        
        // Set Thread's priority to max (10)
        priorityMAX.setPriority(Thread.MAX_PRIORITY);
        
        // Set ThreadGroup's max priority to normal (5)
        groupNORM.setMaxPriority(Thread.NORM_PRIORITY);
        
        System.out.format("Group's maximum priority = %d%n",
                groupNORM.getMaxPriority());
        System.out.format("Thread's priority = %d%n",
                priorityMAX.getPriority());
    }
}
