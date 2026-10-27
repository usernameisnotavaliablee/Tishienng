package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k {
    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(boolean r0, @androidx.annotation.NonNull java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String b(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be null or empty"
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public static <T extends java.util.Collection<Y>, Y> T c(@androidx.annotation.NonNull T r1) {
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be empty."
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public static <T> T d(@androidx.annotation.Nullable T r1) {
            java.lang.String r0 = "Argument must not be null"
            java.lang.Object r1 = e(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T> T e(@androidx.annotation.Nullable T r0, @androidx.annotation.NonNull java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }
}
