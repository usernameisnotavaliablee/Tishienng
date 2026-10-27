package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m {
    private static long j = 1800000;
    private static android.os.Handler xt;




    private static class j implements java.util.concurrent.Callable<android.location.Location> {
        private android.location.LocationManager j;
        private java.lang.String xt;

        public j(android.location.LocationManager r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public android.location.Location call() throws java.lang.Exception {
                r5 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.location.LocationManager r2 = r5.j
                java.lang.String r3 = r5.xt
                android.location.Location r2 = r2.getLastKnownLocation(r3)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "location:"
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r1 = ",getLastKnownLocation use time :"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "AdLocationUtils"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                return r2
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ android.location.Location call() throws java.lang.Exception {
                r1 = this;
                android.location.Location r0 = r1.call()
                return r0
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bytedance.msdk.tl.m.xt = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static com.bytedance.msdk.tl.up cw(android.content.Context r4) {
            r0 = 0
            com.bytedance.msdk.tl.l r4 = com.bytedance.msdk.tl.l.j(r0, r4)
            java.lang.String r1 = "latitude"
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r4.xt(r1, r2)
            java.lang.String r3 = "longitude"
            float r4 = r4.xt(r3, r2)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 == 0) goto L21
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L1c
            goto L21
        L1c:
            com.bytedance.msdk.tl.up r0 = new com.bytedance.msdk.tl.up
            r0.<init>(r1, r4)
        L21:
            return r0
    }

    private static android.location.Location j(android.location.LocationManager r1) {
            java.lang.String r0 = "gps"
            android.location.Location r0 = j(r1, r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = "network"
            android.location.Location r0 = j(r1, r0)
        Le:
            if (r0 != 0) goto L17
            java.lang.String r0 = "passive"
            android.location.Location r1 = j(r1, r0)
            return r1
        L17:
            return r0
    }

    private static android.location.Location j(android.location.LocationManager r2, java.lang.String r3) {
            com.bytedance.msdk.tl.m$j r0 = new com.bytedance.msdk.tl.m$j     // Catch: java.lang.Throwable -> L27
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L27
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.j.up.m.r(r2)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L27
            r0 = 1
            java.lang.Object r2 = r2.get(r0, r3)     // Catch: java.lang.Throwable -> L27
            android.location.Location r2 = (android.location.Location) r2     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "AdLocationUtils"
            java.lang.String r0 = "location:"
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L27
            com.bytedance.msdk.j.up.cw.j(r3, r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static com.bytedance.msdk.tl.up j(android.content.Context r3) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.ws r0 = r0.p()
            boolean r0 = r0.j()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            if (r3 != 0) goto L17
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            goto L1f
        L17:
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
        L1f:
            if (r3 != 0) goto L22
            return r1
        L22:
            com.bytedance.msdk.tl.up r0 = cw(r3)
            boolean r2 = xt(r3)
            if (r2 != 0) goto L2d
            return r0
        L2d:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = com.bytedance.msdk.core.vl.cw.j(r3, r0)
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = com.bytedance.msdk.core.vl.cw.j(r3, r2)
            if (r0 == 0) goto L3e
            if (r2 == 0) goto L3e
            return r1
        L3e:
            com.bytedance.msdk.tl.up r3 = r(r3)
            return r3
    }

    static /* synthetic */ void j(android.content.Context r0, android.location.Location r1) {
            xt(r0, r1)
            return
    }

    static /* synthetic */ void j(android.content.Context r0, android.location.LocationManager r1) {
            xt(r0, r1)
            return
    }

    static /* synthetic */ void j(android.location.LocationManager r0, android.location.LocationListener r1) {
            xt(r0, r1)
            return
    }

    static /* synthetic */ boolean j(android.location.Location r0) {
            boolean r0 = xt(r0)
            return r0
    }

    private static com.bytedance.msdk.tl.up r(android.content.Context r7) {
            java.lang.String r0 = "location"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            r1 = 0
            if (r0 == 0) goto L56
            android.location.Location r2 = j(r0)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            boolean r3 = xt(r2)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            xt(r7, r2)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.msdk.tl.up r3 = new com.bytedance.msdk.tl.up     // Catch: java.lang.Throwable -> L2b
            double r4 = r2.getLatitude()     // Catch: java.lang.Throwable -> L2b
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L2b
            double r5 = r2.getLongitude()     // Catch: java.lang.Throwable -> L2b
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2b
            r1 = r3
            goto L2d
        L2b:
            r7 = move-exception
            goto L4d
        L2d:
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L2b
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L2b
            if (r2 == r3) goto L49
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L2b
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            com.bytedance.msdk.tl.m$1 r3 = new com.bytedance.msdk.tl.m$1     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r7, r0)     // Catch: java.lang.Throwable -> L2b
            r2.post(r3)     // Catch: java.lang.Throwable -> L2b
            return r1
        L49:
            xt(r7, r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L4d:
            boolean r0 = com.bytedance.msdk.j.up.cw.xt()
            if (r0 == 0) goto L56
            com.bytedance.sdk.component.utils.vl.j(r7)
        L56:
            return r1
    }

    private static java.lang.String xt(android.location.LocationManager r2) {
            java.lang.String r0 = "gps"
            boolean r1 = r2.isProviderEnabled(r0)
            if (r1 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "network"
            boolean r1 = r2.isProviderEnabled(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            java.lang.String r0 = "passive"
            boolean r2 = r2.isProviderEnabled(r0)
            if (r2 == 0) goto L1b
            return r0
        L1b:
            r2 = 0
            return r2
    }

    private static void xt(android.content.Context r2, android.location.Location r3) {
            boolean r0 = xt(r3)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            com.bytedance.msdk.tl.l r2 = com.bytedance.msdk.tl.l.j(r0, r2)
            double r0 = r3.getLatitude()
            float r0 = (float) r0
            java.lang.String r1 = "latitude"
            r2.j(r1, r0)
            double r0 = r3.getLongitude()
            float r3 = (float) r0
            java.lang.String r0 = "longitude"
            r2.j(r0, r3)
            java.lang.String r3 = "lbstime"
            long r0 = java.lang.System.currentTimeMillis()
            r2.j(r3, r0)
            return
    }

    private static void xt(android.content.Context r4, android.location.LocationManager r5) {
            if (r4 == 0) goto L36
            if (r5 != 0) goto L5
            goto L36
        L5:
            com.bytedance.msdk.tl.m$2 r0 = new com.bytedance.msdk.tl.m$2
            r0.<init>(r4, r5)
            java.lang.String r4 = xt(r5)     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L15
            goto L36
        L15:
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L29
            r5.requestSingleUpdate(r4, r0, r1)     // Catch: java.lang.Throwable -> L29
            android.os.Handler r4 = com.bytedance.msdk.tl.m.xt     // Catch: java.lang.Throwable -> L29
            com.bytedance.msdk.tl.m$3 r1 = new com.bytedance.msdk.tl.m$3     // Catch: java.lang.Throwable -> L29
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L29
            r2 = 30000(0x7530, double:1.4822E-319)
            r4.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r4 = move-exception
            boolean r1 = com.bytedance.msdk.j.up.cw.xt()
            if (r1 == 0) goto L33
            com.bytedance.sdk.component.utils.vl.j(r4)
        L33:
            xt(r5, r0)
        L36:
            return
    }

    private static void xt(android.location.LocationManager r0, android.location.LocationListener r1) {
            if (r0 == 0) goto L13
            if (r1 != 0) goto L5
            goto L13
        L5:
            r0.removeUpdates(r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            boolean r1 = com.bytedance.msdk.j.up.cw.xt()
            if (r1 == 0) goto L13
            com.bytedance.sdk.component.utils.vl.j(r0)
        L13:
            return
    }

    private static boolean xt(android.content.Context r5) {
            r0 = 0
            com.bytedance.msdk.tl.l r5 = com.bytedance.msdk.tl.l.j(r0, r5)
            java.lang.String r0 = "lbstime"
            r1 = -1
            long r3 = r5.xt(r0, r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L1f
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            long r2 = com.bytedance.msdk.tl.m.j
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            return r5
        L1f:
            r5 = 1
            return r5
    }

    private static boolean xt(android.location.Location r5) {
            double r0 = r5.getLatitude()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            double r0 = r5.getLongitude()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L14
            r5 = 1
            return r5
        L14:
            r5 = 0
            return r5
    }
}
