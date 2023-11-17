<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tux="http://myGame/tux">
    <xsl:output method="html" doctype-system="about:legacy-compat" encoding="UTF-8" />

    <xsl:template match="/tux:profil">
        <html>
            <head>
                <title>Profil de <xsl:value-of select="tux:nom" /></title>
            </head>
            <body>
                <h1>Profil de <xsl:value-of select="tux:nom" /></h1>
                <h2>Avatar</h2>
                <img src="{tux:avatar}" alt="Avatar" />

                <h2>Date de Naissance</h2>
                <p>
                    <xsl:value-of select="tux:anniversaire" />
                </p>

                <h2>Parties</h2>
                <table border="1">
                    <tr>
                        <th>Date</th>
                        <th>Temps</th>
                        <th>Mots</th>
                    </tr>
                    <xsl:apply-templates select="tux:parties/tux:partie">
                        <xsl:sort select="tux:temps" data-type="number" order="ascending" />
                    </xsl:apply-templates>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="tux:partie">
        <tr>
            <td>
                <xsl:value-of select="@date" />
            </td>
            <td>
                <xsl:value-of select="tux:temps" />
            </td>
            <td>
                <table border="1">
                    <tr>
                        <th>Niveau</th>
                        <th>Mot</th>
                    </tr>
                    <xsl:apply-templates select="tux:mot">
                        <xsl:sort select="@niveau" data-type="number" order="ascending" />
                    </xsl:apply-templates>
                </table>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="tux:mot">
        <tr>
            <td>
                <xsl:value-of select="@niveau" />
            </td>
            <td>
                <xsl:value-of select="." />
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
