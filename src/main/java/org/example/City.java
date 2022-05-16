package org.example;

public class City {
    int id;
    String name;
    Double temp;
    @Override
    public String toString() {
        return "City{\n" +
                "id=" + id +
                ",\n name='" + name + '\'' +
                ",\n temp=" + temp + '\n' +
                '}';
    }
    //Gson gson = new Gson();
    //City[] gods = gson.fromJson( toString(), City[].class);

    public City(int id, String name, Double
            temp) {
        this.id = id;
        this.name = name;
        this.temp = temp;
    }
}
