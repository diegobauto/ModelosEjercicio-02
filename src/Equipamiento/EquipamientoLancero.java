package Equipamiento;

public class EquipamientoLancero implements Equipamiento{

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraLancero();
    }

    @Override
    public Arma crearArma() {
        return new ArmaLancero();
    }

    @Override
    public Medio crearMedio() {
        return new MedioLancero();
    }
}
