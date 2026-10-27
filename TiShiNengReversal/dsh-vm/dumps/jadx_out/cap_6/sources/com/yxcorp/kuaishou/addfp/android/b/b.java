package com.yxcorp.kuaishou.addfp.android.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.io.File a(android.content.Context r7, boolean r8) {
            java.lang.String r0 = "storage"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.os.storage.StorageManager r7 = (android.os.storage.StorageManager) r7
            java.lang.String r0 = "android.os.storage.StorageVolume"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "getVolumeList"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "getPath"
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "isRemovable"
            java.lang.reflect.Method r0 = r0.getMethod(r4, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r7 = r1.invoke(r7, r3)     // Catch: java.lang.Throwable -> L55
            int r1 = java.lang.reflect.Array.getLength(r7)     // Catch: java.lang.Throwable -> L55
            r4 = 0
        L2e:
            if (r4 >= r1) goto L55
            java.lang.Object r5 = java.lang.reflect.Array.get(r7, r4)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r2.invoke(r5, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r0.invoke(r5, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L55
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L55
            if (r8 != r5) goto L52
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L52
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L55
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L55
            return r7
        L52:
            int r4 = r4 + 1
            goto L2e
        L55:
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
            return r7
    }

    private static byte[] a(byte[] r9, byte[] r10) {
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r0) goto Le
            byte r4 = (byte) r3
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            int r3 = r10.length
            if (r3 != 0) goto L13
            r1 = 0
            goto L31
        L13:
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            if (r3 >= r0) goto L31
            r6 = r10[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r1[r3]
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r8
            int r6 = r6 + r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            r6 = r1[r5]
            r1[r3] = r6
            r1[r5] = r7
            int r4 = r4 + 1
            int r6 = r10.length
            int r4 = r4 % r6
            int r3 = r3 + 1
            goto L16
        L31:
            int r10 = r9.length
            byte[] r10 = new byte[r10]
            r0 = 0
            r3 = 0
        L36:
            int r4 = r9.length
            if (r2 >= r4) goto L63
            int r0 = r0 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = r1[r0]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r3
            r3 = r5 & 255(0xff, float:3.57E-43)
            r5 = r1[r3]
            r1[r0] = r5
            r1[r3] = r4
            r5 = r1[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r4
            r4 = r5 & 255(0xff, float:3.57E-43)
            r5 = r9[r2]
            r4 = r1[r4]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r10[r2] = r4
            r4 = r4 ^ 42
            byte r4 = (byte) r4
            r10[r2] = r4
            int r2 = r2 + 1
            goto L36
        L63:
            return r10
    }

    public static byte[] b(byte[] r2, byte[] r3) {
            r0 = 0
            if (r3 == 0) goto L13
            int r1 = r3.length     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L13
            if (r2 == 0) goto L13
            int r1 = r2.length     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L13
            byte[] r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L12
            int r3 = r2.length     // Catch: java.lang.Throwable -> L13
        L12:
            return r2
        L13:
            return r0
    }

    public static byte[] c(byte[] r2, byte[] r3) {
            r0 = 0
            if (r3 == 0) goto L13
            int r1 = r3.length     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L13
            if (r2 == 0) goto L13
            int r1 = r2.length     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L13
            byte[] r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L12
            int r3 = r2.length     // Catch: java.lang.Throwable -> L13
        L12:
            return r2
        L13:
            return r0
    }
}
