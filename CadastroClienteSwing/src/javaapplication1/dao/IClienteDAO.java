package javaapplication1.dao;

import javaapplication1.domain.Cliente;

/**
 *
 * @author rodrigo.pires
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(Long cpf);
}