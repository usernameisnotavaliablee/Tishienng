package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzbf {
    static final java.util.Locale zza = null;

    static {
            java.util.Locale r0 = java.util.Locale.ROOT
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza = r0
            return
    }

    public zzbf() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String zza(java.lang.Object r1) {
            if (r1 != 0) goto L8
            java.lang.String r1 = "null"
            return r1
        L5:
            r0 = move-exception
            goto L88
        L8:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.RuntimeException -> L5
            boolean r0 = r0.isArray()     // Catch: java.lang.RuntimeException -> L5
            if (r0 != 0) goto L20
            java.lang.String r0 = r1.toString()     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L19
            return r0
        L19:
            java.lang.String r0 = "toString() returned null"
            java.lang.String r1 = zzd(r1, r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L20:
            boolean r0 = r1 instanceof int[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L2c
            r0 = r1
            int[] r0 = (int[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L2c:
            boolean r0 = r1 instanceof long[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L38
            r0 = r1
            long[] r0 = (long[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L38:
            boolean r0 = r1 instanceof byte[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L44
            r0 = r1
            byte[] r0 = (byte[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L44:
            boolean r0 = r1 instanceof char[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L50
            r0 = r1
            char[] r0 = (char[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L50:
            boolean r0 = r1 instanceof short[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L5c
            r0 = r1
            short[] r0 = (short[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5c:
            boolean r0 = r1 instanceof float[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L68
            r0 = r1
            float[] r0 = (float[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L68:
            boolean r0 = r1 instanceof double[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L74
            r0 = r1
            double[] r0 = (double[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L74:
            boolean r0 = r1 instanceof boolean[]     // Catch: java.lang.RuntimeException -> L5
            if (r0 == 0) goto L80
            r0 = r1
            boolean[] r0 = (boolean[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L80:
            r0 = r1
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.RuntimeException -> L5
            java.lang.String r1 = java.util.Arrays.toString(r0)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L88:
            java.lang.String r1 = zze(r1, r0)
            return r1
    }

    static void zzb(java.lang.StringBuilder r4, java.lang.Number r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r6) {
            boolean r6 = r6.zzk()
            long r0 = r5.longValue()
            boolean r2 = r5 instanceof java.lang.Long
            if (r2 == 0) goto L10
            zzf(r4, r0, r6)
            return
        L10:
            boolean r2 = r5 instanceof java.lang.Integer
            if (r2 == 0) goto L1e
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            zzf(r4, r0, r6)
            return
        L1e:
            boolean r2 = r5 instanceof java.lang.Byte
            if (r2 == 0) goto L29
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            zzf(r4, r0, r6)
            return
        L29:
            boolean r2 = r5 instanceof java.lang.Short
            if (r2 == 0) goto L35
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            zzf(r4, r0, r6)
            return
        L35:
            boolean r0 = r5 instanceof java.math.BigInteger
            if (r0 == 0) goto L4d
            java.math.BigInteger r5 = (java.math.BigInteger) r5
            r0 = 16
            java.lang.String r5 = r5.toString(r0)
            if (r6 == 0) goto L49
            java.util.Locale r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza
            java.lang.String r5 = r5.toUpperCase(r6)
        L49:
            r4.append(r5)
            return
        L4d:
            java.lang.Class r4 = r5.getClass()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "unsupported number type: "
            java.lang.String r4 = r6.concat(r4)
            r5.<init>(r4)
            throw r5
    }

    public static void zzc(java.util.Formattable r5, java.lang.StringBuilder r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r7) {
            int r0 = r7.zza()
            r1 = r0 & 162(0xa2, float:2.27E-43)
            if (r1 == 0) goto L20
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            r3 = r0 & 128(0x80, float:1.8E-43)
            r4 = 2
            if (r3 == 0) goto L17
            r3 = 2
            goto L18
        L17:
            r3 = 0
        L18:
            r0 = r0 & r4
            if (r0 == 0) goto L1c
            r2 = 4
        L1c:
            r0 = r1 | r3
            r1 = r0 | r2
        L20:
            int r0 = r6.length()
            java.util.Formatter r2 = new java.util.Formatter
            java.util.Locale r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbf.zza
            r2.<init>(r6, r3)
            int r3 = r7.zzc()     // Catch: java.lang.RuntimeException -> L37
            int r7 = r7.zzb()     // Catch: java.lang.RuntimeException -> L37
            r5.formatTo(r2, r1, r3, r7)     // Catch: java.lang.RuntimeException -> L37
            return
        L37:
            r7 = move-exception
            r6.setLength(r0)
            java.lang.Appendable r6 = r2.out()     // Catch: java.io.IOException -> L46
            java.lang.String r5 = zze(r5, r7)     // Catch: java.io.IOException -> L46
            r6.append(r5)     // Catch: java.io.IOException -> L46
        L46:
            return
    }

    private static java.lang.String zzd(java.lang.Object r3, java.lang.String r4) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "{"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "@"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "}"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static java.lang.String zze(java.lang.Object r0, java.lang.RuntimeException r1) {
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L5
            goto Le
        L5:
            r1 = move-exception
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
        Le:
            java.lang.String r0 = zzd(r0, r1)
            return r0
    }

    private static void zzf(java.lang.StringBuilder r5, long r6, boolean r8) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            java.lang.String r6 = "0"
            r5.append(r6)
            return
        Lc:
            r0 = 1
            if (r0 == r8) goto L12
            java.lang.String r8 = "0123456789abcdef"
            goto L14
        L12:
            java.lang.String r8 = "0123456789ABCDEF"
        L14:
            int r0 = java.lang.Long.numberOfLeadingZeros(r6)
            int r0 = 63 - r0
            r0 = r0 & (-4)
        L1c:
            if (r0 < 0) goto L2e
            long r1 = r6 >>> r0
            r3 = 15
            long r1 = r1 & r3
            int r2 = (int) r1
            char r1 = r8.charAt(r2)
            r5.append(r1)
            int r0 = r0 + (-4)
            goto L1c
        L2e:
            return
    }
}
