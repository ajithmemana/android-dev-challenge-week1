package net.opentrends.adoptme

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.glide.GlideImage
import net.opentrends.adoptme.models.Dog

/**
 * Created by Ajith on 03/03/21.
 */

private val dogData: List<Dog> by lazy {
    listOf(
        Dog(
            1,
            "Timothy",
            "https://www.thesprucepets.com/thmb/VJpRmcCyJCRbVmox-yx3FqUJWZ8=/1000x1000/smart/filters:no_upscale()/breed_profile_husky_1118000_hero_690-0158e427a4734e0fae59e2e91a7fe6e4.jpg",
            "Husky"
        ),
        Dog(
            1,
            "Tommy",
            "https://www.dogster.com/wp-content/uploads/2019/11/GettyImages-1076053926.jpg",
            "German Spitz"
        ),
        Dog(
            1,
            "Kaiser",
            "https://www.thesprucepets.com/thmb/cujQo-2FlGQjyGRa-0LtRZTe3sc=/3235x3235/smart/filters:no_upscale()/GettyImages-872401712-bd326b640f7d43b68620fd25d7b44071.jpg",
            "Spitz"
        ),
        Dog(
            1,
            "Tiger",
            "https://thehappypuppysite.com/wp-content/uploads/2018/07/dalmatian-long.jpg",
            "Dalmatian"
        ),
        Dog(
            1,
            "Bella",
            "https://kc-media-cdn-live.azureedge.net/cache/e/9/d/b/3/7/e9db37b1ae4c648023392626e7106aa18ec6dc0f.jpg",
            "Labrador"
        ),
    )
}

@Composable
fun HomeScreenApp() {
    showPetsList(dogs = dogData)
}


@Composable
fun showPetsList(dogs: List<Dog>) {
    Column {
        dogs.forEach { dog ->
            DogRow(dog)
        }
    }
}

@Composable
fun DogRow(dog: Dog) {
    Row(
        Modifier
            .clickable(onClick = { Log.d("Click", "Item clicked") })
            .padding(16.dp)
    ) {

        Row(Modifier.weight(1f)) {
            GlideImage(
                data = dog.photoUrl,
                contentDescription = null,
                Modifier
                    .width(100.dp)
                    .height(100.dp)
            )
            Text(text = dog.name, modifier = Modifier.padding(20.dp))
        }

    }
}

@Composable
fun TopAppBar(
    title: @Composable() () -> Unit,
    color: Color = MaterialTheme.colors.primary,
    navigationIcon: @Composable() (() -> Unit)? = null
) {
}
