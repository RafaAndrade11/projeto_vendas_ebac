
package br.com.randrade.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.randrade.domain.Produto;
import br.com.randrade.domain.ProdutoQuantidade;


public class ProdutoQuantidadeFactory {

    public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
        Produto prod = br.com.randrade.dao.factory.ProdutoFactory.convert(rs);
        ProdutoQuantidade prodQ = new ProdutoQuantidade();
        prodQ.setProduto(prod);
        prodQ.setId(rs.getLong("ID"));
        prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
        prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        return prodQ;
    }
}