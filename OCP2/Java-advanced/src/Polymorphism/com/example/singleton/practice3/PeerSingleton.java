/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.com.example.singleton.practice3;

public final class PeerSingleton {

    private static final String[] hostNames = new String[5];

    static {
        // Read from File
        hostNames[0] = "192.168.1.2";
        hostNames[1] = "192.168.1.4";
        hostNames[2] = "192.168.2.3";
        hostNames[3] = "192.168.2.5";
        hostNames[4] = "192.168.2.14";
    }

    public PeerSingleton() {
    }

    public String[] getHostNames() {
        return hostNames;
    }
}
