/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.dipa.hubserver.Service;

import java.util.ArrayList;
import online.dipa.hubserver.Model.MyAdresse;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class AdresseService {

    public Boolean addAdresse(final MyAdresse adresse) {
        return true;
    }

    public ArrayList<MyAdresse> filterAdresse(final MyAdresse adresse) {
        final ArrayList<MyAdresse> list = new ArrayList<MyAdresse>();
        list.add(adresse);
        list.add(adresse);
        list.add(adresse);
        return list;
    }

}
