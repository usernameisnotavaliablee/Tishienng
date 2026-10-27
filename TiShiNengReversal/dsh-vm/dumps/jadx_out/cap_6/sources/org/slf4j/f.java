package org.slf4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    static org.slf4j.b a;

    static {
            org.slf4j.b r0 = a()     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> Le
            org.slf4j.f.a = r0     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> Le
            return
        L7:
            r0 = move-exception
            java.lang.String r1 = "Unexpected failure while binding MarkerFactory"
            org.slf4j.helpers.j.d(r1, r0)
            goto L15
        Le:
            org.slf4j.helpers.b r0 = new org.slf4j.helpers.b
            r0.<init>()
            org.slf4j.f.a = r0
        L15:
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.slf4j.b a() throws java.lang.NoClassDefFoundError {
            org.slf4j.impl.e r0 = org.slf4j.impl.e.c()     // Catch: java.lang.NoSuchMethodError -> L9
            org.slf4j.b r0 = r0.a()     // Catch: java.lang.NoSuchMethodError -> L9
            return r0
        L9:
            org.slf4j.impl.e r0 = org.slf4j.impl.e.b
            org.slf4j.b r0 = r0.a()
            return r0
    }

    public static org.slf4j.Marker b(java.lang.String r1) {
            org.slf4j.b r0 = org.slf4j.f.a
            org.slf4j.Marker r1 = r0.c(r1)
            return r1
    }

    public static org.slf4j.b c() {
            org.slf4j.b r0 = org.slf4j.f.a
            return r0
    }

    public static org.slf4j.Marker d(java.lang.String r1) {
            org.slf4j.b r0 = org.slf4j.f.a
            org.slf4j.Marker r1 = r0.a(r1)
            return r1
    }
}
