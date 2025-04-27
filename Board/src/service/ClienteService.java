

public interface ClienteService {

    Iterable<Cliente> buscaTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

    
}
