package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AudioMusicaTests extends BaseTests{


    @Test
    public void testBuscarArticulo() {

        String nombreProducto = "Piano";


       // Assert.assertTrue(loginPage.fail());
        loginPage.Login("", "");

        //Assert.assertTrue(loginPage.ok());
        loginPage.Login("jpleal79@hotmail.com", "serrano832");

        Assert.assertTrue(homePage.at());
        homePage.buscarEnCajaDeTexto(nombreProducto);

        Assert.assertTrue(filtrarPage.linkMarcaDisponible());
        filtrarPage.CategoríaMarca();

        Assert.assertTrue(filtrarPage.at());
        filtrarPage.obtenerDatosDeListaDeMarcas();

        Assert.assertTrue(agregarPage.articuloDisponible());
        agregarPage.seleccionarArticulo();

        Assert.assertTrue(agregarPage.at());
        agregarPage.verStockEnTienda();

    }
}

