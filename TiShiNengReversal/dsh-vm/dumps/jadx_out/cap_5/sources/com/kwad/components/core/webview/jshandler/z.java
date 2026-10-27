package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class z implements com.kwad.sdk.core.webview.c.a {

    @androidx.annotation.Nullable
    private android.content.DialogInterface.OnDismissListener AX;
    private int acI;
    private boolean acJ;
    private final boolean acK;
    private boolean acL;
    private java.util.List<com.kwad.components.core.e.d.c> acM;
    private boolean acN;
    protected final com.kwad.sdk.core.webview.b acw;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.d.a.a eT;



    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r9, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r10, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r11) {
            r8 = this;
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r9, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r10, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r11, int r12) {
            r8 = this;
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r9, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r10, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r11, int r12, boolean r13) {
            r8 = this;
            r5 = 2
            r7 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r9, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r10, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r11, @androidx.annotation.Nullable android.content.DialogInterface.OnDismissListener r12) {
            r8 = this;
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.AX = r12
            return
    }

    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r9, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r10, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r11, boolean r12) {
            r8 = this;
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            r0.acL = r9
            return
    }

    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r2, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r3, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r4, boolean r5, int r6, boolean r7, boolean r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.acJ = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.acM = r0
            r1.acJ = r5
            r1.acw = r2
            r1.acI = r6
            if (r3 == 0) goto L1e
            r2 = 1
            r3.aG(r2)
            java.util.List<com.kwad.components.core.e.d.c> r2 = r1.acM
            r2.add(r3)
        L1e:
            r1.eT = r4
            r1.acK = r7
            r1.acN = r8
            return
    }

    public z(@androidx.annotation.NonNull com.kwad.sdk.core.webview.b r9, @androidx.annotation.Nullable java.util.List<com.kwad.components.core.e.d.c> r10, @androidx.annotation.Nullable com.kwad.sdk.core.webview.d.a.a r11) {
            r8 = this;
            r6 = 0
            r7 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L12
            java.util.List<com.kwad.components.core.e.d.c> r9 = r0.acM
            r9.addAll(r10)
        L12:
            return
    }

    static /* synthetic */ java.util.List a(com.kwad.components.core.webview.jshandler.z r0) {
            java.util.List<com.kwad.components.core.e.d.c> r0 = r0.acM
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.webview.jshandler.z r0, com.kwad.sdk.core.webview.d.b.a r1) {
            boolean r0 = b(r1)
            return r0
    }

    static /* synthetic */ android.content.DialogInterface.OnDismissListener b(com.kwad.components.core.webview.jshandler.z r0) {
            android.content.DialogInterface$OnDismissListener r0 = r0.AX
            return r0
    }

    private static boolean b(com.kwad.sdk.core.webview.d.b.a r1) {
            int r1 = r1.adN
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.webview.d.a.a c(com.kwad.components.core.webview.jshandler.z r0) {
            com.kwad.sdk.core.webview.d.a.a r0 = r0.eT
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.core.webview.jshandler.z r0) {
            boolean r0 = r0.acL
            return r0
    }

    static /* synthetic */ boolean e(com.kwad.components.core.webview.jshandler.z r0) {
            boolean r0 = r0.acN
            return r0
    }

    static /* synthetic */ int f(com.kwad.components.core.webview.jshandler.z r0) {
            int r0 = r0.acI
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.core.webview.jshandler.z r0) {
            boolean r0 = r0.acK
            return r0
    }

    static /* synthetic */ boolean h(com.kwad.components.core.webview.jshandler.z r0) {
            boolean r0 = r0.acJ
            return r0
    }

    @androidx.annotation.Nullable
    protected final com.kwad.components.core.e.d.c Q(long r7) {
            r6 = this;
            java.util.List<com.kwad.components.core.e.d.c> r0 = r6.acM
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1d
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L1d
            java.util.List<com.kwad.components.core.e.d.c> r7 = r6.acM
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.kwad.components.core.e.d.c r7 = (com.kwad.components.core.e.d.c) r7
            return r7
        L1d:
            java.util.List<com.kwad.components.core.e.d.c> r0 = r6.acM
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            com.kwad.components.core.e.d.c r2 = (com.kwad.components.core.e.d.c) r2
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.pH()
            long r3 = com.kwad.sdk.core.response.b.e.ev(r3)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L23
            return r2
        L3c:
            return r1
    }

    protected void Y(int r1) {
            r0 = this;
            return
    }

    protected com.kwad.components.core.e.d.a.C0073a a(com.kwad.components.core.e.d.a.C0073a r5, com.kwad.sdk.core.webview.d.b.a r6, com.kwad.sdk.core.response.model.AdTemplate r7) {
            r4 = this;
            com.kwad.sdk.core.webview.d.b.d r0 = r6.adO
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.Pj
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L13
            com.kwad.sdk.core.webview.d.b.d r0 = r6.adO
            java.lang.String r0 = r0.Pj
            r5.am(r0)
        L13:
            com.kwad.sdk.core.webview.d.b.d r0 = r6.adO
            if (r0 == 0) goto L1e
            int r0 = r0.aha
            if (r0 == 0) goto L1e
            r5.aD(r0)
        L1e:
            boolean r7 = com.kwad.sdk.core.response.b.e.eE(r7)
            if (r7 == 0) goto L5a
            com.kwad.sdk.core.webview.d.b.d r7 = r6.adO
            if (r7 == 0) goto L5a
            com.kwad.sdk.core.webview.d.b.c r7 = r7.aNT
            if (r7 == 0) goto L5a
            com.kwad.sdk.utils.aj$a r7 = new com.kwad.sdk.utils.aj$a
            r7.<init>()
            com.kwad.sdk.core.webview.d.b.d r0 = r6.adO
            com.kwad.sdk.core.webview.d.b.c r0 = r0.aNT
            double r1 = r0.x
            float r1 = (float) r1
            double r2 = r0.y
            float r0 = (float) r2
            r7.f(r1, r0)
            com.kwad.sdk.core.webview.d.b.d r0 = r6.adO
            com.kwad.sdk.core.webview.d.b.c r0 = r0.aNT
            double r1 = r0.x
            float r1 = (float) r1
            double r2 = r0.y
            float r0 = (float) r2
            r7.e(r1, r0)
            com.kwad.sdk.core.webview.d.b.d r6 = r6.adO
            com.kwad.sdk.core.webview.d.b.c r6 = r6.aNT
            int r0 = r6.width
            int r6 = r6.height
            r7.B(r0, r6)
            r5.d(r7)
            goto L67
        L5a:
            com.kwad.sdk.core.webview.b r6 = r4.acw
            com.kwad.sdk.widget.g r6 = r6.aMN
            if (r6 == 0) goto L67
            com.kwad.sdk.utils.aj$a r6 = r6.getTouchCoords()
            r5.d(r6)
        L67:
            r6 = 0
            r5.a(r6, r6, r6)
            return r5
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.sdk.core.webview.d.b.a r0 = new com.kwad.sdk.core.webview.d.b.a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r1.<init>(r3)     // Catch: org.json.JSONException -> Le
            r0.parseJson(r1)     // Catch: org.json.JSONException -> Le
            goto L12
        Le:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r3)
        L12:
            com.kwad.sdk.core.webview.b r3 = r2.acw
            boolean r3 = r3.KJ()
            if (r3 == 0) goto L25
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.adTemplate
            if (r3 != 0) goto L25
            r3 = -1
            java.lang.String r0 = "native adTemplate is null"
            r4.onError(r3, r0)
            return
        L25:
            com.kwad.sdk.core.webview.b r3 = r2.acw
            boolean r3 = r3.aMP
            if (r3 == 0) goto L38
            boolean r3 = r0.aNQ
            if (r3 != 0) goto L38
            com.kwad.components.core.webview.jshandler.z$1 r3 = new com.kwad.components.core.webview.jshandler.z$1
            r3.<init>(r2, r0)
            com.kwad.sdk.utils.bw.runOnUiThread(r3)
            goto L44
        L38:
            com.kwad.sdk.core.webview.d.a.a r3 = r2.eT
            if (r3 == 0) goto L44
            com.kwad.components.core.webview.jshandler.z$2 r3 = new com.kwad.components.core.webview.jshandler.z$2
            r3.<init>(r2, r0)
            com.kwad.sdk.utils.bw.postOnUiThread(r3)
        L44:
            r3 = 0
            r4.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "clickAction"
            return r0
    }

    protected void kr() {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.eT = r0
            return
    }
}
