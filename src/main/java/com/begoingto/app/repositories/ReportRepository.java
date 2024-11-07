/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.begoingto.app.repositories;

import com.begoingto.app.models.Report;
import com.begoingto.app.services.MainService;

/**
 *
 * @author begoingtodev
 */
public class ReportRepository extends MainService<Report>{

    public ReportRepository() {
        super.clazz = Report.class;
    }
    
    
    public Class<Report> getClazz(){
        return this.clazz;
    }
}
