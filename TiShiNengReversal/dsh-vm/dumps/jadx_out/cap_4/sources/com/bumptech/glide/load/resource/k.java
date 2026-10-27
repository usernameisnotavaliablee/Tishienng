package com.bumptech.glide.load.resource;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 28)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class k<T> implements com.bumptech.glide.load.g<android.graphics.ImageDecoder.Source, T> {
    private static final java.lang.String b = "ImageDecoder";
    final com.bumptech.glide.load.resource.bitmap.a0 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ com.bumptech.glide.load.DecodeFormat d;
        final /* synthetic */ com.bumptech.glide.load.resource.bitmap.DownsampleStrategy e;
        final /* synthetic */ com.bumptech.glide.load.PreferredColorSpace f;
        final /* synthetic */ com.bumptech.glide.load.resource.k g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.resource.k$a$a, reason: collision with other inner class name */
        class C0032a implements android.graphics.ImageDecoder.OnPartialImageListener {
            final /* synthetic */ com.bumptech.glide.load.resource.k.a a;

            C0032a(com.bumptech.glide.load.resource.k.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(@androidx.annotation.NonNull android.graphics.ImageDecoder.DecodeException r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }
        }

        a(com.bumptech.glide.load.resource.k r1, int r2, int r3, boolean r4, com.bumptech.glide.load.DecodeFormat r5, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r6, com.bumptech.glide.load.PreferredColorSpace r7) {
                r0 = this;
                r0.g = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r7
                r0.<init>()
                return
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @android.annotation.SuppressLint({"Override"})
        public void onHeaderDecoded(android.graphics.ImageDecoder r6, android.graphics.ImageDecoder.ImageInfo r7, android.graphics.ImageDecoder.Source r8) {
                r5 = this;
                com.bumptech.glide.load.resource.k r8 = r5.g
                com.bumptech.glide.load.resource.bitmap.a0 r8 = r8.a
                int r0 = r5.a
                int r1 = r5.b
                boolean r2 = r5.c
                r3 = 0
                boolean r8 = r8.g(r0, r1, r2, r3)
                if (r8 == 0) goto L16
                r8 = 3
                com.bumptech.glide.load.resource.b.a(r6, r8)
                goto L1a
            L16:
                r8 = 1
                com.bumptech.glide.load.resource.b.a(r6, r8)
            L1a:
                com.bumptech.glide.load.DecodeFormat r8 = r5.d
                com.bumptech.glide.load.DecodeFormat r0 = com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565
                if (r8 != r0) goto L23
                com.bumptech.glide.load.resource.d.a(r6, r3)
            L23:
                com.bumptech.glide.load.resource.k$a$a r8 = new com.bumptech.glide.load.resource.k$a$a
                r8.<init>(r5)
                com.bumptech.glide.load.resource.e.a(r6, r8)
                android.util.Size r8 = com.bumptech.glide.load.resource.f.a(r7)
                int r0 = r5.a
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r1) goto L39
                int r0 = r8.getWidth()
            L39:
                int r2 = r5.b
                if (r2 != r1) goto L41
                int r2 = r8.getHeight()
            L41:
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1 = r5.e
                int r3 = r8.getWidth()
                int r4 = r8.getHeight()
                float r0 = r1.b(r3, r4, r0, r2)
                int r1 = r8.getWidth()
                float r1 = (float) r1
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                int r2 = r8.getHeight()
                float r2 = (float) r2
                float r0 = r0 * r2
                int r0 = java.lang.Math.round(r0)
                java.lang.String r2 = "ImageDecoder"
                r3 = 2
                boolean r2 = android.util.Log.isLoggable(r2, r3)
                if (r2 == 0) goto L74
                r8.getWidth()
                r8.getHeight()
            L74:
                com.bumptech.glide.load.resource.g.a(r6, r1, r0)
                int r8 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r8 < r0) goto La4
                com.bumptech.glide.load.PreferredColorSpace r8 = r5.f
                com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
                if (r8 != r0) goto L98
                android.graphics.ColorSpace r8 = com.bumptech.glide.load.resource.h.a(r7)
                if (r8 == 0) goto L98
                android.graphics.ColorSpace r7 = com.bumptech.glide.load.resource.h.a(r7)
                boolean r7 = com.bumptech.glide.load.resource.i.a(r7)
                if (r7 == 0) goto L98
                android.graphics.ColorSpace$Named r7 = com.bumptech.glide.load.resource.j.a()
                goto L9c
            L98:
                android.graphics.ColorSpace$Named r7 = androidx.core.graphics.b.a()
            L9c:
                android.graphics.ColorSpace r7 = androidx.core.graphics.c.a(r7)
                com.bumptech.glide.load.resource.c.a(r6, r7)
                return
            La4:
                r7 = 26
                if (r8 < r7) goto Lb3
                android.graphics.ColorSpace$Named r7 = androidx.core.graphics.b.a()
                android.graphics.ColorSpace r7 = androidx.core.graphics.c.a(r7)
                com.bumptech.glide.load.resource.c.a(r6, r7)
            Lb3:
                return
        }
    }

    public k() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.a0 r0 = com.bumptech.glide.load.resource.bitmap.a0.d()
            r1.a = r0
            return
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = com.bumptech.glide.load.resource.a.a(r1)
            boolean r1 = r0.e(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u b(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = com.bumptech.glide.load.resource.a.a(r1)
            com.bumptech.glide.load.engine.u r1 = r0.d(r1, r2, r3, r4)
            return r1
    }

    protected abstract com.bumptech.glide.load.engine.u<T> c(android.graphics.ImageDecoder.Source r1, int r2, int r3, android.graphics.ImageDecoder.OnHeaderDecodedListener r4) throws java.io.IOException;

    @androidx.annotation.Nullable
    public final com.bumptech.glide.load.engine.u<T> d(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r10, int r11, int r12, @androidx.annotation.NonNull com.bumptech.glide.load.f r13) throws java.io.IOException {
            r9 = this;
            com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> r0 = com.bumptech.glide.load.resource.bitmap.u.g
            java.lang.Object r0 = r13.c(r0)
            r6 = r0
            com.bumptech.glide.load.DecodeFormat r6 = (com.bumptech.glide.load.DecodeFormat) r6
            com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.h
            java.lang.Object r0 = r13.c(r0)
            r7 = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r7 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r7
            com.bumptech.glide.load.e<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.bitmap.u.k
            java.lang.Object r1 = r13.c(r0)
            if (r1 == 0) goto L29
            java.lang.Object r0 = r13.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            r0 = 1
            r5 = 1
            goto L2b
        L29:
            r0 = 0
            r5 = 0
        L2b:
            com.bumptech.glide.load.e<com.bumptech.glide.load.PreferredColorSpace> r0 = com.bumptech.glide.load.resource.bitmap.u.h
            java.lang.Object r13 = r13.c(r0)
            r8 = r13
            com.bumptech.glide.load.PreferredColorSpace r8 = (com.bumptech.glide.load.PreferredColorSpace) r8
            com.bumptech.glide.load.resource.k$a r1 = new com.bumptech.glide.load.resource.k$a
            r2 = r9
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.bumptech.glide.load.engine.u r10 = r9.c(r10, r3, r4, r1)
            return r10
    }

    public final boolean e(@androidx.annotation.NonNull android.graphics.ImageDecoder.Source r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
