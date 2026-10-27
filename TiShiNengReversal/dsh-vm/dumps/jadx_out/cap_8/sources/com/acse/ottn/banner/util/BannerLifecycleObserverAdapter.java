package com.acse.ottn.banner.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BannerLifecycleObserverAdapter implements androidx.lifecycle.LifecycleObserver {
    public final com.acse.ottn.y a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.LifecycleOwner f2195b;

    public BannerLifecycleObserverAdapter(androidx.lifecycle.LifecycleOwner r1, com.acse.ottn.y r2) {
            r0 = this;
            r0.<init>()
            r0.f2195b = r1
            r0.a = r2
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
            r2 = this;
            java.lang.String r0 = "onDestroy"
            com.acse.ottn.i2.c(r0)
            com.acse.ottn.y r0 = r2.a
            androidx.lifecycle.LifecycleOwner r1 = r2.f2195b
            r0.a(r1)
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public void onStart() {
            r2 = this;
            java.lang.String r0 = "onStart"
            com.acse.ottn.i2.c(r0)
            com.acse.ottn.y r0 = r2.a
            androidx.lifecycle.LifecycleOwner r1 = r2.f2195b
            r0.b(r1)
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void onStop() {
            r2 = this;
            java.lang.String r0 = "onStop"
            com.acse.ottn.i2.c(r0)
            com.acse.ottn.y r0 = r2.a
            androidx.lifecycle.LifecycleOwner r1 = r2.f2195b
            r0.c(r1)
            return
    }
}
