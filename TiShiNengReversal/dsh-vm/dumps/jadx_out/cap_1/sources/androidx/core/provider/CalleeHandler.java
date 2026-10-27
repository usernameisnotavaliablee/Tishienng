package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CalleeHandler {
    private CalleeHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static android.os.Handler create() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L10
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return r0
        L10:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            return r0
    }
}
