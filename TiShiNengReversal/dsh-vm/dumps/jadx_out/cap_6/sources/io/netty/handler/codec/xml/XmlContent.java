package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class XmlContent {
    private final java.lang.String data;

    protected XmlContent(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    public java.lang.String data() {
            r1 = this;
            java.lang.String r0 = r1.data
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L25
        L12:
            io.netty.handler.codec.xml.XmlContent r5 = (io.netty.handler.codec.xml.XmlContent) r5
            java.lang.String r2 = r4.data
            java.lang.String r5 = r5.data
            if (r2 == 0) goto L21
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L24
            goto L23
        L21:
            if (r5 == 0) goto L24
        L23:
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.data
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "XmlContent{data='"
            r0.append(r1)
            java.lang.String r1 = r2.data
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
