package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzgq extends com.google.android.gms.internal.mlkit_acceleration.zzgp {
    zzgq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgp
    final int zza(int r8, byte[] r9, int r10, int r11) {
            r7 = this;
        L0:
            if (r10 >= r11) goto L9
            r8 = r9[r10]
            if (r8 < 0) goto L9
            int r10 = r10 + 1
            goto L0
        L9:
            r8 = 0
            if (r10 < r11) goto Ld
            return r8
        Ld:
            if (r10 < r11) goto L10
            return r8
        L10:
            int r0 = r10 + 1
            r1 = r9[r10]
            if (r1 >= 0) goto L7a
            r2 = -32
            r3 = -65
            r4 = -1
            if (r1 >= r2) goto L2b
            if (r0 < r11) goto L20
            return r1
        L20:
            r2 = -62
            if (r1 < r2) goto L2a
            int r10 = r10 + 2
            r0 = r9[r0]
            if (r0 <= r3) goto Ld
        L2a:
            return r4
        L2b:
            r5 = -16
            if (r1 >= r5) goto L55
            int r5 = r11 + (-1)
            if (r0 < r5) goto L38
            int r8 = com.google.android.gms.internal.mlkit_acceleration.zzgs.zza(r9, r0, r11)
            return r8
        L38:
            int r5 = r10 + 2
            r0 = r9[r0]
            if (r0 > r3) goto L54
            r6 = -96
            if (r1 != r2) goto L46
            if (r0 < r6) goto L45
            goto L46
        L45:
            return r4
        L46:
            r2 = -19
            if (r1 != r2) goto L4e
            if (r0 >= r6) goto L4d
            goto L4e
        L4d:
            return r4
        L4e:
            int r10 = r10 + 3
            r0 = r9[r5]
            if (r0 <= r3) goto Ld
        L54:
            return r4
        L55:
            int r2 = r11 + (-2)
            if (r0 < r2) goto L5e
            int r8 = com.google.android.gms.internal.mlkit_acceleration.zzgs.zza(r9, r0, r11)
            return r8
        L5e:
            int r2 = r10 + 2
            r0 = r9[r0]
            if (r0 > r3) goto L79
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L79
            int r0 = r10 + 3
            r1 = r9[r2]
            if (r1 > r3) goto L79
            int r10 = r10 + 4
            r0 = r9[r0]
            if (r0 <= r3) goto Ld
        L79:
            return r4
        L7a:
            r10 = r0
            goto Ld
    }
}
