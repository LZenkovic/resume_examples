class Model extends EventEmitter
{
    constructor(polozka = [])
    {
        super ("model")
        this._db = new IndexDB();
        this._auto = new Auto(1, 0, true)
        this._auto1 = new Auto(0,15, false)

        this.vytvorAuto1()
        window.console.log("construkted Model")
    }

    vytvorAuto1()
    {
        var numb;
        numb = Math.floor((Math.random() * 10));
        window.console.log(numb);
        setTimeout(this.vytvorAuto1, 1000);/*
         */

        setInterval( () => {
            console.log(Math.floor((Math.random()*100)+1));
            this.honza()
        }, 1000);
    }

    honza()
    {
        window.console.log("iadwgdawhdgawdhbawjdbawudhzbawdhbaj");
    }
    zmenPoziciAuta(smer)
    {
        let pozitione = this._auto._pozicex;
        //window.console.log("pozitione: " + pozitione);
        if (smer == 1)
        {
            if (pozitione != 2)
            {
                this._auto.zmenPozici(pozitione+1)
                window.console.log("pozitione: " + pozitione);
                this.vykonejUdalost("ukazAuto")
            }
        }
        else if (smer == 0)
        {
            if (pozitione != 0)
            {
                this._auto.zmenPozici(pozitione-1)
                this.vykonejUdalost("ukazAuto")
            }
        }
    }

    zmenPoziciAuta1()
    {

    }

    zmenPoziciAuta1()
    {

    }

    pridatItem(item,skore)
    {
        this._db.ulozJmeno(item,skore)
        /*this._polozka.push(item)
        this.vykonejUdalost("vypsat");
        window.console.log(this._polozka);*/
    }
}