package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbl {
    public zzbl() {
            r1 = this;
            r1.<init>()
            return
    }

    static void zza(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) throws java.lang.IllegalArgumentException {
            boolean r0 = zzg(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L41
            boolean r0 = zzg(r4)
            if (r0 != 0) goto L41
            boolean r0 = zzg(r5)
            if (r0 != 0) goto L41
            r2 = r2 & 7
            r3 = r3 & 63
            r4 = r4 & 63
            r5 = r5 & 63
            int r2 = r2 << 18
            int r3 = r3 << 12
            r2 = r2 | r3
            int r3 = r4 << 6
            r2 = r2 | r3
            r2 = r2 | r5
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r6[r7] = r3
            int r7 = r7 + 1
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r6[r7] = r2
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid UTF-8"
            r2.<init>(r3)
            throw r2
    }

    static void zzb(byte r2, byte r3, byte r4, char[] r5, int r6) throws java.lang.IllegalArgumentException {
            boolean r0 = zzg(r3)
            if (r0 != 0) goto L2e
            r0 = -96
            r1 = -32
            if (r2 != r1) goto L10
            if (r3 < r0) goto L2e
            r2 = -32
        L10:
            r1 = -19
            if (r2 != r1) goto L18
            if (r3 >= r0) goto L2e
            r2 = -19
        L18:
            boolean r0 = zzg(r4)
            if (r0 != 0) goto L2e
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid UTF-8"
            r2.<init>(r3)
            throw r2
    }

    static void zzc(byte r1, byte r2, char[] r3, int r4) throws java.lang.IllegalArgumentException {
            r0 = -62
            if (r1 < r0) goto L1d
            boolean r0 = zzg(r2)
            if (r0 != 0) goto L15
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r2 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r4] = r1
            return
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
            r1.<init>(r2)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
            r1.<init>(r2)
            throw r1
    }

    static boolean zzd(byte r0) {
            if (r0 < 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    static boolean zze(byte r1) {
            r0 = -16
            if (r1 >= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    static boolean zzf(byte r1) {
            r0 = -32
            if (r1 >= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static boolean zzg(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
