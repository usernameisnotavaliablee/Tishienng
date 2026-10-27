package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements android.content.ComponentCallbacks2 {

    /* renamed from: m, reason: collision with root package name */
    private static final java.lang.String f328m = "image_manager_disk_cache";

    /* renamed from: n, reason: collision with root package name */
    private static final java.lang.String f329n = "Glide";

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.GuardedBy("Glide.class")
    private static volatile com.bumptech.glide.b f330o;

    /* renamed from: p, reason: collision with root package name */
    private static volatile boolean f331p;
    private final com.bumptech.glide.load.engine.k a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;
    private final com.bumptech.glide.load.engine.cache.j c;
    private final com.bumptech.glide.d d;
    private final com.bumptech.glide.Registry e;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f;
    private final com.bumptech.glide.manager.q g;
    private final com.bumptech.glide.manager.d h;

    @androidx.annotation.GuardedBy("managers")
    private final java.util.List<com.bumptech.glide.i> i;
    private final com.bumptech.glide.b.a j;
    private com.bumptech.glide.MemoryCategory k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.load.engine.prefill.b f332l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        @androidx.annotation.NonNull
        com.bumptech.glide.request.h build();
    }

    b(@androidx.annotation.NonNull android.content.Context r25, @androidx.annotation.NonNull com.bumptech.glide.load.engine.k r26, @androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.j r27, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r28, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r29, @androidx.annotation.NonNull com.bumptech.glide.manager.q r30, @androidx.annotation.NonNull com.bumptech.glide.manager.d r31, int r32, @androidx.annotation.NonNull com.bumptech.glide.b.a r33, @androidx.annotation.NonNull java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> r34, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r35, com.bumptech.glide.e r36) {
            r24 = this;
            r0 = r24
            r2 = r25
            r1 = r28
            r3 = r29
            r0.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.i = r4
            com.bumptech.glide.MemoryCategory r4 = com.bumptech.glide.MemoryCategory.NORMAL
            r0.k = r4
            r9 = r26
            r0.a = r9
            r0.b = r1
            r0.f = r3
            r4 = r27
            r0.c = r4
            r4 = r30
            r0.g = r4
            r4 = r31
            r0.h = r4
            r6 = r33
            r0.j = r6
            android.content.res.Resources r4 = r2.getResources()
            com.bumptech.glide.Registry r5 = new com.bumptech.glide.Registry
            r5.<init>()
            r0.e = r5
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r7 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r7.<init>()
            r5.t(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 27
            if (r7 < r8) goto L4f
            com.bumptech.glide.load.resource.bitmap.x r8 = new com.bumptech.glide.load.resource.bitmap.x
            r8.<init>()
            r5.t(r8)
        L4f:
            java.util.List r8 = r5.g()
            com.bumptech.glide.load.resource.gif.a r10 = new com.bumptech.glide.load.resource.gif.a
            r10.<init>(r2, r8, r1, r3)
            com.bumptech.glide.load.g r11 = com.bumptech.glide.load.resource.bitmap.o0.h(r1)
            com.bumptech.glide.load.resource.bitmap.u r12 = new com.bumptech.glide.load.resource.bitmap.u
            java.util.List r13 = r5.g()
            android.util.DisplayMetrics r14 = r4.getDisplayMetrics()
            r12.<init>(r13, r14, r1, r3)
            java.lang.Class<com.bumptech.glide.c$c> r13 = com.bumptech.glide.c.C0014c.class
            r14 = r36
            boolean r13 = r14.b(r13)
            if (r13 == 0) goto L82
            r13 = 28
            if (r7 < r13) goto L82
            com.bumptech.glide.load.resource.bitmap.c0 r13 = new com.bumptech.glide.load.resource.bitmap.c0
            r13.<init>()
            com.bumptech.glide.load.resource.bitmap.l r15 = new com.bumptech.glide.load.resource.bitmap.l
            r15.<init>()
            goto L8c
        L82:
            com.bumptech.glide.load.resource.bitmap.j r15 = new com.bumptech.glide.load.resource.bitmap.j
            r15.<init>(r12)
            com.bumptech.glide.load.resource.bitmap.j0 r13 = new com.bumptech.glide.load.resource.bitmap.j0
            r13.<init>(r12, r3)
        L8c:
            com.bumptech.glide.load.resource.drawable.e r6 = new com.bumptech.glide.load.resource.drawable.e
            r6.<init>(r2)
            com.bumptech.glide.load.model.s$c r9 = new com.bumptech.glide.load.model.s$c
            r9.<init>(r4)
            com.bumptech.glide.load.model.s$d r14 = new com.bumptech.glide.load.model.s$d
            r14.<init>(r4)
            com.bumptech.glide.load.model.s$b r0 = new com.bumptech.glide.load.model.s$b
            r0.<init>(r4)
            r27 = r7
            com.bumptech.glide.load.model.s$a r7 = new com.bumptech.glide.load.model.s$a
            r7.<init>(r4)
            com.bumptech.glide.load.resource.bitmap.e r2 = new com.bumptech.glide.load.resource.bitmap.e
            r2.<init>(r3)
            r30 = r7
            com.bumptech.glide.load.resource.transcode.a r7 = new com.bumptech.glide.load.resource.transcode.a
            r7.<init>()
            r31 = r7
            com.bumptech.glide.load.resource.transcode.d r7 = new com.bumptech.glide.load.resource.transcode.d
            r7.<init>()
            r16 = r7
            android.content.ContentResolver r7 = r25.getContentResolver()
            r17 = r7
            com.bumptech.glide.load.model.c r7 = new com.bumptech.glide.load.model.c
            r7.<init>()
            r18 = r14
            java.lang.Class<java.nio.ByteBuffer> r14 = java.nio.ByteBuffer.class
            com.bumptech.glide.Registry r7 = r5.a(r14, r7)
            r19 = r0
            com.bumptech.glide.load.model.t r0 = new com.bumptech.glide.load.model.t
            r0.<init>(r3)
            r20 = r9
            java.lang.Class<java.io.InputStream> r9 = java.io.InputStream.class
            com.bumptech.glide.Registry r0 = r7.a(r9, r0)
            java.lang.String r7 = "Bitmap"
            r21 = r6
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            com.bumptech.glide.Registry r0 = r0.e(r7, r14, r6, r15)
            r0.e(r7, r9, r6, r13)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            r22 = r0
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            if (r22 == 0) goto Lfd
            com.bumptech.glide.load.resource.bitmap.e0 r3 = new com.bumptech.glide.load.resource.bitmap.e0
            r3.<init>(r12)
            r5.e(r7, r0, r6, r3)
        Lfd:
            com.bumptech.glide.Registry r3 = r5.e(r7, r0, r6, r11)
            com.bumptech.glide.load.g r12 = com.bumptech.glide.load.resource.bitmap.o0.c(r1)
            r22 = r5
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            com.bumptech.glide.Registry r3 = r3.e(r7, r5, r6, r12)
            com.bumptech.glide.load.model.v$a r12 = com.bumptech.glide.load.model.v.a.a()
            com.bumptech.glide.Registry r3 = r3.d(r6, r6, r12)
            com.bumptech.glide.load.resource.bitmap.l0 r12 = new com.bumptech.glide.load.resource.bitmap.l0
            r12.<init>()
            com.bumptech.glide.Registry r3 = r3.e(r7, r6, r6, r12)
            com.bumptech.glide.Registry r3 = r3.b(r6, r2)
            com.bumptech.glide.load.resource.bitmap.a r12 = new com.bumptech.glide.load.resource.bitmap.a
            r12.<init>(r4, r15)
            java.lang.String r15 = "BitmapDrawable"
            r23 = r5
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.Registry r3 = r3.e(r15, r14, r5, r12)
            com.bumptech.glide.load.resource.bitmap.a r12 = new com.bumptech.glide.load.resource.bitmap.a
            r12.<init>(r4, r13)
            com.bumptech.glide.Registry r3 = r3.e(r15, r9, r5, r12)
            com.bumptech.glide.load.resource.bitmap.a r12 = new com.bumptech.glide.load.resource.bitmap.a
            r12.<init>(r4, r11)
            com.bumptech.glide.Registry r3 = r3.e(r15, r0, r5, r12)
            com.bumptech.glide.load.resource.bitmap.b r11 = new com.bumptech.glide.load.resource.bitmap.b
            r11.<init>(r1, r2)
            com.bumptech.glide.Registry r2 = r3.b(r5, r11)
            com.bumptech.glide.load.resource.gif.i r3 = new com.bumptech.glide.load.resource.gif.i
            r11 = r29
            r3.<init>(r8, r10, r11)
            java.lang.String r8 = "Gif"
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r12 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            com.bumptech.glide.Registry r2 = r2.e(r8, r9, r12, r3)
            com.bumptech.glide.Registry r2 = r2.e(r8, r14, r12, r10)
            com.bumptech.glide.load.resource.gif.c r3 = new com.bumptech.glide.load.resource.gif.c
            r3.<init>()
            com.bumptech.glide.Registry r2 = r2.b(r12, r3)
            com.bumptech.glide.load.model.v$a r3 = com.bumptech.glide.load.model.v.a.a()
            java.lang.Class<com.bumptech.glide.gifdecoder.GifDecoder> r8 = com.bumptech.glide.gifdecoder.GifDecoder.class
            com.bumptech.glide.Registry r2 = r2.d(r8, r8, r3)
            com.bumptech.glide.load.resource.gif.g r3 = new com.bumptech.glide.load.resource.gif.g
            r3.<init>(r1)
            com.bumptech.glide.Registry r2 = r2.e(r7, r8, r6, r3)
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r8 = r21
            com.bumptech.glide.Registry r2 = r2.c(r3, r7, r8)
            com.bumptech.glide.load.resource.bitmap.g0 r10 = new com.bumptech.glide.load.resource.bitmap.g0
            r10.<init>(r8, r1)
            com.bumptech.glide.Registry r2 = r2.c(r3, r6, r10)
            u.a$a r8 = new u.a$a
            r8.<init>()
            com.bumptech.glide.Registry r2 = r2.u(r8)
            com.bumptech.glide.load.model.d$b r8 = new com.bumptech.glide.load.model.d$b
            r8.<init>()
            java.lang.Class<java.io.File> r10 = java.io.File.class
            com.bumptech.glide.Registry r2 = r2.d(r10, r14, r8)
            com.bumptech.glide.load.model.f$e r8 = new com.bumptech.glide.load.model.f$e
            r8.<init>()
            com.bumptech.glide.Registry r2 = r2.d(r10, r9, r8)
            v.a r8 = new v.a
            r8.<init>()
            com.bumptech.glide.Registry r2 = r2.c(r10, r10, r8)
            com.bumptech.glide.load.model.f$b r8 = new com.bumptech.glide.load.model.f$b
            r8.<init>()
            com.bumptech.glide.Registry r2 = r2.d(r10, r0, r8)
            com.bumptech.glide.load.model.v$a r8 = com.bumptech.glide.load.model.v.a.a()
            com.bumptech.glide.Registry r2 = r2.d(r10, r10, r8)
            com.bumptech.glide.load.data.k$a r8 = new com.bumptech.glide.load.data.k$a
            r8.<init>(r11)
            r2.u(r8)
            boolean r2 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            if (r2 == 0) goto L1de
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r2 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r2.<init>()
            r8 = r22
            r8.u(r2)
            goto L1e0
        L1de:
            r8 = r22
        L1e0:
            java.lang.Class r2 = java.lang.Integer.TYPE
            r13 = r20
            com.bumptech.glide.Registry r15 = r8.d(r2, r9, r13)
            r11 = r19
            com.bumptech.glide.Registry r15 = r15.d(r2, r0, r11)
            r19 = r12
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            com.bumptech.glide.Registry r13 = r15.d(r12, r9, r13)
            com.bumptech.glide.Registry r11 = r13.d(r12, r0, r11)
            r13 = r18
            com.bumptech.glide.Registry r11 = r11.d(r12, r3, r13)
            r15 = r30
            r1 = r23
            com.bumptech.glide.Registry r11 = r11.d(r2, r1, r15)
            com.bumptech.glide.Registry r11 = r11.d(r12, r1, r15)
            com.bumptech.glide.Registry r2 = r11.d(r2, r3, r13)
            com.bumptech.glide.load.model.e$c r11 = new com.bumptech.glide.load.model.e$c
            r11.<init>()
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            com.bumptech.glide.Registry r2 = r2.d(r12, r9, r11)
            com.bumptech.glide.load.model.e$c r11 = new com.bumptech.glide.load.model.e$c
            r11.<init>()
            com.bumptech.glide.Registry r2 = r2.d(r3, r9, r11)
            com.bumptech.glide.load.model.u$c r11 = new com.bumptech.glide.load.model.u$c
            r11.<init>()
            com.bumptech.glide.Registry r2 = r2.d(r12, r9, r11)
            com.bumptech.glide.load.model.u$b r11 = new com.bumptech.glide.load.model.u$b
            r11.<init>()
            com.bumptech.glide.Registry r2 = r2.d(r12, r0, r11)
            com.bumptech.glide.load.model.u$a r11 = new com.bumptech.glide.load.model.u$a
            r11.<init>()
            com.bumptech.glide.Registry r2 = r2.d(r12, r1, r11)
            com.bumptech.glide.load.model.a$c r11 = new com.bumptech.glide.load.model.a$c
            android.content.res.AssetManager r12 = r25.getAssets()
            r11.<init>(r12)
            com.bumptech.glide.Registry r2 = r2.d(r3, r9, r11)
            com.bumptech.glide.load.model.a$b r11 = new com.bumptech.glide.load.model.a$b
            android.content.res.AssetManager r12 = r25.getAssets()
            r11.<init>(r12)
            com.bumptech.glide.Registry r2 = r2.d(r3, r0, r11)
            com.bumptech.glide.load.model.stream.d$a r11 = new com.bumptech.glide.load.model.stream.d$a
            r12 = r25
            r11.<init>(r12)
            com.bumptech.glide.Registry r2 = r2.d(r3, r9, r11)
            com.bumptech.glide.load.model.stream.e$a r11 = new com.bumptech.glide.load.model.stream.e$a
            r11.<init>(r12)
            r2.d(r3, r9, r11)
            r2 = 29
            r11 = r27
            if (r11 < r2) goto L282
            com.bumptech.glide.load.model.stream.f$c r2 = new com.bumptech.glide.load.model.stream.f$c
            r2.<init>(r12)
            r8.d(r3, r9, r2)
            com.bumptech.glide.load.model.stream.f$b r2 = new com.bumptech.glide.load.model.stream.f$b
            r2.<init>(r12)
            r8.d(r3, r0, r2)
        L282:
            com.bumptech.glide.load.model.w$d r2 = new com.bumptech.glide.load.model.w$d
            r13 = r17
            r2.<init>(r13)
            com.bumptech.glide.Registry r2 = r8.d(r3, r9, r2)
            com.bumptech.glide.load.model.w$b r15 = new com.bumptech.glide.load.model.w$b
            r15.<init>(r13)
            com.bumptech.glide.Registry r0 = r2.d(r3, r0, r15)
            com.bumptech.glide.load.model.w$a r2 = new com.bumptech.glide.load.model.w$a
            r2.<init>(r13)
            com.bumptech.glide.Registry r0 = r0.d(r3, r1, r2)
            com.bumptech.glide.load.model.x$a r1 = new com.bumptech.glide.load.model.x$a
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r3, r9, r1)
            com.bumptech.glide.load.model.stream.i$a r1 = new com.bumptech.glide.load.model.stream.i$a
            r1.<init>()
            java.lang.Class<java.net.URL> r2 = java.net.URL.class
            com.bumptech.glide.Registry r0 = r0.d(r2, r9, r1)
            com.bumptech.glide.load.model.k$a r1 = new com.bumptech.glide.load.model.k$a
            r1.<init>(r12)
            com.bumptech.glide.Registry r0 = r0.d(r3, r10, r1)
            com.bumptech.glide.load.model.stream.b$a r1 = new com.bumptech.glide.load.model.stream.b$a
            r1.<init>()
            java.lang.Class<com.bumptech.glide.load.model.g> r2 = com.bumptech.glide.load.model.g.class
            com.bumptech.glide.Registry r0 = r0.d(r2, r9, r1)
            com.bumptech.glide.load.model.b$a r1 = new com.bumptech.glide.load.model.b$a
            r1.<init>()
            java.lang.Class<byte[]> r2 = byte[].class
            com.bumptech.glide.Registry r0 = r0.d(r2, r14, r1)
            com.bumptech.glide.load.model.b$d r1 = new com.bumptech.glide.load.model.b$d
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r2, r9, r1)
            com.bumptech.glide.load.model.v$a r1 = com.bumptech.glide.load.model.v.a.a()
            com.bumptech.glide.Registry r0 = r0.d(r3, r3, r1)
            com.bumptech.glide.load.model.v$a r1 = com.bumptech.glide.load.model.v.a.a()
            com.bumptech.glide.Registry r0 = r0.d(r7, r7, r1)
            com.bumptech.glide.load.resource.drawable.f r1 = new com.bumptech.glide.load.resource.drawable.f
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.c(r7, r7, r1)
            com.bumptech.glide.load.resource.transcode.b r1 = new com.bumptech.glide.load.resource.transcode.b
            r1.<init>(r4)
            com.bumptech.glide.Registry r0 = r0.x(r6, r5, r1)
            r1 = r31
            com.bumptech.glide.Registry r0 = r0.x(r6, r2, r1)
            com.bumptech.glide.load.resource.transcode.c r3 = new com.bumptech.glide.load.resource.transcode.c
            r9 = r28
            r10 = r16
            r3.<init>(r9, r1, r10)
            com.bumptech.glide.Registry r0 = r0.x(r7, r2, r3)
            r1 = r19
            r0.x(r1, r2, r10)
            r0 = 23
            if (r11 < r0) goto L328
            com.bumptech.glide.load.g r0 = com.bumptech.glide.load.resource.bitmap.o0.d(r9)
            r8.c(r14, r6, r0)
            com.bumptech.glide.load.resource.bitmap.a r1 = new com.bumptech.glide.load.resource.bitmap.a
            r1.<init>(r4, r0)
            r8.c(r14, r5, r1)
        L328:
            com.bumptech.glide.request.target.k r5 = new com.bumptech.glide.request.target.k
            r5.<init>()
            com.bumptech.glide.d r1 = new com.bumptech.glide.d
            r9 = r26
            r3 = r29
            r11 = r32
            r6 = r33
            r7 = r34
            r10 = r36
            r4 = r8
            r2 = r12
            r8 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r24
            r0.d = r1
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.i B(@androidx.annotation.NonNull android.app.Activity r1) {
            com.bumptech.glide.manager.q r0 = o(r1)
            com.bumptech.glide.i r1 = r0.j(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bumptech.glide.i C(@androidx.annotation.NonNull android.app.Fragment r1) {
            android.app.Activity r0 = r1.getActivity()
            com.bumptech.glide.manager.q r0 = o(r0)
            com.bumptech.glide.i r1 = r0.k(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.i D(@androidx.annotation.NonNull android.content.Context r1) {
            com.bumptech.glide.manager.q r0 = o(r1)
            com.bumptech.glide.i r1 = r0.l(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.i E(@androidx.annotation.NonNull android.view.View r1) {
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.manager.q r0 = o(r0)
            com.bumptech.glide.i r1 = r0.m(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.i F(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.manager.q r0 = o(r0)
            com.bumptech.glide.i r1 = r0.n(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.i G(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r1) {
            com.bumptech.glide.manager.q r0 = o(r1)
            com.bumptech.glide.i r1 = r0.o(r1)
            return r1
    }

    @androidx.annotation.GuardedBy("Glide.class")
    private static void a(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable com.bumptech.glide.GeneratedAppGlideModule r2) {
            boolean r0 = com.bumptech.glide.b.f331p
            if (r0 != 0) goto Le
            r0 = 1
            com.bumptech.glide.b.f331p = r0
            r(r1, r2)
            r1 = 0
            com.bumptech.glide.b.f331p = r1
            return
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public static void d() {
            com.bumptech.glide.load.resource.bitmap.a0 r0 = com.bumptech.glide.load.resource.bitmap.a0.d()
            r0.l()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.b e(@androidx.annotation.NonNull android.content.Context r3) {
            com.bumptech.glide.b r0 = com.bumptech.glide.b.f330o
            if (r0 != 0) goto L21
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.bumptech.glide.GeneratedAppGlideModule r0 = f(r0)
            java.lang.Class<com.bumptech.glide.b> r1 = com.bumptech.glide.b.class
            monitor-enter(r1)
            com.bumptech.glide.b r2 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            a(r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L21:
            com.bumptech.glide.b r3 = com.bumptech.glide.b.f330o
            return r3
    }

    @androidx.annotation.Nullable
    private static com.bumptech.glide.GeneratedAppGlideModule f(android.content.Context r5) {
            java.lang.String r0 = "com.bumptech.glide.GeneratedAppGlideModuleImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            java.lang.Object r5 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            com.bumptech.glide.GeneratedAppGlideModule r5 = (com.bumptech.glide.GeneratedAppGlideModule) r5     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34 java.lang.ClassNotFoundException -> L39
            return r5
        L25:
            r5 = move-exception
            y(r5)
            goto L3f
        L2a:
            r5 = move-exception
            y(r5)
            goto L3f
        L2f:
            r5 = move-exception
            y(r5)
            goto L3f
        L34:
            r5 = move-exception
            y(r5)
            goto L3f
        L39:
            java.lang.String r5 = "Glide"
            r0 = 5
            android.util.Log.isLoggable(r5, r0)
        L3f:
            r5 = 0
            return r5
    }

    @androidx.annotation.Nullable
    public static java.io.File k(@androidx.annotation.NonNull android.content.Context r1) {
            java.lang.String r0 = "image_manager_disk_cache"
            java.io.File r1 = l(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static java.io.File l(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            java.io.File r2 = r2.getCacheDir()
            r0 = 0
            if (r2 == 0) goto L1b
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r3)
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L1a
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            return r1
        L1b:
            java.lang.String r2 = "Glide"
            r3 = 6
            android.util.Log.isLoggable(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.manager.q o(@androidx.annotation.Nullable android.content.Context r1) {
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            com.bumptech.glide.util.k.e(r1, r0)
            com.bumptech.glide.b r1 = e(r1)
            com.bumptech.glide.manager.q r1 = r1.n()
            return r1
    }

    @androidx.annotation.VisibleForTesting
    public static void p(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.c r4) {
            com.bumptech.glide.GeneratedAppGlideModule r0 = f(r3)
            java.lang.Class<com.bumptech.glide.b> r1 = com.bumptech.glide.b.class
            monitor-enter(r1)
            com.bumptech.glide.b r2 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            x()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L16
        L11:
            s(r3, r4, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    public static synchronized void q(com.bumptech.glide.b r2) {
            java.lang.Class<com.bumptech.glide.b> r0 = com.bumptech.glide.b.class
            monitor-enter(r0)
            com.bumptech.glide.b r1 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            x()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto L11
        Ld:
            com.bumptech.glide.b.f330o = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @androidx.annotation.GuardedBy("Glide.class")
    private static void r(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable com.bumptech.glide.GeneratedAppGlideModule r2) {
            com.bumptech.glide.c r0 = new com.bumptech.glide.c
            r0.<init>()
            s(r1, r0, r2)
            return
    }

    @androidx.annotation.GuardedBy("Glide.class")
    private static void s(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull com.bumptech.glide.c r8, @androidx.annotation.Nullable com.bumptech.glide.GeneratedAppGlideModule r9) {
            android.content.Context r7 = r7.getApplicationContext()
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r9 == 0) goto L12
            boolean r1 = r9.c()
            if (r1 == 0) goto L1b
        L12:
            com.bumptech.glide.module.e r0 = new com.bumptech.glide.module.e
            r0.<init>(r7)
            java.util.List r0 = r0.a()
        L1b:
            r1 = 3
            java.lang.String r2 = "Glide"
            if (r9 == 0) goto L56
            java.util.Set r3 = r9.d()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L56
            java.util.Set r3 = r9.d()
            java.util.Iterator r4 = r0.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            com.bumptech.glide.module.c r5 = (com.bumptech.glide.module.c) r5
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r3.contains(r6)
            if (r6 != 0) goto L49
            goto L32
        L49:
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L52
            r5.toString()
        L52:
            r4.remove()
            goto L32
        L56:
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L74
            java.util.Iterator r1 = r0.iterator()
        L60:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.module.c r2 = (com.bumptech.glide.module.c) r2
            java.lang.Class r2 = r2.getClass()
            r2.toString()
            goto L60
        L74:
            if (r9 == 0) goto L7b
            com.bumptech.glide.manager.q$b r1 = r9.e()
            goto L7c
        L7b:
            r1 = 0
        L7c:
            r8.t(r1)
            java.util.Iterator r1 = r0.iterator()
        L83:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.module.c r2 = (com.bumptech.glide.module.c) r2
            r2.a(r7, r8)
            goto L83
        L93:
            if (r9 == 0) goto L98
            r9.a(r7, r8)
        L98:
            com.bumptech.glide.b r8 = r8.b(r7)
            java.util.Iterator r0 = r0.iterator()
        La0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld2
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.module.c r1 = (com.bumptech.glide.module.c) r1
            com.bumptech.glide.Registry r2 = r8.e     // Catch: java.lang.AbstractMethodError -> Lb2
            r1.b(r7, r8, r2)     // Catch: java.lang.AbstractMethodError -> Lb2
            goto La0
        Lb2:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "
            r9.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9, r7)
            throw r8
        Ld2:
            if (r9 == 0) goto Ld9
            com.bumptech.glide.Registry r0 = r8.e
            r9.b(r7, r8, r0)
        Ld9:
            r7.registerComponentCallbacks(r8)
            com.bumptech.glide.b.f330o = r8
            return
    }

    @androidx.annotation.VisibleForTesting
    public static void x() {
            java.lang.Class<com.bumptech.glide.b> r0 = com.bumptech.glide.b.class
            monitor-enter(r0)
            com.bumptech.glide.b r1 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            com.bumptech.glide.b r1 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.b r2 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> L22
            r1.unregisterComponentCallbacks(r2)     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.b r1 = com.bumptech.glide.b.f330o     // Catch: java.lang.Throwable -> L22
            com.bumptech.glide.load.engine.k r1 = r1.a     // Catch: java.lang.Throwable -> L22
            r1.m()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L29
        L24:
            r1 = 0
            com.bumptech.glide.b.f330o = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    private static void y(java.lang.Exception r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r2)
            throw r0
    }

    void A(com.bumptech.glide.i r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.i> r0 = r2.i
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.i> r1 = r2.i     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.util.List<com.bumptech.glide.i> r1 = r2.i     // Catch: java.lang.Throwable -> L12
            r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            goto L1c
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Cannot unregister not yet registered manager"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public void b() {
            r1 = this;
            com.bumptech.glide.util.l.a()
            com.bumptech.glide.load.engine.k r0 = r1.a
            r0.e()
            return
    }

    public void c() {
            r1 = this;
            com.bumptech.glide.util.l.b()
            com.bumptech.glide.load.engine.cache.j r0 = r1.c
            r0.b()
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r1.b
            r0.b()
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r1.f
            r0.b()
            return
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.b g() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r1.f
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.Context getContext() {
            r1 = this;
            com.bumptech.glide.d r0 = r1.d
            android.content.Context r0 = r0.getBaseContext()
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.e h() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r1.b
            return r0
    }

    com.bumptech.glide.manager.d i() {
            r1 = this;
            com.bumptech.glide.manager.d r0 = r1.h
            return r0
    }

    @androidx.annotation.NonNull
    com.bumptech.glide.d j() {
            r1 = this;
            com.bumptech.glide.d r0 = r1.d
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.Registry m() {
            r1 = this;
            com.bumptech.glide.Registry r0 = r1.e
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.q n() {
            r1 = this;
            com.bumptech.glide.manager.q r0 = r1.g
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            r0.c()
            return
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r1) {
            r0 = this;
            r0.z(r1)
            return
    }

    public synchronized void t(@androidx.annotation.NonNull com.bumptech.glide.load.engine.prefill.d.a... r5) {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.load.engine.prefill.b r0 = r4.f332l     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            com.bumptech.glide.b$a r0 = r4.j     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.request.h r0 = r0.build()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.f r0 = r0.M()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.bitmap.u.g     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.DecodeFormat r0 = (com.bumptech.glide.load.DecodeFormat) r0     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.prefill.b r1 = new com.bumptech.glide.load.engine.prefill.b     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.cache.j r2 = r4.c     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.bitmap_recycle.e r3 = r4.b     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L23
            r4.f332l = r1     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r5 = move-exception
            goto L2c
        L25:
            com.bumptech.glide.load.engine.prefill.b r0 = r4.f332l     // Catch: java.lang.Throwable -> L23
            r0.c(r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return
        L2c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    void u(com.bumptech.glide.i r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.i> r0 = r2.i
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.i> r1 = r2.i     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.List<com.bumptech.glide.i> r1 = r2.i     // Catch: java.lang.Throwable -> L12
            r1.add(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            goto L1c
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Cannot register already registered manager"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    boolean v(@androidx.annotation.NonNull com.bumptech.glide.request.target.p<?> r4) {
            r3 = this;
            java.util.List<com.bumptech.glide.i> r0 = r3.i
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.i> r1 = r3.i     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.i r2 = (com.bumptech.glide.i) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.Z(r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L9
            r4 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r4
        L1e:
            r4 = move-exception
            goto L23
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            return r4
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.MemoryCategory w(@androidx.annotation.NonNull com.bumptech.glide.MemoryCategory r3) {
            r2 = this;
            com.bumptech.glide.util.l.b()
            com.bumptech.glide.load.engine.cache.j r0 = r2.c
            float r1 = r3.getMultiplier()
            r0.c(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r2.b
            float r1 = r3.getMultiplier()
            r0.c(r1)
            com.bumptech.glide.MemoryCategory r0 = r2.k
            r2.k = r3
            return r0
    }

    public void z(int r4) {
            r3 = this;
            com.bumptech.glide.util.l.b()
            java.util.List<com.bumptech.glide.i> r0 = r3.i
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.i> r1 = r3.i     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.i r2 = (com.bumptech.glide.i) r2     // Catch: java.lang.Throwable -> L1c
            r2.onTrimMemory(r4)     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r4 = move-exception
            goto L2f
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.cache.j r0 = r3.c
            r0.a(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r3.b
            r0.a(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r3.f
            r0.a(r4)
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }
}
