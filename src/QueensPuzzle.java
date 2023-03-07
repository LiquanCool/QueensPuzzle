public class QueensPuzzle {
    private int queens;
    private int n;
    public QueensPuzzle(int n)
    {
        queens = n;
        this.n = n;
    }
    public void findSolutions()
    {
        int solutions = 0;
            for(int i=0;i<n;i++)
            {
                for(int j =0;j<n;j++)
                {
                    int[][] arr = new int[n][n];
                    int counter =0;
                    boolean solved = false;
                    arr[i][j]=2;
                    takenSpaces(arr,i,j);
                    counter++;
                    for(int k=0;k<n;k++)
                    {
                        for(int l =0;l<n;l++)
                        {
                            if (arr[k][l]==0)
                            {
                                arr[k][l]=2;
                                takenSpaces(arr,k,l);
                                counter++;
                                if (counter>=n)
                                {
                                    solutions++;
                                    solved=true;
                                }
                            }
                        }
                    }
                    if (solved)
                    {
                        for(int c=0;c<n;c++)
                        {
                            for(int b =0;b<n;b++)
                            {
                                System.out.print(arr[c][b]+" ");
                            }
                            System.out.println("");
                        }
                        System.out.println("--------------------------");
                    }

                }
            }
        System.out.println(solutions);

    }
    public void takenSpaces(int[][] arr, int row, int column)
    {
        for(int i = row-1;i>=0;i--)
        {
            if (!(arr[i][column]==2))
            {
                arr[i][column] = 1;
            }
        }
        for(int i = column+1;i<n;i++)
        {
            if (!(arr[row][i]==2))
            {
                arr[row][i] = 1;
            }
        }
        for(int i = row+1;i<n;i++)
        {
            if (!(arr[i][column]==2))
            {
                arr[i][column] = 1;
            }
        }
        for(int i = column-1;i>=0;i--)
        {
            if (!(arr[row][i]==2))
            {
                arr[row][i] = 1;
            }
        }
        for(int i = 1;row-i>=0&&column+i<n;i++)
        {
            if (!(arr[row-i][column+i]==2))
            {
                arr[row-i][column+i] = 1;
            }
        }
        for(int i = 1;row+i<n&&column+i<n;i++)
        {
            if (!(arr[row+i][column+i]==2))
            {
                arr[row+i][column+i] = 1;
            }
        }
        for(int i = 1;row+i<n&&column-i>=0;i++)
        {
            if (!(arr[row+i][column-i]==2))
            {
                arr[row+i][column-i] = 1;
            }
        }
        for(int i = 1;row-i>=0&&column-i>=0;i++)
        {
            if (!(arr[row-i][column-i]==2))
            {
                arr[row-i][column-i] = 1;
            }
        }
    }
}
