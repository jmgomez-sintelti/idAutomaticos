package org.javamexico.grailstest

class Estado {

   	String nombre
	Pais pais
	Integer poblacion
	
    static constraints = {
	nombre(blank: false)
	pais(nullable: false)
	poblacion(blank: true)
    }

}
