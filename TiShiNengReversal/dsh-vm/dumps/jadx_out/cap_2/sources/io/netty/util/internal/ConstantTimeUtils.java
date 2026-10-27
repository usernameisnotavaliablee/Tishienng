package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ConstantTimeUtils {
    private ConstantTimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int equalsConstantTime(int r0, int r1) {
            r0 = r0 ^ r1
            r0 = r0 ^ (-1)
            int r1 = r0 >> 16
            r0 = r0 & r1
            int r1 = r0 >> 8
            r0 = r0 & r1
            int r1 = r0 >> 4
            r0 = r0 & r1
            int r1 = r0 >> 2
            r0 = r0 & r1
            int r1 = r0 >> 1
            r0 = r0 & r1
            r0 = r0 & 1
            return r0
    }

    public static int equalsConstantTime(long r2, long r4) {
            r0 = -1
            long r2 = r2 ^ r4
            long r2 = r2 ^ r0
            r4 = 32
            long r4 = r2 >> r4
            long r2 = r2 & r4
            r4 = 16
            long r4 = r2 >> r4
            long r2 = r2 & r4
            r4 = 8
            long r4 = r2 >> r4
            long r2 = r2 & r4
            r4 = 4
            long r4 = r2 >> r4
            long r2 = r2 & r4
            r4 = 2
            long r4 = r2 >> r4
            long r2 = r2 & r4
            r4 = 1
            long r4 = r2 >> r4
            long r2 = r2 & r4
            r4 = 1
            long r2 = r2 & r4
            int r3 = (int) r2
            return r3
    }

    public static int equalsConstantTime(java.lang.CharSequence r5, java.lang.CharSequence r6) {
            int r0 = r5.length()
            int r1 = r6.length()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
            r1 = 0
        Le:
            int r3 = r5.length()
            if (r0 >= r3) goto L21
            char r3 = r5.charAt(r0)
            char r4 = r6.charAt(r0)
            r3 = r3 ^ r4
            r1 = r1 | r3
            int r0 = r0 + 1
            goto Le
        L21:
            int r5 = equalsConstantTime(r1, r2)
            return r5
    }

    public static int equalsConstantTime(byte[] r4, int r5, byte[] r6, int r7, int r8) {
            int r8 = r8 + r5
            r0 = 0
            r1 = 0
        L3:
            if (r5 >= r8) goto L10
            r2 = r4[r5]
            r3 = r6[r7]
            r2 = r2 ^ r3
            r1 = r1 | r2
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L3
        L10:
            int r4 = equalsConstantTime(r1, r0)
            return r4
    }
}
