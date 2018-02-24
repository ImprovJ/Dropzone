import java.util.ArrayList;



//Este projeto representa o funcionamento do "core" da blockchain.
//Elaborado com o intuito de aprender mais sobre este assunto e baseado em vídeos de aprendizagem na internet.
//IJ


public class Main {

	private ArrayList<Block> blockchain = new ArrayList<>();

	public static void main(String[] args) {

		String[] genesis = { "rui manda 10 bitcoins a francisco", "francisco manda 100 bitoins a IJ" }; // genisis é hardcoded, sendo a 1º transação
		Block genesisBlock = new Block(0, genesis);			  										   // quando alterada, todas as assinaturas vão alterar
																						
		String[] block2Transactions = { "joao manda 10 bitcoin a satoshi", "satoshi manda 10 bitcoin a IJ" };
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

		String[] block3Transactions = {"IJ manda 20 bitcoin a laura"};
		Block block3 = new Block(block2.getBlockHash(), block3Transactions);

		System.out.println("Assinatura do genesis block:"); 
		System.out.println(genesisBlock.getBlockHash());

		System.out.println("Assinatura do block 2:");
		System.out.println(block2.getBlockHash());

		System.out.println("Assinatura do block 3:");
		System.out.println(block3.getBlockHash());

	}

}