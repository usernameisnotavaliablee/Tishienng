package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L16
            int r1 = r1.getType()
            if (r1 != 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static boolean b(android.content.Context r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L15
            boolean r1 = r1.isAvailable()
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean c(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L16
            int r1 = r1.getType()
            r0 = 1
            if (r1 != r0) goto L16
            return r0
        L16:
            r1 = 0
            return r1
    }
}
