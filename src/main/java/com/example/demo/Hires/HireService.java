package com.example.demo.Hires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class HireService {

    @Autowired
    private HireRepository hireRepository;

    @RequestMapping("/hires/")
    public List<Hire> getAllHires() {
        List<Hire> hires = new ArrayList<>();
        hireRepository.findAll().forEach(hires::add);
        return hires;
    }

    public Hire getHireId(Long id) {
        return hireRepository.findOne(id);
    }

    public void addHire(Hire hire) {
        hireRepository.save(hire);
    }

    public void updateHire(Hire hire) {
        hireRepository.save(hire);
    }

    public void deleteHire(Long id) {
        hireRepository.delete(id);
    }

}
