package LEKCJA_24_MEDIATOR_DESIGN_PATTERN;

public class JTPoorman extends Colleague{
    public JTPoorman(Mediator newMediator) {
        super(newMediator);
        System.out.println("JT Poorman signed up with the stockexchange\n");
    }
}

