package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzee {
    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzed r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzed
            r0.<init>()
            return
    }

    public zzee() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] zza(java.io.InputStream r9) throws java.io.IOException {
            r9.getClass()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 20
            r0.<init>(r1)
            r1 = 0
            int r2 = java.lang.Integer.highestOneBit(r1)
            int r2 = r2 + r2
            r3 = 128(0x80, float:1.8E-43)
            int r2 = java.lang.Math.max(r3, r2)
            r3 = 8192(0x2000, float:1.148E-41)
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 0
        L1d:
            r4 = -1
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r3 >= r5) goto L62
            int r5 = r5 - r3
            int r5 = java.lang.Math.min(r2, r5)
            byte[] r6 = new byte[r5]
            r0.add(r6)
            r7 = 0
        L2e:
            if (r7 >= r5) goto L40
            int r8 = r5 - r7
            int r8 = r9.read(r6, r7, r8)
            if (r8 != r4) goto L3d
            byte[] r9 = zzb(r0, r3)
            return r9
        L3d:
            int r7 = r7 + r8
            int r3 = r3 + r8
            goto L2e
        L40:
            r4 = 4096(0x1000, float:5.74E-42)
            if (r2 >= r4) goto L46
            r4 = 4
            goto L47
        L46:
            r4 = 2
        L47:
            long r5 = (long) r2
            long r7 = (long) r4
            long r5 = r5 * r7
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L56
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L1d
        L56:
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L60
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1d
        L60:
            int r2 = (int) r5
            goto L1d
        L62:
            int r9 = r9.read()
            if (r9 != r4) goto L6d
            byte[] r9 = zzb(r0, r5)
            return r9
        L6d:
            java.lang.OutOfMemoryError r9 = new java.lang.OutOfMemoryError
            java.lang.String r0 = "input is too large to fit in a byte array"
            r9.<init>(r0)
            throw r9
    }

    private static byte[] zzb(java.util.Queue r6, int r7) {
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            byte[] r6 = new byte[r1]
            return r6
        La:
            java.lang.Object r0 = r6.remove()
            byte[] r0 = (byte[]) r0
            int r2 = r0.length
            if (r2 != r7) goto L14
            return r0
        L14:
            byte[] r0 = java.util.Arrays.copyOf(r0, r7)
            int r2 = r7 - r2
        L1a:
            if (r2 <= 0) goto L2e
            java.lang.Object r3 = r6.remove()
            byte[] r3 = (byte[]) r3
            int r4 = r3.length
            int r4 = java.lang.Math.min(r2, r4)
            int r5 = r7 - r2
            java.lang.System.arraycopy(r3, r1, r0, r5, r4)
            int r2 = r2 - r4
            goto L1a
        L2e:
            return r0
    }
}
