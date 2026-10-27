package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzfo {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.Class zzb = null;
    private static final com.google.android.gms.internal.mlkit_acceleration.zzgd zzc = null;
    private static final com.google.android.gms.internal.mlkit_acceleration.zzgd zzd = null;

    static {
            r0 = 0
            java.lang.String r1 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r1 = r0
        L9:
            com.google.android.gms.internal.mlkit_acceleration.zzfo.zzb = r1
            java.lang.String r1 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = r0
        L14:
            if (r1 != 0) goto L17
            goto L22
        L17:
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.mlkit_acceleration.zzgd r1 = (com.google.android.gms.internal.mlkit_acceleration.zzgd) r1     // Catch: java.lang.Throwable -> L22
            r0 = r1
        L22:
            com.google.android.gms.internal.mlkit_acceleration.zzfo.zzc = r0
            com.google.android.gms.internal.mlkit_acceleration.zzgf r0 = new com.google.android.gms.internal.mlkit_acceleration.zzgf
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzfo.zzd = r0
            return
    }

    public zzfo() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void zzA(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzx(r1, r2, r4)
        Lb:
            return
    }

    public static void zzB(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzz(r1, r2, r4)
        Lb:
            return
    }

    public static void zzC(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzB(r1, r2, r4)
        Lb:
            return
    }

    public static void zzD(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzD(r1, r2, r4)
        Lb:
            return
    }

    public static void zzE(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzI(r1, r2, r4)
        Lb:
            return
    }

    public static void zzF(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzK(r1, r2, r4)
        Lb:
            return
    }

    static boolean zzG(java.lang.Object r2, java.lang.Object r3) {
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.mlkit_acceleration.zzdw r5 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1e
            int r3 = r5.zze(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
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
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
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
            int r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r0)
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
            int r0 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r0)
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.mlkit_acceleration.zzdw r5 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1e
            int r3 = r5.zze(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
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
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_acceleration.zzep r5 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1d
            long r3 = r5.zze(r1)
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
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
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    static int zzh(int r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_acceleration.zzfm r3) {
            int r1 = r1 << 3
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_acceleration.zzeg
            if (r0 == 0) goto L17
            com.google.android.gms.internal.mlkit_acceleration.zzeg r2 = (com.google.android.gms.internal.mlkit_acceleration.zzeg) r2
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r1)
            int r2 = r2.zza()
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r2)
            int r3 = r3 + r2
            int r1 = r1 + r3
            return r1
        L17:
            com.google.android.gms.internal.mlkit_acceleration.zzfa r2 = (com.google.android.gms.internal.mlkit_acceleration.zzfa) r2
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r1)
            int r2 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzu(r2, r3)
            int r1 = r1 + r2
            return r1
    }

    static int zzi(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            if (r2 == 0) goto L23
            com.google.android.gms.internal.mlkit_acceleration.zzdw r5 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L22
            int r3 = r5.zze(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r3)
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
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r3)
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
            boolean r2 = r8 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            r3 = 63
            if (r2 == 0) goto L24
            com.google.android.gms.internal.mlkit_acceleration.zzep r8 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r8
            r2 = 0
        L11:
            if (r1 >= r0) goto L23
            long r4 = r8.zze(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r4)
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
            int r4 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r4)
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
            boolean r2 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_acceleration.zzdw r4 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1d
            int r3 = r4.zze(r1)
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r3)
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
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r3)
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_acceleration.zzep r5 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1d
            long r3 = r5.zze(r1)
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
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
            int r3 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzgd zzm() {
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzc
            return r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzgd zzn() {
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzd
            return r0
    }

    static java.lang.Object zzo(java.lang.Object r6, int r7, java.util.List r8, com.google.android.gms.internal.mlkit_acceleration.zzdz r9, java.lang.Object r10, com.google.android.gms.internal.mlkit_acceleration.zzgd r11) {
            if (r9 != 0) goto L3
            return r10
        L3:
            boolean r0 = r8 instanceof java.util.RandomAccess
            if (r0 == 0) goto L38
            int r0 = r8.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L2e
            java.lang.Object r3 = r8.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            boolean r5 = r9.zza(r4)
            if (r5 == 0) goto L27
            if (r1 == r2) goto L24
            r8.set(r2, r3)
        L24:
            int r2 = r2 + 1
            goto L2b
        L27:
            java.lang.Object r10 = zzp(r6, r7, r4, r10, r11)
        L2b:
            int r1 = r1 + 1
            goto Ld
        L2e:
            if (r2 == r0) goto L37
            java.util.List r6 = r8.subList(r2, r0)
            r6.clear()
        L37:
            return r10
        L38:
            java.util.Iterator r8 = r8.iterator()
        L3c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r8.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r9.zza(r0)
            if (r1 != 0) goto L3c
            java.lang.Object r10 = zzp(r6, r7, r0, r10, r11)
            r8.remove()
            goto L3c
        L5a:
            return r10
    }

    static java.lang.Object zzp(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.mlkit_acceleration.zzgd r6) {
            if (r5 != 0) goto L6
            java.lang.Object r5 = r6.zzc(r2)
        L6:
            long r0 = (long) r4
            r6.zzl(r5, r3, r0)
            return r5
    }

    static void zzq(com.google.android.gms.internal.mlkit_acceleration.zzgd r1, java.lang.Object r2, java.lang.Object r3) {
            java.lang.Object r0 = r1.zzd(r2)
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Object r3 = r1.zze(r0, r3)
            r1.zzo(r2, r3)
            return
    }

    public static void zzr(java.lang.Class r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_acceleration.zzdv> r0 = com.google.android.gms.internal.mlkit_acceleration.zzdv.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class r0 = com.google.android.gms.internal.mlkit_acceleration.zzfo.zzb
            if (r0 == 0) goto L1b
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            r1.<init>(r0)
            throw r1
        L1b:
            return
    }

    public static void zzs(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzc(r1, r2, r4)
        Lb:
            return
    }

    public static void zzt(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzg(r1, r2, r4)
        Lb:
            return
    }

    public static void zzu(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzj(r1, r2, r4)
        Lb:
            return
    }

    public static void zzv(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzl(r1, r2, r4)
        Lb:
            return
    }

    public static void zzw(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzn(r1, r2, r4)
        Lb:
            return
    }

    public static void zzx(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzp(r1, r2, r4)
        Lb:
            return
    }

    public static void zzy(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzs(r1, r2, r4)
        Lb:
            return
    }

    public static void zzz(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_acceleration.zzgv r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzu(r1, r2, r4)
        Lb:
            return
    }
}
