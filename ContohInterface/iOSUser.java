
package ContohInterface;

public class iOSUser {
      private iOS phone;
    
    public iOSUser(iOS phone){
        this.phone = phone;
    }
    
    public void turnOnThePhone(){
        this.phone.powerOn();
    }
    
    public void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    public void makePhoneLouder(){
        this.phone.volumeUp();
    }
    
    public void makePhoneSilent(){
        this.phone.volumeDown();
    }
}
