package code;

public class Graph {
	
	public int vertex;
	public int adjMat[][];
	public Graph(int n) {
		super();
		this.vertex = n;
		this.adjMat = new int[n][n];
	}
	public void insertEdge(int u,int v,int weight) {
		adjMat [u][v] = weight;
	}
	public void removeEdge(int u , int v) {
		adjMat [u][v] = 0;
		
	}
	public boolean existEdge(int u ,int v) {
		return adjMat [u][v] != 0;
		
	}
	public int vertexCount() {
		return vertex;
	}
	public int edgeCount() {
		int count = 0;
		for(int i =0 ; i<vertex;i++)
			for(int j=0; j<vertex;j++) {
				if(adjMat[i][j] != 0) {
					count ++;
				}
			}
		return vertex;
	}
	public void edges() {
		System.out.println("Edges=");
		for(int i =0 ; i<vertex;i++)
			for(int j=0; j<vertex;j++) {
				if(adjMat[i][j] != 0) {
					System.out.println(i+"--"+j);
				}
	}
	
	}
	
	public int outDegree(int v) {
		
		int count = 0;
		for(int j=0; j<vertex;j++) {
			if(adjMat[v][j] != 0) {
				count++;
			}
		}
		return count;
		
	}
	public int inDegree(int u) {
		
		int count = 0;
		for(int i=0; i<vertex;i++) {
			if(adjMat[i][u] != 0) {
				count++;
			}
		}
		return count;
		
	}
	
	public void display() {
		
		for(int i =0 ; i<vertex;i++) {
			for(int j=0; j<vertex;j++) 
					System.out.print(adjMat[i][j]+"\t");
		System.out.println();
		}
		
	}
	
	  public void BFS(int s) {
	        int i = s;
	        QueuesLinked q = new QueuesLinked();
	        int visited[] = new int[vertex];
	        System.out.print(i+" ");
	        visited[i] = 1;
	        q.enqueue(i);
	        //System.out.println(q.display());
	        while(!q.isEmpty()) {
	            i = q.dequeue();
	            for(int j=0;j<vertex;j++) {
	                if(adjMat[i][j]==1 && visited[j] == 0) {
	                    System.out.print(j+" ");
	                    visited[j] = 1;
	                   // q.enqueue(j);
	                    q.display();
	                }
	            }
	        }
	    }
	  public void DFS(int s) {
		  int[] visited = new int[vertex];
	        if(visited[s]==0) {
	            System.out.print(s + " ");
	            visited[s] = 1;
	            for (int j = 0; j < vertex; j++)
	                if (adjMat[s][j] == 1 && visited[j] == 0)
	                    DFS(j);
	        }
	    }

	
	public static void main(String[] args) {
		
		
		//undirected();
		//weighted();
		directed();
		//wDirected();
		
	}
	

	public static void undirected() {

		 Graph g = new Graph(4);
	        //System.out.println("Graphs Adjacency Matrix");
	        //g.display();
	        //System.out.println("Vertices: "+g.vertexCount());
	        //System.out.println("Edges Count: "+g.edgeCount());
	        g.insertEdge(0,1,26);
	        g.insertEdge(0,2,16);
	        g.insertEdge(1,0,26);
	        g.insertEdge(1,2,12);
	        g.insertEdge(2,0,16);
	        g.insertEdge(2,1,12);
	        g.insertEdge(2,3,8);
	        g.insertEdge(3,2,8);
	        System.out.println("Graphs Adjacency Matrix");
	        g.display();
	      //  System.out.println("Edges Count: "+g.edgeCount());
	       // g.edges();
	        //System.out.println("Edge between 1--3: "+g.existEdge(1,3));
	        //System.out.println("Edge between 1--2: "+g.existEdge(1,2));
	       // System.out.println("Degree of Vertex-2: "+g.inDegree(2));
	       // System.out.println("Graphs Adjacency Matrix");
	        //g.display();
	       // g.removeEdge(1,2);
	       // System.out.println("Graphs Adjacency Matrix");
	        //g.display();
	       // System.out.println("Edge between 1--2: "+g.existEdge(1,2));
	        g.BFS(0);
	}

	public static void weighted() {

		Graph g = new Graph(4);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Vertices: "+g.vertexCount());
        System.out.println("Edges Count: "+g.edgeCount());
        g.insertEdge(0,1,1);
        g.insertEdge(0,2,1);
        g.insertEdge(1,0,1);
        g.insertEdge(1,2,1);
        g.insertEdge(2,0,1);
        g.insertEdge(2,1,1);
        g.insertEdge(2,3,1);
        g.insertEdge(3,2,1);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Edges Count: "+g.edgeCount());
        g.edges();
        System.out.println("Edge between 1--3: "+g.existEdge(1,3));
        System.out.println("Edge between 1--2: "+g.existEdge(1,2));
        System.out.println("Degree of Vertex-2: "+g.inDegree(2));
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        g.removeEdge(1,2);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Edge between 1--2: "+g.existEdge(1,2));
	}

	public static void directed() {
	    Graph g = new Graph(4);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Vertices: "+g.vertexCount());
        System.out.println("Edges Count: "+g.edgeCount());
        g.insertEdge(0,1,1);
        g.insertEdge(0,2,1);
        g.insertEdge(1,2,1);
        g.insertEdge(2,3,1);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Edges Count: "+g.edgeCount());
        g.edges();
        System.out.println("Edge between 1--3: "+g.existEdge(1,3));
        System.out.println("Edge between 1--2: "+g.existEdge(1,2));
        System.out.println("Edge between 2--1: "+g.existEdge(2,1));
        System.out.println("Degree of Vertex-2: "+ (g.inDegree(2) + g.outDegree(2)));
        System.out.println("InDegree of Vertex-2: "+ g.inDegree(2));
        System.out.println("OutDegree of Vertex-2: "+ g.outDegree(2));
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        g.removeEdge(1,2);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Edge between 1--2: "+g.existEdge(1,2));
        g.BFS(0);
	}

	public static void wDirected() {
		Graph g = new Graph(4);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Vertices: "+g.vertexCount());
        System.out.println("Edges Count: "+g.edgeCount());
        g.insertEdge(0,1,26);
        g.insertEdge(0,2,16);
        g.insertEdge(1,2,12);
        g.insertEdge(2,3,8);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Edges Count: "+g.edgeCount());
        g.edges();
        System.out.println("Edge between 1--3: "+g.existEdge(1,3));
        System.out.println("Edge between 1--2: "+g.existEdge(1,2));
        System.out.println("Edge between 2--1: "+g.existEdge(2,1));
        System.out.println("Degree of Vertex-2: "+ (g.inDegree(2) + g.outDegree(2)));
        System.out.println("InDegree of Vertex-2: "+ g.inDegree(2));
        System.out.println("OutDegree of Vertex-2: "+ g.outDegree(2));
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        g.removeEdge(1,2);
        System.out.println("Graphs Adjacency Matrix");
        g.display();
        System.out.println("Edge between 1--2: "+g.existEdge(1,2));
	}
	
}
