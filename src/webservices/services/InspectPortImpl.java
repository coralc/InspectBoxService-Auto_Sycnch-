 package webservices.services;
 
 import java.util.List;
 import javax.jws.WebService;
 
 @WebService(endpointInterface="webservices.services.InspectDelegate", targetNamespace="http://inspectbox.itirion.com/", serviceName="InspectService", portName="InspectPort")
public class InspectPortImpl
{

    public InspectPortImpl()
    {
    }

    public String hello()
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getDatesModifications(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getChoix(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
   
    public List getTeam(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getObjeteam(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getNiveaux(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getNiveauObjets(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getTypeReponses(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getUtilisateurs(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List getLibelleNiveaux(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    public boolean checkLogin(String codeAcces, String clefClient, String versionService)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    public boolean checkNew(String codeAcces, String clefClient, String versionService ,String idTerminal)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean majdone(String codeAcces, String clefClient, String versionService ,String idTerminal)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

     public List setInspections(String codeAcces, String clefClient, String versionService, String idTerminal, int idUtilisateur, List inspection)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List setStatusPI(String codeAcces, String clefClient, String versionService, String idTerminal,  List StatusPI)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    public List setCloture(String codeAcces, String clefClient, String versionService, String idTerminal,  List Cloture)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    public List setStatutInac(String codeAcces, String clefClient, String versionService, String idTerminal,  List StatutInac)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    public List setNfc(String codeAcces, String clefClient, String versionService, String idTerminal,  List Nfc)
    {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    
}
