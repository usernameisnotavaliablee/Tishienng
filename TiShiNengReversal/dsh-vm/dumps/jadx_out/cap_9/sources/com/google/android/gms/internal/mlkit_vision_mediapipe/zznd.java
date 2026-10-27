package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zznd {
    static final long zza = 0;
    static final boolean zzb = false;
    private static final sun.misc.Unsafe zzc = null;
    private static final java.lang.Class zzd = null;
    private static final boolean zze = false;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zznc zzf = null;
    private static final boolean zzg = false;
    private static final boolean zzh = false;

    static {
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = zzg()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc = r1
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziz.zza
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = zzv(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zze = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r5 = zzv(r4)
            r6 = 0
            if (r1 != 0) goto L20
            goto L2f
        L20:
            if (r3 == 0) goto L28
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznb r6 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zznb
            r6.<init>(r1)
            goto L2f
        L28:
            if (r5 == 0) goto L2f
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzna r6 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzna
            r6.<init>(r1)
        L2f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf = r6
            r1 = 2
            java.lang.String r3 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            java.lang.String r7 = "objectFieldOffset"
            r8 = 1
            r9 = 0
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            if (r6 != 0) goto L40
        L3e:
            r6 = 0
            goto L64
        L40:
            sun.misc.Unsafe r6 = r6.zza
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L5f
            r11[r9] = r5     // Catch: java.lang.Throwable -> L5f
            r6.getMethod(r7, r11)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5f
            r11[r9] = r10     // Catch: java.lang.Throwable -> L5f
            r11[r8] = r2     // Catch: java.lang.Throwable -> L5f
            r6.getMethod(r3, r11)     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Field r6 = zzB()     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L5d
            goto L3e
        L5d:
            r6 = 1
            goto L64
        L5f:
            r6 = move-exception
            zzh(r6)
            goto L3e
        L64:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzg = r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            if (r6 != 0) goto L6c
        L6a:
            r0 = 0
            goto Ld9
        L6c:
            sun.misc.Unsafe r6 = r6.zza
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Ld4
            r11[r9] = r5     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r7, r11)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r5 = "arrayBaseOffset"
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Ld4
            r7[r9] = r0     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r5, r7)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r5 = "arrayIndexScale"
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Ld4
            r7[r9] = r0     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r5, r7)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "getInt"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Ld4
            r5[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            r5[r8] = r2     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r0, r5)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "putInt"
            r5 = 3
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Ld4
            r7[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            r7[r8] = r2     // Catch: java.lang.Throwable -> Ld4
            r7[r1] = r4     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r0, r7)     // Catch: java.lang.Throwable -> Ld4
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Ld4
            r0[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            r0[r8] = r2     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r3, r0)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "putLong"
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Ld4
            r3[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            r3[r8] = r2     // Catch: java.lang.Throwable -> Ld4
            r3[r1] = r2     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r0, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "getObject"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Ld4
            r3[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            r3[r8] = r2     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r0, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "putObject"
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Ld4
            r3[r9] = r10     // Catch: java.lang.Throwable -> Ld4
            r3[r8] = r2     // Catch: java.lang.Throwable -> Ld4
            r3[r1] = r10     // Catch: java.lang.Throwable -> Ld4
            r6.getMethod(r0, r3)     // Catch: java.lang.Throwable -> Ld4
            r0 = 1
            goto Ld9
        Ld4:
            r0 = move-exception
            zzh(r0)
            goto L6a
        Ld9:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzz(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<int[]> r0 = int[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<long[]> r0 = long[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<float[]> r0 = float[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<double[]> r0 = double[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzz(r0)
            zzA(r0)
            java.lang.reflect.Field r0 = zzB()
            if (r0 == 0) goto L123
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            if (r1 == 0) goto L123
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r0)
        L123:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L12c
            goto L12d
        L12c:
            r8 = 0
        L12d:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb = r8
            return
    }

    private zznd() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int zzA(java.lang.Class r1) {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            int r1 = r0.arrayIndexScale(r1)
            return r1
        Ld:
            r1 = -1
            return r1
    }

    private static java.lang.reflect.Field zzB() {
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziz.zza
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.reflect.Field r0 = zzC(r1, r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = zzC(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L1d
            return r0
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    private static java.lang.reflect.Field zzC(java.lang.Class r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static void zzD(java.lang.Object r5, long r6, byte r8) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r1 = r0.zza
            r2 = -4
            long r2 = r2 & r6
            int r1 = r1.getInt(r5, r2)
            int r7 = (int) r6
            int r6 = ~r7
            r6 = r6 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r1 = r1 & r4
            sun.misc.Unsafe r0 = r0.zza
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r1
            r0.putInt(r5, r2, r6)
            return
    }

    private static void zzE(java.lang.Object r5, long r6, byte r8) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r1 = r0.zza
            r2 = -4
            long r2 = r2 & r6
            int r1 = r1.getInt(r5, r2)
            int r7 = (int) r6
            r6 = r7 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r1 = r1 & r4
            sun.misc.Unsafe r0 = r0.zza
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r1
            r0.putInt(r5, r2, r6)
            return
    }

    static double zza(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            double r1 = r0.zza(r1, r2)
            return r1
    }

    static float zzb(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            float r1 = r0.zzb(r1, r2)
            return r1
    }

    static int zzc(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    static long zzd(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    static java.lang.Object zze(java.lang.Class r1) {
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    static java.lang.Object zzf(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    static sun.misc.Unsafe zzg() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmz r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzmz     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ void zzh(java.lang.Throwable r4) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zznd> r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r3 = "logMissingMethod"
            r0.logp(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void zzi(java.lang.Object r0, long r1, boolean r3) {
            zzD(r0, r1, r3)
            return
    }

    static /* synthetic */ void zzj(java.lang.Object r0, long r1, boolean r3) {
            zzE(r0, r1, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzk(java.lang.Object r0, long r1, byte r3) {
            zzD(r0, r1, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zzl(java.lang.Object r0, long r1, byte r3) {
            zzE(r0, r1, r3)
            return
    }

    static void zzm(java.lang.Object r1, long r2, boolean r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            r0.zzc(r1, r2, r4)
            return
    }

    static void zzn(byte[] r3, long r4, byte r6) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            long r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza
            long r1 = r1 + r4
            r0.zzd(r3, r1, r6)
            return
    }

    static void zzo(java.lang.Object r6, long r7, double r9) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            r1 = r6
            r2 = r7
            r4 = r9
            r0.zze(r1, r2, r4)
            return
    }

    static void zzp(java.lang.Object r1, long r2, float r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            r0.zzf(r1, r2, r4)
            return
    }

    static void zzq(java.lang.Object r1, long r2, int r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            r0.putInt(r1, r2, r4)
            return
    }

    static void zzr(java.lang.Object r7, long r8, long r10) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r1 = r0.zza
            r2 = r7
            r3 = r8
            r5 = r10
            r1.putLong(r2, r3, r5)
            return
    }

    static void zzs(java.lang.Object r1, long r2, java.lang.Object r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            r0.putObject(r1, r2, r4)
            return
    }

    static /* bridge */ /* synthetic */ boolean zzt(java.lang.Object r3, long r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.getInt(r3, r1)
            long r4 = ~r4
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r5 = (int) r4
            int r3 = r3 >>> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    static /* bridge */ /* synthetic */ boolean zzu(java.lang.Object r3, long r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.getInt(r3, r1)
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r5 = (int) r4
            int r3 = r3 >>> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    static boolean zzv(java.lang.Class r10) {
            java.lang.Class<byte[]> r0 = byte[].class
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziz.zza
            r1 = 0
            java.lang.Class r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekLong"
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L76
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r6[r1] = r10     // Catch: java.lang.Throwable -> L76
            r7 = 1
            r6[r7] = r4     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeLong"
            r6 = 3
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L76
            r8[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L76
            r8[r7] = r9     // Catch: java.lang.Throwable -> L76
            r8[r5] = r4     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeInt"
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L76
            r9[r1] = r10     // Catch: java.lang.Throwable -> L76
            r9[r7] = r8     // Catch: java.lang.Throwable -> L76
            r9[r5] = r4     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r9)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekInt"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r9[r1] = r10     // Catch: java.lang.Throwable -> L76
            r9[r7] = r4     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r9)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeByte"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r4[r1] = r10     // Catch: java.lang.Throwable -> L76
            java.lang.Class r9 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L76
            r4[r7] = r9     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekByte"
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L76
            r4[r1] = r10     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "pokeByteArray"
            r4 = 4
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r9[r1] = r10     // Catch: java.lang.Throwable -> L76
            r9[r7] = r0     // Catch: java.lang.Throwable -> L76
            r9[r5] = r8     // Catch: java.lang.Throwable -> L76
            r9[r6] = r8     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r9)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "peekByteArray"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            r4[r1] = r10     // Catch: java.lang.Throwable -> L76
            r4[r7] = r0     // Catch: java.lang.Throwable -> L76
            r4[r5] = r8     // Catch: java.lang.Throwable -> L76
            r4[r6] = r8     // Catch: java.lang.Throwable -> L76
            r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L76
            return r7
        L76:
            return r1
    }

    static boolean zzw(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            boolean r1 = r0.zzg(r1, r2)
            return r1
    }

    static boolean zzx() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzh
            return r0
    }

    static boolean zzy() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzg
            return r0
    }

    private static int zzz(java.lang.Class r1) {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf
            sun.misc.Unsafe r0 = r0.zza
            int r1 = r0.arrayBaseOffset(r1)
            return r1
        Ld:
            r1 = -1
            return r1
    }
}
