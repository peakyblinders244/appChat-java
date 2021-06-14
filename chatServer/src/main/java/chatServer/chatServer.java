/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatServer;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lhqua
 */
public class chatServer {
    private int port;   
    private List<String> userNames = new ArrayList<String>(0);
    private List<Socket> listSocket = new ArrayList<Socket>(0);

    public chatServer(int port) {
        this.port = port;
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public List<Socket> getListSocket() {
        return listSocket;
    }

    public void setListSocket(List<Socket> listSocket) {
        this.listSocket = listSocket;
    }

  
 
    
    public void addUserName(String userName){
        userNames.add(userName);
    }
    
    public void addSocket(Socket socket){
        listSocket.add(socket);
    }
    
    public boolean removeUser(String userName,Socket socket){
        int idex = -1 ;
        for(int i = 0 ;i <userNames.size();i++){
            if(userNames.get(i).equals(userName)){
                idex = i;
            }
        }
        if(idex == -1){
            return false;
        }
        userNames.remove(idex);
        listSocket.remove(idex);
        return true;
    }
}
