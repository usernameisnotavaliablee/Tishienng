package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdb extends com.google.android.gms.internal.mlkit_vision_pose_common.zzcv {
    private final java.lang.Object zza;

    public zzdb(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    public zzdb(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    public zzdb(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    private static boolean zzk(com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r2) {
            java.lang.Object r2 = r2.zza
            boolean r0 = r2 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.Number r2 = (java.lang.Number) r2
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L1f
            boolean r2 = r2 instanceof java.lang.Byte
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            return r1
        L1f:
            r2 = 1
            return r2
        L21:
            return r1
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L9f
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzdb> r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdb.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            return r1
        L10:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r7 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzdb) r7
            java.lang.Object r2 = r6.zza
            if (r2 != 0) goto L1c
            java.lang.Object r7 = r7.zza
            if (r7 != 0) goto L1b
            return r0
        L1b:
            return r1
        L1c:
            boolean r2 = zzk(r6)
            if (r2 == 0) goto L58
            boolean r2 = zzk(r7)
            if (r2 == 0) goto L58
            java.lang.Object r2 = r6.zza
            boolean r2 = r2 instanceof java.math.BigInteger
            if (r2 != 0) goto L4b
            java.lang.Object r2 = r7.zza
            boolean r2 = r2 instanceof java.math.BigInteger
            if (r2 == 0) goto L35
            goto L4b
        L35:
            java.lang.Number r2 = r6.zzd()
            long r2 = r2.longValue()
            java.lang.Number r7 = r7.zzd()
            long r4 = r7.longValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L4a
            return r0
        L4a:
            return r1
        L4b:
            java.math.BigInteger r0 = r6.zzg()
            java.math.BigInteger r7 = r7.zzg()
            boolean r7 = r0.equals(r7)
            return r7
        L58:
            java.lang.Object r2 = r6.zza
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L98
            java.lang.Object r3 = r7.zza
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L98
            boolean r2 = r2 instanceof java.math.BigDecimal
            if (r2 == 0) goto L7c
            boolean r2 = r3 instanceof java.math.BigDecimal
            if (r2 == 0) goto L7c
            java.math.BigDecimal r2 = r6.zzf()
            java.math.BigDecimal r7 = r7.zzf()
            int r7 = r2.compareTo(r7)
            if (r7 != 0) goto L7b
            return r0
        L7b:
            return r1
        L7c:
            double r2 = r6.zza()
            double r4 = r7.zza()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L97
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L96
            boolean r7 = java.lang.Double.isNaN(r4)
            if (r7 != 0) goto L95
            return r1
        L95:
            return r0
        L96:
            return r1
        L97:
            return r0
        L98:
            java.lang.Object r7 = r7.zza
            boolean r7 = r2.equals(r7)
            return r7
        L9f:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.zza
            if (r0 != 0) goto L7
            r0 = 31
            return r0
        L7:
            boolean r0 = zzk(r4)
            r1 = 32
            if (r0 == 0) goto L1c
            java.lang.Number r0 = r4.zzd()
            long r2 = r0.longValue()
        L17:
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
        L1c:
            java.lang.Object r0 = r4.zza
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L2f
            java.lang.Number r0 = r4.zzd()
            double r2 = r0.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            goto L17
        L2f:
            int r0 = r0.hashCode()
            return r0
    }

    public final double zza() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.zzd()
            double r0 = r0.doubleValue()
            return r0
        Lf:
            java.lang.String r0 = r2.zze()
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public final long zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.zzd()
            long r0 = r0.longValue()
            return r0
        Lf:
            java.lang.String r0 = r2.zze()
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public final java.lang.Number zzd() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L9
            java.lang.Number r0 = (java.lang.Number) r0
            return r0
        L9:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdg r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdg
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            return r1
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Primitive is neither a number nor a string"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String zze() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L32
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 != 0) goto L29
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r0 = r0.toString()
            return r0
        L15:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unexpected value type: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L29:
            java.lang.Number r0 = r3.zzd()
            java.lang.String r0 = r0.toString()
            return r0
        L32:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.math.BigDecimal zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            boolean r1 = r0 instanceof java.math.BigDecimal
            if (r1 == 0) goto L9
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            return r0
        L9:
            java.lang.String r0 = r2.zze()
            java.math.BigDecimal r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdp.zza(r0)
            return r0
    }

    public final java.math.BigInteger zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto L9
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        L9:
            boolean r0 = zzk(r2)
            if (r0 == 0) goto L1c
            java.lang.Number r0 = r2.zzd()
            long r0 = r0.longValue()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
        L1c:
            java.lang.String r0 = r2.zze()
            java.math.BigInteger r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdp.zzb(r0)
            return r0
    }

    public final boolean zzh() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto Ld
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Ld:
            java.lang.String r0 = r2.zze()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    public final boolean zzi() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r0 = r0 instanceof java.lang.Boolean
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r0 = r0 instanceof java.lang.Number
            return r0
    }
}
