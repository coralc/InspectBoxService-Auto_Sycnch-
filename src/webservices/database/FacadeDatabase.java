// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/09/2014 14:13:59
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FacadeDatabase.java

package webservices.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;


import webservices.services.*;
import webservices.utils.ConvertUtil;

public class FacadeDatabase 
{
	 public FacadeDatabase()
    {
        idClient = Integer.valueOf(0);
    }

    public FacadeDatabase(String CodeAcces2, String MotDePass2, String Version2)
    {
        idClient = Integer.valueOf(0);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectioncsv = DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connection3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectioninsp = DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectionobj= DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectiontypr= DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectionobjteam= DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectionniv= DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectionclt=DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectioninac= DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            connectionuser= DriverManager.getConnection("jdbc:mysql://localhost:3306/inspectboxsa", "root", "Lyonpartdieu69");
            
            resultSet = null;
            resultSet1 = null;
            resultSet2 = null;
            resultSetobjteam=null;
            resultSetniv=null;
            resultSetinac=null;
            resultSetuser = null;
            resultSetcl = null;
            preparedStatement = null;
            preparedStatementcsv = null;
            preparedStatementinsp=null;
            preparedStatementobjteam=null;
            preparedStatementcsvclt=null;
            preparedStatementniv = null;
            preparedStatementinac = null;
            preparedStatementobj = null;
            preparedStatementuser = null;
        }
        catch(Exception cnfe)
        {
            System.out.println((new StringBuilder("Error:")).append(cnfe.getMessage()).toString());
            cnfe.printStackTrace();
        }
        listClefTimestamp = new ArrayList();
        codeAcces = CodeAcces2;
        clefClient = MotDePass2;
        _verifierDroit();
    }

    public List getListClefTimestamp()
    {
        return listClefTimestamp;
    }

    private void _verifierDroit()
    {
        try
        {
            preparedStatement = connection.prepareStatement("SELECT idClient FROM client WHERE CodeAcces = ? AND ClefClient = ? AND Masque = ?");
            preparedStatement.setString(1, codeAcces);
            preparedStatement.setString(2, clefClient);
            preparedStatement.setInt(3, 0);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                idClient = Integer.valueOf(resultSet.getInt("idClient"));
        }
        catch(Exception cnfe)
        {
            System.out.println((new StringBuilder("Error droit:")).append(cnfe.getMessage()).toString());
            cnfe.printStackTrace();
        }
    }

    private Boolean _isClient()
    {
        if(idClient.intValue() != 0)
            return Boolean.valueOf(true);
        else
            return Boolean.valueOf(false);
    }

    public void setDateModifier(String nomTable)
    {
        if(!_isClient().booleanValue())
            return;
        try
        {
            preparedStatement = connection.prepareStatement((new StringBuilder("SELECT ClefTimestamp FROM ")).append(nomTable).append(" ORDER BY ClefTimestamp DESC LIMIT 0,1").toString());
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                ClefTimestamp cts = new ClefTimestamp();
                cts.setNomTable(nomTable);
                cts.setTimestamp(resultSet.getString("ClefTimestamp"));
                listClefTimestamp.add(cts);
            }
        }
        catch(Exception cnfe)
        {
            System.out.println((new StringBuilder("Error datemodif:")).append(cnfe.getMessage()).toString());
            cnfe.printStackTrace();
        }
    }

    public List getChoix()
    {
        List listChoix = new ArrayList();
        if(_isClient().booleanValue())
        {
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM choix WHERE idClient = ? AND masque = ?");
                preparedStatement.setInt(1, idClient.intValue());
                preparedStatement.setInt(2, 0);
                Choix choix;
                for(resultSet = preparedStatement.executeQuery(); resultSet.next(); listChoix.add(choix))
                {
                    choix = new Choix();
                    choix.setIdChoix(resultSet.getInt("idChoix"));
                    choix.setIdTypereponse(resultSet.getInt("idTypereponse"));
                    choix.setTri(resultSet.getInt("tri"));
                    choix.setValeur(resultSet.getString("valeur"));
                    choix.setNonConforme(resultSet.getBoolean("nonConforme"));
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error choix:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
            close();
        }
        return listChoix;
    }

   

    
    public List getTeam()
    {
        List listTeam = new ArrayList();
        
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM team  WHERE idclient = ?  AND masque = ? ");
                preparedStatement.setInt(1, idClient.intValue());
                preparedStatement.setInt(2, 0);
                Team	team;
                for(resultSet = preparedStatement.executeQuery(); resultSet.next(); listTeam.add(team))
                {
                	team = new Team();
                	team.setIdteam(resultSet.getInt("idteam"));
                	team.setBeginHour(resultSet.getString("beginHour"));
                	team.setEndHour(resultSet.getString("endHour"));
                	team.setDayOfWork(resultSet.getString("dayOfWork"));
                	team.setIdUser(resultSet.getInt("iduser"));
                    
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error get team:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listTeam;
    }
    
    public List getObjeteam()
    {
        List listTeamobj = new ArrayList();
        
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? ");
                preparedStatement.setInt(1, idClient.intValue());
                preparedStatement.setInt(2, 0);
                Objeteam	objteam;
                for(resultSet = preparedStatement.executeQuery(); resultSet.next(); listTeamobj.add(objteam))
                {
                	objteam = new Objeteam();
                	objteam.setIdTeam(resultSet.getInt("idTeam"));
                	objteam.setIdField(resultSet.getInt("idField"));
                	objteam.setIdObjet(resultSet.getInt("idObjet"));
                	objteam.setLun(resultSet.getBoolean("lun"));
                	objteam.setMar(resultSet.getBoolean("mar"));
                	objteam.setMer(resultSet.getBoolean("mer"));
                	objteam.setJeu(resultSet.getBoolean("jeu"));
                	objteam.setVen(resultSet.getBoolean("ven"));
                	objteam.setSam(resultSet.getBoolean("sam"));
                	objteam.setDim(resultSet.getBoolean("dim"));
                	
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error get objetteam:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listTeamobj;
    }

    public List getNiveaux()
    {
        List listNiveaux = new ArrayList();
        if(_isClient().booleanValue())
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM niveau WHERE idClient = ? order by idNiveau");
                preparedStatement.setInt(1, idClient.intValue());
                resultSet = preparedStatement.executeQuery();
                List listeMasque = new ArrayList();
                while(resultSet.next()) 
                    if(!resultSet.getBoolean("masque"))
                    {
                        if(!listeMasque.contains(Integer.valueOf(resultSet.getInt("idNiveauParent"))))
                        {
                            Niveau niveau = new Niveau();
                            niveau.setIdNiveau(resultSet.getInt("idNiveau"));
                            niveau.setIdNiveauobjet(resultSet.getInt("idNiveauobjet"));
                            niveau.setIdNiveauParent(resultSet.getInt("idNiveauParent"));
                            niveau.setIdTypereponse(resultSet.getInt("idTypereponse"));
                            niveau.setTri(resultSet.getInt("tri"));
                            niveau.setLibelle(resultSet.getString("libelle"));
                            niveau.setCodeBarre(resultSet.getString("codeBarre"));
                            niveau.setAreaTag(resultSet.getString("areaTag"));
                            niveau.setLevel(resultSet.getInt("level"));
                            listNiveaux.add(niveau);
                        } else
                        {
                            listeMasque.add(Integer.valueOf(resultSet.getInt("idNiveau")));
                        }
                    } else
                    {
                        listeMasque.add(Integer.valueOf(resultSet.getInt("idNiveau")));
                    }
            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error niveau:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listNiveaux;
    }

    public List getUtilisateurs()
    {
        List listUtilisateurs = new ArrayList();
        if(_isClient().booleanValue())
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM utilisateur U, droitutilisateur DU  WHERE idClient = ? AND masque = ? AND U.IdDroitUtilisateur = DU.IdDroitUtilisateur AND terminal = ? ");
                preparedStatement.setInt(1, idClient.intValue());
                preparedStatement.setInt(2, 0);
                preparedStatement.setInt(3, 1);
                
                Utilisateur utilisateur;
                for(resultSet = preparedStatement.executeQuery(); resultSet.next(); listUtilisateurs.add(utilisateur))
                {
                    utilisateur = new Utilisateur();
                    utilisateur.setIdUtilisateur(resultSet.getInt("idUtilisateur"));
                    utilisateur.setCodeAcces(resultSet.getString("codeAcces"));
                    utilisateur.setMotDePasse(resultSet.getString("motDePasse"));
                    utilisateur.setPrenom(resultSet.getString("prenom"));
                    utilisateur.setNom(resultSet.getString("nom"));
                    utilisateur.setTypeUser(resultSet.getString("typeUser"));
                    resultSet.getString("clefTimestamp");
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error user:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listUtilisateurs;
    }

    public List getNiveauobjets()
    {
        List listNiveauobjets = new ArrayList();
        if(_isClient().booleanValue())
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM niveauobjet WHERE idClient = ? order by idNiveauobjet");
                preparedStatement.setInt(1, idClient.intValue());
                resultSet = preparedStatement.executeQuery();
                List listeMasque = new ArrayList();
                while(resultSet.next()) 
                    if(!resultSet.getBoolean("masque"))
                    {
                        if(!listeMasque.contains(Integer.valueOf(resultSet.getInt("idNiveauObjetParent"))))
                        {
                            Niveauobjet niveauObjet = new Niveauobjet();
                            niveauObjet.setIdNiveauobjet(resultSet.getInt("idNiveauobjet"));
                            niveauObjet.setIdNiveauObjetParent(resultSet.getInt("idNiveauObjetParent"));
                            niveauObjet.setIdTypereponse(resultSet.getInt("idTypereponse"));
                            niveauObjet.setTri(resultSet.getInt("tri"));
                            niveauObjet.setLibelle(resultSet.getString("libelle"));
                            niveauObjet.setCodeBarre(resultSet.getString("codeBarre"));
                            niveauObjet.setUnitmeasure(resultSet.getString("unitmeasure"));
                            niveauObjet.setHighborder(resultSet.getDouble("highborder"));
                            niveauObjet.setLowborder(resultSet.getDouble("lowborder"));
                            niveauObjet.setLowlimit(resultSet.getDouble("lowlimit"));
                            niveauObjet.setHighlimit(resultSet.getDouble("highlimit"));
                            niveauObjet.setLowborderalert(resultSet.getString("lowborderalert"));
                            niveauObjet.setHighborderalert(resultSet.getString("highborderalert"));
                            listNiveauobjets.add(niveauObjet);
                        } else
                        {
                            listeMasque.add(Integer.valueOf(resultSet.getInt("idNiveauObjet")));
                        }
                    } else
                    {
                        listeMasque.add(Integer.valueOf(resultSet.getInt("idNiveauObjet")));
                    }
            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error niveauobjet:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listNiveauobjets;
    }

    public List getTypereponses()
    {
        List listTypereponses = new ArrayList();
        if(_isClient().booleanValue())
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM typereponse WHERE idClient = ? AND masque = ?");
                preparedStatement.setInt(1, idClient.intValue());
                preparedStatement.setInt(2, 0);
                Typereponse typeReponse;
                for(resultSet = preparedStatement.executeQuery(); resultSet.next(); listTypereponses.add(typeReponse))
                {
                    typeReponse = new Typereponse();
                    typeReponse.setIdTypeReponse(resultSet.getInt("idTypeReponse"));
                    typeReponse.setLibelle(resultSet.getString("libelle"));
                    typeReponse.setModeReponse(resultSet.getString("modeReponse"));
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error type rep:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listTypereponses;
    }

    public List getLibelleniveaux()
    {
        List listLibelleniveaux = new ArrayList();
        if(_isClient().booleanValue())
            try
            {
                preparedStatement = connection.prepareStatement("SELECT * FROM libelleniveau WHERE idClient = ?");
                preparedStatement.setInt(1, idClient.intValue());
                Libelleniveau libelleNiveau;
                for(resultSet = preparedStatement.executeQuery(); resultSet.next(); listLibelleniveaux.add(libelleNiveau))
                {
                    libelleNiveau = new Libelleniveau();
                    libelleNiveau.setIdLibelleNiveau(resultSet.getInt("idLibelleNiveau"));
                    libelleNiveau.setTypeNiveau(resultSet.getInt("typeNiveau"));
                    libelleNiveau.setNum(resultSet.getInt("num"));
                    libelleNiveau.setLibelle(resultSet.getString("libelle"));
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error libelle:")).append(cnfe.getMessage()).toString());
                cnfe.printStackTrace();
            }
        close();
        return listLibelleniveaux;
    }

    public Boolean checkLogin()
    {
        return _isClient();
    }
    
    public Boolean checkNew( String idTerminal)
    {System.out.println(" service 1"+idTerminal+"clt"+idClient);
    
    	Boolean rt=false;
    	try {       
    		 this.preparedStatement = connection.prepareStatement("SELECT etat FROM synch WHERE idClient = ? AND idTerminal = ? ");
    	this.preparedStatement.setInt(1, this.idClient.intValue());
    	this.preparedStatement.setString(2, idTerminal);
        resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
        {
        	System.out.println(" service resultSetSynch"+resultSet.getInt("etat"));
				if (resultSet.getInt("etat")==1)
					rt= Boolean.valueOf(true);
				else
					rt= Boolean.valueOf(false);
			
            
        }
    	}
        catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		System.out.println(" service rt final"+rt);
    		return  rt;
    	}
        
    }
    public List<ReponseStatusPI> setStatusPI(String idTerminal,  List<StatusPI> statusPI)
    {
    	 List listeReponseStatusPI= new ArrayList();
    	 
    	 try {
    		 
    	      Iterator itStatus = statusPI.iterator();
              while (itStatus.hasNext()) {
            	  StatusPI spi = (StatusPI)itStatus.next();
                ReponseStatusPI reponseStatusPI = new ReponseStatusPI();
                
                reponseStatusPI.setIdTag(spi.getIdTag());
                reponseStatusPI.setCodeErreur(0);
                reponseStatusPI.setCommentaire("Erreur table statuspi");
                listeReponseStatusPI.add(reponseStatusPI);
                  
                  Integer idClientSQL = this.idClient;
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                  String areaTagSQL = ConvertUtil.string(spi.getAreaTag());
                   String nomTagSQL = ConvertUtil.string(spi.getTagName());
                   String descriptionTagSQL = ConvertUtil.string(spi.getTagDescription());
                   String unitTagSQL = ConvertUtil.string(spi.getTagUnit());
                   Integer statusSQL = Integer.valueOf(spi.getStatus());
                   String valueSQL = ConvertUtil.string(spi.getValue());
                   String lowLimitSQL = ConvertUtil.string(spi.getLowLimit());
                   String highLimitSQL = ConvertUtil.string(spi.getHighLimit());
                   String lowBorderSQL = ConvertUtil.string(spi.getLowBorder());
                   String highBorderSQL = ConvertUtil.string(spi.getHighBorder());
                  // String timeSQL = sdf.format(spi.getTimestamp());
                   System.out.println("timeSQL"+spi.getTimestamp());
                   String timeSQL = ConvertUtil.string(spi.getTimestamp());
                   Date curDate = new Date();
                   String timeSendSQL = ConvertUtil.string(sdf.format(curDate));
                  
                   String idTerminalSQL = ConvertUtil.string(idTerminal);
                   String clientnameSQL = ConvertUtil.string(spi.getClientName());
                  Statement sta = this.connection.createStatement();
                  System.out.println("timeSQL"+timeSQL+"*****"+timeSendSQL);
 String strSQL = (new StringBuilder("INSERT INTO statuspi(IdClient, AreaTag, TagName, tagDescription, tagUnit, Value,Status,lowLimit,highLimit," +
 		"lowBorder,highBorder, idTerminal, sendTime, clientName,Timestamp)VALUES ("))
                .append(idClientSQL).append(",").append(areaTagSQL).append(",").append(nomTagSQL).append(",").append(descriptionTagSQL).append(",").append(unitTagSQL).append(",").append(valueSQL).append(",")
                .append(statusSQL).append(",").append(lowLimitSQL).append(",").append(highLimitSQL).append(",").append(lowBorderSQL).append(",").append(highBorderSQL).append(",")
                .append(idTerminalSQL).append(",").append(timeSendSQL).append(",").append(clientnameSQL).append(",").append(timeSQL).append(")").toString();
                  
                  sta.executeUpdate(strSQL);
                  
                }
    	 }
    	 catch (Exception cnfe)
         {
           
           
           cnfe.printStackTrace();
         }
    	 return listeReponseStatusPI;
    	
    }
    public Boolean majdone(String idTerminal)
    {	Boolean rt=false;
    	
    	String idTerminalSQL = ConvertUtil.string(idTerminal);
    	Statement sta;
		try {
			sta = connection.createStatement();
			 String strSQL = (new StringBuilder("UPDATE synch SET etat =0 WHERE idClient="))
		      		  .append(idClient).append(" and idTerminal= ").append(idTerminalSQL).append("").toString();
		     System.out.println("strSQL"+strSQL);  
		       int i =sta.executeUpdate(strSQL);
		       if (i > 0) rt=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	
    	return rt;
    }
    public List<ReponseCloture> setCloture(String idTerminal,  List<Cloture> cloture)
    {
    	 
    	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Boolean.valueOf(false);
      List listeReponseCloture= new ArrayList();
      
      if (_isClient().booleanValue()) {
        Boolean.valueOf(true);
        try {
          this.preparedStatement = this.connection.prepareStatement("SELECT idNiveau FROM cloture WHERE idClient = ? AND idTerminal = ?");
          this.preparedStatement.setInt(1, this.idClient.intValue());
         this.preparedStatement.setString(2, idTerminal);
          this.resultSet = this.preparedStatement.executeQuery();
  
          List listeIdInformation = new ArrayList();
          while (this.resultSet.next()) {
            listeIdInformation.add(this.resultSet.getString("idNiveau"));
          }
  
                   Iterator itCloture = cloture.iterator();
          while (itCloture.hasNext()) {
            Cloture clot = (Cloture)itCloture.next();
            ReponseCloture reponseCloture = new ReponseCloture();
            reponseCloture.setIdNiveau(clot.getIdNiveau());
            reponseCloture.setCodeErreur(0);
            reponseCloture.setCommentaire("");
            listeReponseCloture.add(reponseCloture);
              
              Integer idClientSQL = this.idClient;
              
              Integer idNiveauSQL = Integer.valueOf(clot.getIdNiveau() );
              System.out.println("clot."+clot.getDateCloture()+"***"+clot.getDebDateCloture());
               String dateClotureSQL = ConvertUtil.string(clot.getDateCloture()) ;
               String debdateClotureSQL = ConvertUtil.string(clot.getDebDateCloture()) ;
               Integer statutClotureSQL = Integer.valueOf(clot.getStatutCloture() );
               Integer userClotureSQL = Integer.valueOf(clot.getUserCloture() );
               Integer dayClotureSQL = Integer.valueOf(clot.getDayCloture() );
               String idTerminalSQL = ConvertUtil.string(idTerminal);
              Statement sta = this.connection.createStatement();
  
              String strSQL = (new StringBuilder("INSERT INTO cloture(IdClient, idNiveau, dateCloture,debDateCloture, idTerminal,statutCloture ,dayCloture,userCloture)VALUES ("))
            		  .append(idClientSQL).append(",").append(idNiveauSQL).append(",").append(dateClotureSQL).append(",").append(debdateClotureSQL).append(",").append(idTerminalSQL).append(",").append(statutClotureSQL).append(",").append(dayClotureSQL).append(",").append(userClotureSQL).append(")").toString();
              
             sta.executeUpdate(strSQL);
             _creerCSV2(clot,idTerminal);
             listeIdInformation.add(clot.getIdNiveau());
            }
        
          }
        
        catch (Exception cnfe)
        {
          System.out.println("Error:" + cnfe.getMessage());
          Boolean.valueOf(false);
          cnfe.printStackTrace();
        }
      }
  
     close();
  // generer le csv
     
     
      return listeReponseCloture;
    }
   
   public List<ReponseStatutInac> setStatutInac(String idTerminal,  List<StatutInac> statutInacs)
   {
   	 
   	
     Boolean.valueOf(false);
     List listeReponseStatutInac= new ArrayList();
     
     if (_isClient().booleanValue()) {
       Boolean.valueOf(true);
       try {
        
 
                  Iterator itstatutInacs = statutInacs.iterator();
         while (itstatutInacs.hasNext()) {
        	 StatutInac clot = (StatutInac)itstatutInacs.next();
           ReponseStatutInac reponseCloture = new ReponseStatutInac();
           reponseCloture.setIdNiveau(clot.getIdNiveau());
           reponseCloture.setCodeErreur(0);
           reponseCloture.setCommentaire("");
           listeReponseStatutInac.add(reponseCloture);
             
             Integer idClientSQL = this.idClient;
             
             Integer idNiveauSQL = Integer.valueOf(clot.getIdNiveau() );
             
              String dateinaccSQL = ConvertUtil.string(clot.getDateinacc());
               Boolean statutClotureSQL = clot.getStatutValue();
              Integer objetSQL = Integer.valueOf(clot.getObjet() );
              String idTerminalSQL = ConvertUtil.string(idTerminal);
             Statement sta = this.connection.createStatement();
 
             String strSQL = (new StringBuilder("INSERT INTO statutInac(IdClient, idNiveau, dateinacc, idTerminal,StatutValue ,objet)VALUES ("))
           		  .append(idClientSQL).append(",").append(idNiveauSQL).append(",").append(dateinaccSQL).append(",").append(idTerminalSQL).append(",").append(statutClotureSQL).append(",").append(objetSQL).append(")").toString();
             
            sta.executeUpdate(strSQL);
            
            
           }
       
         }
       
       catch (Exception cnfe)
       {
         System.out.println("Error:" + cnfe.getMessage());
         Boolean.valueOf(false);
         cnfe.printStackTrace();
       }
     }
 
    close();
 
    
    
     return listeReponseStatutInac;
   }
    public List setNfc(String idTerminal, List nfcs)
    {
    	 List listeReponseNfc= new ArrayList();
    	 
    	 try {
    	 Iterator itNfc = nfcs.iterator();
         
    	 while (itNfc.hasNext())
    	 {
    		 Nfc nfc = (Nfc)itNfc.next();
    		 ReponseNfc reponseNfc = new ReponseNfc();
             reponseNfc.setIdNiveau(nfc.getIdNiveau());
             reponseNfc.setCodeErreur(0);
             reponseNfc.setCommentaire("");
             listeReponseNfc.add(reponseNfc);
             System.out.println("nfc item"+nfc.getIdNiveau()+nfc.getNfcTag());
             String barreSQL;
             Integer idNiveauSQL;
             Integer idNiveauObjet=0;
             if (nfc.getNfcTag()!=null)
             {
            	 barreSQL = ConvertUtil.string(nfc.getNfcTag() );
                  idNiveauSQL = Integer.valueOf(nfc.getIdNiveau() ); 
             }
             else
             {
            	barreSQL = null;
                  idNiveauSQL = Integer.valueOf(nfc.getIdNiveau() );
             }
             Statement sta = connection.createStatement();
        	 String strSQL = (new StringBuilder("UPDATE niveau SET codeBarre ="))
           		  .append( barreSQL).append("  WHERE idNiveau=").append(idNiveauSQL).append("").toString();
            
            sta.executeUpdate(strSQL);
            
            // chercher l objet
            preparedStatement = connection.prepareStatement("SELECT idNiveauobjet FROM niveau WHERE idNiveau = ? AND Masque = ?");
            preparedStatement.setInt(1, nfc.getIdNiveau());
            preparedStatement.setInt(2, 0);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
           	 idNiveauObjet = Integer.valueOf(resultSet.getInt("idNiveauobjet"));
            System.out.println("idNiveauObjet"+idNiveauObjet);
            // save objet
            Statement stao = connection.createStatement();
       	 String strSQLo = (new StringBuilder("UPDATE niveauobjet SET CodeBarre ="))
          		  .append(barreSQL).append("  WHERE idNiveauobjet=").append(idNiveauObjet).append("").toString();
       	
           stao.executeUpdate(strSQLo);
             
    		 
    		 
    		 
    	 }	//fin while
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
                 
    			 
    		 
         }
    	 
    	 close();
    	 return listeReponseNfc;
    	
    }
    public List setInspections(String idTerminal, Integer idUtilisateur, List inspection)
    {
    	
         
       Boolean.valueOf(false);
        List listeReponseInspection = new ArrayList();
        
        if(_isClient().booleanValue())
        {
        	
            Boolean.valueOf(true);
            try
            {
            	
                preparedStatement = connection.prepareStatement("SELECT idInformation FROM inspection WHERE idClient = ? AND idTerminal = ?");
                preparedStatement.setInt(1, idClient.intValue());
                preparedStatement.setString(2, idTerminal);
                resultSet = preparedStatement.executeQuery();
                
                List listeIdInformation = new ArrayList();
                for(; resultSet.next(); listeIdInformation.add(resultSet.getString("idInformation")));
                PreparedStatement preparedStatement3 = connection.prepareStatement("SELECT DATE_FORMAT(DateInformation, '%Y-%m-%d') AS DateInfoForm, IdNiveau, IdNiveauObjet FROM inspection WHERE idClient = ?");
                
                preparedStatement3.setInt(1, idClient.intValue());
                ResultSet resultSet3 = preparedStatement3.executeQuery();
                List listeClefDateObjetNiveau = new ArrayList();
                for(; resultSet3.next(); listeClefDateObjetNiveau.add((new StringBuilder(String.valueOf(resultSet3.getString("DateInfoForm")))).append("_").append(resultSet3.getString("IdNiveau")).append("_").append(resultSet3.getString("IdNiveauObjet")).toString()));
                
                for(Iterator itInspection = inspection.iterator(); itInspection.hasNext();)
                {
                    Inspection inspect = (Inspection)itInspection.next();
                    this.listInspections.add(inspect);
                    String dateVerifTmp = inspect.getDateInformation();
                    String dateVerifTab[] = dateVerifTmp.split(" ");
                   // String clefDateObjetNiveau = (new StringBuilder(String.valueOf(dateVerifTab[0]))).append("_").append(inspect.getIdNiveau()).append("_").append(inspect.getIdNiveauObjet()).toString();
                   // System.out.println(clefDateObjetNiveau);
                   /* if(listeClefDateObjetNiveau.contains(clefDateObjetNiveau))
                    { 
                        ReponseInspection reponseInspection = new ReponseInspection();
                        reponseInspection.setIdInformation(inspect.getIdInformation());
                       // System.out.println((new StringBuilder("***inspect.getIdInformation()")).append(inspect.getIdInformation()).toString());
                        reponseInspection.setCodeErreur(1);
                        reponseInspection.setCommentaire("\311l\351ment d\351j\340 inspect\351 aujourd'hui");
                        listeReponseInspection.add(reponseInspection);
                        //System.out.println("***step6");
                    } else
                    {*/
                    	
                        Boolean.valueOf(true);
                        Integer.valueOf(0);
                        
                        //System.out.println((new StringBuilder("***step10.0")).append(photoCorrect.booleanValue()).toString());
                        
                          //  System.out.println("***step10");
                            ReponseInspection reponseInspection = new ReponseInspection();
                            reponseInspection.setIdInformation(inspect.getIdInformation());
                            reponseInspection.setCodeErreur(0);
                            reponseInspection.setCommentaire("");
                            listeReponseInspection.add(reponseInspection);
                            if(!listeIdInformation.contains(inspect.getIdInformation()))
                            {
                                //System.out.println((new StringBuilder("***step11")).append(inspect.getIdInformation()).toString());
                                Integer idClientSQL = idClient;
                                Integer idUtilisateurSQL = idUtilisateur;
                                Integer idNiveauSQL = Integer.valueOf(inspect.getIdNiveau());
                                //System.out.println((new StringBuilder("***step12")).append(inspect.getIdNiveau()).toString());
                                Integer idNiveauObjetSQL = ConvertUtil.integer(Integer.valueOf(inspect.getIdNiveauObjet()));
                                //System.out.println((new StringBuilder("***step12")).append(inspect.getIdNiveauObjet()).toString());
                                String idTerminalSQL = ConvertUtil.string(idTerminal);
                                String idInformationSQL = ConvertUtil.string(inspect.getIdInformation());
                                String dateInformationSQL = ConvertUtil.string(inspect.getDateInformation());
                                String dateRemiseSQL = "NOW()";
                                Integer idChoixSQL = ConvertUtil.integer(Integer.valueOf(inspect.getIdChoix()));
                                //System.out.println((new StringBuilder("***step12")).append(inspect.getIdChoix()).toString());
                                String reponseSQL = ConvertUtil.string(inspect.getReponse());
                                
                                boolean defectSQL=inspect.getDefekt();
                                boolean limiteSQL=false;
                                if (inspect.getLimite()!=null)
                                limiteSQL=inspect.getLimite();
                               
                                	
                                //System.out.println("***step after tof****");
                               
                               
                                Statement sta = connection.createStatement();
                                String strSQL = (new StringBuilder("INSERT INTO inspection(IdClient, IdUtilisateur, IdNiveau, IdNiveauObjet, IdTerminal, IdInformation, DateInformation, DateRemise, IdChoix,Reponse,limite, defekt)VALUES ("))
                                .append(idClientSQL).append(",").append(idUtilisateurSQL).append(",").append(idNiveauSQL).append(",").append(idNiveauObjetSQL).append(",").append(idTerminalSQL).append(",").append(idInformationSQL).append(",").append(dateInformationSQL).append(",").append(dateRemiseSQL).append(",").append(idChoixSQL).append(",").append(reponseSQL).append(",").append(limiteSQL).append(",").append(defectSQL)
                                .append(")").toString();
                                sta.executeUpdate(strSQL);
                                listeIdInformation.add(inspect.getIdInformation());
                                
                           // }
                        
                    }
                }

            }
            catch(Exception cnfe)
            {
                System.out.println((new StringBuilder("Error inspection insert :")).append(cnfe.getMessage()).toString());
                Boolean.valueOf(false);
                cnfe.printStackTrace();
            }
        }
        close();
        return listeReponseInspection;
    }




    public void close()
    {
        try
        {
            connection.close();
            preparedStatement.close();
            resultSet.close();
            
            
            
            
        }
        catch(Exception cnfe)
        {
            System.out.println((new StringBuilder("Error:")).append(cnfe.getMessage()).toString());
            cnfe.printStackTrace();
        }
    }

    private Connection connection;
    private Connection connection1;
    private Connection connection3;
    private Connection connectioninsp;
    private Connection connectioncsv;
    private Connection connectionobj;
    private Connection connectionnv;
    private Connection connectionobjteam;
    private Connection connectiontypr;
    private Connection connectionniv;
    private Connection connectioninac;
    private Connection connectionuser;
    private Connection connectionclt;
    private Connection connectionSych;
    private ResultSet resultSet;
    private ResultSet resultSet1;
    private ResultSet resultSet2;
    private ResultSet resultSetobjteam;
    private ResultSet resultSetniv;
    private ResultSet resultSetinac;
    private ResultSet resultSetuser;
    private ResultSet resultSetcl;
    private ResultSet resultSetSynch;
    private PreparedStatement preparedStatement;
    private PreparedStatement preparedStatementinsp;
    private PreparedStatement preparedStatementcsv;
    private PreparedStatement preparedStatementcsvclt;
    private PreparedStatement preparedStatementobjteam;
    private PreparedStatement preparedStatementniv;
    private PreparedStatement preparedStatementinac;
    private PreparedStatement preparedStatementobj;
    private PreparedStatement preparedStatementniveq;
    private PreparedStatement preparedStatementuser;

    private List listClefTimestamp;
    private String codeAcces;
    private String clefClient;
    private Integer idClient;
    private StringBuffer inspectionCSVtext;
    private StringBuffer inspectionCSVtext2;
    private List <Inspection> listInspections  =new ArrayList();;
    
    private void _creerCSV2(Cloture clot,String idTerminal) throws SQLException, IOException
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String nomcsv="PDADATA";	
		Date currentdate = new Date(); 
		int countact=0;
		int status=0;
		 Double lowlimit=0.0;
		 Double highlimit=0.0;
		 Double lowBorder=0.0;
		 Double hightBorder=0.0;
		 String lowBorderAlert="";
		 String hightBorderAlert="";
		 String dateinsp=" ";
		 String dateremise=" ";
		int totinsp=0;
		
		System.out.println("idClient.intValue()"+idClient.intValue());
		try {
			
			
			
			preparedStatementcsv= connectioncsv.prepareStatement("SELECT * FROM csvcount  WHERE idClient = ? ");
		 
			preparedStatementcsv.setInt(1, idClient.intValue());
			
			resultSet2 = preparedStatementcsv.executeQuery();
			
  		 
			if (!resultSet2.next())
			{
				countact=01;
				String datetitle=dateFormat.format(currentdate);
				
				datetitle=datetitle.replaceAll("-", "");
				datetitle = datetitle.replaceAll("_", "");
				datetitle = datetitle.replaceAll(":", "");
				nomcsv+=countact+"."+datetitle+"_"+idClient.intValue()+".csv";
				java.io.File fichier = new java.io.File("/usr/share/tomcat/"+nomcsv); 
				
				fichier.createNewFile();
				fichier.setWritable(true);
				
				
				
				Statement sta = connection3.createStatement();
				 String strSQL = (new StringBuilder("INSERT INTO csvcount(IdClient, count)VALUES ("))
	            		  .append(idClient.intValue()).append(",").append(countact).append(")").toString();
				 sta.executeUpdate(strSQL);
			}
			else
			{
				
					if (resultSet2.getInt("count")==99)
					{
						countact=01;
						deleteFile(idClient.intValue());
						
					}
						
					else
						{countact=resultSet2.getInt("count")+1;}
				
					String ClefTimestampSQL = "NOW()";
					String datetitle=dateFormat.format(currentdate);
					datetitle=datetitle.replaceAll("-", "");
					datetitle = datetitle.replaceAll("_", "");
					datetitle = datetitle.replaceAll(":", "");
					nomcsv+=countact+"."+datetitle+"_"+idClient.intValue()+".csv";
					java.io.File fichier = new java.io.File("/usr/share/tomcat/"+nomcsv); 
					fichier.createNewFile();
					fichier.setWritable(true);
					Statement sta = connection3.createStatement();
					 String strSQL = (new StringBuilder("UPDATE csvcount SET count ="))
							 .append( countact).append(", ").append("ClefTimestamp =").append(ClefTimestampSQL).append("  WHERE idClient=").append(idClient.intValue()).append("").toString();
			       sta.executeUpdate(strSQL);
			    }
			
			// ecriture du csv 
			String typuser="S";
			String userName=" ";
		    String sautLigne = "\n";
		    String separateur = ";";
		     String separateurMot = "\"";
		     this.inspectionCSVtext = new StringBuffer();
		     
		     StringBuffer sbQuery = new StringBuffer();	
			  sbQuery.append(" AND dateInformation  <= '" + clot.getDebDateCloture() + "' ");
			  sbQuery.append(" AND dateInformation  >= '" + clot.getDateCloture() + "' ");
			  System.out.println("clot.getDebDateCloture(>)"+clot.getDebDateCloture());
			  System.out.println(" clot.getDateCloture()<"+ clot.getDateCloture());
			  StringBuffer sbQueryinac = new StringBuffer();	
			  sbQueryinac.append(" AND dateinacc  <= '" + clot.getDebDateCloture() + "' ");
			  sbQueryinac.append(" AND dateinacc  >= '" + clot.getDateCloture() + "' ");
			  // cherche rnom client
			 
			  preparedStatementuser = connectionuser.prepareStatement("SELECT * FROM utilisateur  WHERE idClient = ? AND masque = ? AND idUtilisateur = ? ");
			  preparedStatementuser.setInt(1, idClient.intValue());
			  preparedStatementuser.setInt(2, 0);
			  preparedStatementuser.setInt(3, clot.getUserCloture());
			  resultSetuser = preparedStatementuser.executeQuery();
			  if (resultSetuser.next())
				  {
				  typuser=resultSetuser.getString("typeUser");
				  userName=resultSetuser.getString("codeAcces");
				  }
			  // le cas de utilisateur simple
			  if (typuser.equals("S"))
			  {System.out.println("step 1");
				  preparedStatementniv= connectionniv.prepareStatement("SELECT * FROM niveau WHERE idclient = ? AND masque = ? AND idNiveauParent IN ( SELECT idNiveau FROM niveau WHERE idNiveauParent = ? ) ");
				     preparedStatementniv.setInt(1, idClient.intValue());
				     preparedStatementniv.setInt(2, 0);
				     preparedStatementniv.setInt(3, clot.getIdNiveau());
				    
						resultSetniv = preparedStatementniv.executeQuery();
						 while(resultSetniv.next()) 
				         {
							 
							 this.inspectionCSVtext.append(separateurMot + resultSetniv.getString("libelle") + separateurMot + separateur);
							// chercher l objet
							 preparedStatementobj= connectionobj.prepareStatement("SELECT * FROM niveauobjet WHERE idClient = ? AND idNiveauobjet = ? AND masque = ?  ");
					    	   preparedStatementobj.setInt(1, idClient.intValue());
					    	   preparedStatementobj.setInt(2, resultSetniv.getInt("idNiveauobjet"));
					    	   preparedStatementobj.setInt(3, 0);
				           	ResultSet resultSet3 = preparedStatementobj.executeQuery();
				           	while (resultSet3.next())
				           		
				           	{System.out.println("step 2");
				           		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("libelle") + separateurMot + separateur);
					           	if (resultSet3.getString("unitmeasure")!=null)
					           	this.inspectionCSVtext.append(separateurMot + resultSet3.getString("unitmeasure") + separateurMot + separateur);
					           	else
					           		this.inspectionCSVtext.append(separateurMot + " " + separateurMot + separateur);
					           	
					          lowlimit=resultSet3.getDouble("lowlimit");
					   		  highlimit=resultSet3.getDouble("highlimit");
					   		  lowBorder=resultSet3.getDouble("lowborder");
					   		  hightBorder=resultSet3.getDouble("highborder");
					   		  lowBorderAlert=resultSet3.getString("lowborderalert");
					   		  hightBorderAlert=resultSet3.getString("highborderalert");
				           	}
				           	
				   		  
				   		  // chercher l inspection pour cet objet
				   		 System.out.println("step 3cherch inspe");
				   	preparedStatementinsp = connectioninsp.prepareStatement("SELECT * FROM inspection  WHERE idClient = ?  AND idNiveauObjet= ? "+sbQuery);
				    preparedStatementinsp.setInt(1, idClient.intValue());
					preparedStatementinsp.setInt(2, resultSetniv.getInt("idNiveauobjet"));
					resultSet1 = preparedStatementinsp.executeQuery();
				      		 if(resultSet1.next()) 
				      			 {System.out.println("resultSet1"+resultSet1.getString("idInformation"));	
				      			 
				      			 // la valeur
				      			if (resultSet1.getString("reponse")!=null)
				      				this.inspectionCSVtext.append(separateurMot + resultSet1.getString("reponse") + separateurMot + separateur);
				      			else
				      				this.inspectionCSVtext.append(separateurMot + " " + separateurMot + separateur);
			      				// le statut
				      			 
				      			if (resultSet1.getBoolean("defekt")==true)
				      				status=5;
				      			else if (resultSet1.getBoolean("limite")==true)
				      				status=4;
				      			else if (resultSet1.getString("reponse")!=null)
				      			status=1;
				      			else  if (resultSet1.getString("idChoix")!=null)
				      				status=1;
				      			else 
				      			{
				      				preparedStatementinac = connectioninac.prepareStatement("SELECT * FROM statutInac  WHERE idClient = ?  AND objet= ? "+sbQueryinac);
						      		preparedStatementinac.setInt(1, idClient.intValue());
						      		preparedStatementinac.setInt(2, resultSetniv.getInt("idNiveauobjet"));
						      	 		resultSetinac = preparedStatementinac.executeQuery();
						      	 		
						      	 		int sizinac= 0;
							      		  
							      			resultSetinac.beforeFirst();  
							      			resultSetinac.last();  
							      		  sizinac = resultSetinac.getRow();  
							      		if (sizinac!=0) //pas acc
							      			status=6;
							      		else
							      			 status=3;
							      			
				      			}
				      			
				      			 
				      			
							 System.out.println("status"+status);     		
							      		
						      	// date inspection
							 dateinsp=resultSet1.getString("dateInformation");
							 dateremise=resultSet1.getString("dateRemise");
				      			 
				      			 
				      			
				      			 }
				      		 else
				      		 {
				      			this.inspectionCSVtext.append(separateurMot + " " + separateurMot + separateur);
				      			dateinsp=" "; dateremise=" ";
				      			 status=2;
				      		 }
				      		this.inspectionCSVtext.append(separateurMot + status + separateurMot + separateur);
		      				// ecrire les limtes
				      		this.inspectionCSVtext.append(separateurMot + lowlimit + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + highlimit + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + lowBorder + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + hightBorder + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + lowBorderAlert + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + hightBorderAlert + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + dateinsp + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + dateremise + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + idClient.intValue() + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + userName + separateurMot + separateur);
				      		this.inspectionCSVtext.append(separateurMot + idTerminal + separateurMot );
				      		this.inspectionCSVtext.append(sautLigne);
				      		totinsp++;	 
				         }
				  
			  }
			  else //eq
			  {
				  int day=clot.getDayCloture();
				  if (day==7) day=0;
				  System.out.println("step1"+day);
				  preparedStatementniv= connectionniv.prepareStatement("SELECT * FROM niveau WHERE idclient = ? AND masque = ? AND idNiveauParent IN ( SELECT idNiveau FROM niveau WHERE idNiveauParent = ? ) ");
				     preparedStatementniv.setInt(1, idClient.intValue());
				     preparedStatementniv.setInt(2, 0);
				     preparedStatementniv.setInt(3, clot.getIdNiveau());
				    
						resultSetniv = preparedStatementniv.executeQuery();
						 while(resultSetniv.next()) 
				         { 
							 // chercher les objet pour ce team
							 if (day==0)
								{
									preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND dim = ? AND idObjet= ?  ");
									preparedStatementobjteam.setInt(1, idClient.intValue());
									preparedStatementobjteam.setInt(2, 0);
									preparedStatementobjteam.setInt(3, clot.getUserCloture());
									preparedStatementobjteam.setInt(4, 1);
									preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
									resultSetobjteam = preparedStatementobjteam.executeQuery();
								}
							 else
								 if (day==1)
								 {
									 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND lun = ? AND idObjet= ?  ");
										preparedStatementobjteam.setInt(1, idClient.intValue());
										preparedStatementobjteam.setInt(2, 0);
										preparedStatementobjteam.setInt(3, clot.getUserCloture());
										preparedStatementobjteam.setInt(4, 1);
										preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
										resultSetobjteam = preparedStatementobjteam.executeQuery();
								 }
								 else
									 if (day==2)
									 {
										 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND mar = ? AND idObjet= ?  ");
											preparedStatementobjteam.setInt(1, idClient.intValue());
											preparedStatementobjteam.setInt(2, 0);
											preparedStatementobjteam.setInt(3, clot.getUserCloture());
											preparedStatementobjteam.setInt(4, 1);
											preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
											resultSetobjteam = preparedStatementobjteam.executeQuery();
									 }
									 else
										 if (day==3)
										 {
											 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND mer = ? AND idObjet= ?  ");
												preparedStatementobjteam.setInt(1, idClient.intValue());
												preparedStatementobjteam.setInt(2, 0);
												preparedStatementobjteam.setInt(3, clot.getUserCloture());
												preparedStatementobjteam.setInt(4, 1);
												preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
												resultSetobjteam = preparedStatementobjteam.executeQuery();
										 }
										 else
											 if (day==4)
											 {
												 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND jeu = ? AND idObjet= ?  ");
													preparedStatementobjteam.setInt(1, idClient.intValue());
													preparedStatementobjteam.setInt(2, 0);
													preparedStatementobjteam.setInt(3, clot.getUserCloture());
													preparedStatementobjteam.setInt(4, 1);
													preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
													resultSetobjteam = preparedStatementobjteam.executeQuery();
											 }
											 else
												 if (day==5)
												 {
													 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND ven = ? AND idObjet= ?  ");
														preparedStatementobjteam.setInt(1, idClient.intValue());
														preparedStatementobjteam.setInt(2, 0);
														preparedStatementobjteam.setInt(3, clot.getUserCloture());
														preparedStatementobjteam.setInt(4, 1);
														preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
														resultSetobjteam = preparedStatementobjteam.executeQuery(); 
												 }
												 else
													 if (day==6)
													 {
														 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND sam = ? AND idObjet= ?  ");
															preparedStatementobjteam.setInt(1, idClient.intValue());
															preparedStatementobjteam.setInt(2, 0);
															preparedStatementobjteam.setInt(3, clot.getUserCloture());
															preparedStatementobjteam.setInt(4, 1);
															preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
															resultSetobjteam = preparedStatementobjteam.executeQuery();
													 }
							 while(resultSetobjteam.next()) 
							 { 
								 
								 this.inspectionCSVtext.append(separateurMot + resultSetniv.getString("libelle") + separateurMot + separateur);
								  preparedStatementobj= connectionobj.prepareStatement("SELECT * FROM niveauobjet WHERE idClient = ? AND idNiveauobjet = ? AND masque = ?  ");
						    	   preparedStatementobj.setInt(1, idClient.intValue());
						    	   preparedStatementobj.setInt(2, resultSetniv.getInt("idNiveauobjet"));
						    	   preparedStatementobj.setInt(3, 0);
					           	ResultSet resultSet3 = preparedStatementobj.executeQuery();
					           	if (resultSet3.next())
					           	{
					           		System.out.println("step2 objt reher");
					           		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("libelle") + separateurMot + separateur);
						           	if (resultSet3.getString("unitmeasure")!=null)
						           	this.inspectionCSVtext.append(separateurMot + resultSet3.getString("unitmeasure") + separateurMot + separateur);
						           	else
						           		this.inspectionCSVtext.append(separateurMot + " " + separateurMot + separateur);
						           	
						          lowlimit=resultSet3.getDouble("lowlimit");
						   		  highlimit=resultSet3.getDouble("highlimit");
						   		  lowBorder=resultSet3.getDouble("lowborder");
						   		  hightBorder=resultSet3.getDouble("highborder");
						   		  lowBorderAlert=resultSet3.getString("lowborderalert");
						   		  hightBorderAlert=resultSet3.getString("highborderalert");
					           	}
					           	// chercher l inspection
					           	
					            System.out.println("step 3cherch inspe");
							   	preparedStatementinsp = connectioninsp.prepareStatement("SELECT * FROM inspection  WHERE idClient = ?  AND idNiveauObjet= ? "+sbQuery);
							    preparedStatementinsp.setInt(1, idClient.intValue());
								preparedStatementinsp.setInt(2, resultSetniv.getInt("idNiveauobjet"));
								resultSet1 = preparedStatementinsp.executeQuery();
							      		 if(resultSet1.next()) 
							      			 {System.out.println("resultSet1"+resultSet1.getString("idInformation"));	
							      			 
							      			 // la valeur
							      			if (resultSet1.getString("reponse")!=null)
							      				this.inspectionCSVtext.append(separateurMot + resultSet1.getString("reponse") + separateurMot + separateur);
							      			else
							      				this.inspectionCSVtext.append(separateurMot + " " + separateurMot + separateur);
						      				// le statut
							      			 
							      			if (resultSet1.getBoolean("defekt")==true)
							      				status=5;
							      			else if (resultSet1.getBoolean("limite")==true)
							      				status=4;
							      			else if (resultSet1.getString("reponse")!=null)
							      			status=1;
							      			else  if (resultSet1.getString("idChoix")!=null)
							      				status=1;
							      			else 
							      			{
							      				preparedStatementinac = connectioninac.prepareStatement("SELECT * FROM statutInac  WHERE idClient = ?  AND objet= ? "+sbQueryinac);
									      		preparedStatementinac.setInt(1, idClient.intValue());
									      		preparedStatementinac.setInt(2, resultSetniv.getInt("idNiveauobjet"));
									      	 		resultSetinac = preparedStatementinac.executeQuery();
									      	 		
									      	 		int sizinac= 0;
										      		  
										      			resultSetinac.beforeFirst();  
										      			resultSetinac.last();  
										      		  sizinac = resultSetinac.getRow();  
										      		if (sizinac!=0) //pas acc
										      			status=6;
										      		else
										      			 status=3;
										      			
							      			}
							      			
							      			 
							      			
										 System.out.println("status"+status);     		
										      		
									      	// date inspection
										 dateinsp=resultSet1.getString("dateInformation");
										 dateremise=resultSet1.getString("dateRemise");
							      			 
							      			 
							      			
							      			 }
							      		 else
							      		 {
							      			this.inspectionCSVtext.append(separateurMot + " " + separateurMot + separateur);
							      			dateinsp=" "; dateremise=" ";
							      			 status=2;
							      		 }
							      		this.inspectionCSVtext.append(separateurMot + status + separateurMot + separateur);
					      				// ecrire les limtes
							      		this.inspectionCSVtext.append(separateurMot + lowlimit + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + highlimit + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + lowBorder + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + hightBorder + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + lowBorderAlert + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + hightBorderAlert + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + dateinsp + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + dateremise + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + idClient.intValue() + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + userName + separateurMot + separateur);
							      		this.inspectionCSVtext.append(separateurMot + idTerminal + separateurMot );
							      		this.inspectionCSVtext.append(sautLigne);
							      		totinsp++;	 
					           		
							 } // end while obj in team
				         }
				  
			  }
			    
			  this.inspectionCSVtext2 = new StringBuffer();
			     this.inspectionCSVtext2.append(separateurMot + dateFormat.format(currentdate) + separateurMot + separateur);
			     this.inspectionCSVtext2.append(separateurMot + totinsp + separateurMot + separateur);
			     this.inspectionCSVtext2.append(separateurMot + clot.getStatutCloture() + separateurMot );
			     this.inspectionCSVtext2.append(sautLigne);
		   
			     FileWriter fw = new FileWriter("/usr/share/tomcat/"+nomcsv, true);
			    
				BufferedWriter output = new BufferedWriter(fw);
			    
				output.write(inspectionCSVtext2.toString());
			
				output.write(inspectionCSVtext.toString());
			  
				output.flush();
			  
				output.close();
				
			 /* connection1.close();
		         preparedStatementuser.close();
		         resultSet1.close();
		         connectionuser.close();
		         connection3.close();
		         connectioninsp.close();
		         connectioncsv.close();
		         connectionobj.close();
		         
		         connectiontypr.close();
		         connectionniv.close();
		         //connectioncl.close();
		         connectioninac.close();
		         resultSet2.close();
		         resultSetuser.close();
		        
		         resultSetniv.close();
		      //   resultSetinac.close();
		         preparedStatementinsp.close();
		         preparedStatementcsv.close();
		         preparedStatementinsp.close();
		         //preparedStatementniveq.close();
		         preparedStatementniv.close();
		         //preparedStatementinac.close();
		         preparedStatementobj.close();*/
		     
		         
			
		}//end try
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
  
    private void deleteFile(Integer idclient){ 
    	File file = new File("/usr/share/tomcat/");
    	File[] files = file.listFiles();
    	String rech="_"+idclient;
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
            	 if (files[i].isDirectory() == false)
            	 {
            		 
            		 if (files[i].getName().contains(rech))
            		 {
            			 System.out.println("  Fichier: " + files[i].getName());
            			 files[i].delete();
            		 }
            	 }
            	 
            }
            }
    	}
    private void _creerCSV(Cloture clot)
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	String nomcsv="PDADATA";	
		Date currentdate = new Date(); 
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		int countact=0;
		int status=0;
		 Double minlimit=0.0;
		 Double maxlimit=0.0;
		 Double lowlimit=0.0;
		 Double hightlimit=0.0;
		
		int totinsp=0;
		try {
			preparedStatementcsv= connectioncsv.prepareStatement("SELECT * FROM csvcount  WHERE idClient = ? "
					);
		 
			preparedStatementcsv.setInt(1, idClient.intValue());
			
			resultSet2 = preparedStatementcsv.executeQuery();
			if (resultSet2==null)
			{
				countact=01;
				String datetitle=dateFormat.format(currentdate);
				datetitle=datetitle.replaceAll("-", "");
				datetitle = datetitle.replaceAll("_", "");
				datetitle = datetitle.replaceAll(":", "");
				nomcsv+=countact+"."+datetitle+".csv";
				java.io.File fichier = new java.io.File("/usr/share/tomcat/"+nomcsv); 
				
				fichier.createNewFile();
				fichier.setWritable(true);
				Statement sta = connection3.createStatement();
				 String strSQL = (new StringBuilder("INSERT INTO csvcount(IdClient, count,ClefTimestamp )VALUES ("))
	            		  .append(idClient.intValue()).append(",").append(countact).append(",").append(datetitle).append(")").toString();
	              
	             sta.executeUpdate(strSQL);
			}
			else
			{
				while(resultSet2.next()) 
	            { 
					if (resultSet2.getInt("count")==99)
						countact=01;
					else
						countact=resultSet2.getInt("count")+1;
					String datetitle=dateFormat.format(currentdate);
					datetitle=datetitle.replaceAll("-", "");
					datetitle = datetitle.replaceAll("_", "");
					datetitle = datetitle.replaceAll(":", "");
					nomcsv+=countact+"."+datetitle+".csv";
					java.io.File fichier = new java.io.File("/usr/share/tomcat/"+nomcsv); 
					
					fichier.createNewFile();
					fichier.setWritable(true);
					Statement sta = connection3.createStatement();
			        String strSQL ="UPDATE  csvcount SET count="+countact;
			        System.out.println("strSQL csv"+strSQL);
			       sta.executeUpdate(strSQL);
	            }
			}
			
			
		String typuser="S";
    String sautLigne = "\n";
    String separateur = ";";
     String separateurMot = "\"";
     this.inspectionCSVtext = new StringBuffer();
     
     StringBuffer sbQuery = new StringBuffer();	
	  sbQuery.append(" AND dateInformation  >= '" + clot.getDebDateCloture() + "' ");
	  sbQuery.append(" AND dateInformation  <= '" + clot.getDateCloture() + "' ");
	  
	  StringBuffer sbQueryinac = new StringBuffer();	
	  sbQueryinac.append(" AND dateinacc  >= '" + clot.getDebDateCloture() + "' ");
	  sbQueryinac.append(" AND dateinacc  <= '" + clot.getDateCloture() + "' ");
	  
	 
	  preparedStatementuser = connectionuser.prepareStatement("SELECT * FROM utilisateur  WHERE idClient = ? AND masque = ? AND idUtilisateur = ? ");
	  preparedStatementuser.setInt(1, idClient.intValue());
	  preparedStatementuser.setInt(2, 0);
	  preparedStatementuser.setInt(3, clot.getUserCloture());
	  resultSetuser = preparedStatementuser.executeQuery();
	  while(resultSetuser.next()) 
      {
		  typuser=resultSetuser.getString("typeUser");
      }
	  
	  if (typuser.equals("E"))
	  {
		  
		  int day=clot.getDayCloture();
		  if (day==7) day=0;
		  /*
		    if (clot.getDateCloture()!=null)
		    {
		    	
		        Date dayclot = sdf.parse(clot.getDateCloture());
		        
		         day=dayclot.getDay();
		   		if (day==7)
		   			day=0;
		   		
		    }
		    else
		    {
		    	
		        Date dayclot = new Date();
		        
		         day=dayclot.getDay();
		   		if (day==7)
		   			day=0;
		   		
		    }
		     */
		   
		     preparedStatementniv= connectionniv.prepareStatement("SELECT * FROM niveau WHERE idclient = ? AND masque = ? AND idNiveauParent IN ( SELECT idNiveau FROM niveau WHERE idNiveauParent = ? ) ");
		     preparedStatementniv.setInt(1, idClient.intValue());
		     preparedStatementniv.setInt(2, 0);
		     preparedStatementniv.setInt(3, clot.getIdNiveau());
		    
				resultSetniv = preparedStatementniv.executeQuery();
				 while(resultSetniv.next()) 
		         { 
					 if (day==0)
						{
							preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND dim = ? AND idObjet= ?  ");
							preparedStatementobjteam.setInt(1, idClient.intValue());
							preparedStatementobjteam.setInt(2, 0);
							preparedStatementobjteam.setInt(3, clot.getUserCloture());
							preparedStatementobjteam.setInt(4, 1);
							preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
							resultSetobjteam = preparedStatementobjteam.executeQuery();
						}
					 else
						 if (day==1)
						 {
							 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND lun = ? AND idObjet= ?  ");
								preparedStatementobjteam.setInt(1, idClient.intValue());
								preparedStatementobjteam.setInt(2, 0);
								preparedStatementobjteam.setInt(3, clot.getUserCloture());
								preparedStatementobjteam.setInt(4, 1);
								preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
								resultSetobjteam = preparedStatementobjteam.executeQuery();
						 }
						 else
							 if (day==2)
							 {
								 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND mar = ? AND idObjet= ?  ");
									preparedStatementobjteam.setInt(1, idClient.intValue());
									preparedStatementobjteam.setInt(2, 0);
									preparedStatementobjteam.setInt(3, clot.getUserCloture());
									preparedStatementobjteam.setInt(4, 1);
									preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
									resultSetobjteam = preparedStatementobjteam.executeQuery();
							 }
							 else
								 if (day==3)
								 {
									 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND mer = ? AND idObjet= ?  ");
										preparedStatementobjteam.setInt(1, idClient.intValue());
										preparedStatementobjteam.setInt(2, 0);
										preparedStatementobjteam.setInt(3, clot.getUserCloture());
										preparedStatementobjteam.setInt(4, 1);
										preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
										resultSetobjteam = preparedStatementobjteam.executeQuery();
								 }
								 else
									 if (day==4)
									 {
										 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND jeu = ? AND idObjet= ?  ");
											preparedStatementobjteam.setInt(1, idClient.intValue());
											preparedStatementobjteam.setInt(2, 0);
											preparedStatementobjteam.setInt(3, clot.getUserCloture());
											preparedStatementobjteam.setInt(4, 1);
											preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
											resultSetobjteam = preparedStatementobjteam.executeQuery();
									 }
									 else
										 if (day==5)
										 {
											 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND ven = ? AND idObjet= ?  ");
												preparedStatementobjteam.setInt(1, idClient.intValue());
												preparedStatementobjteam.setInt(2, 0);
												preparedStatementobjteam.setInt(3, clot.getUserCloture());
												preparedStatementobjteam.setInt(4, 1);
												preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
												resultSetobjteam = preparedStatementobjteam.executeQuery(); 
										 }
										 else
											 if (day==6)
											 {
												 	preparedStatementobjteam= connectionobjteam.prepareStatement("SELECT * FROM objeteam WHERE idclient = ? AND masque = ? AND idteam=? AND sam = ? AND idObjet= ?  ");
													preparedStatementobjteam.setInt(1, idClient.intValue());
													preparedStatementobjteam.setInt(2, 0);
													preparedStatementobjteam.setInt(3, clot.getUserCloture());
													preparedStatementobjteam.setInt(4, 1);
													preparedStatementobjteam.setInt(5, resultSetniv.getInt("idNiveauobjet"));
													resultSetobjteam = preparedStatementobjteam.executeQuery();
											 }
					
					 while(resultSetobjteam.next()) 
					 { 
						 
						 String date =  dateFormat.format(new Date());
						  preparedStatementobj= connectionobj.prepareStatement("SELECT * FROM niveauobjet WHERE idClient = ? AND idNiveauobjet = ? AND masque = ?  ");
				    	   preparedStatementobj.setInt(1, idClient.intValue());
				    	   preparedStatementobj.setInt(2, resultSetniv.getInt("idNiveauobjet"));
				    	   preparedStatementobj.setInt(3, 0);
			           	ResultSet resultSet3 = preparedStatementobj.executeQuery();
						 
			           	while(resultSet3.next())
			           	{ 
			           		//chercher leniveau eq
			           	 preparedStatementniveq= connectionnv.prepareStatement("SELECT * FROM niveau WHERE idClient = ? AND idNiveauobjet = ? AND masque = ?  ");
			           	preparedStatementniveq.setInt(1, idClient.intValue());
			           	preparedStatementniveq.setInt(2, resultSet3.getInt("idNiveauobjet"));
			           	preparedStatementniveq.setInt(3, 0);
			           	ResultSet resultSeteq = preparedStatementniveq.executeQuery();
			           		
			           		
		           		this.inspectionCSVtext.append(separateurMot + resultSeteq.getString("libelle") + separateurMot + separateur);
		        		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("libelle") + separateurMot + separateur);
		        		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("unitmeasure") + separateurMot + separateur);
		        		
		        		minlimit=resultSet3.getDouble("lowlimit");
	            		maxlimit=resultSet3.getDouble("highlimit");
	            		lowlimit=resultSet3.getDouble("lowborder");
	            		hightlimit=resultSet3.getDouble("highborder"); 
		        		
		            	 
		            	
			           	}
			           	
			           	preparedStatementinsp = connectioninsp.prepareStatement("SELECT * FROM inspection  WHERE idClient = ?  AND idNiveauObjet= ? "+sbQuery);
			           	preparedStatementinsp.setInt(1, idClient.intValue());
						 preparedStatementinsp.setInt(2, resultSetniv.getInt("idNiveauobjet"));
			      	 	resultSet1 = preparedStatementinsp.executeQuery();
			      		int size= 0;
			      		if (resultSet1 != null)   
			      		{  
			      			resultSet1.beforeFirst();  
			      			resultSet1.last();  
			      		  size = resultSet1.getRow();  
			      		} 
			      		resultSet1.beforeFirst();
			      		
			      		if (size!=0)
			      		{
			      		while(resultSet1.next()) 
				          {
			      			
			      			int i=resultSet1.getString("dateInformation").indexOf(".0");
			      			if (i>0)  
			      			date =resultSet1.getString("dateInformation").substring(0,i);
			      			else
			      				date =resultSet1.getString("dateInformation");
			      			if (resultSet1.getBoolean("defekt")==true)
			      				{
			      				if (resultSet1.getString("reponse")!=null )
			      				{
			      					this.inspectionCSVtext.append(separateurMot + resultSet1.getString("reponse") + separateurMot + separateur);
			    	      			
			      						status=4;
			      							
			      				}
			      				else 
			      					{
			      					  status=5; this.inspectionCSVtext.append(separateurMot + "0.0000" + separateurMot + separateur);
			      					}
			      				
			      				} else if  ((resultSet1.getString("reponse")==null) &&  (resultSet1.getInt("idChoix")!=0)) { 
			      					status=1; this.inspectionCSVtext.append(separateurMot + "0.0000" + separateurMot + separateur);
				      			
			      			}
			      				else if  ((resultSet1.getString("reponse")==null) &&  (resultSet1.getInt("idChoix")==0)) { 
			      					status=3; this.inspectionCSVtext.append(separateurMot + "0.0000" + separateurMot + separateur);
			      				}
			      				else
			      				{
			      					status=1; this.inspectionCSVtext.append(separateurMot + resultSet1.getString("reponse") + separateurMot + separateur);
					      			
			      				}
			      			
			      			
			        		
				          }
			      		}
			      		else
			      		{
			      			this.inspectionCSVtext.append(separateurMot + "0.0000 " + separateurMot+ separateur );
			        		status =2;
			      		}
			      		preparedStatementinac = connectioninac.prepareStatement("SELECT * FROM statutInac  WHERE idClient = ?  AND objet= ? "+sbQueryinac);
			      		preparedStatementinac.setInt(1, idClient.intValue());
			      		preparedStatementinac.setInt(2, resultSetniv.getInt("idNiveauobjet"));
			      	 
			      		resultSetinac = preparedStatementinac.executeQuery();
			      		int siz= 0;
			      		if (resultSetinac != null)   
			      		{  
			      			resultSetinac.beforeFirst();  
			      			resultSetinac.last();  
			      		  siz = resultSetinac.getRow();  
			      		} 
			      		
			      		
			      		if (siz!=0) status=6;
			      		this.inspectionCSVtext.append(separateurMot + status + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + minlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + maxlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + lowlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + hightlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + date + separateurMot );
			      		this.inspectionCSVtext.append(sautLigne);
			      		totinsp++;
					 } //while(resultSetobjteam.next()) 
					 
		         }//while(resultSetniv.next()) 
				 
				 connectionobjteam.close();
				 preparedStatementobjteam.close();
		         resultSetobjteam.close();
				 
	  }
	  else
	  {
		  
		  
		  
		     preparedStatementniv= connectionniv.prepareStatement("SELECT * FROM niveau WHERE idclient = ? AND masque = ? AND idNiveauParent IN ( SELECT idNiveau FROM niveau WHERE idNiveauParent = ? ) ");
		     preparedStatementniv.setInt(1, idClient.intValue());
		     preparedStatementniv.setInt(2, 0);
		     preparedStatementniv.setInt(3, clot.getIdNiveau());
		    
				resultSetniv = preparedStatementniv.executeQuery();
				 while(resultSetniv.next()) 
		         {
					 
					 String date =  dateFormat.format(new Date());
						  preparedStatementobj= connectionobj.prepareStatement("SELECT * FROM niveauobjet WHERE idClient = ? AND idNiveauobjet = ? AND masque = ?  ");
				    	   preparedStatementobj.setInt(1, idClient.intValue());
				    	   preparedStatementobj.setInt(2, resultSetniv.getInt("idNiveauobjet"));
				    	   preparedStatementobj.setInt(3, 0);
			           	ResultSet resultSet3 = preparedStatementobj.executeQuery();
						 
			           	while(resultSet3.next())
			           	{
		           		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("codeBarre") + separateurMot + separateur);
		        		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("libelle") + separateurMot + separateur);
		        		this.inspectionCSVtext.append(separateurMot + resultSet3.getString("unitmeasure") + separateurMot + separateur);
		        		
		        		minlimit=resultSet3.getDouble("lowlimit");
	            		maxlimit=resultSet3.getDouble("highlimit");
	            		lowlimit=resultSet3.getDouble("lowborder");
	            		hightlimit=resultSet3.getDouble("highborder"); 
		        		
			           	}
			           	
			           	preparedStatementinsp = connectioninsp.prepareStatement("SELECT * FROM inspection  WHERE idClient = ?  AND idNiveauObjet= ? "+sbQuery);
			           	preparedStatementinsp.setInt(1, idClient.intValue());
						 preparedStatementinsp.setInt(2, resultSetniv.getInt("idNiveauobjet"));
						 
			      	 	resultSet1 = preparedStatementinsp.executeQuery();
			      	
			      	 	int size= 0;
			      		if (resultSet1 != null)   
			      		{  
			      			resultSet1.beforeFirst();  
			      			resultSet1.last();  
			      		  size = resultSet1.getRow();  
			      		} 
			      		resultSet1.beforeFirst();
			      		
			      		if (size!=0)
			      		{
			      		while(resultSet1.next()) 
				          {
			      			int i=resultSet1.getString("dateInformation").indexOf(".0");
			      			if (i>0)  
			      			date =resultSet1.getString("dateInformation").substring(0,i);
			      			else
			      				date =resultSet1.getString("dateInformation");
			      			
			      			
			      			if (resultSet1.getBoolean("defect")==true)
			      				{
			      				if (resultSet1.getString("reponse")!=null )
			      				{
			      					this.inspectionCSVtext.append(separateurMot + resultSet1.getString("reponse") + separateurMot + separateur);
			    	      			
			      						status=4;
			      							
			      				}
			      				else 
			      					{
			      					  status=5; this.inspectionCSVtext.append(separateurMot + "0.0000" + separateurMot + separateur);
			      					}
			      				
			      				} else if  ((resultSet1.getString("reponse")==null) &&  (resultSet1.getInt("idChoix")!=0)) { 
			      					status=1; this.inspectionCSVtext.append(separateurMot + "0.0000" + separateurMot + separateur);
				      			
			      			}
			      				else if  ((resultSet1.getString("reponse")==null) &&  (resultSet1.getInt("idChoix")==0)) { 
			      					status=3; this.inspectionCSVtext.append(separateurMot + "0.0000" + separateurMot + separateur);
			      				}
			      				else
			      				{
			      					status=1; this.inspectionCSVtext.append(separateurMot + resultSet1.getString("reponse") + separateurMot + separateur);
					      			
			      				}
			      			
			      			
			        		
				          }
			      		}
			      		else
			      		{
			      			this.inspectionCSVtext.append(separateurMot + "0.0000 " + separateurMot+ separateur );
			        		status =2;
			      		}
			      		preparedStatementinac = connectioninac.prepareStatement("SELECT * FROM statutInac  WHERE idClient = ?  AND objet= ? "+sbQueryinac);
			      		preparedStatementinac.setInt(1, idClient.intValue());
			      		preparedStatementinac.setInt(2, resultSetniv.getInt("idNiveauobjet"));
			      	 
			      		resultSetinac = preparedStatementinac.executeQuery();
			      		int siz= 0;
			      		if (resultSetinac != null)   
			      		{  
			      			resultSetinac.beforeFirst();  
			      			resultSetinac.last();  
			      		  siz = resultSetinac.getRow();  
			      		} 
			      		
			      		
			      		if (siz!=0) status=6;
			      		this.inspectionCSVtext.append(separateurMot + status + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + minlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + maxlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + lowlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + hightlimit + separateurMot + separateur);
			      		this.inspectionCSVtext.append(separateurMot + date + separateurMot );
			      		this.inspectionCSVtext.append(sautLigne);
			      		totinsp++;
					   
					 
		         }//while(resultSetniv.next()) 
		  
	  }
	  
     /* ecrire les inspections:
      1er cas equipe **/
    
		
		 connection1.close();
         preparedStatementuser.close();
         resultSet1.close();
         connectionuser.close();
         connection3.close();
         connectioninsp.close();
         connectioncsv.close();
         connectionobj.close();
         
         connectiontypr.close();
         connectionniv.close();
        
         connectioninac.close();
         resultSet2.close();
         resultSetuser.close();
        
         resultSetniv.close();
         resultSetinac.close();
         preparedStatementinsp.close();
         preparedStatementcsv.close();
         preparedStatementinsp.close();
         preparedStatementniveq.close();
         preparedStatementniv.close();
         preparedStatementinac.close();
         preparedStatementobj.close();
     
         this.inspectionCSVtext2 = new StringBuffer();
	     this.inspectionCSVtext2.append(separateurMot + dateFormat.format(currentdate) + separateurMot + separateur);
	     this.inspectionCSVtext2.append(separateurMot + totinsp + separateurMot + separateur);
	     this.inspectionCSVtext2.append(separateurMot + clot.getStatutCloture() + separateurMot );
	     this.inspectionCSVtext2.append(sautLigne);
    
	     FileWriter fw = new FileWriter(nomcsv, true);
		BufferedWriter output = new BufferedWriter(fw);
		output.write(inspectionCSVtext2.toString());
		output.write(inspectionCSVtext.toString());
		output.flush();
		output.close();
		
		
	     
		

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	   
		

		public List<Inspection> getListInspections() {
			return listInspections;
		}

		public void setListInspections(List<Inspection> listInspections) {
			this.listInspections = listInspections;
		}

		
}
