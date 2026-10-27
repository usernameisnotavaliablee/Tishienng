package com.bxkj.student.run.app.livedata;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class LifecycleService extends android.app.Service implements androidx.lifecycle.LifecycleOwner {

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LifecycleRegistry a;

    public LifecycleService() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.a
            return r0
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            androidx.lifecycle.LifecycleRegistry r0 = r2.a
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            androidx.lifecycle.LifecycleRegistry r0 = r2.a
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r3, int r4, int r5) {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.a
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            int r3 = super.onStartCommand(r3, r4, r5)
            return r3
    }
}
