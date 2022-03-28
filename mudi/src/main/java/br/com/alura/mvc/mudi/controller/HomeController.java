package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiomi Redmi Note 8");
//		pedido.setUrlImagem("https://images.kabum.com.br/produtos/fotos/sync_mirakl/192379/Usado-Xiaomi-Redmi-Note-8-64gb-Azul-Muito-Bom_1643901312_p.jpg");
		pedido.setUrlImagem("images\\Usado-Xiaomi-Redmi-Note-8-64gb-Azul.jpg");
		pedido.setUrlProduto("https://www.kabum.com.br/produto/192379/usado-xiaomi-redmi-note-8-64gb-azul-muito-bom?gclid=CjwKCAiA4KaRBhBdEiwAZi1zztcdUkzifFMko7S50l2wAuF2stDzKx-Knyf3Pdd7JvZa2Q_mWN3fSRoCTxgQAvD_BwE");
		pedido.setDescricao("Xiomi azul");
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
