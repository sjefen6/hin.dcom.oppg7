#DATAKOMMUNIKASJON OG SIKKERHET, OBLIGATORISK OPPGAVE 7.
##Fil integritets sjekker
[MD5 hashing](http://en.wikipedia.org/wiki/MD5) av filer er vanlig for &aring; garantere at en fil ikke er endret etter at den er produsert. En beregner da MD5 hashverdien av filen og tar vare p&aring; denne. Integritetssjekk av filen inneb&aelig;rer &aring; beregne MD5 hash p&aring; nytt og sammenligne med den lagrede verdien. Dersom disse er like kan en anta at filen ikke er endret. Du skal i denne oppgaven skrive en slik integritetssjekker. (Som aalternativ til MD5 kan du benytte SHA256 som anses som en sikrere algoritme)

##Skriv et program i Java/C# som gj&oslash;r f&oslash;lgende:

1. Lese alle filer i en angitt katalog og alle underkataloger For hver fil som leses inn skal programmet beregne MD5 hash verdien for filen og skrive denne til en "hashfil". Formatet p&aring; denne "hashfilen" velger du selv. Denne filen b&oslash;r lagres p&aring; et annet system s&aring; snart den er opprettet, alternativet vil v&aelig;re &aring; kryptere filen, men dette stilles det ikke krav til her.
1. Det b&oslash;r v&aelig;re mulighet for &aring; verifisere MD5 hash verdien for en fil mot lagret verdi i "hashfilen".
1. Det b&oslash;r v&aelig;re mulighet for &aring; verifisere alle filer i en katalog med underkataloger mot tidligere lagrede hash verdier.

##Som utgangspunkt for oppgaven kan f&oslash;lgende adresser v&aelig;re nyttige:

* [Java program fra Tanenbaum](http://kark.hin.no/opsys/tanenbaum/java/ExecutableFiles.java) som viser framgansm&aring;ten for skanning av alle filer i kataloger og underkataloger
* Oppsett av Eclipse med Apache Commons ligger [her](http://kark.hin.no/sikkerhet/filehash/oblig2_tips.html).
* Apache Commons Codec, se adressen http://commons.apache.org/codec/, se spesielt klassen DigestUtils http://commons.apache.org/codec/apidocs/org/apache/commons/codec/digest/DigestUtils.html
* [MD5 hash fra Java](http://www.oreilly.com/catalog/javacrypt/chapter/ch06.html#33393), inneholder eksempel p&aring; bruk av FileStream
* Java Security MessageDigest klassen, http://java.sun.com/j2se/1.4.2/docs/api/java/security/MessageDigest.html

##Krav til oppgaven:

* Programkoden m&aring; v&aelig;re pent oppbygd og strukturert, og godt dokumentert. Bruk gjerne standard retningslinjer for koding, for eksempel den som finnes i Appendix F i Lewis & Loftus: Java Software Solutions.
* Alle kilder som benyttes m&aring; tas med i referanselisten. I selve teksten henviser man p&aring; vanlig m&aring;te til kilden i referanselisten.
* Ved innlevering av skriftlige arbeider skal kilder ( Internett, tidsskrift, bok, personlig meddelelse m. fl. ) oppgis b&aring;de i selve teksten og i en fullstendig litteraturliste.  Ved direkte avskrift, skal det markeres tydelig for eksempel med innrykk og kursivskrift el. lign, og det skal v&aelig;re kildehenvisning med spesifisert sidehenvisning. Avvik fra denne regel anses som fusk eller fors&oslash;k p&aring; fusk.
* Innleveres i 1-ett eksemplar. Alle filer og dokumenter som inng&aring;r i besvarelsen leveres i en ZIP fil.
* Dersom ikke annet er oppgitt i oppgaven kan dere jobbe sammen i grupper, p&aring; maks 3 personer. Dere leverer sammen ved at en p&aring; gruppa leverer og registrerer de andre som gruppemedlemmer. Det er ikke meningen at deloppgavene skal fordeles. Deloppgavene skal l&oslash;ses i felleskap. Alle filer dere lager skal inneholde navn p&aring; gruppemedlemmene. I Java-filer skal dette v&aelig;re som kommentarer &oslash;verst i filen.
* Besvarelsen m&aring; som et minimum inneholde alle Javafiler, og en kort forklaring av hvordan applikasjonen skal kj&oslash;res og selve rapporten.
* Forutsetninger som gj&oslash;res underveis m&aring; kommenteres og begrunnes i rapporten.

##Selve rapporten m&aring; inneholde:

* Kort oppsummering av problemstilling.
* Overordnet beskrivelse av programmet som er laget, med vekt p&aring; designvalg og problemer som oppstod og ble l&oslash;st under arbeidet med programmet.
* Presentasjon og dr&oslash;fting av resultater fra utpr&oslash;vingen med hashing av ulike kataloger og verifikasjon der det forekommer b&aring;de filer som er endret og ikke endret.
* Oppsummering og konklusjon.
 