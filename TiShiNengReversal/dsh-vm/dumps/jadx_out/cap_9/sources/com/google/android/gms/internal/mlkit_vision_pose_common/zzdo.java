package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdo extends java.util.AbstractMap implements java.io.Serializable {
    private static final java.util.Comparator zze = null;
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zza;
    int zzb;
    int zzc;
    final com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzd;
    private final java.util.Comparator zzf;
    private final boolean zzg;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzdj zzh;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzdl zzi;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdh r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdh
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo.zze = r0
            return
    }

    public zzdo() {
            r2 = this;
            java.util.Comparator r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdo.zze
            r1 = 1
            r2.<init>(r0, r1)
            return
    }

    public zzdo(java.util.Comparator r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            r1.zzf = r2
            r1.zzg = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdn
            r2.<init>(r3)
            r1.zzd = r2
            return
    }

    public zzdo(boolean r2) {
            r1 = this;
            java.util.Comparator r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdo.zze
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private final void zzf(com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r9, boolean r10) {
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r9.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r9.zzc
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.zzi
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.zzi
            goto L13
        L12:
            r4 = 0
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3 = r1.zzc
            if (r3 == 0) goto L22
            int r3 = r3.zzi
            goto L23
        L22:
            r3 = 0
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.zzi
            goto L29
        L28:
            r0 = 0
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.zzi(r1)
            r8.zzh(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.zzh(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r0.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3 = r0.zzc
            if (r3 == 0) goto L4e
            int r3 = r3.zzi
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.zzi
            goto L55
        L54:
            r1 = 0
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.zzh(r0)
            r8.zzi(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.zzi(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.zzi = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.zzi = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r9 = r9.zza
            goto L0
        L84:
            return
    }

    private final void zzg(com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r3.zza
            r1 = 0
            r3.zza = r1
            if (r4 == 0) goto L9
            r4.zza = r0
        L9:
            if (r0 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r0.zzb
            if (r1 != r3) goto L12
            r0.zzb = r4
            return
        L12:
            r0.zzc = r4
            return
        L15:
            r2.zza = r4
            return
    }

    private final void zzh(com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r6) {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r6.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r6.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3 = r1.zzc
            r6.zzc = r2
            if (r2 == 0) goto Le
            r2.zza = r6
        Le:
            r5.zzg(r6, r1)
            r1.zzb = r6
            r6.zza = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.zzi
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.zzi
            goto L22
        L21:
            r2 = 0
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r6.zzi = r0
            if (r3 == 0) goto L2e
            int r4 = r3.zzi
        L2e:
            int r6 = java.lang.Math.max(r0, r4)
            int r6 = r6 + 1
            r1.zzi = r6
            return
    }

    private final void zzi(com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r6) {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r6.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r6.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r0.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3 = r0.zzc
            r6.zzb = r3
            if (r3 == 0) goto Le
            r3.zza = r6
        Le:
            r5.zzg(r6, r0)
            r0.zzc = r6
            r6.zza = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.zzi
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.zzi
            goto L22
        L21:
            r3 = 0
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r6.zzi = r1
            if (r2 == 0) goto L2e
            int r4 = r2.zzi
        L2e:
            int r6 = java.lang.Math.max(r1, r4)
            int r6 = r6 + 1
            r0.zzi = r6
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r0 = 0
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            int r0 = r1.zzc
            int r0 = r0 + 1
            r1.zzc = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r1.zzd
            r0.zze = r0
            r0.zzd = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r0.zzc(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdj r0 = r1.zzh
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdj r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdj
            r0.<init>(r1)
            r1.zzh = r0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r0.zzc(r1)
            if (r1 == 0) goto L9
            java.lang.Object r1 = r1.zzh
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdl r0 = r1.zzi
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdl r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdl
            r0.<init>(r1)
            r1.zzi = r0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            if (r2 == 0) goto L1b
            if (r3 != 0) goto L11
            boolean r0 = r1.zzg
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "value == null"
            r2.<init>(r3)
            throw r2
        L11:
            r0 = 1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r1.zza(r2, r0)
            java.lang.Object r0 = r2.zzh
            r2.zzh = r3
            return r0
        L1b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r0.zzd(r1)
            if (r1 == 0) goto L9
            java.lang.Object r1 = r1.zzh
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    final com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zza(java.lang.Object r9, boolean r10) {
            r8 = this;
            java.util.Comparator r0 = r8.zzf
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r8.zza
            r2 = 0
            if (r1 == 0) goto L2f
            java.util.Comparator r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdo.zze
            if (r0 != r4) goto Lf
            r4 = r9
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            goto L10
        Lf:
            r4 = r2
        L10:
            if (r4 == 0) goto L19
            java.lang.Object r5 = r1.zzf
            int r5 = r4.compareTo(r5)
            goto L1f
        L19:
            java.lang.Object r5 = r1.zzf
            int r5 = r0.compare(r9, r5)
        L1f:
            if (r5 != 0) goto L22
            return r1
        L22:
            if (r5 >= 0) goto L27
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r6 = r1.zzb
            goto L29
        L27:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r6 = r1.zzc
        L29:
            if (r6 != 0) goto L2d
            r6 = r5
            goto L31
        L2d:
            r1 = r6
            goto L10
        L2f:
            r5 = 0
            r6 = 0
        L31:
            if (r10 != 0) goto L34
            return r2
        L34:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r4 = r8.zzd
            r7 = 1
            if (r1 != 0) goto L64
            java.util.Comparator r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdo.zze
            if (r0 != r1) goto L56
            boolean r0 = r9 instanceof java.lang.Comparable
            if (r0 == 0) goto L42
            goto L56
        L42:
            java.lang.Class r0 = r9.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = " is not Comparable"
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            throw r1
        L56:
            boolean r1 = r8.zzg
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdn
            r2 = 0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r5 = r4.zze
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8.zza = r0
            goto L79
        L64:
            r2 = r1
            boolean r1 = r8.zzg
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdn
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r5 = r4.zze
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            if (r6 >= 0) goto L74
            r2.zzb = r0
            goto L76
        L74:
            r2.zzc = r0
        L76:
            r8.zzf(r2, r7)
        L79:
            int r1 = r8.zzb
            int r1 = r1 + r7
            r8.zzb = r1
            int r1 = r8.zzc
            int r1 = r1 + r7
            r8.zzc = r1
            return r0
    }

    final com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzb(java.util.Map.Entry r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r2.zzc(r0)
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.zzh
            java.lang.Object r3 = r3.getValue()
            boolean r3 = java.util.Objects.equals(r1, r3)
            if (r3 == 0) goto L17
            return r0
        L17:
            r3 = 0
            return r3
    }

    final com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzc(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3 = r2.zza(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            return r3
        L9:
            return r0
    }

    final com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzd(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r1.zzc(r2)
            if (r2 == 0) goto La
            r0 = 1
            r1.zze(r2, r0)
        La:
            return r2
    }

    final void zze(com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r8 = r7.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r7.zzd
            r8.zzd = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r7.zzd
            r0.zze = r8
        Lc:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r8 = r7.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r7.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r7.zza
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L58
            if (r0 == 0) goto L58
            int r1 = r8.zzi
            int r4 = r0.zzi
            if (r1 <= r4) goto L26
        L1e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r8.zzc
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L2f
            goto L1e
        L26:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r8 = r0.zzb
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L2e
            goto L26
        L2e:
            r0 = r8
        L2f:
            r6.zze(r0, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r8 = r7.zzb
            if (r8 == 0) goto L3f
            int r1 = r8.zzi
            r0.zzb = r8
            r8.zza = r0
            r7.zzb = r3
            goto L40
        L3f:
            r1 = 0
        L40:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r8 = r7.zzc
            if (r8 == 0) goto L4c
            int r2 = r8.zzi
            r0.zzc = r8
            r8.zza = r0
            r7.zzc = r3
        L4c:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.zzi = r8
            r6.zzg(r7, r0)
            return
        L58:
            if (r8 == 0) goto L60
            r6.zzg(r7, r8)
            r7.zzb = r3
            goto L6b
        L60:
            if (r0 == 0) goto L68
            r6.zzg(r7, r0)
            r7.zzc = r3
            goto L6b
        L68:
            r6.zzg(r7, r3)
        L6b:
            r6.zzf(r1, r2)
            int r7 = r6.zzb
            int r7 = r7 + (-1)
            r6.zzb = r7
            int r7 = r6.zzc
            int r7 = r7 + 1
            r6.zzc = r7
            return
    }
}
