package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a localização do arquivo: ");
		String location = scanner.nextLine();
		
		try {
			List<String> nodes = readFromInputStream(location);
			
			System.out.println("Escolha o tipo de algoritmo: ");
			System.out.println("1 - Pré-ordem");
			System.out.println("2 - Ordem");
			System.out.println("3 - Pós-ordem");
			
			int algorithm = scanner.nextInt();
			
			switch (algorithm) {
			case 1:
				for (String node : nodes) {
					printPreorder(new Node(Integer.parseInt(node)));
				}
			case 2:
				for (String node : nodes) {
					printInorder(new Node(Integer.parseInt(node)));
				}
			case 3:
				for (String node : nodes) {
					printPostorder(new Node(Integer.parseInt(node)));
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + algorithm);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scanner.close();
	}
	
	static Node insert(Node node, int key) 
	{ 
	        if (node == null) 
	            return new Node(key); 
	  
	        if (key < node.value) 
	            node.left = insert(node.left, key); 
	        else 
	            node.right = insert(node.right, key); 
	  
	        return node; 
  	} 
	
	private static List<String> readFromInputStream(String path) throws IOException {
		List<String> response = new ArrayList<String>();
			   			    	
        File file = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String st;
			
			while ((st = br.readLine()) != null) 
			    response.add(st);
		}

        return response;
			
	}
	
	static void printInorder(Node node)
  	{
	        if (node == null)
	            return;
	 
	        printInorder(node.left);
	 
	        System.out.print(node.value);
	 
	        printInorder(node.right);
  	}
	
	static void printPreorder(Node node)
  	{
	        if (node == null)
	            return;
	 
	        System.out.print(node.value);
	 
	        printPreorder(node.left);
	        printPreorder(node.right);
  	}
	
	static void printPostorder(Node node)
  	{
	        if (node == null)
	            return;
	 
	        printPostorder(node.left);
	        printPostorder(node.right);
	 
	        System.out.print(node.value);
  	}
	
	public static class Node {
		
		public Node(int value) {
			this.value = value;
		}
		
		public int value;
		public Node left;
		public Node right;
	}
}
