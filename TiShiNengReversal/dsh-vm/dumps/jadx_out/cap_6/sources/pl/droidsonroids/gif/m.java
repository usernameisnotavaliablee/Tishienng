package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class m extends android.os.Handler {
    static final int b = -1;
    private final java.lang.ref.WeakReference<pl.droidsonroids.gif.e> a;

    m(pl.droidsonroids.gif.e r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // android.os.Handler
    public void handleMessage(@androidx.annotation.NonNull android.os.Message r4) {
            r3 = this;
            java.lang.ref.WeakReference<pl.droidsonroids.gif.e> r0 = r3.a
            java.lang.Object r0 = r0.get()
            pl.droidsonroids.gif.e r0 = (pl.droidsonroids.gif.e) r0
            if (r0 != 0) goto Lb
            goto L2c
        Lb:
            int r1 = r4.what
            r2 = -1
            if (r1 != r2) goto L14
            r0.invalidateSelf()
            return
        L14:
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.a> r0 = r0.h
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            pl.droidsonroids.gif.a r1 = (pl.droidsonroids.gif.a) r1
            int r2 = r4.what
            r1.a(r2)
            goto L1a
        L2c:
            return
    }
}
