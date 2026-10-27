package cn.jpush.android.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static byte[] a(int r2) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r0.a(r2)
            byte[] r2 = r0.a()
            return r2
    }

    public static byte[] a(int r2, byte r3, long r4, java.lang.String r6) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r0.b(r2)
            r0.a(r3)
            r0.a(r4)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L1d
            byte[] r2 = b(r6)
            r0.a(r2)
        L1d:
            byte[] r2 = r0.a()
            return r2
    }

    public static byte[] a(int r2, java.lang.String r3) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            r0.a(r2)
            r0.a(r3)
            byte[] r2 = r0.a()
            return r2
    }

    public static byte[] a(java.lang.String r2) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r1 = 7
            r0.a(r1)
            r1 = 1
            r0.a(r1)
            if (r2 == 0) goto L16
            byte[] r2 = b(r2)
            goto L19
        L16:
            r2 = 0
            byte[] r2 = new byte[r2]
        L19:
            r0.a(r2)
            byte[] r2 = r0.a()
            return r2
    }

    public static byte[] a(java.lang.String r2, byte r3, boolean r4) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L11
            r2 = 0
            byte[] r2 = new byte[r2]
            goto L15
        L11:
            byte[] r2 = b(r2)
        L15:
            r0.a(r2)
            r0.a(r3)
            r2 = r4 ^ 1
            r0.a(r2)
            byte[] r2 = r0.a()
            return r2
    }

    public static byte[] a(java.lang.String r2, int r3, java.lang.String r4) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            r1 = 10
            if (r3 != r1) goto L12
            byte[] r2 = b(r2)
            r0.a(r2)
        L12:
            byte[] r2 = b(r4)
            r0.a(r2)
            byte[] r2 = r0.a()
            return r2
    }

    public static byte[] b(java.lang.String r3) {
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L7
            return r3
        L7:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stringToUtf8Bytes error:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PushPackage"
            cn.jpush.android.helper.Logger.ee(r1, r0)
            byte[] r3 = r3.getBytes()
            return r3
    }

    public static byte[] c(java.lang.String r2) {
            cn.jpush.android.z.d r0 = new cn.jpush.android.z.d
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            byte[] r2 = b(r2)
            r0.a(r2)
            byte[] r2 = r0.a()
            return r2
    }
}
