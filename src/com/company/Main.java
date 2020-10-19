package com.company;

public class Main {

    public static void main(String[] args) {
        Europe scotland = new Europe(77.91, CitiesOfTheEurasia.EDINBURGH,
                843);

        scotland.northEurope("Scotland", "Kingdom Of Scotland, 843 — 1707-yy.");
        System.out.println("Area Of Scotland: " + scotland.getArea() + " thsnd km²" +
                "\nCapital City: " + CitiesOfTheEurasia.EDINBURGH +
                "\nFoundation Date: " + scotland.getFoundationDate() + " - y." +
                "\n____________________" + "\n____________________");


        Netherlands amsterdam = new Netherlands(219.3, CitiesOfTheEurasia.AMSTERDAM,
                1300, new PeopleOfNetherlands(821752, 177));

        amsterdam.mostBeautifulPlaces("Of Amsterdam: Vondel Park, Amsterdam Zoo, " +
                "Herengracht, Hortus Botanicus");
        System.out.println("Area Of Amsterdam: " + amsterdam.getArea() +"km²" +
                "\nName Of City: " + CitiesOfTheEurasia.AMSTERDAM +
                "\nFoundation Date: " + amsterdam.getFoundationDate() + " - y." +
                "\nPopulation: " + new PeopleOfNetherlands(821752,177).getQuantity() +
                "\nNumber Of Nations: " + new PeopleOfNetherlands(821752,177).getNations() +
                "\n____________________" + "\n____________________");


        Netherlands rotterdam = new Netherlands(325.8, CitiesOfTheEurasia.ROTTERDAM, 1340,
                new PeopleOfNetherlands(631155, 180));

        rotterdam.mostBeautifulPlaces("In Rotterdam: Kunsthal Rotterdam, " +
                "Maritime Museum Rotterdam, etc.", "CityHub Rotterdam, H2OTEL, nhow Rotterdam, etc.");
        System.out.println("Area Of Rotterdam: " + rotterdam.getArea() + "km²" +
                "\nName Of City: " + CitiesOfTheEurasia.ROTTERDAM +
                "\nFoundation Date: " + rotterdam.getFoundationDate() + " - y." +
                "\nPopulation: " + new PeopleOfNetherlands(631115,180).getQuantity() +
                "\nNumber Of Nations: " + new PeopleOfNetherlands(631115,180).getNations());
    }
}
