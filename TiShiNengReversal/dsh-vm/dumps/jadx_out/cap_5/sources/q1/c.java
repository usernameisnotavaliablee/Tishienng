package q1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final java.lang.String a = "c";

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r6, android.content.Context r7) {
            java.lang.String r0 = q1.c.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Io getConfigContent, fileName: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.framework.common.Logger.d(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1f
            return r1
        L1f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r2 = 0
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            boolean r4 = r4.isDirectory()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            if (r4 == 0) goto L38
        L31:
            com.huawei.hms.framework.common.IoUtils.closeSecure(r0)
            com.huawei.hms.framework.common.IoUtils.closeSecure(r3)
            return r1
        L38:
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            java.io.InputStream r3 = r7.open(r6)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
        L44:
            int r4 = r3.read(r7)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            r5 = -1
            if (r4 == r5) goto L51
            r0.write(r7, r2, r4)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            goto L44
        L4f:
            r6 = move-exception
            goto L6e
        L51:
            r0.flush()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            java.lang.String r7 = "UTF-8"
            java.lang.String r6 = r0.toString(r7)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L61
            com.huawei.hms.framework.common.IoUtils.closeSecure(r0)
            com.huawei.hms.framework.common.IoUtils.closeSecure(r3)
            return r6
        L61:
            java.lang.String r7 = q1.c.a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "local config file is not exist.filename is {%s}"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4f
            r5[r2] = r6     // Catch: java.lang.Throwable -> L4f
            com.huawei.hms.framework.common.Logger.w(r7, r4, r5)     // Catch: java.lang.Throwable -> L4f
            goto L31
        L6e:
            com.huawei.hms.framework.common.IoUtils.closeSecure(r0)
            com.huawei.hms.framework.common.IoUtils.closeSecure(r3)
            throw r6
    }
}
