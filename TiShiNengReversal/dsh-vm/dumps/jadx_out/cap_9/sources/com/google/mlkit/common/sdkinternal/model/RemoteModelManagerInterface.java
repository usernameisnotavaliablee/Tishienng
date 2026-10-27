package com.google.mlkit.common.sdkinternal.model;

import com.google.mlkit.common.model.RemoteModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface RemoteModelManagerInterface<RemoteT extends com.google.mlkit.common.model.RemoteModel> {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> deleteDownloadedModel(@androidx.annotation.NonNull RemoteT r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> download(@androidx.annotation.NonNull RemoteT r1, @androidx.annotation.NonNull com.google.mlkit.common.model.DownloadConditions r2);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.util.Set<RemoteT>> getDownloadedModels();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Boolean> isModelDownloaded(@androidx.annotation.NonNull RemoteT r1);
}
