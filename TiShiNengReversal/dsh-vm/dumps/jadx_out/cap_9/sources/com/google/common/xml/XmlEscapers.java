package com.google.common.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final com.google.common.escape.Escaper XML_ATTRIBUTE_ESCAPER = null;
    private static final com.google.common.escape.Escaper XML_CONTENT_ESCAPER = null;
    private static final com.google.common.escape.Escaper XML_ESCAPER = null;

    static {
            com.google.common.escape.Escapers$Builder r0 = com.google.common.escape.Escapers.builder()
            r1 = 65533(0xfffd, float:9.1831E-41)
            r2 = 0
            r0.setSafeRange(r2, r1)
            java.lang.String r1 = "�"
            r0.setUnsafeReplacement(r1)
        L10:
            r3 = 31
            r4 = 13
            r5 = 10
            r6 = 9
            if (r2 > r3) goto L27
            if (r2 == r6) goto L23
            if (r2 == r5) goto L23
            if (r2 == r4) goto L23
            r0.addEscape(r2, r1)
        L23:
            int r2 = r2 + 1
            char r2 = (char) r2
            goto L10
        L27:
            r1 = 38
            java.lang.String r2 = "&amp;"
            r0.addEscape(r1, r2)
            r1 = 60
            java.lang.String r2 = "&lt;"
            r0.addEscape(r1, r2)
            r1 = 62
            java.lang.String r2 = "&gt;"
            r0.addEscape(r1, r2)
            com.google.common.escape.Escaper r1 = r0.build()
            com.google.common.xml.XmlEscapers.XML_CONTENT_ESCAPER = r1
            r1 = 39
            java.lang.String r2 = "&apos;"
            r0.addEscape(r1, r2)
            r1 = 34
            java.lang.String r2 = "&quot;"
            r0.addEscape(r1, r2)
            com.google.common.escape.Escaper r1 = r0.build()
            com.google.common.xml.XmlEscapers.XML_ESCAPER = r1
            java.lang.String r1 = "&#x9;"
            r0.addEscape(r6, r1)
            java.lang.String r1 = "&#xA;"
            r0.addEscape(r5, r1)
            java.lang.String r1 = "&#xD;"
            r0.addEscape(r4, r1)
            com.google.common.escape.Escaper r0 = r0.build()
            com.google.common.xml.XmlEscapers.XML_ATTRIBUTE_ESCAPER = r0
            return
    }

    private XmlEscapers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.escape.Escaper xmlAttributeEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.xml.XmlEscapers.XML_ATTRIBUTE_ESCAPER
            return r0
    }

    public static com.google.common.escape.Escaper xmlContentEscaper() {
            com.google.common.escape.Escaper r0 = com.google.common.xml.XmlEscapers.XML_CONTENT_ESCAPER
            return r0
    }
}
