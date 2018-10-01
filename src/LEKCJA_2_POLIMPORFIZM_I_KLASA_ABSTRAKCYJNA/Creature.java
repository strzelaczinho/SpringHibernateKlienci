
package LEKCJA_2_POLIMPORFIZM_I_KLASA_ABSTRAKCYJNA;
abstract public class Creature 
{
    protected String name;
    protected int weight;
    protected String sound;
    
    public abstract void setName(String newname);
    public abstract String getName();
    public abstract void setWeight(double newWeight);
    public abstract double getWeight();
    
}
// protected fields sa jak pola prywatne ale podklasy moga je dziedzicyzc.
// Brak zmiennych abstrakcyjnych , wszystkie metody nie musza byc abstrakcyjne , mozna miec statyczne metody
// w interfejsie musza byc abstrakcyjne
// nie mozna tworzyc obiektow klas abstrkcyjnych , ale podklasy moga uzywac poprzez slowo extended.
// 