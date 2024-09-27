package or.programandoSeuFuturo.lojaVirtual;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import or.programandoSeuFuturo.lojaVirtual.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    List<Produto> findByEstaFavoritadoTrue();
    List<Produto> findByEstaDisponivelTrue();
}
