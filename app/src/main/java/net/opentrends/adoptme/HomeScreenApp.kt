package net.opentrends.adoptme

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.opentrends.adoptme.models.Dog

/**
 * Created by Ajith on 03/03/21.
 */

private val strrr:List<String> by lazy {
    listOf(
        "Kobalt Toral",
        "K'Kola Uvarek",
        "Kris Vriloc",
        "Grala Valdyr",
        "Kruel Valaxar",
        "L'Elij Venonn",
        "Kraag Solazarn",
        "Tava Targesh",
        "Kemarrin Muuda"
    )
}

@Composable
fun HomeScreenApp() {
    showPetsList(dogs =strrr  )
}


@Composable
fun showPetsList(dogs: List<String>) {
    Column {
        dogs.forEach { dog ->
            DogRow(dog)
        }
    }
}

@Composable
fun DogRow(dog: String) {
    Row(
        Modifier
            .clickable(onClick = { Log.d("Click", "Item clicked") })
            .padding(16.dp)
    ) {

        Column(Modifier.weight(1f)) {
            Text(text = dog)
        }

    }
}

