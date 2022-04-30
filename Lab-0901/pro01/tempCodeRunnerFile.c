#include<stdio.h>

// H vertices and M Edges
int H, M;

// Function to create Adjacency Matrix
void createAdjMatrix(int Adj[][H + 1],
                     int arr[][2])
{

    // Initialise all value to this
    // Adjacency list to zero
    for (int i = 0; i < H + 1; i++) {

        for (int j = 0; j < H + 1; j++) {
            Adj[i][j] = 0;
        }
    }

    // Traverse the array of Edges
    for (int i = 0; i < M; i++) {

        // Find X and Y of Edges
        int x = arr[i][0];
        int y = arr[i][1];

        // Update value to 1
        Adj[x][y] = 1;
    }
}

// Function to print the created
// Adjacency Matrix
void printAdjMatrix(int Adj[][H + 1])
{

    // Traverse the Adj[][]
    for (int i = 1; i < H + 1; i++) {
        for (int j = 1; j < H + 1; j++) {

            // Print the value at Adj[i][j]
            printf("%d ", Adj[i][j]);
        }
        printf("\n");
    }
}

//Function of BFS
void bfs(int adj[][H+1], int start,int n)
{
	int visited[H],queue[H],front=-1,rear=-1;
    int answer[H] , a ;
	for(int i=0;i<H;i++)
	{
            answer[i] =0;
            visited[i] =0;
	}

	front++;
	queue[++rear] = start;
	visited[start] = 1;

	while(front<=rear && n != 0)
	{
		start = queue[front++];
		//printf("%d ",start);
		n = n-1;

		for(int i=0;i<H;i++)
		{
		    a = i;
			if(adj[start][i]==1 && visited[i] != 1)
			{
				queue[++rear] = i;
				visited[i] =1;
				if(n==0)
                {
                    printf("%d ",i);
                    queue[rear++] = i;
                    printf("%d",i);
                }

			}
		}


	}

}

// Driver Code
int main()
{
    int n;
    int s;
    int i,j;
    printf("Enter Energy of Climber : ");
    scanf("%d",&n); //Energy of climber
    printf("\nEnter Height of Tower : ");
    scanf("%d",&H); // Height of tower
    printf("\nEnter Number of Stairs : ");
    scanf("%d",&s); // number of stairs


    // Add Edges
    int arr[s][2];



    // taking input and storing it in an array
    for(i=0;i<s;i++){
        printf("\nEnter stair %d : ",i+1);
        scanf("%d %d" , &arr[i][0], &arr[i][1]);

    }

    // Number of Edges
    M = sizeof(arr) / sizeof(arr[0]);

    // For Adjacency Matrix
    int Adj[H+1][H+1];

    // Function call to create Adjacency Matrix
    createAdjMatrix(Adj, arr);

    // Print Adjacency Matrix
    //printAdjMatrix(Adj);

    bfs(Adj,1,n);

    return 0;a
}