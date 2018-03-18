// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/09/2014 14:18:35
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   InspectDelegate.java

package webservices.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="InspectDelegate", targetNamespace="http://inspectbox.itirion.com/")
public interface InspectDelegate
{

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="hello", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.Hello")
    @ResponseWrapper(localName="helloResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.HelloResponse")
    public abstract String hello();

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getDatesModifications", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetDatesModifications")
    @ResponseWrapper(localName="getDatesModificationsResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetDatesModificationsResponse")
    public abstract List getDatesModifications(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getChoix", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetChoix")
    @ResponseWrapper(localName="getChoixResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetChoixResponse")
    public abstract List getChoix(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    
    
    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getTeam", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetTeam")
    @ResponseWrapper(localName="getTeamResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetTeamResponse")
    public abstract List getTeam(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getObjeteam", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetObjeteam")
    @ResponseWrapper(localName="getObjeteamResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetObjeteamResponse")
    public abstract List getObjeteam(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getNiveaux", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetNiveaux")
    @ResponseWrapper(localName="getNiveauxResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetNiveauxResponse")
    public abstract List getNiveaux(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getNiveauObjets", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetNiveauObjets")
    @ResponseWrapper(localName="getNiveauObjetsResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetNiveauObjetsResponse")
    public abstract List getNiveauObjets(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getTypeReponses", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetTypeReponses")
    @ResponseWrapper(localName="getTypeReponsesResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetTypeReponsesResponse")
    public abstract List getTypeReponses(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getUtilisateurs", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetUtilisateurs")
    @ResponseWrapper(localName="getUtilisateursResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetUtilisateursResponse")
    public abstract List getUtilisateurs(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="getLibelleNiveaux", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetLibelleNiveaux")
    @ResponseWrapper(localName="getLibelleNiveauxResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.GetLibelleNiveauxResponse")
    public abstract List getLibelleNiveaux(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    
   
    @WebMethod
    @WebResult(targetNamespace="") 
    @RequestWrapper(localName="checkLogin", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.CheckLogin")
    @ResponseWrapper(localName="checkLoginResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.CheckLoginResponse")
    public abstract boolean checkLogin(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2);

    
    @WebMethod
    @WebResult(targetNamespace="") 
    @RequestWrapper(localName="checkNew", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.CheckNew")
    @ResponseWrapper(localName="checkNewResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.CheckNewResponse")
    public abstract boolean checkNew(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="idTerminal", targetNamespace="") String s3);

    
    @WebMethod
    @WebResult(targetNamespace="") 
    @RequestWrapper(localName="majdone", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.Majdone")
    @ResponseWrapper(localName="majdoneResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.MajdoneResponse")
    public abstract boolean majdone(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="idTerminal", targetNamespace="") String s3);

    
    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="setInspections", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetInspections")
    @ResponseWrapper(localName="setInspectionsResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetInspectionsResponse")
    public abstract List setInspections(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="IdTerminal", targetNamespace="") String s3, @WebParam(name="IdUtilisateur", targetNamespace="") int i, @WebParam(name="Inspection", targetNamespace="") List list);

    
    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="setCloture", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetCloture")
    @ResponseWrapper(localName="setClotureResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetClotureResponse")
    public abstract List setCloture(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="IdTerminal", targetNamespace="") String s3,  @WebParam(name="Cloture", targetNamespace="") List list);

    
    
    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="setStatusPI", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetStatusPI")
    @ResponseWrapper(localName="setStatusPIResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetStatusPIResponse")
    public abstract List setStatusPI(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="IdTerminal", targetNamespace="") String s3,  @WebParam(name="StatusPI", targetNamespace="") List list);

    
    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="setStatutInac", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetStatutInac")
    @ResponseWrapper(localName="setStatutInacResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetStatutInacResponse")
    public abstract List setStatutInac(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="IdTerminal", targetNamespace="") String s3,  @WebParam(name="StatutInac", targetNamespace="") List list);

    @WebMethod
    @WebResult(targetNamespace="")
    @RequestWrapper(localName="setNfc", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetNfc")
    @ResponseWrapper(localName="setNfcResponse", targetNamespace="http://inspectbox.itirion.com/", className="webservices.services.SetNfcResponse")
    public abstract List setNfc(@WebParam(name="CodeAcces", targetNamespace="") String s, @WebParam(name="ClefClient", targetNamespace="") String s1, @WebParam(name="VersionService", targetNamespace="") String s2, @WebParam(name="IdTerminal", targetNamespace="") String s3,  @WebParam(name="Nfc", targetNamespace="") List list);

}
