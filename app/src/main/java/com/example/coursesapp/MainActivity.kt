package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesAppTheme {
                Scaffold(Modifier.fillMaxSize()){innerpadding ->
                    CourseApp(
                        Modifier.padding(innerpadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CourseApp(modifier: Modifier = Modifier){
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(Datasource().loadList()){listItems ->
            TopicCard(
                listItems.name,
                listItems.num,
                listItems.image,
                modifier.fillMaxWidth().padding(
                    bottom=8.dp, start=8.dp, end=8.dp
                )
            )
        }
    }
}

@Composable
fun TopicCard(
    @StringRes name: Int,
    num: Int,
    @DrawableRes image: Int,
    modifier: Modifier = Modifier
){
    Card(modifier){
        Row{
            Image(
                painter = painterResource(image),
                contentDescription = stringResource(name),
                modifier = Modifier.size(68.dp)
            )
            Column {
                Text(
                    text= stringResource(name),
                    softWrap = false,
                    modifier = Modifier.padding(
                        top=16.dp, bottom=8.dp, start=16.dp, end=16.dp
                    )
                )
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector=Icons.Filled.Person,
                        contentDescription = null,
                        modifier = Modifier.padding(
                            start=16.dp, end=8.dp
                        )
                    )
                    Text(text=num.toString())
                }
            }
        }
    }
}

@Preview
@Composable
fun CourseAppPreview(){
    CourseApp()
}