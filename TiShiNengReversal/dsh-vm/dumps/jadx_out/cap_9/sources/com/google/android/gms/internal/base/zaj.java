package com.google.android.gms.internal.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaj extends android.graphics.drawable.Drawable.ConstantState {
    int zaa;
    int zab;

    zaj(@androidx.annotation.Nullable com.google.android.gms.internal.base.zaj r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Ld
            int r0 = r2.zaa
            r1.zaa = r0
            int r2 = r2.zab
            r1.zab = r2
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            com.google.android.gms.internal.base.zak r0 = new com.google.android.gms.internal.base.zak
            r0.<init>(r1)
            return r0
    }
}
