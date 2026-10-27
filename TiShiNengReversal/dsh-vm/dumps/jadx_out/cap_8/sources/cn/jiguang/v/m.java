package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    private static volatile java.lang.Boolean a;

    private static class a {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f1538b;

        private a(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public static cn.jiguang.v.m.a a(int r1, long r2, long r4) {
                cn.jiguang.v.m$a r0 = new cn.jiguang.v.m$a
                r0.<init>(r1)
                r0.a(r2, r4)
                return r0
        }

        private org.json.JSONObject a() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "mode"
                int r2 = r3.a     // Catch: java.lang.Throwable -> L13
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L13
                java.lang.String r1 = "state"
                int r2 = r3.f1538b     // Catch: java.lang.Throwable -> L13
                r0.put(r1, r2)     // Catch: java.lang.Throwable -> L13
            L13:
                return r0
        }

        static /* synthetic */ org.json.JSONObject a(cn.jiguang.v.m.a r0) {
                org.json.JSONObject r0 = r0.a()
                return r0
        }

        private void a(long r2, long r4) {
                r1 = this;
                long r2 = r2 - r4
                long r2 = java.lang.Math.abs(r2)
                r4 = 300(0x12c, double:1.48E-321)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto Lf
                r2 = 1
            Lc:
                r1.f1538b = r2
                return
            Lf:
                r2 = 0
                goto Lc
        }
    }

    static {
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r6) {
            long r2 = cn.jiguang.api.JCoreManager.getStartId(r6)
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1 = 1
            r0 = r6
            a(r0, r1, r2, r4)
            return
    }

    public static void a(android.content.Context r1, int r2, long r3, long r5) {
            cn.jiguang.v.m$a r2 = cn.jiguang.v.m.a.a(r2, r3, r5)
            long r3 = cn.jiguang.d.a.f(r1)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L21
            java.lang.String r3 = ""
            a(r1, r3)
            org.json.JSONObject r2 = cn.jiguang.v.m.a.a(r2)
            java.lang.String r3 = "wake_launch"
            cn.jiguang.z.b.b(r1, r2, r3)
            b(r1)
            return
        L21:
            org.json.JSONObject r2 = cn.jiguang.v.m.a.a(r2)
            a(r1, r2)
            return
    }

    private static void a(android.content.Context r5, java.lang.String r6) {
            long r0 = cn.jiguang.d.a.f(r5)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L12
            java.lang.String r5 = "WakeLaunchHelper"
            java.lang.String r6 = "triggerSceneCheck aborted: invalid UID"
            cn.jiguang.w.f.c(r5, r6)
            return
        L12:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "scence"
            r2 = 5
            r0.putInt(r1, r2)
            java.lang.String r1 = "notification_state"
            cn.jiguang.c.b.a(r5, r6, r1, r0)
            return
    }

    private static void a(android.content.Context r3, org.json.JSONObject r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "wake_launch"
            org.json.JSONObject r3 = cn.jiguang.d.a.a(r3, r4, r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "wake_launch_cache.json"
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "wake_launch_cache.json"
            org.json.JSONObject r0 = cn.jiguang.av.i.a(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L5a
        L1f:
            java.lang.String r1 = "content"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L2c
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
        L2c:
            r1.put(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "content"
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "wake_launch_cache.json"
            cn.jiguang.av.i.a(r3, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.v.m.a = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "WakeLaunchHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "save wake launch data : "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.w.f.c(r3, r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            return
        L5a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            r3 = move-exception
            java.lang.String r4 = "WakeLaunchHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveCachedData failed:"
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.b(r4, r0, r3)
            return
    }

    private static boolean a() {
            java.lang.Boolean r0 = cn.jiguang.v.m.a
            if (r0 == 0) goto Lb
            java.lang.Boolean r0 = cn.jiguang.v.m.a
            boolean r0 = r0.booleanValue()
            return r0
        Lb:
            java.lang.String r0 = "wake_launch_cache.json"
            monitor-enter(r0)
            java.lang.Boolean r1 = cn.jiguang.v.m.a     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.Boolean r1 = cn.jiguang.v.m.a     // Catch: java.lang.Throwable -> L1b
        L15:
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            goto L43
        L1d:
            java.lang.String r1 = "wake_launch_cache.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L3c
            java.lang.String r2 = "content"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L36
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1b
            if (r1 <= 0) goto L36
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L3e
        L3c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1b
        L3e:
            cn.jiguang.v.m.a = r1     // Catch: java.lang.Throwable -> L1b
            java.lang.Boolean r1 = cn.jiguang.v.m.a     // Catch: java.lang.Throwable -> L1b
            goto L15
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    public static void b(android.content.Context r7) {
            boolean r0 = a()
            java.lang.String r1 = "no cached data to report"
            java.lang.String r2 = "WakeLaunchHelper"
            if (r0 != 0) goto Le
            cn.jiguang.w.f.c(r2, r1)
            return
        Le:
            long r3 = cn.jiguang.d.a.f(r7)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L1e
            java.lang.String r7 = "UID not available, skip report cached data"
            cn.jiguang.w.f.c(r2, r7)
            return
        L1e:
            org.json.JSONArray r0 = c(r7)
            if (r0 == 0) goto L64
            int r3 = r0.length()
            if (r3 != 0) goto L2b
            goto L64
        L2b:
            cn.jiguang.z.b.a(r7, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "report cached wake launch data, count: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L4a
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.lang.Throwable -> L4a
            d(r7)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reportCachedData failed:"
            r0.append(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.b(r2, r0, r7)
            return
        L64:
            cn.jiguang.w.f.c(r2, r1)
            return
    }

    private static org.json.JSONArray c(android.content.Context r4) {
            boolean r4 = a()
            r0 = 0
            if (r4 != 0) goto Lf
            java.lang.String r4 = "WakeLaunchHelper"
            java.lang.String r1 = "no cached wake launch data"
            cn.jiguang.w.f.c(r4, r1)
            return r0
        Lf:
            java.lang.String r4 = "wake_launch_cache.json"
            monitor-enter(r4)
            java.lang.String r1 = "wake_launch_cache.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L2b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L29
            cn.jiguang.v.m.a = r1     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "WakeLaunchHelper"
            java.lang.String r2 = "no cached wake launch data"
        L24:
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            return r0
        L29:
            r0 = move-exception
            goto L5f
        L2b:
            java.lang.String r2 = "content"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L56
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L3a
            goto L56
        L3a:
            java.lang.String r0 = "WakeLaunchHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "get cached wake launch data, count: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L29
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            return r1
        L56:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L29
            cn.jiguang.v.m.a = r1     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "WakeLaunchHelper"
            java.lang.String r2 = "no cached wake launch data"
            goto L24
        L5f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    private static void d(android.content.Context r2) {
            java.lang.String r2 = "wake_launch_cache.json"
            monitor-enter(r2)
            java.lang.String r0 = "wake_launch_cache.json"
            cn.jiguang.av.i.d(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L17
            cn.jiguang.v.m.a = r0     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "WakeLaunchHelper"
            java.lang.String r1 = "clean cached wake launch data"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
