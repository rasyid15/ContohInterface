
package ContohInterface;

public class PhoneUser {
    private Phone phone;
    
    public PhoneUser(Phone phone){
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
