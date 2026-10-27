package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pble {
    private static volatile int a = -1;
    private static volatile java.lang.String b = "";

    public pble() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r2) {
            int r0 = ms.bz.bd.c.Pgl.pble.a
            if (r0 > 0) goto L15
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Throwable -> L15
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L15
            ms.bz.bd.c.Pgl.pble.a = r2     // Catch: java.lang.Throwable -> L15
        L15:
            int r2 = ms.bz.bd.c.Pgl.pble.a
            return r2
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    public static android.app.Activity b() {
            r0 = 0
            java.lang.String r5 = "41fbe3"
            r1 = 26
            byte[] r6 = new byte[r1]     // Catch: java.lang.Exception -> Lbb
            r6 = {x00ce: FILL_ARRAY_DATA , data: [36, 61, 17, 4, 85, 45, 51, 94, 54, 34, 53, 125, 52, 21, 78, 45, 33, 25, 35, 43, 17, 59, 7, 19, 91, 32} // fill-array     // Catch: java.lang.Exception -> Lbb
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            r3 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbb
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r6 = "16e3d0"
            r2 = 21
            byte[] r7 = new byte[r2]     // Catch: java.lang.Exception -> Lbb
            r7 = {x00e0: FILL_ARRAY_DATA , data: [35, 33, 4, 85, 94, 41, 38, 54, 55, 119, 41, 34, 31, 83, 66, 19, 58, 5, 49, 98, 36} // fill-array     // Catch: java.lang.Exception -> Lbb
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            r4 = 0
            java.lang.Object r2 = com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lbb
            java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> Lbb
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r7 = "b1b05a"
            r3 = 11
            byte[] r8 = new byte[r3]     // Catch: java.lang.Exception -> Lbb
            r8 = {x00f0: FILL_ARRAY_DATA , data: [126, 18, 18, 80, 3, 96, 104, 4, 58, 101, 96} // fill-array     // Catch: java.lang.Exception -> Lbb
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.Object r3 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Lbb
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Exception -> Lbb
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> Lbb
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lbb
            android.util.ArrayMap r1 = (android.util.ArrayMap) r1     // Catch: java.lang.Exception -> Lbb
            int r2 = r1.size()     // Catch: java.lang.Exception -> Lbb
            if (r2 > 0) goto L61
            return r0
        L61:
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Exception -> Lbb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lbb
        L69:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> Lbb
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> Lbb
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Exception -> Lbb
            java.lang.String r9 = "604944"
            r5 = 6
            byte[] r10 = new byte[r5]     // Catch: java.lang.Exception -> Lbb
            r10 = {x00fa: FILL_ARRAY_DATA , data: [55, 51, 82, 94, 14, 39} // fill-array     // Catch: java.lang.Exception -> Lbb
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.Object r5 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lbb
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> Lbb
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> Lbb
            boolean r5 = r5.getBoolean(r2)     // Catch: java.lang.Exception -> Lbb
            if (r5 != 0) goto L69
            java.lang.String r10 = "e96982"
            r1 = 8
            byte[] r11 = new byte[r1]     // Catch: java.lang.Exception -> Lbb
            r11 = {x0102: FILL_ARRAY_DATA , data: [117, 56, 81, 68, 17, 44, 114, 1} // fill-array     // Catch: java.lang.Exception -> Lbb
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.Object r1 = com.volcengine.mobsecBiz.matrix.pgla.a(r6, r7, r8, r10, r11)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbb
            java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lbb
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> Lbb
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lbb
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> Lbb
            return r1
        Lbb:
            r1 = 4
            byte[] r7 = new byte[r1]
            r7 = {x010a: FILL_ARRAY_DATA , data: [36, 57, 126, 69} // fill-array
            r4 = 0
            java.lang.String r6 = "422625"
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r3 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r2, r3, r4, r6, r7)
        Lcc:
            return r0
    }

    public static java.lang.String c(android.content.Context r2) {
            java.lang.String r0 = ms.bz.bd.c.Pgl.pble.b     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = ""
            if (r0 != r1) goto L17
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L17
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Throwable -> L17
            ms.bz.bd.c.Pgl.pble.b = r2     // Catch: java.lang.Throwable -> L17
        L17:
            java.lang.String r2 = ms.bz.bd.c.Pgl.pble.b
            return r2
    }
}
