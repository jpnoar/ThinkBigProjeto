package thinkbigprojeto;

public class FactoryCliente {
    public Usuario getCliente (String nomeCli,
            String sobreNome,
            String endCli,
            String telCli,
            String CPFCli,
            boolean vip,
            String numeroCartao,
            String CVV,
            String bandeira,
            String dataExpiracao){
        
            if(vip != true){
                return new ClienteNormal(nomeCli, sobreNome, endCli, telCli, CPFCli);
            }else{
                return new ClienteVIP(numeroCartao, CVV, bandeira, dataExpiracao, nomeCli, sobreNome, endCli, telCli, CPFCli);
            }
    }

}
