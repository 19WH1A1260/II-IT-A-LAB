//producer-consumer
class A
{
	int n;
	boolean valueSet=false;
	synchronized int get()
	{
		if(!valueSet)
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}
		System.out.println("Got:"+n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		if(valueSet)
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}
		this.n=n;
		valueSet=true;
		System.out.println("Put:"+n);
		notify();
	}
}
class Producer implements Runnable
{
	A a;
	Producer(A a)
	{
		this.a = a;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			a.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	A a;
	Consumer(A a)
	{
		this.a=a;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		{
			a.get();
		}
	}
}
class ProdConsumer
{
	public static void main(String[] args)
	{
		A a = new A();
		new Producer(a);
		new Consumer(a);
		System.out.println("Press Control-c to stop");


}
}

