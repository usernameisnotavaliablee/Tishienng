package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s {
    public s() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0 = 1
            android.net.NetworkInfo r1 = r1.getNetworkInfo(r0)
            boolean r1 = r1.isConnected()
            return r1
    }

    public static com.beizi.ad.model.f.d b(android.content.Context r2) {
            if (r2 != 0) goto L5
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7448f
            return r2
        L5:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L62
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L62
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L5f
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L5f
            int r0 = r2.getType()     // Catch: java.lang.Throwable -> L62
            r1 = 1
            if (r1 != r0) goto L27
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7447e     // Catch: java.lang.Throwable -> L62
            return r2
        L27:
            if (r0 != 0) goto L5f
            int r0 = r2.getSubtype()     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r2.getSubtypeName()     // Catch: java.lang.Throwable -> L62
            switch(r0) {
                case 1: goto L5c;
                case 2: goto L5c;
                case 3: goto L59;
                case 4: goto L5c;
                case 5: goto L59;
                case 6: goto L59;
                case 7: goto L5c;
                case 8: goto L59;
                case 9: goto L59;
                case 10: goto L59;
                case 11: goto L5c;
                case 12: goto L59;
                case 13: goto L56;
                case 14: goto L59;
                case 15: goto L59;
                case 16: goto L5c;
                case 17: goto L59;
                case 18: goto L56;
                case 19: goto L34;
                case 20: goto L53;
                default: goto L34;
            }     // Catch: java.lang.Throwable -> L62
        L34:
            java.lang.String r0 = "TD-SCDMA"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L50
            java.lang.String r0 = "WCDMA"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L50
            java.lang.String r0 = "CDMA2000"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L4d
            goto L50
        L4d:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7448f     // Catch: java.lang.Throwable -> L62
            return r2
        L50:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7444b     // Catch: java.lang.Throwable -> L62
            return r2
        L53:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7446d     // Catch: java.lang.Throwable -> L62
            return r2
        L56:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7445c     // Catch: java.lang.Throwable -> L62
            return r2
        L59:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7444b     // Catch: java.lang.Throwable -> L62
            return r2
        L5c:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7449g     // Catch: java.lang.Throwable -> L62
            return r2
        L5f:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7448f
            return r2
        L62:
            com.beizi.ad.model.f$d r2 = com.beizi.ad.model.f.d.f7448f
            return r2
    }
}
