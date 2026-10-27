package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub mBinder;


    public UnusedAppRestrictionsBackportService() {
            r1 = this;
            r1.<init>()
            androidx.core.content.UnusedAppRestrictionsBackportService$1 r0 = new androidx.core.content.UnusedAppRestrictionsBackportService$1
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    protected abstract void isPermissionRevocationEnabled(@androidx.annotation.NonNull androidx.core.content.UnusedAppRestrictionsBackportCallback r1);

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(@androidx.annotation.Nullable android.content.Intent r1) {
            r0 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub r1 = r0.mBinder
            return r1
    }
}
