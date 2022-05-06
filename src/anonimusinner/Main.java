package anonimusinner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        MonitoringSystem generalIndicatorMonitoringModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };
        MonitoringSystem errorIndicatorMonitoringModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem(){
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        generalIndicatorMonitoringModule.startMonitoring();
        errorIndicatorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();

    }

    /*
    * new <ИМЕНИ_НЕТ> <родительский класс/реализуемый интерфес>(параметры родительсвкого контруктора){
    * }:
    */
}

/*
class  GeneralIndicatorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал!");


    }
}
class  ErrorIndicatorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");


    }
}
class  SecurityModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");


    }
}*/
