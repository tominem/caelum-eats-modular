open module br.com.caelum.eats {

	exports br.com.caelum.eats to spring.boot.devtools;

	requires java.sql;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.webmvc;

	requires br.com.caelum.eats.distancia;
	requires br.com.caelum.eats.pagamento;
	requires br.com.caelum.eats.seguranca;
}