package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdp {
    public zzdp() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.math.BigDecimal zza(java.lang.String r6) throws java.lang.NumberFormatException {
            zzc(r6)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            int r1 = r0.scale()
            long r1 = (long) r1
            long r1 = java.lang.Math.abs(r1)
            r3 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L18
            return r0
        L18:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Number has unsupported scale: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
    }

    public static java.math.BigInteger zzb(java.lang.String r1) throws java.lang.NumberFormatException {
            zzc(r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            return r0
    }

    private static void zzc(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > r1) goto L9
            return
        L9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 0
            r2 = 30
            java.lang.String r3 = r3.substring(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number string too large: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "..."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
