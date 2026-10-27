package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class XmlElementStart extends io.netty.handler.codec.xml.XmlElement {
    private final java.util.List<io.netty.handler.codec.xml.XmlAttribute> attributes;

    public XmlElementStart(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.attributes = r1
            return
    }

    public java.util.List<io.netty.handler.codec.xml.XmlAttribute> attributes() {
            r1 = this;
            java.util.List<io.netty.handler.codec.xml.XmlAttribute> r0 = r1.attributes
            return r0
    }

    @Override // io.netty.handler.codec.xml.XmlElement
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2c
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2c
        L12:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L19
            return r1
        L19:
            io.netty.handler.codec.xml.XmlElementStart r5 = (io.netty.handler.codec.xml.XmlElementStart) r5
            java.util.List<io.netty.handler.codec.xml.XmlAttribute> r2 = r4.attributes
            java.util.List<io.netty.handler.codec.xml.XmlAttribute> r5 = r5.attributes
            if (r2 == 0) goto L28
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2b
            goto L2a
        L28:
            if (r5 == 0) goto L2b
        L2a:
            return r1
        L2b:
            return r0
        L2c:
            return r1
    }

    @Override // io.netty.handler.codec.xml.XmlElement
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.List<io.netty.handler.codec.xml.XmlAttribute> r1 = r2.attributes
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            goto L10
        Lf:
            r1 = 0
        L10:
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.xml.XmlElement
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "XmlElementStart{attributes="
            r0.append(r1)
            java.util.List<io.netty.handler.codec.xml.XmlAttribute> r1 = r2.attributes
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "} "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
