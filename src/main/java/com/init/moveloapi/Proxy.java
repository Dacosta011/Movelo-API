package com.init.moveloapi;

import java.util.ArrayList;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public class Proxy implements Iproxy {
//andres@gmail.com-Andres01*  daniel@gmail.com-Daniel01*
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
		ok = fac.crearBiciusuario(info);
		return ok;
	}

	@Override
	public ResponseEntity<?> login(@RequestBody String info) {
		ResponseEntity<?> res = ResponseEntity.ok(false);
		String[] partes = info.split("-");
		for(Stakeholder stake : this.usuarios) {
			if(stake.getlogin().equals(partes[0]) && stake.getpassword().equals(partes[1])) {
				res = ResponseEntity.ok(true);
				this.permitido = true;
				break;
			}
		}
		return res;
	}

	@Override
	public ResponseEntity<?> llamado(String info) {
		// TODO Auto-generated method stub
		return null;
	}

}
