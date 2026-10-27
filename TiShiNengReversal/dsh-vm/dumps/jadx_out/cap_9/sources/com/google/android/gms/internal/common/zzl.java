package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzl extends com.google.android.gms.internal.common.zzk {
    private final char zza;

    zzl(char r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            r0 = 6
            char[] r0 = new char[r0]
            r1 = 92
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r3 = 117(0x75, float:1.64E-43)
            r0[r1] = r3
            r1 = 2
            r0[r1] = r2
            r1 = 3
            r0[r1] = r2
            r1 = 4
            r0[r1] = r2
            r3 = 5
            r0[r3] = r2
            char r3 = r7.zza
        L1b:
            if (r2 >= r1) goto L2d
            int r4 = 5 - r2
            r5 = r3 & 15
            java.lang.String r6 = "0123456789ABCDEF"
            char r5 = r6.charAt(r5)
            r0[r4] = r5
            int r3 = r3 >> r1
            int r2 = r2 + 1
            goto L1b
        L2d:
            java.lang.String r0 = java.lang.String.copyValueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CharMatcher.is('"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "')"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char r2) {
            r1 = this;
            char r0 = r1.zza
            if (r2 != r0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }
}
