package rodri.san.ro;

public class Punto {


    int x1;

    int x2;

    int y1;

    int y2;

    public Punto(int x1, int x2, int y1, int y2) {

        this.x1 = x1;

        this.x2 = x2;

        this.y1 = y1;

        this.y2 = y2;
    }

    public double distancia(int x1, int x2, int y1, int y2) {

        double respuesta;

        double res1, res2;

        res1 = this.x2 - this.x1;

        res2 = this.y2 - this.y1;

        res1 = Math.pow(res1, 2) + Math.pow(res2, 2);

        respuesta = Math.sqrt(res1);

        return respuesta;

    }

}




