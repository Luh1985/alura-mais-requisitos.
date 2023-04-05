
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDoIMDB implements ExtratorDeConteudo {

    public List<Conteudo> extraiConteudos(String json) {

        // pegar só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtrubutos = parser.parse(json);

        return listaDeAtrubutos.stream() // Lambdas
                .map(atributos -> new Conteudo(atributos.get("title"),
                        atributos.get("image").replaceAll("(@+)(.*) .jpg", "$1.jpg")))
                .toList();

        // List<Conteudo> conteudos = new ArrayList<>();
        // popular a lista de conteudos
        // for (Map<String, String> atributos : listaDeAtrubutos) {
        // String titulo = atributos.get("title");
        // String urlImagem = atributos.get("image")
        // .replaceAll("(@+)(.*) .jpg", "$1.jpg");
        // var conteudo = new Conteudo(titulo, urlImagem);
        // conteudos.add(conteudo);
        // }
        // return conteudos;
    }

}
