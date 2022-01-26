var spawn1
var spawn2
var potvrzeno = false
var auto1 = new Auto(0,15)
var auto2 = new Auto(0,14)
var db = new IndexDB()
var at0 = document.getElementById("carBlue")
var at1 = document.getElementById("carRed1");
var at2 = document.getElementById("carRed1");
var pozice0 = 1;
var pozice1 = 0;
var pozice2 = 0;
var pozicey1 = 14
var rychlost = 1000


setInterval(function()
{
    rychlost = rychlost*0.75
    window.console.log("zmenena rychlost")
}, 10000);

setInterval(function()
{
    spawn1 = Math.floor((Math.random()*1)+1)
    //window.console.log(spawn1);
    if (spawn1 == 1 && auto1.visible == false)
    {
        ukazAuto(1);
    }

}, 1000);

/*setInterval(function()
{
    spawn2 = Math.floor((Math.random()*3)+1)
    window.console.log(spawn2);
    if (spawn2 == 1 && auto2.visible == false)
    {
        ukazAuto(2);
    }

}, 1000);*/

function ukazAuto(at)
{
    if (at == 1)
    {
        pozice1 = Math.floor((Math.random()*3))
        //window.console.log(auto1.visible)
        auto1._visible = true

        jedSAutem(1, pozice1)
    }
    else if (at == 2)
    {
        pozice2 = Math.floor((Math.random()*3))
        auto2._visible = false
        jedSAutem(2,pozice2)
    }
}

function jedSAutem(aauto, pozice)
{
    var i = 14
    var j = 14
    if (aauto == 1)
    {
        at1.style.marginTop = "-38em"
        switch (pozice) {
            case 0:
                at1.style.marginLeft = "0em";
                break;
            case 1:
                at1.style.marginLeft = "7.5em";
                break;
            case 2:
                at1.style.marginLeft = "15em"
        }
        at1.style.display = "block"
        //window.console.log(pozice, nastavPoziciX(pozice))
        //window.console.log("sem vidět " , auto1.visible, pozice)
        window.console.log(document.getElementById("carRed1").style.display, "      ")

        var t = setInterval(function ()
        {
            switch (i)
            {
                case -1:
                    clearInterval(t);
                    auto1.visible = false;
                    at1.style.display = "none"
                    break;
                case 0:
                    at1.style.marginTop = "-8em";
                    if (pozice1 == pozice0)
                    {
                        bouracka()
                    }
                    break;
                case 1:
                    at1.style.marginTop = "-10em";
                    if (pozice1 == pozice0)
                    {
                        bouracka()
                    }
                    break;
                case 2:
                    at1.style.marginTop = "-12em"
                    if (pozice1 == pozice0)
                    {
                        bouracka()
                    }
                    break;
                case 3:
                    at1.style.marginTop = "-14em"
                    if (pozice1 == pozice0)
                    {
                        bouracka()
                    }
                    break;
                case 4:
                    at1.style.marginTop = "-16em"
                    break;
                case 5:
                    at1.style.marginTop = "-18em"
                    break;
                case 6:
                    at1.style.marginTop = "-20em"
                    break;
                case 7:
                    at1.style.marginTop = "-22em"
                    break;
                case 8:
                    at1.style.marginTop = "-24em"
                    break;
                case 9:
                    at1.style.marginTop = "-26em"
                    break;
                case 10:
                    at1.style.marginTop = "-28em"
                    break;
                case 11:
                    at1.style.marginTop = "-30em"
                    break;
                case 12:
                    at1.style.marginTop = "-32em"
                    break;
                case 13:
                    at1.style.marginTop = "-34em"
                    break;
                case 14:
                    at1.style.marginTop = "-36em"
                    break;
            }
            window.console.log(i)


            if (at0.style.marginLeft == "0em")
            {
                pozice0 = 0;
            }
            else if (at0.style.marginLeft == "7.5em")
            {
                pozice0 = 1;
            }
            else if (at0.style.marginLeft == "15em")
            {
                pozice0 = 2;
            }
            window.console.log(pozice0)
            i--;

        }, rychlost);
    }
    else if (aauto == 2)
    {
        at2.style.marginTop = "-38em"
        switch (pozice)
        {
            case 0:
                at2.style.marginLeft = "0em";
                break;
            case 1:
                at2.style.marginLeft = "7.5em";
                break;
            case 2:
                at2.style.marginLeft = "15em"
        }
        at2.style.display = "block"

        var u = setInterval(function ()
        {
            switch (j)
            {
                case -1:
                    clearInterval(u);
                    auto2.visible = false;
                    at2.style.display = "none"
                    break;
                case 0:
                    at2.style.marginTop = "-8em";
                    break;
                case 1:
                    at2.style.marginTop = "-10em";
                    break;
                case 2:
                    at2.style.marginTop = "-12em"
                    break;
                case 3:
                    at2.style.marginTop = "-14em"
                    break;
                case 4:
                    at2.style.marginTop = "-16em"
                    break;
                case 5:
                    at2.style.marginTop = "-18em"
                    break;
                case 6:
                    at2.style.marginTop = "-20em"
                    break;
                case 7:
                    at2.style.marginTop = "-22em"
                    break;
                case 8:
                    at2.style.marginTop = "-24em"
                    break;
                case 9:
                    at2.style.marginTop = "-26em"
                    break;
                case 10:
                    at2.style.marginTop = "-28em"
                    break;
                case 11:
                    at2.style.marginTop = "-30em"
                    break;
                case 12:
                    at2.style.marginTop = "-32em"
                    break;
                case 13:
                    at2.style.marginTop = "-34em"
                    break;
                case 14:
                    at2.style.marginTop = "-36em"
                    break;
            }
            //window.console.log(i)
            j--;
        }, rychlost);
    }
}

function bouracka()
{
    if (potvrzeno == false)
    {
        var item = window.prompt("Jméno", "Hráč");
        var skore = document.getElementById("skore").innerText;
        db.ulozJmeno(item, skore)
        potvrzeno = true
    }
    window.location.href = "score.html"
}