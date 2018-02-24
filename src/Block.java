import java.util.Arrays;

public class Block {
	
	//A ideia é cada bloco partir da informação do bloco anterior tal como da lista de blocos.
	//Nenhum objeto tem hashCode igual. Se mudar algo no passado, vai partir (descredibilizar) todas as assinaturas (hash), IJ.
	
	private int previousHash;
	private String[] transactions; //hipoteticamente seria uma lista de qualquer objeto, String é apenas um exemplo
	private int blockHash;
	
	
	public Block (int previousHash, String[] transactions){
		
		this.previousHash=previousHash;
		this.transactions=transactions;
		
		Object[] content = {Arrays.hashCode(transactions), previousHash}; 
		this.blockHash = Arrays.hashCode(content); //obtemos aqui o conceito de corrente de informção
		
		
		}

	public int getPreviousHash() {
		return previousHash;
	}


	public String[] getTransactions() {
		return transactions;
	}


	public int getBlockHash() {
		return blockHash;
	}
		
}
