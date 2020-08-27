package br.com.liondev.lioneducation.util;

public enum ImportanceType {
        
    LITTLE(1, "PEQUENA"),
    AVERAGE(2, "MEDIA"),
    MUCH(3, "MUITA");
    
    private final int id;
    private final String name;

    ImportanceType(int id, String name) {
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
                return LITTLE.name;
            case 2:
                return AVERAGE.name;
            case 3:
                return MUCH.name;
            default:
                return "Indefinido";
        }
    }
}