package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class q implements android.os.Handler.Callback {

    @androidx.annotation.VisibleForTesting
    static final java.lang.String j = "com.bumptech.glide.manager";
    private static final java.lang.String k = "RMRetriever";

    /* renamed from: l, reason: collision with root package name */
    private static final int f473l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f474m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final java.lang.String f475n = "key";

    /* renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.manager.q.b f476o = null;
    private volatile com.bumptech.glide.i a;

    @androidx.annotation.VisibleForTesting
    final java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.o> b;

    @androidx.annotation.VisibleForTesting
    final java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> c;
    private final android.os.Handler d;
    private final com.bumptech.glide.manager.q.b e;
    private final androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> f;
    private final androidx.collection.ArrayMap<android.view.View, android.app.Fragment> g;
    private final android.os.Bundle h;
    private final com.bumptech.glide.manager.k i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.manager.q.b {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.manager.q.b
        @androidx.annotation.NonNull
        public com.bumptech.glide.i a(@androidx.annotation.NonNull com.bumptech.glide.b r2, @androidx.annotation.NonNull com.bumptech.glide.manager.l r3, @androidx.annotation.NonNull com.bumptech.glide.manager.r r4, @androidx.annotation.NonNull android.content.Context r5) {
                r1 = this;
                com.bumptech.glide.i r0 = new com.bumptech.glide.i
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.NonNull
        com.bumptech.glide.i a(@androidx.annotation.NonNull com.bumptech.glide.b r1, @androidx.annotation.NonNull com.bumptech.glide.manager.l r2, @androidx.annotation.NonNull com.bumptech.glide.manager.r r3, @androidx.annotation.NonNull android.content.Context r4);
    }

    static {
            com.bumptech.glide.manager.q$a r0 = new com.bumptech.glide.manager.q$a
            r0.<init>()
            com.bumptech.glide.manager.q.f476o = r0
            return
    }

    public q(@androidx.annotation.Nullable com.bumptech.glide.manager.q.b r2, com.bumptech.glide.e r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.f = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.g = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.h = r0
            if (r2 == 0) goto L29
            goto L2b
        L29:
            com.bumptech.glide.manager.q$b r2 = com.bumptech.glide.manager.q.f476o
        L2b:
            r1.e = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.d = r2
            com.bumptech.glide.manager.k r2 = b(r3)
            r1.i = r2
            return
    }

    @android.annotation.TargetApi(17)
    private static void a(@androidx.annotation.NonNull android.app.Activity r1) {
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            r1.<init>(r0)
            throw r1
    }

    private static com.bumptech.glide.manager.k b(com.bumptech.glide.e r1) {
            boolean r0 = com.bumptech.glide.load.resource.bitmap.a0.i
            if (r0 == 0) goto L1d
            boolean r0 = com.bumptech.glide.load.resource.bitmap.a0.h
            if (r0 != 0) goto L9
            goto L1d
        L9:
            java.lang.Class<com.bumptech.glide.c$f> r0 = com.bumptech.glide.c.f.class
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L17
            com.bumptech.glide.manager.i r1 = new com.bumptech.glide.manager.i
            r1.<init>()
            return r1
        L17:
            com.bumptech.glide.manager.j r1 = new com.bumptech.glide.manager.j
            r1.<init>()
            return r1
        L1d:
            com.bumptech.glide.manager.g r1 = new com.bumptech.glide.manager.g
            r1.<init>()
            return r1
    }

    @androidx.annotation.Nullable
    private static android.app.Activity c(@androidx.annotation.NonNull android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.app.Activity r1 = c(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    @android.annotation.TargetApi(26)
    @java.lang.Deprecated
    private void d(@androidx.annotation.NonNull android.app.FragmentManager r3, @androidx.annotation.NonNull androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L30
            java.util.List r3 = com.bumptech.glide.manager.p.a(r3)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            android.app.Fragment r0 = (android.app.Fragment) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto Le
            android.view.View r1 = r0.getView()
            r4.put(r1, r0)
            android.app.FragmentManager r0 = r0.getChildFragmentManager()
            r2.d(r0, r4)
            goto Le
        L2f:
            return
        L30:
            r2.e(r3, r4)
            return
    }

    @java.lang.Deprecated
    private void e(@androidx.annotation.NonNull android.app.FragmentManager r5, @androidx.annotation.NonNull androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r6) {
            r4 = this;
            r0 = 0
        L1:
            android.os.Bundle r1 = r4.h
            int r2 = r0 + 1
            java.lang.String r3 = "key"
            r1.putInt(r3, r0)
            android.os.Bundle r0 = r4.h     // Catch: java.lang.Exception -> L11
            android.app.Fragment r0 = r5.getFragment(r0, r3)     // Catch: java.lang.Exception -> L11
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L15
            return
        L15:
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L29
            android.view.View r1 = r0.getView()
            r6.put(r1, r0)
            android.app.FragmentManager r0 = r0.getChildFragmentManager()
            r4.d(r0, r6)
        L29:
            r0 = r2
            goto L1
    }

    private static void f(@androidx.annotation.Nullable java.util.Collection<androidx.fragment.app.Fragment> r2, @androidx.annotation.NonNull java.util.Map<android.view.View, androidx.fragment.app.Fragment> r3) {
            if (r2 != 0) goto L3
            goto L2f
        L3:
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L7
            android.view.View r1 = r0.getView()
            if (r1 != 0) goto L1c
            goto L7
        L1c:
            android.view.View r1 = r0.getView()
            r3.put(r1, r0)
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.getFragments()
            f(r0, r3)
            goto L7
        L2f:
            return
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    private android.app.Fragment g(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.app.Activity r4) {
            r2 = this;
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r0 = r2.g
            r0.clear()
            android.app.FragmentManager r0 = r4.getFragmentManager()
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r1 = r2.g
            r2.d(r0, r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            r0 = 0
        L16:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L36
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r0 = r2.g
            java.lang.Object r0 = r0.get(r3)
            android.app.Fragment r0 = (android.app.Fragment) r0
            if (r0 == 0) goto L27
            goto L36
        L27:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L36
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L16
        L36:
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r3 = r2.g
            r3.clear()
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.Fragment h(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r4) {
            r2 = this;
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r0 = r2.f
            r0.clear()
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            java.util.List r0 = r0.getFragments()
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r1 = r2.f
            f(r0, r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            r0 = 0
        L1a:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L3a
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r0 = r2.f
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L2b
            goto L3a
        L2b:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L3a
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L1a
        L3a:
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r3 = r2.f
            r3.clear()
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    private com.bumptech.glide.i i(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.app.FragmentManager r5, @androidx.annotation.Nullable android.app.Fragment r6, boolean r7) {
            r3 = this;
            com.bumptech.glide.manager.o r5 = r3.r(r5, r6)
            com.bumptech.glide.i r6 = r5.e()
            if (r6 != 0) goto L25
            com.bumptech.glide.b r6 = com.bumptech.glide.b.e(r4)
            com.bumptech.glide.manager.q$b r0 = r3.e
            com.bumptech.glide.manager.a r1 = r5.c()
            com.bumptech.glide.manager.r r2 = r5.f()
            com.bumptech.glide.i r4 = r0.a(r6, r1, r2, r4)
            if (r7 == 0) goto L21
            r4.onStart()
        L21:
            r5.k(r4)
            return r4
        L25:
            return r6
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.i p(@androidx.annotation.NonNull android.content.Context r5) {
            r4 = this;
            com.bumptech.glide.i r0 = r4.a
            if (r0 != 0) goto L36
            monitor-enter(r4)
            com.bumptech.glide.i r0 = r4.a     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L32
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L30
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.b r0 = com.bumptech.glide.b.e(r0)     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.manager.q$b r1 = r4.e     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.manager.b r2 = new com.bumptech.glide.manager.b     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.manager.h r3 = new com.bumptech.glide.manager.h     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L30
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.i r5 = r1.a(r0, r2, r3, r5)     // Catch: java.lang.Throwable -> L30
            r4.a = r5     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r5 = move-exception
            goto L34
        L32:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            goto L36
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r5
        L36:
            com.bumptech.glide.i r5 = r4.a
            return r5
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.manager.o r(@androidx.annotation.NonNull android.app.FragmentManager r3, @androidx.annotation.Nullable android.app.Fragment r4) {
            r2 = this;
            java.lang.String r0 = "com.bumptech.glide.manager"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            com.bumptech.glide.manager.o r1 = (com.bumptech.glide.manager.o) r1
            if (r1 != 0) goto L36
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.o> r1 = r2.b
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.manager.o r1 = (com.bumptech.glide.manager.o) r1
            if (r1 != 0) goto L36
            com.bumptech.glide.manager.o r1 = new com.bumptech.glide.manager.o
            r1.<init>()
            r1.j(r4)
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.o> r4 = r2.b
            r4.put(r3, r1)
            android.app.FragmentTransaction r4 = r3.beginTransaction()
            android.app.FragmentTransaction r4 = r4.add(r1, r0)
            r4.commitAllowingStateLoss()
            android.os.Handler r4 = r2.d
            r0 = 1
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            r3.sendToTarget()
        L36:
            return r1
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.manager.SupportRequestManagerFragment t(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3, @androidx.annotation.Nullable androidx.fragment.app.Fragment r4) {
            r2 = this;
            java.lang.String r0 = "com.bumptech.glide.manager"
            androidx.fragment.app.Fragment r1 = r3.findFragmentByTag(r0)
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r1
            if (r1 != 0) goto L36
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r1 = r2.c
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r1
            if (r1 != 0) goto L36
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = new com.bumptech.glide.manager.SupportRequestManagerFragment
            r1.<init>()
            r1.l(r4)
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r4 = r2.c
            r4.put(r3, r1)
            androidx.fragment.app.FragmentTransaction r4 = r3.beginTransaction()
            androidx.fragment.app.FragmentTransaction r4 = r4.add(r1, r0)
            r4.commitAllowingStateLoss()
            android.os.Handler r4 = r2.d
            r0 = 2
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            r3.sendToTarget()
        L36:
            return r1
    }

    private static boolean u(android.content.Context r0) {
            android.app.Activity r0 = c(r0)
            if (r0 == 0) goto Lf
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.i v(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r5, @androidx.annotation.Nullable androidx.fragment.app.Fragment r6, boolean r7) {
            r3 = this;
            com.bumptech.glide.manager.SupportRequestManagerFragment r5 = r3.t(r5, r6)
            com.bumptech.glide.i r6 = r5.f()
            if (r6 != 0) goto L25
            com.bumptech.glide.b r6 = com.bumptech.glide.b.e(r4)
            com.bumptech.glide.manager.q$b r0 = r3.e
            com.bumptech.glide.manager.a r1 = r5.d()
            com.bumptech.glide.manager.r r2 = r5.g()
            com.bumptech.glide.i r4 = r0.a(r6, r1, r2, r4)
            if (r7 == 0) goto L21
            r4.onStart()
        L21:
            r5.m(r4)
            return r4
        L25:
            return r6
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            r1 = 1
            if (r0 == r1) goto L1a
            r2 = 2
            if (r0 == r2) goto Lc
            r5 = 0
            r1 = 0
            r0 = r5
            goto L25
        Lc:
            java.lang.Object r5 = r5.obj
            androidx.fragment.app.FragmentManager r5 = (androidx.fragment.app.FragmentManager) r5
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r4.c
            java.lang.Object r0 = r0.remove(r5)
        L16:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L25
        L1a:
            java.lang.Object r5 = r5.obj
            android.app.FragmentManager r5 = (android.app.FragmentManager) r5
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.o> r0 = r4.b
            java.lang.Object r0 = r0.remove(r5)
            goto L16
        L25:
            if (r1 == 0) goto L35
            if (r5 != 0) goto L35
            java.lang.String r5 = "RMRetriever"
            r2 = 5
            boolean r5 = android.util.Log.isLoggable(r5, r2)
            if (r5 == 0) goto L35
            java.util.Objects.toString(r0)
        L35:
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.i j(@androidx.annotation.NonNull android.app.Activity r4) {
            r3 = this;
            boolean r0 = com.bumptech.glide.util.l.t()
            if (r0 == 0) goto L13
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bumptech.glide.i r4 = r3.l(r4)
            return r4
        L13:
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            com.bumptech.glide.i r4 = r3.o(r4)
            return r4
        L1e:
            a(r4)
            com.bumptech.glide.manager.k r0 = r3.i
            r0.a(r4)
            android.app.FragmentManager r0 = r4.getFragmentManager()
            r1 = 0
            boolean r2 = u(r4)
            com.bumptech.glide.i r4 = r3.i(r4, r0, r1, r2)
            return r4
    }

    @androidx.annotation.NonNull
    @android.annotation.TargetApi(17)
    @java.lang.Deprecated
    public com.bumptech.glide.i k(@androidx.annotation.NonNull android.app.Fragment r4) {
            r3 = this;
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L3d
            boolean r0 = com.bumptech.glide.util.l.t()
            if (r0 != 0) goto L2c
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L1b
            com.bumptech.glide.manager.k r0 = r3.i
            android.app.Activity r1 = r4.getActivity()
            r0.a(r1)
        L1b:
            android.app.FragmentManager r0 = r4.getChildFragmentManager()
            android.app.Activity r1 = r4.getActivity()
            boolean r2 = r4.isVisible()
            com.bumptech.glide.i r4 = r3.i(r1, r0, r4, r2)
            return r4
        L2c:
            android.app.Activity r4 = r4.getActivity()
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bumptech.glide.i r4 = r3.l(r4)
            return r4
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached"
            r4.<init>(r0)
            throw r4
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.i l(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            if (r3 == 0) goto L45
            boolean r0 = com.bumptech.glide.util.l.u()
            if (r0 == 0) goto L40
            boolean r0 = r3 instanceof android.app.Application
            if (r0 != 0) goto L40
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            com.bumptech.glide.i r3 = r2.o(r3)
            return r3
        L17:
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L22
            android.app.Activity r3 = (android.app.Activity) r3
            com.bumptech.glide.i r3 = r2.j(r3)
            return r3
        L22:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L40
            r0 = r3
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            if (r1 == 0) goto L40
            android.content.Context r3 = r0.getBaseContext()
            com.bumptech.glide.i r3 = r2.l(r3)
            return r3
        L40:
            com.bumptech.glide.i r3 = r2.p(r3)
            return r3
        L45:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a null Context"
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.i m(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            boolean r0 = com.bumptech.glide.util.l.t()
            if (r0 == 0) goto L17
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.bumptech.glide.i r3 = r2.l(r3)
            return r3
        L17:
            com.bumptech.glide.util.k.d(r3)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Unable to obtain a request manager for a view without a Context"
            com.bumptech.glide.util.k.e(r0, r1)
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = c(r0)
            if (r0 != 0) goto L3e
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.bumptech.glide.i r3 = r2.l(r3)
            return r3
        L3e:
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L54
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.Fragment r3 = r2.h(r3, r0)
            if (r3 == 0) goto L4f
            com.bumptech.glide.i r3 = r2.n(r3)
            return r3
        L4f:
            com.bumptech.glide.i r3 = r2.o(r0)
            return r3
        L54:
            android.app.Fragment r3 = r2.g(r3, r0)
            if (r3 != 0) goto L5f
            com.bumptech.glide.i r3 = r2.j(r0)
            return r3
        L5f:
            com.bumptech.glide.i r3 = r2.k(r3)
            return r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.i n(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            com.bumptech.glide.util.k.e(r0, r1)
            boolean r0 = com.bumptech.glide.util.l.t()
            if (r0 == 0) goto L20
            android.content.Context r4 = r4.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bumptech.glide.i r4 = r3.l(r4)
            return r4
        L20:
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L2f
            com.bumptech.glide.manager.k r0 = r3.i
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0.a(r1)
        L2f:
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            android.content.Context r1 = r4.getContext()
            boolean r2 = r4.isVisible()
            com.bumptech.glide.i r4 = r3.v(r1, r0, r4, r2)
            return r4
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.i o(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r4) {
            r3 = this;
            boolean r0 = com.bumptech.glide.util.l.t()
            if (r0 == 0) goto L13
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bumptech.glide.i r4 = r3.l(r4)
            return r4
        L13:
            a(r4)
            com.bumptech.glide.manager.k r0 = r3.i
            r0.a(r4)
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            r1 = 0
            boolean r2 = u(r4)
            com.bumptech.glide.i r4 = r3.v(r4, r0, r1, r2)
            return r4
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    com.bumptech.glide.manager.o q(android.app.Activity r2) {
            r1 = this;
            android.app.FragmentManager r2 = r2.getFragmentManager()
            r0 = 0
            com.bumptech.glide.manager.o r2 = r1.r(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    com.bumptech.glide.manager.SupportRequestManagerFragment s(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.manager.SupportRequestManagerFragment r2 = r1.t(r2, r0)
            return r2
    }
}
