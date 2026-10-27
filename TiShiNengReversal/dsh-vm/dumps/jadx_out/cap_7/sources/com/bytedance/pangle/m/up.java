package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up implements com.bytedance.pangle.m.m.j {
    private static volatile android.os.IBinder j;
    private static volatile java.lang.Object xt;

    public interface j {
    }

    private static class xt extends android.os.ResultReceiver {
        private com.bytedance.pangle.m.up.j j;

        public xt(com.bytedance.pangle.m.up.j r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.j = r2
                return
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int r1, android.os.Bundle r2) {
                r0 = this;
                super.onReceiveResult(r1, r2)
                return
        }
    }

    static {
            return
    }

    public up() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void cw(java.lang.String r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.bytedance.pangle.up.cw.m(r2, r3)
            java.lang.String r1 = com.bytedance.pangle.up.cw.ae(r2, r3)
            xt(r1, r0)
            java.lang.String r2 = com.bytedance.pangle.up.cw.up(r2, r3)
            xt(r2)
            xt()
            return
    }

    private static void cw(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.lang.Object r0 = com.bytedance.pangle.m.up.xt
            if (r0 == 0) goto L39
            if (r5 == 0) goto L39
            if (r6 == 0) goto L39
            if (r7 != 0) goto Lb
            goto L39
        Lb:
            java.lang.String r0 = "dalvik.system.DexClassLoader"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            java.lang.Object r1 = com.bytedance.pangle.m.up.xt
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r5
            r5 = 1
            r3[r5] = r0
            r0 = 2
            r3[r0] = r6
            r6 = 3
            r3[r6] = r7
            java.lang.Class[] r7 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r7[r4] = r2
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r7[r5] = r4
            r7[r0] = r4
            r7[r6] = r2
            java.lang.String r5 = "notifyDexLoad"
            j(r1, r5, r3, r7)
        L39:
            return
    }

    private static java.lang.String[] cw() {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "reconcile-secondary-dex-files"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.String[] r0 = j(r0)
            return r0
    }

    public static java.lang.Object j(java.lang.Object r0, java.lang.String r1, java.lang.Object[] r2, java.lang.Class<?>[] r3) {
            java.lang.Object r0 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.lang.Object j(java.lang.reflect.Field r1, java.lang.Object r2) {
            boolean r0 = r1.isAccessible()     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto La
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L13
        La:
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Exception -> L13
            r0 = 0
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            r1 = 0
            return r1
    }

    public static java.lang.reflect.Field j(java.lang.Class<?> r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = com.bytedance.pangle.util.FieldUtils.getField(r0, r1)
            return r0
    }

    public static java.lang.reflect.Field j(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Class r0 = r0.getClass()
            java.lang.reflect.Field r0 = j(r0, r1)
            return r0
    }

    private static void j() {
            android.os.IBinder r0 = com.bytedance.pangle.m.up.j
            if (r0 == 0) goto L5
            goto L2d
        L5:
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "mPM"
            java.lang.reflect.Field r1 = j(r0, r1)
            if (r1 != 0) goto L16
            goto L2d
        L16:
            java.lang.Object r0 = j(r1, r0)
            com.bytedance.pangle.m.up.xt = r0
            boolean r0 = r0 instanceof android.os.IInterface
            if (r0 != 0) goto L21
            goto L2d
        L21:
            java.lang.Object r0 = com.bytedance.pangle.m.up.xt
            android.os.IInterface r0 = (android.os.IInterface) r0
            android.os.IBinder r0 = r0.asBinder()
            if (r0 == 0) goto L2d
            com.bytedance.pangle.m.up.j = r0
        L2d:
            return
    }

    private static void j(java.lang.String r0, java.lang.String r1) {
            com.bytedance.pangle.util.tl.j(r0, r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    private static void j(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto La
            xt(r2, r3, r4)
            return
        La:
            r1 = 29
            if (r0 != r1) goto L11
            cw(r2, r3, r4)
        L11:
            return
    }

    private static void j(java.lang.String[] r3, com.bytedance.pangle.m.up.j r4) {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.io.FileDescriptor r2 = java.io.FileDescriptor.in
            r0.writeFileDescriptor(r2)
            java.io.FileDescriptor r2 = java.io.FileDescriptor.out
            r0.writeFileDescriptor(r2)
            java.io.FileDescriptor r2 = java.io.FileDescriptor.err
            r0.writeFileDescriptor(r2)
            r0.writeStringArray(r3)
            r3 = 0
            r0.writeStrongBinder(r3)
            com.bytedance.pangle.m.up$xt r3 = new com.bytedance.pangle.m.up$xt
            r3.<init>(r4)
            r4 = 0
            r3.writeToParcel(r0, r4)
            android.os.IBinder r3 = com.bytedance.pangle.m.up.j     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L39
            r2 = 1598246212(0x5f434d44, float:1.4072979E19)
            r3.transact(r2, r0, r1, r4)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L39
            r1.readException()     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L39
        L32:
            r0.recycle()
            r1.recycle()
            return
        L39:
            r3 = move-exception
            r0.recycle()
            r1.recycle()
            throw r3
    }

    private static boolean j(java.lang.String r3, java.lang.String r4, int r5) {
            java.lang.String r0 = com.bytedance.pangle.up.cw.up(r4, r5)
            java.lang.String r4 = com.bytedance.pangle.up.cw.tl(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = java.io.File.separator
            r5.append(r4)
            java.lang.String r4 = com.bytedance.pangle.m.xt.j(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 1
            r0 = 1
        L22:
            r1 = 3
            if (r0 > r1) goto L3b
            java.lang.String[] r1 = j(r3)
            r2 = 0
            j(r1, r2)
            java.lang.String[] r1 = new java.lang.String[]{r4}
            boolean r1 = com.bytedance.pangle.m.xt.j(r1)
            if (r1 == 0) goto L38
            return r5
        L38:
            int r0 = r0 + 1
            goto L22
        L3b:
            r3 = 0
            return r3
    }

    private static java.lang.String[] j(java.lang.String r7) {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r6 = r0.getPackageName()
            java.lang.String r1 = "compile"
            java.lang.String r2 = "-m"
            java.lang.String r4 = "-f"
            java.lang.String r5 = "--secondary-dex"
            r3 = r7
            java.lang.String[] r7 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.lang.String[] r7 = j(r7)
            return r7
    }

    private static java.lang.String[] j(java.lang.String... r0) {
            return r0
    }

    private static void xt() {
            java.lang.String[] r0 = cw()
            r1 = 0
            j(r0, r1)
            return
    }

    private static void xt(java.lang.String r1) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Le
            r0.<init>(r1)     // Catch: java.lang.Exception -> Le
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> Le
            if (r1 == 0) goto Le
            r0.delete()     // Catch: java.lang.Exception -> Le
        Le:
            return
    }

    private static void xt(java.lang.String r1, int r2) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.bytedance.pangle.up.cw.xt(r1, r2)
            java.lang.String r1 = com.bytedance.pangle.up.cw.up(r1, r2)
            j(r0, r1)
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r0 = com.bytedance.pangle.m.xt.j()
            j(r2, r1, r0)
            return
    }

    private static void xt(java.lang.String r0, java.lang.String r1) {
            com.bytedance.pangle.util.ae.j(r0, r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    private static void xt(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.Object r0 = com.bytedance.pangle.m.up.xt
            if (r0 == 0) goto L30
            if (r4 == 0) goto L30
            if (r5 == 0) goto L30
            if (r6 != 0) goto Lb
            goto L30
        Lb:
            java.lang.String r0 = "PCL[]"
            java.util.Map r5 = java.util.Collections.singletonMap(r5, r0)
            java.lang.Object r0 = com.bytedance.pangle.m.up.xt
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r6[r3] = r1
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            r6[r4] = r3
            r6[r5] = r1
            java.lang.String r4 = "notifyDexLoad"
            j(r0, r4, r2, r6)
        L30:
            return
    }

    @Override // com.bytedance.pangle.m.m.j
    public boolean j(java.lang.String r2, int r3) {
            r1 = this;
            j()
            xt(r2, r3)
            java.lang.String r0 = "speed"
            boolean r0 = j(r0, r2, r3)
            cw(r2, r3)
            return r0
    }
}
