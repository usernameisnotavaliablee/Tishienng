package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class g implements org.slf4j.c, java.io.Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected java.lang.String name;

    g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.slf4j.c
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
            r1 = this;
            java.lang.String r0 = r1.getName()
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            return r0
    }
}
