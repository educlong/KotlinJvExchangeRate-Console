package elong.model

class TiGia {
    private var items:MutableList<Item> = mutableListOf()
    constructor()
    constructor(items:MutableList<Item>){
        this.items=items
    }
    public var Items:MutableList<Item>
    get() {return items}
    set(value) {items=value}
}