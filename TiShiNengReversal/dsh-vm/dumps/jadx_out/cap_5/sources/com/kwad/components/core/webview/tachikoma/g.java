package com.kwad.components.core.webview.tachikoma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g {
    private final java.util.Map<java.lang.String, com.kwad.components.core.webview.tachikoma.g.a> aeS;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public com.kwad.components.core.webview.tachikoma.i aeX;
        public boolean aeY;
        public java.util.List<com.kwad.components.core.webview.tachikoma.g.b> aeZ;



        a(com.kwad.components.core.webview.tachikoma.i r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.aeZ = r0
                r1.aeX = r2
                return
        }

        public final void a(com.kwad.components.core.webview.tachikoma.g.b r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.List<com.kwad.components.core.webview.tachikoma.g$b> r0 = r1.aeZ
                r0.add(r2)
            L7:
                return
        }

        public final void aZ(java.lang.String r2) {
                r1 = this;
                com.kwad.components.core.webview.tachikoma.g$a$1 r0 = new com.kwad.components.core.webview.tachikoma.g$a$1
                r0.<init>(r1, r2)
                com.kwad.sdk.utils.bw.postOnUiThread(r0)
                return
        }

        public final void uQ() {
                r1 = this;
                com.kwad.components.core.webview.tachikoma.g$a$2 r0 = new com.kwad.components.core.webview.tachikoma.g$a$2
                r0.<init>(r1)
                com.kwad.sdk.utils.bw.postOnUiThread(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void onFailed(java.lang.String r1);

        void onSuccess();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c {
        private static final com.kwad.components.core.webview.tachikoma.g afc = null;

        static {
                com.kwad.components.core.webview.tachikoma.g r0 = new com.kwad.components.core.webview.tachikoma.g
                r0.<init>()
                com.kwad.components.core.webview.tachikoma.g.c.afc = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.webview.tachikoma.g uR() {
                com.kwad.components.core.webview.tachikoma.g r0 = com.kwad.components.core.webview.tachikoma.g.c.afc
                return r0
        }
    }

    public g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.aeS = r0
            return
    }

    private void a(android.content.Context r4, com.kwad.components.offline.api.tk.model.StyleTemplate r5, com.kwad.components.core.webview.tachikoma.g.b r6) {
            r3 = this;
            java.lang.String r0 = r5.templateId
            if (r0 != 0) goto Lc
            if (r6 == 0) goto L26
            java.lang.String r4 = "no bundle"
            r6.onFailed(r4)
            return
        Lc:
            java.util.Map<java.lang.String, com.kwad.components.core.webview.tachikoma.g$a> r1 = r3.aeS
            java.lang.Object r1 = r1.get(r0)
            com.kwad.components.core.webview.tachikoma.g$a r1 = (com.kwad.components.core.webview.tachikoma.g.a) r1
            if (r1 == 0) goto L2b
            boolean r4 = r1.aeY
            if (r4 == 0) goto L27
            java.lang.String r4 = "KSAdTKBundleService"
            java.lang.String r5 = "load bundle finish: already load"
            com.kwad.sdk.core.d.c.d(r4, r5)
            if (r6 == 0) goto L26
            r6.onSuccess()
        L26:
            return
        L27:
            r1.a(r6)
            return
        L2b:
            com.kwad.components.core.webview.tachikoma.i r1 = new com.kwad.components.core.webview.tachikoma.i
            r2 = 0
            r1.<init>(r4, r2)
            java.lang.String r4 = "isService"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.a(r4, r2)
            com.kwad.components.core.webview.tachikoma.g$a r4 = new com.kwad.components.core.webview.tachikoma.g$a
            r4.<init>(r1)
            r4.a(r6)
            r1.a(r5)
            com.kwad.components.core.webview.tachikoma.g$2 r6 = new com.kwad.components.core.webview.tachikoma.g$2
            r6.<init>(r3, r5, r4, r0)
            r5 = 0
            r1.a(r5, r5, r6)
            java.util.Map<java.lang.String, com.kwad.components.core.webview.tachikoma.g$a> r5 = r3.aeS
            r5.put(r0, r4)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.g r0, android.content.Context r1) {
            r0.aE(r1)
            return
    }

    private void aE(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "KSAdTKBundleService"
            java.lang.String r1 = "begin load all services"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.sdk.core.response.model.SdkConfigData r0 = com.kwad.sdk.core.config.e.Fw()
            if (r6 != 0) goto Le
            goto L45
        Le:
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r1 = "appConfig"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 != 0) goto L1b
            goto L45
        L1b:
            java.lang.String r1 = "tkServiceConfigs"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            if (r0 != 0) goto L24
            goto L45
        L24:
            r1 = 0
        L25:
            int r2 = r0.length()
            if (r1 >= r2) goto L45
            com.kwad.components.offline.api.tk.model.BundleServiceConfig r2 = new com.kwad.components.offline.api.tk.model.BundleServiceConfig
            r2.<init>()
            org.json.JSONObject r3 = r0.optJSONObject(r1)
            r2.parseJson(r3)
            int r3 = r2.loadType
            r4 = 1
            if (r3 != r4) goto L42
            java.lang.String r2 = r2.bundleName
            r3 = 0
            r5.b(r6, r2, r3)
        L42:
            int r1 = r1 + 1
            goto L25
        L45:
            return
    }

    private static boolean isLocalDebugEnable() {
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            r0 = 0
            return r0
    }

    public static com.kwad.components.core.webview.tachikoma.g uP() {
            com.kwad.components.core.webview.tachikoma.g r0 = com.kwad.components.core.webview.tachikoma.g.c.uR()
            return r0
    }

    public final void a(android.content.Context r4, java.lang.String r5, com.kwad.components.core.webview.tachikoma.g.b r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lc
            java.lang.String r4 = "invalid bundle string"
            r6.onFailed(r4)
            return
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = new com.kwad.components.offline.api.tk.model.StyleTemplate     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            r1.parseJson(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r1.templateId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = r1.templateUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3a
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid bundle:"
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.onFailed(r5)
        L3a:
            r3.a(r4, r1, r6)
            return
        L3e:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            r6.onFailed(r4)
            return
    }

    public final void b(android.content.Context r7, java.lang.String r8, com.kwad.components.core.webview.tachikoma.g.b r9) {
            r6 = this;
            boolean r0 = isLocalDebugEnable()
            if (r0 == 0) goto L9
            r6.unloadBundle(r8)
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "load bundle:"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KSAdTKBundleService"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L2f
            java.lang.String r7 = "load bundle fail: invalid bundle name"
            com.kwad.sdk.core.d.c.d(r1, r7)
            if (r9 == 0) goto La7
            java.lang.String r7 = "invalid bundle name"
            r9.onFailed(r7)
            return
        L2f:
            com.kwad.sdk.core.response.model.SdkConfigData r0 = com.kwad.sdk.core.config.e.Fw()
            if (r0 != 0) goto L42
            java.lang.String r7 = "load bundle fail: config data empty"
            com.kwad.sdk.core.d.c.d(r1, r7)
            if (r9 == 0) goto La7
            java.lang.String r7 = "config data empty"
            r9.onFailed(r7)
            return
        L42:
            if (r7 != 0) goto L51
            java.lang.String r7 = "load bundle fail: no context"
            com.kwad.sdk.core.d.c.d(r1, r7)
            if (r9 == 0) goto La7
            java.lang.String r7 = "no context"
            r9.onFailed(r7)
            return
        L51:
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r2 = "styleTemplatesConfig"
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            r2 = 0
            if (r0 != 0) goto L60
            r0 = r2
            goto L66
        L60:
            java.lang.String r3 = "styleTemplates"
            org.json.JSONArray r0 = r0.optJSONArray(r3)
        L66:
            if (r0 == 0) goto L8a
            r3 = 0
        L69:
            int r4 = r0.length()
            if (r3 >= r4) goto L8a
            com.kwad.components.offline.api.tk.model.StyleTemplate r4 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r4.<init>()
            org.json.JSONObject r5 = r0.optJSONObject(r3)
            r4.parseJson(r5)
            java.lang.String r5 = r4.templateId
            if (r5 == 0) goto L87
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L87
            r2 = r4
            goto L8a
        L87:
            int r3 = r3 + 1
            goto L69
        L8a:
            boolean r0 = isLocalDebugEnable()
            if (r0 == 0) goto L99
            if (r2 != 0) goto L99
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r2.<init>()
            r2.templateId = r8
        L99:
            if (r2 != 0) goto La8
            java.lang.String r7 = "load bundle fail: no bundle"
            com.kwad.sdk.core.d.c.d(r1, r7)
            if (r9 == 0) goto La7
            java.lang.String r7 = "no bundle"
            r9.onFailed(r7)
        La7:
            return
        La8:
            r6.a(r7, r2, r9)
            return
    }

    public final void init() {
            r2 = this;
            java.lang.Class<com.kwad.components.core.o.a.e.b> r0 = com.kwad.components.core.o.a.e.b.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.o.a.e.b r0 = (com.kwad.components.core.o.a.e.b) r0     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            com.kwad.components.core.webview.tachikoma.g$1 r1 = new com.kwad.components.core.webview.tachikoma.g$1     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r0.a(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto L16
        L15:
            return
        L16:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    public final void unloadBundle(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.kwad.components.core.webview.tachikoma.g$a> r0 = r2.aeS
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unload bundle"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KSAdTKBundleService"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.util.Map<java.lang.String, com.kwad.components.core.webview.tachikoma.g$a> r0 = r2.aeS
            java.lang.Object r0 = r0.get(r3)
            com.kwad.components.core.webview.tachikoma.g$a r0 = (com.kwad.components.core.webview.tachikoma.g.a) r0
            if (r0 == 0) goto L2a
            com.kwad.components.core.webview.tachikoma.i r0 = r0.aeX
            r0.kz()
        L2a:
            java.util.Map<java.lang.String, com.kwad.components.core.webview.tachikoma.g$a> r0 = r2.aeS
            r0.remove(r3)
        L2f:
            return
    }
}
