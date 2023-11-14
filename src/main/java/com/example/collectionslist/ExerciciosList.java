package com.example.collectionslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {
        List<TempMensal> tempMensal = new ArrayList<>(){{
            add(new TempMensal("Janeiro",22d));
            add(new TempMensal("Fevereiro",23d));
            add(new TempMensal("Março",21d));
            add(new TempMensal("Abril",22d));
            add(new TempMensal("Maio",20d));
            add(new TempMensal("Junho",19d));
        }};

        Iterator<TempMensal> iterator = tempMensal.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            TempMensal next = iterator.next();
            soma += next.getTemperatura();
        }
        double media = soma/tempMensal.size();

        System.out.println("Média da temperatura Semestral é: "  + media);

        System.out.println("Meses com temperatura acima da média:");
        for (TempMensal temp : tempMensal) {
            if (temp.getTemperatura() > media) {
                System.out.println(temp.getMes() +  " " + temp.getTemperatura());
            }
        }


    }
}


class TempMensal implements Comparable<TempMensal> {
    private String Mes;
    private Double Temperatura;

    public TempMensal(String mes, Double temperatura) {
        Mes = mes;
        Temperatura = temperatura;
    }

    public String getMes() {
        return Mes;
    }

    public Double getTemperatura() {
        return Temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "Mes='" + Mes + '\'' +
                ", Temperatura=" + Temperatura +
                '}';
    }

    @Override
    public int compareTo(TempMensal m) {
        return 0;
    }
}