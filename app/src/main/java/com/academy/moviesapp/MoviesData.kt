package com.academy.moviesapp

object MoviesData {
    private val movieTitles = arrayOf(
        "Hope",
        "Little Fish",
        "Minari",
        "My Salinger Year",
        "Palmer",
        "Percy vs Goliath",
        "Pixie",
        "The Father",
        "The Reason I Jump",
        "There is No Evil",
        "True Mothers",
        "WeWork",
    )

    private val movieDescriptions = arrayOf(
        "ANJA lives with TOMAS in a large family of biological children and stepchildren.",
        "Little Fish, the fourth feature film from director Chad Hartigan, is a romance set in a near-future Seattle.",
        "Minari follows a Korean-American family that moves to a tiny Arkansas farm in search of their own American Dream.",
        "Joanna gets hired as an assistant to Margaret, the stoic and old-fashioned literary agent of J. D. Salinger.",
        "Former high school football star Eddie Palmer went from hometown hero to convicted felon.",
        "A true story of a small-town farmer taking on one of the largest agricultural and food manufacturing corporations.",
        "Pixie Hardy sets out to avenge her mother's death and attempts a heist to leave her small-town life behind.",
        "Anthony is 80, mischievous, living defiantly alone and rejecting the carers that his daughter, Anne introduces.",
        "The film blends Higashida's insights into autism, written when he was just 13, with portraits of five young people.",
        "There is No Evil is an anthology film comprising four moral tales about men faced with a simple yet unthinkable choice.",
        "After a long and unsuccessful struggle to get pregnant, Satoko and her husband decide to adopt a child.",
        "A feature documentary that explores the rise and fall of one of the biggest corporate flameouts.",
        " True Mothers uses an intractable conflict to explore the bonds of parenthood with director/co-writer Naomi Kawase's usual sensitivity and grace.",

    )

    private val movieCritics = arrayOf(
        "A movingly personal work from writer-director Maria Sødahl, Hope sees stars Bræin Hovig and Stellan Skarsgård powerfully portraying a turning point in one couple's long love story.",
        "Tough but stirring, Little Fish uses one couple's pandemic love story to illustrate the strength of human connection in trying times.",
        "Led by arresting performances from Steven Yeun and Yeri Han, Minari offers an intimate and heart-wrenching portrait of family and assimilation in 1980s America.",
        "No consensus yet.",
        "Although it traffics in familiar territory, Palmer is elevated by worthy themes and a strong ensemble led by an impressive Justin Timberlake.",
        "Percy vs Goliath teeters toward heavy-handed messaging, but Christopher Walken's work in the central role helps keep this fact-based story upright.",
        "Pixie borrows shamelessly from multiple like-minded heist thrillers; fortunately, Olivia Cooke's outstanding lead performance makes for a great getaway vehicle.",
        "Led by stellar performances and artfully helmed by writer-director Florian Zeller, The Father presents a devastatingly empathetic portrayal of dementia.",
        "The Reason I Jump's moving personal perspective succeeds in providing an authentic understanding of its subjects' journeys.",
        "There Is No Evil thoughtfully poses troubling questions about man's responsibility to man -- and leaves the viewer to try and answer them.",
        " It's hard to ignore the parts that are left unexamined, but it does well enough by its real-life stranger-than-fiction story."
    )

    private val movieUrls = arrayOf(
        "https://www.rottentomatoes.com/m/hope_2021",
        "https://www.rottentomatoes.com/m/little_fish_2021",
        "https://www.rottentomatoes.com/m/minari",
        "https://www.rottentomatoes.com/m/my_salinger_year",
        "https://www.rottentomatoes.com/m/palmer",
        "https://www.rottentomatoes.com/m/percy_vs_goliath",
        "https://www.rottentomatoes.com/m/pixie",
        "https://www.rottentomatoes.com/m/the_father_2021",
        "https://www.rottentomatoes.com/m/the_reason_i_jump",
        "https://www.rottentomatoes.com/m/there_is_no_evil",
        "https://www.rottentomatoes.com/m/true_mothers",
        "https://www.rottentomatoes.com/m/wework_or_the_making_and_breaking_of_a_47_billion_unicorn"
    )

    private val movieRatings = intArrayOf(
        98,
        91,
        98,
        72,
        73,
        75,
        76,
        98,
        97,
        98,
        90,
        75
    )

    private val movieImages = intArrayOf(
        R.drawable.hope,
        R.drawable.little_fish,
        R.drawable.minari,
        R.drawable.my_salinger_year,
        R.drawable.palmer,
        R.drawable.percy_vs_goliath,
        R.drawable.pixie,
        R.drawable.the_father,
        R.drawable.the_reason_i_jump,
        R.drawable.there_is_no_evil,
        R.drawable.true_mothers,
        R.drawable.we_work
    )

//    val listData: ArrayList<Movie>
//    get(){
//        val list = arrayListOf<Movie>()
//        for (position in movieTitles.indices){
//            val movie = Movie()
//            movie.title = movieTitles[position]
//            movie.description = movieDescriptions[position]
//            movie.critic = movieCritics[position]
//            movie.url = movieUrls[position]
//            movie.rating = movieRatings[position]
//            movie.image = movieImages[position]
//            list.add(movie)
//        }
//        return list
//    }
val listData: ArrayList<Movie>
    get() {
        val list = arrayListOf<Movie>()
        for (position in movieTitles.indices) {
            val movie = Movie()
            movie.title = movieTitles[position]
            movie.description = movieDescriptions[position]
            movie.image = movieImages[position]
            list.add(movie)
        }
        return list
    }
}