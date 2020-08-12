package cl.desafiolatam.desafiobiblioteca

fun precioFormateado(valor : Int) {
    var precio = valor
    println("el precio del libro es $precio pesos")
}

fun imprimir(librosEscolares: LibrosEscolares){
    println("Datos de Libro: Nombre: ${librosEscolares.nombre} ${librosEscolares.ISBM} ${librosEscolares.autorLibro} ${librosEscolares.añoPublicacion} ${librosEscolares.editorial} ${librosEscolares.precio} ${librosEscolares.tipoDeLibro}")
}



