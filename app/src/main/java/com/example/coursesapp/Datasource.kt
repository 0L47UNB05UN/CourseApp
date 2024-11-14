package com.example.coursesapp

import com.example.coursesapp.data.Topic

class Datasource {
    fun loadList(): List<Topic>{
        return listOf<Topic>(
            Topic(R.string.architecture, 58, R.drawable.architecture),
            Topic(R.string.automotive, 58, R.drawable.automotive),
            Topic(R.string.biology, 58, R.drawable.biology),
            Topic(R.string.business, 58, R.drawable.business),
            Topic(R.string.crafts, 58, R.drawable.crafts),
            Topic(R.string.culinary, 58, R.drawable.culinary),
            Topic(R.string.design, 58, R.drawable.design),
            Topic(R.string.drawing, 58, R.drawable.drawing),
            Topic(R.string.ecology, 58, R.drawable.ecology),
            Topic(R.string.engineering, 58, R.drawable.engineering),
            Topic(R.string.fashion, 58, R.drawable.fashion),
            Topic(R.string.film, 58, R.drawable.film),
            Topic(R.string.finance, 58, R.drawable.finance),
            Topic(R.string.gaming, 58, R.drawable.gaming),
            Topic(R.string.geology, 58, R.drawable.geology),
            Topic(R.string.history, 58, R.drawable.history),
            Topic(R.string.journalism, 58, R.drawable.journalism),
            Topic(R.string.law, 58, R.drawable.law),
            Topic(R.string.lifestyle, 58, R.drawable.lifestyle),
            Topic(R.string.music, 58, R.drawable.music),
            Topic(R.string.painting, 58, R.drawable.painting),
            Topic(R.string.photography, 58, R.drawable.photography),
            Topic(R.string.physics, 58, R.drawable.physics),
            Topic(R.string.tech, 58, R.drawable.tech)

        )
    }

}