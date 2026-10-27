package com.bumptech.glide.load.data.mediastore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class e {
    private static final java.lang.String f = "ThumbStreamOpener";
    private static final com.bumptech.glide.load.data.mediastore.a g = null;
    private final com.bumptech.glide.load.data.mediastore.a a;
    private final com.bumptech.glide.load.data.mediastore.d b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private final android.content.ContentResolver d;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> e;

    static {
            com.bumptech.glide.load.data.mediastore.a r0 = new com.bumptech.glide.load.data.mediastore.a
            r0.<init>()
            com.bumptech.glide.load.data.mediastore.e.g = r0
            return
    }

    e(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, com.bumptech.glide.load.data.mediastore.a r2, com.bumptech.glide.load.data.mediastore.d r3, com.bumptech.glide.load.engine.bitmap_recycle.b r4, android.content.ContentResolver r5) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r1
            return
    }

    e(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7, com.bumptech.glide.load.data.mediastore.d r8, com.bumptech.glide.load.engine.bitmap_recycle.b r9, android.content.ContentResolver r10) {
            r6 = this;
            com.bumptech.glide.load.data.mediastore.a r2 = com.bumptech.glide.load.data.mediastore.e.g
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String b(@androidx.annotation.NonNull android.net.Uri r5) {
            r4 = this;
            r0 = 0
            com.bumptech.glide.load.data.mediastore.d r1 = r4.b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.query(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            if (r1 == 0) goto L1b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            r1.close()
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L36
        L1b:
            if (r1 == 0) goto L20
            r1.close()
        L20:
            return r0
        L21:
            r5 = move-exception
            goto L36
        L23:
            r1 = r0
        L24:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L30
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L18
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            return r0
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            throw r5
    }

    private boolean c(java.io.File r5) {
            r4 = this;
            com.bumptech.glide.load.data.mediastore.a r0 = r4.a
            boolean r0 = r0.a(r5)
            if (r0 == 0) goto L16
            com.bumptech.glide.load.data.mediastore.a r0 = r4.a
            long r0 = r0.c(r5)
            r2 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L16
            r5 = 1
            return r5
        L16:
            r5 = 0
            return r5
    }

    int a(android.net.Uri r4) {
            r3 = this;
            r0 = 0
            android.content.ContentResolver r1 = r3.d     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L17
            java.io.InputStream r0 = r1.openInputStream(r4)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L17
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1 = r3.e     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L17
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r3.c     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L17
            int r4 = com.bumptech.glide.load.b.b(r1, r0, r2)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.io.IOException -> L14
        L14:
            return r4
        L15:
            r4 = move-exception
            goto L2a
        L17:
            java.lang.String r1 = "ThumbStreamOpener"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L23
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L15
        L23:
            if (r0 == 0) goto L28
            r0.close()     // Catch: java.io.IOException -> L28
        L28:
            r4 = -1
            return r4
        L2a:
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.io.IOException -> L2f
        L2f:
            throw r4
    }

    public java.io.InputStream d(android.net.Uri r6) throws java.io.FileNotFoundException {
            r5 = this;
            java.lang.String r0 = r5.b(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            com.bumptech.glide.load.data.mediastore.a r1 = r5.a
            java.io.File r0 = r1.b(r0)
            boolean r1 = r5.c(r0)
            if (r1 != 0) goto L19
            return r2
        L19:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.content.ContentResolver r1 = r5.d     // Catch: java.lang.NullPointerException -> L24
            java.io.InputStream r6 = r1.openInputStream(r0)     // Catch: java.lang.NullPointerException -> L24
            return r6
        L24:
            r1 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NPE opening uri: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " -> "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            java.lang.Throwable r6 = r2.initCause(r1)
            java.io.FileNotFoundException r6 = (java.io.FileNotFoundException) r6
            throw r6
    }
}
