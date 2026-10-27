package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface HasApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.common.api.internal.ApiKey<O> getApiKey();
}
