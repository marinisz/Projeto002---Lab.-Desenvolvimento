package lab.desenvolvimento.regaluweb.controller;

import lab.desenvolvimento.regaluweb.dto.RequisicaoNovoPedido;
import lab.desenvolvimento.regaluweb.models.Pedido;
import lab.desenvolvimento.regaluweb.models.Veiculo;
import lab.desenvolvimento.regaluweb.repositories.PedidoRepository;
import lab.desenvolvimento.regaluweb.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Binding;
import javax.validation.Valid;
import java.net.BindException;
import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping("listarVeiculo")
    public ModelAndView listVeiculos(){
        List<Veiculo> veiculos = this.veiculoRepository.findAll();
        System.out.println("procurando veiculos");
        ModelAndView mv = new ModelAndView("veiculos/index");
        mv.addObject("veiculos",veiculos);
        return mv;
    }

    @GetMapping("/pedido/new")
    public String nova(){
        return "pedido/cadastrar";
    }

    @PostMapping("/pedido")
    public String create(@Valid RequisicaoNovoPedido requisicao, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("tem erros");
            return "redirect:/pedido/new";
        }else{
            Pedido pedido = requisicao.toPedido();
            System.out.println(requisicao);
            System.out.println(pedido);
            this.pedidoRepository.save(pedido);
        }
        return "redirect:/";
    }

    @GetMapping("pedido/{id}/delete")
    public String delete(@PathVariable Long id){
        this.pedidoRepository.deleteById(id);
        return "redirect:/pedido";
    }
}