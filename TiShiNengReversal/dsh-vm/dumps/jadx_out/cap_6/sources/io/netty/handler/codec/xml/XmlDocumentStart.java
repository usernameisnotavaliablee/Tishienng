package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class XmlDocumentStart {
    private final java.lang.String encoding;
    private final java.lang.String encodingScheme;
    private final boolean standalone;
    private final java.lang.String version;

    public XmlDocumentStart(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.encoding = r1
            r0.version = r2
            r0.standalone = r3
            r0.encodingScheme = r4
            return
    }

    public java.lang.String encoding() {
            r1 = this;
            java.lang.String r0 = r1.encoding
            return r0
    }

    public java.lang.String encodingScheme() {
            r1 = this;
            java.lang.String r0 = r1.encodingScheme
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L50
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L50
        L12:
            io.netty.handler.codec.xml.XmlDocumentStart r5 = (io.netty.handler.codec.xml.XmlDocumentStart) r5
            boolean r2 = r4.standalone
            boolean r3 = r5.standalone
            if (r2 == r3) goto L1b
            return r1
        L1b:
            java.lang.String r2 = r4.encoding
            if (r2 == 0) goto L28
            java.lang.String r3 = r5.encoding
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            goto L2c
        L28:
            java.lang.String r2 = r5.encoding
            if (r2 == 0) goto L2d
        L2c:
            return r1
        L2d:
            java.lang.String r2 = r4.encodingScheme
            if (r2 == 0) goto L3a
            java.lang.String r3 = r5.encodingScheme
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3f
            goto L3e
        L3a:
            java.lang.String r2 = r5.encodingScheme
            if (r2 == 0) goto L3f
        L3e:
            return r1
        L3f:
            java.lang.String r2 = r4.version
            java.lang.String r5 = r5.version
            if (r2 == 0) goto L4c
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L4f
            goto L4e
        L4c:
            if (r5 == 0) goto L4f
        L4e:
            return r1
        L4f:
            return r0
        L50:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.encoding
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.version
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = 0
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r3.standalone
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.encodingScheme
            if (r2 == 0) goto L27
            int r1 = r2.hashCode()
        L27:
            int r0 = r0 + r1
            return r0
    }

    public boolean standalone() {
            r1 = this;
            boolean r0 = r1.standalone
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "XmlDocumentStart{encoding='"
            r0.append(r1)
            java.lang.String r1 = r3.encoding
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", version='"
            r0.append(r2)
            java.lang.String r2 = r3.version
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", standalone="
            r0.append(r2)
            boolean r2 = r3.standalone
            r0.append(r2)
            java.lang.String r2 = ", encodingScheme='"
            r0.append(r2)
            java.lang.String r2 = r3.encodingScheme
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String version() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }
}
