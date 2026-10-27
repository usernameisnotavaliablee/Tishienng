package com.bxkj.base.v2.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.h5.e a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.h5.DownloadBlobFile$saveGifToPath$1", f = "DownloadBlobFile.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ androidx.fragment.app.FragmentActivity b;

        a(androidx.fragment.app.FragmentActivity r1, kotlin.coroutines.e<? super com.bxkj.base.v2.h5.e.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.base.v2.h5.e$a r2 = new com.bxkj.base.v2.h5.e$a
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
                com.bxkj.base.v2.h5.e$a r1 = (com.bxkj.base.v2.h5.e.a) r1
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
                java.lang.String r0 = "下载失败"
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

    static {
            com.bxkj.base.v2.h5.e r0 = new com.bxkj.base.v2.h5.e
            r0.<init>()
            com.bxkj.base.v2.h5.e.a = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 a(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = g(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(androidx.fragment.app.FragmentActivity r0, java.lang.String r1, android.net.Uri r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            kotlin.n1 r0 = f(r0, r1, r2, r3)
            return r0
    }

    private final void d(androidx.fragment.app.FragmentActivity r3, java.lang.String r4, android.net.Uri r5) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L21
            r0.setDataAndType(r5, r4)     // Catch: java.lang.Exception -> L21
            r4 = 1
            r0.addFlags(r4)     // Catch: java.lang.Exception -> L21
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r4)     // Catch: java.lang.Exception -> L21
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: java.lang.Exception -> L21
            android.content.ComponentName r4 = r0.resolveActivity(r4)     // Catch: java.lang.Exception -> L21
            if (r4 == 0) goto L23
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L21
            return
        L21:
            r4 = move-exception
            goto L29
        L23:
            java.lang.String r4 = "没有找到可以打开此文件的应用"
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r3, r4)     // Catch: java.lang.Exception -> L21
            return
        L29:
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "打开文件失败: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(29)
    private final void e(androidx.fragment.app.FragmentActivity r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            android.content.ContentResolver r0 = r11.getContentResolver()
            if (r0 == 0) goto L9d
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "_display_name"
            r1.put(r2, r12)
            java.lang.String r2 = "mime_type"
            r1.put(r2, r13)
            java.lang.String r2 = "relative_path"
            java.lang.String r3 = android.os.Environment.DIRECTORY_DOWNLOADS
            r1.put(r2, r3)
            android.net.Uri r2 = com.bxkj.base.v2.h5.b.a()     // Catch: java.lang.Exception -> L97
            android.net.Uri r1 = r0.insert(r2, r1)     // Catch: java.lang.Exception -> L97
            if (r1 == 0) goto L9d
            java.io.OutputStream r2 = r0.openOutputStream(r1)     // Catch: java.lang.Exception -> L97
            if (r2 == 0) goto L9d
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "data:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L8d
            r3.append(r13)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = ";base64,"
            r3.append(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = ""
            java.lang.String r14 = r0.replaceFirst(r14, r3)     // Catch: java.lang.Throwable -> L8d
            r0 = 0
            byte[] r14 = android.util.Base64.decode(r14, r0)     // Catch: java.lang.Throwable -> L8d
            r2.write(r14)     // Catch: java.lang.Throwable -> L8d
            r2.flush()     // Catch: java.lang.Throwable -> L8d
            r2.close()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "下载成功"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r14.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "已保存至手机根目录下的Download文件夹下的"
            r14.append(r0)     // Catch: java.lang.Throwable -> L8d
            r14.append(r12)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r12 = ",是否打开文件？"
            r14.append(r12)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r14.toString()     // Catch: java.lang.Throwable -> L8d
            com.bxkj.base.v2.h5.c r6 = new com.bxkj.base.v2.h5.c     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r11, r13, r1)     // Catch: java.lang.Throwable -> L8d
            com.bxkj.base.v2.h5.d r7 = new com.bxkj.base.v2.h5.d     // Catch: java.lang.Throwable -> L8d
            r7.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = "稍后再说"
            java.lang.String r9 = "现在打开"
            r3 = r11
            com.bxkj.base.v2.common.ext.ContextExtKt.g(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8a
            r11 = 0
            kotlin.io.b.a(r2, r11)     // Catch: java.lang.Exception -> L98
            goto L9d
        L8a:
            r0 = move-exception
        L8b:
            r11 = r0
            goto L90
        L8d:
            r0 = move-exception
            r3 = r11
            goto L8b
        L90:
            throw r11     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            r12 = r0
            kotlin.io.b.a(r2, r11)     // Catch: java.lang.Exception -> L98
            throw r12     // Catch: java.lang.Exception -> L98
        L97:
            r3 = r11
        L98:
            java.lang.String r11 = "下载失败"
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r3, r11)
        L9d:
            return
    }

    private static final kotlin.n1 f(androidx.fragment.app.FragmentActivity r1, java.lang.String r2, android.net.Uri r3, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.base.v2.h5.e r4 = com.bxkj.base.v2.h5.e.a
            r4.d(r1, r2, r3)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 g(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void h(androidx.fragment.app.FragmentActivity r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r0 = 0
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r2.<init>()     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "data:"
            r2.append(r3)     // Catch: java.lang.Exception -> L36
            r2.append(r10)     // Catch: java.lang.Exception -> L36
            java.lang.String r10 = ";base64,"
            r2.append(r10)     // Catch: java.lang.Exception -> L36
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Exception -> L36
            r1.<init>(r10)     // Catch: java.lang.Exception -> L36
            java.lang.String r10 = ""
            java.lang.String r10 = r1.replaceFirst(r11, r10)     // Catch: java.lang.Exception -> L36
            r11 = 0
            byte[] r10 = android.util.Base64.decode(r10, r11)     // Catch: java.lang.Exception -> L36
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Exception -> L36
            java.io.File r2 = android.os.Environment.getExternalStoragePublicDirectory(r2)     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L38
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Exception -> L36
            goto L39
        L36:
            goto L65
        L38:
            r2 = r0
        L39:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r3.<init>()     // Catch: java.lang.Exception -> L36
            r3.append(r2)     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "/"
            r3.append(r2)     // Catch: java.lang.Exception -> L36
            r3.append(r9)     // Catch: java.lang.Exception -> L36
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Exception -> L36
            r1.<init>(r9)     // Catch: java.lang.Exception -> L36
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L36
            r9.<init>(r1, r11)     // Catch: java.lang.Exception -> L36
            r9.write(r10)     // Catch: java.lang.Exception -> L36
            r9.flush()     // Catch: java.lang.Exception -> L36
            r9.close()     // Catch: java.lang.Exception -> L36
            java.lang.String r9 = "下载成功"
            r10 = 2
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r8, r9, r11, r10, r0)     // Catch: java.lang.Exception -> L36
            return
        L65:
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r8)
            if (r1 == 0) goto L7a
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.base.v2.h5.e$a r4 = new com.bxkj.base.v2.h5.e$a
            r4.<init>(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
        L7a:
            return
    }

    public final void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r2 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "base64Data"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            r2.e(r3, r4, r5, r6)
            return
        L14:
            r2.h(r3, r4, r5, r6)
            return
    }
}
