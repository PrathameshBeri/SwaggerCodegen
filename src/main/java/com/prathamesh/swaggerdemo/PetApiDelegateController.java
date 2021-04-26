package com.prathamesh.swaggerdemo;


import io.swagger.api.PetApiDelegate;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class PetApiDelegateController implements PetApiDelegate {
    @Override
    public ResponseEntity<Void> addPet(Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(List<String> status) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        Pet pet = new Pet();
        pet.setId(1l);
        pet.setName("Bhubhu");

        return ResponseEntity.ok(pet);
    }

    @Override
    public ResponseEntity<Void> updatePet(Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, MultipartFile file) {
        return null;
    }
}
