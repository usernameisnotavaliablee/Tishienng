package com.bytedance.pangle.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private static java.io.File cw;
    private static java.io.File j;
    private static java.io.File xt;


    static {
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String ae(java.lang.String r2, int r3) {
            java.lang.String r0 = "version-"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "apk"
            java.lang.String r1 = "temp"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r0, r1}
            java.lang.String r2 = j(r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.lang.String r2 = r3.getPath()
            return r2
    }

    public static java.lang.String cw() {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.io.File r1 = com.bytedance.pangle.up.cw.cw
            if (r1 != 0) goto L23
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.getFilesDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ".pangle"
            r2.<init>(r3)
            java.lang.String r3 = com.bytedance.pangle.g.j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            com.bytedance.pangle.up.cw.cw = r1
        L23:
            java.io.File r0 = com.bytedance.pangle.up.cw.cw
            java.lang.String r0 = j(r0)
            return r0
    }

    public static java.lang.String cw(java.lang.String r3, int r4) {
            boolean r0 = com.bytedance.pangle.util.g.ws()
            java.lang.String r1 = "version-"
            if (r0 == 0) goto L21
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r0 = "oat"
            java.lang.String r1 = com.bytedance.pangle.m.xt.j()
            java.lang.String r2 = "apk"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r2, r0, r1}
            java.lang.String r3 = j(r3)
            return r3
        L21:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r0 = "dalvik-cache"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r0}
            java.lang.String r3 = j(r3)
            return r3
    }

    public static java.lang.String g(java.lang.String r1, int r2) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "secondary-dexes"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            return r1
    }

    public static java.lang.String j() {
            up()
            java.io.File r0 = com.bytedance.pangle.up.cw.j
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public static java.lang.String j(java.io.File r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.exists()
            if (r0 != 0) goto Lb
            r1.mkdirs()
        Lb:
            java.lang.String r1 = r1.getPath()
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.lang.String j(java.lang.String r0) {
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = j(r0)
            return r0
    }

    public static java.lang.String j(java.lang.String r3, int r4) {
            up()
            java.io.File r0 = com.bytedance.pangle.up.cw.j
            java.lang.String r1 = "version-"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            r4 = 0
        L14:
            r1 = 2
            if (r4 >= r1) goto L28
            r1 = r3[r4]
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L25
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            r0 = r2
        L25:
            int r4 = r4 + 1
            goto L14
        L28:
            if (r0 == 0) goto L2f
            java.lang.String r3 = r0.getPath()
            return r3
        L2f:
            r3 = 0
            return r3
    }

    public static java.lang.String j(java.lang.String r1, int r2, java.lang.String r3) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "dex"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r3)
            java.lang.String r1 = r2.getPath()
            return r1
    }

    private static java.lang.String j(java.lang.String... r5) {
            up()
            java.io.File r0 = com.bytedance.pangle.up.cw.j
            if (r5 == 0) goto L1f
            int r1 = r5.length
            if (r1 <= 0) goto L1f
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1f
            r3 = r5[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L1c
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r3)
            r0 = r4
        L1c:
            int r2 = r2 + 1
            goto Lc
        L1f:
            java.lang.String r5 = j(r0)
            return r5
    }

    public static java.lang.String m(java.lang.String r1, int r2) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "apk"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.lang.String r1 = r2.getPath()
            return r1
    }

    public static boolean oq(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = j()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "version-"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.exists()
            return r2
    }

    public static java.io.File[] qv(java.lang.String r1, int r2) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "dex"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L29
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            com.bytedance.pangle.up.cw$1 r1 = new com.bytedance.pangle.up.cw$1
            r1.<init>()
            java.io.File[] r1 = r2.listFiles(r1)
            return r1
        L29:
            r1 = 0
            return r1
    }

    public static java.lang.String r() {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L2b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = ".pangle"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = com.bytedance.pangle.g.xt     // Catch: java.lang.Exception -> L2b
            r1.append(r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2b
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2f
            java.lang.String r0 = j(r0)     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        L2f:
            r0 = 0
            return r0
    }

    public static java.lang.String r(java.lang.String r1, int r2) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "lib"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            return r1
    }

    public static java.lang.String tl(java.lang.String r8, int r9) {
            boolean r0 = com.bytedance.pangle.util.g.ws()
            java.lang.String r1 = "version-"
            if (r0 == 0) goto L24
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r3 = r1.concat(r9)
            java.lang.String r6 = "oat"
            java.lang.String r7 = com.bytedance.pangle.m.xt.j()
            java.lang.String r4 = "apk"
            java.lang.String r5 = "temp"
            r2 = r8
            java.lang.String[] r8 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.lang.String r8 = j(r8)
            return r8
        L24:
            r2 = r8
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r1.concat(r8)
            java.lang.String r9 = "dalvik-cache"
            java.lang.String[] r8 = new java.lang.String[]{r2, r8, r9}
            java.lang.String r8 = j(r8)
            return r8
    }

    public static java.lang.String up(java.lang.String r2, int r3) {
            java.lang.String r0 = "version-"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "apk"
            java.lang.String r1 = "temp"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r0, r1}
            java.lang.String r2 = j(r2)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "base-1.apk"
            r3.<init>(r2, r0)
            java.lang.String r2 = r3.getPath()
            return r2
    }

    private static void up() {
            java.io.File r0 = com.bytedance.pangle.up.cw.j
            if (r0 != 0) goto L26
            java.io.File r0 = new java.io.File
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            java.io.File r1 = r1.getFilesDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "pangle"
            r2.<init>(r3)
            java.lang.String r3 = com.bytedance.pangle.g.cw
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            com.bytedance.pangle.up.cw.j = r0
            j(r0)
        L26:
            return
    }

    public static java.lang.String vl(java.lang.String r1, int r2) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "config"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = "config.json"
            r2.<init>(r1, r0)
            java.lang.String r1 = r2.getPath()
            return r1
    }

    public static java.lang.String xt() {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.io.File r1 = com.bytedance.pangle.up.cw.xt
            if (r1 != 0) goto L2d
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()
            java.io.File r1 = r1.getDownloadDir()
            if (r1 != 0) goto L2b
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.getFilesDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ".pangle"
            r2.<init>(r3)
            java.lang.String r3 = com.bytedance.pangle.g.xt
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
        L2b:
            com.bytedance.pangle.up.cw.xt = r1
        L2d:
            java.io.File r0 = com.bytedance.pangle.up.cw.xt
            java.lang.String r0 = j(r0)
            return r0
    }

    public static java.lang.String xt(java.lang.String r1, int r2) {
            java.lang.String r0 = "version-"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "apk"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = j(r1)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = "base-1.apk"
            r2.<init>(r1, r0)
            java.lang.String r1 = r2.getPath()
            return r1
    }
}
