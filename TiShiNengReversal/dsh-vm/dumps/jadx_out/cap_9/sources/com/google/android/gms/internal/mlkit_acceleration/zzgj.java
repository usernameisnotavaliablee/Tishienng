package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzgj implements java.security.PrivilegedExceptionAction {
    zzgj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() throws java.lang.Exception {
            r7 = this;
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
        L8:
            r4 = 0
            if (r3 >= r2) goto L25
            r5 = r1[r3]
            r6 = 1
            r5.setAccessible(r6)
            java.lang.Object r4 = r5.get(r4)
            boolean r5 = r0.isInstance(r4)
            if (r5 == 0) goto L22
            java.lang.Object r0 = r0.cast(r4)
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            return r0
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            return r4
    }
}
