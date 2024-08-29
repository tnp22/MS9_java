package _java_project;
// 실패작 그냥 배열로 하셈 char로 변환하고 유니코드로 구별해서 배열에 넣으셈
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node{
	String node1;
	String node2;
	int road;
	int hasi;
	public Node(String node1, String node2, int road) {
		
		String[] strings= {node1,node2};
		java.util.Arrays.sort(strings);
		
		this.node1 = strings[0];
		this.node2 = strings[1];
		this.road = road;
		this.hasi=0;
	}
	public Node() {
	}
	public int getHasi() {
		return hasi;
	}
	public void setHasi(int ha) {
		hasi=ha;
	}
	public String getNode1() {
		return node1;
	}
	public void setNode1(String node1) {
		this.node1 = node1;
	}
	public String getNode2() {
		return node2;
	}
	public void setNode2(String node2) {
		this.node2 = node2;
	}
	public int getRoad() {
		return road;
	}
	public void setRoad(int road) {
		this.road = road;
	}
	@Override
	public String toString() {
		return "Node [node1=" + node1 + ", node2=" + node2 + ", road=" + road + "]";
	}
	
	
}

public class Chso {
	static int chsoo(List<Node> t,String starting,String ending,int roadSu){
		int sum=0,result=Integer.MAX_VALUE;
		int TTL=0;
		String node_next=null;
		
		
		for (Node nod : t) {
			node_next=starting;
			do {
				for (Node node : t) {
					int chlth=Integer.MAX_VALUE;
					for (Node node2 : t) {
						if(node2.getNode1().equals(node_next)) {
							if(node2.getHasi()<chlth) {
								chlth=node2.getHasi();
							}
						}
						else if(node2.getNode2().equals(node_next)) {
							if(node2.getHasi()<chlth) {
								chlth=node2.getHasi();
							}
						}
					}
					if(node.getNode1().equals(node_next)&&(node.getHasi()==chlth)) {
						node_next=node.getNode2();
						sum+=node.getRoad();
						node.setHasi(node.getHasi()+1);
					}
//					else if(node.getNode2().equals(node_next)&&(node.getHasi()==chlth)) {
//						node_next=node.getNode1();
//						sum+=node.getRoad();
//						node.setHasi(node.getHasi()+1);
//					}
					TTL++;
				}
				if(TTL==roadSu) {
					break;
				}
			} while ((!node_next.equals(ending)));
			if(result>sum && node_next.equals(ending)) {
				result=sum;
			}
			sum=0;
			TTL=0;
		}
		
		if(result==Integer.MAX_VALUE) {
			return -1;
		}
		else{
			return result;
		}
	}
	
	public static void main(String[] args) {
		List<Node> roadList = new ArrayList<Node>();
		Scanner sc = new Scanner(System.in);
		int nodeSu=sc.nextInt();
		int roadSu=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < roadSu; i++) {
			String node1=sc.next();
			String node2=sc.next();
			int road=sc.nextInt();
			sc.nextLine();
			roadList.add(new Node(node1,node2,road));
		}
		String starting=sc.next();
		String ending=sc.next();
		int result = chsoo(roadList,starting,ending,roadSu);
		System.out.println(result);
		
		
		
		
	}
}
