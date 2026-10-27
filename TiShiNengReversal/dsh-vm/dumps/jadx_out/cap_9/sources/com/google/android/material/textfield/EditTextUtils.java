package com.google.android.material.textfield;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class EditTextUtils {
    private EditTextUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isEditable(@androidx.annotation.NonNull android.widget.EditText r0) {
            int r0 = r0.getInputType()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
