// Heap
struct Element
{
	String data;

	Element next;
}

Element top;

Element pop()
{
	if (top != null && top.next != null) 
	{
		Element tmp = top;

		top = top.next;

		return tmp;
	}

	return null;
}

void push(Element e)
{
	if (top == null)
	{
		top.data = e.data
		top.next = null;
	}
	else if (top.next != null)
	{
		Element.next = top;

		top = Element;
	}
}