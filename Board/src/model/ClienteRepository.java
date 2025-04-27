import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository<Cliente> extends CrudRepository<Cliente, Long>{
    
}
