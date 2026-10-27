package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class WindowIdApi14 implements androidx.transition.WindowIdImpl {
    private final android.os.IBinder mToken;

    WindowIdApi14(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.mToken = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.transition.WindowIdApi14
            if (r0 == 0) goto L12
            androidx.transition.WindowIdApi14 r2 = (androidx.transition.WindowIdApi14) r2
            android.os.IBinder r2 = r2.mToken
            android.os.IBinder r0 = r1.mToken
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.IBinder r0 = r1.mToken
            int r0 = r0.hashCode()
            return r0
    }
}
