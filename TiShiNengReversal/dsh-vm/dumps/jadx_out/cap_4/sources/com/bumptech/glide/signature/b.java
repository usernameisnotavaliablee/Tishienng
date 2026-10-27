package com.bumptech.glide.signature;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private static final java.lang.String a = "AppVersionSignature";
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.c> b = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bumptech.glide.signature.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static android.content.pm.PackageInfo a(@androidx.annotation.NonNull android.content.Context r3) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            r2 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            return r3
        Le:
            r3.getPackageName()
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    private static java.lang.String b(@androidx.annotation.Nullable android.content.pm.PackageInfo r0) {
            if (r0 == 0) goto L9
            int r0 = r0.versionCode
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L9:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.c c(@androidx.annotation.NonNull android.content.Context r3) {
            java.lang.String r0 = r3.getPackageName()
            java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.c> r1 = com.bumptech.glide.signature.b.b
            java.lang.Object r2 = r1.get(r0)
            com.bumptech.glide.load.c r2 = (com.bumptech.glide.load.c) r2
            if (r2 != 0) goto L1c
            com.bumptech.glide.load.c r3 = d(r3)
            java.lang.Object r0 = r1.putIfAbsent(r0, r3)
            com.bumptech.glide.load.c r0 = (com.bumptech.glide.load.c) r0
            if (r0 != 0) goto L1b
            return r3
        L1b:
            return r0
        L1c:
            return r2
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.load.c d(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.pm.PackageInfo r1 = a(r1)
            java.lang.String r1 = b(r1)
            com.bumptech.glide.signature.e r0 = new com.bumptech.glide.signature.e
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    static void e() {
            java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.c> r0 = com.bumptech.glide.signature.b.b
            r0.clear()
            return
    }
}
