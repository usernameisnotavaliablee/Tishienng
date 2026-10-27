package com.bytedance.msdk.ae.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static volatile com.bytedance.msdk.ae.j.j j;
    private int ae;
    private int cw;
    private int g;

    /* renamed from: m, reason: collision with root package name */
    private int f2143m;

    /* renamed from: r, reason: collision with root package name */
    private long f2144r;
    private int tl;
    private int up;
    private com.bytedance.msdk.tl.l xt;

    private j() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.cw = r0
            r1 = -1
            r3.f2144r = r1
            r3.up = r0
            r3.f2143m = r0
            r3.ae = r0
            r3.tl = r0
            r3.g = r0
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.xt()
            r3.xt = r0
            return
    }

    public static com.bytedance.msdk.ae.j.j j() {
            com.bytedance.msdk.ae.j.j r0 = com.bytedance.msdk.ae.j.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.ae.j.j> r0 = com.bytedance.msdk.ae.j.j.class
            monitor-enter(r0)
            com.bytedance.msdk.ae.j.j r1 = com.bytedance.msdk.ae.j.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.ae.j.j r1 = new com.bytedance.msdk.ae.j.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.ae.j.j.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.ae.j.j r0 = com.bytedance.msdk.ae.j.j.j
            return r0
    }

    private synchronized org.json.JSONObject oq() {
            r3 = this;
            monitor-enter(r3)
            com.bytedance.msdk.tl.l r0 = r3.xt     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "app_common_config"
            java.lang.String r0 = r0.xt(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r1 == 0) goto L12
            monitor-exit(r3)
            return r2
        L12:
            java.lang.String r1 = "["
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            java.lang.String r1 = "{"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            java.lang.String r1 = com.bytedance.msdk.tl.xt.j()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = com.bytedance.msdk.tl.j.xt(r0, r1)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L40
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L3e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)
            return r1
        L3a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L2b
        L3e:
            monitor-exit(r3)
            return r2
        L40:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    private synchronized void xt(org.json.JSONObject r8) {
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "event_batch_size"
            r1 = 100
            int r0 = r8.optInt(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r7.cw = r0     // Catch: java.lang.Throwable -> L3e
            if (r0 <= 0) goto L11
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r2) goto L13
        L11:
            r7.cw = r1     // Catch: java.lang.Throwable -> L3e
        L13:
            java.lang.String r0 = "event_routine_interval"
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r8.optLong(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r7.f2144r = r3     // Catch: java.lang.Throwable -> L3e
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L2b
            r5 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2d
        L2b:
            r7.f2144r = r1     // Catch: java.lang.Throwable -> L3e
        L2d:
            java.lang.String r0 = "dynamic_adapter_type"
            r1 = 0
            int r0 = r8.optInt(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r7.up = r0     // Catch: java.lang.Throwable -> L3e
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 == r2) goto L40
            r7.up = r1     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L7a
        L40:
            java.lang.String r0 = "rv_start_time"
            r3 = 5000(0x1388, float:7.006E-42)
            int r0 = r8.optInt(r0, r3)     // Catch: java.lang.Throwable -> L3e
            r7.ae = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "wf_dynamic_adapter_type"
            int r0 = r8.optInt(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r7.f2143m = r0     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L58
            if (r0 == r2) goto L58
            r7.f2143m = r1     // Catch: java.lang.Throwable -> L3e
        L58:
            java.lang.String r0 = "pre_fetch_count"
            r1 = 20
            int r0 = r8.optInt(r0, r1)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.msdk.core.up.xt.r r1 = com.bytedance.msdk.core.up.xt.r.j()     // Catch: java.lang.Throwable -> L3e
            r1.j(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "adapter_plugin_loader_gdt"
            r1 = -1
            int r0 = r8.optInt(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r7.tl = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "can_log"
            int r8 = r8.optInt(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r7.g = r8     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r7)
            return
        L7a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8
    }

    public synchronized boolean ae() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.tl     // Catch: java.lang.Throwable -> L1c
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L20
            com.bytedance.msdk.tl.l r0 = r4.xt     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            org.json.JSONObject r0 = r4.oq()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            r4.xt(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.tl     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)
            if (r0 != r3) goto L1b
            return r3
        L1b:
            return r2
        L1c:
            r0 = move-exception
            goto L25
        L1e:
            monitor-exit(r4)
            return r2
        L20:
            monitor-exit(r4)
            if (r0 != r3) goto L24
            return r3
        L24:
            return r2
        L25:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    public synchronized long cw() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f2144r     // Catch: java.lang.Throwable -> L1a
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L21
            com.bytedance.msdk.tl.l r0 = r5.xt     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            org.json.JSONObject r0 = r5.oq()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            r5.xt(r0)     // Catch: java.lang.Throwable -> L1a
            long r0 = r5.f2144r     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)
            return r0
        L1a:
            r0 = move-exception
            goto L23
        L1c:
            monitor-exit(r5)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            return r0
        L21:
            monitor-exit(r5)
            return r0
        L23:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public boolean g() {
            r4 = this;
            int r0 = r4.g
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1a
            com.bytedance.msdk.tl.l r0 = r4.xt
            if (r0 == 0) goto L19
            org.json.JSONObject r0 = r4.oq()
            if (r0 == 0) goto L19
            r4.xt(r0)
            int r0 = r4.g
            if (r0 != r3) goto L19
            return r3
        L19:
            return r2
        L1a:
            if (r0 != r3) goto L1d
            return r3
        L1d:
            return r2
    }

    public synchronized void j(org.json.JSONObject r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1b
            r2.xt(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1b
            com.bytedance.msdk.tl.l r0 = r2.xt     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "app_common_config"
            r0.j(r1, r3)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
        L1b:
            monitor-exit(r2)
            return
    }

    public int m() {
            r2 = this;
            int r0 = r2.ae
            r1 = -1
            if (r0 != r1) goto L17
            com.bytedance.msdk.tl.l r0 = r2.xt
            if (r0 == 0) goto L15
            org.json.JSONObject r0 = r2.oq()
            if (r0 == 0) goto L15
            r2.xt(r0)
            int r0 = r2.ae
            return r0
        L15:
            r0 = 5000(0x1388, float:7.006E-42)
        L17:
            return r0
    }

    public int r() {
            r2 = this;
            int r0 = r2.up
            r1 = -1
            if (r0 != r1) goto L16
            com.bytedance.msdk.tl.l r0 = r2.xt
            if (r0 == 0) goto L15
            org.json.JSONObject r0 = r2.oq()
            if (r0 == 0) goto L15
            r2.xt(r0)
            int r0 = r2.up
            return r0
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int tl() {
            r1 = this;
            int r0 = r1.tl
            return r0
    }

    public int up() {
            r2 = this;
            int r0 = r2.f2143m
            r1 = -1
            if (r0 != r1) goto L16
            com.bytedance.msdk.tl.l r0 = r2.xt
            if (r0 == 0) goto L15
            org.json.JSONObject r0 = r2.oq()
            if (r0 == 0) goto L15
            r2.xt(r0)
            int r0 = r2.f2143m
            return r0
        L15:
            r0 = 0
        L16:
            return r0
    }

    public synchronized int xt() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.cw     // Catch: java.lang.Throwable -> L17
            r1 = -1
            if (r0 != r1) goto L1d
            com.bytedance.msdk.tl.l r0 = r2.xt     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            org.json.JSONObject r0 = r2.oq()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            r2.xt(r0)     // Catch: java.lang.Throwable -> L17
            int r0 = r2.cw     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            goto L1f
        L19:
            monitor-exit(r2)
            r0 = 100
            return r0
        L1d:
            monitor-exit(r2)
            return r0
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
