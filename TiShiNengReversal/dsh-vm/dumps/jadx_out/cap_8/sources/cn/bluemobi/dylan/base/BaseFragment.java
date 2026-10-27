package cn.bluemobi.dylan.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    protected boolean f13c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f14d;

    /* renamed from: e, reason: collision with root package name */
    protected final java.lang.String f15e;

    /* renamed from: f, reason: collision with root package name */
    private android.view.View f16f;

    /* renamed from: g, reason: collision with root package name */
    protected android.content.Context f17g;

    /* renamed from: h, reason: collision with root package name */
    protected android.app.Activity f18h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.Toast f19i;

    public BaseFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f13c = r0
            r1.f14d = r0
            java.lang.String r0 = "LazyLoadFragment"
            r1.f15e = r0
            return
    }

    private void g() {
            r1 = this;
            boolean r0 = r1.f13c
            if (r0 != 0) goto L5
            goto L19
        L5:
            boolean r0 = r1.getUserVisibleHint()
            if (r0 == 0) goto L12
            r1.h()
            r0 = 1
            r1.f14d = r0
            return
        L12:
            boolean r0 = r1.f14d
            if (r0 == 0) goto L19
            r1.M()
        L19:
            return
    }

    public void L(java.lang.CharSequence r3) {
            r2 = this;
            android.widget.Toast r0 = r2.f19i
            if (r0 != 0) goto L10
            android.content.Context r0 = r2.getContext()
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
            r2.f19i = r3
            goto L13
        L10:
            r0.setText(r3)
        L13:
            android.widget.Toast r3 = r2.f19i
            r3.show()
            return
    }

    protected void M() {
            r0 = this;
            return
    }

    public abstract void b();

    protected <T extends android.view.View> T c(int r2) {
            r1 = this;
            android.view.View r0 = r1.d()
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    protected android.view.View d() {
            r1 = this;
            android.view.View r0 = r1.f16f
            return r0
    }

    protected abstract void e();

    protected abstract void f(android.view.View r1);

    protected void h() {
            r1 = this;
            boolean r0 = r1.f14d
            if (r0 != 0) goto L7
            r1.e()
        L7:
            return
    }

    protected abstract int i();

    protected void j(android.widget.GridView r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            java.lang.String r1 = "暂无数据！"
            r0.setText(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 2
            r2 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1, r2)
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r0)
            r4.setEmptyView(r0)
            return
    }

    protected void k(android.widget.GridView r4, java.lang.String r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r0.setText(r5)
            r5 = 17
            r0.setGravity(r5)
            r5 = 2
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r5, r1)
            r5 = 8
            r0.setVisibility(r5)
            android.view.ViewParent r5 = r4.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.addView(r0)
            r4.setEmptyView(r0)
            return
    }

    protected void l(android.widget.ListView r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            java.lang.String r1 = "暂无数据！"
            r0.setText(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 2
            r2 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1, r2)
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r0)
            r4.setEmptyView(r0)
            r0 = 0
            r4.setVisibility(r0)
            return
    }

    protected void m(android.widget.ListView r4, java.lang.String r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r0.setText(r5)
            r5 = 17
            r0.setGravity(r5)
            r5 = 2
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r5, r1)
            r5 = 8
            r0.setVisibility(r5)
            android.view.ViewParent r5 = r4.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.addView(r0)
            r4.setEmptyView(r0)
            return
    }

    @androidx.annotation.Nullable
    public android.view.View onCreateView(android.view.LayoutInflater r2, @androidx.annotation.Nullable android.view.ViewGroup r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            int r4 = r1.i()
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            r1.f16f = r2
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            r2.d(r1)
            r2 = 1
            r1.f13c = r2
            android.content.Context r2 = r1.getContext()
            r1.f17g = r2
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            r1.f18h = r2
            android.view.View r2 = r1.f16f
            r1.f(r2)
            r1.g()
            r1.b()
            android.view.View r2 = r1.f16f
            return r2
    }

    public void onDestroyView() {
            r1 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            r0.t(r1)
            super.onDestroyView()
            r0 = 0
            r1.f13c = r0
            r1.f14d = r0
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            android.widget.Toast r0 = r1.f19i
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }

    public void setUserVisibleHint(boolean r1) {
            r0 = this;
            super.setUserVisibleHint(r1)
            r0.g()
            return
    }
}
