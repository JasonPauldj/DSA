/*
* Finding the length of connected cells of 1s (regions) in an matrix of Os and
1s
* */


public class RegionInMatrix {

    public static void main(String[] args){
        int[][] array = {{1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 1, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {0, 1, 0, 1, 1}};

        int ans =getMaxOnes(array);

        System.out.println(ans);
    }

   static int getMaxOnes(int [][] arr){
        int maxSize=0;
        int size=0;
        boolean isExplored[][] = new boolean[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]==1 && !isExplored[i][j]){
                    size=0;
                   size = findMaxBlock(arr,i,j,size,isExplored);
                   if(size > maxSize)
                   {
                       maxSize=size;
                   }
                }
            }
        }
        return maxSize;
    }

   static int findMaxBlock(int [][] arr, int r, int c, int size, boolean[][] isExp){

        isExp[r][c]=true;
        size++;
        int directions[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        for(int i=0; i <8 ;i++)
        {
            int newR=r+directions[i][0];
            int newC= c+directions[i][1];
            if((newR >= 0 && newR < 5) && (newC >= 0 && newC < 5)){
                if(arr[newR][newC]==1 && !isExp[newR][newC]){
                    System.out.println("calling func for r " + newR +" " + "for c " + newC);
                   size=findMaxBlock(arr,newR,newC,size,isExp);
                }
            }
        }

        return size;
    }
}
