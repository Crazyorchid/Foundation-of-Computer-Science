import java.util.LinkedList;

public class MyGraph {
    LinkedList adjListArray[];

    public void createGraph(int vertices)
    {
        adjListArray = new LinkedList[vertices];
        for(int i =0; i<vertices;i++){
            adjListArray[i] = new LinkedList<Node>();
        }
    }
    public MyGraph(){

    }

    /*public MyGraph(int v){
        this.v = v;

        //create adjMatrix;
        this.adjList = new LinkedList<v>();
    }*/

    public void matrixToList(int[][]matrix){
        int v = matrix.length;
        createGraph(v);
        for (int i = 0; i<v;i++){
            for(int j = 0; j<v; j++)
            {
                if(matrix[i][j]==1)
                {
                    adjListArray[i].add(new Node(j));
                }
            }
        }
    }

    public void displayAdjListArray(){
        if(adjListArray.length == 0)
        {
            System.out.println("\nNo Nodes in the Graph.");
            return;
        }
        int size;

        for(int i = 0;i<adjListArray.length;i++)
        {
            System.out.print(i+": ");
            size = adjListArray[i].size();
            if(size == 0)
            {
                System.out.println(" ");
            }
            for(int j = 0;j<size;j++)
            {
                Node node = (Node)adjListArray[i].get(j);
                node.printNode();
                if(j+1<size)
                {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

}

