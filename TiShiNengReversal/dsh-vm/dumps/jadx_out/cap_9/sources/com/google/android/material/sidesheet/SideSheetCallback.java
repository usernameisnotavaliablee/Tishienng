package com.google.android.material.sidesheet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class SideSheetCallback implements com.google.android.material.sidesheet.SheetCallback {
    public SideSheetCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    void onLayout(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@androidx.annotation.NonNull android.view.View r1, float r2);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@androidx.annotation.NonNull android.view.View r1, int r2);
}
