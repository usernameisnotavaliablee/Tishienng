package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PseudoRandomFunction {
    private PseudoRandomFunction() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] concat(byte[] r3, byte[] r4) {
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            byte[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    static byte[] hash(byte[] r5, byte[] r6, byte[] r7, int r8, java.lang.String r9) {
            if (r8 < 0) goto L55
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r9)     // Catch: java.security.GeneralSecurityException -> L37
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L37
            r1.<init>(r5, r9)     // Catch: java.security.GeneralSecurityException -> L37
            r0.init(r1)     // Catch: java.security.GeneralSecurityException -> L37
            double r1 = (double) r8     // Catch: java.security.GeneralSecurityException -> L37
            int r5 = r0.getMacLength()     // Catch: java.security.GeneralSecurityException -> L37
            double r3 = (double) r5     // Catch: java.security.GeneralSecurityException -> L37
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)     // Catch: java.security.GeneralSecurityException -> L37
            int r5 = (int) r1     // Catch: java.security.GeneralSecurityException -> L37
            byte[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES     // Catch: java.security.GeneralSecurityException -> L37
            byte[] r6 = concat(r6, r7)     // Catch: java.security.GeneralSecurityException -> L37
            r7 = 0
            r2 = r6
        L22:
            if (r7 >= r5) goto L39
            byte[] r2 = r0.doFinal(r2)     // Catch: java.security.GeneralSecurityException -> L37
            byte[] r3 = concat(r2, r6)     // Catch: java.security.GeneralSecurityException -> L37
            byte[] r3 = r0.doFinal(r3)     // Catch: java.security.GeneralSecurityException -> L37
            byte[] r1 = concat(r1, r3)     // Catch: java.security.GeneralSecurityException -> L37
            int r7 = r7 + 1
            goto L22
        L37:
            r5 = move-exception
            goto L3e
        L39:
            byte[] r5 = java.util.Arrays.copyOf(r1, r8)     // Catch: java.security.GeneralSecurityException -> L37
            return r5
        L3e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Could not find algo: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        L55:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "You must provide a length greater than zero."
            r5.<init>(r6)
            throw r5
    }
}
