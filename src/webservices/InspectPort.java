// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/09/2014 14:09:53
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   InspectPort.java

package webservices;

import java.io.PrintStream;
import java.util.List;

import javax.jws.WebService;

import webservices.database.FacadeDatabase;

@WebService(endpointInterface="webservices.services.InspectDelegate", targetNamespace="http://inspectbox.itirion.com/", serviceName="InspectService", portName="InspectPort")
public class InspectPort
{

    public InspectPort()
    {
    }

    public String hello()
    {
        return "Hello";
    }

    public List getDatesModifications(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        try
        {
            db.setDateModifier("choix");
            db.setDateModifier("utilisateur");
            db.setDateModifier("niveau");
            db.setDateModifier("niveauobjet");
            db.setDateModifier("typereponse");
            db.setDateModifier("libelleniveau");
            db.setDateModifier("team");
            db.setDateModifier("objeteam");
            db.setDateModifier("csvcount");
            
        }
        catch(Exception cnfe)
        {
            System.out.println((new StringBuilder("Error:")).append(cnfe.getMessage()).toString());
        }
        finally{
        db.close();
        }
       
        return db.getListClefTimestamp();
    }

    public List getChoix(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getChoix();
    }
    
   
    public List getNiveaux(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getNiveaux();
    }

    public List getNiveauObjets(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getNiveauobjets();
    }

    public List getTypeReponses(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getTypereponses();
    }

    public List getUtilisateurs(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getUtilisateurs();
    }

    public List getLibelleNiveaux(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getLibelleniveaux();
    }

   
    public List getTeam(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getTeam();
    }
    public List getObjeteam(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.getObjeteam();
    }
    public boolean checkLogin(String codeAcces, String clefClient, String versionService)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.checkLogin().booleanValue();
    }
    
    public boolean checkNew(String codeAcces, String clefClient, String versionService, String idTerminal)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.checkNew(idTerminal).booleanValue();
    }

    public boolean majdone(String codeAcces, String clefClient, String versionService, String idTerminal)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.majdone(idTerminal).booleanValue();
    }
    
    public List setInspections(String codeAcces, String clefClient, String versionService, String idTerminal, int idUtilisateur, List inspection)
    {
        FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.setInspections(idTerminal, Integer.valueOf(idUtilisateur), inspection);
    }

    
    public List setStatusPI(String codeAcces, String clefClient, String versionService, String idTerminal, List statusPI)
    {
         FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.setStatusPI(idTerminal,  statusPI);
    }
    
    public List setCloture(String codeAcces, String clefClient, String versionService, String idTerminal, List cloture)
    {
         FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.setCloture(idTerminal,  cloture);
    }
   
    public List setNfc(String codeAcces, String clefClient, String versionService, String idTerminal, List nfc)
    {
         FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.setNfc(idTerminal,  nfc);
    }
    public List setStatutInac(String codeAcces, String clefClient, String versionService, String idTerminal, List statutInac)
    {
         FacadeDatabase db = new FacadeDatabase(codeAcces, clefClient, versionService);
        return db.setStatutInac(idTerminal,  statutInac);
    }
}
