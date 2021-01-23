package huffman;

public class HuffNode {
	public boolean falg;
	public Character word;
	public Integer value;
	public HuffNode lchild;
	public HuffNode rchild;
	public int isPapa;
	public String code;

	public HuffNode() {
		this.word = null;
		this.lchild = null;
		this.rchild = null;
		this.value = 0;
	}

	public HuffNode(Character word, Integer value) {
		this.value = value;
		this.word = word;
	}

	public HuffNode(HuffNode lchild, HuffNode rchild, Integer value, int isPapa) {

		this.lchild = lchild;
		this.rchild = rchild;
		this.value = value;
		this.isPapa = isPapa;
	}
	
	public String toString(){
		return "value="+word;
	}

	public void preOrder() {
		System.out.println(this);
		if (this.lchild != null) {
			this.lchild.preOrder();
		}
		if (this.rchild != null) {
			this.rchild.preOrder();
		}
	}
}
