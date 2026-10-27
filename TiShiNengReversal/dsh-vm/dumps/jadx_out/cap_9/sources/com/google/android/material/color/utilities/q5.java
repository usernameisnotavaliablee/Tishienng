package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final /* synthetic */ class q5 implements java.util.function.Function {
    public final /* synthetic */ com.google.android.material.color.utilities.MaterialDynamicColors a;

    public /* synthetic */ q5(com.google.android.material.color.utilities.MaterialDynamicColors r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors r0 = r1.a
            com.google.android.material.color.utilities.DynamicScheme r2 = (com.google.android.material.color.utilities.DynamicScheme) r2
            com.google.android.material.color.utilities.DynamicColor r2 = r0.highestSurface(r2)
            return r2
    }
}
