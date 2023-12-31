package Exercice9;
import java.util.ArrayList;
import java.util.List;
public interface Memento {
    void setEtat(List<OptionVehicule> options);
    List<OptionVehicule> getEtat();
}
