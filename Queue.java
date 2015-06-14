// Queue

struct Element
{
	String data;

	Node next;
	Node prev;
}

class Queue
{
	Element first, last;

	void enqueue(Element e)
	{
		if (first == null)
		{
			first = e;

			last = e;

			return;
		}
		
		e.next = last;

		last = e;	
	}

	Element dequeue()
	{
		if (first != null)
		{
			Element tmp = first;

			first = first.next;

			return tmp;
		}

		return null;
	}
}