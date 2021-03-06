package backend.hrms.api.controllers;

import backend.hrms.business.abstracts.CompanyService;
import backend.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService){
        this.companyService=companyService;
    }

    @GetMapping("getall")
    public List<Company> getAll(){
        return companyService.getAll();
    }
}
