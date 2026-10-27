package t2;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.net.Uri a(android.content.Context r5, java.lang.String r6) {
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r0 = "persit.sys.tid"
            java.lang.String r5 = android.provider.Settings.System.getString(r5, r0)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            boolean r1 = com.ss.android.socialbase.appdownloader.m.e.g()
            java.lang.String r2 = "details"
            r3 = 1
            if (r1 == 0) goto L39
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r4 = "enable_honor_market_scheme_opt"
            int r1 = r1.optInt(r4, r3)
            if (r1 != r3) goto L39
            java.lang.String r5 = "honormarket"
            android.net.Uri$Builder r5 = r0.scheme(r5)
            android.net.Uri$Builder r5 = r5.authority(r2)
            java.lang.String r0 = "id"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r0, r6)
            android.net.Uri r5 = r5.build()
            return r5
        L39:
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L60
            org.json.JSONObject r5 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "enable_persit_market_scheme_opt"
            int r5 = r5.optInt(r1, r3)
            if (r5 != r3) goto L60
            java.lang.String r5 = "prizeappcenter"
            android.net.Uri$Builder r5 = r0.scheme(r5)
            android.net.Uri$Builder r5 = r5.authority(r2)
            java.lang.String r0 = "pkg"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r0, r6)
            android.net.Uri r5 = r5.build()
            return r5
        L60:
            java.lang.String r5 = "market://details?id="
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r5.concat(r6)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            return r5
    }

    public static boolean b(android.net.Uri r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r2 = "market_url_opt"
            r3 = 1
            int r1 = r1.optInt(r2, r3)
            java.lang.String r2 = "market"
            if (r1 != 0) goto L23
            boolean r4 = r2.equals(r4)
            return r4
        L23:
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "appmarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "oaps"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "oppomarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "mimarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "vivomarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "vivoMarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "gomarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "goMarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "mstore"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "samsungapps"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "honormarket"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "prizeappcenter"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8a
            goto L8b
        L8a:
            return r0
        L8b:
            return r3
    }

    public static java.lang.String c(@androidx.annotation.NonNull android.net.Uri r5) {
            java.lang.String r0 = r5.getScheme()
            java.util.List r1 = r5.getPathSegments()
            org.json.JSONObject r2 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r3 = "market_scheme_opt"
            int r2 = r2.optInt(r3)
            r3 = 1
            if (r2 != r3) goto L33
            boolean r2 = com.ss.android.socialbase.appdownloader.m.e.a()
            if (r2 == 0) goto L33
            java.lang.String r2 = "samsungapps"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L33
            if (r1 == 0) goto L33
            int r0 = r1.size()
            if (r0 != r3) goto L33
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L33:
            java.lang.String r0 = "id"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.String r1 = "packagename"
            java.lang.String r1 = r5.getQueryParameter(r1)
            java.lang.String r2 = "pkg"
            java.lang.String r2 = r5.getQueryParameter(r2)
            java.lang.String r3 = "package_name"
            java.lang.String r3 = r5.getQueryParameter(r3)
            java.lang.String r4 = "appId"
            java.lang.String r5 = r5.getQueryParameter(r4)
            java.lang.String[] r5 = new java.lang.String[]{r0, r1, r2, r3, r5}
            java.lang.String r5 = t2.b.b(r5)
            return r5
    }
}
