package AvaliacaoSomativa;

public class PrincipalPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido pedido = new Pedido (1, "computador", 10);
		System.out.println("id: "+pedido.getId());
		System.out.println("Produto: " +pedido.getProduto());
		System.out.println("Quantidade:"+pedido.getQuantidade());
	}

}
