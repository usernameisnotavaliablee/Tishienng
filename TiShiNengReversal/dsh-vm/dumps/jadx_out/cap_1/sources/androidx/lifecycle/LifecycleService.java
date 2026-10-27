package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LifecycleService extends android.app.Service implements androidx.lifecycle.LifecycleOwner {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.ServiceLifecycleDispatcher dispatcher;

    public LifecycleService() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = new androidx.lifecycle.ServiceLifecycleDispatcher
            r0.<init>(r1)
            r1.dispatcher = r0
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.dispatcher
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
    }

    @Override // android.app.Service
    @androidx.annotation.CallSuper
    @org.jetbrains.annotations.Nullable
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.lifecycle.ServiceLifecycleDispatcher r2 = r1.dispatcher
            r2.onServicePreSuperOnBind()
            r2 = 0
            return r2
    }

    @Override // android.app.Service
    @androidx.annotation.CallSuper
    public void onCreate() {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.dispatcher
            r0.onServicePreSuperOnCreate()
            super.onCreate()
            return
    }

    @Override // android.app.Service
    @androidx.annotation.CallSuper
    public void onDestroy() {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.dispatcher
            r0.onServicePreSuperOnDestroy()
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    @kotlin.Deprecated(message = "Deprecated in Java")
    @androidx.annotation.CallSuper
    public void onStart(@org.jetbrains.annotations.Nullable android.content.Intent r2, int r3) {
            r1 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher r0 = r1.dispatcher
            r0.onServicePreSuperOnStart()
            super.onStart(r2, r3)
            return
    }

    @Override // android.app.Service
    @androidx.annotation.CallSuper
    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r1, int r2, int r3) {
            r0 = this;
            int r1 = super.onStartCommand(r1, r2, r3)
            return r1
    }
}
