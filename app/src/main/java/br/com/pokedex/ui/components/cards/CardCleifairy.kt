package br.com.pokedex.ui.components.cards

import androidx.compose.runtime.Composable
import br.com.pokedex.R
import br.com.pokedex.model.Pokemon
import br.com.pokedex.model.PokemonListaItem
import br.com.pokedex.model.enums.Categoria
import br.com.pokedex.ui.components.BackgroundFairy
import br.com.pokedex.ui.components.ElementFairyButtom
import br.com.pokedex.ui.components.ElementFairyButtonSmall
import br.com.pokedex.ui.components.ElementMetalButton
import br.com.pokedex.ui.components.ElementPoisonButton

val cleifairy = Pokemon(
    imagemPokemon = R.drawable.clefairy,
    background = R.drawable.header_fairy,
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
    ),
    evolucao = emptyList()
)

@Composable
fun CleifairyData(): Pokemon {
    return Pokemon(
        imagemPokemon = cleifairy.imagemPokemon,
        background = cleifairy.background,
        nome = cleifairy.nome,
        numero = cleifairy.numero,
        descricao = cleifairy.descricao,
        peso = cleifairy.peso,
        altura = cleifairy.altura,
        categoria = cleifairy.categoria,
        habilidades = cleifairy.habilidades,
        element = cleifairy.element,
        fraquezas = cleifairy.fraquezas,
        evolucao = CleifairyEvolution()
    )
}

@Composable
fun CleifairyEvolution(): List<PokemonListaItem> {
    return listOf(
        PokemonListaItem(
            imagemPokemon = cleifairy.imagemPokemon,
            nome = cleifairy.nome,
            numero = cleifairy.numero,
            element = listOf { ElementFairyButtonSmall() },
            background = BackgroundFairy(),
        )
    )
}

@Composable
fun CleifairyListData(): PokemonListaItem {
    return PokemonListaItem(
        imagemPokemon = cleifairy.imagemPokemon,
        nome = cleifairy.nome,
        numero = cleifairy.numero,
        element = cleifairy.element,
        background = BackgroundFairy()
    )
}