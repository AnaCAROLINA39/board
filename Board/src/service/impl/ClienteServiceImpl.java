import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCeoSercice ViaCeoSercice;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepsoitoy.findById(id);
        return cliente.get();
    }    

    @Override
    public void inserir(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco endereco = ViaCeoSercice.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
    @Override
    public void atualizar(Long id,Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepsoitoy.findById(id);
        if (clienteBd.isPresent()) {
            
        }
    }
    @Override
    public void deletar(Long id) {
        
    }
}
