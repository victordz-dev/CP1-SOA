package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return """
        ===== MENU DE VINHOS =====

        Uva: Cabernet Sauvignon
        - Don Melchor (Chile)
        - Catena Zapata (Argentina)
        - Robert Mondavi (EUA)

        Uva: Merlot
        - Château Petrus (França)
        - Duckhorn Merlot (EUA)
        - Casa Valduga Merlot (Brasil)

        Uva: Pinot Noir
        - Domaine de la Romanée-Conti (França)
        - Meiomi Pinot Noir (EUA)
        - Salton Pinot Noir (Brasil)

        Uva: Chardonnay
        - Louis Jadot Chardonnay (França)
        - Kendall-Jackson Chardonnay (EUA)
        - Miolo Chardonnay (Brasil)

        Uva: Sauvignon Blanc
        - Cloudy Bay (Nova Zelândia)
        - Concha y Toro (Chile)
        - Garibaldi Sauvignon Blanc (Brasil)

        ==========================
        """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido Confirmado!";
    }
}
