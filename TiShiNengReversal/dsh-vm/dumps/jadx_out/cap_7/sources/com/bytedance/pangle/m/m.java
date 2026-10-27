package com.bytedance.pangle.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m {



    interface j {
        boolean j(java.lang.String r1, int r2);
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.pangle.m.m.j cw() {
            boolean r0 = com.bytedance.pangle.util.g.g()
            if (r0 == 0) goto Lc
            com.bytedance.pangle.m.up r0 = new com.bytedance.pangle.m.up
            r0.<init>()
            return r0
        Lc:
            boolean r0 = com.bytedance.pangle.util.g.ae()
            if (r0 == 0) goto L18
            com.bytedance.pangle.m.r r0 = new com.bytedance.pangle.m.r
            r0.<init>()
            return r0
        L18:
            boolean r0 = com.bytedance.pangle.util.g.cw()
            if (r0 == 0) goto L24
            com.bytedance.pangle.m.cw r0 = new com.bytedance.pangle.m.cw
            r0.<init>()
            return r0
        L24:
            com.bytedance.pangle.m.m$2 r0 = new com.bytedance.pangle.m.m$2
            r0.<init>()
            return r0
    }

    public static void j() {
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "start"
            java.lang.String r2 = "zeus_stage_dex_opt"
            r0.saveRecord(r2, r1)
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            boolean r0 = r0.isCloseBgDex2oat()
            if (r0 != 0) goto L4b
            boolean r0 = com.bytedance.pangle.util.g.ae()
            if (r0 != 0) goto L2b
            boolean r0 = com.bytedance.pangle.util.g.g()
            if (r0 != 0) goto L2b
            boolean r0 = com.bytedance.pangle.util.g.cw()
            if (r0 == 0) goto L4b
        L2b:
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "post"
            r0.saveRecord(r2, r1)
            com.bytedance.pangle.m.m$1 r0 = new com.bytedance.pangle.m.m$1
            r0.<init>()
            com.bytedance.pangle.up.up.xt(r0)
        L4b:
            return
    }

    public static synchronized void xt() {
            java.lang.Class<com.bytedance.pangle.m.m> r0 = com.bytedance.pangle.m.m.class
            monitor-enter(r0)
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Lc1
            android.content.SharedPreferences r1 = com.bytedance.pangle.m.xt.j(r1)     // Catch: java.lang.Throwable -> Lc1
            java.util.Map r1 = r1.getAll()     // Catch: java.lang.Throwable -> Lc1
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lc1
            if (r2 <= 0) goto Lde
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc1
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto Lde
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "fullDex2oat start:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r5 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc1
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.m.m$j r3 = cw()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r5 = r2.getValue()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Lc1
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Lc1
            boolean r3 = r3.j(r4, r5)     // Catch: java.lang.Throwable -> Lc1
            if (r3 == 0) goto Lc3
            android.app.Application r3 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Lc1
            android.content.SharedPreferences r3 = com.bytedance.pangle.m.xt.j(r3)     // Catch: java.lang.Throwable -> Lc1
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc1
            android.content.SharedPreferences$Editor r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> Lc1
            r3.apply()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "fullDex2oat success:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r5 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc1
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.util.jy r3 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r5 = r2.getValue()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Lc1
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Lc1
            r6 = 1
            r3.cw(r4, r5, r6)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "fullDex2oat markDexOptState:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc1
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.log.ZeusLogger.i(r3, r2)     // Catch: java.lang.Throwable -> Lc1
            goto L1d
        Lc1:
            r1 = move-exception
            goto Le0
        Lc3:
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "fullDex2oat failed:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc1
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lc1
            com.bytedance.pangle.log.ZeusLogger.i(r3, r2)     // Catch: java.lang.Throwable -> Lc1
            goto L1d
        Lde:
            monitor-exit(r0)
            return
        Le0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r1
    }
}
