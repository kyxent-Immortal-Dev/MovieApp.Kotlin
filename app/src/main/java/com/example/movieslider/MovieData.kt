package com.example.movieslider

data class MovieData(
    val title: String,
    val releaseDate: String,
    val actors: List<String>,
    val description: String,
    val websiteUrl: String
)

object MovieDataProvider {
    val movies = listOf(
        MovieData(
            title = "Shrek",
            releaseDate = "22 de abril de 2001",
            actors = listOf(
                "Mike Myers como Shrek",
                "Eddie Murphy como Burro",
                "Cameron Diaz como Princesa Fiona"
            ),
            description = "En un pantano lejano vive Shrek, un ogro solitario que ve invadido su territorio " +
                    "por una serie de personajes de cuentos de hadas desterrados. Para recuperar la " +
                    "tranquilidad, hace un trato con Lord Farquaad: rescatar a la princesa Fiona para " +
                    "que sea su esposa. Pero no todo es lo que parece.",
            websiteUrl = "https://www.max.com/sv/es/movies/shrek/d8702a49-eced-457f-87b5-afe881ee72a0"
        ),
        MovieData(
            title = "Ice Age",
            releaseDate = "15 de marzo de 2002",
            actors = listOf(
                "Ray Romano como Manfred",
                "John Leguizamo como Sid",
                "Denis Leary como Diego"
            ),
            description = "Durante la era de hielo, un mamut, un perezoso y un tigre dientes de sable " +
                    "encuentran un bebé humano y deciden devolverlo a su tribu.",
            websiteUrl = "https://iceage-disney-com.translate.goog/?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc"
        ),
        MovieData(
            title = "Cars",
            releaseDate = "9 de junio de 2006",
            actors = listOf(
                "Owen Wilson como Rayo McQueen",
                "Paul Newman como Doc Hudson",
                "Bonnie Hunt como Sally Carrera"
            ),
            description = "Un coche de carreras novato y ambicioso descubre que la vida no es solo " +
                    "sobre la línea de meta cuando se encuentra varado en un pueblo pequeño.",
            websiteUrl = "https://www.disneyplus.com/es-mx/movies/cars-una-aventura-sobre-ruedas/41KYquQjLwge"
        ),
        MovieData(
            title = "Matrix",
            releaseDate = "31 de marzo de 1999",
            actors = listOf(
                "Keanu Reeves como Neo",
                "Laurence Fishburne como Morpheus",
                "Carrie-Anne Moss como Trinity"
            ),
            description = "Un programador de computadoras descubre que la realidad como la conocemos " +
                    "es una simulación creada por máquinas, y se une a una rebelión para liberarse.",
            websiteUrl = "https://www.primevideo.com/-/es/detail/Matrix/0SC64NC24QA7M9AFWBEK87WWS0"
        ),
        MovieData(
            title = "Gladiator",
            releaseDate = "5 de mayo de 2000",
            actors = listOf(
                "Russell Crowe como Máximo",
                "Joaquin Phoenix como Cómodo",
                "Connie Nielsen como Lucilla"
            ),
            description = "Un general romano traicionado se convierte en gladiador y busca venganza " +
                    "contra el corrupto emperador que asesinó a su familia.",
            websiteUrl = "https://www.imdb.com/es/title/tt0172495/"
        )
    )
}