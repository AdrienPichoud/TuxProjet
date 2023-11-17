<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tux="http://myGame/tux">
    <xsl:output method="html" doctype-system="about:legacy-compat" encoding="UTF-8" />

    <xsl:key name="niveau-key" match="tux:mot" use="@niveau" />

    <xsl:template match="/tux:dictionnaire">
        <html>
            <head>
                <title>Dictionnaire Trié par Niveau</title>
            </head>
            <body>
                <h1>Dictionnaire Trié par Niveau</h1>
                <xsl:apply-templates select="tux:mot[generate-id() = generate-id(key('niveau-key', @niveau)[1])]" mode="group">
                    <xsl:sort select="@niveau" data-type="number" order="ascending"/>
                </xsl:apply-templates>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="tux:mot" mode="group">
        <xsl:variable name="currentNiveau" select="@niveau" />
        <h2>Niveau <xsl:value-of select="$currentNiveau"/></h2>
        <ul>
            <xsl:apply-templates select="key('niveau-key', $currentNiveau)" mode="item">
                <xsl:sort select="." order="ascending" />
            </xsl:apply-templates>
        </ul>
    </xsl:template>

    <xsl:template match="tux:mot" mode="item">
        <li>
            Niveau <xsl:value-of select="@niveau"/> : <xsl:value-of select="."/>
        </li>
    </xsl:template>
</xsl:stylesheet>









