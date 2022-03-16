/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceBanking.com.example.practice2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




public enum Branch {
    
    LA("Basic"), Boston("Loan"), Bangalore("Full"), Mumbai("Full");
       
        String serviceLevel;
        private Branch(String serviceLevel){
            this.serviceLevel = serviceLevel;
        }
        
        public String getServiceLevel(){
          return serviceLevel;
        }

    
}
