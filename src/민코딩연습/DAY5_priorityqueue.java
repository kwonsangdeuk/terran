package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class DAY5_priorityqueue {	
	    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    public static void main(String[] args) throws IOException {
	        int n = Integer.parseInt(br.readLine());
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for(int i = 0; i < n; i++)
	        {
	            StringTokenizer st;
	            st = new StringTokenizer(br.readLine());
	            String order = st.nextToken();
	            int num = Integer.parseInt(st.nextToken());
	            
	            

	            if(order.equals("push"))
	            {
	                pq.add(num);
	            }
	            else if(order.equals("pop"))
	            {
	                for(int j = 0; j < num;j++)
	                    System.out.print(pq.poll() + " ");
	                System.out.println("");
	            }
	            else
	            {
	                int temp = pq.poll();
	                pq.add(temp + num);
	            }
	        }

	    }
	}
