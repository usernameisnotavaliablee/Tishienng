package com.kwad.components.core.webview.tachikoma.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private java.util.List<java.lang.Integer> ahH;
    private final java.util.List<java.lang.Integer> ahI;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.webview.tachikoma.e.a$a, reason: collision with other inner class name */
    static class C0103a {
        private static final com.kwad.components.core.webview.tachikoma.e.a ahM = null;

        static {
                com.kwad.components.core.webview.tachikoma.e.a r0 = new com.kwad.components.core.webview.tachikoma.e.a
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.webview.tachikoma.e.a.C0103a.ahM = r0
                return
        }

        public C0103a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.webview.tachikoma.e.a vL() {
                com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.C0103a.ahM
                return r0
        }
    }

    private a() {
            r8 = this;
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.ahH = r0
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 185(0xb9, float:2.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 199(0xc7, float:2.79E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 6
            java.lang.Integer[] r6 = new java.lang.Integer[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            java.util.List r0 = java.util.Arrays.asList(r6)
            r8.ahI = r0
            return
    }

    /* synthetic */ a(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.e.a r0, int r1) {
            r0.bl(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.e.a r0, java.lang.String r1) {
            r0.bh(r1)
            return
    }

    private void bh(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc
            r0.<init>(r3)     // Catch: java.lang.Exception -> Lc
            java.lang.String r3 = "elementType"
            int r3 = r0.optInt(r3)     // Catch: java.lang.Exception -> Lc
            goto Lf
        Lc:
            r3 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            java.util.List<java.lang.Integer> r0 = r2.ahI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1c
            return
        L1c:
            java.util.List<java.lang.Integer> r0 = r2.ahH
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            return
    }

    private void bl(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.ahI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.util.List<java.lang.Integer> r0 = r2.ahH
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            return
    }

    public static com.kwad.components.core.webview.tachikoma.e.a vI() {
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.C0103a.vL()
            return r0
    }

    public final void bi(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.components.core.webview.tachikoma.e.a$2 r0 = new com.kwad.components.core.webview.tachikoma.e.a$2
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void bm(int r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.e.a$1 r0 = new com.kwad.components.core.webview.tachikoma.e.a$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final java.util.List<java.lang.Integer> vJ() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.ahH
            return r0
    }

    public final void vK() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.ahH
            r0.clear()
            return
    }
}
