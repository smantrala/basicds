//Breadth First Search

// http://www.codeproject.com/Articles/32212/Introduction-to-Graph-with-Breadth-First-Search-BF

public void dfs()
{
	Stack s = new Stack();

	this.rootNode.isVisited = true;
	s.push(this.rootNode);
	printNode(this.rootNode);

	while(!s.isEmpty())
	{
		Element e = s.peek();

		Element c = getUnvisitedChildNode(e);

		if (c != null)
		{
			c.isVisited = true;
			printNode(c);
			s.push(c);
		}
		else 
		{
			s.pop();
		}
	}

	clearNodes();
}