/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatLoto;

import java.util.ArrayList;

/**
 *
 * @author Elina
 */
public class Variation {
    public int variationNr;
    public int correctNumbers = 0;
    public ArrayList<Integer> selectedNumbers = new ArrayList<>();
    
    public Variation(int var, int correct, ArrayList<Integer> list){
        this.variationNr = var;
        this.correctNumbers = correct;
        this.selectedNumbers = list;
    }

    public Variation() {
        this.variationNr = 0;
        this.correctNumbers = 0;
        this.selectedNumbers = null;
    }

    public int getVariationNr() {
        return variationNr;
    }

    public int getCorrectNumbers() {
        return correctNumbers;
    }

    public ArrayList<Integer> getSelectedNumbers() {
        return selectedNumbers;
    }

    public void setVariationNr(int variationNr) {
        this.variationNr = variationNr;
    }

    public void setCorrectNumbers(int correctNumbers) {
        this.correctNumbers = correctNumbers;
    }

    public void setSelectedNumbers(ArrayList<Integer> selectedNumbers) {
        this.selectedNumbers = selectedNumbers;
    }
}
