<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tux="http://myGame/tux">

    <!-- 
        Feuille de style XSLT pour trier et afficher les mots d'un dictionnaire
        par ordre alphabétique de manière ascendante.
    -->

    <!-- 
        Configuration de la sortie HTML.
    -->
    <xsl:output method="html" encoding="UTF-8" />

    <!--
        Modèle principal correspondant à la racine du document XML.
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Dictionnaire Trié par Ordre Alphabétique</title>
            </head>
            <body>
                <h1>Dictionnaire Trié par Ordre Alphabétique</h1>
                
                <!-- 
                    Applique le modèle 'mot' à tous les éléments 'mot' et les trie
                    par ordre alphabétique de manière ascendante.
                -->
                <ul>
                    <xsl:apply-templates select="//tux:mot">
                        <xsl:sort select="text()" order="ascending" />
                    </xsl:apply-templates>
                </ul>
            </body>
        </html>
    </xsl:template>

    <!--
        Modèle correspondant à chaque élément 'mot'.
    -->
    <xsl:template match="tux:mot">
        <!-- 
            Affiche chaque mot dans une balise <li> de la liste.
        -->
        <li>
            <xsl:value-of select="."/>
        </li>
    </xsl:template>
</xsl:stylesheet>




