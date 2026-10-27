package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzaw extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzdt implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp {
    protected final java.lang.Object[] zza;
    protected final java.lang.StringBuilder zzb;
    private int zzc;

    protected zzaw(com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r1, java.lang.Object[] r2, java.lang.StringBuilder r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzc = r1
            java.lang.String r1 = "arguments"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r2, r1)
            r0.zza = r2
            r0.zzb = r3
            return
    }

    public static java.lang.StringBuilder zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r3, java.lang.StringBuilder r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r3.zzi()
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaw r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzaw
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r1 = r3.zzi()
            java.lang.Object[] r2 = r3.zzq()
            r0.<init>(r1, r2, r4)
            java.lang.Object r4 = r0.zzj()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            java.lang.Object[] r3 = r3.zzq()
            int r3 = r3.length
            int r0 = r0.zzh()
            if (r3 <= r0) goto L29
            java.lang.String r3 = " [ERROR: UNUSED LOG ARGUMENTS]"
            r4.append(r3)
        L29:
            return r4
        L2a:
            java.lang.Object r3 = r3.zzj()
            java.lang.String r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza(r3)
            r4.append(r3)
            return r4
    }

    private static void zzm(java.lang.StringBuilder r1, java.lang.Object r2, java.lang.String r3) {
            java.lang.String r0 = "[INVALID: format="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ", type="
            r1.append(r3)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1.append(r3)
            java.lang.String r3 = ", value="
            r1.append(r3)
            java.lang.String r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza(r2)
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdt
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r5.zzi()
            java.lang.String r1 = r5.zzk()
            int r2 = r5.zzc
            java.lang.String r3 = r5.zzk()
            int r3 = r3.length()
            java.lang.StringBuilder r4 = r5.zzb
            r0.zzd(r4, r1, r2, r3)
            java.lang.StringBuilder r0 = r5.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdt
    public final void zzc(int r5, int r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo r7) {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r4.zzi()
            java.lang.StringBuilder r1 = r4.zzb
            java.lang.String r2 = r4.zzk()
            int r3 = r4.zzc
            r0.zzd(r1, r2, r3, r5)
            java.lang.Object[] r5 = r4.zza
            r7.zze(r4, r5)
            r4.zzc = r6
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp
    public final void zzd(java.lang.Object r7, com.google.android.gms.internal.mlkit_vision_mediapipe.zzax r8, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r9) {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaz r0 = r8.zzd()
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L6a
            if (r0 == r4) goto L5b
            if (r0 == r2) goto L3e
            if (r0 == r1) goto L29
            r5 = 4
            if (r0 != r5) goto L27
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 != 0) goto L23
            boolean r0 = r7 instanceof java.math.BigDecimal
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L5d
        L25:
            r0 = 0
            goto L5d
        L27:
            r7 = 0
            throw r7
        L29:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 != 0) goto L23
            boolean r0 = r7 instanceof java.math.BigInteger
            if (r0 == 0) goto L25
            goto L23
        L3e:
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto L43
            goto L23
        L43:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4f
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 != 0) goto L4f
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L25
        L4f:
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = java.lang.Character.isValidCodePoint(r0)
            goto L5d
        L5b:
            boolean r0 = r7 instanceof java.lang.Boolean
        L5d:
            if (r0 == 0) goto L60
            goto L6a
        L60:
            java.lang.StringBuilder r9 = r6.zzb
            java.lang.String r8 = r8.zze()
            zzm(r9, r7, r8)
            return
        L6a:
            java.lang.StringBuilder r0 = r6.zzb
            int r5 = r8.ordinal()
            if (r5 == 0) goto Lbd
            if (r5 == r4) goto Lb3
            if (r5 == r2) goto L8e
            if (r5 == r1) goto Lb3
            r1 = 5
            if (r5 == r1) goto L7c
            goto Lcf
        L7c:
            r1 = 128(0x80, float:1.8E-43)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r1 = r9.zze(r1, r3, r3)
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto Lcf
            java.lang.Number r7 = (java.lang.Number) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zzb(r0, r7, r9)
            return
        L8e:
            boolean r1 = r9.zzj()
            if (r1 == 0) goto Lcf
            boolean r8 = r7 instanceof java.lang.Character
            if (r8 == 0) goto L9c
            r0.append(r7)
            return
        L9c:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r8 = r7 >>> 16
            if (r8 != 0) goto Lab
            char r7 = (char) r7
            r0.append(r7)
            return
        Lab:
            char[] r7 = java.lang.Character.toChars(r7)
            r0.append(r7)
            return
        Lb3:
            boolean r1 = r9.zzj()
            if (r1 == 0) goto Lcf
            r0.append(r7)
            return
        Lbd:
            boolean r1 = r7 instanceof java.util.Formattable
            if (r1 != 0) goto L107
            boolean r1 = r9.zzj()
            if (r1 == 0) goto Lcf
            java.lang.String r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza(r7)
            r0.append(r7)
            return
        Lcf:
            java.lang.String r1 = r8.zze()
            boolean r2 = r9.zzj()
            if (r2 != 0) goto Lf9
            char r8 = r8.zza()
            boolean r1 = r9.zzk()
            if (r1 == 0) goto Le7
            r1 = 65503(0xffdf, float:9.1789E-41)
            r8 = r8 & r1
        Le7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "%"
            r1.<init>(r2)
            r9.zzh(r1)
            char r8 = (char) r8
            r1.append(r8)
            java.lang.String r1 = r1.toString()
        Lf9:
            java.util.Locale r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1, r9)
            r0.append(r7)
            return
        L107:
            java.util.Formattable r7 = (java.util.Formattable) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zzc(r7, r0, r9)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp
    public final void zze(java.lang.Object r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r6) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Date
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof java.util.Calendar
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto Ld
            goto L28
        Ld:
            java.lang.StringBuilder r6 = r3.zzb
            char r5 = r5.zza()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "%t"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            zzm(r6, r4, r5)
            return
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "%"
            r0.<init>(r1)
            r6.zzh(r0)
            boolean r6 = r6.zzk()
            r1 = 1
            if (r1 == r6) goto L3c
            r6 = 116(0x74, float:1.63E-43)
            goto L3e
        L3c:
            r6 = 84
        L3e:
            r0.append(r6)
            char r5 = r5.zza()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r6 = r3.zzb
            java.util.Locale r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = java.lang.String.format(r0, r5, r1)
            r6.append(r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp
    public final void zzf() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.zzb
            java.lang.String r1 = "[ERROR: MISSING LOG ARGUMENT]"
            r0.append(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp
    public final void zzg() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.zzb
            java.lang.String r1 = "null"
            r0.append(r1)
            return
    }
}
