package br.pro.ramon.dcs.jaxrs.aluno;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/aluno")
public class AlunoResource {

    @GET
    @Produces("application/json; charset=UTF-8")
    public Response getMedia(@QueryParam("nome") String nome, @QueryParam("p1") String p1, @QueryParam("p2") String p2) {
        try {
            double n1 = Double.parseDouble(p1);
            double n2 = Double.parseDouble(p2);

            Aluno aluno = new Aluno(nome, n1, n2);

            return Response.ok("{ \"media\": " + aluno.getMedia() + ", \"aprovado\": " + aluno.isAprovado() + " }").build();
        } catch (NumberFormatException ex) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

}
