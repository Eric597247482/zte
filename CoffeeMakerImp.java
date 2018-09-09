
public class CoffeeMakerImp implements CoffeeMakerAPI {
    
    private int WarmerPlateStatus;
    private int BoilerStatus;
    private int BrewButtonStatus;
    private int BoilerState;
    private int WarmerState;
    private int IndicateState;
    private int ReliefValveState;
    
    @Override
    public int getWaremerPlateStatus() {
        return this.WarmerPlateStatus;
    }

    @Override
    public int getBoilerStatus() {
        return this.BoilerState;
    }

    @Override
    public int getBrewButtonStatus() {
        return this.BrewButtonStatus;
    }

    //设置水箱中加热器件的状态
    @Override
    public void setBoilerState(int boilerStatus) {
       this.BoilerStatus = boilerStatus;
    }

    //设置保温盘的加热器件开关状态
    @Override
    public void setWarmerState(int warmerState) {
        this.WarmerState = warmerState;
       
    }

    //设置指示灯状态
    @Override
    public void setIndicatorState(int indicateState) {
       this.IndicateState = indicateState;
            
    }

    @Override
    public void setReliefValveState(int reliefValveState) {
        this.ReliefValveState = reliefValveState;
    }

    
    
    public CoffeeMakerImp() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CoffeeMakerAPI  cm = new CoffeeMakerImp();
        if(cm.getBoilerStatus() == BOILER_NOT_EMPTY && cm.getBrewButtonStatus() == BREW_BUTTON_PUSHED) {
            //如果水箱非空且按钮被按下，则水箱开始烧水
            cm.setBoilerState(BOILER_ON);
        } else {//否则停止烧水
            cm.setBoilerState(BOILER_OFF);
        }
        
        //保温盘中有咖啡壶，且咖啡壶中有咖啡，则开始保温
        if(cm.getWaremerPlateStatus() == POT_NOT_EMPTY) {
            cm.setWarmerState(WARMER_ON);
        } else {
            cm.setWarmerState(WARMER_OFF);
        }
        
        //泄压水阀的操作
        if(cm.getBrewButtonStatus() == BREW_BUTTON_PUSHED && cm.getBoilerStatus() == BOILER_NOT_EMPTY && cm.getWaremerPlateStatus() == WARMER_EMPTY) {
            //按钮按下状态，如果水箱不为空，且此时保温盘上无咖啡壶，则打开泄压阀门
            cm.setReliefValveState(VALVE_OPEN);
        } else {
            cm.setReliefValveState(VALVE_CLOSED);
        }
        
      //设置指示灯状态，咖啡煮好后则亮起(咖啡煮好的定义是怎样的？水烧开？水烧完？)
        //煮好咖啡后的指示灯
        if(cm.getBrewButtonStatus() == BREW_BUTTON_PUSHED && cm.getBoilerStatus() == BOILER_EMPTY) {
            //??
            cm.setIndicatorState(INDICATOR_ON);
        } else {
            cm.setIndicatorState(INDICATOR_OFF);
        }
        
    }

}
