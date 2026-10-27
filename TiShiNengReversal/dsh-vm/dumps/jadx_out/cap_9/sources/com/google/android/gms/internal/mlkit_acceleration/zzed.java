package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzed extends java.io.IOException {
    private com.google.android.gms.internal.mlkit_acceleration.zzfa zza;
    private boolean zzb;

    public zzed(java.io.IOException r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0, r2)
            r2 = 0
            r1.zza = r2
            return
    }

    public zzed(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zza = r1
            return
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzec zza() {
            com.google.android.gms.internal.mlkit_acceleration.zzec r0 = new com.google.android.gms.internal.mlkit_acceleration.zzec
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzb() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzc() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzd() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zze() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzf() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzg() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzi() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzed zzj() {
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzed zzh(com.google.android.gms.internal.mlkit_acceleration.zzfa r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    final void zzk() {
            r1 = this;
            r0 = 1
            r1.zzb = r0
            return
    }

    final boolean zzl() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
