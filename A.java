/*
	    *
	   * *
	  *****
	 *     *
	*       *
*/
class A{
	public static void main(String args[]){
		int i,j,k;
		for(i=1;i<=5;i++){
			//FOR SPACES
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			//FOR STARS
			for(j=1;j<=2*i-1;j++){
				if(j==1||j==2*i-1||i==3){
					System.out.print("*");
				}
				
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
