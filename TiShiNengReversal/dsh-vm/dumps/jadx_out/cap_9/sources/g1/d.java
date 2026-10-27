package g1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class d {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = -1;

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r3) {
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            if (r3 != 0) goto L18
            r3 = 0
            return r3
        L18:
            boolean r0 = r3.isConnected()
            r1 = 1
            if (r0 != 0) goto L20
            return r1
        L20:
            int r0 = r3.getType()
            r2 = 9
            if (r0 != r2) goto L2a
            r3 = 2
            return r3
        L2a:
            int r0 = r3.getType()
            if (r0 != r1) goto L32
            r3 = 3
            return r3
        L32:
            int r0 = r3.getType()
            if (r0 != 0) goto L42
            int r3 = r3.getSubtype()
            switch(r3) {
                case 1: goto L40;
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L40;
                case 11: goto L40;
                case 12: goto L40;
                case 13: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L42
        L40:
            r3 = 4
            return r3
        L42:
            r3 = -1
            return r3
    }
}
