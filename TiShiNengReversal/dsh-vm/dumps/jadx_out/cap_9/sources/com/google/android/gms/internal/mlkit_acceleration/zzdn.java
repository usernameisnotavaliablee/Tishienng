package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdn {
    private static final com.google.android.gms.internal.mlkit_acceleration.zzdn zzb = null;
    final com.google.android.gms.internal.mlkit_acceleration.zzfz zza;
    private boolean zzc;
    private boolean zzd;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzdn r0 = new com.google.android.gms.internal.mlkit_acceleration.zzdn
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzdn.zzb = r0
            return
    }

    private zzdn() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzfp r0 = new com.google.android.gms.internal.mlkit_acceleration.zzfp
            r1 = 16
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    private zzdn(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfp r2 = new com.google.android.gms.internal.mlkit_acceleration.zzfp
            r0 = 0
            r2.<init>(r0)
            r1.<init>()
            r1.zza = r2
            r1.zzb()
            r1.zzb()
            return
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzdn zza() {
            r0 = 0
            throw r0
    }

    private static final void zzd(com.google.android.gms.internal.mlkit_acceleration.zzdm r4, java.lang.Object r5) {
            com.google.android.gms.internal.mlkit_acceleration.zzgt r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd
            r5.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzgt r1 = com.google.android.gms.internal.mlkit_acceleration.zzgt.zza
            com.google.android.gms.internal.mlkit_acceleration.zzgu r1 = com.google.android.gms.internal.mlkit_acceleration.zzgu.zza
            com.google.android.gms.internal.mlkit_acceleration.zzgu r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzfa
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzef
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdx
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzcs
            if (r0 != 0) goto L33
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzgt r4 = r4.zzb()
            com.google.android.gms.internal.mlkit_acceleration.zzgu r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r4 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdn r0 = new com.google.android.gms.internal.mlkit_acceleration.zzdn
            r0.<init>()
            r1 = 0
        L6:
            com.google.android.gms.internal.mlkit_acceleration.zzfz r2 = r4.zza
            int r2 = r2.zzb()
            if (r1 >= r2) goto L24
            com.google.android.gms.internal.mlkit_acceleration.zzfz r2 = r4.zza
            java.util.Map$Entry r2 = r2.zzg(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.mlkit_acceleration.zzdm r3 = (com.google.android.gms.internal.mlkit_acceleration.zzdm) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzc(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzfz r1 = r4.zza
            java.lang.Iterable r1 = r1.zzc()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.mlkit_acceleration.zzdm r3 = (com.google.android.gms.internal.mlkit_acceleration.zzdm) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzc(r3, r2)
            goto L2e
        L48:
            boolean r1 = r4.zzd
            r0.zzd = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdn
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.mlkit_acceleration.zzdn r2 = (com.google.android.gms.internal.mlkit_acceleration.zzdn) r2
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r1.zza
            com.google.android.gms.internal.mlkit_acceleration.zzfz r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final void zzb() {
            r3 = this;
            boolean r0 = r3.zzc
            if (r0 != 0) goto L2f
            r0 = 0
        L5:
            com.google.android.gms.internal.mlkit_acceleration.zzfz r1 = r3.zza
            int r1 = r1.zzb()
            if (r0 >= r1) goto L27
            com.google.android.gms.internal.mlkit_acceleration.zzfz r1 = r3.zza
            java.util.Map$Entry r1 = r1.zzg(r0)
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdv
            if (r2 == 0) goto L24
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r1
            r1.zzI()
        L24:
            int r0 = r0 + 1
            goto L5
        L27:
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r3.zza
            r0.zza()
            r0 = 1
            r3.zzc = r0
        L2f:
            return
    }

    public final void zzc(com.google.android.gms.internal.mlkit_acceleration.zzdm r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.zzc()
            if (r0 == 0) goto L2f
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            r0.addAll(r5)
            int r5 = r0.size()
            r1 = 0
        L19:
            if (r1 >= r5) goto L25
            java.lang.Object r2 = r0.get(r1)
            zzd(r4, r2)
            int r1 = r1 + 1
            goto L19
        L25:
            r5 = r0
            goto L32
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L2f:
            zzd(r4, r5)
        L32:
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzef
            if (r0 == 0) goto L39
            r0 = 1
            r3.zzd = r0
        L39:
            com.google.android.gms.internal.mlkit_acceleration.zzfz r0 = r3.zza
            r0.zze(r4, r5)
            return
    }
}
