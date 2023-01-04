/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qadri.mahasiswa.service.service;

import com.qadri.mahasiswa.service.entity.Mahasiswa;
import com.qadri.mahasiswa.service.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Apip
 */
@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;
    
    public Mahasiswa saveMahasiswa(Mahasiswa mahasiswa){
        return mahasiswaRepository.save(mahasiswa);
    }
    
    public Mahasiswa findMahasiswaByNIM(Long mahasiswaNIM){
        return mahasiswaRepository.findByMahasiswaNIM(mahasiswaNIM);
    }
}
