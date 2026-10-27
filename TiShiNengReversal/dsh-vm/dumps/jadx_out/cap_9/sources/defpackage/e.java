package defpackage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ android.webkit.ValueCallback a;

    public /* synthetic */ e(android.webkit.ValueCallback r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            android.webkit.ValueCallback r0 = r1.a
            java.io.File r2 = (java.io.File) r2
            kotlin.n1 r2 = H5BaseWebChromeClient.d(r0, r2)
            return r2
    }
}
