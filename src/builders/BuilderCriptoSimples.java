/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import decorator.Emissor;
import decorator.EmissorComum;
import decorator.EmissorCriptoA;
import decorator.EmissorCriptoCerquilha;
import decorator.EmissorCriptoE;

/**
 *
 * @author Enterprise
 */
public class BuilderCriptoSimples implements BuilderEmissor {

    Emissor emissor;

    public BuilderCriptoSimples(String mensagem) {
       emissor = new EmissorComum(mensagem);
      
    }

    @Override
    public void buildEmissorA() {
        EmissorCriptoA criptoA = new EmissorCriptoA(emissor);
        emissor = criptoA;
    }

    @Override
    public void buildEmissorE() {
        EmissorCriptoE emissorCriptoE = new EmissorCriptoE(emissor);
        emissor = emissorCriptoE;
    }

    @Override
    public void buildEmissorCerquilha() {
        EmissorCriptoCerquilha emissorCriptoC = new EmissorCriptoCerquilha(emissor);
        emissor = emissorCriptoC;
    }

}
