package co.edu.poli.builder.model;

public class Director {

	public House getHouse(String typeHouse) {

		House h;

		if (typeHouse.equals("h1")) {

			Ceil techo = new Ceil("concreto");
			Floor piso = new Floor("laminado", 70);
			Door puerta = new Door(2.0, 60, "pino", 6);
			Window ventana = new Window(60, 120, 3);
			Pool piscina = new Pool(200, 400, 300);

			h = new House.Builder()
					.withType("apto")
					.withCeil(techo)
					.withFloor(piso)
					.withDoor(puerta)
					.withWindow(ventana)
					.withPool(piscina)
					.build();

			Garden g = new Garden(5, 6);
			h.setGarden(g);

		} else {

			Ceil techo = new Ceil("concreto");
			Window ventana = new Window(60, 120, 3);
			Garden jardin = new Garden(6, 20);

			h = new House.Builder()
					.withType("house")
					.withCeil(techo)
					.withWindow(ventana)
					.withGarden(jardin)
					.build();
		}

		return h;
	}

}
