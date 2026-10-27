package com.bykv.vk.component.ttvideo.log;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f1664l;

    /* renamed from: m, reason: collision with root package name */
    public int f1665m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f1666n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f1667o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f1668p;

    public f() {
            r2 = this;
            r2.<init>()
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2.a = r0
            r2.b = r0
            r2.c = r0
            r2.d = r0
            r2.e = r0
            r2.f = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.g = r0
            r2.h = r0
            r2.i = r0
            r2.j = r0
            java.lang.String r1 = ""
            r2.k = r1
            r2.f1664l = r1
            r2.f1665m = r0
            r2.f1666n = r1
            r2.f1667o = r1
            r2.f1668p = r1
            return
    }

    public static void a(java.util.Map r1, java.lang.String r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto Lb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r3)
        Lb:
            return
    }

    public static void a(java.util.Map r3, java.lang.String r4, long r5) {
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto Le
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.put(r4, r5)
        Le:
            return
    }

    public static void a(java.util.Map r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L9
            r1.put(r2, r3)
        L9:
            return
    }

    public org.json.JSONObject a(com.bykv.vk.component.ttvideo.log.c r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r4.f1666n
            java.lang.String r2 = "player_sessionid"
            a(r0, r2, r1)
            java.lang.String r1 = "log_type"
            java.lang.String r2 = "video_playq"
            a(r0, r1, r2)
            java.lang.String r1 = r5.e
            java.lang.String r2 = "sdk_version"
            a(r0, r2, r1)
            java.lang.String r1 = r5.d
            java.lang.String r2 = "sv"
            a(r0, r2, r1)
            java.lang.String r1 = r5.c
            java.lang.String r2 = "pc"
            a(r0, r2, r1)
            long r1 = r4.c
            java.lang.String r3 = "pt"
            a(r0, r3, r1)
            long r1 = r4.d
            java.lang.String r3 = "vt"
            a(r0, r3, r1)
            long r1 = r4.e
            java.lang.String r3 = "et"
            a(r0, r3, r1)
            long r1 = r4.f
            java.lang.String r3 = "lt"
            a(r0, r3, r1)
            int r1 = r4.g
            java.lang.String r2 = "bc"
            a(r0, r2, r1)
            int r1 = r4.h
            java.lang.String r2 = "br"
            a(r0, r2, r1)
            int r5 = r5.h
            java.lang.String r1 = "vd"
            a(r0, r1, r5)
            java.lang.String r5 = r4.k
            java.lang.String r1 = "initial_url"
            a(r0, r1, r5)
            java.lang.String r5 = r4.f1664l
            java.lang.String r1 = "init_audio_url"
            a(r0, r1, r5)
            int r5 = r4.f1665m
            java.lang.String r1 = "watch_dur"
            a(r0, r1, r5)
            int r5 = r4.i
            java.lang.String r1 = "errt"
            a(r0, r1, r5)
            int r5 = r4.j
            java.lang.String r1 = "errc"
            a(r0, r1, r5)
            long r1 = r4.a
            java.lang.String r5 = "ps_t"
            a(r0, r5, r1)
            long r1 = r4.b
            java.lang.String r5 = "pt_new"
            a(r0, r5, r1)
            java.lang.String r5 = r4.f1667o
            java.lang.String r1 = "play_log_id"
            a(r0, r1, r5)
            java.lang.String r5 = r4.f1668p
            java.lang.String r1 = "last_sessionid"
            a(r0, r1, r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r0)
            return r5
    }
}
