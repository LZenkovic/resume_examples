#include <IRremote.h>

int IRpin = 11;
int numb1 = 0;
int numb2 = 0;

int b0 = 4;
int b1 = 6;
int b2 = 5;
int b3 = 2;

bool numb1E = false;
bool numb2E = false;
bool whatNumb = false;
bool calOperation = false;

IRrecv irrecv(IRpin);
decode_results results;

void setup()
{
  Serial.begin(9600);
  irrecv.enableIRIn(); // Start the receiver
  /*digitalWrite(2, HIGH);
  digitalWrite(4, HIGH);
  digitalWrite(5, HIGH);
  digitalWrite(6, HIGH);*/
}

void loop()
{
  if (irrecv.decode(&results)) //ovladač příjem
  {
    switch (results.value)
    {
      case 16738455:
        lightup();
        numberrs(0);
        break;
      case 16724175:
        lightup();
        numberrs(1);
        break;
      case 16718055:
        lightup();
        numberrs(2);
        break;
      case 16743045:
        lightup();
        numberrs(3);
        break;
      case 16716015:
        lightup();
        numberrs(4);
        break;
      case 16726215:
        lightup();
        numberrs(5);
        break;
      case 16734885:
        lightup();
        numberrs(6);
        break;
      case 16728765:
        lightup();
        numberrs(7);
        break;
      case 16730805:
        lightup();
        numberrs(8);
        break;
      case 16732845:
        lightup();
        numberrs(9);
        break;
      case 16769055:
        lightup();
        numberrs(10); //-
        break;
      case 16754775:
        lightup();
        numberrs(11); //+
        break;
      case 16748655:
        lightup();
        numberrs(12); //EQ
        break;
      case 16736925:
        lightup();
        numberrs(13); //Ch
        break;
      case 4294967295:
        break;
    }
  //Serial.println(results.value); // Print the Serial ‘results.value’
  irrecv.resume(); // Receive the next value
  }
  if(numb1E == true || numb2E == true)
  {
    analogWrite(9, 155);
  }
  else
  {
    analogWrite(9, 0);
  }
}

void lightup()
{
    analogWrite(10, 155);
    delay(50);
    analogWrite(10, 0);
}

void numberrs(int cislo1)
{
  if (cislo1 == 10)
  {
    calOperation = false;
    whatNumb = true;
  }
  else if (cislo1 == 11)
  {
    calOperation = true;
    whatNumb = true;
  }
  else if (cislo1 == 12)
  {
    int vysledek = 0;
    if (calOperation == false)
    {
      vysledek = numb1-numb2;
    }
    else
    {
      vysledek = numb1+numb2;
    }

    if (vysledek > 15 || vysledek < 0)
    {
      Serial.println("ERROR");
      numb1E = true;
    }
    else
    {
      Serial.println(vysledek);
      showNumber(vysledek);
    }
  }
  else if (cislo1 == 13)
  {
    numb1 = 0;
    numb2 = 0;
    numb1E = false;
    numb2E = false;
    whatNumb = false;
    calOperation = false;
    showNumber(0);
    Serial.println("deleted");
  }
  else
  {
    if (whatNumb == false)
    {
      numb1 = numb1*10+cislo1;
      if (numb1 < 16 && numb1E != true)
      {
        Serial.print(numb1); Serial.print(" "); Serial.print(numb2); Serial.println();
        showNumber(numb1);
      }
      else
      {
        numb1E = true;
        Serial.println("ERROR");
      }
    }
    else
    {
      numb2 = numb2*10+cislo1;
      if (numb2 < 16 && numb2E != true)
      {
        Serial.print(numb1); Serial.print(" "); Serial.print(numb2); Serial.println();
        showNumber(numb2);
      }
      else
      {
        numb2E = true;
        Serial.println("ERROR");
      }
    }
  }
}

void showNumber(int cislo2)
{
  Serial.println("sem tu");
  switch (cislo2)
  {
    case 0:
      digitalWrite(b0, LOW);
      digitalWrite(b1, LOW);
      digitalWrite(b2, LOW);
      digitalWrite(b3, LOW);
      break;
    case 1:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, LOW);
      digitalWrite(b2, LOW);
      digitalWrite(b3, LOW);
      break;
    case 2:
      digitalWrite(b0, LOW);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, LOW);
      digitalWrite(b3, LOW);
      break;
    case 3:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, LOW);
      digitalWrite(b3, LOW);
      break;
    case 4:
      digitalWrite(b0, LOW);
      digitalWrite(b1, LOW);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, LOW);
      break;
    case 5:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, LOW);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, LOW);
      break;
    case 6:
      digitalWrite(b0, LOW);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, LOW);
      break;
    case 7:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, LOW);
      break;
    case 8:
      digitalWrite(b0, LOW);
      digitalWrite(b1, LOW);
      digitalWrite(b2, LOW);
      digitalWrite(b3, HIGH);
      break;
    case 9:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, LOW);
      digitalWrite(b2, LOW);
      digitalWrite(b3, HIGH);
      break;
    case 10:
      digitalWrite(b0, LOW);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, LOW);
      digitalWrite(b3, HIGH);
      break;
    case 11:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, LOW);
      digitalWrite(b3, HIGH);
      break;
    case 12:
      digitalWrite(b0, LOW);
      digitalWrite(b1, LOW);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, HIGH);
      break;
    case 13:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, LOW);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, HIGH);
      break;
    case 14:
      digitalWrite(b0, LOW);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, HIGH);
      break;
    case 15:
      digitalWrite(b0, HIGH);
      digitalWrite(b1, HIGH);
      digitalWrite(b2, HIGH);
      digitalWrite(b3, HIGH);
      break;
  }
}
