class Main
{
    public static void main(String[] args) {
        int[][] a = squareArrayN(5);
        print2DArr(a);
        int n = analyze2DArray(a);
        System.out.println("First Even With Required Sum: "+ (n != -1 ? n : " Not Present"));
    }

    static int[][] squareArrayN(int n)
    {
        if (n < 0)
            throw new IndexOutOfBoundsException(); 

        int[][] arr = new int[n][n];

        for (int[] row : arr) 
            randomlyFillArray(row);
        
        return arr;
    }

    static int analyze2DArray(int[][] arr)
    {
        for (int i = 1; i < arr.length-1; i++)
        {
            int n = analyzeRow(i, arr);
            if (n != -1)
                return n;
        }

        return -1;
    }

    static int analyzeRow(int i, int[][] arr)
    {
        for (int j = 1; j < arr[i].length-1; j++)
        {
                int n = checkNum(i, j, arr);
                if (n != 1)
                    return n;
        }
        return -1;
    }

    static int checkNum(int i, int j, int[][] arr)
    {
        if (arr[i][j] % 2 == 0 && 
            arr[i-1][j] + arr[i+1][j] + arr[i][j+1] + arr[i][j-1] > 33)
            return arr[i][j];
        return -1;
    }

    static void randomlyFillArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10+1);
        }
    }

    static void print2DArr(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}