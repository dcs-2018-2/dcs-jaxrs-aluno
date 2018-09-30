package br.pro.ramon.dcs.jaxrs.aluno;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno implements Serializable {

    private String nome;
    private double p1, p2;

    protected Aluno() {
    }

    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    @XmlElement
    public double getMedia() {
        return (p1 + p2) / 2;
    }

    @XmlElement
    public boolean isAprovado() {
        return getMedia() >= 6;
    }

}
