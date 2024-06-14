package br.com.pokedex.model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import br.com.pokedex.model.enums.ElementTag
import br.com.pokedex.ui.components.cards.AggronData
import br.com.pokedex.ui.components.cards.AggronListData
import br.com.pokedex.ui.components.cards.BeedrillData
import br.com.pokedex.ui.components.cards.BeedrillListData
import br.com.pokedex.ui.components.cards.BlastoiseData
import br.com.pokedex.ui.components.cards.BlastoiseListData
import br.com.pokedex.ui.components.cards.BulbasaurData
import br.com.pokedex.ui.components.cards.BulbasaurListData
import br.com.pokedex.ui.components.cards.ChandelureData
import br.com.pokedex.ui.components.cards.ChandelureListData
import br.com.pokedex.ui.components.cards.CharizardData
import br.com.pokedex.ui.components.cards.CharizardListData
import br.com.pokedex.ui.components.cards.CharmanderData
import br.com.pokedex.ui.components.cards.CharmanderListData
import br.com.pokedex.ui.components.cards.CharmeleonData
import br.com.pokedex.ui.components.cards.CharmeleonListData
import br.com.pokedex.ui.components.cards.CleifairyData
import br.com.pokedex.ui.components.cards.CleifairyListData
import br.com.pokedex.ui.components.cards.CubchooData
import br.com.pokedex.ui.components.cards.CubchooListData
import br.com.pokedex.ui.components.cards.DugtrioData
import br.com.pokedex.ui.components.cards.DugtrioListData
import br.com.pokedex.ui.components.cards.IvysaurData
import br.com.pokedex.ui.components.cards.IvysaurListData
import br.com.pokedex.ui.components.cards.KoffingData
import br.com.pokedex.ui.components.cards.KoffingListData
import br.com.pokedex.ui.components.cards.LickitungData
import br.com.pokedex.ui.components.cards.LickitungListData
import br.com.pokedex.ui.components.cards.LucarioData
import br.com.pokedex.ui.components.cards.LucarioListData
import br.com.pokedex.ui.components.cards.MewData
import br.com.pokedex.ui.components.cards.MewListData
import br.com.pokedex.ui.components.cards.OnixData
import br.com.pokedex.ui.components.cards.OnixListData
import br.com.pokedex.ui.components.cards.PikachuData
import br.com.pokedex.ui.components.cards.PikachuListData
import br.com.pokedex.ui.components.cards.RayquazaData
import br.com.pokedex.ui.components.cards.RayquazaListData
import br.com.pokedex.ui.components.cards.SerperiorData
import br.com.pokedex.ui.components.cards.SerperiorListData
import br.com.pokedex.ui.components.cards.SquirtleData
import br.com.pokedex.ui.components.cards.SquirtleListData
import br.com.pokedex.ui.components.cards.SuicuneData
import br.com.pokedex.ui.components.cards.SuicuneListData
import br.com.pokedex.ui.components.cards.ToucannonData
import br.com.pokedex.ui.components.cards.ToucannonListData
import br.com.pokedex.ui.components.cards.VenusaurData
import br.com.pokedex.ui.components.cards.VenusaurListData
import br.com.pokedex.ui.components.cards.WartortleData
import br.com.pokedex.ui.components.cards.WartortleListData
import br.com.pokedex.ui.components.cards.ZoroarkData
import br.com.pokedex.ui.components.cards.ZoroarkListData

class PokemonViewModel : ViewModel() {
    var selectedElementType: ElementTag? = null

    var pokemonsList = mutableStateListOf<PokemonListaItem>()
        private set

    var sortedListIndex = 0
}

@Composable
fun ExibeListPokemons(): List<PokemonListaItem> {
    var pokemonList = listOf(
        BulbasaurListData(),
        IvysaurListData(),
        VenusaurListData(),
        CharmanderListData(),
        CharmeleonListData(),
        CharizardListData(),
        SquirtleListData(),
        WartortleListData(),
        BlastoiseListData(),
        BeedrillListData(),
        PikachuListData(),
        CleifairyListData(),
        DugtrioListData(),
        OnixListData(),
        LickitungListData(),
        KoffingListData(),
        MewListData(),
        SuicuneListData(),
        AggronListData(),
        RayquazaListData(),
        LucarioListData(),
        SerperiorListData(),
        ZoroarkListData(),
        ChandelureListData(),
        CubchooListData(),
        ToucannonListData(),
    )
    return pokemonList
}

@Composable
fun ExibeCardPokemons(): List<Pokemon> {
    var pokemonListCard = listOf(
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
        MewData(),
        SuicuneData(),
        AggronData(),
        RayquazaData(),
        LucarioData(),
        SerperiorData(),
        ZoroarkData(),
        ChandelureData(),
        CubchooData(),
        ToucannonData(),
    )
    return pokemonListCard
}