package com.devlin_n.floatWindowPermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class h {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.app.Activity a(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto Lb
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        Lb:
            boolean r1 = r2 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            android.app.Activity r2 = a(r2)
            return r2
        L1a:
            return r0
    }
}
