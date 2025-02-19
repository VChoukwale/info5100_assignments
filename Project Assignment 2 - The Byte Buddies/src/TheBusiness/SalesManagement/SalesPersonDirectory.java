/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SalesManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;
import TheBusiness.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class SalesPersonDirectory {

    Business business;
    ArrayList<SalesPersonProfile> salespersonlist;

    public SalesPersonDirectory(Business d) {

        business = d;
        salespersonlist = new ArrayList();

    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public ArrayList<SalesPersonProfile> getSalespersonlist() {
        return salespersonlist;
    }

    public void setSalespersonlist(ArrayList<SalesPersonProfile> salespersonlist) {
        this.salespersonlist = salespersonlist;
    }

    public SalesPersonProfile newSalesPersonProfile(Person p) {

        SalesPersonProfile sp = new SalesPersonProfile(p);
        salespersonlist.add(sp);
        return sp;
    }

    public SalesPersonProfile findSalesPerson(String id) {

        for (SalesPersonProfile sp : salespersonlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

}
