package br.pro.ramon.dcs.jaxrs.aluno;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/aluno")
public class AlunoResource {

    @GET
    @Produces("application/json; charset=UTF-8")
    public String getMedia(@QueryParam("nome") String nome, @QueryParam("p1") double p1, @QueryParam("p2") double p2) {
        Aluno aluno = new Aluno(nome, p1, p2);

        return "{ \"media\": " + aluno.getMedia() + ", \"aprovado\": " + aluno.isAprovado() + " }";
    }

}
