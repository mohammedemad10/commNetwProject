import java.io.*; 
import java.net.*; 

class TCPServer { 

  public static void main(String argv[]) throws Exception 
    { 
      String clientSentence; 
      String capitalizedSentence; 


    boolean f= true;
      String text2="";

      ServerSocket welcomeSocket = new ServerSocket(9876); 
     
      Socket connectionSocket = welcomeSocket.accept();
      String text= "";
      BufferedReader inFromClient = 
              new BufferedReader(new
              InputStreamReader(connectionSocket.getInputStream())); 
      text= inFromClient.readLine();
      System.out.println(text);
      while(!text.equals("bye")) { 
  
          

         
           
           
         
           BufferedReader inFromServer = 
        	        new BufferedReader(new InputStreamReader(System.in)); 
           text2=inFromServer.readLine();
           String text3=text2+"SERVER ACCEPTED THE MESSAGE";
           DataOutputStream  outToClient = 
                   new DataOutputStream(connectionSocket.getOutputStream()); 

           outToClient.writeBytes(text3+'\n'); 
           f=true;
              } 
      
          }
  
  
      } 
