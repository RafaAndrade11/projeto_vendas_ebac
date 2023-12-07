/**
 *
 */
package br.com.randrade.services;

import br.com.randrade.domain.Cliente;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.exceptions.TipoChaveNaoEncontradaException;
import br.com.randrade.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}