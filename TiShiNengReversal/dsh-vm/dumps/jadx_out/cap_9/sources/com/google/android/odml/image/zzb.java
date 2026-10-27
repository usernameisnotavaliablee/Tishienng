package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzb extends com.google.android.odml.image.zzh {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;

    zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.odml.image.zzh
    final com.google.android.odml.image.zzh zza(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.odml.image.zzh
    final com.google.android.odml.image.zzh zzb(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.odml.image.zzh
    final com.google.android.odml.image.ImageProperties zzc() {
            r4 = this;
            java.lang.Integer r0 = r4.zza
            if (r0 == 0) goto L1a
            java.lang.Integer r1 = r4.zzb
            if (r1 != 0) goto L9
            goto L1a
        L9:
            com.google.android.odml.image.zzc r1 = new com.google.android.odml.image.zzc
            int r0 = r0.intValue()
            java.lang.Integer r2 = r4.zzb
            int r2 = r2.intValue()
            r3 = 0
            r1.<init>(r0, r2, r3)
            return r1
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r4.zza
            if (r1 != 0) goto L28
            java.lang.String r1 = " imageFormat"
            r0.append(r1)
        L28:
            java.lang.Integer r1 = r4.zzb
            if (r1 != 0) goto L31
            java.lang.String r1 = " storageType"
            r0.append(r1)
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 28
            r3.<init>(r2)
            java.lang.String r2 = "Missing required properties:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
    }
}
