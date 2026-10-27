package com.bxkj.base.util.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(long r4) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#.00"
            r0.<init>(r1)
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 != 0) goto L10
            java.lang.String r4 = "0B"
            return r4
        L10:
            r1 = 1024(0x400, double:5.06E-321)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            java.lang.String r4 = r0.format(r4)
            r1.append(r4)
            java.lang.String r4 = "B"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
        L2d:
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            r1.append(r4)
            java.lang.String r4 = "KB"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
        L4e:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            r1.append(r4)
            java.lang.String r4 = "MB"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            r1.append(r4)
            java.lang.String r4 = "GB"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static boolean b(java.io.File r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            boolean r1 = r6.exists()
            if (r1 != 0) goto Lc
            r6 = 1
            return r6
        Lc:
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto L13
            return r0
        L13:
            java.io.File[] r1 = r6.listFiles()
            if (r1 == 0) goto L3f
            int r2 = r1.length
            if (r2 == 0) goto L3f
            int r2 = r1.length
            r3 = 0
        L1e:
            if (r3 >= r2) goto L3f
            r4 = r1[r3]
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L2f
            boolean r4 = c(r4)
            if (r4 != 0) goto L3c
            return r0
        L2f:
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L3c
            boolean r4 = b(r4)
            if (r4 != 0) goto L3c
            return r0
        L3c:
            int r3 = r3 + 1
            goto L1e
        L3f:
            boolean r6 = r6.delete()
            return r6
    }

    public static boolean c(java.io.File r1) {
            if (r1 == 0) goto L16
            boolean r0 = r1.exists()
            if (r0 == 0) goto L14
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L16
            boolean r1 = r1.delete()
            if (r1 == 0) goto L16
        L14:
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static boolean d(java.lang.String r0) {
            java.io.File r0 = f(r0)
            boolean r0 = c(r0)
            return r0
    }

    public static java.lang.String e(android.content.Context r2) {
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            boolean r0 = android.os.Environment.isExternalStorageRemovable()
            if (r0 != 0) goto L13
            goto L1c
        L13:
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r2 = r2.getPath()
            return r2
        L1c:
            java.io.File r2 = r2.getExternalCacheDir()
            java.lang.String r2 = r2.getPath()
            return r2
    }

    public static java.io.File f(java.lang.String r1) {
            boolean r0 = j(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
    }

    public static long g(java.io.File r2) throws java.lang.Exception {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L11
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            int r2 = r0.available()
            long r0 = (long) r2
            return r0
        L11:
            r2.createNewFile()
            r0 = 0
            return r0
    }

    public static long h(java.io.File r5) throws java.lang.Exception {
            java.io.File[] r5 = r5.listFiles()
            r0 = 0
            r2 = 0
        L7:
            int r3 = r5.length
            if (r2 >= r3) goto L24
            r3 = r5[r2]
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto L1a
            r3 = r5[r2]
            long r3 = h(r3)
        L18:
            long r0 = r0 + r3
            goto L21
        L1a:
            r3 = r5[r2]
            long r3 = g(r3)
            goto L18
        L21:
            int r2 = r2 + 1
            goto L7
        L24:
            return r0
    }

    public static java.lang.String i(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            r2 = -1
            if (r0 > r2) goto L13
            return r1
        L13:
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
    }

    private static boolean j(java.lang.String r5) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length()
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L1a
            char r4 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            int r3 = r3 + 1
            goto La
        L1a:
            return r0
    }
}
