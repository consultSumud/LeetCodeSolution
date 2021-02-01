import java.util.HashMap;
import java.util.Map;

public class FindKthMissingElementInArray {

	public static void main(String[] args) {
		int target=9;
		
		   int []nums= {2,7,11,15};
		        int index=0;
		      
		        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		        int [] arr=new int[nums.length];
		       int two=0;
		        for(int i=0;i<nums.length;i++){
		            if(!map.isEmpty()){
		                break;
		            }
		       two=target-nums[i];
		            for(int j=1;j<nums.length;j++){
		                
		                if(two==nums[j]){
		                    map.put(i,nums[i]);
		                    map.put(j,nums[j]);
		                    break;
		                }
		            }
		          
		       }     
		            
		        
		        
		        int i=0;
		         for(Map.Entry<Integer,Integer>entry: map.entrySet()){
		             
		            System.out.println(entry.getKey());
		             i++;
		         }
		         
		    }
		}

