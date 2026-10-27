package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class u implements android.app.Application.ActivityLifecycleCallbacks, xyz.adscope.ad.o3 {
    private final java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.p3> a;
    private int b;

    u() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    private void b() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.p3> r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.p3> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            xyz.adscope.ad.p3 r1 = (xyz.adscope.ad.p3) r1
            r1.a()
            goto Le
        L1e:
            return
    }

    @Override // xyz.adscope.ad.o3
    public android.app.Application.ActivityLifecycleCallbacks a() {
            r0 = this;
            return r0
    }

    @Override // xyz.adscope.ad.o3
    public void a(xyz.adscope.ad.p3 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.p3> r0 = r1.a
            r0.add(r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            int r1 = r0.b
            int r1 = r1 + 1
            r0.b = r1
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.p3> r1 = r0.a
            r1.clear()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r1) {
            r0 = this;
            int r1 = r0.b
            int r1 = r1 + (-1)
            r0.b = r1
            if (r1 != 0) goto Lb
            r0.b()
        Lb:
            return
    }
}
