package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzo extends com.google.android.gms.internal.mlkit_acceleration.zzm {
    static final int zza = 0;
    static final com.google.android.gms.internal.mlkit_acceleration.zzp zzb = null;

    static {
            r0 = 31
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzo.zza = r0
            com.google.android.gms.internal.mlkit_acceleration.zzo r0 = new com.google.android.gms.internal.mlkit_acceleration.zzo
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzo.zzb = r0
            return
    }

    zzo() {
            r1 = this;
            java.lang.String r0 = "CharMatcher.whitespace()"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzp
    public final boolean zza(char r3) {
            r2 = this;
            r0 = 1682554634(0x6449bf0a, float:1.4886245E22)
            int r0 = r0 * r3
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzo.zza
            int r0 = r0 >>> r1
            java.lang.String r1 = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000"
            char r0 = r1.charAt(r0)
            if (r0 != r3) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }
}
