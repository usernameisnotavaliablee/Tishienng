package cn.bluemobi.dylan.base.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements android.widget.RadioGroup.OnCheckedChangeListener {
    private java.util.List<androidx.fragment.app.Fragment> a;

    /* renamed from: b, reason: collision with root package name */
    private android.widget.RadioGroup f20b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.fragment.app.FragmentManager f21c;

    /* renamed from: d, reason: collision with root package name */
    private int f22d;

    /* renamed from: e, reason: collision with root package name */
    private int f23e;

    /* renamed from: f, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.a.C0000a f24f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: cn.bluemobi.dylan.base.adapter.a$a, reason: collision with other inner class name */
    public static class C0000a {
        public C0000a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(android.widget.RadioGroup r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void b() {
                r0 = this;
                return
        }
    }

    public a(androidx.fragment.app.FragmentManager r7, java.util.List<androidx.fragment.app.Fragment> r8, int r9, android.widget.RadioGroup r10) {
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

    public a(androidx.fragment.app.FragmentManager r2, java.util.List<androidx.fragment.app.Fragment> r3, int r4, android.widget.RadioGroup r5, int r6) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f25g = r0
            r1.a = r3
            r1.f20b = r5
            r1.f21c = r2
            r1.f22d = r4
            r1.f23e = r4
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            java.lang.Object r3 = r3.get(r6)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.add(r4, r3, r6)
            r2.commitAllowingStateLoss()
            if (r5 == 0) goto L29
            r5.setOnCheckedChangeListener(r1)
        L29:
            return
    }

    private androidx.fragment.app.FragmentTransaction d(int r1) {
            r0 = this;
            androidx.fragment.app.FragmentManager r1 = r0.f21c
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            return r1
    }

    public androidx.fragment.app.Fragment a() {
            r2 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r2.a
            int r1 = r2.f23e
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.f23e
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.a.C0000a c() {
            r1 = this;
            cn.bluemobi.dylan.base.adapter.a$a r0 = r1.f24f
            return r0
    }

    public void e(boolean r1) {
            r0 = this;
            r0.f25g = r1
            return
    }

    public void f(cn.bluemobi.dylan.base.adapter.a.C0000a r1) {
            r0 = this;
            r0.f24f = r1
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
            r3.f23e = r4
            return
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.RadioGroup r6, int r7) {
            r5 = this;
            boolean r0 = r5.f25g
            r1 = 0
            if (r0 != 0) goto L17
            android.view.View r6 = r6.getChildAt(r1)
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r7 = 1
            r6.setChecked(r7)
            cn.bluemobi.dylan.base.adapter.a$a r6 = r5.f24f
            if (r6 == 0) goto L64
            r6.b()
            return
        L17:
            android.widget.RadioGroup r0 = r5.f20b     // Catch: java.lang.Exception -> L64
            int r0 = r0.getChildCount()     // Catch: java.lang.Exception -> L64
            if (r1 >= r0) goto L64
            android.widget.RadioGroup r0 = r5.f20b     // Catch: java.lang.Exception -> L64
            android.view.View r0 = r0.getChildAt(r1)     // Catch: java.lang.Exception -> L64
            int r0 = r0.getId()     // Catch: java.lang.Exception -> L64
            if (r0 != r7) goto L61
            java.util.List<androidx.fragment.app.Fragment> r0 = r5.a     // Catch: java.lang.Exception -> L64
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L64
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Exception -> L64
            androidx.fragment.app.FragmentTransaction r2 = r5.d(r1)     // Catch: java.lang.Exception -> L64
            boolean r3 = r0.isAdded()     // Catch: java.lang.Exception -> L64
            if (r3 == 0) goto L49
            r5.f23e = r1     // Catch: java.lang.Exception -> L64
            boolean r3 = r0.isResumed()     // Catch: java.lang.Exception -> L64
            if (r3 != 0) goto L54
            r0.onResume()     // Catch: java.lang.Exception -> L64
            goto L54
        L49:
            int r3 = r5.f22d     // Catch: java.lang.Exception -> L64
            int r4 = r5.f23e     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L64
            r2.add(r3, r0, r4)     // Catch: java.lang.Exception -> L64
        L54:
            r5.g(r1)     // Catch: java.lang.Exception -> L64
            r2.commitAllowingStateLoss()     // Catch: java.lang.Exception -> L64
            cn.bluemobi.dylan.base.adapter.a$a r0 = r5.f24f     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L61
            r0.a(r6, r7, r1)     // Catch: java.lang.Exception -> L64
        L61:
            int r1 = r1 + 1
            goto L17
        L64:
            return
    }
}
