public enum API {
    IMDB_TOP_MOVIE("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json"),
    NASA("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD-JamesWebbSpaceTelescope.json");

    private String url;

    API(String url) {
        this.url = url;

    }

    public String getUrl() {
        return url;

    }
}
