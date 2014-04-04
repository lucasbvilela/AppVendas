package br.com.appvendas;

import br.com.appvendas.telas.Vendas;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_principal);

	}

	//Eventos dos botoes da tela principal
	public void bVendas(View v) {
		//Botao de Vendas
		startActivity(new Intent(this, Vendas.class));
	}

	public void bClientes(View v) {

	}

	public void bProdutos(View v) {

	}

	public void bRelatorios(View v) {

	}

	public void bCatalogo(View v) {

	}
}