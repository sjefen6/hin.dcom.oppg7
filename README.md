#DATAKOMMUNIKASJON OG SIKKERHET, OBLIGATORISK OPPGAVE 7.
##Fil integritets sjekker
MD5 hashing av filer er vanlig for � garantere at en fil ikke er endret etter at den er produsert. En beregner da MD5 hashverdien av filen og tar vare p� denne. Integritetssjekk av filen inneb�rer � beregne MD5 hash p� nytt og sammenligne med den lagrede verdien. Dersom disse er like kan en anta at filen ikke er endret. Du skal i denne oppgaven skrive en slik integritetssjekker. (Som aalternativ til MD5 kan du benytte SHA256 som anses som en sikrere algoritme)
Skriv et program i Java/C# som gj�r f�lgende:

1. Lese alle filer i en angitt katalog og alle underkataloger For hver fil som leses inn skal programmet beregne MD5 hash verdien for filen og skrive denne til en "hashfil". Formatet p� denne "hashfilen" velger du selv. Denne filen b�r lagres p� et annet system s� snart den er opprettet, alternativet vil v�re � kryptere filen, men dette stilles det ikke krav til her.
1. Det b�r v�re mulighet for � verifisere MD5 hash verdien for en fil mot lagret verdi i "hashfilen".
1. Det b�r v�re mulighet for � verifisere alle filer i en katalog med underkataloger mot tidligere lagrede hash verdier.

Som utgangspunkt for oppgaven kan f�lgende adresser v�re nyttige:

* Java program fra Tanenbaum som viser framgansm�ten for skanning av alle filer i kataloger og underkataloger
* Oppsett av Eclipse med Apache Commons ligger her
* Apache Commons Codec, se adressen http://commons.apache.org/codec/, se spesielt klassen DigestUtils http://commons.apache.org/codec/apidocs/org/apache/commons/codec/digest/DigestUtils.html
* MD5 hash fra Java, inneholder eksempel p� bruk av FileStream
* Java Security MessageDigest klassen, http://java.sun.com/j2se/1.4.2/docs/api/java/security/MessageDigest.html

Krav til oppgaven:

* Programkoden m� v�re pent oppbygd og strukturert, og godt dokumentert. Bruk gjerne standard retningslinjer for koding, for eksempel den som finnes i Appendix F i Lewis & Loftus: Java Software Solutions.
* Alle kilder som benyttes m� tas med i referanselisten. I selve teksten henviser man p� vanlig m�te til kilden i referanselisten.
* Ved innlevering av skriftlige arbeider skal kilder ( Internett, tidsskrift, bok, personlig meddelelse m. fl. ) oppgis b�de i selve teksten og i en fullstendig litteraturliste.  Ved direkte avskrift, skal det markeres tydelig for eksempel med innrykk og kursivskrift el. lign, og det skal v�re kildehenvisning med spesifisert sidehenvisning. Avvik fra denne regel anses som fusk eller fors�k p� fusk.
* Innleveres i 1-ett eksemplar. Alle filer og dokumenter som inng�r i besvarelsen leveres i en ZIP fil.
* Dersom ikke annet er oppgitt i oppgaven kan dere jobbe sammen i grupper, p� maks 3 personer. Dere leverer sammen ved at en p� gruppa leverer og registrerer de andre som gruppemedlemmer. Det er ikke meningen at deloppgavene skal fordeles. Deloppgavene skal l�ses i felleskap. Alle filer dere lager skal inneholde navn p� gruppemedlemmene. I Java-filer skal dette v�re som kommentarer �verst i filen.
* Besvarelsen m� som et minimum inneholde alle Javafiler, og en kort forklaring av hvordan applikasjonen skal kj�res og selve rapporten.
* Forutsetninger som gj�res underveis m� kommenteres og begrunnes i rapporten.

Selve rapporten m� inneholde:

* Kort oppsummering av problemstilling.
* Overordnet beskrivelse av programmet som er laget, med vekt p� designvalg og problemer som oppstod og ble l�st under arbeidet med programmet.
* Presentasjon og dr�fting av resultater fra utpr�vingen med hashing av ulike kataloger og verifikasjon der det forekommer b�de filer som er endret og ikke endret.
* Oppsummering og konklusjon.
 