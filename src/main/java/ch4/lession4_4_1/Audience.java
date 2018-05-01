package ch4.lession4_4_1;


import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }


    public void applause() {
        System.out.println("CLAP CLAP CLAP!");
    }


    public void demandRefund(){
        System.out.println("Demanding a refund");
    }



    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            silenceCellPhones();
            takeSeats();
            jp.proceed();
            applause();
        } catch (Throwable e) {
            demandRefund();
        }
    }

    }
