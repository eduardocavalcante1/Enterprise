
package util;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import view.ViewParametros;


public class Util {
    
    
   Locale localeBR = new Locale("pt","BR"); 
   NumberFormat decimalBR    = NumberFormat.getNumberInstance(localeBR);
   NumberFormat inteiro      = NumberFormat.getInstance();  
   NumberFormat dinheiro     = NumberFormat.getCurrencyInstance(localeBR);
   NumberFormat percentual   = NumberFormat.getPercentInstance(localeBR);
   
   
   
   private static final int[] pesoCPF  = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
   private static final int[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

   
   
   
   public static boolean ValidacpfCnpj(String cpfCnpj) {
       return (isValidCPF(cpfCnpj) || isValidCNPJ(cpfCnpj));
   }

   private static int calcularDigito(String str, int[] peso) {
      int soma = 0;
      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
          digito = Integer.parseInt(str.substring(indice,indice+1));
          soma += digito*peso[peso.length-str.length()+indice];
      }
      soma = 11 - soma % 11;
      return soma > 9 ? 0 : soma;
   }

   private static String padLeft(String text, char character) {
      return String.format("%11s", text).replace(' ', character);
   }

   private static boolean isValidCPF(String cpf) {
      cpf = cpf.trim().replace(".", "").replace("-", "");
      if ((cpf==null) || (cpf.length()!=11)) return false;

      for (int j = 0; j < 10; j++)
          if (padLeft(Integer.toString(j), Character.forDigit(j, 10)).equals(cpf))
             return false;

      Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
      Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
      return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
   }

   private static boolean isValidCNPJ(String cnpj) {
      cnpj = cnpj.trim().replace(".", "").replace("-", "");
      if ((cnpj==null)||(cnpj.length()!=14)) return false;

      Integer digito1 = calcularDigito(cnpj.substring(0,12), pesoCNPJ);
      Integer digito2 = calcularDigito(cnpj.substring(0,12) + digito1, pesoCNPJ);
      return cnpj.equals(cnpj.substring(0,12) + digito1.toString() + digito2.toString());
   }

   public static boolean ValidaEmail(String email) {

      boolean isEmailIdValid = false;
      if (email != null && (email.trim().length() > 0)) {
         String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
         Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher(email.trim());
         if (matcher.matches()) {
             isEmailIdValid = true;
         }
      }

      return isEmailIdValid;
    }  

   public static String formatarDecimalBR(Object x) {
      
       if(Object.class.getName().trim().isEmpty()){
          x = String.valueOf("0,00");
       }
       x = String.format("%.2f", x);
       return (String) x;
   }
   
    
   public static String formatarDecimalUs(String x) {
       
       if(x.trim().isEmpty()){
          x = "0.00";
        }
        x = x.replace(".", "");
        x = x.replace(",", ".");
        return x;
    }
        
   public static String formatarDataBR(String data){
      SimpleDateFormat formatadorbr;  
      formatadorbr = new SimpleDateFormat("dd/MM/yyyy");
      formatadorbr.format(data);
      return data;
   }
   
   public static String converterDataBrTabela(Object data){
      SimpleDateFormat formatadorbr;  
      formatadorbr = new SimpleDateFormat("dd/MM/yyyy");
      formatadorbr.format(data);
      return  (String) data;
   }
   
   public static Date formatarDataUS(String dataString) {  // ENTRADA DE UMA STRING E SAIDA DE UMA DATA
      SimpleDateFormat formatadorus;
      formatadorus       = new SimpleDateFormat("dd/MM/yyyy");
      java.sql.Date data = null;
       try {
           data = new java.sql.Date(formatadorus.parse(dataString).getTime());
       } catch (ParseException ex) {
           Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
       }
      return data;
    }
   
    public static Date formatarDataPostgres(Date data){  // MÉTODO ENTRA COM DATA E FORMATA A DATA RETORNANDO PARA O POSTGRES
                                                         // ENTRA DATE E SAIDA DATE   
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataUtil = data;
        java.sql.Date dataSql = null;
        try {
            dataUtil = new java.sql.Date(dataUtil.getTime());
            dataSql = (java.sql.Date) dataUtil;

        } catch (Exception e) {
         Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, e);
        }
        return dataSql;
    }
   

    public static boolean verificarDataNasc(String dataString) {
       
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
       try {
           data = format.parse(dataString);
           if (data.after(new Date())) {
              return false;
           } 
       } catch (ParseException ex) {
           Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
       }
       return true;
    }
   
   
   
 }
    
   
    




