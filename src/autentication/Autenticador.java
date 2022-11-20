package autentication;

import controllers.Funcionario;

public interface Autenticador {
    void verificar(Funcionario funcionario);
}
