
package br.com.randrade.services;

import br.com.randrade.dao.IProdutoDAO;
import br.com.randrade.domain.Produto;
import br.com.randrade.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}