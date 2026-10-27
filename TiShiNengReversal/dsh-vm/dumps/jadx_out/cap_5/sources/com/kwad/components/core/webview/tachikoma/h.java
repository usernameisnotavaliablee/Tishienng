package com.kwad.components.core.webview.tachikoma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h {
    private final java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> afd;
    private java.util.Map<java.lang.String, java.lang.Integer> afe;
    private int aff;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.core.webview.tachikoma.h afg = null;

        static {
                com.kwad.components.core.webview.tachikoma.h r0 = new com.kwad.components.core.webview.tachikoma.h
                r0.<init>()
                com.kwad.components.core.webview.tachikoma.h.a.afg = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.webview.tachikoma.h uT() {
                com.kwad.components.core.webview.tachikoma.h r0 = com.kwad.components.core.webview.tachikoma.h.a.afg
                return r0
        }
    }

    public h() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.afd = r0
            java.util.concurrent.ConcurrentSkipListMap r0 = new java.util.concurrent.ConcurrentSkipListMap
            r0.<init>()
            r1.afe = r0
            r0 = 0
            r1.aff = r0
            return
    }

    private static int ba(java.lang.String r0) {
            int r0 = r0.length()
            int r0 = r0 * 2
            int r0 = r0 + 44
            int r0 = r0 / 1024
            return r0
    }

    private void bh(int r5) {
            r4 = this;
            int r0 = r4.aff
            int r0 = r0 + r5
            com.kwad.sdk.core.config.item.k r1 = com.kwad.sdk.core.config.c.aBz
            int r1 = com.kwad.sdk.core.config.e.a(r1)
            if (r0 <= r1) goto L61
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r4.afe
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r0.add(r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r4.aff
            int r3 = r3 - r2
            r4.aff = r3
            r1.remove()
            int r2 = r4.aff
            com.kwad.sdk.core.config.item.k r3 = com.kwad.sdk.core.config.c.aBz
            int r3 = com.kwad.sdk.core.config.e.a(r3)
            int r3 = r3 - r5
            if (r2 <= r3) goto L4b
            goto L1a
        L4b:
            java.util.Iterator r5 = r0.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r1 = r4.afd
            r1.remove(r0)
            goto L4f
        L61:
            return
    }

    private void r(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            int r3 = ba(r3)
            int r0 = r1.aff
            int r0 = r0 + r3
            r1.aff = r0
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.afe
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public static com.kwad.components.core.webview.tachikoma.h uS() {
            com.kwad.components.core.webview.tachikoma.h r0 = com.kwad.components.core.webview.tachikoma.h.a.uT()
            return r0
    }

    public final void b(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4c
            com.kwad.sdk.core.config.item.k r0 = com.kwad.sdk.core.config.c.aBz
            int r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 != 0) goto Lf
            goto L4c
        Lf:
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r0 = r2.afd
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L31
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r0 = r2.afd
            java.lang.Object r0 = r0.get(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L2c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L2c
            goto L4c
        L2c:
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r0 = r2.afd
            r0.remove(r3)
        L31:
            int r0 = ba(r5)
            r2.bh(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r5)
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r4 = r2.afd
            r4.put(r3, r0)
            r2.r(r3, r5)
        L4c:
            return
    }

    public final java.lang.String n(java.lang.String r3, int r4) {
            r2 = this;
            com.kwad.sdk.core.config.item.k r0 = com.kwad.sdk.core.config.c.aBz
            int r0 = com.kwad.sdk.core.config.e.a(r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r0 = r2.afd
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L32
            java.util.Map<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.String>> r0 = r2.afd
            java.lang.Object r3 = r0.get(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            if (r3 == 0) goto L32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L32
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L32:
            return r1
    }
}
