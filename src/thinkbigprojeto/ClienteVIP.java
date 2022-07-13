package thinkbigprojeto;

public class ClienteVIP extends ClienteNormal{
    
    private String numeroCartao;
    private String CVV;
    private String bandeira;
    private String dataExpiracao;
    
    public ClienteVIP(String numeroCartao, String CVV, String bandeira, String dataExpiracao, String nomeCli, String sobreNome, String endCli, String telCli, String CPFCli) {
        super(nomeCli, sobreNome, endCli, telCli, CPFCli);
        this.numeroCartao = numeroCartao;
        this.CVV = CVV;
        this.bandeira = bandeira;
        this.dataExpiracao = dataExpiracao;
    }
  
}
