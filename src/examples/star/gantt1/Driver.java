package star.gantt1;

import ganttproject.DependencyGraph;

public class Driver {
	
	public static void main(String[] args) {
		if (args.length < 1)
			return;
		DependencyGraph graph = new DependencyGraph();
		graph.startTransaction();
	}

}
