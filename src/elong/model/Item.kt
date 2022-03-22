package elong.model

class Item {
    private var type:String=""
    private var imageurl:String=""
    private var muatienmat:String=""
    private var muack:String=""
    private var bantienmat:String=""
    private var banck:String=""
    constructor()
    constructor(type:String,imageurl:String,muatienmat:String,muack:String,
                bantienmat:String,banck:String){
        this.type=type
        this.imageurl=imageurl
        this.muatienmat=muatienmat
        this.bantienmat=bantienmat
        this.muack=muack
        this.banck=banck
    }
    public var Type:String
        get() {return type}
        set(value) {type=value}
    public var Muatienmat:String
        get() {return muatienmat}
        set(value) {muatienmat=value}
    public var Bantienmat:String
        get() {return bantienmat}
        set(value) {bantienmat=value}
    public var Muack:String
        get() {return muack}
        set(value) {muack=value}
    public var Banck:String
        get() {return banck}
        set(value) {banck=value}
    public var Imageurl:String
        get() {return imageurl}
        set(value) {imageurl=value}

    override fun toString(): String {
        return "Ngoại tệ "+type+" => "+"Mua tiền mặt: "+muatienmat+
                ", bán tiền mặt: "+bantienmat+", mua ck: "+muack+
                ", bán ck: "+banck+"\n\t image url: "+imageurl
    }
}