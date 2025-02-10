class Solution{
    static double switchCase(int choice, List<Double> arr){
        double area=0;
       switch(choice){
           case 1:
                  area=Math.PI*arr.get(0)*arr.get(0);break;
           case 2:
                  area=arr.get(0)*arr.get(1);
                  break;
            default:System.out.println("invalid\n");break;
       }
       return area;
    }
}