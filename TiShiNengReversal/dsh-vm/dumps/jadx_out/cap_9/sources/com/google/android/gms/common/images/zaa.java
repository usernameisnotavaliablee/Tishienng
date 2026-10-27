package com.google.android.gms.common.images;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;

    @androidx.annotation.Nullable
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager r1, @androidx.annotation.Nullable android.net.Uri r2, android.os.ParcelFileDescriptor r3) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            r0.zac = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            java.lang.String r0 = "LoadBitmapFromDiskRunnable can't be executed in the main thread"
            com.google.android.gms.common.internal.Asserts.checkNotMainThread(r0)
            android.os.ParcelFileDescriptor r0 = r10.zac
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L29
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.lang.OutOfMemoryError -> L15
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r0)     // Catch: java.lang.OutOfMemoryError -> L15
            goto L21
        L15:
            android.net.Uri r0 = r10.zab
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "OOM while loading bitmap for uri: "
            r3.concat(r0)
            r3 = 1
        L21:
            android.os.ParcelFileDescriptor r0 = r10.zac     // Catch: java.io.IOException -> L26
            r0.close()     // Catch: java.io.IOException -> L26
        L26:
            r8 = r3
        L27:
            r7 = r2
            goto L2b
        L29:
            r8 = 0
            goto L27
        L2b:
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r9.<init>(r1)
            com.google.android.gms.common.images.ImageManager r5 = r10.zaa
            android.net.Uri r6 = r10.zab
            android.os.Handler r0 = com.google.android.gms.common.images.ImageManager.zab(r5)
            com.google.android.gms.common.images.zac r4 = new com.google.android.gms.common.images.zac
            r4.<init>(r5, r6, r7, r8, r9)
            r0.post(r4)
            r9.await()     // Catch: java.lang.InterruptedException -> L44
            return
        L44:
            android.net.Uri r0 = r10.zab
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Latch interrupted while posting "
            r1.concat(r0)
            return
    }
}
