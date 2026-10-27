package com.bjtsn.dylan.lifecycleobserver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LifecycleObserver {
    private androidx.lifecycle.Lifecycle a;

    public LifecycleObserver(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            java.lang.String r0 = "fragment.lifecycle"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.a = r2
            return
    }

    public LifecycleObserver(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            java.lang.String r0 = "activity.lifecycle"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.a = r2
            return
    }

    public static final /* synthetic */ androidx.lifecycle.Lifecycle a(com.bjtsn.dylan.lifecycleobserver.LifecycleObserver r0) {
            androidx.lifecycle.Lifecycle r0 = r0.a
            return r0
    }

    public static final /* synthetic */ void b(com.bjtsn.dylan.lifecycleobserver.LifecycleObserver r0, androidx.lifecycle.Lifecycle r1) {
            r0.a = r1
            return
    }

    public final void c(@org.jetbrains.annotations.NotNull com.bjtsn.dylan.lifecycleobserver.b r3) {
            r2 = this;
            java.lang.String r0 = "lifecycleCallback"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.Lifecycle r0 = r2.a
            com.bjtsn.dylan.lifecycleobserver.LifecycleObserver$observer$1 r1 = new com.bjtsn.dylan.lifecycleobserver.LifecycleObserver$observer$1
            r1.<init>(r2, r3)
            r0.addObserver(r1)
            return
    }
}
