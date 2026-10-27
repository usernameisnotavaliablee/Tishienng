package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class XmlNamespace {
    private final java.lang.String prefix;
    private final java.lang.String uri;

    public XmlNamespace(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.prefix = r1
            r0.uri = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L37
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L37
        L12:
            io.netty.handler.codec.xml.XmlNamespace r5 = (io.netty.handler.codec.xml.XmlNamespace) r5
            java.lang.String r2 = r4.prefix
            if (r2 == 0) goto L21
            java.lang.String r3 = r5.prefix
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L26
            goto L25
        L21:
            java.lang.String r2 = r5.prefix
            if (r2 == 0) goto L26
        L25:
            return r1
        L26:
            java.lang.String r2 = r4.uri
            java.lang.String r5 = r5.uri
            if (r2 == 0) goto L33
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L36
            goto L35
        L33:
            if (r5 == 0) goto L36
        L35:
            return r1
        L36:
            return r0
        L37:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.prefix
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.uri
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String prefix() {
            r1 = this;
            java.lang.String r0 = r1.prefix
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "XmlNamespace{prefix='"
            r0.append(r1)
            java.lang.String r1 = r3.prefix
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", uri='"
            r0.append(r2)
            java.lang.String r2 = r3.uri
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String uri() {
            r1 = this;
            java.lang.String r0 = r1.uri
            return r0
    }
}
