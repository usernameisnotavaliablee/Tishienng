package com.huawei.secure.android.common.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String c = "SafeGetUrl";
    private static final long d = 200;
    private java.lang.String a;
    private android.webkit.WebView b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.secure.android.common.webview.a$a, reason: collision with other inner class name */
    class RunnableC0005a implements java.lang.Runnable {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ com.huawei.secure.android.common.webview.a b;

        RunnableC0005a(com.huawei.secure.android.common.webview.a r1, java.util.concurrent.CountDownLatch r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.huawei.secure.android.common.webview.a r0 = r2.b
                android.webkit.WebView r1 = com.huawei.secure.android.common.webview.a.a(r0)
                java.lang.String r1 = r1.getUrl()
                r0.d(r1)
                java.util.concurrent.CountDownLatch r0 = r2.a
                r0.countDown()
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public a(android.webkit.WebView r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    static /* synthetic */ android.webkit.WebView a(com.huawei.secure.android.common.webview.a r0) {
            android.webkit.WebView r0 = r0.b
            return r0
    }

    public java.lang.String b() {
            r2 = this;
            android.webkit.WebView r0 = r2.b
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            boolean r0 = com.huawei.secure.android.common.util.n0.a()
            if (r0 == 0) goto L14
            android.webkit.WebView r0 = r2.b
            java.lang.String r0 = r0.getUrl()
            return r0
        L14:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            com.huawei.secure.android.common.webview.a$a r1 = new com.huawei.secure.android.common.webview.a$a
            r1.<init>(r2, r0)
            com.huawei.secure.android.common.util.o0.a(r1)
            r0.await()     // Catch: java.lang.InterruptedException -> L26
            goto L2a
        L26:
            r0 = move-exception
            r0.getMessage()
        L2a:
            java.lang.String r0 = r2.a
            return r0
    }

    public android.webkit.WebView c() {
            r1 = this;
            android.webkit.WebView r0 = r1.b
            return r0
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void e(android.webkit.WebView r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
