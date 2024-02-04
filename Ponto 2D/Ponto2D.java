public class Ponto2D
{
  private double x, y;

  public Ponto2D(double x, double y){
    this.x = x;
    this.y = y;
  }

  public void inicializaPonto2D(double _x, double _y){
    x = _x;
    y = _y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public boolean eIgual(Ponto2D outroPonto2D){
    return (x == outroPonto2D.x) && (y == outroPonto2D.y);
  }

  public Ponto2D origem(){
    Ponto2D temporario = new Ponto2D(0, 0);
    temporario.inicializaPonto2D(0, 0);
    return temporario;
  }

  public Ponto2D clona(){
    Ponto2D temporario = new Ponto2D(0, 0);
    temporario.inicializaPonto2D(x, y);
    return temporario;
  }

  public String toString(){
    return "(" + x + "," + y + ")";
  }
}
