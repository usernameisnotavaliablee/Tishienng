package cn.bluemobi.dylan.base.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
    private java.util.List<androidx.fragment.app.Fragment> a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.material.tabs.TabLayout f26b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.fragment.app.FragmentManager f27c;

    /* renamed from: d, reason: collision with root package name */
    private int f28d;

    /* renamed from: e, reason: collision with root package name */
    private int f29e;

    /* renamed from: f, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.b.a f30f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(com.google.android.material.tabs.TabLayout r1, com.google.android.material.tabs.TabLayout.Tab r2, int r3) {
                r0 = this;
                return
        }

        public void b() {
                r0 = this;
                return
        }
    }

    public b(androidx.fragment.app.FragmentManager r7, java.util.List<androidx.fragment.app.Fragment> r8, int r9, com.google.android.material.tabs.TabLayout r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public b(androidx.fragment.app.FragmentManager r2, java.util.List<androidx.fragment.app.Fragment> r3, int r4, com.google.android.material.tabs.TabLayout r5, int r6) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f31g = r0
            r1.a = r3
            r1.f26b = r5
            r1.f27c = r2
            r1.f28d = r4
            r1.f29e = r6
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            java.lang.Object r3 = r3.get(r6)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.add(r4, r3, r6)
            r2.commitAllowingStateLoss()
            if (r5 == 0) goto L29
            r5.setOnTabSelectedListener(r1)
        L29:
            return
    }

    private androidx.fragment.app.FragmentTransaction d(int r1) {
            r0 = this;
            androidx.fragment.app.FragmentManager r1 = r0.f27c
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            return r1
    }

    public androidx.fragment.app.Fragment a() {
            r2 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r2.a
            int r1 = r2.f29e
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.f29e
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.b.a c() {
            r1 = this;
            cn.bluemobi.dylan.base.adapter.b$a r0 = r1.f30f
            return r0
    }

    public void e(boolean r1) {
            r0 = this;
            r0.f31g = r1
            return
    }

    public void f(cn.bluemobi.dylan.base.adapter.b.a r1) {
            r0 = this;
            r0.f30f = r1
            return
    }

    public void g(int r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.List<androidx.fragment.app.Fragment> r1 = r3.a
            int r1 = r1.size()
            if (r0 >= r1) goto L24
            java.util.List<androidx.fragment.app.Fragment> r1 = r3.a
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentTransaction r2 = r3.d(r4)
            if (r4 != r0) goto L1b
            r2.show(r1)
            goto L1e
        L1b:
            r2.hide(r1)
        L1e:
            r2.commitAllowingStateLoss()
            int r0 = r0 + 1
            goto L1
        L24:
            r3.f29e = r4
            return
    }

    public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
            r0 = this;
            return
    }

    public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r6) {
            r5 = this;
            boolean r0 = r5.f31g
            if (r0 != 0) goto Lc
            cn.bluemobi.dylan.base.adapter.b$a r6 = r5.f30f
            if (r6 == 0) goto L58
            r6.b()
            return
        Lc:
            r0 = 0
        Ld:
            com.google.android.material.tabs.TabLayout r1 = r5.f26b     // Catch: java.lang.Exception -> L58
            int r1 = r1.getTabCount()     // Catch: java.lang.Exception -> L58
            if (r0 >= r1) goto L58
            com.google.android.material.tabs.TabLayout r1 = r5.f26b     // Catch: java.lang.Exception -> L58
            com.google.android.material.tabs.TabLayout$Tab r1 = r1.getTabAt(r0)     // Catch: java.lang.Exception -> L58
            if (r1 != r6) goto L55
            java.util.List<androidx.fragment.app.Fragment> r1 = r5.a     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L58
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch: java.lang.Exception -> L58
            androidx.fragment.app.FragmentTransaction r2 = r5.d(r0)     // Catch: java.lang.Exception -> L58
            boolean r3 = r1.isAdded()     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L3b
            r5.f29e = r0     // Catch: java.lang.Exception -> L58
            boolean r3 = r1.isResumed()     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L46
            r1.onResume()     // Catch: java.lang.Exception -> L58
            goto L46
        L3b:
            int r3 = r5.f28d     // Catch: java.lang.Exception -> L58
            int r4 = r5.f29e     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L58
            r2.add(r3, r1, r4)     // Catch: java.lang.Exception -> L58
        L46:
            r5.g(r0)     // Catch: java.lang.Exception -> L58
            r2.commitAllowingStateLoss()     // Catch: java.lang.Exception -> L58
            cn.bluemobi.dylan.base.adapter.b$a r1 = r5.f30f     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto L55
            com.google.android.material.tabs.TabLayout r2 = r5.f26b     // Catch: java.lang.Exception -> L58
            r1.a(r2, r6, r0)     // Catch: java.lang.Exception -> L58
        L55:
            int r0 = r0 + 1
            goto Ld
        L58:
            return
    }

    public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
            r0 = this;
            return
    }
}
