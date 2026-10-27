package com.bytedance.pangle.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public static java.lang.String ae = "7z_unzip_finish";
    public static java.lang.String cw = "download_finish";
    public static java.lang.String g = "load_finish";
    public static java.lang.String j = "request_finish";
    public static java.lang.String m = "7z_unzip_start";
    public static java.lang.String oq = "rm_entry_finish";
    private static volatile com.bytedance.pangle.r.xt qv = null;
    public static java.lang.String r = "install_start";
    public static java.lang.String tl = "load_start";
    public static java.lang.String up = "install_finish";
    public static java.lang.String xt = "download_start";
    private final java.util.List<com.bytedance.pangle.r.j> vl;

    public static class j {
        public static int a = 32007;
        public static int ae = 12002;
        public static int av = 22002;
        public static int az = 22001;
        public static int ch = 32005;
        public static int cw = -1;
        public static int f = 32002;
        public static int g = 12004;
        public static int gq = 42000;
        public static int h = 40000;
        public static int i = 22999;
        public static int j = 1;
        public static int jy = 21002;
        public static int kt = 32000;
        public static int l = 32008;
        public static int la = 41000;
        public static int m = 12001;
        public static int mi = 31000;
        public static int oq = 20000;
        public static int p = 32999;
        public static int qv = 21000;
        public static int r = -2;
        public static int rn = 50000;
        public static int s = 32006;
        public static int tj = 32001;
        public static int tl = 12003;
        public static int up = 12000;
        public static int v = 32003;
        public static int vl = 21001;
        public static int w = 30000;
        public static int wq = 50004;
        public static int ws = 22000;
        public static int x = 32004;
        public static int xt = 2;

        static {
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    private xt() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.vl = r0
            return
    }

    public static com.bytedance.pangle.r.xt j() {
            com.bytedance.pangle.r.xt r0 = com.bytedance.pangle.r.xt.qv
            if (r0 != 0) goto L13
            java.lang.Class<com.bytedance.pangle.r.xt> r0 = com.bytedance.pangle.r.xt.class
            monitor-enter(r0)
            com.bytedance.pangle.r.xt r1 = new com.bytedance.pangle.r.xt     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            com.bytedance.pangle.r.xt.qv = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
        L13:
            com.bytedance.pangle.r.xt r0 = com.bytedance.pangle.r.xt.qv
            return r0
    }

    public void j(@androidx.annotation.NonNull com.bytedance.pangle.r.j r3) {
            r2 = this;
            java.util.List<com.bytedance.pangle.r.j> r0 = r2.vl
            monitor-enter(r0)
            java.util.List<com.bytedance.pangle.r.j> r1 = r2.vl     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public void j(java.lang.String r4, org.json.JSONObject r5, org.json.JSONObject r6, org.json.JSONObject r7) {
            r3 = this;
            java.util.List<com.bytedance.pangle.r.j> r0 = r3.vl
            monitor-enter(r0)
            java.util.List<com.bytedance.pangle.r.j> r1 = r3.vl     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1e
            com.bytedance.pangle.r.j r2 = (com.bytedance.pangle.r.j) r2     // Catch: java.lang.Throwable -> L1e
            r2.j(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19
            goto L9
        L19:
            r2 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r2)     // Catch: java.lang.Throwable -> L1e
            goto L9
        L1e:
            r4 = move-exception
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }
}
