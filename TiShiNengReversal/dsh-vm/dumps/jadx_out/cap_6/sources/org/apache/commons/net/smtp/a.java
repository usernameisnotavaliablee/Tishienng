package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    java.util.Vector<java.lang.String> a;
    java.lang.String b;

    public a(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.a = r0
            r1.b = r2
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            java.util.Vector<java.lang.String> r0 = r1.a
            r0.addElement(r2)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 60
            r0.append(r1)
            java.util.Vector<java.lang.String> r1 = r3.a
            java.util.Enumeration r1 = r1.elements()
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L3e
            r2 = 64
            r0.append(r2)
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
        L24:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L39
            java.lang.String r2 = ",@"
            r0.append(r2)
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            goto L24
        L39:
            r1 = 58
            r0.append(r1)
        L3e:
            java.lang.String r1 = r3.b
            r0.append(r1)
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
