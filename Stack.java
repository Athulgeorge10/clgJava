import java.util.Scanner;
class StackOptions
{
	int top,item,n,arr[];
	StackOptions(int n)
	{
		this.top=-1;
		this.n=n;
		this.arr=new int[n];
	}
	void push(int item)
	{
		if(top>=n-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			top++;
			arr[top]=item;
			System.out.println("The element has been inserted.");
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			item=arr[top];
			System.out.println("The deleted element is:"+arr[top]);
			top--;
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.print("Stack :\t");
            for(int i=0; i<=top; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
		}
	}
	void empty()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty.It contains "+(top+1)+" elements");
		}
	}
}
public class Stack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char cont='y';
		int choice;
		System.out.println("Enter the size of the stack:");
		int n=sc.nextInt();
		StackOptions op=new StackOptions(n);
		do
		{
			System.out.println("\nMenu:");
            System.out.println("[1] Push to Stack");
            System.out.println("[2] Pop from Stack");
            System.out.println("[3] is Stack empty?");
            System.out.println("[4] Display Stack");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element:");
				int item=sc.nextInt();
				op.push(item);
				break;
			case 2:
				op.pop();
				break;
			case 3:
				op.empty();
				break;
            case 4:
                op.display();
                break;
            case 0:
                cont='n';
                System.out.println("Exiting...");
                break;
            
			default:
				System.out.println("Invalid option");
			}
		}while(cont=='Y'||cont=='y');
		sc.close();
	}

}