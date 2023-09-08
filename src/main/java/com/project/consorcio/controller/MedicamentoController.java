package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.services.MedicamentoServices;
import com.project.consorcio.services.TipoMedicamentoServices;

/**Permite que la vista envie un Request accediendo a las diferentes direcciones URL's**/
@Controller
/**Permite crear direcciones URL para acceder a los controladores**/
@RequestMapping("/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoServices servicioMedicamento;
	@Autowired
	private TipoMedicamentoServices servicioTipoMedicamento;
	
	/**Creacion de direccion URL para mostrar la página Medicamento.html**/
	@RequestMapping("/lista")
	public String index(Model model) {
		/**Crear Atributo**/
		model.addAttribute("medicamentos", servicioMedicamento.listarTodos());
		model.addAttribute("tipos",servicioTipoMedicamento.listarTodos());
		return "medicamento";
	}

}
