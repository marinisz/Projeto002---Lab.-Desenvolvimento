package lab.desenvolvimento.regaluweb.controller;

import lab.desenvolvimento.regaluweb.dto.RequisicaoNovoUsuario;
import lab.desenvolvimento.regaluweb.models.Usuario;
import lab.desenvolvimento.regaluweb.repositories.UsuarioRepository;
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
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("usuario")
    public ModelAndView login(){

        List<Usuario> usuarios = this.usuarioRepository.findAll();
        System.out.println("rodando usuario");
        ModelAndView mv = new ModelAndView("usuarios/index");
        mv.addObject("usuarios",usuarios);
        return mv;
    }

    @GetMapping("/usuario/new")
    public String nova(){
        return "usuarios/cadastrar";
    }

    @PostMapping("/usuario")
    public String create(@Valid RequisicaoNovoUsuario requisicao, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("tem erros");
            return "redirect:/usuario/new";
        }else{
            Usuario usuario = requisicao.toUsuario();
            System.out.println(requisicao);
            System.out.println(usuario);
            this.usuarioRepository.save(usuario);
        }
        return "redirect:/";
    }

    @GetMapping("usuario/{id}/delete")
    public String delete(@PathVariable Long id){
        this.usuarioRepository.deleteById(id);
        return "redirect:/usuario";
    }

}