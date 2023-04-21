# COMPILARE

```mvn clean compile```

o

```mvn compile```

Se non volete pulire i file temporanei. ```clean``` è usbile con tutti i seguenti comandi.


# CREARE ARCHIVIO

```mvn package```

Nel caso dei vostri progetti genera un file jar nella cartella target.

# INSTALLARE NEL REPOSITORY LOCARE

```mvn install```

# LANCIARE UN PROGETTO JAVA DA TERMINALE

Soluzione grezza
```mvn exec:java -Dexec.mainClass="generics.soluzione.grezza.MenoFigata"```

Soluzione ottimanle

```mvn exec:java -Dexec.mainClass="generics.soluzione.ideale.Figata"```
