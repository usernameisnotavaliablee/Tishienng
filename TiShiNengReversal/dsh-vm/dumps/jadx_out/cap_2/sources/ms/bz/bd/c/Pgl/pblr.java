package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pblr {
    private static final java.lang.String a = null;

    static {
            r0 = 7
            byte[] r6 = new byte[r0]
            r6 = {x0018: FILL_ARRAY_DATA , data: [13, 3, 119, 66, 28, 42, 55} // fill-array
            r3 = 0
            java.lang.String r5 = "024908"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            ms.bz.bd.c.Pgl.pblr.a = r0
            return
    }

    public pblr() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r11) {
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
            goto L60
        L9:
            android.content.Intent r3 = new android.content.Intent
            r4 = 26
            byte[] r10 = new byte[r4]
            r10 = {x010e: FILL_ARRAY_DATA , data: [117, 63, 22, 81, 8, 122, 98, 92, 57, 105, 96, 52, 28, 87, 73, 114, 101, 6, 57, 104, 122, 127, 63, 98, 46, 93} // fill-array
            r7 = 0
            java.lang.String r9 = "e3a78d"
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)
            java.lang.String r4 = (java.lang.String) r4
            r3.<init>(r4, r2)
            r4 = 128(0x80, float:1.8E-43)
            java.util.List r0 = r0.queryIntentActivities(r3, r4)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r0.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 == 0) goto L2d
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo
            android.os.Bundle r3 = r3.metaData
            if (r3 == 0) goto L2d
            r4 = 16
            byte[] r10 = new byte[r4]
            r10 = {x0120: FILL_ARRAY_DATA , data: [59, 33, 74, 95, 91, 34, 60, 27, 105, 126, 38, 35, 86, 69, 81, 40} // fill-array
            r7 = 0
            java.lang.String r9 = "2368a1"
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L2d
            goto Lfd
        L60:
            java.lang.String r11 = r11.getPackageName()
            r0 = 8
            byte[] r8 = new byte[r0]
            r8 = {x012c: FILL_ARRAY_DATA , data: [34, 50, 87, 68, 79, 122, 37, 11} // fill-array
            r5 = 0
            java.lang.String r7 = "2309fd"
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r3, r4, r5, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            java.lang.String r8 = "f9ecf9"
            r4 = 25
            byte[] r9 = new byte[r4]     // Catch: java.lang.Exception -> Lc1
            r9 = {x0134: FILL_ARRAY_DATA , data: [118, 53, 18, 5, 86, 39, 97, 86, 59, 32, 57, 8, 19, 5, 79, 39, 102, 29, 25, 50, 121, 58, 17, 18, 75} // fill-array     // Catch: java.lang.Exception -> Lc1
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.Object r4 = com.volcengine.mobsecBiz.matrix.pgla.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lc1
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r9 = "bca15f"
            r5 = 10
            byte[] r10 = new byte[r5]     // Catch: java.lang.Exception -> Lc1
            r10 = {x0146: FILL_ARRAY_DATA , data: [116, 100, 6, 118, 15, 99, 119, 75, 51, 100} // fill-array     // Catch: java.lang.Exception -> Lc1
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.Object r5 = com.volcengine.mobsecBiz.matrix.pgla.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lc1
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> Lc1
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.Exception -> Lc1
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> Lc1
            r4.setAccessible(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> Lc1
            r5[r3] = r0     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r0 = r4.invoke(r2, r5)     // Catch: java.lang.Exception -> Lc1
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.Exception -> Lc1
            r2 = r0
            goto Lc5
        Lc1:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lc5:
            if (r2 != 0) goto Lc8
            goto L104
        Lc8:
            android.os.Parcel r4 = android.os.Parcel.obtain()
            android.os.Parcel r5 = android.os.Parcel.obtain()
            java.lang.String r0 = ms.bz.bd.c.Pgl.pblr.a     // Catch: java.lang.Throwable -> Lfe
            r4.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> Lfe
            r0 = 2
            r4.writeInt(r0)     // Catch: java.lang.Throwable -> Lfe
            r4.writeString(r11)     // Catch: java.lang.Throwable -> Lfe
            android.os.Binder r11 = new android.os.Binder     // Catch: java.lang.Throwable -> Lfe
            r11.<init>()     // Catch: java.lang.Throwable -> Lfe
            r4.writeStrongBinder(r11)     // Catch: java.lang.Throwable -> Lfe
            r11 = 1598837584(0x5f4c5350, float:1.47232E19)
            boolean r11 = r2.transact(r11, r4, r5, r3)     // Catch: java.lang.Throwable -> Lfe
            if (r11 != 0) goto Lf4
        Led:
            r4.recycle()
            r5.recycle()
            goto L104
        Lf4:
            r5.readException()     // Catch: java.lang.Throwable -> Lfe
            r4.recycle()
            r5.recycle()
        Lfd:
            return r1
        Lfe:
            r0 = move-exception
            r11 = r0
            com.bytedance.sdk.component.utils.vl.j(r11)     // Catch: java.lang.Throwable -> L105
            goto Led
        L104:
            return r3
        L105:
            r0 = move-exception
            r11 = r0
            r4.recycle()
            r5.recycle()
            throw r11
    }
}
