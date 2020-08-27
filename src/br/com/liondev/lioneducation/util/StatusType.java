package br.com.liondev.lioneducation.util;

public enum StatusType {
        
    PENDING(1, "PENDENTE"),
    STUDIED(2, "ESTUDADO");
    
    private final int id;
    private final String name;

    StatusType(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public static String getIdByName(int id) {
        switch (id) {
            case 1:
                return PENDING.name;
            case 2:
                return STUDIED.name;
            default:
                return "Indefinido";
        }
    }
}
