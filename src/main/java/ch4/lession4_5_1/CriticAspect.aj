package ch4.lession4_5_1;

public aspect CriticAspect {
    public CriticAspect() {}

    pointcut performance() : execution(* perform(..));


    after() : performance() {
        System.out.printf(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine = criticismEngine;
    }
}
