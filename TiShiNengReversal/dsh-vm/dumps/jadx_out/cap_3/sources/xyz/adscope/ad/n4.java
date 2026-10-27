package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class n4 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements xyz.adscope.ad.p3 {
        private final xyz.adscope.ad.n4.b a;

        private c(xyz.adscope.ad.n4.b r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ c(xyz.adscope.ad.n4.b r1, xyz.adscope.ad.n4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.p3
        public void a() {
                r1 = this;
                xyz.adscope.ad.n4$b r0 = r1.a
                if (r0 == 0) goto L7
                r0.a()
            L7:
                return
        }
    }

    public n4() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.content.Intent a(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto La7
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.setAction(r1)
            java.lang.String r1 = "android.intent.category.LAUNCHER"
            r0.addCategory(r1)
            java.lang.String r1 = "flags"
            java.lang.String r1 = r6.getQueryParameter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 2
            if (r2 != 0) goto L4e
            java.lang.String r2 = "0x"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.NumberFormatException -> L3f
            if (r2 != 0) goto L41
            java.lang.String r2 = "0X"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.NumberFormatException -> L3f
            if (r2 == 0) goto L37
            goto L41
        L37:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L3f
            r0.setFlags(r1)     // Catch: java.lang.NumberFormatException -> L3f
            goto L4e
        L3f:
            goto L4e
        L41:
            java.lang.String r1 = r1.substring(r3)     // Catch: java.lang.NumberFormatException -> L3f
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch: java.lang.NumberFormatException -> L3f
            r0.setFlags(r1)     // Catch: java.lang.NumberFormatException -> L3f
        L4e:
            java.lang.String r1 = r6.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto La7
            android.content.ComponentName r2 = new android.content.ComponentName
            java.util.List r4 = r6.getPathSegments()
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r1, r4)
            r0.setComponent(r2)
            java.lang.String r1 = "rect"
            java.lang.String r6 = r6.getQueryParameter(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto La6
            java.lang.String r1 = ":"
            java.lang.String[] r6 = r6.split(r1)     // Catch: java.lang.NumberFormatException -> La6
            int r1 = r6.length     // Catch: java.lang.NumberFormatException -> La6
            r2 = 4
            if (r1 != r2) goto La6
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.NumberFormatException -> La6
            r1.<init>()     // Catch: java.lang.NumberFormatException -> La6
            r2 = r6[r5]     // Catch: java.lang.NumberFormatException -> La6
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> La6
            r4 = 1
            r4 = r6[r4]     // Catch: java.lang.NumberFormatException -> La6
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> La6
            r3 = r6[r3]     // Catch: java.lang.NumberFormatException -> La6
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> La6
            r5 = 3
            r6 = r6[r5]     // Catch: java.lang.NumberFormatException -> La6
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> La6
            r1.set(r2, r4, r3, r6)     // Catch: java.lang.NumberFormatException -> La6
            r0.setSourceBounds(r1)     // Catch: java.lang.NumberFormatException -> La6
        La6:
            return r0
        La7:
            r6 = 0
            return r6
    }

    private static android.content.Intent a(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L45
            boolean r0 = b(r3)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 == 0) goto L1e
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r4.setData(r3)
            r4.setFlags(r1)
            return r4
        L1e:
            boolean r0 = c(r3)
            if (r0 == 0) goto L2d
            r4 = 1
            android.content.Intent r3 = android.content.Intent.parseUri(r3, r4)     // Catch: java.net.URISyntaxException -> L45
            r3.setFlags(r1)     // Catch: java.net.URISyntaxException -> L45
            return r3
        L2d:
            android.content.Intent r0 = new android.content.Intent
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2, r3)
            r0.setFlags(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L44
            r0.setPackage(r4)
        L44:
            return r0
        L45:
            r3 = 0
            return r3
    }

    public static void a(android.content.Context r1, android.content.Intent r2, android.content.ServiceConnection r3) {
            r0 = 1
            r1.bindService(r2, r3, r0)
            return
    }

    public static void a(android.content.Context r2, android.content.ServiceConnection r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<xyz.adscope.ad.download.service.DownloadService> r1 = xyz.adscope.ad.download.service.DownloadService.class
            r0.<init>(r2, r1)
            d(r2, r0)
            a(r2, r0, r3)
            return
    }

    private static boolean a(android.content.Context r1, android.content.Intent r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 65536(0x10000, float:9.1835E-41)
            java.util.List r1 = r1.queryIntentActivities(r2, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    public static boolean a(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            boolean r1 = a(r1, r2, r0)
            return r1
    }

    public static boolean a(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1c
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<xyz.adscope.ad.widget.activity.ASNPLandingPageActivity> r1 = xyz.adscope.ad.widget.activity.ASNPLandingPageActivity.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "url"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "ext"
            r0.putExtra(r3, r4)
            boolean r2 = c(r2, r0)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public static boolean a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1d
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L1d
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity> r0 = xyz.adscope.ad.widget.activity.ASNPDownloadPromptActivity.class
            r2.<init>(r1, r0)
            java.lang.String r0 = "download_info_key"
            r2.putExtra(r0, r3)
            boolean r1 = b(r1, r2)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    public static boolean a(android.content.Context r2, java.lang.String r3, java.lang.String r4, xyz.adscope.ad.n4.b r5) {
            if (r5 == 0) goto L5
            r5.d()
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L4d
            android.content.Intent r4 = a(r3, r4)
            boolean r0 = a(r2, r4)
            if (r0 == 0) goto L1b
            if (r5 == 0) goto L20
            r5.c()
            goto L20
        L1b:
            if (r5 == 0) goto L20
            r5.b()
        L20:
            boolean r0 = d(r3)
            if (r0 == 0) goto L2a
            android.content.Intent r4 = a(r3)
        L2a:
            xyz.adscope.ad.v r3 = xyz.adscope.ad.v.a()
            xyz.adscope.ad.o3 r3 = r3.b()
            xyz.adscope.ad.n4$c r0 = new xyz.adscope.ad.n4$c
            r1 = 0
            r0.<init>(r5, r1)
            r3.a(r0)
            boolean r2 = b(r2, r4)
            if (r2 == 0) goto L47
            if (r5 == 0) goto L4c
            r5.e()
            return r2
        L47:
            if (r5 == 0) goto L4c
            r5.f()
        L4c:
            return r2
        L4d:
            r2 = 0
            return r2
    }

    public static boolean a(android.content.Context r3, java.lang.String r4, xyz.adscope.ad.c r5, java.lang.String r6, java.lang.String r7) {
            xyz.adscope.ad.c r0 = xyz.adscope.ad.c.f
            if (r5 != r0) goto L7
            java.lang.Class<xyz.adscope.ad.widget.activity.ASNPAdActivity> r0 = xyz.adscope.ad.widget.activity.ASNPAdActivity.class
            goto L8
        L7:
            r0 = 0
        L8:
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.g
            if (r5 != r1) goto Le
            java.lang.Class<xyz.adscope.ad.widget.activity.ASNPRewardVideoActivity> r0 = xyz.adscope.ad.widget.activity.ASNPRewardVideoActivity.class
        Le:
            if (r0 == 0) goto L3c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "SpaceId"
            r0.putString(r2, r4)
            java.lang.String r4 = r5.c()
            java.lang.String r5 = "AdType"
            r0.putString(r5, r4)
            java.lang.String r4 = "consumeId"
            r0.putString(r4, r6)
            java.lang.String r4 = "apiKey"
            r0.putString(r4, r7)
            java.lang.String r4 = "AdBundle"
            r1.putExtra(r4, r0)
            boolean r3 = c(r3, r1)
            return r3
        L3c:
            r3 = 0
            return r3
    }

    public static boolean a(android.content.Context r1, java.lang.String r2, xyz.adscope.ad.n4.b r3) {
            r0 = 0
            boolean r1 = a(r1, r2, r0, r3)
            return r1
    }

    private static boolean b(android.content.Context r0, android.content.Intent r1) {
            if (r1 == 0) goto L7
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static boolean b(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "hwpps://landingpage"
            boolean r1 = r1.startsWith(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static boolean c(android.content.Context r1, android.content.Intent r2) {
            if (r2 == 0) goto Lc
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r0)
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static boolean c(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "intent://"
            boolean r1 = r1.startsWith(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static void d(android.content.Context r0, android.content.Intent r1) {
            r0.startService(r1)
            return
    }

    private static boolean d(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L34
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = r3.getHost()
            java.util.List r3 = r3.getPathSegments()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L34
            java.lang.String r2 = "bzopen"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L34
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L34
            if (r3 == 0) goto L34
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L34
            r3 = 1
            return r3
        L34:
            r3 = 0
            return r3
    }
}
