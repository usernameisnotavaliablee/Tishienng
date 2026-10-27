package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdw implements java.io.Closeable, java.io.Flushable {
    private static final java.util.regex.Pattern zza = null;
    private static final java.lang.String[] zzb = null;
    private static final java.lang.String[] zzc = null;
    private final java.io.Writer zzd;
    private int[] zze;
    private int zzf;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzct zzg;
    private final java.lang.String zzh;
    private java.lang.String zzi;
    private final boolean zzj;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzdd zzk;
    private java.lang.String zzl;

    static {
            java.lang.String r0 = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zza = r0
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zzb = r0
            r0 = 0
            r1 = 0
        L10:
            r2 = 31
            if (r1 > r2) goto L2a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            java.lang.String r2 = "\\u%04x"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String[] r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zzb
            r3[r1] = r2
            int r1 = r1 + 1
            goto L10
        L2a:
            java.lang.String[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zzb
            r1 = 34
            java.lang.String r2 = "\\\""
            r0[r1] = r2
            r1 = 92
            java.lang.String r2 = "\\\\"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "\\t"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "\\b"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "\\n"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "\\r"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "\\f"
            r0[r1] = r2
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zzc = r0
            java.lang.String r1 = "\\u003c"
            r2 = 60
            r0[r2] = r1
            r1 = 62
            java.lang.String r2 = "\\u003e"
            r0[r1] = r2
            r1 = 38
            java.lang.String r2 = "\\u0026"
            r0[r1] = r2
            r1 = 61
            java.lang.String r2 = "\\u003d"
            r0[r1] = r2
            r1 = 39
            java.lang.String r2 = "\\u0027"
            r0[r1] = r2
            return
    }

    public zzdw(java.io.Writer r3) {
            r2 = this;
            r2.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r2.zze = r0
            r0 = 0
            r2.zzf = r0
            r1 = 6
            r2.zzp(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zzb
            r2.zzk = r1
            java.lang.String r1 = "out == null"
            java.util.Objects.requireNonNull(r3, r1)
            r2.zzd = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzct r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzct.zza
            java.util.Objects.requireNonNull(r3)
            r2.zzg = r3
            java.lang.String r1 = ","
            r2.zzi = r1
            boolean r1 = r3.zzc()
            if (r1 == 0) goto L3f
            java.lang.String r1 = ": "
            r2.zzh = r1
            java.lang.String r1 = r3.zzb()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L43
            java.lang.String r1 = ", "
            r2.zzi = r1
            goto L43
        L3f:
            java.lang.String r1 = ":"
            r2.zzh = r1
        L43:
            java.lang.String r1 = r3.zzb()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L58
            java.lang.String r3 = r3.zza()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L58
            r0 = 1
        L58:
            r2.zzj = r0
            return
    }

    private final int zzk() {
            r2 = this;
            int r0 = r2.zzf
            if (r0 == 0) goto Lb
            int[] r1 = r2.zze
            int r0 = r0 + (-1)
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzl(int r2, int r3, char r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzk()
            if (r0 == r3) goto L11
            if (r0 != r2) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Nesting problem."
            r2.<init>(r3)
            throw r2
        L11:
            java.lang.String r2 = r1.zzl
            if (r2 != 0) goto L26
            int r2 = r1.zzf
            int r2 = r2 + (-1)
            r1.zzf = r2
            if (r0 != r3) goto L20
            r1.zzo()
        L20:
            java.io.Writer r2 = r1.zzd
            r2.write(r4)
            return r1
        L26:
            java.lang.String r3 = "Dangling name: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            throw r3
    }

    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzm(int r1, char r2) throws java.io.IOException {
            r0 = this;
            r0.zzn()
            r0.zzp(r1)
            java.io.Writer r1 = r0.zzd
            r1.write(r2)
            return r0
    }

    private final void zzn() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzk()
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L45
            if (r0 == r2) goto L3a
            r1 = 4
            if (r0 == r1) goto L2e
            r1 = 6
            r2 = 7
            if (r0 == r1) goto L2a
            if (r0 != r2) goto L22
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r0 = r3.zzk
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zza
            if (r0 != r1) goto L1a
            goto L2a
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JSON must have only one top-level value."
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
        L2a:
            r3.zzq(r2)
            return
        L2e:
            java.io.Writer r0 = r3.zzd
            java.lang.String r1 = r3.zzh
            r0.append(r1)
            r0 = 5
            r3.zzq(r0)
            return
        L3a:
            java.io.Writer r0 = r3.zzd
            java.lang.String r1 = r3.zzi
            r0.append(r1)
            r3.zzo()
            return
        L45:
            r3.zzq(r2)
            r3.zzo()
            return
    }

    private final void zzo() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.zzj
            if (r0 == 0) goto L5
            goto L23
        L5:
            java.io.Writer r0 = r4.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzct r1 = r4.zzg
            java.lang.String r1 = r1.zzb()
            r0.write(r1)
            int r0 = r4.zzf
            r1 = 1
        L13:
            if (r1 >= r0) goto L23
            java.io.Writer r2 = r4.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzct r3 = r4.zzg
            java.lang.String r3 = r3.zza()
            r2.write(r3)
            int r1 = r1 + 1
            goto L13
        L23:
            return
    }

    private final void zzp(int r4) {
            r3 = this;
            int r0 = r3.zzf
            int[] r1 = r3.zze
            int r2 = r1.length
            if (r0 != r2) goto Le
            int r0 = r0 + r0
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.zze = r0
        Le:
            int[] r0 = r3.zze
            int r1 = r3.zzf
            int r2 = r1 + 1
            r3.zzf = r2
            r0[r1] = r4
            return
    }

    private final void zzq(int r3) {
            r2 = this;
            int[] r0 = r2.zze
            int r1 = r2.zzf
            int r1 = r1 + (-1)
            r0[r1] = r3
            return
    }

    private final void zzr(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            java.io.Writer r0 = r8.zzd
            java.lang.String[] r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zzb
            r2 = 34
            r0.write(r2)
            int r0 = r9.length()
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r0) goto L3d
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L20
            r6 = r1[r6]
            if (r6 == 0) goto L3b
            goto L2d
        L20:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L27
            java.lang.String r6 = "\\u2028"
            goto L2d
        L27:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3b
            java.lang.String r6 = "\\u2029"
        L2d:
            if (r4 >= r3) goto L35
            java.io.Writer r7 = r8.zzd
            int r3 = r3 - r4
            r7.write(r9, r4, r3)
        L35:
            java.io.Writer r3 = r8.zzd
            r3.write(r6)
            r4 = r5
        L3b:
            r3 = r5
            goto Lf
        L3d:
            if (r4 >= r0) goto L45
            java.io.Writer r1 = r8.zzd
            int r0 = r0 - r4
            r1.write(r9, r4, r0)
        L45:
            java.io.Writer r9 = r8.zzd
            r9.write(r2)
            return
    }

    private final void zzs() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r2.zzl
            if (r0 == 0) goto L2e
            int r0 = r2.zzk()
            r1 = 5
            if (r0 != r1) goto L13
            java.io.Writer r0 = r2.zzd
            java.lang.String r1 = r2.zzi
            r0.write(r1)
            goto L16
        L13:
            r1 = 3
            if (r0 != r1) goto L26
        L16:
            r2.zzo()
            r0 = 4
            r2.zzq(r0)
            java.lang.String r0 = r2.zzl
            r2.zzr(r0)
            r0 = 0
            r2.zzl = r0
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
        L2e:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r3 = this;
            java.io.Writer r0 = r3.zzd
            r0.close()
            int r0 = r3.zzf
            r1 = 1
            if (r0 > r1) goto L17
            r2 = 0
            if (r0 != r1) goto L14
            int[] r0 = r3.zze
            r0 = r0[r2]
            r1 = 7
            if (r0 != r1) goto L17
        L14:
            r3.zzf = r2
            return
        L17:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzf
            if (r0 == 0) goto La
            java.io.Writer r0 = r2.zzd
            r0.flush()
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zza() throws java.io.IOException {
            r2 = this;
            r2.zzs()
            r0 = 1
            r1 = 91
            r2.zzm(r0, r1)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzb() throws java.io.IOException {
            r2 = this;
            r2.zzs()
            r0 = 3
            r1 = 123(0x7b, float:1.72E-43)
            r2.zzm(r0, r1)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzc() throws java.io.IOException {
            r3 = this;
            r0 = 2
            r1 = 93
            r2 = 1
            r3.zzl(r2, r0, r1)
            return r3
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzd() throws java.io.IOException {
            r3 = this;
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 3
            r3.zzl(r2, r0, r1)
            return r3
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zze(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "name == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = r2.zzl
            if (r0 != 0) goto L1f
            int r0 = r2.zzk()
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 != r1) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Please begin an object before writing a name."
            r3.<init>(r0)
            throw r3
        L1c:
            r2.zzl = r3
            return r2
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already wrote a name, expecting a value."
            r3.<init>(r0)
            throw r3
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzf() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r2.zzl
            if (r0 == 0) goto L7
            r2.zzs()
        L7:
            r2.zzn()
            java.io.Writer r0 = r2.zzd
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzg(java.lang.Number r5) throws java.io.IOException {
            r4 = this;
            if (r5 != 0) goto L6
            r4.zzf()
            return r4
        L6:
            r4.zzs()
            java.lang.String r0 = r5.toString()
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r5 == r1) goto L96
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r5 == r1) goto L96
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r5 == r1) goto L96
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r5 == r1) goto L96
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r5 == r1) goto L96
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r5 == r1) goto L96
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            if (r5 == r1) goto L96
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            if (r5 != r1) goto L32
            goto L96
        L32:
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L83
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L83
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4b
            goto L83
        L4b:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r5 == r1) goto L96
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r5 == r1) goto L96
            java.util.regex.Pattern r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdw.zza
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L60
            goto L96
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "String created by "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " is not a valid JSON number: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L83:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r5 = r4.zzk
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zza
            if (r5 != r1) goto L8a
            goto L96
        L8a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Numeric values must be finite, but was "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L96:
            r4.zzn()
            java.io.Writer r5 = r4.zzd
            r5.append(r0)
            return r4
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzh(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            if (r1 != 0) goto L6
            r0.zzf()
            return r0
        L6:
            r0.zzs()
            r0.zzn()
            r0.zzr(r1)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdw zzi(boolean r2) throws java.io.IOException {
            r1 = this;
            r1.zzs()
            r1.zzn()
            r0 = 1
            if (r0 == r2) goto Lc
            java.lang.String r2 = "false"
            goto Le
        Lc:
            java.lang.String r2 = "true"
        Le:
            java.io.Writer r0 = r1.zzd
            r0.write(r2)
            return r1
    }

    public final void zzj(com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzk = r1
            return
    }
}
