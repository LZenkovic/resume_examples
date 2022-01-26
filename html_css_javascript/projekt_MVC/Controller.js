class Controller
{
    constructor (model, view)
    {
        this._model = model;
        this._view = view;

        this._view.pridatUdalost("posunVlevo", ()=> this.posunAuto(0))
        this._view.pridatUdalost("posunVpravo", ()=> this.posunAuto(1))
        this._view.pridatUdalost("vyskoOkno", ()=>this.vyskaOkno())
        this._view.pridatUdalost("zapsatJmeno", () => this.pridatPolozku())

        document.addEventListener('keyup', (e) =>
        {
            if(e.code === "ArrowLeft")
            {
                this._model.zmenPoziciAuta(0)
            }
            else if (e.code === "ArrowRight")
            {
                this._model.zmenPoziciAuta(1)
            }
        });

        window.console.log("Constructed Controller");
    }

    posunAuto(smer)
    {
        this._model.zmenPoziciAuta(smer)
        //window.console.log("Controler, posun auto, " + smer)
    }

    vyskaOkno()
    {
        if(confirm("opravdu si přejete opustit hru?"))
        {
            window.location.href = "index.html"
        }
    }


    pridatPolozku()
    {
        var item = window.prompt("Jméno", "Hráč");
        var skore = document.getElementById("skore").innerText;

        window.location.href = "score.html"

        window.console.log("skore je: " + skore);
        if (item && skore)
        {
            this._model.pridatItem(item, skore);
        }
    }
}

