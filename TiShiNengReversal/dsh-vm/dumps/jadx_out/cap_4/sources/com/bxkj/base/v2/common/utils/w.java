package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nImageSelectUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSelectUtils.kt\ncom/bxkj/base/v2/common/utils/ImageSelectUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class w {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.utils.w a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nImageSelectUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSelectUtils.kt\ncom/bxkj/base/v2/common/utils/ImageSelectUtils$camera$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
    public static final class a implements t.b.a {
        final /* synthetic */ java.io.File a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> c;

        a(java.io.File r1, android.content.Context r2, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r3) {
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
                java.io.File r4 = r2.a
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L7
                goto L8
            L7:
                r4 = r1
            L8:
                if (r4 == 0) goto L1c
                com.bxkj.base.v2.common.utils.w r3 = com.bxkj.base.v2.common.utils.w.a
                boolean r0 = com.bxkj.base.v2.common.utils.w.g(r3)
                if (r0 == 0) goto L13
                r1 = r4
            L13:
                if (r1 == 0) goto L1c
                android.content.Context r4 = r2.b
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r0 = r2.c
                com.bxkj.base.v2.common.utils.w.e(r3, r4, r1, r0)
            L1c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements top.zibin.luban.d {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> a;

        b(kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
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

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.getClass()
                return
        }

        public void onStart() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nImageSelectUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSelectUtils.kt\ncom/bxkj/base/v2/common/utils/ImageSelectUtils$gallery$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
    public static final class c implements t.b.a {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> b;

        c(android.content.Context r1, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r4, android.content.Intent r5) {
                r3 = this;
                if (r5 == 0) goto L23
                r0 = -1
                if (r4 != r0) goto L6
                goto L7
            L6:
                r5 = 0
            L7:
                if (r5 == 0) goto L23
                android.net.Uri r4 = r5.getData()
                if (r4 == 0) goto L23
                android.content.Context r5 = r3.a
                kotlin.jvm.functions.Function1<java.io.File, kotlin.n1> r0 = r3.b
                com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
                java.lang.String r4 = com.bxkj.base.v2.common.utils.w.f(r1, r4, r5)
                if (r4 == 0) goto L23
                java.io.File r2 = new java.io.File
                r2.<init>(r4)
                com.bxkj.base.v2.common.utils.w.e(r1, r5, r2, r0)
            L23:
                return
        }
    }

    static {
            com.bxkj.base.v2.common.utils.w r0 = new com.bxkj.base.v2.common.utils.w
            r0.<init>()
            com.bxkj.base.v2.common.utils.w.a = r0
            return
    }

    private w() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            s(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void b(kotlin.jvm.internal.Ref.ObjectRef r0, android.view.View r1) {
            r(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.n1 c(androidx.fragment.app.FragmentActivity r0, kotlin.jvm.functions.Function1 r1) {
            kotlin.n1 r0 = t(r0, r1)
            return r0
    }

    public static /* synthetic */ void d(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            u(r0, r1, r2, r3)
            return
    }

    public static final /* synthetic */ void e(com.bxkj.base.v2.common.utils.w r0, android.content.Context r1, java.io.File r2, kotlin.jvm.functions.Function1 r3) {
            r0.k(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.String f(com.bxkj.base.v2.common.utils.w r0, android.net.Uri r1, android.content.Context r2) {
            java.lang.String r0 = r0.o(r1, r2)
            return r0
    }

    public static final /* synthetic */ boolean g(com.bxkj.base.v2.common.utils.w r0) {
            boolean r0 = r0.p()
            return r0
    }

    private final void h(android.content.Context r6, t.b r7, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r8) {
            r5 = this;
            boolean r0 = r5.p()
            if (r0 == 0) goto La0
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
            goto L7b
        L72:
            java.lang.String r1 = "com.bxkj.student.provider"
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r6, r1, r0)
            kotlin.jvm.internal.g0.m(r1)
        L7b:
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
            com.bxkj.base.v2.common.utils.w$a r1 = new com.bxkj.base.v2.common.utils.w$a
            r1.<init>(r0, r6, r8)
            r7.c(r1)
            return
        La0:
            java.lang.String r7 = "未找到存储卡，无法拍照！"
            r8 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r8)
            r6.show()
            return
    }

    private final void k(android.content.Context r1, java.io.File r2, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r3) {
            r0 = this;
            top.zibin.luban.c$b r1 = top.zibin.luban.c.k(r1)
            top.zibin.luban.c$b r1 = r1.f(r2)
            com.bxkj.base.v2.common.utils.w$b r2 = new com.bxkj.base.v2.common.utils.w$b
            r2.<init>(r3)
            top.zibin.luban.c$b r1 = r1.h(r2)
            r1.e()
            return
    }

    private final void l(android.content.Context r4, t.b r5, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r6) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.PICK"
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r0.<init>(r1, r2)
            t.b r5 = r5.startActivityForResult(r0)
            com.bxkj.base.v2.common.utils.w$c r0 = new com.bxkj.base.v2.common.utils.w$c
            r0.<init>(r4, r6)
            r5.c(r0)
            return
    }

    private final java.lang.String o(android.net.Uri r7, android.content.Context r8) {
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

    private final boolean p() {
            r2 = this;
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    private static final void r(kotlin.jvm.internal.Ref.ObjectRef r0, android.view.View r1) {
            java.lang.Object r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
    }

    private static final void s(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            java.lang.Object r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            com.bxkj.base.v2.common.utils.s r0 = new com.bxkj.base.v2.common.utils.s
            r0.<init>(r1, r2)
            java.lang.String r2 = "拍照"
            com.bxkj.base.v2.common.ext.t.p(r1, r2, r0)
            return
    }

    private static final kotlin.n1 t(androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2) {
            com.bxkj.base.v2.common.utils.w r0 = com.bxkj.base.v2.common.utils.w.a
            r0.j(r1, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final void u(kotlin.jvm.internal.Ref.ObjectRef r0, androidx.fragment.app.FragmentActivity r1, kotlin.jvm.functions.Function1 r2, android.view.View r3) {
            java.lang.Object r0 = r0.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            com.bxkj.base.v2.common.utils.w r0 = com.bxkj.base.v2.common.utils.w.a
            r0.n(r1, r2)
            return
    }

    public final void i(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            java.lang.String r1 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            t.b r1 = new t.b
            r1.<init>(r3)
            r2.h(r0, r1, r4)
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "fragmentActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r3, r0)
            t.b r0 = new t.b
            r0.<init>(r2)
            r1.h(r2, r0, r3)
            return
    }

    public final void m(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            java.lang.String r1 = "requireActivity(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            t.b r1 = new t.b
            r1.<init>(r3)
            r2.l(r0, r1, r4)
            return
    }

    public final void n(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "fragmentActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r3, r0)
            t.b r0 = new t.b
            r0.<init>(r2)
            r1.l(r2, r0, r3)
            return
    }

    public final void q(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.File, kotlin.n1> r10) {
            r8 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r10, r0)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r9)
            int r1 = com.bxkj.base.R.layout.pub_dialog_add_picture
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
            int r5 = com.bxkj.base.R.id.tv_cancel
            android.view.View r5 = r0.findViewById(r5)
            kotlin.jvm.internal.g0.n(r5, r3)
            android.widget.TextView r5 = (android.widget.TextView) r5
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            android.app.Dialog r6 = new android.app.Dialog
            int r7 = cn.bluemobi.dylan.base.R.style.custom_dialog
            r6.<init>(r9, r7)
            r3.element = r6
            r6.setContentView(r0)
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L58
            r6 = 80
            r0.setGravity(r6)
        L58:
            android.view.WindowManager r0 = r9.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            java.lang.Object r6 = r3.element
            android.app.Dialog r6 = (android.app.Dialog) r6
            android.view.Window r6 = r6.getWindow()
            if (r6 == 0) goto L6e
            android.view.WindowManager$LayoutParams r2 = r6.getAttributes()
        L6e:
            if (r2 == 0) goto L76
            int r0 = r0.getWidth()
            r2.width = r0
        L76:
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L83
            r0.setAttributes(r2)
        L83:
            java.lang.Object r0 = r3.element
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            com.bxkj.base.v2.common.utils.t r0 = new com.bxkj.base.v2.common.utils.t
            r0.<init>(r3)
            r5.setOnClickListener(r0)
            com.bxkj.base.v2.common.utils.u r0 = new com.bxkj.base.v2.common.utils.u
            r0.<init>(r3, r9, r10)
            r1.setOnClickListener(r0)
            com.bxkj.base.v2.common.utils.v r0 = new com.bxkj.base.v2.common.utils.v
            r0.<init>(r3, r9, r10)
            r4.setOnClickListener(r0)
            return
    }
}
