package com.google.android.gms.internal.mlkit_vision_mediapipe;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzkr<MessageType extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk<MessageType, BuilderType>> extends com.google.android.gms.internal.mlkit_vision_mediapipe.zziv<MessageType, BuilderType> {
    private static final java.util.Map zzb = null;
    protected com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx zzc;
    private int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.zzb = r0
            return
    }

    public zzkr() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzd = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzc()
            r1.zzc = r0
            return
    }

    static java.lang.Object zzA(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
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

    protected static java.lang.Object zzB(com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmh r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzmh
            r0.<init>(r1, r2, r3)
            return r0
    }

    protected static void zzE(java.lang.Class r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2) {
            r2.zzD()
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.zzb
            r0.put(r1, r2)
            return
    }

    protected static final boolean zzG(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r4, boolean r5) {
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.zzb(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto Lf
            return r0
        Lf:
            if (r2 != 0) goto L13
            r4 = 0
            return r4
        L13:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            java.lang.Class r3 = r4.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r2.zzb(r3)
            boolean r2 = r2.zzk(r4)
            if (r5 == 0) goto L2e
            if (r0 == r2) goto L29
            r5 = r1
            goto L2a
        L29:
            r5 = r4
        L2a:
            r0 = 2
            r4.zzb(r0, r5, r1)
        L2e:
            return r2
    }

    private final int zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            java.lang.Class r0 = r1.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r2.zzb(r0)
            int r2 = r2.zza(r1)
            return r2
    }

    private static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            if (r1 == 0) goto L14
            r0 = 1
            boolean r0 = zzG(r1, r0)
            if (r0 == 0) goto La
            goto L14
        La:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = r0.zza()
            throw r1
        L14:
            return r1
    }

    private static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzf(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r10) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            if (r9 != 0) goto L3
            return r6
        L3:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = r6.zzt()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            java.lang.Class r8 = r1.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r6.zzb(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r5 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            r5.<init>(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            r3 = 0
            r2 = r7
            r4 = r9
            r0.zzh(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            r0.zzf(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L22 java.io.IOException -> L2a com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv -> L41 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L48
            return r1
        L22:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r6 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r7 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r6.<init>(r7)
            throw r6
        L2a:
            r0 = move-exception
            r6 = r0
            java.lang.Throwable r7 = r6.getCause()
            boolean r7 = r7 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            if (r7 == 0) goto L3b
            java.lang.Throwable r6 = r6.getCause()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb) r6
            throw r6
        L3b:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r7 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r7.<init>(r6)
            throw r7
        L41:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r6 = r6.zza()
            throw r6
        L48:
            r0 = move-exception
            r6 = r0
            throw r6
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzr(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0, byte[] r1, int r2, int r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r4) {
            r2 = 0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = zzf(r0, r1, r2, r3, r4)
            return r0
    }

    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzs(java.lang.Class r4) {
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.zzb
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            r3 = 1
            java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zze(r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.zzb(r2, r3, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
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

    protected static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzu(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r3, byte[] r4) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            int r0 = r4.length
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb.zzb
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb.zza
            r2 = 0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r3 = zzf(r3, r4, r2, r0, r1)
            zze(r3)
            return r3
    }

    protected static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzv(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2, byte[] r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r4) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            r0 = 0
            int r1 = r3.length
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = zzf(r2, r3, r0, r1, r4)
            zze(r2)
            return r2
    }

    protected static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkv zzw() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzki r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzki.zzf()
            return r0
    }

    protected static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkw zzx() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzks.zzf()
            return r0
    }

    protected static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkx zzy() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzll.zze()
            return r0
    }

    protected static com.google.android.gms.internal.mlkit_vision_mediapipe.zzky zzz() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmg r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmg.zze()
            return r0
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
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r1.zzb(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r4
            boolean r4 = r0.zzj(r3, r4)
            return r4
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.zzH()
            if (r0 != 0) goto L11
            int r0 = r1.zza
            if (r0 != 0) goto L10
            int r0 = r1.zzl()
            r1.zza = r0
        L10:
            return r0
        L11:
            int r0 = r1.zzl()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzly.zza(r1, r0)
            return r0
    }

    protected final void zzC() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r0.zzb(r1)
            r0.zzf(r2)
            r2.zzD()
            return
    }

    final void zzD() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.zzd = r0
            return
    }

    final void zzF(int r2) {
            r1 = this;
            int r2 = r1.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r0
            r1.zzd = r2
            return
    }

    final boolean zzH() {
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

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv zzJ() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv zzK() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk) r0
            r0.zzh(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
    public final void zzL(com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r0.zzb(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx.zza(r3)
            r0.zzi(r2, r3)
            return
    }

    protected abstract java.lang.Object zzb(int r1, java.lang.Object r2, java.lang.Object r3);

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zziv
    final int zzi(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r4) {
            r3 = this;
            boolean r0 = r3.zzH()
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

    final int zzl() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r0.zzb(r1)
            int r0 = r0.zzb(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx
    public final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zzm() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.zzb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw
    public final int zzn() {
            r4 = this;
            boolean r0 = r4.zzH()
            java.lang.String r1 = "serialized size must be non-negative, was "
            r2 = 0
            if (r0 == 0) goto L25
            int r0 = r4.zzc(r2)
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
            int r0 = r4.zzc(r2)
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

    protected final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk zzo() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx
    public final boolean zzp() {
            r1 = this;
            r0 = 1
            boolean r0 = zzG(r1, r0)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk zzq() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk) r0
            r0.zzh(r2)
            return r0
    }

    final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzt() {
            r2 = this;
            r0 = 4
            r1 = 0
            java.lang.Object r0 = r2.zzb(r0, r1, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            return r0
    }
}
