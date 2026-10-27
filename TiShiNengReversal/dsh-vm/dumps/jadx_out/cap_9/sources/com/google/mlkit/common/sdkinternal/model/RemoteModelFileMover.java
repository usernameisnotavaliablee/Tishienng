package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface RemoteModelFileMover {
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    java.io.File getModelFileDestination() throws com.google.mlkit.common.MlKitException;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    java.io.File moveAllFilesFromPrivateTempToPrivateDestination(@androidx.annotation.NonNull java.io.File r1) throws com.google.mlkit.common.MlKitException;
}
