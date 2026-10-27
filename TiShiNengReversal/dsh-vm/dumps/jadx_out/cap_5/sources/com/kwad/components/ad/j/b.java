package com.kwad.components.ad.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.commercial.c.a {
        public java.lang.String LM;
        public java.lang.String LN;
        public java.lang.String LO;
        public java.lang.String LP;
        public java.lang.String LQ;
        public java.lang.String LR;
        public java.lang.String LS;
        public int status;

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = com.kwad.sdk.utils.br.RT()
                r1.LM = r0
                java.lang.String r0 = com.kwad.sdk.utils.br.RV()
                r1.LN = r0
                java.lang.String r0 = com.kwad.sdk.utils.br.getOsVersion()
                r1.LO = r0
                java.lang.String r0 = com.kwad.sdk.utils.br.Sb()
                r1.LP = r0
                java.lang.String r0 = com.kwad.sdk.utils.bd.getDeviceId()
                r1.LQ = r0
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void ak(android.content.Context r5) {
            r5.getPackageManager()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "content://com.kwad.kwadsdk.adFileProvider/ksad_external_files_path/Download/test.apk"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "application/vnd.android.package-archive"
            r0.setDataAndType(r1, r2)
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r1 = 131072(0x20000, float:1.83671E-40)
            java.util.List r5 = r5.queryIntentActivities(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "reportDeviceLocalInstaller installers size: "
            r0.<init>(r1)
            int r1 = r5.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InstallerCheckReport"
            com.kwad.sdk.core.d.c.d(r1, r0)
            int r0 = r5.size()
            if (r0 > 0) goto L3d
            return
        L3d:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L92
            r0.<init>()     // Catch: java.lang.Exception -> L92
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L92
        L46:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L92
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L92
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            java.lang.String r4 = "reportDeviceLocalInstaller info: "
            r3.<init>(r4)     // Catch: java.lang.Exception -> L92
            r3.append(r2)     // Catch: java.lang.Exception -> L92
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L92
            com.kwad.sdk.core.d.c.d(r1, r3)     // Catch: java.lang.Exception -> L92
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = r2.packageName     // Catch: java.lang.Exception -> L92
            r0.put(r2)     // Catch: java.lang.Exception -> L92
            goto L46
        L6b:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L92
            com.kwad.components.ad.j.b$a r0 = new com.kwad.components.ad.j.b$a     // Catch: java.lang.Exception -> L92
            r0.<init>()     // Catch: java.lang.Exception -> L92
            r2 = 2
            r0.status = r2     // Catch: java.lang.Exception -> L92
            r0.LS = r5     // Catch: java.lang.Exception -> L92
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = "reportDeviceLocalInstaller: "
            r5.<init>(r2)     // Catch: java.lang.Exception -> L92
            org.json.JSONObject r2 = r0.toJson()     // Catch: java.lang.Exception -> L92
            r5.append(r2)     // Catch: java.lang.Exception -> L92
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L92
            com.kwad.sdk.core.d.c.d(r1, r5)     // Catch: java.lang.Exception -> L92
            com.kwad.sdk.commercial.b.x(r0)     // Catch: java.lang.Exception -> L92
            return
        L92:
            r5 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r5)
            return
    }

    public static void al(android.content.Context r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = "SP_OPEN_FILE_RECORD"
            java.lang.String r0 = b(r5, r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "reportInstallerCheckRecord start installCheckRecord: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "InstallerCheckReport"
            com.kwad.sdk.core.d.c.d(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L22
            return
        L22:
            com.kwad.components.ad.j.b$a r2 = new com.kwad.components.ad.j.b$a
            r2.<init>()
            r4 = 1
            r2.status = r4
            r2.LR = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "reportInstallerCheckRecord report msg:"
            r0.<init>(r4)
            org.json.JSONObject r4 = r2.toJson()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r3, r0)
            com.kwad.sdk.commercial.b.x(r2)
            g(r5, r1)
            return
    }

    private static java.lang.String b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "kssdk_api_pref"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            return r4
    }

    private static void g(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "kssdk_api_pref"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L12
            r2.apply()     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }
}
