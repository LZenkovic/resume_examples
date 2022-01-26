class EventEmitter
{
    constructor(cl)
    {
        this._trida = cl;
        this._udalosti = {}
    }

    pridatUdalost(nazev, navratFunkce)
    {
        if(!this._udalosti[nazev])
        {
            this._udalosti[nazev] = []
        }
        this._udalosti[nazev].push(navratFunkce);
        window.console.log(this._trida, "pridat událost" + nazev, navratFunkce.toString())
    }

    vykonejUdalost(nazev, data)
    {
        var poleFunkci = this._udalosti[nazev];
        if(poleFunkci)
        {
            poleFunkci.forEach(fn =>
            {
                window.console.log(this._trida, "Vykonej událost" + nazev, fn.toString());
                fn.call(null, data)
            })
        }
    }

}