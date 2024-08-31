import java.util.List;
import com.example.ONG.Pet;

public class PetService {
    private PetRepository repository = new PetRepository();

    public List<Pet> listarPets() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception {
        if (repository.save(pet)) {
            return (pet.getNome() + " cadastrado com sucesso");
        }
        return "pets devem ter ids diferentes";
    }
}
