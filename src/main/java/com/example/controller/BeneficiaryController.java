package com.example.controller;

import com.example.entity.Beneficiary;
import com.example.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/beneficiaries")
public class BeneficiaryController {

    @Autowired
    private BeneficiaryService beneficiaryService;

    @PostMapping
    public ResponseEntity<Beneficiary> createBeneficiary(@RequestBody Beneficiary beneficiary) {
        Beneficiary createdBeneficiary = beneficiaryService.createBeneficiary(beneficiary);
        return ResponseEntity.ok(createdBeneficiary);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Beneficiary> getBeneficiaryById(@PathVariable Long id) {
        Optional<Beneficiary> beneficiary = beneficiaryService.getBeneficiaryById(id);
        return beneficiary.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Beneficiary>> getAllBeneficiaries() {
        List<Beneficiary> beneficiaries = beneficiaryService.getAllBeneficiaries();
        return ResponseEntity.ok(beneficiaries);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Beneficiary> updateBeneficiary(@PathVariable Long id, @RequestBody Beneficiary beneficiaryDetails) {
        Beneficiary updatedBeneficiary = beneficiaryService.updateBeneficiary(id, beneficiaryDetails);
        return updatedBeneficiary != null ? ResponseEntity.ok(updatedBeneficiary) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBeneficiary(@PathVariable Long id) {
        beneficiaryService.deleteBeneficiary(id);
        return ResponseEntity.noContent().build();
    }
}
