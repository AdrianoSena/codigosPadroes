
package decorator;

/**
 *
 * @author Enterprise
 */
public class EmissorCriptoA extends EmissorDecorator{

    public EmissorCriptoA(Emissor emissor) {
        super(emissor);
    }


    @Override
    public void envia(String mensagem) {
        criptografa(mensagem);
        this.getEmissor().envia(mensagem);
        
    }
    
    public void criptografa(String mensagem){
        mensagem.replace('a', '1');
    }

   
}
