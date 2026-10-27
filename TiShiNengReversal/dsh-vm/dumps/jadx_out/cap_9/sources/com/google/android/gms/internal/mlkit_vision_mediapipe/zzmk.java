package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzmk {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw zzb = null;

    static {
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmy r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzmy
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzb = r0
            return
    }

    public zzmk() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void zzA(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzC(r1, r2, r4)
        Lb:
            return
    }

    public static void zzB(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzE(r1, r2, r4)
        Lb:
            return
    }

    public static void zzC(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzJ(r1, r2, r4)
        Lb:
            return
    }

    public static void zzD(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzL(r1, r2, r4)
        Lb:
            return
    }

    static boolean zzE(java.lang.Object r2, java.lang.Object r3) {
            r0 = 1
            if (r2 == r3) goto Le
            r1 = 0
            if (r2 == 0) goto Ld
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            return r1
        Le:
            return r0
    }

    static int zza(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzks
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1e
            int r3 = r5.zze(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            return r2
        L1f:
            r2 = 0
        L20:
            if (r1 >= r0) goto L35
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L20
        L35:
            return r2
    }

    static int zzb(int r0, java.util.List r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r0 = r0 + 4
            int r1 = r1 * r0
            return r1
    }

    static int zzc(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    static int zzd(int r0, java.util.List r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r0 = r0 + 8
            int r1 = r1 * r0
            return r1
    }

    static int zze(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    static int zzf(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzks
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1e
            int r3 = r5.zze(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            return r2
        L1f:
            r2 = 0
        L20:
            if (r1 >= r0) goto L35
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L20
        L35:
            return r2
    }

    static int zzg(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzll
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1d
            long r3 = r5.zza(r1)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = 0
        L1f:
            if (r1 >= r0) goto L33
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    static int zzh(int r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r3) {
            int r1 = r1 << 3
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh
            if (r0 == 0) goto L17
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh) r2
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r1)
            int r2 = r2.zza()
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r2)
            int r3 = r3 + r2
            int r1 = r1 + r3
            return r1
        L17:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r2
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r1)
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzx(r2, r3)
            int r1 = r1 + r2
            return r1
    }

    static int zzi(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzks
            if (r2 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L22
            int r3 = r5.zze(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L22:
            return r2
        L23:
            r2 = 0
        L24:
            if (r1 >= r0) goto L3d
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L24
        L3d:
            return r2
    }

    static int zzj(java.util.List r8) {
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzll
            r3 = 63
            if (r2 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r8
            r2 = 0
        L11:
            if (r1 >= r0) goto L23
            long r4 = r8.zza(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L11
        L23:
            return r2
        L24:
            r2 = 0
        L25:
            if (r1 >= r0) goto L3d
            java.lang.Object r4 = r8.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L25
        L3d:
            return r2
    }

    static int zzk(java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzks
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1d
            int r3 = r4.zze(r1)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = 0
        L1f:
            if (r1 >= r0) goto L33
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    static int zzl(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzll
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1d
            long r3 = r5.zza(r1)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = 0
        L1f:
            if (r1 >= r0) goto L33
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw zzm() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzb
            return r0
    }

    static java.lang.Object zzn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r6) {
            if (r5 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r5 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzc()
            if (r5 != r6) goto L12
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzf()
            r2.zzc = r5
        L12:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zzj(r2, r4)
            return r5
    }

    static void zzo(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0, java.lang.Object r1, java.lang.Object r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r0 = r2.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r0.zza
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L15
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r1 = r1.zzc()
            r1.zzi(r0)
        L15:
            return
    }

    static void zzp(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r1, java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r3 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzc()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L24
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzc()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zze(r1, r3)
            goto L24
        L21:
            r1.zzd(r3)
        L24:
            r2.zzc = r1
            return
    }

    public static void zzq(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzc(r1, r2, r4)
        Lb:
            return
    }

    public static void zzr(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzg(r1, r2, r4)
        Lb:
            return
    }

    public static void zzs(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzj(r1, r2, r4)
        Lb:
            return
    }

    public static void zzt(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzl(r1, r2, r4)
        Lb:
            return
    }

    public static void zzu(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzn(r1, r2, r4)
        Lb:
            return
    }

    public static void zzv(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzp(r1, r2, r4)
        Lb:
            return
    }

    public static void zzw(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzs(r1, r2, r4)
        Lb:
            return
    }

    public static void zzx(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzu(r1, r2, r4)
        Lb:
            return
    }

    public static void zzy(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzy(r1, r2, r4)
        Lb:
            return
    }

    public static void zzz(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzA(r1, r2, r4)
        Lb:
            return
    }
}
