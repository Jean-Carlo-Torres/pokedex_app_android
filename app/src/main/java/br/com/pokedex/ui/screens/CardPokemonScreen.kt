package br.com.pokedex.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.CardPokemon
import br.com.pokedex.ui.components.ElementElectricButton
import br.com.pokedex.ui.components.ElementFairyButtom
import br.com.pokedex.ui.components.ElementFighterButton
import br.com.pokedex.ui.components.ElementFireButton
import br.com.pokedex.ui.components.ElementFlyingButton
import br.com.pokedex.ui.components.ElementGhostButton
import br.com.pokedex.ui.components.ElementGrassButton
import br.com.pokedex.ui.components.ElementIceButton
import br.com.pokedex.ui.components.ElementInsectButton
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementNocturnalButton
import br.com.pokedex.ui.components.ElementNormalButton
import br.com.pokedex.ui.components.ElementPoisonButton
import br.com.pokedex.ui.components.ElementPsychicButton
import br.com.pokedex.ui.components.ElementStoneButton
import br.com.pokedex.ui.components.ElementTerrestrialButton
import br.com.pokedex.ui.components.ElementWaterButton
import br.com.pokedex.ui.theme.PokedexTheme


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardPokemonScreen() {
    val pokemonList = listOf(
        BulbasaurData(),
        IvysaurData(),
        VenusaurData(),
        CharmanderData(),
        CharmeleonData(),
        CharizardData(),
        SquirtleData(),
        WartortleData(),
        BlastoiseData(),
        BeedrillData(),
        PikachuData(),
        CleifairyData(),
        DugtrioData(),
        OnixData(),
        LickitungData(),
        KoffingData(),
        MewData()
        // Adicione mais Pokémons conforme necessário
    )

    val pagerState = rememberPagerState(pageCount = { pokemonList.size })

    PokedexTheme {
        Surface {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Column {
                        CardPokemon(pokemonList[page])
                    }
                }
            }
        }
    }
}

@Composable
fun BulbasaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.bulbasaur),
        background = painterResource(id = R.drawable.header_grass),
        nome = "Bulbasaur",
        numero = "001",
        descricao = "Há uma semente de planta nas costas desde o dia em que este Pokémon nasce. A semente cresce lentamente.\n",
        peso = 6.9,
        altura = 0.7,
        categoria = Categoria.SEED,
        habilidades = listOf("Overgrow", "Chlorophyll").toTypedArray(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun IvysaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.ivysaur),
        background = painterResource(id = R.drawable.header_grass),
        nome = "Ivysaur",
        numero = "002",
        descricao = "Quando o bulbo nas costas cresce, parece perder a capacidade de ficar em pé nas patas traseiras.\n",
        peso = 13.0,
        altura = 1.0,
        categoria = Categoria.SEED,
        habilidades = listOf("Overgrow").toTypedArray(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun VenusaurData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.venusaur),
        background = painterResource(id = R.drawable.header_grass),
        nome = "Venusaur",
        numero = "003",
        descricao = "Sua planta floresce quando está absorvendo energia solar. Ele permanece em movimento para buscar a luz do sol.\n",
        peso = 100.0,
        altura = 2.0,
        categoria = Categoria.SEED,
        habilidades = listOf("Overgrow").toTypedArray(),
        element = listOf(
            { ElementGrassButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun CharmanderData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.charmander),
        background = painterResource(id = R.drawable.header_fire),
        nome = "Charmander",
        numero = "004",
        descricao = "Tem preferência por coisas quentes. Quando chove, diz-se que o vapor jorra da ponta de sua cauda.\n",
        peso = 8.5,
        altura = 0.6,
        categoria = Categoria.LIZARD,
        habilidades = listOf("Blaze").toTypedArray(),
        element = listOf { ElementFireButton() },
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementTerrestrialButton() },
            { ElementStoneButton() })
    )
}

@Composable
fun CharmeleonData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.charmeleon),
        background = painterResource(id = R.drawable.header_fire),
        nome = "Charmeleon",
        numero = "005",
        descricao = "Tem uma natureza bárbara. Na batalha, ele chicoteia sua cauda de fogo e corta com garras afiadas.\n",
        peso = 19.0,
        altura = 1.1,
        categoria = Categoria.FRAME,
        habilidades = listOf("Blaze").toTypedArray(),
        element = listOf { ElementFireButton() },
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementTerrestrialButton() },
            { ElementStoneButton() })
    )
}

@Composable
fun CharizardData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.charizard),
        background = painterResource(id = R.drawable.header_fire),
        nome = "Charizard",
        numero = "006",
        descricao = "Ele cospe fogo que é quente o suficiente para derreter pedregulhos. Pode causar incêndios florestais soprando chamas.",
        peso = 90.5,
        altura = 1.7,
        categoria = Categoria.FRAME,
        habilidades = listOf("Blaze").toTypedArray(),
        element = listOf(
            { ElementFireButton() },
            { ElementFlyingButton() }
        ),
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementElectricButton() },
            { ElementStoneButton() })
    )
}

@Composable
fun SquirtleData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.squirtle),
        background = painterResource(id = R.drawable.header_water),
        nome = "Squirtle",
        numero = "007",
        descricao = "Quando retrai seu longo pescoço em sua concha, esguicha água com força vigorosa.",
        peso = 9.0,
        altura = 0.5,
        categoria = Categoria.TURTLE,
        habilidades = listOf("Torrent").toTypedArray(),
        element = listOf { ElementWaterButton() },
        fraquezas = listOf(
            { ElementGrassButton() },
            { ElementElectricButton() }
        )
    )
}

@Composable
fun WartortleData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.wartortle),
        background = painterResource(id = R.drawable.header_water),
        nome = "Wartortle",
        numero = "008",
        descricao = "É reconhecido como um símbolo de longevidade. Se a concha tiver algas, esse Wartortle é muito antigo.\n",
        peso = 22.5,
        altura = 1.0,
        categoria = Categoria.TURTLE,
        habilidades = listOf("Torrent").toTypedArray(),
        element = listOf { ElementWaterButton() },
        fraquezas = listOf(
            { ElementGrassButton() },
            { ElementElectricButton() }
        )
    )
}

@Composable
fun BlastoiseData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.blastoise),
        background = painterResource(id = R.drawable.header_water),
        nome = "Blastoise",
        numero = "009",
        descricao = "Ele esmaga seu inimigo sob seu corpo pesado para causar desmaios. Em uma pitada, ele se retirará dentro de sua concha.\n",
        peso = 85.5,
        altura = 1.6,
        categoria = Categoria.SHELLFISH,
        habilidades = listOf("Torrent").toTypedArray(),
        element = listOf { ElementWaterButton() },
        fraquezas = listOf(
            { ElementGrassButton() },
            { ElementElectricButton() }
        )
    )
}

@Composable
fun BeedrillData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.beedrill),
        background = painterResource(id = R.drawable.header_insect),
        nome = "Beedrill",
        numero = "015",
        descricao = "Tem três ferrões venenosos nas patas dianteiras e na cauda. Eles são usados ​​para espetar seu inimigo repetidamente.",
        peso = 29.5,
        altura = 1.0,
        categoria = Categoria.POISON,
        habilidades = listOf("Swarm").toTypedArray(),
        element = listOf(
            { ElementPoisonButton() },
            { ElementPoisonButton() }
        ),
        fraquezas = listOf(
            { ElementFireButton() },
            { ElementPsychicButton() },
            { ElementFlyingButton() },
            { ElementStoneButton() },
        )
    )
}

@Composable
fun PikachuData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.pikachu),
        background = painterResource(id = R.drawable.header_electric),
        nome = "Pikachu",
        numero = "025",
        descricao = "Pikachu, que pode gerar uma eletricidade poderosa, tem bolsas nas bochechas que são extra macias e super elásticas.",
        peso = 6.0,
        altura = 0.4,
        categoria = Categoria.MOUSE,
        habilidades = listOf("Static").toTypedArray(),
        element = listOf { ElementElectricButton() },
        fraquezas = listOf { ElementTerrestrialButton() }
    )
}

@Composable
fun CleifairyData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.clefairy),
        background = painterResource(id = R.drawable.header_fairy),
        nome = "Clefairy",
        numero = "035",
        descricao = "Diz-se que a felicidade virá para aqueles que virem uma reunião de Clefairy dançando sob a lua cheia.\n",
        peso = 7.5,
        altura = 1.1,
        categoria = Categoria.FAIRY,
        habilidades = listOf("Cute Charm", "Magig Guard").toTypedArray(),
        element = listOf { ElementFairyButtom() },
        fraquezas = listOf(
            { ElementMetalButton() },
            { ElementPoisonButton() }
        )
    )
}

@Composable
fun DugtrioData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.dugtrio),
        background = painterResource(id = R.drawable.header_terrestrial),
        nome = "Dugtrio",
        numero = "051",
        descricao = "Uma equipe de trigêmeos Diglett. Ele desencadeia enormes terremotos cavando 60 milhas no subsolo.",
        peso = 33.3,
        altura = 0.7,
        categoria = Categoria.DIGGER,
        habilidades = listOf("Sand Veil", "Arena Trap").toTypedArray(),
        element = listOf { ElementTerrestrialButton() },
        fraquezas = listOf(
            { ElementWaterButton() },
            { ElementGrassButton() },
            { ElementIceButton() }
        )
    )
}

@Composable
fun OnixData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.onix),
        background = painterResource(id = R.drawable.header_stone),
        nome = "Onix",
        numero = "095",
        descricao = "À medida que escava o solo, absorve muitos objetos duros. Isso é o que torna seu corpo tão sólido.",
        peso = 210.0,
        altura = 8.8,
        categoria = Categoria.ROCK,
        habilidades = listOf("Rock Head", "Sturdy").toTypedArray(),
        element = listOf(
            { ElementStoneButton() },
            { ElementTerrestrialButton() }
        ),
        fraquezas = listOf(
            { ElementMetalButton() },
            { ElementFighterButton() },
            { ElementWaterButton() },
            { ElementIceButton() },
            { ElementGrassButton() },
            { ElementTerrestrialButton() }
        )
    )
}

@Composable
fun LickitungData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.lickitung),
        background = painterResource(id = R.drawable.header_normal),
        nome = "Lickitung",
        numero = "108",
        descricao = "Se a saliva pegajosa deste Pokémon entrar em contato com você e você não a limpar, uma coceira intensa se instalará. A coceira também não desaparecerá.\n",
        peso = 65.5,
        altura = 1.2,
        categoria = Categoria.LICKING,
        habilidades = listOf("Own Tempo", "Oblivious").toTypedArray(),
        element = listOf { ElementNormalButton() },
        fraquezas = listOf { ElementFighterButton() }
    )
}

@Composable
fun KoffingData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.koffing),
        background = painterResource(id = R.drawable.header_poison),
        nome = "Koffing",
        numero = "109",
        descricao = "Seu corpo está cheio de gás venenoso. Ele flutua em lixões, procurando a fumaça do lixo cru e apodrecido.\n",
        peso = 1.0,
        altura = 0.6,
        categoria = Categoria.POISON,
        habilidades = listOf("Levitate", "Neutralizing").toTypedArray(),
        element = listOf { ElementPoisonButton() },
        fraquezas = listOf(
            { ElementPsychicButton() },
            { ElementTerrestrialButton() }
        )
    )
}

@Composable
fun MewData(): Pokemon {
    return Pokemon(
        imagemPokemon = painterResource(id = R.drawable.mew),
        background = painterResource(id = R.drawable.header_psychic),
        nome = "Mew",
        numero = "151",
        descricao = "Quando visto através de um microscópio, o cabelo curto, fino e delicado deste Pokémon pode ser visto.\n",
        peso = 4.0,
        altura = 0.4,
        categoria = Categoria.PSYCHIC,
        habilidades = listOf("Synchronize").toTypedArray(),
        element = listOf { ElementPsychicButton() },
        fraquezas = listOf(
            { ElementGhostButton() },
            { ElementNocturnalButton() },
            { ElementInsectButton() }
        )
    )
}

@Preview
@Composable
private fun CardPokemonScreenPreview() {
    CardPokemonScreen()
}

