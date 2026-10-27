package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {
    private com.kwad.components.core.proxy.k Wc;
    private java.util.Set<com.kwad.components.core.proxy.c> Wd;

    public b(com.kwad.components.core.proxy.k r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.Wd = r0
            r1.Wc = r2
            return
    }

    private com.kwad.components.core.proxy.c b(android.app.Activity r4) {
            r3 = this;
            java.util.Set<com.kwad.components.core.proxy.c> r0 = r3.Wd
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.proxy.c r1 = (com.kwad.components.core.proxy.c) r1
            boolean r2 = r1.c(r4)
            if (r2 == 0) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            com.kwad.components.core.proxy.c r3 = r1.b(r2)
            if (r3 == 0) goto L12
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r3.a(r0)
            com.kwad.components.core.proxy.k r0 = r1.Wc
            if (r0 == 0) goto L12
            r0.a(r3)
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "onActivityCreated : "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "ActivityLifecycleAdapter"
            com.kwad.sdk.core.d.c.d(r3, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r3) {
            r2 = this;
            com.kwad.components.core.proxy.c r0 = r2.b(r3)
            if (r0 == 0) goto L12
            com.kwad.components.core.proxy.k r1 = r2.Wc
            if (r1 == 0) goto Ld
            r1.f(r0)
        Ld:
            java.util.Set<com.kwad.components.core.proxy.c> r1 = r2.Wd
            r1.remove(r0)
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onActivityDestroyed : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ActivityLifecycleAdapter"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r3) {
            r2 = this;
            com.kwad.components.core.proxy.c r0 = r2.b(r3)
            if (r0 == 0) goto L12
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.a(r1)
            com.kwad.components.core.proxy.k r1 = r2.Wc
            if (r1 == 0) goto L12
            r1.d(r0)
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onActivityPaused : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ActivityLifecycleAdapter"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            com.kwad.components.core.proxy.c r2 = new com.kwad.components.core.proxy.c
            r2.<init>(r1)
            java.util.Set<com.kwad.components.core.proxy.c> r1 = r0.Wd
            r1.add(r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r3) {
            r2 = this;
            com.kwad.components.core.proxy.c r0 = r2.b(r3)
            if (r0 == 0) goto L12
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.a(r1)
            com.kwad.components.core.proxy.k r1 = r2.Wc
            if (r1 == 0) goto L12
            r1.c(r0)
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onActivityResumed : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ActivityLifecycleAdapter"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r3) {
            r2 = this;
            com.kwad.components.core.proxy.c r0 = r2.b(r3)
            if (r0 == 0) goto L12
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.a(r1)
            com.kwad.components.core.proxy.k r1 = r2.Wc
            if (r1 == 0) goto L12
            r1.b(r0)
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onActivityStarted : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ActivityLifecycleAdapter"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r3) {
            r2 = this;
            com.kwad.components.core.proxy.c r0 = r2.b(r3)
            if (r0 == 0) goto L12
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.a(r1)
            com.kwad.components.core.proxy.k r1 = r2.Wc
            if (r1 == 0) goto L12
            r1.e(r0)
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onActivityStopped : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ActivityLifecycleAdapter"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }
}
