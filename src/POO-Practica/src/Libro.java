public class Libro {

        private String ISBN;
        private String Titulo;
        private String Autor;
        private String NroPag;

        public Libro(String ISBN, String Titulo, String Autor, String NroPag){
            this.ISBN = ISBN;
            this.Titulo = Titulo;
            this.Autor = Autor;
            this.NroPag = NroPag;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public void setTitulo(String Titulo){
            this.Titulo = Titulo;
        }

        public void setAutor(String Autor){
            this.Autor = Autor;
        }

        public void setNroPag(String NroPag){
            this.NroPag = NroPag;
        }


        public String getISBN() {
            return this.ISBN;
        }

        public String getAutor(){
            return this.Autor;
        }

        public String getTitulo(){
            return this.Titulo;
        }

        public String getNroPag(){
            return this.NroPag;
        }

        public String toString(){
            return "El libro '"+this.getTitulo()+"' con "+this.getISBN()+" creado por el autor "+this.getAutor()+" tiene "+this.getNroPag()+" paginas";
        }
/*

        public String toString() {  //creado con alt + insert
        return "Libro{" +
                "ISBN=" + ISBN +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NroPag=" + NroPag +
                '}';
    }*/
}
