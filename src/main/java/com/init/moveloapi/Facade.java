package com.init.moveloapi;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.lang.reflect.*;

public class Facade implements Iproxy {

	private static Facade facade;

	private ArrayList<Componente> compos;
	private ArrayList<Componente> compos2;

	Pattern pattern = Pattern
			.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	private Facade() {
		this.compos = new ArrayList<Componente>();
		this.compos2 = new ArrayList<Componente>();
	}

	public static Facade getInstance() {
		if (facade == null) {
			facade = new Facade();
		}
		return facade;
	}

	@Override
	public ResponseEntity<?> login(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> llamado(String info) {
		ResponseEntity<?> res = null;
		if (info.contains("-")) {
			String[] partes = info.split("-");
			try {
				Class thisclass = Facade.class;
				Method[] methods = thisclass.getDeclaredMethods();
				for (Method meto : methods) {
					if (meto.getName().equals(partes[0])) {
						res = (ResponseEntity<?>) meto.invoke(facade, info);
					}
				}
			} catch (Throwable e) {
				System.out.println(e);
			}
		} else {
			System.out.println("formato incorrecto");
		}
		return res;
	}
	
	
	public ResponseEntity<?> crearBiciusuario(String info) {
		this.compos2.clear();
        ResponseEntity<?> ok = ResponseEntity.ok(false);
        String[] parametros = info.split("-");
        if (this.compos.isEmpty()) {
            if (parametros.length == 5) {
                Matcher mather = pattern.matcher(parametros[3]);
                if (mather.find() == true) {
                    if (parametros[1].length() <= 50) {
                        char[] clave = parametros[4].toCharArray();
                        int contamays = 0;
                        int contanum = 0;
                        int contaespe = 0;
                        for (int i = 0; i <= clave.length - 1; i++) {
                            if (Character.isUpperCase(clave[i])) {
                                contamays++;
                            } else if (Character.isDigit(clave[i])) {
                                contanum++;
                            } else if (!Character.isDigit(clave[i]) && !Character.isLetter(clave[i])
                                    && !Character.isSpace(clave[i])) {
                                contaespe++;
                            }
                        }
                        if (contamays >= 1 && contanum >= 1 && contaespe >= 1) {
                            Proxy pro = Proxy.getInstance();

                            Componente bici1 = new BiciUsuario(parametros[3], parametros[1], "Biciusuario",
                                    parametros[2]);
                            Stakeholder bici2 = new BiciUsuario2(parametros[3], parametros[4]);

                            this.compos.add(bici1);
                            pro.usuarios.add(bici2);
                            System.out.println("Ha sido creado correctamente 1");
                            ok = ResponseEntity.ok(bici1);

                        } else {
                            System.out.println("Ha sido creado correctamente");
                        }
                    } else {
                        System.out.println("El nombre ingresado es demasiado largo");
                    }
                } else {
                    System.out.println("El correo no es valido");
                }
            } else {
                System.out.println("ya paila");
            }
        } else {
            int contador = 0;
            if (parametros.length == 5) {
                for (Componente compo : this.compos) {
                    if (compo instanceof BiciUsuario) {
                        contador++;
                    }
                }
                if (contador >= 1) {
                    for (Componente compos : this.compos) {
                        Matcher mather = pattern.matcher(parametros[3]);
                        if (mather.find() == true) {
                            if (!((BiciUsuario) compos).getEmail().toLowerCase().equals(parametros[3])) {
                                if (parametros[1].length() <= 50) {
                                    char[] clave = parametros[4].toCharArray();
                                    int contamays = 0;
                                    int contanum = 0;
                                    int contaespe = 0;
                                    for (int i = 0; i <= clave.length - 1; i++) {
                                        if (Character.isUpperCase(clave[i])) {
                                            contamays++;
                                        } else if (Character.isDigit(clave[i])) {
                                            contanum++;
                                        } else if (!Character.isDigit(clave[i]) && !Character.isLetter(clave[i])
                                                && !Character.isSpace(clave[i])) {
                                            contaespe++;
                                        }
                                    }
                                    if (contamays >= 1 && contanum >= 1 && contaespe >= 1) {
                                        Proxy pro = Proxy.getInstance();

                                        Componente bici1 = new BiciUsuario(parametros[3], parametros[1], "Biciusuario",
                                                parametros[2]);
                                        Stakeholder bici2 = new BiciUsuario2(parametros[3], parametros[4]);

                                        this.compos2.add(bici1);
                                        pro.usuarios.add(bici2);

                                        System.out.println("Ha sido creado correctamente 2");
                                        ok = ResponseEntity.ok(bici1);

                                    } else {
                                        System.out.println("La contraseña ingresada no es valida");
                                    }
                                } else {
                                    System.out.println("El nombre ingresado es demasiado largo");
                                }
                            } else {
                            	System.out.println("El Usuario ya existe");
                            }
                        }
                    }
                } else {
                    ////////////////////////////////////////////////////////////////
                    Matcher mather = pattern.matcher(parametros[3]);
                    if (mather.find() == true) {
                        if (parametros[1].length() <= 50) {
                            char[] clave = parametros[4].toCharArray();
                            int contamays = 0;
                            int contanum = 0;
                            int contaespe = 0;
                            for (int i = 0; i <= clave.length - 1; i++) {
                                if (Character.isUpperCase(clave[i])) {
                                    contamays++;
                                } else if (Character.isDigit(clave[i])) {
                                    contanum++;
                                } else if (!Character.isDigit(clave[i]) && !Character.isLetter(clave[i])
                                        && !Character.isSpace(clave[i])) {
                                    contaespe++;
                                }
                            }
                            if (contamays >= 1 && contanum >= 1 && contaespe >= 1) {
                                Proxy pro = Proxy.getInstance();

                                Componente bici1 = new BiciUsuario(parametros[3], parametros[1], "Biciusuario",
                                        parametros[2]);
                                Stakeholder bici2 = new BiciUsuario2(parametros[3], parametros[4]);

                                this.compos.add(bici1);
                                pro.usuarios.add(bici2);

                                System.out.println("Ha sido creado correctamente 3");
                                ok = ResponseEntity.ok(bici1);

                            } else {
                                System.out.println("La contraseña ingresada no es valida");
                            }
                        } else {
                            System.out.println("El nombre ingresado es demasiado largo");
                        }

                    } else {
                        System.out.println("El correo no es valido");
                    }
                }
            } else {
                System.out.println("Los parametros no coinciden");
            }
        }
        this.compos.addAll(compos2);
        return ok;
    }
}
