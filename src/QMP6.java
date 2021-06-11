import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class QMP6 {

//1° Requerimiento

  class Usuario {
    Sugerencia sugerencia; //Esto viene de entregas anteriores
    String adress;

    void actualizarSugerencia(Sugerencia nuevaSugerencia) {
      this.sugerencia = nuevaSugerencia;
    }


    Sugerencia generarSugerencia() {
      (...)
    }
  }



  class Sugerencia{
  List<Prenda> prendas = new ArrayList<>():
  }

//2° requerimiento
  static class Usuarios{
  //Singleton
    List<Usuario> todosLosUsuarios = new ArrayList<>();
    void calcularSugerenciasDiarias() = {
        todosLosUsuarios.forEach(usuario -> {
      Sugerencia sugerencia = usuario.generarSugerencia();
       usuario.actualizarSugerencia(sugerencia); }
     }
}


//3° y 4° requerimiento

class Alertas{
      ServicioMetereologicoAccuWeather servicio;
     List<String> ultimasAlertas = new ArrayList<>();
     void actualizarAlertas{
       ultimasAlertas = servicio.getultimasAlertas("Buenos Aires");
  }
}


class ServicioMetereologicoAccuWeather{
      List<Interesado> observers = new ArrayList<>();
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<String> getultimasAlertas(String ciudad){
    Map<String, Object> alertas = apiClima.getAlertas(ciudad);
    return (List<String>) alertas.get("CurrentAlerts");


    void agregarObserver(Interesado interesado){
      observers.add(interesado);
    }

    void quitarObserver(Interesado interesado){
      observers.remove((interesado));
    }
  }

}
//6° requerimiento

interface Interesado{
      void notificar(Usuario usuario, Alertas alertas);
}

class TormentaObserver implements Interesado{
  @Override
  public void notificar(Usuario usuario,Alertas alertas) {
    if(alertas.contains("Tormenta")){
      this.notificationService.notify("Lleve paraguas");
    }
}
}
//7° requerimiento
  class GranizoObserver implements Interesado{
    @Override
    public void notificar(Usuario usuario, Alertas alertas) {
      if(alertas.contains("Granizo")){
        this.notificationService.notify("Evite salir en auto");
      }
    }
  }

//8° requerimiento

  class MailObserver implements Interesado{

    @Override
    public void notificar(Usuario usuario,Alertas alertas) {
      this.mailSender.send(usuario.adress(), alertas);
    }
    }

  }


