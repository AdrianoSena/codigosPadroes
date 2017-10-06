
package decorator;

/**
 *
 * @author Enterprise
 */
public class EmissorCriptoE extends EmissorDecorator {

    public EmissorCriptoE(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        criptografa(mensagem);
        this.getEmissor().envia(mensagem);
    }

    public void criptografa(String msg){
        msg.replace('e','4');
    }
}

