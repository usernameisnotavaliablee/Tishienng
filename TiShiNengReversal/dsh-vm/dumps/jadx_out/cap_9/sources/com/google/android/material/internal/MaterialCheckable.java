package com.google.android.material.internal;

import com.google.android.material.internal.MaterialCheckable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface MaterialCheckable<T extends com.google.android.material.internal.MaterialCheckable<T>> extends android.widget.Checkable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C r1, boolean r2);
    }

    @androidx.annotation.IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@androidx.annotation.Nullable com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<T> r1);
}
