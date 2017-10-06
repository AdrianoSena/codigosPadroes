
package decorator;

/**
 *
 * @author Enterprise
 */
public class EmissorComum implements Emissor {

     
    private String mensagem;

    public EmissorComum(String text) {
        mensagem = text;
    }

    @Override
    public void envia(String mensagem) {
        
       System.out.println("Enviando mensagem ao destinatário");
       System.out.println(mensagem);
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

   
    
    
    
    
}
