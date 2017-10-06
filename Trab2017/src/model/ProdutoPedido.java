package model;

public class ProdutoPedido {

	
		private Integer codigo;
		private Pedido pedido;
		private Produto produto;
		private Double qtd;
		private Double valorUnitario;
		private Double valorTotal;
		
		
		public Integer getCodigo() {
			return codigo;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public Pedido getPedido() {
			return pedido;
		}
		public void setPedido(Pedido pedido) {
			this.pedido = pedido;
		}
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		public Double getQtd() {
			return qtd;
		}
		public void setQtd(Double qtd) {
			this.qtd = qtd;
		}
		public Double getValorUnitario() {
			return valorUnitario;
		}
		public void setValorUnitario(Double valorUnitario) {
			this.valorUnitario = valorUnitario;
		}
		public Double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(Double valorTotal) {
			this.valorTotal = valorTotal;
		}

	
	}