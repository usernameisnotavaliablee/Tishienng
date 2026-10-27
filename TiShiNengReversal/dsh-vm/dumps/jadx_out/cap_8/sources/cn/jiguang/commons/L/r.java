package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.util.concurrent.ConcurrentHashMap r5, int r6, double r7) {
            java.lang.String r0 = "MAPUTILS"
            int r1 = r5.size()
            r2 = 0
            if (r1 > r6) goto La
            return r2
        La:
            int r6 = r5.size()     // Catch: java.lang.Exception -> L30
            double r3 = (double) r6     // Catch: java.lang.Exception -> L30
            double r3 = r3 * r7
            int r6 = (int) r3     // Catch: java.lang.Exception -> L30
            java.util.Set r7 = r5.keySet()     // Catch: java.lang.Exception -> L30
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L30
            r8 = 0
        L1b:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L32
            if (r8 >= r6) goto L32
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L30
            java.lang.Object r1 = r5.remove(r1)     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L1b
            int r8 = r8 + 1
            goto L1b
        L30:
            r5 = move-exception
            goto L53
        L32:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r6.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "cleanup "
            r6.append(r7)     // Catch: java.lang.Exception -> L30
            r6.append(r8)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch: java.lang.Exception -> L30
            int r5 = r5.size()     // Catch: java.lang.Exception -> L30
            r6.append(r5)     // Catch: java.lang.Exception -> L30
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Exception -> L30
            return r8
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "cleanup err:"
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return r2
    }

    public static java.lang.Object a(java.util.Map r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            return r2
    }

    public static java.lang.Object a(java.util.concurrent.ConcurrentHashMap r1, java.lang.Object r2, java.util.concurrent.Callable r3) {
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            monitor-enter(r1)
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r2 = move-exception
            goto L20
        L12:
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L1d
            if (r3 == 0) goto L1b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L1d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r3
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            return r1
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
