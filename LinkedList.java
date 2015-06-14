// Linked List


package InterviewSamples;

class LinkedList
{	
	class Element
	{
		private int data;

		private Element next;

		public Element(int data)
		{
			this.data = data;
			this.next = null;
		}

		String displayElement()
		{
			return Integer.toString(this.data);
		}
	}

	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();

		ll.insert(1);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(2);

		ll.displayList();
		ll.reverse();
		ll.displayList();
	}

	private Element head;

	public LinkedList()
	{
		head = null;
	}

	void displayList()
	{
		Element current = head;
		int i = 0;

		while(current != null)
		{
			i+=1;

			System.out.println("Element at " + i + "=" + current.displayElement());

			current = current.next;
		}
	}

	Element reverse()
	{
		Element tmp = null;
		Element prv = null;

		while (head != null)
		{
			tmp = head.next;

			head.next = prv;

			prv = head;

			head = tmp;
		}

		head = prv;

		return prv;
	}

	Element remove(Element Head, int e)
	{
		if (head.data == e)
		{
			Element ret = head;

			head = head.next;

			return ret;
		}

		Element current = head;
		while(current != null)
		{
			Element next = current.next;

			if (next != null && next.data == e)
			{
				current.next = next.next;

				return next;
			}

			current = current.next;
		}

		return null;
	}

	Element find(int e)
	{
		Element current = head;

		while (current != null)
		{
			if (current.data == e)
				return current;

			current = current.next;
		}

		return null;
	}

	void insert(int data)
	{
		Element e = new Element(data);

		System.out.println("Inserting element " + e.displayElement());

		if (head == null)
		{
			head = e;

			return;
		}

		Element current = head;
		Element trail = null;

		while(current != null)
		{
			if (data <= current.data)
			{
				break;
			}
			else 
			{
				trail = current;
				current = current.next;
			}
		}

		if (current == head)
		{
			e.next = head;

			head = e;
		}
		else
		{
			e.next = current;

			trail.next  = e;
		}
	}

	boolean isCircular()
	{
		Node firstPtr = head;
		Node secondPtr = head;

		boolean flag = false;

		while (!flag)
		{
			firstPtr = firtPtr.next;

			secondPtr = firstPtr.next;

			if (secondPtr == null)
			{
				flag = false;
				break;
			}

			if (secondPtr == firstPtr || secondPtr.next == firstPtr)
			{
				flag = true;
				break;
			}
		}

		return flag;
	}
}