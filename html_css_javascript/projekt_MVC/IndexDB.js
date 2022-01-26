class IndexDB
{
    constructor()
    {
        this.version = 1
        this.db = window.indexedDB
        this.spojeni = null

        var request = this.db.open("db_zavod-skore", this.version)
        request.onupgradeneeded = function (event)
        {
            window.console.log("upgraded DB")
            var zaznamyStore = request.result.createObjectStore("zaznamy", {keyPath : "id", autoIncrement : true})
            zaznamyStore.createIndex("indexJmeno", "jmeno" , {unique:false})
            zaznamyStore.createIndex("indexSkore", "skore" , {unique:false})
        }
        request.onsuccess = (request) => this.spojeniOk(request)
    }

    spojeniOk(event)
    {
        this.spojeni = event.target.result
        window.console.log(event.target.result)
        this.vypisSeznam()
    }

    ulozJmeno(jm,sk)
    {
        if(this.spojeni)
        {
            let objStore = this.spojeni.transaction("zaznamy", "readwrite").objectStore("zaznamy")
            let request = objStore.put({jmeno: jm, skore: sk})
            request.onsucces = function (ev)
            {
                window.console.log("zapsala se data: " + ev.target.result)
                this.vypisData2()
            }
            this.vypisData2()
        }
    }

    vypisData2()
    {
        window.console.log("sem tu");
        if (this.spojeni)
        {
            let objStore = this.spojeni.transaction("zaznamy", "readwrite").objectStore("zaznamy")
            let request = objStore.openCursor()
            request.onsuccess = function (ev)
            {
                var cursor = ev.target.result
                if (cursor)
                {
                    window.console.log("zaznamy", cursor.key, cursor.value.jmeno, cursor.value.prijmeni)
                    cursor.continue()
                }
            }
        }
    }

    vypisSeznam()
    {
        if (this.spojeni)
        {
            window.console.log("spojeni ok")
            let objStore = this.spojeni.transaction("zaznamy", "readwrite").objectStore("zaznamy")
            //let request = objStore.openCursor()
            let request = objStore.index('indexSkore').openCursor(null, 'prev');
            let seznam = document.getElementById("skoreSeznam")
            let seznam1= document.getElementById("skoreSeznam2")

            if (seznam)
            {
                request.onsuccess = function (ev)
                {
                    var cursor = ev.target.result
                    if (cursor)
                    {
                        /*let li = document.createElement("li")
                        li.appendChild(cursor.value.jmeno, cursor.value.prijmeni);
                        //window.console.log("zaznamy", cursor.key, cursor.value.jmeno, cursor.value.prijmeni)
                         */
                        let li = document.createElement("li")
                        let li1 = document.createElement("li")
                        li.appendChild(document.createTextNode( cursor.value.jmeno))
                        li1.appendChild(document.createTextNode(cursor.value.skore))
                        seznam.appendChild(li)
                        seznam1.appendChild(li1)
                        cursor.continue()
                    }
                }
            }
        }
    }
}