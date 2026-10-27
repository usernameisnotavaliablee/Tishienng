package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdg extends java.lang.Number {
    private final java.lang.String zza;

    public zzdg(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Number
    public final double doubleValue() {
            r2 = this;
            java.lang.String r0 = r2.zza
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzdg
            if (r0 == 0) goto L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdg r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzdg) r2
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // java.lang.Number
    public final float floatValue() {
            r1 = this;
            java.lang.String r0 = r1.zza
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public final int intValue() {
            r2 = this;
            java.lang.String r0 = r2.zza     // Catch: java.lang.NumberFormatException -> L7
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.lang.String r0 = r2.zza     // Catch: java.lang.NumberFormatException -> Lf
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r1 = (int) r0
            return r1
        Lf:
            java.lang.String r0 = r2.zza
            java.math.BigDecimal r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdp.zza(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.lang.Number
    public final long longValue() {
            r2 = this;
            java.lang.String r0 = r2.zza     // Catch: java.lang.NumberFormatException -> L7
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.lang.String r0 = r2.zza
            java.math.BigDecimal r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdp.zza(r0)
            long r0 = r0.longValue()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
