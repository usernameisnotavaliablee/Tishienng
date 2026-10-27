package com.orhanobut.logger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i implements com.orhanobut.logger.h {
    static final java.lang.String a = "NO_TAG";

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.orhanobut.logger.h
    public void a(int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            com.orhanobut.logger.n.a(r3)
            if (r2 != 0) goto L7
            java.lang.String r2 = "NO_TAG"
        L7:
            android.util.Log.println(r1, r2, r3)
            return
    }
}
