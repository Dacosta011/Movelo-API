package com.init.moveloapi;

import java.util.ArrayList;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public class Proxy implements Iproxy {

	private boolean permitido = false;
	public ArrayList<Stakeholder> usuarios;
	private Facade fac;
	private static Proxy proxy;

	public static Proxy getInstance() {

		if (proxy == null) {
			proxy = new Proxy();
		}
		return proxy;
	}
	
	public Proxy() {
        this.usuarios = new ArrayList<Stakeholder>();
    }

	
	public ResponseEntity<?> registro(@RequestBody String info) {
		ResponseEntity<?> ok = null;
		this.fac = Facade.getInstance();
		ok = fac.llamado(info);
		return ok;
	}

	@Override
	public ResponseEntity<?> login(@RequestBody String info) {
		for(Stakeholder s : this.usuarios) {
			System.out.println(s);
		}
		String[] parametros = info.split("-");
		System.out.println(info);
		ResponseEntity<?> res = ResponseEntity.ok(false);
		if (!usuarios.isEmpty()) {
			for (Stakeholder stake : this.usuarios) {
				if (stake.getlogin().equals(parametros[0]) && stake.getpassword().equals(parametros[1])) {
					this.permitido = true;
					res = ResponseEntity.ok(true);
				} else {
					this.permitido = false;
					res = ResponseEntity.ok(false);
				}
			}
		}else {
			System.out.println("no hay usuarios");
		}
		return res;
	}

	@Override
	public ResponseEntity<?> llamado(String info) {
		// TODO Auto-generated method stub
		return null;
	}

}
