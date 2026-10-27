package com.bxkj.base.v2.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.h5.a a = null;

    static {
            com.bxkj.base.v2.h5.a r0 = new com.bxkj.base.v2.h5.a
            r0.<init>()
            com.bxkj.base.v2.h5.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7) {
            r3 = this;
            java.lang.String r0 = "下载服务不可用"
            java.lang.String r1 = "mActivity"
            kotlin.jvm.internal.g0.p(r4, r1)
            android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request     // Catch: java.lang.Exception -> L3f
            android.net.Uri r2 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L3f
            r1.<init>(r2)     // Catch: java.lang.Exception -> L3f
            r2 = 1
            r1.setNotificationVisibility(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = android.webkit.URLUtil.guessFileName(r5, r6, r7)     // Catch: java.lang.Exception -> L3f
            r1.setTitle(r5)     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = "正在下载..."
            r1.setDescription(r6)     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Exception -> L3f
            r1.setDestinationInExternalPublicDir(r6, r5)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = "download"
            java.lang.Object r5 = r4.getSystemService(r5)     // Catch: java.lang.Exception -> L3f
            android.app.DownloadManager r5 = (android.app.DownloadManager) r5     // Catch: java.lang.Exception -> L3f
            if (r5 == 0) goto L3b
            r5.enqueue(r1)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = "开始下载"
            r6 = 2
            r7 = 0
            r1 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r4, r5, r1, r6, r7)     // Catch: java.lang.Exception -> L3f
            return
        L3b:
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r4, r0)     // Catch: java.lang.Exception -> L3f
            return
        L3f:
            com.bxkj.base.v2.common.ext.ContextExtKt.q(r4, r0)
            return
    }
}
