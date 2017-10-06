
package decorator;

/**
 *
 * @author Enterprise
 */
public class EmissorCriptoCerquilha extends EmissorDecorator{

    public EmissorCriptoCerquilha(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        criptografa(mensagem);
        this.getEmissor().envia(mensagem);
    }
    
    public void criptografa(String msg){
        msg.replace('o', '#');
    }
    
    
}
