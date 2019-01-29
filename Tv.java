

/**
 *
 * @author cc4-13
 */
public class Tv {
    private int channel;
    private int volume;
    private boolean power;
    
    public Tv(){
    this.channel=1;
    this.volume=0;
    this.power=false;
    }
    
    public int getChannel(){
        return channel;       
    }
    
    public int getVolume (){
        return volume;
    }
    
    public boolean getpower(){
     return power;
     
    }
    
    public void setChannel(int Channel){
            this.channel = Channel;
    }
    public void setVolume(int v){
        volume = v;
    }
    public void setPower(boolean power){
    this.power = power;
    }
    
    public int increaseChannel(){
        if(power == true)
            channel++;
        return channel;
    }
    public int decreaseChannel(){
        if(power == true)
            channel--;
        return channel;
        
    }
}

