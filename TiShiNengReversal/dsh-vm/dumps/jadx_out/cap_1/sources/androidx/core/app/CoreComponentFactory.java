package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 28)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface CompatWrapped {
        java.lang.Object getWrapper();
    }

    public CoreComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> T checkCompatWrapper(T r1) {
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.CompatWrapped
            if (r0 == 0) goto Le
            r0 = r1
            androidx.core.app.CoreComponentFactory$CompatWrapped r0 = (androidx.core.app.CoreComponentFactory.CompatWrapped) r0
            java.lang.Object r0 = r0.getWrapper()
            if (r0 == 0) goto Le
            return r0
        Le:
            return r1
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.NonNull
    public android.app.Activity instantiateActivity(@androidx.annotation.NonNull java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Activity r1 = super.instantiateActivity(r1, r2, r3)
            java.lang.Object r1 = checkCompatWrapper(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.NonNull
    public android.app.Application instantiateApplication(@androidx.annotation.NonNull java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Application r1 = super.instantiateApplication(r1, r2)
            java.lang.Object r1 = checkCompatWrapper(r1)
            android.app.Application r1 = (android.app.Application) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.NonNull
    public android.content.ContentProvider instantiateProvider(@androidx.annotation.NonNull java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.String r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.ContentProvider r1 = super.instantiateProvider(r1, r2)
            java.lang.Object r1 = checkCompatWrapper(r1)
            android.content.ContentProvider r1 = (android.content.ContentProvider) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.NonNull
    public android.content.BroadcastReceiver instantiateReceiver(@androidx.annotation.NonNull java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.content.BroadcastReceiver r1 = super.instantiateReceiver(r1, r2, r3)
            java.lang.Object r1 = checkCompatWrapper(r1)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            return r1
    }

    @Override // android.app.AppComponentFactory
    @androidx.annotation.NonNull
    public android.app.Service instantiateService(@androidx.annotation.NonNull java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable android.content.Intent r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r0 = this;
            android.app.Service r1 = super.instantiateService(r1, r2, r3)
            java.lang.Object r1 = checkCompatWrapper(r1)
            android.app.Service r1 = (android.app.Service) r1
            return r1
    }
}
