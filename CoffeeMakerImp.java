
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

    //����ˮ���м���������״̬
    @Override
    public void setBoilerState(int boilerStatus) {
       this.BoilerStatus = boilerStatus;
    }

    //���ñ����̵ļ�����������״̬
    @Override
    public void setWarmerState(int warmerState) {
        this.WarmerState = warmerState;
       
    }

    //����ָʾ��״̬
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
            //���ˮ��ǿ��Ұ�ť�����£���ˮ�俪ʼ��ˮ
            cm.setBoilerState(BOILER_ON);
        } else {//����ֹͣ��ˮ
            cm.setBoilerState(BOILER_OFF);
        }
        
        //���������п��Ⱥ����ҿ��Ⱥ����п��ȣ���ʼ����
        if(cm.getWaremerPlateStatus() == POT_NOT_EMPTY) {
            cm.setWarmerState(WARMER_ON);
        } else {
            cm.setWarmerState(WARMER_OFF);
        }
        
        //йѹˮ���Ĳ���
        if(cm.getBrewButtonStatus() == BREW_BUTTON_PUSHED && cm.getBoilerStatus() == BOILER_NOT_EMPTY && cm.getWaremerPlateStatus() == WARMER_EMPTY) {
            //��ť����״̬�����ˮ�䲻Ϊ�գ��Ҵ�ʱ���������޿��Ⱥ������йѹ����
            cm.setReliefValveState(VALVE_OPEN);
        } else {
            cm.setReliefValveState(VALVE_CLOSED);
        }
        
      //����ָʾ��״̬��������ú�������(������õĶ����������ģ�ˮ�տ���ˮ���ꣿ)
        //��ÿ��Ⱥ��ָʾ��
        if(cm.getBrewButtonStatus() == BREW_BUTTON_PUSHED && cm.getBoilerStatus() == BOILER_EMPTY) {
            //??
            cm.setIndicatorState(INDICATOR_ON);
        } else {
            cm.setIndicatorState(INDICATOR_OFF);
        }
        
    }

}
