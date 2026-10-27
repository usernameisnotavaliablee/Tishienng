package cn.jiguang.at;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Bundle a(android.content.Context r10, int r11, android.os.Bundle r12) {
            r1 = 0
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            if (r11 == r2) goto L29
            r2 = 4098(0x1002, float:5.743E-42)
            if (r11 == r2) goto L24
            r0 = 36864(0x9000, float:5.1657E-41)
            if (r11 == r0) goto L15
            return r1
        L15:
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L21
            r5 = 0
            r6 = 52
            r7 = 0
            r4 = r10
            r8 = r12
            cn.jiguang.api.JCoreManager.onEvent(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L21
            return r1
        L21:
            r0 = move-exception
            r10 = r0
            goto L43
        L24:
            r2 = r10
            cn.jiguang.api.JCoreManager.init(r2)     // Catch: java.lang.Throwable -> L21
            return r0
        L29:
            r2 = r10
            r8 = r12
            if (r8 == 0) goto L42
            java.lang.String r10 = "arg1"
            java.lang.Object r10 = r8.get(r10)     // Catch: java.lang.Throwable -> L21
            if (r10 == 0) goto L42
            java.lang.String r5 = r10.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L21
            r3 = 0
            r4 = 9
            r6 = 0
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L21
        L42:
            return r0
        L43:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "si e:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "JCoreInterface"
            cn.jiguang.at.d.e(r11, r10)
            return r1
    }
}
