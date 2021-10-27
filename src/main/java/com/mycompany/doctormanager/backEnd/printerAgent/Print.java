/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doctormanager.backEnd.printerAgent;

import static com.mycompany.doctormanager.MainApp.con;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class Print {

    
     public void PrintDebtte(int id) throws JRException {
        JasperDesign Jds = JRXmlLoader.load(getClass().getResourceAsStream("/printAgent/Bonne.jrxml"));
        String sql = "Select * from Client where id="+id;
        JRDesignQuery qr = new JRDesignQuery();
        qr.setText(sql);
        Jds.setQuery(qr);
        JasperReport jreport = JasperCompileManager.compileReport(Jds);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jreport,
                null, con);
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        jv.viewReport(jasperPrint, false);
    }


}
