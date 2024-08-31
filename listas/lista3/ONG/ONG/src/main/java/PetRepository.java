import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.asm.TypeReference;
import com.example.ONG.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetRepository {
    private File arquivo = new File("src/main/resources/database/tb_pets.json");
    private ObjectMapper ObjectMapper = new ObjectMapper();

    public List<Pet> pets = new ArrayList<>();

    public List<Pet> getAll() throws Exception {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<Pet> pets = null;
        if (arquivo.length() > 0) {
            pets = ObjectMapper.readValue(arquivo, new TypeReference<List<Pet>>() {});
        } else {
            pets = new ArrayList<>();
        }
        return pets;
    }

    public boolean save(Pet pet) throws Exception {
        List<Pet> pets = this.getAll();
        for (Pet petNoBanco : pets) {
            if (petNoBanco.getId() == pet.getId()) {
                return false;
            }
        }

        pets.add(pet);
        ObjectMapper.writeValue(arquivo, pets);
        return true;
    }
}
