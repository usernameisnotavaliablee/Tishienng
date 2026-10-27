package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class UnusedAppRestrictionsBackportCallback {
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback mCallback;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public UnusedAppRestrictionsBackportCallback(@androidx.annotation.NonNull androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            return
    }

    public void onResult(boolean r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r0 = r1.mCallback
            r0.onIsPermissionRevocationEnabledForAppResult(r2, r3)
            return
    }
}
