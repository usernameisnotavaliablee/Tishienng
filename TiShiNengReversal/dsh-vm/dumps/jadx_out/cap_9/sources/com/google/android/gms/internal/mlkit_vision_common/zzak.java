package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzak implements com.google.firebase.encoders.ObjectEncoderContext {
    private static final java.nio.charset.Charset zza = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzb = null;
    private static final com.google.firebase.encoders.FieldDescriptor zzc = null;
    private static final com.google.firebase.encoders.ObjectEncoder zzd = null;
    private java.io.OutputStream zze;
    private final java.util.Map zzf;
    private final java.util.Map zzg;
    private final com.google.firebase.encoders.ObjectEncoder zzh;
    private final com.google.android.gms.internal.mlkit_vision_common.zzao zzi;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzak.zza = r0
            java.lang.String r0 = "key"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzae r1 = new com.google.android.gms.internal.mlkit_vision_common.zzae
            r1.<init>()
            r2 = 1
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_vision_common.zzai r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_vision_common.zzak.zzb = r0
            java.lang.String r0 = "value"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzae r1 = new com.google.android.gms.internal.mlkit_vision_common.zzae
            r1.<init>()
            r2 = 2
            r1.zza(r2)
            com.google.android.gms.internal.mlkit_vision_common.zzai r1 = r1.zzb()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.android.gms.internal.mlkit_vision_common.zzak.zzc = r0
            com.google.android.gms.internal.mlkit_vision_common.zzaj r0 = com.google.android.gms.internal.mlkit_vision_common.zzaj.zza
            com.google.android.gms.internal.mlkit_vision_common.zzak.zzd = r0
            return
    }

    zzak(java.io.OutputStream r2, java.util.Map r3, java.util.Map r4, com.google.firebase.encoders.ObjectEncoder r5) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_common.zzao r0 = new com.google.android.gms.internal.mlkit_vision_common.zzao
            r0.<init>(r1)
            r1.zzi = r0
            r1.zze = r2
            r1.zzf = r3
            r1.zzg = r4
            r1.zzh = r5
            return
    }

    static /* synthetic */ void zzg(java.util.Map.Entry r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.gms.internal.mlkit_vision_common.zzak.zzb
            java.lang.Object r1 = r2.getKey()
            r3.add(r0, r1)
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.gms.internal.mlkit_vision_common.zzak.zzc
            java.lang.Object r2 = r2.getValue()
            r3.add(r0, r2)
            return
    }

    private static int zzh(com.google.firebase.encoders.FieldDescriptor r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzai> r0 = com.google.android.gms.internal.mlkit_vision_common.zzai.class
            java.lang.annotation.Annotation r1 = r1.getProperty(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzai r1 = (com.google.android.gms.internal.mlkit_vision_common.zzai) r1
            if (r1 == 0) goto Lf
            int r1 = r1.zza()
            return r1
        Lf:
            com.google.firebase.encoders.EncodingException r1 = new com.google.firebase.encoders.EncodingException
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    private final long zzi(com.google.firebase.encoders.ObjectEncoder r6, java.lang.Object r7) throws java.io.IOException {
            r5 = this;
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            com.google.android.gms.internal.mlkit_vision_common.zzaf r1 = new com.google.android.gms.internal.mlkit_vision_common.zzaf
            r1.<init>()
            java.io.OutputStream r2 = r5.zze     // Catch: java.lang.Throwable -> L18
            r5.zze = r1     // Catch: java.lang.Throwable -> L18
            r6.encode(r7, r5)     // Catch: java.lang.Throwable -> L1a
            r5.zze = r2     // Catch: java.lang.Throwable -> L18
            long r6 = r1.zza()     // Catch: java.lang.Throwable -> L18
            r1.close()
            return r6
        L18:
            r6 = move-exception
            goto L1e
        L1a:
            r6 = move-exception
            r5.zze = r2     // Catch: java.lang.Throwable -> L18
            throw r6     // Catch: java.lang.Throwable -> L18
        L1e:
            r1.close()     // Catch: java.lang.Throwable -> L22
            goto L36
        L22:
            r7 = move-exception
            java.lang.String r1 = "addSuppressed"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L36
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Exception -> L36
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L36
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L36
            r1[r4] = r7     // Catch: java.lang.Exception -> L36
            r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L36
        L36:
            throw r6
    }

    private static com.google.android.gms.internal.mlkit_vision_common.zzai zzj(com.google.firebase.encoders.FieldDescriptor r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzai> r0 = com.google.android.gms.internal.mlkit_vision_common.zzai.class
            java.lang.annotation.Annotation r1 = r1.getProperty(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzai r1 = (com.google.android.gms.internal.mlkit_vision_common.zzai) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.google.firebase.encoders.EncodingException r1 = new com.google.firebase.encoders.EncodingException
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    private final com.google.android.gms.internal.mlkit_vision_common.zzak zzk(com.google.firebase.encoders.ObjectEncoder r5, com.google.firebase.encoders.FieldDescriptor r6, java.lang.Object r7, boolean r8) throws java.io.IOException {
            r4 = this;
            long r0 = r4.zzi(r5, r7)
            if (r8 == 0) goto Ld
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto Ld
            return r4
        Ld:
            int r6 = zzh(r6)
            int r6 = r6 << 3
            r6 = r6 | 2
            r4.zzn(r6)
            r4.zzo(r0)
            r5.encode(r7, r4)
            return r4
    }

    private final com.google.android.gms.internal.mlkit_vision_common.zzak zzl(com.google.firebase.encoders.ValueEncoder r2, com.google.firebase.encoders.FieldDescriptor r3, java.lang.Object r4, boolean r5) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzao r0 = r1.zzi
            r0.zza(r3, r5)
            com.google.android.gms.internal.mlkit_vision_common.zzao r3 = r1.zzi
            r2.encode(r4, r3)
            return r1
    }

    private static java.nio.ByteBuffer zzm(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            return r1
    }

    private final void zzn(int r6) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = r6 & (-128(0xffffffffffffff80, float:NaN))
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.io.OutputStream r0 = r5.zze
            if (r4 == 0) goto L15
            r1 = r6 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            r0.write(r1)
            int r6 = r6 >>> 7
            goto L0
        L15:
            r6 = r6 & 127(0x7f, float:1.78E-43)
            r0.write(r6)
            return
    }

    private final void zzo(long r6) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.io.OutputStream r0 = r5.zze
            if (r4 == 0) goto L16
            int r1 = (int) r6
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            r0.write(r1)
            r0 = 7
            long r6 = r6 >>> r0
            goto L0
        L16:
            int r7 = (int) r6
            r6 = r7 & 127(0x7f, float:1.78E-43)
            r0.write(r6)
            return
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, double r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.zza(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, float r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.zzb(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.zze(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, @androidx.annotation.Nullable java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.zzc(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r2, double r3) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.FieldDescriptor r2 = com.google.firebase.encoders.FieldDescriptor.of(r2)
            r0 = 1
            r1.zza(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.FieldDescriptor r2 = com.google.firebase.encoders.FieldDescriptor.of(r2)
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.FieldDescriptor r2 = com.google.firebase.encoders.FieldDescriptor.of(r2)
            r0 = 1
            r1.zze(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.FieldDescriptor r2 = com.google.firebase.encoders.FieldDescriptor.of(r2)
            r0 = 1
            r1.zzc(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext add(@androidx.annotation.NonNull java.lang.String r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.FieldDescriptor r2 = com.google.firebase.encoders.FieldDescriptor.of(r2)
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext inline(@androidx.annotation.Nullable java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            r0.zzf(r1)
            return r0
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext nested(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.EncodingException r2 = new com.google.firebase.encoders.EncodingException
            java.lang.String r0 = "nested() is not implemented for protobuf encoding."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @androidx.annotation.NonNull
    public final com.google.firebase.encoders.ObjectEncoderContext nested(@androidx.annotation.NonNull java.lang.String r1) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.FieldDescriptor r1 = com.google.firebase.encoders.FieldDescriptor.of(r1)
            com.google.firebase.encoders.ObjectEncoderContext r1 = r0.nested(r1)
            return r1
    }

    final com.google.firebase.encoders.ObjectEncoderContext zza(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r3, double r4, boolean r6) throws java.io.IOException {
            r2 = this;
            if (r6 == 0) goto L9
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L9
            return r2
        L9:
            int r3 = zzh(r3)
            int r3 = r3 << 3
            r3 = r3 | 1
            r2.zzn(r3)
            java.io.OutputStream r3 = r2.zze
            r6 = 8
            java.nio.ByteBuffer r6 = zzm(r6)
            java.nio.ByteBuffer r4 = r6.putDouble(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            return r2
    }

    final com.google.firebase.encoders.ObjectEncoderContext zzb(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r1, float r2, boolean r3) throws java.io.IOException {
            r0 = this;
            if (r3 == 0) goto L8
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L8
            return r0
        L8:
            int r1 = zzh(r1)
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.zzn(r1)
            java.io.OutputStream r1 = r0.zze
            r3 = 4
            java.nio.ByteBuffer r3 = zzm(r3)
            java.nio.ByteBuffer r2 = r3.putFloat(r2)
            byte[] r2 = r2.array()
            r1.write(r2)
            return r0
    }

    final com.google.firebase.encoders.ObjectEncoderContext zzc(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r3, @androidx.annotation.Nullable java.lang.Object r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L4
            goto Laf
        L4:
            boolean r0 = r4 instanceof java.lang.CharSequence
            if (r0 == 0) goto L33
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r5 == 0) goto L14
            int r5 = r4.length()
            if (r5 != 0) goto L14
            goto Laf
        L14:
            int r3 = zzh(r3)
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.zzn(r3)
            java.lang.String r3 = r4.toString()
            java.nio.charset.Charset r4 = com.google.android.gms.internal.mlkit_vision_common.zzak.zza
            byte[] r3 = r3.getBytes(r4)
            int r4 = r3.length
            r2.zzn(r4)
            java.io.OutputStream r4 = r2.zze
            r4.write(r3)
            return r2
        L33:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4c
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r4.next()
            r2.zzc(r3, r5, r1)
            goto L3e
        L4c:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L6c
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L5a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            com.google.firebase.encoders.ObjectEncoder r0 = com.google.android.gms.internal.mlkit_vision_common.zzak.zzd
            r2.zzk(r0, r3, r5, r1)
            goto L5a
        L6c:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L7a
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r2.zza(r3, r0, r5)
            return r2
        L7a:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L88
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.zzb(r3, r4, r5)
            return r2
        L88:
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L96
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            r2.zze(r3, r0, r5)
            return r2
        L96:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto La4
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.zzd(r3, r4, r5)
            return r2
        La4:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto Lc5
            byte[] r4 = (byte[]) r4
            if (r5 == 0) goto Lb0
            int r5 = r4.length
            if (r5 != 0) goto Lb0
        Laf:
            return r2
        Lb0:
            int r3 = zzh(r3)
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.zzn(r3)
            int r3 = r4.length
            r2.zzn(r3)
            java.io.OutputStream r3 = r2.zze
            r3.write(r4)
            return r2
        Lc5:
            java.util.Map r0 = r2.zzf
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ObjectEncoder r0 = (com.google.firebase.encoders.ObjectEncoder) r0
            if (r0 == 0) goto Ld7
            r2.zzk(r0, r3, r4, r5)
            return r2
        Ld7:
            java.util.Map r0 = r2.zzg
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ValueEncoder r0 = (com.google.firebase.encoders.ValueEncoder) r0
            if (r0 == 0) goto Le9
            r2.zzl(r0, r3, r4, r5)
            return r2
        Le9:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_common.zzag
            r1 = 1
            if (r0 == 0) goto Lf8
            com.google.android.gms.internal.mlkit_vision_common.zzag r4 = (com.google.android.gms.internal.mlkit_vision_common.zzag) r4
            int r4 = r4.zza()
            r2.zzd(r3, r4, r1)
            return r2
        Lf8:
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 == 0) goto L106
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            r2.zzd(r3, r4, r1)
            return r2
        L106:
            com.google.firebase.encoders.ObjectEncoder r0 = r2.zzh
            r2.zzk(r0, r3, r4, r5)
            return r2
    }

    final com.google.android.gms.internal.mlkit_vision_common.zzak zzd(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r2, int r3, boolean r4) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L4
            if (r3 == 0) goto L1a
        L4:
            com.google.android.gms.internal.mlkit_vision_common.zzai r2 = zzj(r2)
            com.google.android.gms.internal.mlkit_vision_common.zzah r4 = com.google.android.gms.internal.mlkit_vision_common.zzah.zza
            com.google.android.gms.internal.mlkit_vision_common.zzah r4 = r2.zzb()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L4b
            r0 = 1
            if (r4 == r0) goto L39
            r0 = 2
            if (r4 == r0) goto L1b
        L1a:
            return r1
        L1b:
            int r2 = r2.zza()
            int r2 = r2 << 3
            r2 = r2 | 5
            r1.zzn(r2)
            java.io.OutputStream r2 = r1.zze
            r4 = 4
            java.nio.ByteBuffer r4 = zzm(r4)
            java.nio.ByteBuffer r3 = r4.putInt(r3)
            byte[] r3 = r3.array()
            r2.write(r3)
            return r1
        L39:
            int r2 = r2.zza()
            int r2 = r2 << 3
            r1.zzn(r2)
            int r2 = r3 + r3
            int r3 = r3 >> 31
            r2 = r2 ^ r3
            r1.zzn(r2)
            return r1
        L4b:
            int r2 = r2.zza()
            int r2 = r2 << 3
            r1.zzn(r2)
            r1.zzn(r3)
            return r1
    }

    final com.google.android.gms.internal.mlkit_vision_common.zzak zze(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r3, long r4, boolean r6) throws java.io.IOException {
            r2 = this;
            if (r6 == 0) goto L8
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L1e
        L8:
            com.google.android.gms.internal.mlkit_vision_common.zzai r3 = zzj(r3)
            com.google.android.gms.internal.mlkit_vision_common.zzah r6 = com.google.android.gms.internal.mlkit_vision_common.zzah.zza
            com.google.android.gms.internal.mlkit_vision_common.zzah r6 = r3.zzb()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L51
            r0 = 1
            if (r6 == r0) goto L3d
            r1 = 2
            if (r6 == r1) goto L1f
        L1e:
            return r2
        L1f:
            int r3 = r3.zza()
            int r3 = r3 << 3
            r3 = r3 | r0
            r2.zzn(r3)
            java.io.OutputStream r3 = r2.zze
            r6 = 8
            java.nio.ByteBuffer r6 = zzm(r6)
            java.nio.ByteBuffer r4 = r6.putLong(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            return r2
        L3d:
            int r3 = r3.zza()
            int r3 = r3 << 3
            r2.zzn(r3)
            long r0 = r4 + r4
            r3 = 63
            long r3 = r4 >> r3
            long r3 = r3 ^ r0
            r2.zzo(r3)
            return r2
        L51:
            int r3 = r3.zza()
            int r3 = r3 << 3
            r2.zzn(r3)
            r2.zzo(r4)
            return r2
    }

    final com.google.android.gms.internal.mlkit_vision_common.zzak zzf(@androidx.annotation.Nullable java.lang.Object r3) throws java.io.IOException {
            r2 = this;
            if (r3 != 0) goto L3
            return r2
        L3:
            java.util.Map r0 = r2.zzf
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ObjectEncoder r0 = (com.google.firebase.encoders.ObjectEncoder) r0
            if (r0 == 0) goto L15
            r0.encode(r3, r2)
            return r2
        L15:
            java.lang.Class r3 = r3.getClass()
            com.google.firebase.encoders.EncodingException r0 = new com.google.firebase.encoders.EncodingException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "No encoder for "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }
}
