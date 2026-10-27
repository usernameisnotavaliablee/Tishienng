package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d0 {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.d0 a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.common.utils.SaveToGalleyUtils$downloadToGallery$1", f = "SaveToGalleyUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3}, l = {65, 69, 74, 79}, m = "invokeSuspend", n = {"connection", "inputStream", "bitmap", "savedImageURL", "filePath", "connection", "inputStream", "bitmap", "savedImageURL", "connection", "inputStream", "bitmap", "e"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        int f;
        final /* synthetic */ java.lang.String g;
        final /* synthetic */ androidx.fragment.app.FragmentActivity h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.common.utils.SaveToGalleyUtils$downloadToGallery$1$1", f = "SaveToGalleyUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.bxkj.base.v2.common.utils.d0$a$a, reason: collision with other inner class name */
        static final class C0057a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super android.widget.Toast>, java.lang.Object> {
            int a;
            final /* synthetic */ androidx.fragment.app.FragmentActivity b;

            C0057a(androidx.fragment.app.FragmentActivity r1, kotlin.coroutines.e<? super com.bxkj.base.v2.common.utils.d0.a.C0057a> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.base.v2.common.utils.d0$a$a r2 = new com.bxkj.base.v2.common.utils.d0$a$a
                    androidx.fragment.app.FragmentActivity r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super android.widget.Toast> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.base.v2.common.utils.d0$a$a r1 = (com.bxkj.base.v2.common.utils.d0.a.C0057a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    r4 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r4.a
                    if (r0 != 0) goto L16
                    kotlin.g0.n(r5)
                    androidx.fragment.app.FragmentActivity r5 = r4.b
                    r0 = 2
                    r1 = 0
                    java.lang.String r2 = "图片已保存到相册"
                    r3 = 0
                    android.widget.Toast r5 = com.bxkj.base.v2.common.ext.ContextExtKt.s(r5, r2, r3, r0, r1)
                    return r5
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.common.utils.SaveToGalleyUtils$downloadToGallery$1$2", f = "SaveToGalleyUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ androidx.fragment.app.FragmentActivity b;

            b(androidx.fragment.app.FragmentActivity r1, kotlin.coroutines.e<? super com.bxkj.base.v2.common.utils.d0.a.b> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.base.v2.common.utils.d0$a$b r2 = new com.bxkj.base.v2.common.utils.d0$a$b
                    androidx.fragment.app.FragmentActivity r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.base.v2.common.utils.d0$a$b r1 = (com.bxkj.base.v2.common.utils.d0.a.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L14
                    kotlin.g0.n(r2)
                    androidx.fragment.app.FragmentActivity r2 = r1.b
                    java.lang.String r0 = "保存失败"
                    com.bxkj.base.v2.common.ext.ContextExtKt.q(r2, r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L14:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.common.utils.SaveToGalleyUtils$downloadToGallery$1$3", f = "SaveToGalleyUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ androidx.fragment.app.FragmentActivity b;

            c(androidx.fragment.app.FragmentActivity r1, kotlin.coroutines.e<? super com.bxkj.base.v2.common.utils.d0.a.c> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.base.v2.common.utils.d0$a$c r2 = new com.bxkj.base.v2.common.utils.d0$a$c
                    androidx.fragment.app.FragmentActivity r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.base.v2.common.utils.d0$a$c r1 = (com.bxkj.base.v2.common.utils.d0.a.c) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L14
                    kotlin.g0.n(r2)
                    androidx.fragment.app.FragmentActivity r2 = r1.b
                    java.lang.String r0 = "保存失败"
                    com.bxkj.base.v2.common.ext.ContextExtKt.q(r2, r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L14:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.common.utils.SaveToGalleyUtils$downloadToGallery$1$4", f = "SaveToGalleyUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ androidx.fragment.app.FragmentActivity b;

            d(androidx.fragment.app.FragmentActivity r1, kotlin.coroutines.e<? super com.bxkj.base.v2.common.utils.d0.a.d> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.base.v2.common.utils.d0$a$d r2 = new com.bxkj.base.v2.common.utils.d0$a$d
                    androidx.fragment.app.FragmentActivity r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.base.v2.common.utils.d0$a$d r1 = (com.bxkj.base.v2.common.utils.d0.a.d) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L14
                    kotlin.g0.n(r2)
                    androidx.fragment.app.FragmentActivity r2 = r1.b
                    java.lang.String r0 = "保存失败"
                    com.bxkj.base.v2.common.ext.ContextExtKt.q(r2, r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L14:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        a(java.lang.String r1, androidx.fragment.app.FragmentActivity r2, kotlin.coroutines.e<? super com.bxkj.base.v2.common.utils.d0.a> r3) {
                r0 = this;
                r0.g = r1
                r0.h = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.base.v2.common.utils.d0$a r3 = new com.bxkj.base.v2.common.utils.d0$a
                java.lang.String r0 = r2.g
                androidx.fragment.app.FragmentActivity r1 = r2.h
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.base.v2.common.utils.d0$a r1 = (com.bxkj.base.v2.common.utils.d0.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.f
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L68
                if (r1 == r5) goto L4f
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r11.a
                java.lang.Exception r0 = (java.lang.Exception) r0
                kotlin.g0.n(r12)
                goto L155
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                java.lang.Object r1 = r11.c
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                java.lang.Object r1 = r11.b
                java.io.InputStream r1 = (java.io.InputStream) r1
                java.lang.Object r1 = r11.a
                java.net.URLConnection r1 = (java.net.URLConnection) r1
                kotlin.g0.n(r12)     // Catch: java.lang.Exception -> L37
                goto L130
            L37:
                r12 = move-exception
                goto L133
            L3a:
                java.lang.Object r1 = r11.d
                android.net.Uri r1 = (android.net.Uri) r1
                java.lang.Object r1 = r11.c
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                java.lang.Object r1 = r11.b
                java.io.InputStream r1 = (java.io.InputStream) r1
                java.lang.Object r1 = r11.a
                java.net.URLConnection r1 = (java.net.URLConnection) r1
                kotlin.g0.n(r12)     // Catch: java.lang.Exception -> L37
                goto L107
            L4f:
                java.lang.Object r1 = r11.e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r11.d
                android.net.Uri r1 = (android.net.Uri) r1
                java.lang.Object r1 = r11.c
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                java.lang.Object r1 = r11.b
                java.io.InputStream r1 = (java.io.InputStream) r1
                java.lang.Object r1 = r11.a
                java.net.URLConnection r1 = (java.net.URLConnection) r1
                kotlin.g0.n(r12)     // Catch: java.lang.Exception -> L37
                goto L155
            L68:
                kotlin.g0.n(r12)
                java.net.URL r12 = new java.net.URL     // Catch: java.lang.Exception -> L37
                java.lang.String r1 = r11.g     // Catch: java.lang.Exception -> L37
                r12.<init>(r1)     // Catch: java.lang.Exception -> L37
                java.net.URLConnection r12 = r12.openConnection()     // Catch: java.lang.Exception -> L37
                java.io.InputStream r1 = r12.getInputStream()     // Catch: java.lang.Exception -> L37
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.lang.Exception -> L37
                r1.close()     // Catch: java.lang.Exception -> L37
                if (r7 == 0) goto L10a
                com.bxkj.base.v2.common.utils.d0 r3 = com.bxkj.base.v2.common.utils.d0.a     // Catch: java.lang.Exception -> L37
                androidx.fragment.app.FragmentActivity r8 = r11.h     // Catch: java.lang.Exception -> L37
                long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L37
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L37
                java.lang.String r10 = "DownLoad Image"
                android.net.Uri r8 = com.bxkj.base.v2.common.utils.d0.b(r3, r8, r7, r9, r10)     // Catch: java.lang.Exception -> L37
                if (r8 == 0) goto Ldb
                androidx.fragment.app.FragmentActivity r4 = r11.h     // Catch: java.lang.Exception -> L37
                java.lang.String r3 = com.bxkj.base.v2.common.utils.d0.a(r3, r4, r8)     // Catch: java.lang.Exception -> L37
                if (r3 == 0) goto La8
                androidx.fragment.app.FragmentActivity r4 = r11.h     // Catch: java.lang.Exception -> L37
                java.lang.String[] r9 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> L37
                android.media.MediaScannerConnection.scanFile(r4, r9, r6, r6)     // Catch: java.lang.Exception -> L37
            La8:
                kotlinx.coroutines.p2 r4 = kotlinx.coroutines.g1.e()     // Catch: java.lang.Exception -> L37
                com.bxkj.base.v2.common.utils.d0$a$a r9 = new com.bxkj.base.v2.common.utils.d0$a$a     // Catch: java.lang.Exception -> L37
                androidx.fragment.app.FragmentActivity r10 = r11.h     // Catch: java.lang.Exception -> L37
                r9.<init>(r10, r6)     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L37
                r11.a = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Exception -> L37
                r11.b = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r7)     // Catch: java.lang.Exception -> L37
                r11.c = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r8)     // Catch: java.lang.Exception -> L37
                r11.d = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r3)     // Catch: java.lang.Exception -> L37
                r11.e = r12     // Catch: java.lang.Exception -> L37
                r11.f = r5     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlinx.coroutines.i.h(r4, r9, r11)     // Catch: java.lang.Exception -> L37
                if (r12 != r0) goto L155
                goto L154
            Ldb:
                kotlinx.coroutines.p2 r3 = kotlinx.coroutines.g1.e()     // Catch: java.lang.Exception -> L37
                com.bxkj.base.v2.common.utils.d0$a$b r5 = new com.bxkj.base.v2.common.utils.d0$a$b     // Catch: java.lang.Exception -> L37
                androidx.fragment.app.FragmentActivity r9 = r11.h     // Catch: java.lang.Exception -> L37
                r5.<init>(r9, r6)     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L37
                r11.a = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Exception -> L37
                r11.b = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r7)     // Catch: java.lang.Exception -> L37
                r11.c = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r8)     // Catch: java.lang.Exception -> L37
                r11.d = r12     // Catch: java.lang.Exception -> L37
                r11.f = r4     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlinx.coroutines.i.h(r3, r5, r11)     // Catch: java.lang.Exception -> L37
                if (r12 != r0) goto L107
                goto L154
            L107:
                kotlin.n1 r12 = kotlin.n1.a     // Catch: java.lang.Exception -> L37
                goto L155
            L10a:
                kotlinx.coroutines.p2 r4 = kotlinx.coroutines.g1.e()     // Catch: java.lang.Exception -> L37
                com.bxkj.base.v2.common.utils.d0$a$c r5 = new com.bxkj.base.v2.common.utils.d0$a$c     // Catch: java.lang.Exception -> L37
                androidx.fragment.app.FragmentActivity r8 = r11.h     // Catch: java.lang.Exception -> L37
                r5.<init>(r8, r6)     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r12)     // Catch: java.lang.Exception -> L37
                r11.a = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Exception -> L37
                r11.b = r12     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r7)     // Catch: java.lang.Exception -> L37
                r11.c = r12     // Catch: java.lang.Exception -> L37
                r11.f = r3     // Catch: java.lang.Exception -> L37
                java.lang.Object r12 = kotlinx.coroutines.i.h(r4, r5, r11)     // Catch: java.lang.Exception -> L37
                if (r12 != r0) goto L130
                goto L154
            L130:
                kotlin.n1 r12 = kotlin.n1.a     // Catch: java.lang.Exception -> L37
                goto L155
            L133:
                kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()
                com.bxkj.base.v2.common.utils.d0$a$d r3 = new com.bxkj.base.v2.common.utils.d0$a$d
                androidx.fragment.app.FragmentActivity r4 = r11.h
                r3.<init>(r4, r6)
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r12)
                r11.a = r12
                r11.b = r6
                r11.c = r6
                r11.d = r6
                r11.e = r6
                r11.f = r2
                java.lang.Object r12 = kotlinx.coroutines.i.h(r1, r3, r11)
                if (r12 != r0) goto L155
            L154:
                return r0
            L155:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    static {
            com.bxkj.base.v2.common.utils.d0 r0 = new com.bxkj.base.v2.common.utils.d0
            r0.<init>()
            com.bxkj.base.v2.common.utils.d0.a = r0
            return
    }

    private d0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.String a(com.bxkj.base.v2.common.utils.d0 r0, android.content.Context r1, android.net.Uri r2) {
            java.lang.String r0 = r0.d(r1, r2)
            return r0
    }

    public static final /* synthetic */ android.net.Uri b(com.bxkj.base.v2.common.utils.d0 r0, android.content.Context r1, android.graphics.Bitmap r2, java.lang.String r3, java.lang.String r4) {
            android.net.Uri r0 = r0.e(r1, r2, r3, r4)
            return r0
    }

    private final java.lang.String d(android.content.Context r8, android.net.Uri r9) {
            r7 = this;
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            android.content.ContentResolver r1 = r8.getContentResolver()
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r9
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            r9 = 0
            if (r8 == 0) goto L39
            java.io.Closeable r8 = (java.io.Closeable) r8
            r1 = r8
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2c
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r9 = r0
            goto L33
        L2c:
            r0 = r9
        L2d:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L29
            kotlin.io.b.a(r8, r9)
            return r0
        L33:
            throw r9     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            kotlin.io.b.a(r8, r9)
            throw r0
        L39:
            return r9
    }

    private final android.net.Uri e(android.content.Context r3, android.graphics.Bitmap r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "_display_name"
            r0.put(r1, r5)
            java.lang.String r5 = "mime_type"
            java.lang.String r1 = "image/jpeg"
            r0.put(r5, r1)
            java.lang.String r5 = "description"
            r0.put(r5, r6)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r5 < r6) goto L23
            java.lang.String r5 = "relative_path"
            java.lang.String r6 = android.os.Environment.DIRECTORY_DCIM
            r0.put(r5, r6)
        L23:
            android.content.ContentResolver r5 = r3.getContentResolver()
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r5 = r5.insert(r6, r0)
            r6 = 0
            if (r5 == 0) goto L4d
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L4d
            java.io.OutputStream r3 = r3.openOutputStream(r5)     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L4c
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L45
            r1 = 100
            r4.compress(r0, r1, r3)     // Catch: java.lang.Throwable -> L45
            kotlin.io.b.a(r3, r6)     // Catch: java.lang.Exception -> L4d
            return r5
        L45:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            kotlin.io.b.a(r3, r4)     // Catch: java.lang.Exception -> L4d
            throw r5     // Catch: java.lang.Exception -> L4d
        L4c:
            return r5
        L4d:
            return r6
    }

    public final void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r8, @org.jetbrains.annotations.Nullable java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r8, r0)
            if (r9 == 0) goto L22
            int r0 = r9.length()
            if (r0 != 0) goto Le
            goto L22
        Le:
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r8)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.base.v2.common.utils.d0$a r4 = new com.bxkj.base.v2.common.utils.d0$a
            r0 = 0
            r4.<init>(r9, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
        L22:
            return
    }
}
