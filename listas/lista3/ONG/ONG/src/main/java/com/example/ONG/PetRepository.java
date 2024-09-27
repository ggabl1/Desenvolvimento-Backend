package com.example.ONG;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class PetRepository {
    private static final int ZERO_BYTE = 0;
    private File arquivo = new File("src/main/resources/database/tb_pets.json");
    private ObjectMapper ObjectMapper = new ObjectMapper();

    public List<Pet> pets;

    public List<Pet> getAll() throws IOException  {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        
        if (arquivo.length() > ZERO_BYTE) {
            return  ObjectMapper.readValue(arquivo, new TypeReference<List<Pet>>() {});
        } else {
           return  new ArrayList<>();
        }
        
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
