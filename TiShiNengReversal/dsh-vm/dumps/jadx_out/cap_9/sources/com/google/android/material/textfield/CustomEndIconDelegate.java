package com.google.android.material.textfield;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class CustomEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    CustomEndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            r1 = 0
            r0.setEndIconOnLongClickListener(r1)
            return
    }
}
