package com.gl.Q1.Main;

import java.util.Scanner;

import com.gl.Q1.Model.Floor;
	
	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the total number of floors in the building:");

			int totalfloor = sc.nextInt();

			int[] floorSizes = new int[totalfloor];
			
			for (int i = 0; i < floorSizes.length; i++) {

				int day = i + 1;

				System.out.println("Enter the floor size on day :" + day);

				int size = sc.nextInt();

				if (size <= 0) {

					System.out.println("Floor size cannot be less than or equal to zero");
					i--;
				}
				else if (size > totalfloor) {

					System.out.println("Floor size cannot be greater than totalfloor");
					i--;
				}
				else {
					  floorSizes[i] = size;
				}
			}
			Floor fConstruction = new Floor();

			fConstruction.constructFloor(totalfloor, floorSizes); 
			sc.close();			
		}
	}

