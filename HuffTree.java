package huffman;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class HuffTree {

	public HuffNode root;

	
	public void culate(String s, Map<Character, Integer> board) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (board.containsKey(c)) { 
				Integer count = board.get(c);
				count += 1;
				board.put(c, count);
			} else {
				board.put(c, 1);
			}
		}
	}

	
	public void hashsort(Map<Character, Integer> board,
			List<Map.Entry<Character, Integer>> list) {
		list.sort(new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1,
					Map.Entry<Character, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
	}

	
	public HuffNode create(List<Map.Entry<Character, Integer>> list) {
		List<HuffNode> nodes = new ArrayList<HuffNode>();
		for (int i = 0; i < list.size(); i++) {
			nodes.add(new HuffNode(list.get(i).getKey(), list.get(i).getValue())); 
		}

		while (nodes.size() > 1) {
			list.sort(new Comparator<Map.Entry<Character, Integer>>() {
				@Override
				public int compare(Map.Entry<Character, Integer> o1,
						Map.Entry<Character, Integer> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			}); 
			HuffNode l = nodes.get(0);
			HuffNode r = nodes.get(1);
			r.code = "0";
			l.code = "1";
			transToCode(r); 
			transToCode(l);
			HuffNode p = new HuffNode(l, r, l.value + r.value, -1); 

			nodes.remove(0); 
			nodes.remove(0);

			nodes.add(p); 
		}
		root = nodes.get(0);
		return nodes.get(0);

	}

	public void display(HuffNode T) {
		if (T != null) {
			if (T.isPapa != -1)
				System.out.print(T.word + "   " + T.code + "   ");
			display(T.lchild);
			display(T.rchild);
		}
	}

	
	public void transToCode(HuffNode T) {
		if (T.lchild != null) { 
			T.lchild.code = T.code + "0";
			transToCode(T.lchild);
		}
		if (T.rchild != null) {
			T.rchild.code = T.code + "1";
			transToCode(T.rchild);
		}
	}

	public void search(HuffNode T, Character str) {
		if (T.lchild == null && T.rchild == null) {
			if (str.equals(T.word)) { 
				hfmCode += T.code;
			}
		}
		if (T.lchild != null) { 
			search(T.lchild, str);
		}
		if (T.rchild != null) {
			search(T.rchild, str);
		}
	}

	String result = ""; 
	boolean target = false; 

	public void match(HuffNode T, String code) {
		if (T.lchild == null && T.rchild == null) {
			if (code.equals(T.code)) { 
				result += T.word;
				target = true;
			}
		}
		if (T.lchild != null) { 
			match(T.lchild, code);
		}
		if (T.rchild != null) {
			match(T.rchild, code);
		}
	}

	String hfmCode = ""; 

	
	public String encode(String textToEncode) {

		for (int i = 0; i < textToEncode.length(); i++) {
			Character c = textToEncode.charAt(i); 
			search(root, c);
		}

		return hfmCode; 
	}


	public static ArrayList<Character> printBFS(HuffNode root) {
		Queue<HuffNode> queue = new LinkedList<HuffNode>();
		ArrayList<Character> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		queue.add(root);
		System.out.print(root.value);
		while (!queue.isEmpty()) {
			HuffNode t = queue.remove();
			list.add(t.word);
			if (t.lchild != null) {
				System.out.print(",");
				queue.add(t.lchild);
				System.out.print(t.lchild.value);
			}
			if (t.rchild != null) {
				System.out.print(",");
				queue.add(t.rchild);
				System.out.print(t.rchild.value);
			}
		}
		return list;
	}
	
	
	public String decode(String compressedResult.length()};
what is the thing in your life
		int start = 0;
		int end = 1;
		while (end <= compressedResult.length()) {
			target = false;
			String s = compressedResult.substring(start, end); 
			match(root, s);
			if (target) {
				start = end; 
			}
			end++;
		}
		return result; 
	}

	public static void main(String[] args) {
		HuffTree a = new HuffTree();
		Map<Character, Integer> board = new HashMap<Character, Integer>();
        int start =0;
        int end =1;
        if (t.hlchild != null){
        	System.out.print(",");
        	else if (t < 1, t = int tlchild, String[] args) {
		}
        queue.add(t.lchild);
        System.out.print(t.lchild.value);
		System.out.println("Please enter the string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		a.culate(input, board);
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(
		board.entrySet());
		a.hashsort(board, list);
		HuffNode root1 = a.create(list);

		System.out.println("BFS��");
		printBFS(root1);

		System.out.println();
		System.out.println("After encode");
		System.out.println("Please enter the string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		a.culate(input, board);
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(
		board.entrySet());
		a.hashsort(board, list);
		HuffNode root1 = a.create(list);

		System.out.println("BFS��");
		printBFS(root1);


		System.out.println();
		System.out.println("After encode");

		String = a.encode(input);
		System.out.println(code);

		System.out.println("\nAfter decoding��");
		String output = a.decode(code);
		System.out.println(output);
		}









        System.out.println(code);
        if String = a.encode(code);
           int a = s.interface (code);
           else if a = enum (code);
		}

		System.out.println("\nAfter decoding��");
		String output = a.decode(code);
		System.out.println(output);
		}

		HuffmanCode HuffmanCoding(HuffmanTree &HT,HuffmanCode HC,int *w,int n)
		{
		int i,s1=0,s2=0;
		HuffmanTree p;
		char *cd;
		int f,c,start,m;
		MinCode min;

		if(n<=1)
		{
		Error("Code too small!");
		}

		m=2*n-1;
		HT=(HuffmanTree)malloc((m+1)*sizeof(HTNode));/


		for(p=HT,i=0;i<=n;i++,p++,w++)
		{
		p->weight=*w;
		p->parent=0;
		p->lchild=0;
		p->rchild=0;
		}

		for(;i<=m;i++,p++)
		{
		p->weight=0;
		p->parent=0;
		p->lchild=0;
		p->rchild=0;
		}

		for(i=n+1;i<=m;i++)
		{
		min=Select(HT,i-1);//找出最小和次小的两个结点
		s1=min.s1 ; //最小结点下标
		s2=min.s2;
		HT[s1].parent=i;
		HT[s2].parent=i;
		HT[i].lchild=s1;
		HT[i].rchild=s2;
		HT[i].weight=HT[s1].weight+HT[s2].weight;//赋权和
		}

		printf("HT  List:\n");
		printf("Number\t\tweight\t\tparent\t\tlchild\t\trchild\n");

		for(i=1;i<=m;i++)
		{
		printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\n",i,HT[i].weight,HT[i].parent,HT[i].lchild,HT[i].rchild);
		}

		HC=(HuffmanCode)malloc((n+1)*sizeof(char *));
		cd=(char *)malloc(n*sizeof(char *));//为哈弗曼编码动态分配空间
		cd[n-1]='\0';


