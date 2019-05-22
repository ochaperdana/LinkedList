package is.its.ac.id;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] data1={1,2,3,4,5,6,7,8,9,10};
        String [] data2= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        System.out.println("1. Experiment with LinkedList Queue:");
        System.out.println("Data 1:");

        long start = System.nanoTime();
        Queue myLLQ = new LinkedListQueue();
        for(int i=0;i<data1.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLQ.enqueue(data1[i]));
        }
        for (int i=0;i<data1.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLQ.dequeue());
        }
        long end = System.nanoTime();
        long timesTaken=end-start;
        System.out.println("Running time for experiment with LinkedList Queue over Data 1 is: "+ timesTaken+" nano seconds");

        System.out.println("Data 2:");

        start = System.nanoTime();
        myLLQ = new LinkedListQueue();
        for(int i=0;i<data2.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLQ.enqueue(data2[i]));
        }
        for (int i=0;i<data2.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLQ.dequeue());
        }
        end = System.nanoTime();
        timesTaken = end-start;

        System.out.println("Running time for experiment with LinkedList Queue over Data 2 is: "+ timesTaken+" nano seconds");

        System.out.println("\n2. Experiment with Array Stack:");
        System.out.println("Data 1:");

        start = System.nanoTime();
        Stack myLLS = new ArrayStack();
        for(int i=0;i<data1.length;i++){
            System.out.println("Push #"+(i+1)+":"+myLLS.push(data1[i]));
        }
        for (int i=0;i<data1.length/2;i++){
            System.out.println("Pop #"+(i+1)+":"+myLLS.pop());
        }
        end = System.nanoTime();
        timesTaken=end-start;

        System.out.println("Running time for experiment with Array Stack over Data 1 is: "+ timesTaken+" nano seconds");

        System.out.println("Data 2:");

        start = System.nanoTime();
        myLLS = new ArrayStack();
        for(int i=0;i<data2.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLS.push(data2[i]));
        }
        for (int i=0;i<data2.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLS.pop());
        }
        end = System.nanoTime();
        timesTaken = end-start;

        System.out.println("Running time for experiment with Array Stack over Data 2 is: "+ timesTaken+" nano seconds");

        System.out.println("\n3. Experiment with Array Queue:");
        //complete your code here
        System.out.println("Data 3:");

        start = System.nanoTime();
        myLLQ = new ArrayQueue();
        for(int i=0;i<data1.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLQ.enqueue(data1[i]));
        }
        for (int i=0;i<data1.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLQ.dequeue());
        }
        end = System.nanoTime();
        timesTaken = end-start;

        System.out.println("Running time for experiment with Array Queue over Data 3 is: "+ timesTaken+" nano seconds");

        System.out.println("\n4. Experiment with LinkedList Stack:");
        //complete your code here
        System.out.println("Data 4:");

        start = System.nanoTime();
        myLLS = new LinkedListStack();
        for(int i=0;i<data2.length;i++){
            System.out.println("Enquee #"+(i+1)+":"+myLLS.push(data2[i]));
        }
        for (int i=0;i<data2.length/2;i++){
            System.out.println("Dequee #"+(i+1)+":"+myLLS.pop());
        }
        end = System.nanoTime();
        timesTaken = end-start;

        System.out.println("Running time for experiment with LinkedList Stack over Data 4 is: "+ timesTaken+" nano seconds");
    }
}
