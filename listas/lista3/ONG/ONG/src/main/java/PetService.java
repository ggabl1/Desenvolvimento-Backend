public class PetService {
    private PetRepository repository = new PetRepository();
    public List<Pet> listarPets(){
       return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet){
        if(repository.save(pet)){
            return (Pet.nome + " cadastrado com sucesso");
        }
    return "pets devem ter ids diferentes";
    }
}
