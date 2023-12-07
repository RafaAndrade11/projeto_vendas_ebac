
package br.com.randrade.dao;

import br.com.randrade.dao.generic.IGenericDAO;
import br.com.randrade.domain.Venda;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}