
public interface CoffeeMakerAPI {

    public static CoffeeMakerAPI api = null;
    
    /*
     * 获取保温盘的状态：0:WARMER_EMPTY、1:POT_EMPTY、2:POT_NOT_EMPTY
     */
    public int getWaremerPlateStatus();
    
    public static final int WARMER_EMPTY = 0;
    public static final int POT_EMPTY = 1;
    public static final int POT_NOT_EMPTY = 2;
    
    /*
     * 获取水箱状态
     * 0:BOILER_EMPTY
     * 1:BOILER_NOT_EMPTY
     */
    public int getBoilerStatus();
    public static final int BOILER_EMPTY = 0;
    public static final int BOILER_NOT_EMPTY = 1;
    
    /*
     * 获取工作按钮的状态
     */
    public int getBrewButtonStatus();
    public static final int BREW_BUTTON_PUSHED = 0;
    public static final int BREW_BUTTON_NOT_PUSHED = 1;
    
    /*
     * 设置水箱中加热器件的状态（开/关）
     */
    public void setBoilerState(int boilerStatus);
    public static final int BOILER_ON = 0;
    public static final int BOILER_OFF = 1;
    
    /*
     * 设置保温盘的加热器件状态（开/关）
     */
    public void setWarmerState(int warmerState);
    public static final int WARMER_ON = 0;
    public static final int WARMER_OFF = 1;
    
    /*
     * 设置指示灯状态，咖啡煮好后则亮起
     */
    public void setIndicatorState(int indicateState);
    public static final int INDICATOR_ON = 0;
    public static final int INDICATOR_OFF = 1;
    
    /*
     * 设置泄压阀门状态，开启时减小水箱压力，压力下降后开水就不会被压到咖啡粉上，咖啡流就终止
     */
    public void setReliefValveState(int reliefValveState);
    public static final int VALVE_OPEN = 0;
    public static final int VALVE_CLOSED = 1;
    
    
}
