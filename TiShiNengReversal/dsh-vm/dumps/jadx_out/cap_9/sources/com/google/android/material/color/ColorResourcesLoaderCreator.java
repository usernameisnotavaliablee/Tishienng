package com.google.android.material.color;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(30)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ColorResourcesLoaderCreator {
    private static final java.lang.String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    static android.content.res.loader.ResourcesLoader create(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, java.lang.Integer> r5) {
            r0 = 0
            byte[] r4 = com.google.android.material.color.ColorResourcesTableCreator.create(r4, r5)     // Catch: java.lang.Exception -> L61
            int r5 = r4.length     // Catch: java.lang.Exception -> L61
            int r5 = r4.length     // Catch: java.lang.Exception -> L61
            if (r5 != 0) goto La
            return r0
        La:
            java.lang.String r5 = "temp.arsc"
            r1 = 0
            java.io.FileDescriptor r5 = com.google.android.material.color.d.a(r5, r1)     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L19
            if (r5 == 0) goto L18
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L61
        L18:
            return r0
        L19:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L42
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L42
            r1.write(r4)     // Catch: java.lang.Throwable -> L39
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.dup(r5)     // Catch: java.lang.Throwable -> L39
            com.google.android.material.color.h.a()     // Catch: java.lang.Throwable -> L44
            android.content.res.loader.ResourcesLoader r2 = com.google.android.material.color.g.a()     // Catch: java.lang.Throwable -> L44
            android.content.res.loader.ResourcesProvider r3 = com.google.android.material.color.e.a(r4, r0)     // Catch: java.lang.Throwable -> L44
            com.google.android.material.color.f.a(r2, r3)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L3b
            r4.close()     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r4 = move-exception
            goto L50
        L3b:
            r1.close()     // Catch: java.lang.Throwable -> L42
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L61
            return r2
        L42:
            r4 = move-exception
            goto L5b
        L44:
            r2 = move-exception
            if (r4 == 0) goto L4f
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch: java.lang.Throwable -> L39
        L4f:
            throw r2     // Catch: java.lang.Throwable -> L39
        L50:
            r1.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.lang.Throwable -> L42
        L58:
            throw r4     // Catch: java.lang.Throwable -> L42
        L59:
            r4 = move-exception
            r5 = r0
        L5b:
            if (r5 == 0) goto L60
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L61
        L60:
            throw r4     // Catch: java.lang.Exception -> L61
        L61:
            return r0
    }
}
