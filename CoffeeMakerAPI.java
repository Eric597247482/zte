
public interface CoffeeMakerAPI {

    public static CoffeeMakerAPI api = null;
    
    /*
     * ��ȡ�����̵�״̬��0:WARMER_EMPTY��1:POT_EMPTY��2:POT_NOT_EMPTY
     */
    public int getWaremerPlateStatus();
    
    public static final int WARMER_EMPTY = 0;
    public static final int POT_EMPTY = 1;
    public static final int POT_NOT_EMPTY = 2;
    
    /*
     * ��ȡˮ��״̬
     * 0:BOILER_EMPTY
     * 1:BOILER_NOT_EMPTY
     */
    public int getBoilerStatus();
    public static final int BOILER_EMPTY = 0;
    public static final int BOILER_NOT_EMPTY = 1;
    
    /*
     * ��ȡ������ť��״̬
     */
    public int getBrewButtonStatus();
    public static final int BREW_BUTTON_PUSHED = 0;
    public static final int BREW_BUTTON_NOT_PUSHED = 1;
    
    /*
     * ����ˮ���м���������״̬����/�أ�
     */
    public void setBoilerState(int boilerStatus);
    public static final int BOILER_ON = 0;
    public static final int BOILER_OFF = 1;
    
    /*
     * ���ñ����̵ļ�������״̬����/�أ�
     */
    public void setWarmerState(int warmerState);
    public static final int WARMER_ON = 0;
    public static final int WARMER_OFF = 1;
    
    /*
     * ����ָʾ��״̬��������ú�������
     */
    public void setIndicatorState(int indicateState);
    public static final int INDICATOR_ON = 0;
    public static final int INDICATOR_OFF = 1;
    
    /*
     * ����йѹ����״̬������ʱ��Сˮ��ѹ����ѹ���½���ˮ�Ͳ��ᱻѹ�����ȷ��ϣ�����������ֹ
     */
    public void setReliefValveState(int reliefValveState);
    public static final int VALVE_OPEN = 0;
    public static final int VALVE_CLOSED = 1;
    
    
}
