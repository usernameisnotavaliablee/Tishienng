package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static cn.bluemobi.dylan.base.utils.a f100c;
    private java.util.Stack<android.app.Activity> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<androidx.fragment.app.Fragment> f101b;

    private a() {
            r1 = this;
            r1.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f101b = r0
            return
    }

    public static cn.bluemobi.dylan.base.utils.a n() {
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.f100c
            if (r0 != 0) goto Lb
            cn.bluemobi.dylan.base.utils.a r0 = new cn.bluemobi.dylan.base.utils.a
            r0.<init>()
            cn.bluemobi.dylan.base.utils.a.f100c = r0
        Lb:
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.f100c
            return r0
    }

    public void a(android.content.Context r1) {
            r0 = this;
            r0.j()     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    public void b(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            r1.stopService(r2)     // Catch: java.lang.Exception -> L6
            r0.j()     // Catch: java.lang.Exception -> L6
        L6:
            return
    }

    public void c(android.app.Activity r2) {
            r1 = this;
            java.util.Stack<android.app.Activity> r0 = r1.a
            r0.add(r2)
            return
    }

    public void d(androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r1.f101b
            r0.add(r2)
            return
    }

    public android.app.Activity e() {
            r1 = this;
            java.util.Stack<android.app.Activity> r0 = r1.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.Stack<android.app.Activity> r0 = r1.a
            java.lang.Object r0 = r0.lastElement()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public void f(android.content.Context r1) {
            r0 = this;
            return
    }

    public void g() {
            r1 = this;
            java.util.Stack<android.app.Activity> r0 = r1.a
            boolean r0 = r0.empty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.Stack<android.app.Activity> r0 = r1.a
            java.lang.Object r0 = r0.lastElement()
            android.app.Activity r0 = (android.app.Activity) r0
            r1.h(r0)
            return
    }

    public <T extends android.app.Activity> T getActivity(java.lang.Class<?> r4) {
            r3 = this;
            java.util.Stack<android.app.Activity> r0 = r3.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Class r2 = r1.getClass()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    public void h(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            java.util.Stack<android.app.Activity> r0 = r1.a
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto Ld
            r2.finish()
        Ld:
            return
    }

    public void i(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.Stack<android.app.Activity> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.Stack<android.app.Activity> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Class r2 = r1.getClass()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L20
            r3.h(r1)
            int r0 = r0 + (-1)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    public void j() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Stack<android.app.Activity> r1 = r4.a
            r0.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r0.get(r2)
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r0.get(r2)
            android.app.Activity r3 = (android.app.Activity) r3
            r3.finish()
        L1d:
            int r2 = r2 + 1
            goto Lc
        L20:
            java.util.Stack<android.app.Activity> r0 = r4.a
            r0.clear()
            return
    }

    public void k() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Stack<android.app.Activity> r1 = r6.a
            r0.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L41
            java.lang.Object r3 = r0.get(r2)
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r0.get(r2)
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r0.get(r2)
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r5 = "LoginActivity"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3e
            java.lang.Object r4 = r0.get(r2)
            android.app.Activity r4 = (android.app.Activity) r4
            r4.finish()
            java.util.Stack<android.app.Activity> r4 = r6.a
            r4.remove(r3)
        L3e:
            int r2 = r2 + 1
            goto Lc
        L41:
            return
    }

    public void l() {
            r5 = this;
            java.util.Stack<android.app.Activity> r0 = r5.a
            int r0 = r0.size()
            r1 = 1
            if (r0 < r1) goto L2e
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Stack<android.app.Activity> r3 = r5.a
            java.util.List r0 = r3.subList(r1, r0)
            r2.<init>(r0)
            int r0 = r2.size()
            r1 = 0
        L19:
            if (r1 >= r0) goto L2e
            java.lang.Object r3 = r2.get(r1)
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L2b
            r3.finish()
            java.util.Stack<android.app.Activity> r4 = r5.a
            r4.remove(r3)
        L2b:
            int r1 = r1 + 1
            goto L19
        L2e:
            return
    }

    public java.util.Stack<android.app.Activity> m() {
            r1 = this;
            java.util.Stack<android.app.Activity> r0 = r1.a
            return r0
    }

    public <T extends androidx.fragment.app.Fragment> T o(java.lang.Class<?> r4) {
            r3 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r3.f101b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Class r2 = r1.getClass()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    public boolean p() {
            r1 = this;
            java.util.Stack<android.app.Activity> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    public android.app.Activity q() {
            r2 = this;
            java.util.Stack<android.app.Activity> r0 = r2.a
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto Lb
            r0 = 0
            return r0
        Lb:
            java.util.Stack<android.app.Activity> r0 = r2.a
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public android.app.Activity r() {
            r3 = this;
            java.util.Stack<android.app.Activity> r0 = r3.a
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto Lb
            r0 = 0
            return r0
        Lb:
            java.util.Stack<android.app.Activity> r0 = r3.a
            int r2 = r0.size()
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public void s(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Stack<android.app.Activity> r0 = r1.a
            r0.remove(r2)
        L7:
            return
    }

    public void t(androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r1.f101b
            if (r0 == 0) goto L7
            r0.remove(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }
}
