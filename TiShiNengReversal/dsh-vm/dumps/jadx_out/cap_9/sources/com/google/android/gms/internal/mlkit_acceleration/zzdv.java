package com.google.android.gms.internal.mlkit_acceleration;

import com.google.android.gms.internal.mlkit_acceleration.zzdr;
import com.google.android.gms.internal.mlkit_acceleration.zzdv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzdv<MessageType extends com.google.android.gms.internal.mlkit_acceleration.zzdv<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_acceleration.zzdr<MessageType, BuilderType>> extends com.google.android.gms.internal.mlkit_acceleration.zzcc<MessageType, BuilderType> {
    private static final java.util.Map zzb = null;
    protected com.google.android.gms.internal.mlkit_acceleration.zzge zzc;
    private int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzdv.zzb = r0
            return
    }

    public zzdv() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzd = r0
            com.google.android.gms.internal.mlkit_acceleration.zzge r0 = com.google.android.gms.internal.mlkit_acceleration.zzge.zzc()
            r1.zzc = r0
            return
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzdv zzA(java.lang.Class r4) {
            java.util.Map r0 = com.google.android.gms.internal.mlkit_acceleration.zzdv.zzb
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            r3 = 1
            java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_acceleration.zzgn.zze(r4)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.zzo(r2, r3, r3)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r1
            if (r1 == 0) goto L3c
            r0.put(r4, r1)
            return r1
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L42:
            return r1
    }

    protected static com.google.android.gms.internal.mlkit_acceleration.zzdv zzC(com.google.android.gms.internal.mlkit_acceleration.zzdv r3, java.io.InputStream r4, com.google.android.gms.internal.mlkit_acceleration.zzdi r5) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            int r0 = com.google.android.gms.internal.mlkit_acceleration.zzcy.zzd
            if (r4 != 0) goto Ld
            byte[] r4 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd
            int r0 = r4.length
            r0 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = com.google.android.gms.internal.mlkit_acceleration.zzcy.zzH(r4, r0, r0, r0)
            goto L16
        Ld:
            com.google.android.gms.internal.mlkit_acceleration.zzcw r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcw
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r4 = r0
        L16:
            com.google.android.gms.internal.mlkit_acceleration.zzdv r3 = r3.zzB()
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()     // Catch: java.io.IOException -> L34 com.google.android.gms.internal.mlkit_acceleration.zzgc -> L36 com.google.android.gms.internal.mlkit_acceleration.zzed -> L38 java.lang.RuntimeException -> L3a
            java.lang.Class r1 = r3.getClass()     // Catch: java.io.IOException -> L34 com.google.android.gms.internal.mlkit_acceleration.zzgc -> L36 com.google.android.gms.internal.mlkit_acceleration.zzed -> L38 java.lang.RuntimeException -> L3a
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r0.zzb(r1)     // Catch: java.io.IOException -> L34 com.google.android.gms.internal.mlkit_acceleration.zzgc -> L36 com.google.android.gms.internal.mlkit_acceleration.zzed -> L38 java.lang.RuntimeException -> L3a
            com.google.android.gms.internal.mlkit_acceleration.zzcz r4 = com.google.android.gms.internal.mlkit_acceleration.zzcz.zzq(r4)     // Catch: java.io.IOException -> L34 com.google.android.gms.internal.mlkit_acceleration.zzgc -> L36 com.google.android.gms.internal.mlkit_acceleration.zzed -> L38 java.lang.RuntimeException -> L3a
            r0.zzh(r3, r4, r5)     // Catch: java.io.IOException -> L34 com.google.android.gms.internal.mlkit_acceleration.zzgc -> L36 com.google.android.gms.internal.mlkit_acceleration.zzed -> L38 java.lang.RuntimeException -> L3a
            r0.zzf(r3)     // Catch: java.io.IOException -> L34 com.google.android.gms.internal.mlkit_acceleration.zzgc -> L36 com.google.android.gms.internal.mlkit_acceleration.zzed -> L38 java.lang.RuntimeException -> L3a
            zzb(r3)
            return r3
        L34:
            r4 = move-exception
            goto L4b
        L36:
            r4 = move-exception
            goto L63
        L38:
            r4 = move-exception
            goto L6b
        L3a:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzed
            if (r4 == 0) goto L4a
            java.lang.Throwable r3 = r3.getCause()
            com.google.android.gms.internal.mlkit_acceleration.zzed r3 = (com.google.android.gms.internal.mlkit_acceleration.zzed) r3
            throw r3
        L4a:
            throw r3
        L4b:
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzed
            if (r5 == 0) goto L5a
            java.lang.Throwable r3 = r4.getCause()
            com.google.android.gms.internal.mlkit_acceleration.zzed r3 = (com.google.android.gms.internal.mlkit_acceleration.zzed) r3
            throw r3
        L5a:
            com.google.android.gms.internal.mlkit_acceleration.zzed r5 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            r5.<init>(r4)
            r5.zzh(r3)
            throw r5
        L63:
            com.google.android.gms.internal.mlkit_acceleration.zzed r4 = r4.zza()
            r4.zzh(r3)
            throw r4
        L6b:
            boolean r5 = r4.zzl()
            if (r5 == 0) goto L77
            com.google.android.gms.internal.mlkit_acceleration.zzed r5 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            r5.<init>(r4)
            r4 = r5
        L77:
            r4.zzh(r3)
            throw r4
    }

    protected static com.google.android.gms.internal.mlkit_acceleration.zzdv zzD(com.google.android.gms.internal.mlkit_acceleration.zzdv r2, byte[] r3, com.google.android.gms.internal.mlkit_acceleration.zzdi r4) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            r0 = 0
            int r1 = r3.length
            com.google.android.gms.internal.mlkit_acceleration.zzdv r2 = zzc(r2, r3, r0, r1, r4)
            zzb(r2)
            return r2
    }

    protected static com.google.android.gms.internal.mlkit_acceleration.zzea zzE() {
            com.google.android.gms.internal.mlkit_acceleration.zzfj r0 = com.google.android.gms.internal.mlkit_acceleration.zzfj.zze()
            return r0
    }

    static java.lang.Object zzG(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static java.lang.Object zzH(com.google.android.gms.internal.mlkit_acceleration.zzfa r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.mlkit_acceleration.zzfk r0 = new com.google.android.gms.internal.mlkit_acceleration.zzfk
            r0.<init>(r1, r2, r3)
            return r0
    }

    protected static void zzK(java.lang.Class r1, com.google.android.gms.internal.mlkit_acceleration.zzdv r2) {
            r2.zzJ()
            java.util.Map r0 = com.google.android.gms.internal.mlkit_acceleration.zzdv.zzb
            r0.put(r1, r2)
            return
    }

    private final int zza(com.google.android.gms.internal.mlkit_acceleration.zzfm r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfi r2 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            java.lang.Class r0 = r1.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r2 = r2.zzb(r0)
            int r2 = r2.zza(r1)
            return r2
    }

    private static com.google.android.gms.internal.mlkit_acceleration.zzdv zzb(com.google.android.gms.internal.mlkit_acceleration.zzdv r1) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            if (r1 == 0) goto L16
            boolean r0 = r1.zzN()
            if (r0 == 0) goto L9
            goto L16
        L9:
            com.google.android.gms.internal.mlkit_acceleration.zzgc r0 = new com.google.android.gms.internal.mlkit_acceleration.zzgc
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = r0.zza()
            r0.zzh(r1)
            throw r0
        L16:
            return r1
    }

    private static com.google.android.gms.internal.mlkit_acceleration.zzdv zzc(com.google.android.gms.internal.mlkit_acceleration.zzdv r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_acceleration.zzdi r10) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = r6.zzB()
            com.google.android.gms.internal.mlkit_acceleration.zzfi r6 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            java.lang.Class r8 = r1.getClass()     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r6.zzb(r8)     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            com.google.android.gms.internal.mlkit_acceleration.zzcf r5 = new com.google.android.gms.internal.mlkit_acceleration.zzcf     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            r5.<init>(r10)     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            r3 = 0
            r2 = r7
            r4 = r9
            r0.zzi(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            r0.zzf(r1)     // Catch: java.io.IOException -> L1f com.google.android.gms.internal.mlkit_acceleration.zzgc -> L22 com.google.android.gms.internal.mlkit_acceleration.zzed -> L25 java.lang.IndexOutOfBoundsException -> L28
            return r1
        L1f:
            r0 = move-exception
            r6 = r0
            goto L30
        L22:
            r0 = move-exception
            r6 = r0
            goto L48
        L25:
            r0 = move-exception
            r6 = r0
            goto L50
        L28:
            com.google.android.gms.internal.mlkit_acceleration.zzed r6 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            r6.zzh(r1)
            throw r6
        L30:
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof com.google.android.gms.internal.mlkit_acceleration.zzed
            if (r7 == 0) goto L3f
            java.lang.Throwable r6 = r6.getCause()
            com.google.android.gms.internal.mlkit_acceleration.zzed r6 = (com.google.android.gms.internal.mlkit_acceleration.zzed) r6
            throw r6
        L3f:
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            r7.<init>(r6)
            r7.zzh(r1)
            throw r7
        L48:
            com.google.android.gms.internal.mlkit_acceleration.zzed r6 = r6.zza()
            r6.zzh(r1)
            throw r6
        L50:
            boolean r7 = r6.zzl()
            if (r7 == 0) goto L5c
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            r7.<init>(r6)
            r6 = r7
        L5c:
            r6.zzh(r1)
            throw r6
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class r0 = r3.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfi r1 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r1.zzb(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r4 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r4
            boolean r4 = r0.zzk(r3, r4)
            return r4
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.zzO()
            if (r0 != 0) goto L11
            int r0 = r1.zza
            if (r0 != 0) goto L10
            int r0 = r1.zzw()
            r1.zza = r0
        L10:
            return r0
        L11:
            int r0 = r1.zzw()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.android.gms.internal.mlkit_acceleration.zzfc.zza(r1, r0)
            return r0
    }

    final com.google.android.gms.internal.mlkit_acceleration.zzdv zzB() {
            r2 = this;
            r0 = 4
            r1 = 0
            java.lang.Object r0 = r2.zzo(r0, r1, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfa
    public final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzez zzF() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzo(r0, r1, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzdr r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdr) r0
            return r0
    }

    protected final void zzI() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r0.zzb(r1)
            r0.zzf(r2)
            r2.zzJ()
            return
    }

    final void zzJ() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.zzd = r0
            return
    }

    final void zzL(int r2) {
            r1 = this;
            int r2 = r1.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r0
            r1.zzd = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfa
    public final void zzM(com.google.android.gms.internal.mlkit_acceleration.zzdd r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r0.zzb(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzde r3 = com.google.android.gms.internal.mlkit_acceleration.zzde.zza(r3)
            r0.zzj(r2, r3)
            return
    }

    public final boolean zzN() {
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.zzo(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto Lf
            return r0
        Lf:
            if (r2 != 0) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.Class r2 = r4.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfi r3 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r2 = r3.zzb(r2)
            boolean r2 = r2.zzl(r4)
            if (r0 == r2) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r4
        L28:
            r3 = 2
            r4.zzo(r3, r0, r1)
            return r2
    }

    final boolean zzO() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfb
    public final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzfa zzP() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.zzo(r0, r1, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r0
            return r0
    }

    protected abstract java.lang.Object zzo(int r1, java.lang.Object r2, java.lang.Object r3);

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcc
    final int zzt(com.google.android.gms.internal.mlkit_acceleration.zzfm r4) {
            r3 = this;
            boolean r0 = r3.zzO()
            java.lang.String r1 = "serialized size must be non-negative, was "
            if (r0 == 0) goto L24
            int r4 = r4.zza(r3)
            if (r4 < 0) goto Lf
            return r4
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L24:
            int r0 = r3.zzd
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            if (r0 != r2) goto L50
            int r4 = r4.zza(r3)
            if (r4 < 0) goto L3b
            int r0 = r3.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            r0 = r0 | r4
            r3.zzd = r0
            return r4
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L50:
            return r0
    }

    final int zzw() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r0.zzb(r1)
            int r0 = r0.zzb(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfa
    public final int zzx() {
            r4 = this;
            boolean r0 = r4.zzO()
            java.lang.String r1 = "serialized size must be non-negative, was "
            r2 = 0
            if (r0 == 0) goto L25
            int r0 = r4.zza(r2)
            if (r0 < 0) goto L10
            return r0
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L25:
            int r0 = r4.zzd
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            if (r0 == r3) goto L2e
            return r0
        L2e:
            int r0 = r4.zza(r2)
            if (r0 < 0) goto L3d
            int r1 = r4.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            r1 = r1 | r0
            r4.zzd = r1
            return r0
        L3d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    protected final com.google.android.gms.internal.mlkit_acceleration.zzdr zzy() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzo(r0, r1, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzdr r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdr) r0
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzdr zzz() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzo(r0, r1, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzdr r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdr) r0
            r0.zzk(r2)
            return r0
    }
}
