package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r5) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L68
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0     // Catch: java.lang.Throwable -> L68
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "com.baidu.action.Liantian.VIEW"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.Class<com.baidu.liantian.LiantianService> r2 = com.baidu.liantian.LiantianService.class
            r1.setClass(r5, r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L68
            r1.setPackage(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "com.baidu.category.liantian"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "android.intent.category.DEFAULT"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "from_plugin_package"
            java.lang.String r3 = r5.getPackageName()     // Catch: java.lang.Throwable -> L68
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "target_class"
            java.lang.Class<com.baidu.liantian.ac.U> r3 = com.baidu.liantian.ac.U.class
            java.lang.String r3 = r3.getCanonicalName()     // Catch: java.lang.Throwable -> L68
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "target_method"
            java.lang.String r3 = "handleUploadPidChange"
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L68
            r2 = 1002(0x3ea, float:1.404E-42)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = android.app.PendingIntent.getService(r5, r2, r1, r3)     // Catch: java.lang.Throwable -> L68
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L68
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 + r3
            r0.cancel(r5)     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L68
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L68
        L5b:
            r3 = 0
            r0.set(r3, r1, r5)     // Catch: java.lang.Throwable -> L60
            goto L67
        L60:
            r5 = move-exception
            r5.getMessage()     // Catch: java.lang.Throwable -> L68
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L68
        L67:
            return
        L68:
            com.baidu.liantian.b.e.a()
            return
    }

    public static void a(android.content.Context r5, int r6, boolean r7) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L89
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0     // Catch: java.lang.Throwable -> L89
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "com.baidu.action.Liantian.VIEW"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.Class<com.baidu.liantian.LiantianService> r2 = com.baidu.liantian.LiantianService.class
            r1.setClass(r5, r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L89
            r1.setPackage(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "com.baidu.category.liantian"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "android.intent.category.DEFAULT"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "from_plugin_package"
            java.lang.String r3 = r5.getPackageName()     // Catch: java.lang.Throwable -> L89
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "target_class"
            java.lang.Class<com.baidu.liantian.ac.U> r3 = com.baidu.liantian.ac.U.class
            java.lang.String r3 = r3.getCanonicalName()     // Catch: java.lang.Throwable -> L89
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "target_method"
            java.lang.String r3 = "handleWork"
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "from"
            r3 = 2
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L89
            r2 = 1001(0x3e9, float:1.403E-42)
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = android.app.PendingIntent.getService(r5, r2, r1, r4)     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L61
            r1 = 1
            if (r6 == r1) goto L5d
            if (r6 == r3) goto L59
            r1 = 600000(0x927c0, double:2.964394E-318)
            goto L63
        L59:
            r1 = 300000(0x493e0, double:1.482197E-318)
            goto L63
        L5d:
            r1 = 180000(0x2bf20, double:8.8932E-319)
            goto L63
        L61:
            r1 = 30000(0x7530, double:1.4822E-319)
        L63:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            long r3 = r3 + r1
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L89
            r0.cancel(r5)     // Catch: java.lang.Throwable -> L72
            goto L79
        L72:
            r6 = move-exception
            r6.getMessage()     // Catch: java.lang.Throwable -> L89
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L89
        L79:
            if (r7 == 0) goto L7c
            goto L88
        L7c:
            r6 = 0
            r0.set(r6, r3, r5)     // Catch: java.lang.Throwable -> L81
            goto L88
        L81:
            r5 = move-exception
            r5.getMessage()     // Catch: java.lang.Throwable -> L89
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L89
        L88:
            return
        L89:
            com.baidu.liantian.b.e.a()
            return
    }

    public static void a(android.content.Context r8, boolean r9) {
            com.baidu.liantian.e r0 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> La7
            r0.<init>(r8)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "alarm"
            java.lang.Object r1 = r8.getSystemService(r1)     // Catch: java.lang.Throwable -> La7
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1     // Catch: java.lang.Throwable -> La7
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "com.baidu.action.Liantian.VIEW"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.Class<com.baidu.liantian.LiantianService> r3 = com.baidu.liantian.LiantianService.class
            r2.setClass(r8, r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r8.getPackageName()     // Catch: java.lang.Throwable -> La7
            r2.setPackage(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "com.baidu.category.liantian"
            r2.addCategory(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "android.intent.category.DEFAULT"
            r2.addCategory(r3)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "from_plugin_package"
            java.lang.String r4 = r8.getPackageName()     // Catch: java.lang.Throwable -> La7
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "target_class"
            java.lang.Class<com.baidu.liantian.ac.U> r4 = com.baidu.liantian.ac.U.class
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> La7
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "target_method"
            java.lang.String r4 = "handleWork"
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "from"
            r4 = 6
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> La7
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r8 = android.app.PendingIntent.getService(r8, r3, r2, r4)     // Catch: java.lang.Throwable -> La7
            if (r9 == 0) goto L70
            android.content.SharedPreferences r9 = r0.a     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "npuct"
            r3 = 0
            long r5 = r9.getLong(r2, r3)     // Catch: java.lang.Throwable -> La7
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 > 0) goto L89
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r4
            r0.a(r2)     // Catch: java.lang.Throwable -> La7
        L6e:
            r5 = r2
            goto L89
        L70:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7
            r4 = 85800000(0x51d3440, double:4.23908324E-316)
            long r2 = r2 + r4
            double r4 = java.lang.Math.random()     // Catch: java.lang.Throwable -> La7
            r6 = 4697904772475256832(0x41324f8000000000, double:1200000.0)
            double r4 = r4 * r6
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La7
            long r2 = r2 + r4
            r0.a(r2)     // Catch: java.lang.Throwable -> La7
            goto L6e
        L89:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> La7
            r1.cancel(r8)     // Catch: java.lang.Throwable -> L93
            goto L9a
        L93:
            r9 = move-exception
            r9.getMessage()     // Catch: java.lang.Throwable -> La7
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> La7
        L9a:
            r9 = 0
            r1.set(r9, r5, r8)     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r8 = move-exception
            r8.getMessage()     // Catch: java.lang.Throwable -> La7
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> La7
        La6:
            return
        La7:
            com.baidu.liantian.b.e.a()
            return
    }
}
