class Auto
{
    constructor(pozicex = 1, pozicey = 15, visible = false)
    {
        this._pozicex = pozicex;
        this._pozicey = pozicey;
        this._visible = visible;
        window.console.log("constructed Auto1")
    }

    get pozicex()
    {
        return this._pozicex
    }

    set pozicex(pzs)
    {
        //window.console.log("pozice auta pre " + pzsin)
        this._pozicex = pzs
        //window.console.log("nastaveno na " + this._pozice)
    }

    get pozicey()
    {
        return this.pozicey
    }
    set pozicey(pzsy)
    {
        this._pozicey = pzsy
    }

    get visible()
    {
        return this._visible
    }

    set visible(vsb)
    {
        this._visible = vsb
    }

    zmenPozici(pzsin)
    {
        //window.console.log("pozice auta pre " + pzsin)
        this._pozicex = pzsin
        window.console.log("nastaveno na " + this._pozicex)
    }

    zmenPoziciy()
    {

    }
}