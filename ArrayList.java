public class ArrayList{
    int max;
    static int size;
    int t;
    int [] array;
    
    public ArrayList(){
        max = 4;
        size = 0;
        t = -1;
        array = new int[max];
    }
    
    public void add(int ele){
        if (size==0){
                array[0]=ele;
                t = 0;
        }
        else{
            array[t+1]=ele;
            t = t + 1;
        }
        size = size+1;
        System.out.println(" "+ele);
         System.out.println(" ");
    }
    
    public void pop(){
        if (size==0){
            System.out.println( "Array is already empty!");
        }
        else{
            t = t-1;
            size = size-1;
        }
    }
    
    public int size(){
        return size;
    }
    public void resize(){
        if (size()==3 || size()==4) {
            int temp[] = new int[max*2];
            for(int i = 0; i < array.length; i ++){
                temp[i] = array[i];
            }
            max = max*2;
            size = max;
            array = temp;
            for(int j : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else if (size()==1){
            int temp[] = new int[max/2];
            for(int i = 0; i < array.length/2; i ++){
                temp[i] = array[i];
            }
            size = max/2;
            array = temp;
            for(int j  : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else{
            size = max;
            for(int j  : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        System.out.println("The Size of array is before adding: "+obj.size());
        obj.add(9);
        obj.add(10);
        obj.add(11);
        
        //obj.pop();
        
        obj.resize();
        System.out.println("The Size of Array is now: "+obj.size());   
    }
}
   