/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatClient;

import java.util.List;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lhqua
 */
public class chatClient {
    private int port;
    private InetAddress host;
    private String nameUser;
    private List<String> listFiend = new ArrayList<String>();

    public List<String> getListFiend() {
        return listFiend;
    }

    public void setListFiend(List<String> listFiend) {
        this.listFiend = listFiend;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public InetAddress getHost() {
        return host;
    }

    public void setHost(InetAddress host) {
        this.host = host;
    }
    

   

    public chatClient(int port, InetAddress host, String nameUser) {
        this.port = port;
        this.host = host;
        this.nameUser = nameUser;
    }
    
    public void addFriend(String name){
        listFiend.add(name);
    }
    
    public void removeFiend(String name){
        listFiend.remove(name);
    }
}
