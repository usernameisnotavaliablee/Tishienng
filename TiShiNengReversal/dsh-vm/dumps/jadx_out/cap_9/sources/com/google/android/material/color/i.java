package com.google.android.material.color;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final /* synthetic */ class i {
    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.material.color.ColorResourcesOverride a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r1 > r0) goto Lf
            r1 = 33
            if (r0 > r1) goto Lf
            com.google.android.material.color.ColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance()
            return r0
        Lf:
            r1 = 34
            if (r0 < r1) goto L18
            com.google.android.material.color.ColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance()
            return r0
        L18:
            r0 = 0
            return r0
    }
}
