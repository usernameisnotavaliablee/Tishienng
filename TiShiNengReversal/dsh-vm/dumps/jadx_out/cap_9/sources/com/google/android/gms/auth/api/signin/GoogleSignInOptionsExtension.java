package com.google.android.gms.auth.api.signin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface GoogleSignInOptionsExtension {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int FITNESS = 3;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int GAMES = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    int getExtensionType();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    android.os.Bundle toBundle();
}
