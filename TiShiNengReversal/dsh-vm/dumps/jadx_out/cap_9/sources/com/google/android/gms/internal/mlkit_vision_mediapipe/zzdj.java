package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdj extends java.util.AbstractMap {
    private static final java.util.Comparator zza = null;
    private final java.lang.Object[] zzb;
    private final int[] zzc;
    private final java.util.Set zzd;
    private java.lang.Integer zze;
    private java.lang.String zzf;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdg r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zza = r0
            return
    }

    zzdj(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r20, com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r21) {
            r19 = this;
            r0 = r19
            r6 = r20
            r7 = r21
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi
            r8 = -1
            r1.<init>(r0, r8)
            r0.zzd = r1
            r1 = 0
            r0.zze = r1
            r0.zzf = r1
            int r1 = r6.size()
            int r2 = r7.size()
            int r1 = r1 + r2
            int[] r2 = r6.zzc
            int r3 = r6.size()
            r2 = r2[r3]
            int[] r3 = r7.zzc
            int r4 = r7.size()
            r3 = r3[r4]
            int r9 = r2 + r3
            int r10 = r1 + 1
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int[] r5 = new int[r10]
            r11 = 0
            r5[r11] = r1
            java.util.Map$Entry r2 = r6.zze(r11)
            java.util.Map$Entry r3 = r7.zze(r11)
            r12 = r3
            r13 = 0
            r14 = 0
            r3 = r1
            r1 = r2
            r2 = 0
        L48:
            r15 = 1
            if (r1 != 0) goto L4d
            if (r12 == 0) goto L50
        L4d:
            int r16 = r2 + 1
            goto L89
        L50:
            r1 = r5[r11]
            int r3 = r1 - r2
            if (r3 != 0) goto L57
            goto L77
        L57:
            r6 = 0
        L58:
            if (r6 > r2) goto L62
            r7 = r5[r6]
            int r7 = r7 - r3
            r5[r6] = r7
            int r6 = r6 + 1
            goto L58
        L62:
            r3 = r5[r2]
            int r6 = r3 - r2
            boolean r7 = zzg(r9, r3)
            if (r7 == 0) goto L72
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.System.arraycopy(r4, r11, r3, r11, r2)
            goto L73
        L72:
            r3 = r4
        L73:
            java.lang.System.arraycopy(r4, r1, r3, r2, r6)
            r4 = r3
        L77:
            r0.zzb = r4
            r1 = r5[r11]
            int r1 = r1 + r15
            boolean r2 = zzg(r10, r1)
            if (r2 == 0) goto L86
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
        L86:
            r0.zzc = r5
            return
        L89:
            if (r1 != 0) goto L8e
            r17 = 1
            goto L95
        L8e:
            if (r12 != 0) goto L93
            r17 = -1
            goto L95
        L93:
            r17 = 0
        L95:
            if (r17 != 0) goto L148
            java.lang.Object r17 = r1.getKey()
            r8 = r17
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r17 = r12.getKey()
            r11 = r17
            java.lang.String r11 = (java.lang.String) r11
            int r17 = r8.compareTo(r11)
            if (r17 != 0) goto L148
            int r8 = r14 + 1
            int r11 = r13 + 1
            java.lang.Object r13 = r1.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map$Entry r13 = r0.zzf(r13, r2)
            r4[r2] = r13
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi) r1
            java.lang.Object r2 = r12.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi) r2
            r12 = 0
            r13 = 0
        Lcb:
            int r14 = r1.zza()
            int r17 = r1.zzb()
            int r14 = r14 - r17
            if (r12 < r14) goto Lf6
            int r14 = r2.zza()
            int r17 = r2.zzb()
            int r14 = r14 - r17
            if (r13 >= r14) goto Le4
            goto Lf6
        Le4:
            r5[r16] = r3
            java.util.Map$Entry r1 = r6.zze(r11)
            java.util.Map$Entry r12 = r7.zze(r8)
            r14 = r8
            r13 = r11
            r2 = r16
            r8 = -1
            r11 = 0
            goto L48
        Lf6:
            int r14 = r1.zza()
            int r17 = r1.zzb()
            int r14 = r14 - r17
            if (r12 != r14) goto L104
            r14 = 1
            goto L113
        L104:
            int r14 = r2.zza()
            int r17 = r2.zzb()
            int r14 = r14 - r17
            if (r13 != r14) goto L112
            r14 = -1
            goto L113
        L112:
            r14 = 0
        L113:
            if (r14 != 0) goto L125
            java.util.Comparator r14 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl.zzc()
            java.lang.Object r15 = r1.zzc(r12)
            java.lang.Object r0 = r2.zzc(r13)
            int r14 = r14.compare(r15, r0)
        L125:
            if (r14 >= 0) goto L12e
            int r0 = r12 + 1
            java.lang.Object r12 = r1.zzc(r12)
            goto L13e
        L12e:
            int r0 = r13 + 1
            java.lang.Object r13 = r2.zzc(r13)
            if (r14 != 0) goto L138
            int r12 = r12 + 1
        L138:
            r18 = r13
            r13 = r0
            r0 = r12
            r12 = r18
        L13e:
            int r14 = r3 + 1
            r4[r3] = r12
            r12 = r0
            r3 = r14
            r15 = 1
            r0 = r19
            goto Lcb
        L148:
            if (r17 >= 0) goto L159
            int r13 = r13 + 1
            r0 = r19
            int r1 = r0.zzd(r1, r2, r3, r4, r5)
            java.util.Map$Entry r0 = r6.zze(r13)
            r3 = r1
            r1 = r0
            goto L16a
        L159:
            r8 = r1
            int r14 = r14 + 1
            r0 = r19
            r1 = r12
            int r1 = r0.zzd(r1, r2, r3, r4, r5)
            java.util.Map$Entry r0 = r7.zze(r14)
            r12 = r0
            r3 = r1
            r1 = r8
        L16a:
            r2 = r16
            r8 = -1
            r11 = 0
            r0 = r19
            goto L48
    }

    zzdj(java.util.List r5) {
            r4 = this;
            r4.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi
            r1 = -1
            r0.<init>(r4, r1)
            r4.zzd = r0
            r0 = 0
            r4.zze = r0
            r4.zzf = r0
            java.util.Iterator r1 = r5.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L48
            int r1 = r5.size()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L3e
            r5 = 0
            int[] r0 = new int[]{r5}
            boolean r1 = zzg(r1, r5)
            if (r1 == 0) goto L39
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
        L39:
            r4.zzb = r2
            r4.zzc = r0
            return
        L3e:
            java.lang.Object r5 = r5.next()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdf r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdf) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdf.zza(r5)
            throw r0
        L48:
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdf r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdf) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdf.zza(r5)
            throw r0
    }

    static /* bridge */ /* synthetic */ java.util.Comparator zza() {
            java.util.Comparator r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zza
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0) {
            int[] r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object[] zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0) {
            java.lang.Object[] r0 = r0.zzb
            return r0
    }

    private final int zzd(java.util.Map.Entry r4, int r5, int r6, java.lang.Object[] r7, int[] r8) {
            r3 = this;
            java.lang.Object r0 = r4.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi) r0
            int r1 = r0.zza()
            int r2 = r0.zzb()
            int r1 = r1 - r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r2 = r0.zzb
            java.lang.Object[] r2 = r2.zzb
            int r0 = r0.zzb()
            java.lang.System.arraycopy(r2, r0, r7, r6, r1)
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map$Entry r4 = r3.zzf(r4, r5)
            r7[r5] = r4
            int r5 = r5 + 1
            int r6 = r6 + r1
            r8[r5] = r6
            return r6
    }

    private final java.util.Map.Entry zze(int r3) {
            r2 = this;
            int[] r0 = r2.zzc
            r1 = 0
            r0 = r0[r1]
            if (r3 >= r0) goto Le
            java.lang.Object[] r0 = r2.zzb
            r3 = r0[r3]
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            return r3
        Le:
            r3 = 0
            return r3
    }

    private final java.util.Map.Entry zzf(java.lang.String r3, int r4) {
            r2 = this;
            java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi
            r1.<init>(r2, r4)
            r0.<init>(r3, r1)
            return r0
    }

    private static boolean zzg(int r1, int r2) {
            r0 = 16
            if (r1 <= r0) goto Lc
            int r1 = r1 * 9
            int r2 = r2 * 10
            if (r1 <= r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = r1.zzd
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r1 = this;
            java.lang.Integer r0 = r1.zze
            if (r0 != 0) goto Le
            int r0 = super.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.zze = r0
        Le:
            java.lang.Integer r0 = r1.zze
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            if (r0 != 0) goto La
            java.lang.String r0 = super.toString()
            r1.zzf = r0
        La:
            java.lang.String r0 = r1.zzf
            return r0
    }
}
