package com.psl;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static String find(char[][] ar,int length){
		
		for(int i=0;i<length;i++){
			boolean flag=true;
			char ch=ar[i][0];
			for(int j=0;j<length;j++){
				if(ar[i][j]!=ch){
					flag=false;
					break;
				}
			}
			if(flag){
				return ch+" Wins";
			}
		}
		for(int i=0;i<length;i++){
			boolean flag=true;
			char ch=ar[0][i];
			for(int j=0;j<length;j++){
				if(ar[j][i]!=ch){
					flag=false;
					break;
				}
			}
			if(flag){
				return ch+" Wins";
			}
		}
		char ch=ar[0][0];
		boolean flag=true;
		for(int i=1;i<length;i++){
			for(int j=1;j<length;j++){
				if(i==j){
					if(ar[j][i]!=ch){
						flag=false;
						break;
					}
				}
				if(flag){
					return ch+" Wins";
				}
					
					
				}
			}
		return "nobody wins";
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] ch={{'x','x','o'},{'x','x','o'},{'o','o','x'}};
		System.out.println(find(ch,3));
		

	}

}
