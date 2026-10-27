package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Asserts {
    private Asserts() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Uninstantiable"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkMainThread(@androidx.annotation.NonNull java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto Lf
            return
        Lf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String.valueOf(r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotMainThread(@androidx.annotation.NonNull java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto Lf
            return
        Lf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String.valueOf(r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null reference"
            r1.<init>(r0)
            throw r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNull(@javax.annotation.Nullable java.lang.Object r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "non-null reference"
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNull(@javax.annotation.Nullable java.lang.Object r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }
}
