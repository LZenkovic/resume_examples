class View extends EventEmitter
{
    constructor(model)
    {
        super('view');
        this._model = model;
        this._model.pridatUdalost('ukazAuto', ()=> this.ukazAuto())
        this._model.pridatUdalost("ukazAuto1", ()=> this.ukazAuto1())
        document.getElementById("vlevo").addEventListener("click",() => this.vykonejUdalost("posunVlevo"))
        document.getElementById("vpravo").addEventListener("click",() => this.vykonejUdalost("posunVpravo"))
        document.getElementById("hraZpet").addEventListener("click", () => this.vykonejUdalost("vyskoOkno"))
        document.getElementById("zadatSkore").addEventListener("click",() => this.vykonejUdalost("zapsatJmeno"));
        this.ukazSkore();
        window.console.log("constructed View")
    }

    ukazAuto()
    {
        let autoModre = document.getElementById("carBlue")
        window.console.log("view pozice:" + this._model._auto.pozicex);
        switch (this._model._auto.pozicex)
        {
            case 0:
                autoModre.style.marginLeft = "0em";
                break;
            case 1:
                autoModre.style.marginLeft = "7.5em";
                break;
            case 2:
                autoModre.style.marginLeft = "15em"
        }
    }

    ukazAuto1()
    {
        window.console.log("ukazane cervene auto");
        let autoCervene = document.getElementById( "carRed1")
        autoCervene.style.visibility = "visible"
    }

    ukazSkore()
    {
        var skore = 0;
        setInterval(ukzS, 100)

        function  ukzS ()
        {
            //window.console.log(skore);
            document.getElementById("skore").innerText = skore;
            skore++;
        }
    }
}