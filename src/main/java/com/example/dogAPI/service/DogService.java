package com.example.dogAPI.service;

import com.example.dogAPI.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();

}
