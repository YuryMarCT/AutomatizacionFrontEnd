package com.siigo.gastaging.stepdefinitions;

import com.siigo.gastaging.models.Formulario;
import com.siigo.gastaging.questions.ValidacioPaginaDashboard;
import com.siigo.gastaging.tasks.FormularioCliente;
import com.siigo.gastaging.tasks.IniciarSesion;
import com.siigo.gastaging.tasks.IrCrearCliente;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.siigo.gastaging.utils.constantes.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearTercero {

    @Before
    public void preparar() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void doAfter() {
        OnStage.drawTheCurtain();
    }

    @DataTableType
    public Formulario dataCliente(Map<String, String> entry) {
        System.out.println("El usuario ingresa los campos obligatorios: " + entry);
        return new Formulario(
                entry.get("nombres"),
                entry.get("apellidos"),
                entry.get("identificacion"),
                entry.get("ciudad")
        );
    }

    @Dado("que el {string} ingresa a la url")
    public void queElIngresaALaUrl(String usuario) {
        theActorCalled(usuario).attemptsTo(Open.url(URL));
    }

    @Cuando("se autentica con sus credenciales {string}{string}")
    public void seAutenticaConSusCredenciales(String Correo, String Idenfificacion) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.con(Correo, Idenfificacion));
    }

    @Entonces("vemos la pagina principal de gastanging.siigo")
    public void vemosLaPaginaPrincipalDeGastangingSiigo() {
        theActorInTheSpotlight().should(seeThat(ValidacioPaginaDashboard.valida()));
    }

    @Y("navega a la seccion de creacion de clientes")
    public void navegaALaSeccionDeCreacionDeTerceros() {
        theActorInTheSpotlight().attemptsTo(IrCrearCliente.ir());
    }

    @Y("completa el formulario de cliente con la siguiente información:")
    public void completaElFormularioDeTerceroConLaSiguienteInformación(List<Formulario> dataCliente) {
        theActorInTheSpotlight().attemptsTo(FormularioCliente.formulario(dataCliente.get(0)));
    }

    @Y("envia el formulario para crear el tercero")
    public void enviaElFormularioParaCrearElTercero() {
    }

    @Entonces("verificamos el registro exitoso del cliente en la lista de clientes")
    public void verificamoElRegistroExitosoDelTercero() {
    }
}