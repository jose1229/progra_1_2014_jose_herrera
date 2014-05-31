/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Miguel
 */
public class diames {

    int diames;
    int año;
    String operacion;

    public String operacion1(int  diames) {
        return ("El mes tiene 31 dias");
    }

    public String operacion2(int  diames) {
        return ("El mes tiene 30 dias");
    }

    public String operacion3(int  diames) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return ("El mes tiene 29 dias");
        } else {
            return ("El mes tiene 28 dias");
        }
    }

}
