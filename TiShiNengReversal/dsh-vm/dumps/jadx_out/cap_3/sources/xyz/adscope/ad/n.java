package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class n extends android.os.Handler {
    private final java.lang.ref.WeakReference<android.content.Context> a;

    public n(android.content.Context r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public abstract void a(android.os.Message r1);

    @Override // android.os.Handler
    public void handleMessage(@androidx.annotation.NonNull android.os.Message r2) {
            r1 = this;
            super.handleMessage(r2)
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.a
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Le
            r1.a(r2)
        Le:
            return
    }
}
