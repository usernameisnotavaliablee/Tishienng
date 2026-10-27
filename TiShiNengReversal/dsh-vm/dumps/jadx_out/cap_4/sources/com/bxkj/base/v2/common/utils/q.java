package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileSelectUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSelectUtil.kt\ncom/bxkj/base/v2/common/utils/FileSelectUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class q {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.q a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements t.b.a {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.io.File b;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> c;

        a(android.content.Context r1, java.io.File r2, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r3, android.content.Intent r4) {
                r2 = this;
                r4 = -1
                if (r3 != r4) goto L15
                com.bxkj.base.v2.common.utils.q r3 = com.bxkj.base.v2.common.utils.q.a
                boolean r4 = com.bxkj.base.v2.common.utils.q.j(r3)
                if (r4 == 0) goto L15
                android.content.Context r4 = r2.a
                java.io.File r0 = r2.b
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r1 = r2.c
                com.bxkj.base.v2.common.utils.q.h(r3, r4, r0, r1)
                return
            L15:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.c
                r4 = 0
                r3.invoke(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements top.zibin.luban.d {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> a;
        final /* synthetic */ java.io.File b;

        b(kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r1, java.io.File r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void a(java.io.File r4) {
                r3 = this;
                java.lang.String r0 = "file"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = r4.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "压缩文件路径"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r0, r1)
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r0 = r3.a
                r0.invoke(r4)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r0 = r2.a
                java.io.File r1 = r2.b
                r0.invoke(r1)
                r3.getClass()
                return
        }

        public void onStart() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements t.b.a {
        final /* synthetic */ androidx.fragment.app.FragmentActivity a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> b;

        c(androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L40
                if (r4 == 0) goto L40
                android.net.Uri r3 = r4.getData()
                if (r3 == 0) goto L3a
                com.bxkj.base.v2.common.utils.q r4 = com.bxkj.base.v2.common.utils.q.a
                androidx.fragment.app.FragmentActivity r0 = r2.a
                java.lang.String r3 = com.bxkj.base.v2.common.utils.q.i(r4, r3, r0)
                if (r3 == 0) goto L34
                int r4 = r3.length()
                if (r4 != 0) goto L1d
                goto L34
            L1d:
                java.io.File r4 = new java.io.File
                r4.<init>(r3)
                boolean r3 = r4.exists()
                if (r3 == 0) goto L2e
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r4)
                return
            L2e:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
            L34:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
            L3a:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
            L40:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d implements t.b.a {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> b;

        d(android.content.Context r1, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L42
                if (r4 == 0) goto L42
                android.net.Uri r3 = r4.getData()
                if (r3 == 0) goto L3c
                com.bxkj.base.v2.common.utils.q r4 = com.bxkj.base.v2.common.utils.q.a
                android.content.Context r0 = r2.a
                java.lang.String r3 = com.bxkj.base.v2.common.utils.q.i(r4, r3, r0)
                if (r3 == 0) goto L36
                int r0 = r3.length()
                if (r0 != 0) goto L1d
                goto L36
            L1d:
                java.io.File r0 = new java.io.File
                r0.<init>(r3)
                boolean r3 = r0.exists()
                if (r3 == 0) goto L30
                android.content.Context r3 = r2.a
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r1 = r2.b
                com.bxkj.base.v2.common.utils.q.h(r4, r3, r0, r1)
                return
            L30:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
            L36:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
            L3c:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
            L42:
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r3 = r2.b
                r3.invoke(r1)
                return
        }
    }

    static {
            com.bxkj.base.v2.common.utils.q r0 = new com.bxkj.base.v2.common.utils.q
            r0.<init>()
            com.bxkj.base.v2.common.utils.q.a = r0
            return
    }

    private q() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(kotlin.jvm.functions.Function1 r0, kotlin.jvm.internal.Ref.ObjectRef r1, android.view.View r2) {
            v(r0, r1, r2)
            return
    }

    public static /* synthetic */ void b(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            x(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlin.n1 c(androidx.fragment.app.FragmentActivity r0, kotlin.jvm.functions.Function1 r1) {
            kotlin.n1 r0 = m(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d(kotlin.jvm.functions.Function1 r0) {
            kotlin.n1 r0 = n(r0)
            return r0
    }

    public static /* synthetic */ boolean e(kotlin.jvm.functions.Function1 r0, android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = w(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void f(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            z(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void g(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            y(r0, r1, r2, r3)
            return
    }

    public static final /* synthetic */ void h(com.bxkj.base.v2.common.utils.q r0, android.content.Context r1, java.io.File r2, kotlin.jvm.functions.Function1 r3) {
            r0.o(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.String i(com.bxkj.base.v2.common.utils.q r0, android.net.Uri r1, android.content.Context r2) {
            java.lang.String r0 = r0.s(r1, r2)
            return r0
    }

    public static final /* synthetic */ boolean j(com.bxkj.base.v2.common.utils.q r0) {
            boolean r0 = r0.t()
            return r0
    }

    private final void k(android.content.Context r6, t.b r7, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r8) {
            r5 = this;
            boolean r0 = r5.t()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L24
            java.io.File r0 = r6.getExternalCacheDir()
            if (r0 == 0) goto L1e
            boolean r1 = r0.exists()
            if (r1 != 0) goto L25
        L1e:
            if (r0 == 0) goto L25
            r0.mkdirs()
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 == 0) goto L2d
            boolean r1 = r0.exists()
            if (r1 != 0) goto L3a
        L2d:
            java.io.File r0 = r6.getCacheDir()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L3a
            r0.mkdirs()
        L3a:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "temp"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L4a
            r1.mkdirs()
        L4a:
            java.io.File r0 = new java.io.File
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "_temp_photo.jpg"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 >= r2) goto L72
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            kotlin.jvm.internal.g0.m(r1)
            goto L90
        L72:
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()
            java.lang.String r1 = r1.packageName
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".provider"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r6, r1, r0)
            kotlin.jvm.internal.g0.m(r1)
        L90:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "output"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r2.setAction(r1)
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r2.addCategory(r1)
            r1 = 1
            r2.addFlags(r1)
            t.b r7 = r7.startActivityForResult(r2)
            com.bxkj.base.v2.common.utils.q$a r1 = new com.bxkj.base.v2.common.utils.q$a
            r1.<init>(r6, r0, r8)
            r7.c(r1)
            return
        Lb5:
            java.lang.String r7 = "未找到存储卡，无法拍照！"
            r8 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r8)
            r6.show()
            return
    }

    private static final kotlin.n1 m(androidx.fragment.app.FragmentActivity r2, kotlin.jvm.functions.Function1 r3) {
            com.bxkj.base.v2.common.utils.q r0 = com.bxkj.base.v2.common.utils.q.a
            t.b r1 = new t.b
            r1.<init>(r2)
            r0.k(r2, r1, r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 n(kotlin.jvm.functions.Function1 r1) {
            r0 = 0
            r1.invoke(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void o(android.content.Context r2, java.io.File r3, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r4) {
            r1 = this;
            top.zibin.luban.c$b r2 = top.zibin.luban.c.k(r2)
            top.zibin.luban.c$b r2 = r2.f(r3)
            com.bxkj.base.v2.common.utils.q$b r0 = new com.bxkj.base.v2.common.utils.q$b
            r0.<init>(r4, r3)
            top.zibin.luban.c$b r2 = r2.h(r0)
            r2.e()
            return
    }

    private final void p(androidx.fragment.app.FragmentActivity r3, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r4) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.GET_CONTENT"
            r0.<init>(r1)
            java.lang.String r1 = "*/*"
            r0.setType(r1)
            t.b r1 = new t.b
            r1.<init>(r3)
            t.b r0 = r1.startActivityForResult(r0)
            com.bxkj.base.v2.common.utils.q$c r1 = new com.bxkj.base.v2.common.utils.q$c
            r1.<init>(r3, r4)
            r0.c(r1)
            return
    }

    private final void q(android.content.Context r4, t.b r5, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r6) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.PICK"
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r0.<init>(r1, r2)
            t.b r5 = r5.startActivityForResult(r0)
            com.bxkj.base.v2.common.utils.q$d r0 = new com.bxkj.base.v2.common.utils.q$d
            r0.<init>(r4, r6)
            r5.c(r0)
            return
    }

    private final java.lang.String s(android.net.Uri r7, android.content.Context r8) {
            r6 = this;
            android.content.ContentResolver r0 = r8.getContentResolver()
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 != 0) goto L11
            r7 = 0
            return r7
        L11:
            java.lang.String r0 = "_display_name"
            int r0 = r7.getColumnIndex(r0)
            java.lang.String r2 = "_size"
            int r2 = r7.getColumnIndex(r2)
            r7.moveToFirst()
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            long r2 = r7.getLong(r2)
            java.lang.String.valueOf(r2)
            java.io.File r2 = new java.io.File
            java.io.File r3 = r8.getFilesDir()
            r2.<init>(r3, r0)
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.io.InputStream r8 = r8.openInputStream(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            kotlin.jvm.internal.g0.m(r8)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            int r1 = r8.available()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r3 = 1048576(0x100000, float:1.469368E-39)
            int r1 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
        L55:
            int r3 = r8.read(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r4 = -1
            if (r3 == r4) goto L67
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            goto L55
        L61:
            r0 = move-exception
            r8 = r0
            goto L87
        L64:
            r0 = move-exception
            r8 = r0
            goto L7a
        L67:
            r2.length()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r8.close()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r0.close()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.getPath()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r2.length()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
        L76:
            r7.close()
            goto L82
        L7a:
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L61
            kotlin.jvm.internal.g0.m(r8)     // Catch: java.lang.Throwable -> L61
            goto L76
        L82:
            java.lang.String r7 = r2.getPath()
            return r7
        L87:
            r7.close()
            throw r8
    }

    private final boolean t() {
            r2 = this;
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    private static final void v(kotlin.jvm.functions.Function1 r0, kotlin.jvm.internal.Ref.ObjectRef r1, android.view.View r2) {
            r2 = 0
            r0.invoke(r2)
            java.lang.Object r0 = r1.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
    }

    private static final boolean w(kotlin.jvm.functions.Function1 r1, android.content.DialogInterface r2, int r3, android.view.KeyEvent r4) {
            r0 = 4
            if (r3 != r0) goto L12
            int r3 = r4.getAction()
            r4 = 1
            if (r3 != r4) goto L12
            r3 = 0
            r1.invoke(r3)
            r2.dismiss()
            return r4
        L12:
            r1 = 0
            return r1
    }

    private static final void x(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            java.lang.Object r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            com.bxkj.base.v2.common.utils.q r0 = com.bxkj.base.v2.common.utils.q.a
            r0.l(r1, r2)
            return
    }

    private static final void y(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            java.lang.Object r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            com.bxkj.base.v2.common.utils.q r0 = com.bxkj.base.v2.common.utils.q.a
            r0.r(r1, r2)
            return
    }

    private static final void z(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            java.lang.Object r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            com.bxkj.base.v2.common.utils.q r0 = com.bxkj.base.v2.common.utils.q.a
            r0.p(r1, r2)
            return
    }

    public final void l(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r4) {
            r2 = this;
            java.lang.String r0 = "fragmentActivity"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.base.v2.common.utils.o r0 = new com.bxkj.base.v2.common.utils.o
            r0.<init>(r3, r4)
            com.bxkj.base.v2.common.utils.p r1 = new com.bxkj.base.v2.common.utils.p
            r1.<init>(r4)
            java.lang.String r4 = "拍照"
            com.bxkj.base.v2.common.ext.t.q(r3, r4, r0, r1)
            return
    }

    public final void r(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "fragmentActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r3, r0)
            t.b r0 = new t.b
            r0.<init>(r2)
            r1.q(r2, r0, r3)
            return
    }

    public final void u(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r11) {
            r9 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r11, r0)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r10)
            int r1 = com.bxkj.base.R.layout.pub_dialog_add_file
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.bxkj.base.R.id.tv_camera
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.TextView"
            kotlin.jvm.internal.g0.n(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r4 = com.bxkj.base.R.id.tv_gallery
            android.view.View r4 = r0.findViewById(r4)
            kotlin.jvm.internal.g0.n(r4, r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = com.bxkj.base.R.id.tv_file
            android.view.View r5 = r0.findViewById(r5)
            kotlin.jvm.internal.g0.n(r5, r3)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r6 = com.bxkj.base.R.id.tv_cancel
            android.view.View r6 = r0.findViewById(r6)
            kotlin.jvm.internal.g0.n(r6, r3)
            android.widget.TextView r6 = (android.widget.TextView) r6
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            android.app.Dialog r7 = new android.app.Dialog
            int r8 = cn.bluemobi.dylan.base.R.style.custom_dialog
            r7.<init>(r10, r8)
            r3.element = r7
            r7.setContentView(r0)
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L63
            r7 = 80
            r0.setGravity(r7)
        L63:
            android.view.WindowManager r0 = r10.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            java.lang.Object r7 = r3.element
            android.app.Dialog r7 = (android.app.Dialog) r7
            android.view.Window r7 = r7.getWindow()
            if (r7 == 0) goto L79
            android.view.WindowManager$LayoutParams r2 = r7.getAttributes()
        L79:
            if (r2 == 0) goto L81
            int r0 = r0.getWidth()
            r2.width = r0
        L81:
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L8e
            r0.setAttributes(r2)
        L8e:
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r2 = 0
            r0.setCanceledOnTouchOutside(r2)
            com.bxkj.base.v2.common.utils.j r0 = new com.bxkj.base.v2.common.utils.j
            r0.<init>(r11, r3)
            r6.setOnClickListener(r0)
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            com.bxkj.base.v2.common.utils.k r2 = new com.bxkj.base.v2.common.utils.k
            r2.<init>(r11)
            r0.setOnKeyListener(r2)
            com.bxkj.base.v2.common.utils.l r0 = new com.bxkj.base.v2.common.utils.l
            r0.<init>(r3, r10, r11)
            r1.setOnClickListener(r0)
            com.bxkj.base.v2.common.utils.m r0 = new com.bxkj.base.v2.common.utils.m
            r0.<init>(r3, r10, r11)
            r4.setOnClickListener(r0)
            com.bxkj.base.v2.common.utils.n r0 = new com.bxkj.base.v2.common.utils.n
            r0.<init>(r3, r10, r11)
            r5.setOnClickListener(r0)
            return
    }
}
