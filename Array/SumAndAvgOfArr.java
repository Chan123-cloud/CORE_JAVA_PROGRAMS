package Array;

	import java.util.Scanner;

	public class SumAndAvgOfArr {
				
				public static void main(String[] args) {
					
					Scanner sc = new Scanner (System.in);
					
					System.out.println("ENTER THE SIZE OF THE ARRAY");
					
					int size = sc.nextInt();
					
					
					int a [] = new int[size];
					
					System.out.println("ENTER THE VALUES");
					
					for(int i = 0 ; i<a.length; i++) {
						
						a[i] = sc.nextInt();
					}
					
					//  SUM OF ALL ELEMEMNTS IN AN ARRAY
					
					int sum =0;
					
					for(int ele: a) {
						
						sum += ele;
					}
					
					System.out.println(sum);
					
					// AVERAGE OF ALL THE ELEMENTS IN AN ARRAY
					
				
					double Avg = (double)sum/size;
					
					System.out.println(Avg);
					
					
				}

			}

			