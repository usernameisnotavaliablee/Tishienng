package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f118e = "ListenerHandler";
    private android.view.View a;

    /* renamed from: b, reason: collision with root package name */
    private int f119b;

    /* renamed from: c, reason: collision with root package name */
    private int f120c;

    /* renamed from: d, reason: collision with root package name */
    private cn.bluemobi.dylan.base.utils.m.a f121d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(boolean r1, int r2);
    }

    public m(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L6
            return
        L6:
            android.view.View r1 = r0.c(r1)
            r0.a = r1
            if (r1 == 0) goto L11
            r0.a()
        L11:
            return
    }

    private void a() {
            r1 = this;
            android.view.View r0 = r1.a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r1)
            return
    }

    private android.view.View c(android.app.Activity r2) {
            r1 = this;
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r0)
            return r2
    }

    public void b() {
            r1 = this;
            android.view.View r0 = r1.a
            if (r0 == 0) goto Lb
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r1)
        Lb:
            return
    }

    public void d(cn.bluemobi.dylan.base.utils.m.a r1) {
            r0 = this;
            r0.f121d = r1
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
            r3 = this;
            android.view.View r0 = r3.a
            int r0 = r0.getHeight()
            if (r0 != 0) goto L9
            return
        L9:
            int r1 = r3.f120c
            if (r1 != 0) goto L12
            r3.f120c = r0
            r3.f119b = r0
            return
        L12:
            if (r1 == r0) goto L29
            r3.f120c = r0
            int r1 = r3.f119b
            if (r1 != r0) goto L1d
            r0 = 0
            r1 = 0
            goto L22
        L1d:
            int r0 = r1 - r0
            r1 = 1
            r1 = r0
            r0 = 1
        L22:
            cn.bluemobi.dylan.base.utils.m$a r2 = r3.f121d
            if (r2 == 0) goto L29
            r2.a(r0, r1)
        L29:
            return
    }
}
