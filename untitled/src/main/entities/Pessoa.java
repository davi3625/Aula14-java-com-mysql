package entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table (name = "pessoa")


public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String nome;
    private String email;



    public  Pessoa(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;





    }
}
