package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzkg {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg zzb = null;
    final com.google.android.gms.internal.mlkit_vision_mediapipe.zzms zza;
    private boolean zzc;
    private boolean zzd;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg.zzb = r0
            return
    }

    private zzkg() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzml r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzml
            r0.<init>()
            r1.zza = r0
            return
    }

    private zzkg(boolean r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzml r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzml
            r1.<init>()
            r0.<init>()
            r0.zza = r1
            r0.zzh()
            r0.zzh()
            return
    }

    static int zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r0, int r1, java.lang.Object r2) {
            int r0 = r1 << 3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznh.zzj
            r1 = 0
            if (r0 != 0) goto L13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r2
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zziw
            if (r0 == 0) goto L13
            throw r1
        L13:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zza
            throw r1
    }

    public static int zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r5, java.lang.Object r6) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r0 = r5.zzd()
            int r1 = r5.zza()
            boolean r2 = r5.zzg()
            if (r2 == 0) goto L49
            java.util.List r6 = (java.util.List) r6
            int r2 = r6.size()
            boolean r5 = r5.zzf()
            r3 = 0
            if (r5 == 0) goto L39
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L38
            if (r2 > 0) goto L2f
            int r5 = r1 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r5 = r5 + r6
            return r5
        L2f:
            r6.get(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznh.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zza
            r5 = 0
            throw r5
        L38:
            return r3
        L39:
            r5 = 0
        L3a:
            if (r3 >= r2) goto L48
            java.lang.Object r4 = r6.get(r3)
            int r4 = zza(r0, r1, r4)
            int r5 = r5 + r4
            int r3 = r3 + 1
            goto L3a
        L48:
            return r5
        L49:
            int r5 = zza(r0, r1, r6)
            return r5
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg zze() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg.zzb
            return r0
    }

    private static java.lang.Object zzm(java.lang.Object r3) {
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb) r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb r3 = r3.zzc()
            return r3
        Lb:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L19
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        L19:
            return r3
    }

    private final void zzn(java.util.Map.Entry r7) {
            r6 = this;
            java.lang.Object r0 = r7.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r0
            java.lang.Object r7 = r7.getValue()
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            boolean r2 = r0.zzg()
            if (r2 == 0) goto L47
            if (r1 != 0) goto L3f
            java.lang.Object r1 = r6.zzf(r0)
            java.util.List r7 = (java.util.List) r7
            int r2 = r7.size()
            if (r1 != 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
        L25:
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            r4 = 0
        L29:
            if (r4 >= r2) goto L39
            java.lang.Object r5 = r7.get(r4)
            java.lang.Object r5 = zzm(r5)
            r3.add(r5)
            int r4 = r4 + 1
            goto L29
        L39:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r7 = r6.zza
            r7.zzf(r0, r1)
            return
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Lazy fields can not be repeated"
            r7.<init>(r0)
            throw r7
        L47:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r2 = r0.zze()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zzi
            if (r2 != r3) goto L8b
            java.lang.Object r2 = r6.zzf(r0)
            if (r2 != 0) goto L64
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r6.zza
            java.lang.Object r7 = zzm(r7)
            r2.zzf(r0, r7)
            if (r1 == 0) goto L63
            r7 = 1
            r6.zzd = r7
        L63:
            return
        L64:
            if (r1 != 0) goto L89
            boolean r1 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb
            if (r1 == 0) goto L73
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmb r7 = r0.zzc(r2, r7)
            goto L83
        L73:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv r1 = r2.zzK()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv r7 = r0.zzb(r1, r7)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r7 = r7.zzk()
        L83:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1 = r6.zza
            r1.zzf(r0, r7)
            return
        L89:
            r7 = 0
            throw r7
        L8b:
            if (r1 != 0) goto L97
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1 = r6.zza
            java.lang.Object r7 = zzm(r7)
            r1.zzf(r0, r7)
            return
        L97:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Lazy fields must be message-valued"
            r7.<init>(r0)
            throw r7
    }

    private static boolean zzo(java.util.Map.Entry r4) {
            java.lang.Object r0 = r4.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r1 = r0.zze()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zzi
            if (r1 != r2) goto L39
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L30
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L20:
            if (r2 >= r0) goto L39
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = zzp(r3)
            if (r3 != 0) goto L2d
            return r1
        L2d:
            int r2 = r2 + 1
            goto L20
        L30:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = zzp(r4)
            return r4
        L39:
            r4 = 1
            return r4
    }

    private static boolean zzp(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx) r1
            boolean r1 = r1.zzp()
            return r1
        Lb:
            boolean r1 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r1.<init>(r0)
            throw r1
    }

    private static final int zzq(java.util.Map.Entry r5) {
            java.lang.Object r0 = r5.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r0
            java.lang.Object r1 = r5.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r2 = r0.zze()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zzi
            if (r2 != r3) goto L7a
            boolean r2 = r0.zzg()
            if (r2 != 0) goto L7a
            boolean r2 = r0.zzf()
            if (r2 != 0) goto L7a
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            r2 = 24
            r3 = 16
            r4 = 8
            if (r0 == 0) goto L53
            java.lang.Object r5 = r5.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r5
            int r5 = r5.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg) r1
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r4)
            int r0 = r0 + r0
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r3 = r3 + r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r2)
            int r1 = r1.zza()
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r1)
        L4e:
            int r2 = r2 + r1
            int r5 = r5 + r2
            int r0 = r0 + r3
            int r0 = r0 + r5
            return r0
        L53:
            java.lang.Object r5 = r5.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r5
            int r5 = r5.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r1
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r4)
            int r0 = r0 + r0
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r3)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r3 = r3 + r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r2)
            int r1 = r1.zzn()
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r1)
            goto L4e
        L7a:
            int r5 = zzb(r0, r1)
            return r5
    }

    private static final void zzr(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r4, java.lang.Object r5) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r0 = r4.zzd()
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            r5.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznh.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzni.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkt
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
            if (r0 != 0) goto L33
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznh r4 = r4.zzd()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzni r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r0 = r1.zzd()
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final int zzc() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto L18
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r3 = r4.zza
            java.util.Map$Entry r3 = r3.zzg(r1)
            int r3 = zzq(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L18:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r1 = zzq(r1)
            int r2 = r2 + r1
            goto L22
        L34:
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg zzd() {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1 = r5.zza
            int r1 = r1.zzc()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L27
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r3 = r5.zza
            java.util.Map$Entry r3 = r3.zzg(r2)
            r4 = r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmm r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmm) r4
            java.lang.Comparable r4 = r4.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r4
            java.lang.Object r3 = r3.getValue()
            r0.zzj(r4, r3)
            int r2 = r2 + 1
            goto Lc
        L27:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1 = r5.zza
            java.lang.Iterable r1 = r1.zzd()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r3
            java.lang.Object r2 = r2.getValue()
            r0.zzj(r3, r2)
            goto L31
        L4b:
            boolean r1 = r5.zzd
            r0.zzd = r1
            return r0
    }

    public final java.lang.Object zzf(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            if (r0 != 0) goto Lb
            return r2
        Lb:
            r2 = 0
            throw r2
    }

    public final java.util.Iterator zzg() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r2.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.Iterator r0 = java.util.Collections.emptyIterator()
            return r0
        Ld:
            boolean r0 = r2.zzd
            if (r0 == 0) goto L21
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r2.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlf r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlf
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            return r1
        L21:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r2.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final void zzh() {
            r4 = this;
            boolean r0 = r4.zzc
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L28
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r4.zza
            java.util.Map$Entry r2 = r2.zzg(r1)
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr
            if (r3 == 0) goto L25
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r2
            r2.zzC()
        L25:
            int r1 = r1 + 1
            goto Lc
        L28:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            r0.zza()
            r0 = 1
            r4.zzc = r0
            return
    }

    public final void zzi(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r4.zza
            java.util.Map$Entry r2 = r2.zzg(r1)
            r3.zzn(r2)
            int r1 = r1 + 1
            goto L7
        L15:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r4 = r4.zza
            java.lang.Iterable r4 = r4.zzd()
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r3.zzn(r0)
            goto L1f
        L2f:
            return
    }

    public final void zzj(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r5.zzg()
            if (r0 == 0) goto L2f
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L16:
            if (r2 >= r0) goto L25
            java.lang.Object r3 = r6.get(r2)
            zzr(r5, r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L16
        L25:
            r6 = r1
            goto L32
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Wrong object type used with protocol message reflection."
            r5.<init>(r6)
            throw r5
        L2f:
            zzr(r5, r6)
        L32:
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlg
            if (r0 == 0) goto L39
            r0 = 1
            r4.zzd = r0
        L39:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            r0.zzf(r5, r6)
            return
    }

    public final boolean zzk() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public final boolean zzl() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            int r0 = r0.zzc()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r3 = r4.zza
            java.util.Map$Entry r3 = r3.zzg(r2)
            boolean r3 = zzo(r3)
            if (r3 != 0) goto L17
            return r1
        L17:
            int r2 = r2 + 1
            goto L8
        L1a:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r0 = r4.zza
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = zzo(r2)
            if (r2 != 0) goto L24
            return r1
        L37:
            r0 = 1
            return r0
    }
}
