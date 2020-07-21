/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.dipa.hubserver.Controller;

import java.util.ArrayList;
import java.util.List;
import online.dipa.hub_openapi.Adresse;
import online.dipa.hub_openapi.AdresseApi;
import online.dipa.hubserver.Model.MyAdresse;
import online.dipa.hubserver.Service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class AdresseController implements AdresseApi {

    @Autowired
    AdresseService adresseService;

    @Override
    public ResponseEntity<List<Adresse>> adresseGet() {
        final ArrayList<MyAdresse> myAdressen = adresseService.filterAdresse(new MyAdresse());
        final ArrayList<Adresse> adressen = new ArrayList<Adresse>();
        myAdressen.stream().forEach(myAdresse -> adressen.add(new Adresse()));
        return ResponseEntity.ok(adressen); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> adressePost(Adresse adresse) {
        return AdresseApi.super.adressePost(adresse); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<List<Adresse>> adressePut(Adresse adresse) {
        return AdresseApi.super.adressePut(adresse); //To change body of generated methods, choose Tools | Templates.
    }

}
