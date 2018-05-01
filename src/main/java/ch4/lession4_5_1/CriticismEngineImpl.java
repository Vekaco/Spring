package ch4.lession4_5_1;

public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl(){}
    @Override
    public String getCriticism() {
        int i = (int)(Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    @Override
    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;

    }
    private String[] criticismPool;
}
