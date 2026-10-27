package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzbk {
    protected int zza;
    protected java.nio.ByteBuffer zzb;
    final com.google.android.gms.internal.mlkit_acceleration.zzbm zzc;
    private int zzd;
    private int zze;

    public zzbk() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzbm r0 = com.google.android.gms.internal.mlkit_acceleration.zzbm.zza()
            r1.zzc = r0
            return
    }

    protected final int zza(int r3) {
            r2 = this;
            int r0 = r2.zze
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.zzb
            int r1 = r2.zzd
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            return r3
        Le:
            r3 = 0
            return r3
    }

    protected final int zzb(int r2) {
            r1 = this;
            int r0 = r1.zza
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.zzb
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            int r2 = r2 + 4
            return r2
    }

    protected final int zzc(int r2) {
            r1 = this;
            int r0 = r1.zza
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.zzb
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.zzb
            int r2 = r0.getInt(r2)
            return r2
    }

    protected final java.lang.String zzd(int r13) {
            r12 = this;
            java.nio.ByteBuffer r0 = r12.zzb
            int r1 = r0.getInt(r13)
            int r13 = r13 + r1
            int r1 = r0.getInt(r13)
            boolean r2 = r0.hasArray()
            int r13 = r13 + 4
            r3 = 0
            r4 = 3
            java.lang.String r5 = "Invalid UTF-8"
            r6 = 2
            r7 = 1
            if (r2 == 0) goto Ldd
            byte[] r2 = r0.array()
            int r0 = r0.arrayOffset()
            int r0 = r0 + r13
            r13 = r0 | r1
            int r8 = r2.length
            int r9 = r8 - r0
            int r9 = r9 - r1
            r13 = r13 | r9
            if (r13 < 0) goto Lbd
            int r13 = r0 + r1
            char[] r10 = new char[r1]
            r1 = 0
        L30:
            if (r0 >= r13) goto L43
            r4 = r2[r0]
            boolean r6 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzd(r4)
            if (r6 == 0) goto L43
            int r0 = r0 + 1
            int r6 = r1 + 1
            char r4 = (char) r4
            r10[r1] = r4
            r1 = r6
            goto L30
        L43:
            r11 = r1
        L44:
            if (r0 >= r13) goto L18d
            int r1 = r0 + 1
            r6 = r2[r0]
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzd(r6)
            if (r4 == 0) goto L6a
            int r0 = r11 + 1
            char r4 = (char) r6
            r10[r11] = r4
            r11 = r0
            r0 = r1
        L57:
            if (r0 >= r13) goto L44
            r1 = r2[r0]
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzd(r1)
            if (r4 == 0) goto L44
            int r0 = r0 + 1
            int r4 = r11 + 1
            char r1 = (char) r1
            r10[r11] = r1
            r11 = r4
            goto L57
        L6a:
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzf(r6)
            if (r4 == 0) goto L83
            if (r1 >= r13) goto L7d
            int r4 = r11 + 1
            int r0 = r0 + 2
            r1 = r2[r1]
            com.google.android.gms.internal.mlkit_acceleration.zzbl.zzc(r6, r1, r10, r11)
        L7b:
            r11 = r4
            goto L44
        L7d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            throw r13
        L83:
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zze(r6)
            if (r4 == 0) goto La1
            int r4 = r13 + (-1)
            if (r1 >= r4) goto L9b
            int r4 = r11 + 1
            int r7 = r0 + 2
            r1 = r2[r1]
            int r0 = r0 + 3
            r7 = r2[r7]
            com.google.android.gms.internal.mlkit_acceleration.zzbl.zzb(r6, r1, r7, r10, r11)
            goto L7b
        L9b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            throw r13
        La1:
            int r4 = r13 + (-2)
            if (r1 >= r4) goto Lb7
            int r4 = r0 + 2
            r7 = r2[r1]
            int r1 = r0 + 3
            r8 = r2[r4]
            int r0 = r0 + 4
            r9 = r2[r1]
            com.google.android.gms.internal.mlkit_acceleration.zzbl.zza(r6, r7, r8, r9, r10, r11)
            int r11 = r11 + 2
            goto L44
        Lb7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            throw r13
        Lbd:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r2
            r4[r7] = r0
            r4[r6] = r1
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r13.<init>(r0)
            throw r13
        Ldd:
            r2 = r13 | r1
            int r8 = r0.limit()
            int r8 = r8 - r13
            int r8 = r8 - r1
            r2 = r2 | r8
            if (r2 < 0) goto L193
            int r2 = r13 + r1
            char[] r10 = new char[r1]
            r1 = 0
        Led:
            if (r13 >= r2) goto L102
            byte r4 = r0.get(r13)
            boolean r6 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzd(r4)
            if (r6 == 0) goto L102
            int r13 = r13 + 1
            int r6 = r1 + 1
            char r4 = (char) r4
            r10[r1] = r4
            r1 = r6
            goto Led
        L102:
            r11 = r1
        L103:
            if (r13 >= r2) goto L18d
            int r1 = r13 + 1
            byte r6 = r0.get(r13)
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzd(r6)
            if (r4 == 0) goto L12d
            int r13 = r11 + 1
            char r4 = (char) r6
            r10[r11] = r4
            r11 = r13
            r13 = r1
        L118:
            if (r13 >= r2) goto L103
            byte r1 = r0.get(r13)
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzd(r1)
            if (r4 == 0) goto L103
            int r13 = r13 + 1
            int r4 = r11 + 1
            char r1 = (char) r1
            r10[r11] = r1
            r11 = r4
            goto L118
        L12d:
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zzf(r6)
            if (r4 == 0) goto L148
            if (r1 >= r2) goto L142
            int r4 = r11 + 1
            int r13 = r13 + 2
            byte r1 = r0.get(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzbl.zzc(r6, r1, r10, r11)
        L140:
            r11 = r4
            goto L103
        L142:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            throw r13
        L148:
            boolean r4 = com.google.android.gms.internal.mlkit_acceleration.zzbl.zze(r6)
            if (r4 == 0) goto L16a
            int r4 = r2 + (-1)
            if (r1 >= r4) goto L164
            int r4 = r11 + 1
            int r7 = r13 + 2
            byte r1 = r0.get(r1)
            int r13 = r13 + 3
            byte r7 = r0.get(r7)
            com.google.android.gms.internal.mlkit_acceleration.zzbl.zzb(r6, r1, r7, r10, r11)
            goto L140
        L164:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            throw r13
        L16a:
            int r4 = r2 + (-2)
            if (r1 >= r4) goto L187
            int r4 = r13 + 2
            byte r7 = r0.get(r1)
            int r1 = r13 + 3
            byte r8 = r0.get(r4)
            int r13 = r13 + 4
            byte r9 = r0.get(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzbl.zza(r6, r7, r8, r9, r10, r11)
            int r11 = r11 + 2
            goto L103
        L187:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            throw r13
        L18d:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r10, r3, r11)
            return r13
        L193:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.limit()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            r4[r7] = r13
            r4[r6] = r1
            java.lang.String r13 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r13 = java.lang.String.format(r13, r4)
            r2.<init>(r13)
            throw r2
    }

    protected final void zze(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.zzb = r2
            if (r2 == 0) goto L16
            r0.zza = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.zzd = r1
            java.nio.ByteBuffer r2 = r0.zzb
            short r1 = r2.getShort(r1)
        L13:
            r0.zze = r1
            return
        L16:
            r1 = 0
            r0.zza = r1
            r0.zzd = r1
            goto L13
    }
}
