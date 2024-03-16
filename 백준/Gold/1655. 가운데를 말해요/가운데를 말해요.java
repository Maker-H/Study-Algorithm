
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		// max [2, 1],  min [3, 4]
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(minHeap.size() == maxHeap.size()) { //개수가 짝수인 경우
				maxHeap.offer(num);
			} else { // 개수가 홀수인 경우
				minHeap.offer(num);
			}
			
			if(!minHeap.isEmpty() && !maxHeap.isEmpty()) {
				if(maxHeap.peek() > minHeap.peek()) {
					int tmp = minHeap.poll();
					
					minHeap.offer(maxHeap.poll());
					maxHeap.offer(tmp);
				}
			}
			
			sb.append(maxHeap.peek() + "\n");
		}
		
		System.out.println(sb);
	}
	
}