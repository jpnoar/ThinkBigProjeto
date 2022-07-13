package thinkbigprojeto;

public class ClienteNormal extends Usuario{
    public String nomeCli;
    public String sobreNome;
    public boolean vip = false;
    public String endCli;
    public String telCli;
    public String CPFCli;

    public ClienteNormal(String nomeCli, String sobreNome, String endCli, String telCli, String CPFCli) {
        this.nomeCli = nomeCli;
        this.sobreNome = sobreNome;
        this.endCli = endCli;
        this.telCli = telCli;
        this.CPFCli = CPFCli;
    }
}
