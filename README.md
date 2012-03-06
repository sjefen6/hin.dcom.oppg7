#DATAKOMMUNIKASJON OG SIKKERHET, OBLIGATORISK OPPGAVE 7.
##Fil integritets sjekker
MD5 hashing av filer er vanlig for å garantere at en fil ikke er endret etter at den er produsert. En beregner da MD5 hashverdien av filen og tar vare på denne. Integritetssjekk av filen innebærer å beregne MD5 hash på nytt og sammenligne med den lagrede verdien. Dersom disse er like kan en anta at filen ikke er endret. Du skal i denne oppgaven skrive en slik integritetssjekker. (Som aalternativ til MD5 kan du benytte SHA256 som anses som en sikrere algoritme)
Skriv et program i Java/C# som gjør følgende:

1. Lese alle filer i en angitt katalog og alle underkataloger For hver fil som leses inn skal programmet beregne MD5 hash verdien for filen og skrive denne til en "hashfil". Formatet på denne "hashfilen" velger du selv. Denne filen bør lagres på et annet system så snart den er opprettet, alternativet vil være å kryptere filen, men dette stilles det ikke krav til her.
1. Det bør være mulighet for å verifisere MD5 hash verdien for en fil mot lagret verdi i "hashfilen".
1. Det bør være mulighet for å verifisere alle filer i en katalog med underkataloger mot tidligere lagrede hash verdier.

Som utgangspunkt for oppgaven kan følgende adresser være nyttige:

* Java program fra Tanenbaum som viser framgansmåten for skanning av alle filer i kataloger og underkataloger
* Oppsett av Eclipse med Apache Commons ligger her
* Apache Commons Codec, se adressen http://commons.apache.org/codec/, se spesielt klassen DigestUtils http://commons.apache.org/codec/apidocs/org/apache/commons/codec/digest/DigestUtils.html
* MD5 hash fra Java, inneholder eksempel på bruk av FileStream
* Java Security MessageDigest klassen, http://java.sun.com/j2se/1.4.2/docs/api/java/security/MessageDigest.html

Krav til oppgaven:

* Programkoden må være pent oppbygd og strukturert, og godt dokumentert. Bruk gjerne standard retningslinjer for koding, for eksempel den som finnes i Appendix F i Lewis & Loftus: Java Software Solutions.
* Alle kilder som benyttes må tas med i referanselisten. I selve teksten henviser man på vanlig måte til kilden i referanselisten.
* Ved innlevering av skriftlige arbeider skal kilder ( Internett, tidsskrift, bok, personlig meddelelse m. fl. ) oppgis både i selve teksten og i en fullstendig litteraturliste.  Ved direkte avskrift, skal det markeres tydelig for eksempel med innrykk og kursivskrift el. lign, og det skal være kildehenvisning med spesifisert sidehenvisning. Avvik fra denne regel anses som fusk eller forsøk på fusk.
* Innleveres i 1-ett eksemplar. Alle filer og dokumenter som inngår i besvarelsen leveres i en ZIP fil.
* Dersom ikke annet er oppgitt i oppgaven kan dere jobbe sammen i grupper, på maks 3 personer. Dere leverer sammen ved at en på gruppa leverer og registrerer de andre som gruppemedlemmer. Det er ikke meningen at deloppgavene skal fordeles. Deloppgavene skal løses i felleskap. Alle filer dere lager skal inneholde navn på gruppemedlemmene. I Java-filer skal dette være som kommentarer øverst i filen.
* Besvarelsen må som et minimum inneholde alle Javafiler, og en kort forklaring av hvordan applikasjonen skal kjøres og selve rapporten.
* Forutsetninger som gjøres underveis må kommenteres og begrunnes i rapporten.

Selve rapporten må inneholde:

* Kort oppsummering av problemstilling.
* Overordnet beskrivelse av programmet som er laget, med vekt på designvalg og problemer som oppstod og ble løst under arbeidet med programmet.
* Presentasjon og drøfting av resultater fra utprøvingen med hashing av ulike kataloger og verifikasjon der det forekommer både filer som er endret og ikke endret.
* Oppsummering og konklusjon.
 