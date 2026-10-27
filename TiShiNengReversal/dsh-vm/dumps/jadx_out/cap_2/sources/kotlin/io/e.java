package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    public static final /* synthetic */ java.lang.String a(java.io.File r0, java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = b(r0, r1, r2)
            return r0
    }

    private static final java.lang.String b(java.io.File r2, java.io.File r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            if (r3 == 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = " -> "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L1f:
            if (r4 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L35:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }
}
