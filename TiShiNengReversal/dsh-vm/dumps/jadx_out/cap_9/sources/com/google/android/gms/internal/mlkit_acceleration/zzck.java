package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzck implements java.util.Comparator {
    zzck() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzcs r5 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r5
            com.google.android.gms.internal.mlkit_acceleration.zzcs r6 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r6
            com.google.android.gms.internal.mlkit_acceleration.zzcj r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcj
            r0.<init>(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcj r1 = new com.google.android.gms.internal.mlkit_acceleration.zzcj
            r1.<init>(r6)
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            byte r2 = r0.zza()
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            byte r3 = r1.zza()
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto Le
            return r2
        L35:
            int r5 = r5.zzd()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r6.zzd()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r5 = r5.compareTo(r6)
            return r5
    }
}
