package com.kwai.library.ipneigh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b {
    private static final java.util.regex.Pattern bfl = null;

    static {
            java.lang.String r0 = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.kwai.library.ipneigh.b.bfl = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    public static java.lang.String fl(int r5) {
            r0 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r5 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            java.lang.String r5 = "%d.%d.%d.%d"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            return r5
    }

    private static boolean hS(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.regex.Pattern r0 = com.kwai.library.ipneigh.b.bfl
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    public static java.lang.String hT(java.lang.String r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "\\s+"
            java.lang.String[] r3 = r3.split(r1)
            int r1 = r3.length
            r2 = 5
            if (r1 >= r2) goto L10
            return r0
        L10:
            r1 = 4
            r2 = r3[r1]
            boolean r2 = hS(r2)
            if (r2 != 0) goto L1a
            return r0
        L1a:
            r3 = r3[r1]
            return r3
    }

    public static boolean isWifiConnected(android.content.Context r2) {
            r0 = 0
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L1f
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Exception -> L1f
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Exception -> L1f
            r1 = 1
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r1)     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L1f
            boolean r2 = r2.isConnected()     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L1f
            return r1
        L1f:
            return r0
    }
}
