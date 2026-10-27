package io.netty.handler.codec.xml;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class XmlElement {
    private final java.lang.String name;
    private final java.lang.String namespace;
    private final java.util.List<io.netty.handler.codec.xml.XmlNamespace> namespaces;
    private final java.lang.String prefix;

    protected XmlElement(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.namespaces = r0
            r1.name = r2
            r1.namespace = r3
            r1.prefix = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L54
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L54
        L12:
            io.netty.handler.codec.xml.XmlElement r5 = (io.netty.handler.codec.xml.XmlElement) r5
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
            java.util.List<io.netty.handler.codec.xml.XmlNamespace> r2 = r4.namespaces
            if (r2 == 0) goto L3e
            java.util.List<io.netty.handler.codec.xml.XmlNamespace> r3 = r5.namespaces
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L43
            goto L42
        L3e:
            java.util.List<io.netty.handler.codec.xml.XmlNamespace> r2 = r5.namespaces
            if (r2 == 0) goto L43
        L42:
            return r1
        L43:
            java.lang.String r2 = r4.prefix
            java.lang.String r5 = r5.prefix
            if (r2 == 0) goto L50
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L53
            goto L52
        L50:
            if (r5 == 0) goto L53
        L52:
            return r1
        L53:
            return r0
        L54:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.namespace
            r2 = 0
            if (r1 == 0) goto L12
            int r1 = r1.hashCode()
            goto L13
        L12:
            r1 = 0
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.prefix
            if (r1 == 0) goto L1f
            int r1 = r1.hashCode()
            goto L20
        L1f:
            r1 = 0
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<io.netty.handler.codec.xml.XmlNamespace> r1 = r3.namespaces
            if (r1 == 0) goto L2b
            int r2 = r1.hashCode()
        L2b:
            int r0 = r0 + r2
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

    public java.util.List<io.netty.handler.codec.xml.XmlNamespace> namespaces() {
            r1 = this;
            java.util.List<io.netty.handler.codec.xml.XmlNamespace> r0 = r1.namespaces
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
            java.lang.String r1 = ", name='"
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", namespace='"
            r0.append(r2)
            java.lang.String r2 = r3.namespace
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", prefix='"
            r0.append(r2)
            java.lang.String r2 = r3.prefix
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", namespaces="
            r0.append(r1)
            java.util.List<io.netty.handler.codec.xml.XmlNamespace> r1 = r3.namespaces
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
