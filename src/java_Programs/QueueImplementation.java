package java_Programs;

public class QueueImplementation {

	int QueueArr[]=new int[5];
	int front=0;
	int rear=0;
	int size=0;
	
	public void enqueue(int data)
	{
		QueueArr[rear]=data;
		rear++;
		size++;
		
	}
	
	public void dequeue()
	{
		
		QueueArr[front]=0;
		front++;
		size--;
		
	}
	
	public void show()
	{
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("The elements are");
			
			System.out.println("The elements are");
		}
		
	}
	
	public void isEmpty()
	{
		
	}
	
	
	
	
}
