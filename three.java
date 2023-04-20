class Random{
    public int random(){
        int randome= (int)(Math.random() * 100);
        return randome;
    }
    
}



class Three{
    public static void main(String[] args) {
        
    
        int arr[][]= new int[3][4];
       Random obj= new Random();
       int num=obj.random();
        System.out.println(num);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){

                arr[i][j]=(int)(Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }        
    }
}