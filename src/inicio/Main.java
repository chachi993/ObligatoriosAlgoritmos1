package inicio;

import dominio.Camion;
import sistemaDistribucion.*;
import tads.ListaOrdenada;
import tads.ListaOrdenadaImplementada;

public class Main {

    public static void main(String[] args) {

        //------------------- 2.1 Crear Sistema de Distribucion ------------------------------------------------------------
        IObligatorio obli = new Sistema();

        obli.crearSistemaDeDistribucion(200);

        //------------------- 2.2 Crear Cliente ------------------------------------------------------------------------------
        obli.agregarCliente("Juan Perez", "1234567898765", 24876543, "8 de Octubre 2105");
        obli.agregarCliente("Romina Lopez", "12345672345", 26226250, "18 de Julio 2056");
        obli.agregarCliente("Florencia Ramirez", "6574367898765", 2678729, "Nin y Silva 6574");
        obli.agregarCliente("Diego Martinez", "22224567898765", 24356789, "Rivera 4567");
        obli.agregarCliente("Julia Quintana", "222456756743", 26509876, "Bolivia 4352");
        obli.agregarCliente("Santiago Rivero", "5554567898976", 24878382, "Av Italia 1234");

        obli.listarClientesOrdenado();

        //------------------- 2.4 Agregar Camion -------------------------------------------------------------------------------
        obli.agregarCamion("ABC1234", 5);
        obli.agregarCamion("ABB1111", 9);
        obli.agregarCamion("ACC2222", 6);
        obli.agregarCamion("ADD3333", 4);
        obli.agregarCamion("AEE3333", 4);
        obli.listarCamiones();

        //-------------------- 2.6 Registrar Producto ----------------------------------------------------------------------------
        obli.registrarProducto("Perfume Gardenia", "Aroma floral");
        obli.registrarProducto("TV 50pulgadas", "Smart TV HD ");
        obli.registrarProducto("Mesa de madera", "Madera de Nogal");
        obli.registrarProducto("Jabon liquido", "Lavanda 100ml");
        obli.listarProductos();

        //-------------------- 3.1 Registrar Alta de Stock de Producto ----------------------------------------------------------------
        obli.altaDeStockDeProducto("ADD3333", 1, 1, 20);
        obli.altaDeStockDeProducto("AEE3333", 2, 2, 13);
        obli.altaDeStockDeProducto("ADD3333", 2, 3, 6);
        obli.altaDeStockDeProducto("ACC2222", 3, 4, 8);
        obli.altaDeStockDeProducto("ABC1234", 1, 4, 12);
        obli.altaDeStockDeProducto("ABB1111", 3, 2, 9);
        obli.listarProductos();

        //-------------------- 3.2 Retiro de Productos para Envio a Cliente ----------------------------------------------------------------
        obli.retiroDeProducto("ADD3333", "1234567898765", 1, 20);
        obli.retiroDeProducto("ABB1111", "222456756743", 2, 24);
        obli.retiroDeProducto("ADD3333", "1234567898765", 3, 12);
        obli.retiroDeProducto("ADD3333", "222456756743", 1, 3);
        obli.retiroDeProducto("AEE3333", "6574367898765", 2, 5);

        //------------------- 2.3 Eliminar Cliente ----------------------------------------------------------------------------
        obli.eliminarCliente("1234567898765");
        obli.eliminarCliente("12345672345");

        obli.listarClientesOrdenado(); //VER ESTE ERROR

        //-------------------- 2.5 Eliminar Camion ----------------------------------------------------------------------------
        obli.eliminarCamion("AEE3333");
        obli.eliminarCamion("ACC2222");

        obli.listarCamiones();

        //-------------------- 4.4 Ultimo Producto Registrado --------------------------------------------------------------------------------
        obli.ultimoProductoRegistrado();

        //-------------------- 4.5 Listar Envíos De Producto -----------------------------------------------------------------------------------
        obli.listarEnvíosDeProducto(1);
        obli.listarEnvíosDeProducto(2);
        obli.listarEnvíosDeProducto(3);
        obli.listarEnvíosDeProducto(4);

        //-------------------- 4.6 Listar Ordenes Pendientes ------------------------------------------------------------------------------------
        obli.listarOrdenesPendientes(1);
        obli.listarOrdenesPendientes(2);
        obli.listarOrdenesPendientes(3);
        obli.listarOrdenesPendientes(4);

        //-------------------- 4.7 Reporte de Envios Por Producto ---------------------------------------------------------------------------------
        int[][] matriz = obli.reporteDeEnviosDeProductos();

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
}
