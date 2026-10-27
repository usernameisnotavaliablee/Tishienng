package org.junit.validator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d implements org.junit.validator.e {
    private static final java.util.List<java.lang.Exception> a = null;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            org.junit.validator.d.a = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.junit.validator.e
    public java.util.List<java.lang.Exception> a(org.junit.runners.model.i r4) {
            r3 = this;
            boolean r0 = r4.p()
            if (r0 == 0) goto L9
            java.util.List<java.lang.Exception> r4 = org.junit.validator.d.a
            return r4
        L9:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The class "
            r1.append(r2)
            java.lang.String r4 = r4.k()
            r1.append(r4)
            java.lang.String r4 = " is not public."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            java.util.List r4 = java.util.Collections.singletonList(r0)
            return r4
    }
}
