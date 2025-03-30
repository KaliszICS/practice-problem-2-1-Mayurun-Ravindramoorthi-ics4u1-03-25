public class PracticeProblem {

	public static void main(String args[]) {
System.out.println(findSecond(new char[] { '3', '3', '3', '3' }, '3'));
	}

	public static int find(int[] array, int number){
		int index =-1;
		for(int i=0;i<array.length;i++){ // start from begingering 
			if(number==array[i]){
			index=i;
			i = array.length;
			return index;
		}
	}
		return -1;
	}

	public static int findLast(String[] array, String string){
		int index =-1;
		for(int i =(array.length) -1 ; i>=0;i--){ // go from last first
			if(string==array[i]){
				index=i;
				i=-1;
				return index;
			}
		}
		return index;
	}
	public static int findSecond(char[] array, char c){
		int index= -1;
		int cu =0;
		for(int i =0; i<array.length;i++){
			if(c==array[i]){
				cu++;
				if(cu==1){
					index=i;
					//i=array.length;	
				}
			if(cu==2){
				index=i;
				//i=array.length;
				return index;
			}
			
			}
			
		}
		return cu == 1 ? index : -1;
	}

}

