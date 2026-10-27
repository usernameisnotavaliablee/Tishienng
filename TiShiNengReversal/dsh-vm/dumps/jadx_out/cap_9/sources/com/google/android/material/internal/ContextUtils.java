package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ContextUtils {
    public ContextUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.app.Activity getActivity(android.content.Context r1) {
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L12
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lb
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        Lb:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        L12:
            r1 = 0
            return r1
    }
}
