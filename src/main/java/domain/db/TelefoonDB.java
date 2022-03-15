package domain.db;

import domain.model.Telefoon;

import java.util.ArrayList;
import java.util.List;

public class TelefoonDB {
    private int sequence = 0;
    private List<Telefoon> telefoons = new ArrayList<>();

    public TelefoonDB(){
        Telefoon iphone = new Telefoon("Iphone" , 909,2019);
        Telefoon huawei = new Telefoon("Huawei" , 700,2017);
        Telefoon samsung = new Telefoon("Samsung" , 843,2018);

        add(iphone);
        add(huawei);
        add(samsung);
    }

    public void add(Telefoon telefoon) {
        if (telefoon == null)
            throw new IllegalArgumentException("telefoon mag niet null zijn");

        this.sequence++;
        telefoon.setId(sequence);
        telefoons.add(telefoon);
    }

    public List<Telefoon> getTelefoons() {
        return telefoons;
    }
}
