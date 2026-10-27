package com.kwad.components.core.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h implements com.kwad.components.core.e.a.d {
    private static java.lang.ref.WeakReference<android.view.Window> OB;
    private final com.kwad.sdk.core.c.c<android.app.Activity> An;
    private java.lang.ref.WeakReference<android.app.Activity> OA;
    private com.kwad.components.core.e.a.g Oy;
    private com.kwad.components.core.e.a.b Oz;
    private android.view.ViewGroup qT;
    private boolean qU;


    public h() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.e.a.h$1 r0 = new com.kwad.components.core.e.a.h$1
            r0.<init>(r1)
            r1.An = r0
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference a(com.kwad.components.core.e.a.h r0) {
            java.lang.ref.WeakReference<android.app.Activity> r0 = r0.OA
            return r0
    }

    public static void a(android.view.Window r1) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            com.kwad.components.core.e.a.h.OB = r0
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.e.a.h r0) {
            r0.fZ()
            return
    }

    private void fZ() {
            r2 = this;
            boolean r0 = r2.qU
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.qU = r0
            com.kwad.components.core.e.a.b r0 = r2.Oz
            r0.fY()
            android.view.ViewGroup r0 = r2.qT
            if (r0 == 0) goto L18
            com.kwad.components.core.e.a.g r1 = r2.Oy
            if (r1 == 0) goto L18
            r0.removeView(r1)
        L18:
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c<android.app.Activity> r0 = r2.An
            com.kwad.sdk.core.c.b.b(r0)
            return
    }

    public static void oR() {
            java.lang.ref.WeakReference<android.view.Window> r0 = com.kwad.components.core.e.a.h.OB
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            com.kwad.components.core.e.a.h.OB = r0
            return
    }

    public final boolean b(com.kwad.sdk.core.response.model.AdTemplate r6, com.kwad.components.core.e.a.b r7) {
            r5 = this;
            java.lang.String r0 = "InstalledActivateViewHelper"
            r1 = 0
            r5.Oz = r7     // Catch: java.lang.Throwable -> L20
            com.kwad.sdk.core.c.b.Ho()     // Catch: java.lang.Throwable -> L20
            android.app.Activity r2 = com.kwad.sdk.core.c.b.getCurrentActivity()     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L66
            boolean r3 = r2.isFinishing()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L15
            goto L66
        L15:
            java.lang.ref.WeakReference<android.view.Window> r3 = com.kwad.components.core.e.a.h.OB     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L20
            android.view.Window r3 = (android.view.Window) r3     // Catch: java.lang.Throwable -> L20
            goto L26
        L20:
            r6 = move-exception
            goto L78
        L22:
            android.view.Window r3 = r2.getWindow()     // Catch: java.lang.Throwable -> L20
        L26:
            android.view.View r3 = r3.getDecorView()     // Catch: java.lang.Throwable -> L20
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r3 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L36
            return r1
        L36:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L20
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L20
            r5.OA = r4     // Catch: java.lang.Throwable -> L20
            android.content.Context r2 = com.kwad.sdk.o.m.wrapContextIfNeed(r2)     // Catch: java.lang.Throwable -> L20
            com.kwad.components.core.e.a.g r4 = new com.kwad.components.core.e.a.g     // Catch: java.lang.Throwable -> L20
            r4.<init>(r2, r6, r5)     // Catch: java.lang.Throwable -> L20
            r5.Oy = r4     // Catch: java.lang.Throwable -> L20
            com.kwad.sdk.core.c.b.Ho()     // Catch: java.lang.Throwable -> L20
            com.kwad.sdk.core.c.c<android.app.Activity> r6 = r5.An     // Catch: java.lang.Throwable -> L20
            com.kwad.sdk.core.c.b.a(r6)     // Catch: java.lang.Throwable -> L20
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Throwable -> L20
            r5.qT = r3     // Catch: java.lang.Throwable -> L20
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L20
            r2 = -1
            r6.<init>(r2, r2)     // Catch: java.lang.Throwable -> L20
            android.view.ViewGroup r2 = r5.qT     // Catch: java.lang.Throwable -> L20
            com.kwad.components.core.e.a.g r3 = r5.Oy     // Catch: java.lang.Throwable -> L20
            r2.addView(r3, r6)     // Catch: java.lang.Throwable -> L20
            r7.oI()     // Catch: java.lang.Throwable -> L20
            r6 = 1
            return r6
        L66:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            java.lang.String r7 = "showInWindow fail activity:"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L20
            r6.append(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L20
            com.kwad.sdk.core.d.c.d(r0, r6)     // Catch: java.lang.Throwable -> L20
            return r1
        L78:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "showInWindow fail error:"
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.kwad.sdk.core.d.c.d(r0, r7)
            com.kwad.sdk.core.d.c.printStackTrace(r6)
            return r1
    }

    @Override // com.kwad.components.core.e.a.d
    public final void oJ() {
            r0 = this;
            r0.fZ()
            return
    }
}
