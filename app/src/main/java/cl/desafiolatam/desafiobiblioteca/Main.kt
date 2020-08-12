package cl.desafiolatam.desafiobiblioteca

fun main() {

    var libroUno = LibrosEscolares(
        "El Principito", 1234563542734, 1986,
        "Santillana", 300, 18000, "Marcela Paz", 'D'
    )

    var libroDos = LibrosEscolares(
        "La Vuelta al mundo en 80 dias", 6354827463829,
        1978, "Iternational", 475, 20000, "Julio Verne", 'I'
    )

    var libroTres = LibrosEscolares(
        "Matilda", 73847383929, 1990,
        "Loqueleo", 389, 15000, "Quentin Blake", 'D'
    )

    val libroCuatro = LibrosEscolares(
        "Charlie y la fábrica de chocolate", 244536266277, 2000,
        "Loqueleo", 672, 25000, "Roald Dahl", 'I'
    )

    println(imprimir(libroUno))
    precioFormateado(libroDos.precio)
}

