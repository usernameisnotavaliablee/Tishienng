package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    public java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1058c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1060e;

    /* renamed from: f, reason: collision with root package name */
    public int f1061f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f1062g;

    /* renamed from: h, reason: collision with root package name */
    public long f1063h;

    /* renamed from: i, reason: collision with root package name */
    public long f1064i;

    /* renamed from: j, reason: collision with root package name */
    public long f1065j;

    /* renamed from: k, reason: collision with root package name */
    public long f1066k;
    public int l;
    public java.lang.String m;
    public java.lang.String n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public int v;

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.CharSequence a(java.lang.CharSequence r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            r0 = 0
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
        Ld:
            return r1
    }

    public org.json.JSONObject a(int r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb3
            r0.<init>()     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "uid"
            java.lang.String r2 = r3.a     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "pid"
            java.lang.String r2 = r3.f1058c     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "ppid"
            java.lang.String r2 = r3.f1059d     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "proc_name"
            java.lang.String r2 = r3.f1060e     // Catch: org.json.JSONException -> Lb3
            java.lang.CharSequence r4 = a(r2, r4)     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r0.put(r1, r4)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "foreground"
            int r1 = r3.f1061f     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "state"
            java.lang.String r1 = r3.f1062g     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "start_time"
            long r1 = r3.f1063h     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "priority"
            long r1 = r3.f1064i     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "num_threads"
            long r1 = r3.f1065j     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "size"
            long r1 = r3.f1066k     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "tpgid"
            int r1 = r3.l     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "cpuacct"
            java.lang.String r1 = r3.m     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "cpu"
            java.lang.String r1 = r3.n     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "utime"
            long r1 = r3.o     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "stime"
            long r1 = r3.p     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "cutime"
            long r1 = r3.q     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "cstime"
            long r1 = r3.r     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "rt_priority"
            long r1 = r3.s     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "oom_score"
            int r1 = r3.t     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "oom_adj"
            int r1 = r3.u     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "oom_score_adj"
            int r1 = r3.v     // Catch: org.json.JSONException -> Lb3
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            return r4
        Lb3:
            r4 = 0
            return r4
    }
}
