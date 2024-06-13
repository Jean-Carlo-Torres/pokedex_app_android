package br.com.pokedex.model.enums

enum class Categoria(val descricao: String) {
    SEED("Seed"),
    FRAME("Frame"),
    LIZARD("Lizard"),
    TURTLE("Turtle"),
    SHELLFISH("Shellfish"),
    MOUSE("Mouse"),
    FAIRY("Fairy"),
    DIGGER("Digger"),
    ROCK("Rock"),
    LICKING("Licking"),
    POISON("Poison"),
    PSYCHIC("Psychic"),
    AURORA("Aurora"),
    IRON_ARMOR("Iron Armor"),
    AURA("Aura"),
    REGAL("Regal"),
    ILLUSION_FOX("Illusion Fox"),
    LURING("Luring"),
    CHILL("Chill"),
    CANNON("Cannon"),
    DRAGON("Dragão");

    override fun toString(): String {
        return descricao
    }
}

