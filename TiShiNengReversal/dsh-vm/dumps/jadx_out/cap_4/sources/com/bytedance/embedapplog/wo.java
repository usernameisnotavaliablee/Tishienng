package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class wo {
    private static com.bytedance.embedapplog.wf<com.bytedance.embedapplog.wi> j;


    static {
            com.bytedance.embedapplog.wo$1 r0 = new com.bytedance.embedapplog.wo$1
            r0.<init>()
            com.bytedance.embedapplog.wo.j = r0
            return
    }

    public wo() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.WorkerThread
    public static java.lang.String j(android.content.SharedPreferences r0) {
            android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = com.bytedance.embedapplog.ik.j(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.AnyThread
    public static java.lang.String j(@androidx.annotation.Nullable org.json.JSONObject r2) {
            r0 = 0
            if (r2 == 0) goto La
            java.lang.String r1 = "id"
            java.lang.String r2 = r2.optString(r1, r0)
            return r2
        La:
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    public static java.util.Map<java.lang.String, java.lang.String> j(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.content.SharedPreferences r3) {
            android.os.SystemClock.elapsedRealtime()
            com.bytedance.embedapplog.wf<com.bytedance.embedapplog.wi> r3 = com.bytedance.embedapplog.wo.j
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.Object r2 = r3.xt(r0)
            com.bytedance.embedapplog.wi r2 = (com.bytedance.embedapplog.wi) r2
            com.bytedance.embedapplog.tk r3 = r2.j()
            boolean r3 = r3 instanceof com.bytedance.embedapplog.qe
            if (r3 == 0) goto L1c
            r3 = 200(0xc8, float:2.8E-43)
            goto L1e
        L1c:
            r3 = 100
        L1e:
            long r0 = (long) r3
            java.util.Map r2 = r2.j(r0)
            return r2
    }

    @androidx.annotation.AnyThread
    public static void j(@androidx.annotation.NonNull android.content.Context r3) {
            com.bytedance.embedapplog.wf<com.bytedance.embedapplog.wi> r0 = com.bytedance.embedapplog.wo.j
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.Object r3 = r0.xt(r1)
            com.bytedance.embedapplog.wi r3 = (com.bytedance.embedapplog.wi) r3
            r3.xt()
            return
    }

    @androidx.annotation.AnyThread
    public static void j(@androidx.annotation.Nullable com.bytedance.embedapplog.up r0) {
            com.bytedance.embedapplog.wi.j(r0)
            return
    }
}
