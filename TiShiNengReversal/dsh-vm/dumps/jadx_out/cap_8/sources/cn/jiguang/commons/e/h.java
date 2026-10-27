package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends cn.jiguang.commons.a.c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.E.h a = null;

        static {
                cn.jiguang.commons.E.h r0 = new cn.jiguang.commons.E.h
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.E.h.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.h a() {
                cn.jiguang.commons.E.h r0 = cn.jiguang.commons.E.h.b.a
                return r0
        }
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ h(cn.jiguang.commons.E.h.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.commons.E.h c() {
            cn.jiguang.commons.E.h r0 = cn.jiguang.commons.E.h.b.a()
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppPermission"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r7) {
            r6 = this;
            java.lang.String r0 = "JAppPermission"
            r1 = 1100(0x44c, float:1.541E-42)
            r2 = 1
            java.util.List r7 = cn.jiguang.commons.L.c.a(r1, r7, r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r2 = "installed app list size:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r2 = 0
            if (r7 != 0) goto L18
            r3 = 0
            goto L1c
        L18:
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
        L1c:
            r1.append(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r7 == 0) goto Lbb
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r1 == 0) goto L30
            goto Lbb
        L30:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
        L39:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r3 == 0) goto L55
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            cn.jiguang.commons.c.e r3 = (cn.jiguang.commons.c.e) r3     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r4 = 128(0x80, float:1.8E-43)
            org.json.JSONObject r3 = r3.c(r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r3 == 0) goto L39
            r1.put(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            goto L39
        L51:
            r7 = move-exception
            goto Lc1
        L53:
            r7 = move-exception
            goto Lc2
        L55:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r7.<init>()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r3 = "data size:"
            r7.append(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r7.append(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r7 != 0) goto L76
            java.lang.String r7 = "app permission data empty"
            goto Lbd
        L76:
            java.util.ArrayList r7 = cn.jiguang.commons.L.ad.a(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r7 == 0) goto Lb8
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r1 == 0) goto L83
            goto Lb8
        L83:
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
        L87:
            if (r2 >= r1) goto Laf
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.Object r4 = r7.get(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r5 = "slice_index"
            int r2 = r2 + 1
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r5 = "slice_count"
            r3.put(r5, r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r5 = "pers_data"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            cn.jiguang.commons.g.p r4 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r5 = "android_permissions"
            r4.a(r3, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            goto L87
        Laf:
            super.d(r0)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r7 = "report app permission data ok"
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            return
        Lb8:
            java.lang.String r7 = "partition app permission data failed"
            goto Lbd
        Lbb:
            java.lang.String r7 = "installed app list empty"
        Lbd:
            cn.jiguang.commons.w.a.f(r0, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            return
        Lc1:
            throw r7
        Lc2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pers err:"
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
            return
    }
}
