import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCeoService {
    @GetMapping("/{cep}/json/")
    Endereco ConsultarCep(@PathVariable("cep") String cep);

}
