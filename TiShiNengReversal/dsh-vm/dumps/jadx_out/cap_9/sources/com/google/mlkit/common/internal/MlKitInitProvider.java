package com.google.mlkit.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MlKitInitProvider extends android.content.ContentProvider {
    public MlKitInitProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.pm.ProviderInfo r4) {
            r2 = this;
            java.lang.String r0 = r4.authority
            java.lang.String r1 = "com.google.mlkit.common.mlkitinitprovider"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            java.lang.String r1 = "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            super.attachInfo(r3, r4)
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public final java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public final android.net.Uri insert(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext.zza(r0)
            return r1
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.Nullable
    public final android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable java.lang.String[] r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4, @androidx.annotation.Nullable java.lang.String r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public final int update(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.content.ContentValues r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
