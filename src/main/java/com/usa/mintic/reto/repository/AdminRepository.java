package com.usa.mintic.reto.repository;

import com.usa.mintic.reto.entities.Admin;
import com.usa.mintic.reto.repository.crud.AdminCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository{

    private AdminCrudRepository adminCrudRepository;

    public List<Admin> getAll() {
        return (List<Admin>)adminCrudRepository.findAll();

    }

    public Optional<Admin> getAdmin(int id){
        return adminCrudRepository.findById(id);
    }

    public Admin save(Admin admin){
        return adminCrudRepository.save(admin);

    }

    public void delete(Admin admin){
        adminCrudRepository.delete(admin);
    }
}