package defpackage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCustomWebChromeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomWebChromeClient.kt\nCustomWebChromeClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,90:1\n37#2,2:91\n*S KotlinDebug\n*F\n+ 1 CustomWebChromeClient.kt\nCustomWebChromeClient\n*L\n85#1:91,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class a extends cn.bluemobi.dylan.smartwebview.SmartWebView.b {

    /* renamed from: a, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.Fragment f1a;

    @org.jetbrains.annotations.Nullable
    private android.webkit.ValueCallback<android.net.Uri> b;

    @org.jetbrains.annotations.Nullable
    private android.webkit.ValueCallback<android.net.Uri[]> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: a$a, reason: collision with other inner class name */
    public static final class C0000a implements t.b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ defpackage.a f2a;

        C0000a(defpackage.a r1) {
                r0 = this;
                r0.f2a = r1
                r0.<init>()
                return
        }

        public void a(int r4, android.content.Intent r5) {
                r3 = this;
                a r0 = r3.f2a
                android.webkit.ValueCallback r0 = defpackage.a.a(r0)
                if (r0 != 0) goto L11
                a r0 = r3.f2a
                android.webkit.ValueCallback r0 = defpackage.a.b(r0)
                if (r0 != 0) goto L11
                goto L45
            L11:
                r0 = 0
                if (r5 == 0) goto L1d
                r1 = -1
                if (r4 == r1) goto L18
                goto L1d
            L18:
                android.net.Uri r1 = r5.getData()
                goto L1e
            L1d:
                r1 = r0
            L1e:
                a r2 = r3.f2a
                android.webkit.ValueCallback r2 = defpackage.a.b(r2)
                if (r2 == 0) goto L2c
                a r0 = r3.f2a
                defpackage.a.c(r0, r4, r5)
                return
            L2c:
                a r4 = r3.f2a
                android.webkit.ValueCallback r4 = defpackage.a.a(r4)
                if (r4 == 0) goto L45
                a r4 = r3.f2a
                android.webkit.ValueCallback r4 = defpackage.a.a(r4)
                kotlin.jvm.internal.g0.m(r4)
                r4.onReceiveValue(r1)
                a r4 = r3.f2a
                defpackage.a.d(r4, r0)
            L45:
                return
        }
    }

    public a(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.f1a = r2
            return
    }

    public static final /* synthetic */ android.webkit.ValueCallback a(defpackage.a r0) {
            android.webkit.ValueCallback<android.net.Uri> r0 = r0.b
            return r0
    }

    public static final /* synthetic */ android.webkit.ValueCallback b(defpackage.a r0) {
            android.webkit.ValueCallback<android.net.Uri[]> r0 = r0.c
            return r0
    }

    public static final /* synthetic */ void c(defpackage.a r0, int r1, android.content.Intent r2) {
            r0.e(r1, r2)
            return
    }

    public static final /* synthetic */ void d(defpackage.a r0, android.webkit.ValueCallback r1) {
            r0.b = r1
            return
    }

    private final void e(int r7, android.content.Intent r8) {
            r6 = this;
            android.webkit.ValueCallback<android.net.Uri[]> r0 = r6.c
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = -1
            r2 = 0
            if (r7 != r1) goto L53
            if (r8 == 0) goto L53
            java.lang.String r7 = r8.getDataString()
            android.content.ClipData r8 = r8.getClipData()
            if (r8 == 0) goto L44
            int r1 = r8.getItemCount()
            if (r1 <= 0) goto L44
            int r1 = r0.size()
            int r3 = r8.getItemCount()
            if (r1 < r3) goto L44
            int r1 = r8.getItemCount()
            r3 = 0
        L2f:
            if (r3 >= r1) goto L44
            android.content.ClipData$Item r4 = r8.getItemAt(r3)
            android.net.Uri r4 = r4.getUri()
            java.lang.String r5 = "getUri(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            r0.set(r3, r4)
            int r3 = r3 + 1
            goto L2f
        L44:
            if (r7 == 0) goto L53
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r8 = 1
            android.net.Uri[] r8 = new android.net.Uri[r8]
            r8[r2] = r7
            java.util.List r0 = kotlin.collections.n.nz(r8)
        L53:
            android.webkit.ValueCallback<android.net.Uri[]> r7 = r6.c
            if (r7 == 0) goto L62
            java.util.Collection r0 = (java.util.Collection) r0
            android.net.Uri[] r8 = new android.net.Uri[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            r7.onReceiveValue(r8)
        L62:
            r7 = 0
            r6.c = r7
            return
    }

    private final void f() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.GET_CONTENT"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "image/*"
            r0.setType(r1)
            t.b r1 = new t.b
            androidx.fragment.app.Fragment r2 = r3.f1a
            r1.<init>(r2)
            t.b r0 = r1.startActivityForResult(r0)
            a$a r1 = new a$a
            r1.<init>(r3)
            r0.c(r1)
            return
    }

    public boolean onShowFileChooser(@org.jetbrains.annotations.Nullable android.webkit.WebView r1, @org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri[]> r2, @org.jetbrains.annotations.Nullable android.webkit.WebChromeClient.FileChooserParams r3) {
            r0 = this;
            java.lang.String r1 = "filePathCallback"
            kotlin.jvm.internal.g0.p(r2, r1)
            r0.c = r2
            r0.f()
            r1 = 1
            return r1
    }

    public final void openFileChooser(@org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri> r2) {
            r1 = this;
            java.lang.String r0 = "valueCallback"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            r1.f()
            return
    }

    public final void openFileChooser(@org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri> r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = "valueCallback"
            kotlin.jvm.internal.g0.p(r1, r2)
            r0.b = r1
            r0.f()
            return
    }

    public final void openFileChooser(@org.jetbrains.annotations.NotNull android.webkit.ValueCallback<android.net.Uri> r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r0 = this;
            java.lang.String r2 = "valueCallback"
            kotlin.jvm.internal.g0.p(r1, r2)
            r0.b = r1
            r0.f()
            return
    }
}
