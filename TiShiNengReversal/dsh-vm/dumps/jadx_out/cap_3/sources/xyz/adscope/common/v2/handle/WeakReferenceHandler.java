package xyz.adscope.common.v2.handle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class WeakReferenceHandler extends android.os.Handler {
    private final java.lang.ref.WeakReference<android.content.Context> weakContext;

    public WeakReferenceHandler(android.content.Context r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r0.<init>(r2)
            r1.weakContext = r0
            return
    }

    public android.content.Context getContext() {
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.weakContext
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L13
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.weakContext
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // android.os.Handler
    public void handleMessage(@androidx.annotation.NonNull android.os.Message r2) {
            r1 = this;
            super.handleMessage(r2)
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.weakContext
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Le
            r1.scopeHandleMessage(r2)
        Le:
            return
    }

    public abstract void scopeHandleMessage(android.os.Message r1);
}
