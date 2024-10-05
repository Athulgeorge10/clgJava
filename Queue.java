import java.util.Scanner;
class Operation{
	int q[];
	int front,rear,n;
	
    Operation(int n){
		front=0;
		rear=-1;
		this.q=new int[n];
		this.n=n;
	}

	void enqueue(int item){
		if(rear==(n-1)){
			System.out.println("Overflow");
		}
		else{
			rear=rear+1;
			q[rear]=item;
            System.out.println("The element has been inserted.");
		}
	}

	void dequeue(){
		if(rear<front){
			System.out.println("Underflow");
		}
		else{
			int item=q[front];
			front=front+1;
			System.out.println("Deleted element is:"+item);
		}
	}

	void display(){
		if(rear<front){
			System.out.println("It is empty");
		}
		else{
			System.out.print("Queue:");
			for(int i=front; i<=rear; i++)
			{
				System.out.print(q[i]+"\t");
			}
            System.out.println();
		}
	}
}

public class Queue {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the queue:");
		int n=sc.nextInt();
		Operation ob=new Operation(n);
		char cont = 'y';
		int choice;
		do{
			System.out.println("\nMenu:");
            System.out.println("[1] Enqueue");
            System.out.println("[2] Dequeue");
            System.out.println("[3] Display Queue");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.print("Enter the element to enqueue: ");
				int item=sc.nextInt();
				ob.enqueue(item);
				break;
			case 2:
				ob.dequeue();
				break;
			case 3:
				ob.display();
				break;
			case 0:
				System.out.println("Exiting..");
                cont = 'n';
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}while(cont=='Y'||cont=='y');
	}
}
