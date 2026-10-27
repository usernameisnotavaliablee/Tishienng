package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class XmlAttribute {
    private final java.lang.String name;
    private final java.lang.String namespace;
    private final java.lang.String prefix;
    private final java.lang.String type;
    private final java.lang.String value;

    public XmlAttribute(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.name = r2
            r0.prefix = r3
            r0.namespace = r4
            r0.value = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L66
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L66
        L12:
            io.netty.handler.codec.xml.XmlAttribute r5 = (io.netty.handler.codec.xml.XmlAttribute) r5
            java.lang.String r2 = r4.name
            java.lang.String r3 = r5.name
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            java.lang.String r2 = r4.namespace
            if (r2 == 0) goto L2c
            java.lang.String r3 = r5.namespace
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L31
            goto L30
        L2c:
            java.lang.String r2 = r5.namespace
            if (r2 == 0) goto L31
        L30:
            return r1
        L31:
            java.lang.String r2 = r4.prefix
            if (r2 == 0) goto L3e
            java.lang.String r3 = r5.prefix
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L43
            goto L42
        L3e:
            java.lang.String r2 = r5.prefix
            if (r2 == 0) goto L43
        L42:
            return r1
        L43:
            java.lang.String r2 = r4.type
            if (r2 == 0) goto L50
            java.lang.String r3 = r5.type
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L55
            goto L54
        L50:
            java.lang.String r2 = r5.type
            if (r2 == 0) goto L55
        L54:
            return r1
        L55:
            java.lang.String r2 = r4.value
            java.lang.String r5 = r5.value
            if (r2 == 0) goto L62
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L65
            goto L64
        L62:
            if (r5 == 0) goto L65
        L64:
            return r1
        L65:
            return r0
        L66:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.type
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.name
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.prefix
            if (r2 == 0) goto L1f
            int r2 = r2.hashCode()
            goto L20
        L1f:
            r2 = 0
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.namespace
            if (r2 == 0) goto L2c
            int r2 = r2.hashCode()
            goto L2d
        L2c:
            r2 = 0
        L2d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.value
            if (r2 == 0) goto L38
            int r1 = r2.hashCode()
        L38:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String namespace() {
            r1 = this;
            java.lang.String r0 = r1.namespace
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
            java.lang.String r1 = "XmlAttribute{type='"
            r0.append(r1)
            java.lang.String r1 = r3.type
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", name='"
            r0.append(r2)
            java.lang.String r2 = r3.name
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", prefix='"
            r0.append(r2)
            java.lang.String r2 = r3.prefix
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", namespace='"
            r0.append(r2)
            java.lang.String r2 = r3.namespace
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", value='"
            r0.append(r2)
            java.lang.String r2 = r3.value
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
