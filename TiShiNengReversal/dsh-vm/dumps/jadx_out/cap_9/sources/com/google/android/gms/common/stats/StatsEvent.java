package com.google.android.gms.common.stats;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface Types {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public StatsEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.zzb()
            int r2 = r5.zza()
            java.lang.String r3 = r5.zzc()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "\t"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "\t-1"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            return r0
    }

    public abstract int zza();

    public abstract long zzb();

    @androidx.annotation.NonNull
    public abstract java.lang.String zzc();
}
