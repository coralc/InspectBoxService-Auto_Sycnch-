 package webservices.services;
 
 import javax.xml.bind.JAXBElement;
 import javax.xml.bind.annotation.XmlElementDecl;
 import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
 
 @XmlRegistry
public class ObjectFactory
{

    private static final QName _Hello_QNAME = new QName("http://inspectbox.itirion.com/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://inspectbox.itirion.com/", "helloResponse");
    
    private static final QName _CheckLogin_QNAME = new QName("http://inspectbox.itirion.com/", "checkLogin");
    private static final QName _CheckLoginResponse_QNAME = new QName("http://inspectbox.itirion.com/", "checkLoginResponse");
    
    private static final QName _CheckNew_QNAME = new QName("http://inspectbox.itirion.com/", "checkNew");
    private static final QName _CheckNewResponse_QNAME = new QName("http://inspectbox.itirion.com/", "checkNewResponse");
   
    private static final QName _Majdone_QNAME = new QName("http://inspectbox.itirion.com/", "majdone");
    private static final QName _MajdoneResponse_QNAME = new QName("http://inspectbox.itirion.com/", "majdoneResponse");
  
       
    
    private static final QName _GetNiveaux_QNAME = new QName("http://inspectbox.itirion.com/", "getNiveaux");
    private static final QName _GetNiveauxResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getNiveauxResponse");
    
    private static final QName _GetChoix_QNAME = new QName("http://inspectbox.itirion.com/", "getChoix");
    private static final QName _GetChoixResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getChoixResponse");
    
   
    
    private static final QName _GetTeam_QNAME = new QName("http://inspectbox.itirion.com/", "getTeam");
    private static final QName _GetTeamResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getTeamResponse");
    
    private static final QName _GetObjeteam_QNAME = new QName("http://inspectbox.itirion.com/", "getObjeteam");
    private static final QName _GetObjeteamResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getObjeteamResponse");
    
    private static final QName _GetUtilisateurs_QNAME = new QName("http://inspectbox.itirion.com/", "getUtilisateurs");
    private static final QName _GetUtilisateursResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getUtilisateursResponse");
    
    private static final QName _GetTypeReponses_QNAME = new QName("http://inspectbox.itirion.com/", "getTypeReponses");
    private static final QName _GetTypeReponsesResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getTypeReponsesResponse");
    
    private static final QName _GetNiveauObjets_QNAME = new QName("http://inspectbox.itirion.com/", "getNiveauObjets");
    private static final QName _GetNiveauObjetsResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getNiveauObjetsResponse");
    
    private static final QName _GetLibelleNiveaux_QNAME = new QName("http://inspectbox.itirion.com/", "getLibelleNiveaux");
    private static final QName _GetLibelleNiveauxResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getLibelleNiveauxResponse");
    
    private static final QName _GetDatesModifications_QNAME = new QName("http://inspectbox.itirion.com/", "getDatesModifications");
    private static final QName _GetDatesModificationsResponse_QNAME = new QName("http://inspectbox.itirion.com/", "getDatesModificationsResponse");
    
    private static final QName _SetInspections_QNAME = new QName("http://inspectbox.itirion.com/", "setInspections");
    private static final QName _SetInspectionsResponse_QNAME = new QName("http://inspectbox.itirion.com/", "setInspectionsResponse");
    
    private static final QName _SetCloture_QNAME = new QName("http://inspectbox.itirion.com/", "setCloture");
    private static final QName _SetClotureResponse_QNAME = new QName("http://inspectbox.itirion.com/", "setClotureResponse");
    
    private static final QName _SetNfc_QNAME = new QName("http://inspectbox.itirion.com/", "setNfc");
    private static final QName _SetNfcResponse_QNAME = new QName("http://inspectbox.itirion.com/", "setNfcResponse");
    
    private static final QName _SetStatutInac_QNAME = new QName("http://inspectbox.itirion.com/", "setStatutInac");
    private static final QName _SetStatutInacResponse_QNAME = new QName("http://inspectbox.itirion.com/", "setStatutInacResponse");
    
    private static final QName _SetStatusPI_QNAME = new QName("http://inspectbox.itirion.com/", "setStatusPI");
    private static final QName _SetStatusPIResponse_QNAME = new QName("http://inspectbox.itirion.com/", "setStatusPIResponse");
    
    
   
    public ObjectFactory()
    {
    }
    /**/
    public Niveauobjet createNiveauobjet()
    {
        return new Niveauobjet();
    }
    public GetNiveauObjets createGetNiveauObjets()
    {
        return new GetNiveauObjets();
    }
    public GetNiveauObjetsResponse createGetNiveauObjetsResponse()
    {
        return new GetNiveauObjetsResponse();
    }

    /**/
    public Niveau createNiveau()
    {
        return new Niveau();
    }
    public GetNiveaux createGetNiveaux()
    {
        return new GetNiveaux();
    }
    public GetNiveauxResponse createGetNiveauxResponse()
    {
        return new GetNiveauxResponse();
    }
   
    /**/
    
    public GetUtilisateurs createGetUtilisateurs()
    {
        return new GetUtilisateurs();
    }
    public Utilisateur createUtilisateur()
    {
        return new Utilisateur();
    }
    public GetUtilisateursResponse createGetUtilisateursResponse()
    {
        return new GetUtilisateursResponse();
    }
    /**/
    public GetDatesModificationsResponse createGetDatesModificationsResponse()
    {
        return new GetDatesModificationsResponse();
    }
    public GetDatesModifications createGetDatesModifications()
    {
        return new GetDatesModifications();
    }

    
    /**/
    
    public CheckLogin createCheckLogin()
    {
        return new CheckLogin();
    }
    public CheckLoginResponse createCheckLoginResponse()
    {
        return new CheckLoginResponse();
    }

    /**/
    
/**/
    
    public CheckNew createCheckNew()
    {
        return new CheckNew();
    }
    public CheckNewResponse createCheckNewResponse()
    {
        return new CheckNewResponse();
    }

    /**/
/**/
    
    public Majdone createMajdone()
    {
        return new Majdone();
    }
    public MajdoneResponse createMajdoneResponse()
    {
        return new MajdoneResponse();
    }

    /**/
    /**/
    public Typereponse createTypereponse()
    {
        return new Typereponse();
    }
    public GetTypeReponses createGetTypeReponses()
    {
        return new GetTypeReponses();
    }
    public GetTypeReponsesResponse createGetTypeReponsesResponse()
    {
        return new GetTypeReponsesResponse();
    }
    
    
    /**/
    public SetInspections createSetInspections()
    {
        return new SetInspections();
    }
    public Inspection createInspection()
    {
        return new Inspection();
    }
    public ReponseInspection createReponseInspection()
    {
        return new ReponseInspection();
    }
    public SetInspectionsResponse createSetInspectionsResponse()
    {
        return new SetInspectionsResponse();
    }
    
    /**/
    public Cloture createCloture()
    {
        return new Cloture();
    }
    public ReponseCloture createReponseCloture()
    {
        return new ReponseCloture();
    }
    public SetClotureResponse createSetClotureResponse()
    {
        return new SetClotureResponse();
    }
    public SetCloture createSetCloture()
    {
        return new SetCloture();
    }
    
    /**/
    
    
    
    /**/
    public StatutInac createStatutInac()
    {
        return new StatutInac();
    }
    public ReponseStatutInac createReponseStatutInac()
    {
        return new ReponseStatutInac();
    }
    public SetStatutInacResponse createSetStatutInacResponse()
    {
        return new SetStatutInacResponse();
    }
    public SetStatutInac createSetStatutInac()
    {
        return new SetStatutInac();
    }
    /**/
    public Nfc createNfc()
    {
        return new Nfc();
    }
    public ReponseNfc createReponseNfc()
    {
        return new ReponseNfc();
    }
    public SetNfcResponse createSetNfcResponse()
    {
        return new SetNfcResponse();
    }
    public SetNfc createSetNfc()
    {
        return new SetNfc();
    }

    /**/
    
    
    
    public Choix createChoix()
    {
        return new Choix();
    }
    public GetChoix createGetChoix()
    {
        return new GetChoix();
    }
    public GetChoixResponse createGetChoixResponse()
    {
        return new GetChoixResponse();
    }
    /**/
    
   
    
    
    
    
    public Team createTeam()
    {
        return new Team();
    }
    public GetTeam createGetTeam()
    {
        return new GetTeam();
    }
    public GetTeamResponse createGetTeamResponse()
    {
        return new GetTeamResponse();
    }
    /**/
    public Objeteam createObjeteam()
    {
        return new Objeteam();
    }
    public GetObjeteam createGetObjeteam()
    {
        return new GetObjeteam();
    }
    public GetObjeteamResponse createGetObjeteamResponse()
    {
        return new GetObjeteamResponse();
    }

      
    /**/
    public Libelleniveau createLibelleniveau()
    {
        return new Libelleniveau();
    }
    public GetLibelleNiveaux createGetLibelleNiveaux()
    {
        return new GetLibelleNiveaux();
    }
    public GetLibelleNiveauxResponse createGetLibelleNiveauxResponse()
    {
        return new GetLibelleNiveauxResponse();
    }
  
    /**/
    public Hello createHello()
    {
        return new Hello();
    }

    public HelloResponse createHelloResponse()
    {
        return new HelloResponse();
    }

    public ClefTimestamp createClefTimestamp()
    {
        return new ClefTimestamp();
    }
    /**/
    public StatusPI createStatusPI()
    {
        return new StatusPI();
    }
    public ReponseStatusPI createReponseStatusPI()
    {
        return new ReponseStatusPI();
    }
    public SetStatusPIResponse createSetStatusPIResponse()
    {
        return new SetStatusPIResponse();
    }
    public SetStatusPI createSetStatusPI()
    {
        return new SetStatusPI();
    }
    
    /*************************************************************************************************************************/
      @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="hello")
   public JAXBElement<Hello> createHello(Hello value)
   {
     return new JAXBElement(_Hello_QNAME, Hello.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="helloResponse")
   public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value)
      {
        return new JAXBElement(_HelloResponse_QNAME,  HelloResponse.class, null, value);
      }
 
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="checkLogin")
   public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value)
   {
     return new JAXBElement(_CheckLogin_QNAME, CheckLogin.class,  null, value);
   }
   
  
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="checkLoginResponse")
   public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value)
   {
     return new JAXBElement(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
   }
   
   
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="checkNew")
   public JAXBElement<CheckNew> createCheckNew(CheckNew value)
   {
     return new JAXBElement(_CheckNew_QNAME, CheckNew.class,  null, value);
   }
   
  
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="checkNewResponse")
   public JAXBElement<CheckNewResponse> createCheckNewResponse(CheckNewResponse value)
   {
     return new JAXBElement(_CheckNewResponse_QNAME, CheckNewResponse.class, null, value);
   }
   
   /*************************************************************************************************************************/
  
   
   /*************************************************************************************************************************/
   
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="majdone")
   public JAXBElement<Majdone> createMajdone(Majdone value)
   {
     return new JAXBElement(_Majdone_QNAME, Majdone.class,  null, value);
   }
   
  
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="majdoneResponse")
   public JAXBElement<MajdoneResponse> createMajdoneResponse(MajdoneResponse value)
   {
     return new JAXBElement(_MajdoneResponse_QNAME, MajdoneResponse.class, null, value);
   }
   
   
   
   /*************************************************************************************************************************/
   
   
   /*************************************************************************************************************************/
    @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getNiveaux")
   public JAXBElement<GetNiveaux> createGetNiveaux(GetNiveaux value)
   {
     return new JAXBElement(_GetNiveaux_QNAME, GetNiveaux.class, null, value);
   }
 @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getNiveauxResponse")
   public JAXBElement<GetNiveauxResponse> createGetNiveauxResponse(GetNiveauxResponse value)
   {
     return new JAXBElement(_GetNiveauxResponse_QNAME,GetNiveauxResponse.class, null, value);
   }

 /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getChoix")
   public JAXBElement<GetChoix> createGetChoix(GetChoix value)
   {
     return new JAXBElement(_GetChoix_QNAME, GetChoix.class, null,value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getChoixResponse")
   public JAXBElement<GetChoixResponse> createGetChoixResponse(GetChoixResponse value)
   {
     return new JAXBElement(_GetChoixResponse_QNAME, GetChoixResponse.class, null, value);
   }
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getTeam")
   public JAXBElement<GetTeam> createGetTeam(GetTeam value)
   {
     return new JAXBElement(_GetTeam_QNAME, GetTeam.class, null,value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getTeamResponse")
   public JAXBElement<GetTeamResponse> createGetTeamResponse(GetTeamResponse value)
   {
     return new JAXBElement(_GetTeamResponse_QNAME,  GetTeamResponse.class, null, value);
   }
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getObjeteam")
   public JAXBElement<GetObjeteam> createGetObjeteam(GetObjeteam value)
   {
     return new JAXBElement(_GetObjeteam_QNAME, GetObjeteam.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getObjeteamResponse")
   public JAXBElement<GetObjeteamResponse> createGetObjeteamResponse(GetObjeteamResponse value)
   {
     return new JAXBElement(_GetObjeteamResponse_QNAME,  GetObjeteamResponse.class, null, value);
   }
   
  
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getUtilisateurs")
   public JAXBElement<GetUtilisateurs> createGetUtilisateurs(GetUtilisateurs value)
   {
     return new JAXBElement(_GetUtilisateurs_QNAME,  GetUtilisateurs.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getUtilisateursResponse")
   public JAXBElement<GetUtilisateursResponse> createGetUtilisateursResponse(GetUtilisateursResponse value)
   {
     return new JAXBElement( _GetUtilisateursResponse_QNAME, GetUtilisateursResponse.class, null, value);
   }
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getTypeReponsesResponse")
   public JAXBElement<GetTypeReponsesResponse> createGetTypeReponsesResponse(GetTypeReponsesResponse value)
   {
     return new JAXBElement( _GetTypeReponsesResponse_QNAME, GetTypeReponsesResponse.class,    null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getTypeReponses")
   public JAXBElement<GetTypeReponses> createGetTypeReponses(GetTypeReponses value)
   {
     return new JAXBElement(_GetTypeReponses_QNAME, GetTypeReponses.class, null, value);
   }
   
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getNiveauObjets")
   public JAXBElement<GetNiveauObjets> createGetNiveauObjets(GetNiveauObjets value)
   {
     return new JAXBElement(_GetNiveauObjets_QNAME, GetNiveauObjets.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getNiveauObjetsResponse")
   public JAXBElement<GetNiveauObjetsResponse> createGetNiveauObjetsResponse(GetNiveauObjetsResponse value)
   {
     return new JAXBElement(_GetNiveauObjetsResponse_QNAME, GetNiveauObjetsResponse.class,  null, value);
   }
 
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getLibelleNiveaux")
   public JAXBElement<GetLibelleNiveaux> createGetLibelleNiveaux(GetLibelleNiveaux value)
   {
    return new JAXBElement(_GetLibelleNiveaux_QNAME,  GetLibelleNiveaux.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getLibelleNiveauxResponse")
   public JAXBElement<GetLibelleNiveauxResponse> createGetLibelleNiveauxResponse(GetLibelleNiveauxResponse value)
   {
     return new JAXBElement( _GetLibelleNiveauxResponse_QNAME, GetLibelleNiveauxResponse.class, null, value);
   }
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getDatesModifications")
   public JAXBElement<GetDatesModifications> createGetDatesModifications(GetDatesModifications value)
   {
     return new JAXBElement(
       _GetDatesModifications_QNAME, GetDatesModifications.class,  null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="getDatesModificationsResponse")
   public JAXBElement<GetDatesModificationsResponse> createGetDatesModificationsResponse(GetDatesModificationsResponse value)
   {
     return new JAXBElement( _GetDatesModificationsResponse_QNAME, GetDatesModificationsResponse.class, null, value);
   }
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setInspections")
   public JAXBElement<SetInspections> createSetInspections(SetInspections value)
   {
     return new JAXBElement(_SetInspections_QNAME, SetInspections.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setInspectionsResponse")
   public JAXBElement<SetInspectionsResponse> createSetInspectionsResponse(SetInspectionsResponse value)
   {
    return new JAXBElement( _SetInspectionsResponse_QNAME, SetInspectionsResponse.class, null, value);
   }
   
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setCloture")
   public JAXBElement<SetCloture> createSetCloture(SetCloture value)
   {
     return new JAXBElement(_SetCloture_QNAME,  SetCloture.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setClotureResponse")
   public JAXBElement<SetClotureResponse> createSetClotureResponse(SetClotureResponse value)
   {
    return new JAXBElement(_SetClotureResponse_QNAME, SetClotureResponse.class, null, value);
   }
   
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setStatutInac")
   public JAXBElement<SetStatutInac> createSetStatutInac(SetStatutInac value)
   {
     return new JAXBElement(_SetStatutInac_QNAME, SetStatutInac.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setStatutInacResponse")
   public JAXBElement<SetStatutInacResponse> createSetStatutInacResponse(SetStatutInacResponse value)
   {
    return new JAXBElement(_SetStatutInacResponse_QNAME, SetStatutInacResponse.class, null, value);
   }
   
   
   /*************************************************************************************************************************/

   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setNfc")
   public JAXBElement<SetNfc> createSetNfc(SetNfc value)
   {
     return new JAXBElement(_SetNfc_QNAME, SetNfc.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setNfcResponse")
   public JAXBElement<SetNfcResponse> createSetNfcResponse(SetNfcResponse value)
   {
    return new JAXBElement(_SetNfcResponse_QNAME, SetNfcResponse.class, null, value);
       
   }
   
   /*************************************************************************************************************************/
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setStatusPI")
   public JAXBElement<SetStatusPI> createSetStatusPI(SetStatusPI value)
   {
     return new JAXBElement(_SetStatusPI_QNAME,  SetStatusPI.class, null, value);
   }
   @XmlElementDecl(namespace="http://inspectbox.itirion.com/", name="setStatusPIResponse")
   public JAXBElement<SetStatusPIResponse> createSetStatusPIResponse(SetStatusPIResponse value)
   {
    return new JAXBElement(_SetStatusPIResponse_QNAME, SetStatusPIResponse.class, null, value);
   }
  
   /*************************************************************************************************************************/
   
 }