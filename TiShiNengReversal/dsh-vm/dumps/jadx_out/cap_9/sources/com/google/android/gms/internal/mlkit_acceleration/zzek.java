package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzek extends com.google.android.gms.internal.mlkit_acceleration.zzeo {
    private static final java.lang.Class zza = null;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzek.zza = r0
            return
    }

    private zzek() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    /* synthetic */ zzek(com.google.android.gms.internal.mlkit_acceleration.zzej r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    private static java.util.List zzf(java.lang.Object r3, long r4, int r6) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2e
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzei
            if (r1 == 0) goto L16
            com.google.android.gms.internal.mlkit_acceleration.zzeh r0 = new com.google.android.gms.internal.mlkit_acceleration.zzeh
            r0.<init>(r6)
            goto L2a
        L16:
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzfh
            if (r1 == 0) goto L25
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzea
            if (r1 == 0) goto L25
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r0
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = r0.zzd(r6)
            goto L2a
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L2a:
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r3, r4, r0)
            return r0
        L2e:
            java.lang.Class r1 = com.google.android.gms.internal.mlkit_acceleration.zzek.zza
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L4b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r3, r4, r1)
            return r1
        L4b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzgi
            if (r1 == 0) goto L66
            com.google.android.gms.internal.mlkit_acceleration.zzeh r1 = new com.google.android.gms.internal.mlkit_acceleration.zzeh
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzgi r0 = (com.google.android.gms.internal.mlkit_acceleration.zzgi) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r3, r4, r1)
            return r1
        L66:
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzfh
            if (r1 == 0) goto L85
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzea
            if (r1 == 0) goto L85
            r1 = r0
            com.google.android.gms.internal.mlkit_acceleration.zzea r1 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r1
            boolean r2 = r1.zzc()
            if (r2 == 0) goto L78
            goto L85
        L78:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.mlkit_acceleration.zzea r6 = r1.zzd(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r3, r4, r6)
            return r6
        L85:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzeo
    final java.util.List zza(java.lang.Object r2, long r3) {
            r1 = this;
            r0 = 10
            java.util.List r2 = zzf(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzeo
    final void zzb(java.lang.Object r4, long r5) {
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r4, r5)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzei
            if (r1 == 0) goto L11
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = (com.google.android.gms.internal.mlkit_acceleration.zzei) r0
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = r0.zze()
            goto L36
        L11:
            java.lang.Class r1 = com.google.android.gms.internal.mlkit_acceleration.zzek.zza
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L1e
            goto L31
        L1e:
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzfh
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzea
            if (r1 == 0) goto L32
            com.google.android.gms.internal.mlkit_acceleration.zzea r0 = (com.google.android.gms.internal.mlkit_acceleration.zzea) r0
            boolean r4 = r0.zzc()
            if (r4 == 0) goto L31
            r0.zzb()
        L31:
            return
        L32:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L36:
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r4, r5, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzeo
    final void zzc(java.lang.Object r4, java.lang.Object r5, long r6) {
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zzf(r5, r6)
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.List r0 = zzf(r4, r6, r0)
            int r1 = r0.size()
            int r2 = r5.size()
            if (r1 <= 0) goto L1d
            if (r2 <= 0) goto L1d
            r0.addAll(r5)
        L1d:
            if (r1 <= 0) goto L20
            r5 = r0
        L20:
            com.google.android.gms.internal.mlkit_acceleration.zzgn.zzs(r4, r6, r5)
            return
    }
}
