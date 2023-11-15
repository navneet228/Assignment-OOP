
public class Q67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] value   = {5,16,4,8,32};

		    int gap = 0;
		    int highest_num = 0;


		    for (int i = 0; i < value.length; i++)
		    {
		        for(int j = i+1; j < value.length; j++)
		        {            
		        	gap = Math.abs(value[i] - value[j]);

		            if (gap > highest_num) {
		            	highest_num = gap;
		            }    
		        }  
		    }
		    System.out.println("the difference of the lowest and the highest is "+ highest_num);
	}

}
