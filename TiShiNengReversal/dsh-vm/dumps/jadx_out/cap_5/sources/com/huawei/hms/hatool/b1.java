package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b1 {
    private static final int[] a = null;
    private static final int[] b = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String> c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends java.util.HashMap<java.lang.Integer, java.lang.String> {
        a() {
                r2 = this;
                r2.<init>()
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "2G"
                r2.put(r0, r1)
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 11
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "3G"
                r2.put(r0, r1)
                r0 = 8
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 9
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 10
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 15
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 5
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 6
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 14
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r0, r1)
                r0 = 13
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "4G"
                r2.put(r0, r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L9a
                r0 = 20
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "5G"
                r2.put(r0, r1)
            L9a:
                return
        }
    }

    static {
            r0 = 7
            r1 = 9
            r2 = 1
            r3 = 6
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.huawei.hms.hatool.b1.a = r0
            r0 = 4
            r1 = 5
            r2 = 0
            r3 = 2
            r4 = 3
            int[] r0 = new int[]{r2, r3, r4, r0, r1}
            com.huawei.hms.hatool.b1.b = r0
            com.huawei.hms.hatool.b1$a r0 = new com.huawei.hms.hatool.b1$a
            r0.<init>()
            com.huawei.hms.hatool.b1.c = r0
            return
    }

    public b1() {
            r1 = this;
            r1.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private static android.net.NetworkInfo a(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> Lf
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L2a
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "hmsSdk"
            com.huawei.hms.hatool.j1.e(r0, r2)
        L2a:
            r2 = 0
            return r2
    }

    private static java.lang.String b(int r4) {
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.huawei.hms.hatool.b1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r1 = r0.containsKey(r1)
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L1a
        L19:
            r0 = r2
        L1a:
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L35
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r1 < r3) goto L35
            r0 = 16
            if (r4 == r0) goto L32
            r0 = 17
            if (r4 == r0) goto L2f
            return r2
        L2f:
            java.lang.String r4 = "3G"
            return r4
        L32:
            java.lang.String r4 = "2G"
            return r4
        L35:
            return r0
    }

    private static boolean c(android.net.NetworkInfo r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int[] r1 = com.huawei.hms.hatool.b1.b
            int r2 = r2.getType()
            int r2 = java.util.Arrays.binarySearch(r1, r2)
            r1 = -1
            if (r2 == r1) goto L13
            r2 = 1
            return r2
        L13:
            return r0
    }

    public static java.lang.String d(android.content.Context r2) {
            java.lang.String r0 = "unknown"
            if (r2 != 0) goto L5
            return r0
        L5:
            android.net.NetworkInfo r2 = a(r2)     // Catch: java.lang.Throwable -> L2a
            boolean r1 = e(r2)
            if (r1 != 0) goto L12
            java.lang.String r2 = "none"
            return r2
        L12:
            boolean r1 = f(r2)
            if (r1 == 0) goto L1b
            java.lang.String r2 = "WIFI"
            return r2
        L1b:
            boolean r1 = c(r2)
            if (r1 == 0) goto L2a
            int r2 = r2.getSubtype()
            java.lang.String r2 = b(r2)
            return r2
        L2a:
            return r0
    }

    private static boolean e(android.net.NetworkInfo r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean f(android.net.NetworkInfo r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int[] r1 = com.huawei.hms.hatool.b1.a
            int r2 = r2.getType()
            int r2 = java.util.Arrays.binarySearch(r1, r2)
            r1 = -1
            if (r2 == r1) goto L13
            r2 = 1
            return r2
        L13:
            return r0
    }
}
